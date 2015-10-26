package com.google.android.apps.chromecast.app.tutorial;

import a;
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewAnimationUtils;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import apd;
import ape;
import aph;
import bjw;
import bkb;
import blp;
import blx;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;
import czt;
import dan;
import dev;
import dew;
import f;
import gn;
import hx;
import m;

public class TutorialActivity
  extends m
  implements View.OnClickListener, hx
{
  public bkb e;
  public ViewPager f;
  public Button g;
  public Button h;
  private final blp i = new blp("TutorialActivity");
  private PagingIndicator j;
  private ImageButton k;
  private int l;
  private Animator m;
  private int n;
  private int o;
  private aph p;
  
  public static Intent a(Context paramContext, dan paramdan)
  {
    paramContext = new Intent(paramContext, TutorialActivity.class);
    paramContext.putExtra("tutorials", dan.a(paramdan));
    return paramContext;
  }
  
  private void a(View paramView, boolean paramBoolean)
  {
    float f1 = 0.0F;
    if (paramBoolean)
    {
      paramView.setVisibility(0);
      paramView.setAlpha(0.0F);
    }
    paramView = paramView.animate();
    if (paramBoolean) {
      f1 = 1.0F;
    }
    paramView.alpha(f1).setDuration(this.l);
  }
  
  private void d(int paramInt)
  {
    ape localape = ape.a();
    apd localapd = new apd(paramInt).a(this.o).a(this.f.b);
    localapd.h = this.p;
    localape.a(localapd);
  }
  
  public void a(int paramInt)
  {
    if (paramInt == this.e.b.length - 1) {
      b(true);
    }
    for (;;)
    {
      return;
      if ((this.g.getVisibility() == 0) && (paramInt == this.e.b.length - 2)) {
        b(false);
      }
    }
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2) {}
  
  protected void b()
  {
    c(152);
    finish();
  }
  
  public final void b(int paramInt) {}
  
  protected final void b(boolean paramBoolean)
  {
    boolean bool2 = true;
    int i1;
    int i2;
    Object localObject;
    if (Build.VERSION.SDK_INT >= 21)
    {
      if (this.m != null) {
        this.m.cancel();
      }
      int i3 = this.g.getWidth() / 2;
      int i4 = this.g.getHeight() / 2;
      if (paramBoolean)
      {
        i1 = this.g.getWidth();
        this.g.setVisibility(0);
        this.k.setVisibility(4);
        i2 = 0;
        localObject = ViewAnimationUtils.createCircularReveal(this.g, i3, i4, i2, i1);
        this.m = ((Animator)localObject);
        ((Animator)localObject).addListener(new bjw(this, paramBoolean));
        ((Animator)localObject).start();
        if (this.h != null)
        {
          localObject = this.h;
          if (paramBoolean) {
            break label210;
          }
        }
      }
    }
    label210:
    for (paramBoolean = bool2;; paramBoolean = false)
    {
      a((View)localObject, paramBoolean);
      return;
      i2 = this.g.getWidth();
      i1 = this.k.getWidth() / 2;
      this.k.setVisibility(0);
      break;
      a(this.g, paramBoolean);
      localObject = this.k;
      if (!paramBoolean) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        a((View)localObject, bool1);
        break;
      }
    }
  }
  
  protected final void c(int paramInt)
  {
    ape localape = ape.a();
    apd localapd = new apd(paramInt).a(this.o);
    localapd.h = this.p;
    localape.a(localapd);
  }
  
  public void onBackPressed()
  {
    if (this.f.b != 0)
    {
      d(150);
      this.f.a(this.f.b - 1, true);
    }
    for (;;)
    {
      return;
      super.onBackPressed();
    }
  }
  
  public void onClick(View paramView)
  {
    int i1 = paramView.getId();
    if (i1 == f.cj)
    {
      d(149);
      this.f.a((this.f.b + 1) % this.e.b.length, true);
    }
    for (;;)
    {
      return;
      if (i1 == f.dQ)
      {
        d(151);
        this.f.a(this.e.b.length - 1, true);
      }
      else if (i1 == f.aR)
      {
        b();
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.p = ((aph)getIntent().getParcelableExtra("deviceSetupSession"));
    Object localObject = null;
    try
    {
      byte[] arrayOfByte = getIntent().getByteArrayExtra("tutorials");
      dan localdan = new dan;
      localdan.<init>();
      localdan = (dan)dew.a(localdan, arrayOfByte);
      localObject = localdan;
    }
    catch (dev localdev)
    {
      for (;;) {}
    }
    if (localObject == null)
    {
      setResult(-1);
      finish();
      return;
    }
    if (((dan)localObject).a != null) {}
    for (int i1 = (int)((dan)localObject).a.longValue();; i1 = -1)
    {
      this.o = i1;
      if (paramBundle == null) {
        c(148);
      }
      blx.h(this);
      setContentView(a.gS);
      this.k = ((ImageButton)findViewById(f.cj));
      this.k.setOnClickListener(this);
      this.h = ((Button)findViewById(f.dQ));
      this.h.setOnClickListener(this);
      this.g = ((Button)findViewById(f.aR));
      this.g.setOnClickListener(this);
      this.g.setText(((dan)localObject).h);
      this.l = getResources().getInteger(17694721);
      this.e = new bkb(this.b, ((dan)localObject).g);
      this.f = ((ViewPager)findViewById(f.cM));
      this.f.a(this.e);
      paramBundle = this.f;
      int i2 = ((dan)localObject).g.length / 2;
      i1 = i2;
      if (i2 <= 0)
      {
        Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
        i1 = 1;
      }
      if (i1 != paramBundle.c)
      {
        paramBundle.c = i1;
        paramBundle.b();
      }
      this.j = ((PagingIndicator)findViewById(f.cK));
      paramBundle = this.j;
      localObject = this.f;
      paramBundle.a = ((ViewPager)localObject);
      ((ViewPager)localObject).d = paramBundle;
      paramBundle.c(((ViewPager)localObject).a.a());
      ((ViewPager)localObject).a.a(new czt(paramBundle));
      paramBundle.a();
      this.j.b = this;
      this.n = getRequestedOrientation();
      i1 = blx.c(this);
      if (i1 != -1) {
        setRequestedOrientation(i1);
      }
      getWindow().addFlags(128);
      break;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    setRequestedOrientation(this.n);
    getWindow().clearFlags(128);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\tutorial\TutorialActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
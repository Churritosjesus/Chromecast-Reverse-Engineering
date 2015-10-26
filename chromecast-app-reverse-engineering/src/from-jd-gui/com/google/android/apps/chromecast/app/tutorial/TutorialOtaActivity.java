package com.google.android.apps.chromecast.app.tutorial;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import aph;
import ayq;
import ayy;
import bdf;
import bjx;
import bjy;
import bjz;
import bka;
import blf;
import blp;
import com.google.android.apps.chromecast.app.SetupApplication;
import dan;
import f;

public class TutorialOtaActivity
  extends TutorialActivity
{
  private final long i;
  private final long j;
  private final blp k = new blp("TutorialOtaActivity");
  private String l;
  private boolean m;
  private boolean n;
  private Handler o;
  private boolean p;
  private final Runnable q = new bjx(this);
  private ayq r;
  private final Runnable s = new bjy(this);
  
  public TutorialOtaActivity()
  {
    SetupApplication localSetupApplication = SetupApplication.a();
    this.i = blf.l(localSetupApplication);
    this.j = blf.m(localSetupApplication);
  }
  
  public static Intent a(Context paramContext, dan paramdan, bdf parambdf, boolean paramBoolean, aph paramaph)
  {
    paramdan = a(paramContext, paramdan);
    paramdan.setClass(paramContext, TutorialOtaActivity.class);
    paramdan.putExtra("deviceConfig", parambdf);
    paramdan.putExtra("scanForDevice", paramBoolean);
    paramdan.putExtra("deviceSetupSession", paramaph);
    return paramdan;
  }
  
  private void c()
  {
    if (this.p)
    {
      this.p = false;
      this.o.removeCallbacks(this.q);
    }
  }
  
  public final void a(int paramInt)
  {
    if (!this.n) {
      super.a(paramInt);
    }
  }
  
  protected final void b()
  {
    c(152);
    setResult(-1);
    finish();
  }
  
  public void onBackPressed()
  {
    if (!this.m) {
      b();
    }
    for (;;)
    {
      return;
      super.onBackPressed();
      c();
    }
  }
  
  public void onClick(View paramView)
  {
    c();
    super.onClick(paramView);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (isFinishing()) {
      return;
    }
    this.o = new Handler();
    this.r = new ayq(getApplicationContext());
    this.l = ((bdf)getIntent().getParcelableExtra("deviceConfig")).n;
    this.n = getIntent().getBooleanExtra("scanForDevice", true);
    if (paramBundle != null)
    {
      this.m = paramBundle.getBoolean("applyingUpdate");
      this.p = paramBundle.getBoolean("shouldAutoScroll");
    }
    for (;;)
    {
      this.h.setVisibility(8);
      this.h = null;
      findViewById(f.cF).setVisibility(0);
      if (!this.p) {
        break;
      }
      this.f.setOnTouchListener(new bjz(this));
      break;
      if (this.n)
      {
        this.m = true;
        this.p = true;
      }
      else
      {
        this.m = false;
        this.p = false;
      }
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.p) {
      this.o.removeCallbacks(this.q);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.p) {
      this.o.postDelayed(this.q, this.i);
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("applyingUpdate", this.m);
    paramBundle.putBoolean("shouldAutoScroll", this.p);
  }
  
  protected void onStart()
  {
    super.onStart();
    if (this.m)
    {
      this.o.postDelayed(this.s, this.j);
      this.r.a(new ayy(new bka(this)));
      this.r.b();
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    this.r.c();
    this.r.a();
    this.o.removeCallbacks(this.s);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\tutorial\TutorialOtaActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
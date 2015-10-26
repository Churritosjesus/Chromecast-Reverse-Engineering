package com.google.android.apps.chromecast.app.setup.ota;

import a;
import af;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import apd;
import ape;
import aph;
import b;
import bjs;
import bjt;
import bju;
import bjv;
import blf;
import blp;
import blx;
import com.google.android.apps.chromecast.app.HelpActivity;
import f;
import m;
import r;

public class OtaErrorActivity
  extends m
  implements bjt, bjv
{
  private blp e = new blp("OtaErrorActivity");
  private boolean f;
  private aph g;
  
  public static Intent a(Context paramContext, boolean paramBoolean, aph paramaph)
  {
    paramContext = new Intent(paramContext, OtaErrorActivity.class);
    paramContext.putExtra("supportsDisplay", paramBoolean);
    paramContext.putExtra("deviceSetupSession", paramaph);
    return paramContext;
  }
  
  private void b(int paramInt)
  {
    ape localape = ape.a();
    apd localapd = new apd(153).a(paramInt);
    localapd.h = this.g;
    localape.a(localapd);
  }
  
  public final void a(int paramInt)
  {
    boolean bool = false;
    int i;
    if (paramInt == f.L) {
      if (this.f)
      {
        i = b.cz;
        paramInt = b.cy;
        b(0);
        bjs localbjs = bjs.a(i, paramInt, bool);
        this.b.a().a(f.ai, localbjs).a(null).b();
      }
    }
    for (;;)
    {
      return;
      i = b.co;
      paramInt = b.cn;
      b(2);
      break;
      if (paramInt == f.M)
      {
        if (this.f)
        {
          i = b.cv;
          paramInt = b.cu;
          b(1);
          break;
        }
        i = b.cq;
        paramInt = b.cp;
        b(3);
        bool = true;
        break;
      }
      if (paramInt == f.N)
      {
        if (this.f)
        {
          m();
          continue;
        }
        i = b.cx;
        paramInt = b.cw;
        b(4);
        break;
      }
      if (paramInt == f.O)
      {
        b(5);
        m();
      }
      else
      {
        m();
      }
    }
  }
  
  public final void l()
  {
    b(7);
    finish();
  }
  
  public final void m()
  {
    b(6);
    if (this.f) {}
    for (String str = blf.p(this);; str = blf.q(this))
    {
      startActivity(HelpActivity.a(this, str));
      return;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.g = ((aph)getIntent().getParcelableExtra("deviceSetupSession"));
    blx.g(this);
    setContentView(a.gs);
    this.f = getIntent().getBooleanExtra("supportsDisplay", true);
    if (this.b.a(f.ai) == null)
    {
      paramBundle = bju.a(this.f);
      this.b.a().a(f.ai, paramBundle).b();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\setup\ota\OtaErrorActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
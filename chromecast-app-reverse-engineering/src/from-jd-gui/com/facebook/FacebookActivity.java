package com.facebook;

import a;
import af;
import ain;
import aix;
import akq;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import j;
import m;
import r;
import t;

public class FacebookActivity
  extends m
{
  private static String e = "PassThrough";
  private static String f = "SingleFragment";
  private j g;
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.g != null) {
      this.g.onConfigurationChanged(paramConfiguration);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.cY);
    Intent localIntent = getIntent();
    if (e.equals(localIntent.getAction()))
    {
      paramBundle = getIntent();
      setResult(0, aix.a(paramBundle, null, aix.a(aix.a(paramBundle))));
      finish();
      return;
    }
    t localt = this.b;
    j localj = localt.a(f);
    paramBundle = localj;
    if (localj == null)
    {
      if (!"FacebookDialogFragment".equals(localIntent.getAction())) {
        break label120;
      }
      paramBundle = new ain();
      paramBundle.c(true);
      paramBundle.a(localt, f);
    }
    for (;;)
    {
      this.g = paramBundle;
      break;
      label120:
      paramBundle = new akq();
      paramBundle.c(true);
      localt.a().a(a.cW, paramBundle, f).b();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\facebook\FacebookActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.apps.chromecast.app;

import a;
import af;
import aml;
import amm;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import b;
import blf;
import blx;
import f;
import m;
import mj;
import mm;
import nf;
import nh;
import r;

public class NoDevicesActivity
  extends mm
{
  private static String e = "chromecast";
  private static String f = "chromecastAudio";
  
  public static final Intent a(Context paramContext, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, NoDevicesActivity.class);
    if (paramBoolean) {}
    for (paramContext = f;; paramContext = e) {
      return localIntent.putExtra("fragmentType", paramContext);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.gm);
    blx.g(this);
    a((Toolbar)findViewById(f.cs));
    d().a().b(true);
    d().a().a(b.bW);
    if (getIntent().getStringExtra("fragmentType").equals("chromecast")) {}
    for (paramBundle = new amm();; paramBundle = new aml())
    {
      this.b.a().a(f.cm, paramBundle).b();
      return;
    }
  }
  
  public void onGetHelpClicked(View paramView)
  {
    startActivity(HelpActivity.a(this, blf.Q(this)));
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    finish();
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\NoDevicesActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
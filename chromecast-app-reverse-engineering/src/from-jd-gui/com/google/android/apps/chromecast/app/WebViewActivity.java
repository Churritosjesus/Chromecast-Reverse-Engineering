package com.google.android.apps.chromecast.app;

import a;
import af;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import apa;
import apc;
import bah;
import baq;
import bat;
import blx;
import f;
import java.util.ArrayList;
import m;
import mj;
import mm;
import mn;
import nf;
import nh;
import r;

public class WebViewActivity
  extends mm
  implements apc, baq
{
  private bah e;
  private apa f;
  
  public final ArrayList b_()
  {
    return null;
  }
  
  public final void c_()
  {
    d().a().d();
  }
  
  public final Intent e()
  {
    return null;
  }
  
  public final void f()
  {
    d().a().c();
  }
  
  public void onBackPressed()
  {
    if (this.e.e()) {
      this.e.d();
    }
    for (;;)
    {
      return;
      if (this.f.p()) {
        this.f.q();
      } else {
        super.onBackPressed();
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.e.a(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.gU);
    a((Toolbar)findViewById(f.eo));
    this.e = new bah(this, this, bat.c);
    if (getIntent().getBooleanExtra("topLevelActivity", false))
    {
      ((DrawerLayout)findViewById(f.aW)).a(1);
      d().a().b(true);
      paramBundle = this.e.c;
      if (paramBundle.d)
      {
        paramBundle.a(paramBundle.c, 0);
        paramBundle.d = false;
      }
    }
    d().a().a(getIntent().getStringExtra("title"));
    this.f = apa.a(getIntent().getStringExtra("url"));
    this.b.a().a(f.ey, this.f).b();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.e.c();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (blx.a(paramInt)) {}
    for (boolean bool = true;; bool = super.onKeyDown(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (blx.a(paramInt, this)) {}
    for (boolean bool = true;; bool = super.onKeyUp(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = true;
    if (this.e.a(paramMenuItem)) {}
    for (;;)
    {
      return bool;
      if ((paramMenuItem.getItemId() == 16908332) && (!this.e.c.d)) {
        finish();
      } else {
        bool = super.onOptionsItemSelected(paramMenuItem);
      }
    }
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    this.e.c.c();
  }
  
  protected void onStart()
  {
    super.onStart();
    this.e.a();
  }
  
  protected void onStop()
  {
    super.onStop();
    this.e.b();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\WebViewActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.apps.chromecast.app;

import a;
import af;
import amn;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import apa;
import apc;
import b;
import bkq;
import blx;
import com.google.android.apps.chromecast.app.settings.OpenSourceLicenseActivity;
import f;
import j;
import m;
import mj;
import mm;
import nf;
import nh;
import r;

public class HelpActivity
  extends mm
  implements apc
{
  public static Intent a(Context paramContext, String paramString)
  {
    paramContext = new Intent(paramContext, HelpActivity.class);
    paramContext.putExtra("url", paramString);
    return paramContext;
  }
  
  public final void c_()
  {
    d().a().d();
    findViewById(f.bh).setVisibility(8);
  }
  
  public final void f()
  {
    int i = 0;
    d().a().c();
    View localView = findViewById(f.bh);
    if (getIntent().getBooleanExtra("feedbackSupported", false)) {}
    for (;;)
    {
      localView.setVisibility(i);
      return;
      i = 8;
    }
  }
  
  public void onBackPressed()
  {
    apa localapa = (apa)this.b.a("webViewFragment");
    if ((localapa != null) && (localapa.p())) {
      localapa.q();
    }
    for (;;)
    {
      return;
      super.onBackPressed();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.ga);
    blx.g(this);
    a((Toolbar)findViewById(f.eo));
    d().a().b(true);
    d().a().a(b.bK);
    d().a().b(getString(b.N, new Object[] { getString(b.M), SetupApplication.a().e() }));
    String str;
    if (paramBundle == null)
    {
      paramBundle = getIntent().getStringExtra("url");
      if (paramBundle != null)
      {
        paramBundle = apa.a(paramBundle);
        str = "webViewFragment";
        this.b.a().b(f.br, paramBundle, str).b();
      }
    }
    else
    {
      paramBundle = findViewById(f.bh);
      if (!getIntent().getBooleanExtra("feedbackSupported", false)) {
        break label193;
      }
    }
    label193:
    for (int i = 0;; i = 8)
    {
      paramBundle.setVisibility(i);
      return;
      paramBundle = new amn();
      paramBundle.f(getIntent().getExtras());
      str = "textViewFragment";
      break;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(a.ha, paramMenu);
    return super.onCreateOptionsMenu(paramMenu);
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
    int i = paramMenuItem.getItemId();
    if (i == 16908332) {
      finish();
    }
    for (;;)
    {
      return bool;
      if (i == f.bO)
      {
        paramMenuItem = new Intent("android.intent.action.VIEW");
        paramMenuItem.setData(Uri.parse(getString(b.ay)));
        startActivity(paramMenuItem);
      }
      else if (i == f.bX)
      {
        paramMenuItem = new Intent(this, WebViewActivity.class);
        paramMenuItem.putExtra("url", blx.b(this));
        paramMenuItem.putExtra("topLevelActivity", true);
        paramMenuItem.putExtra("title", getString(b.cO));
        startActivity(paramMenuItem);
      }
      else if (i == f.bQ)
      {
        paramMenuItem = new Intent(this, WebViewActivity.class);
        paramMenuItem.putExtra("url", getString(b.cS));
        paramMenuItem.putExtra("topLevelActivity", true);
        paramMenuItem.putExtra("title", getString(b.cN));
        startActivity(paramMenuItem);
      }
      else if (i == f.bL)
      {
        startActivity(new Intent(this, OpenSourceLicenseActivity.class));
      }
      else if (i == f.bP)
      {
        if (this.b.a("textViewFragment") == null) {
          bool = false;
        }
      }
      else
      {
        bool = super.onOptionsItemSelected(paramMenuItem);
      }
    }
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    if ((Build.VERSION.SDK_INT < 19) || (this.b.a("webViewFragment") == null)) {
      paramMenu.findItem(f.bP).setVisible(false);
    }
    return true;
  }
  
  public void sendFeedback(View paramView)
  {
    bkq.a(this, getIntent().getParcelableArrayListExtra("feedbackDevices"));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\HelpActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
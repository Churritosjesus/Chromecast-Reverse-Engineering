package com.google.android.apps.chromecast.app.settings;

import a;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import bgm;
import blx;
import f;
import mj;
import mm;
import nf;
import nh;

public class ApplicationSettingsActivityV11
  extends mm
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    blx.g(this);
    setContentView(a.fs);
    a((Toolbar)findViewById(f.eo));
    d().a().b(true);
    getFragmentManager().beginTransaction().replace(f.bk, new bgm()).commit();
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
    switch (paramMenuItem.getItemId())
    {
    }
    for (boolean bool = super.onOptionsItemSelected(paramMenuItem);; bool = true)
    {
      return bool;
      finish();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\settings\ApplicationSettingsActivityV11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.apps.chromecast.app;

import a;
import amj;
import amk;
import ana;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.preference.PreferenceManager;
import atf;
import bkh;
import bkk;
import blp;
import blv;
import bol;
import boo;
import com.google.android.apps.chromecast.app.tutorial.TutorialActivity;
import ctw;
import dan;
import mm;

public class DiscoveryActivity
  extends mm
  implements bkk, boo
{
  private final blp e = new blp("DiscoveryActivity");
  private int f;
  private int g;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  
  private void g()
  {
    if ((!this.k) || (!this.i)) {}
    for (;;)
    {
      return;
      dan localdan = bkh.a().h.a(Integer.valueOf(this.g), false, 0);
      if (localdan == null)
      {
        h();
      }
      else
      {
        this.g = localdan.b.intValue();
        if (this.h)
        {
          PreferenceManager.getDefaultSharedPreferences(SetupApplication.a()).edit().putInt("warmWelcomeVersion", this.g).apply();
          h();
        }
        else
        {
          startActivityForResult(TutorialActivity.a(this, localdan), 1);
        }
      }
    }
  }
  
  private void h()
  {
    Object localObject = getIntent().getDataString();
    if ((localObject != null) && (((String)localObject).contains("apps"))) {
      localObject = ana.c;
    }
    for (;;)
    {
      bkh.a().i.a("appLaunch", Integer.valueOf(1));
      Intent localIntent = new Intent(this, MainActivity.class);
      localIntent.addFlags(32768);
      localIntent.putExtra("tabIndex", ((ana)localObject).ordinal());
      startActivity(localIntent);
      overridePendingTransition(a.de, a.df);
      finish();
      return;
      if (((localObject != null) && (((String)localObject).contains("backdrop"))) || (this.j) || ("android.intent.action.VIEW".equals(getIntent().getAction()))) {
        localObject = ana.b;
      } else {
        localObject = SetupApplication.h();
      }
    }
  }
  
  public final void e()
  {
    PreferenceManager.getDefaultSharedPreferences(this).getInt("appVersion", 0);
    PreferenceManager.getDefaultSharedPreferences(this).edit().putInt("appVersion", this.f).apply();
    bkh.a().e = this;
    bkh.a().b();
    atf.a(this).a(new amj(this), new amk(this));
  }
  
  public final void f()
  {
    this.k = true;
    bkh.a().e = null;
    g();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      PreferenceManager.getDefaultSharedPreferences(SetupApplication.a()).edit().putInt("warmWelcomeVersion", this.g).commit();
      h();
    }
    for (;;)
    {
      return;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.fr);
    if (paramBundle != null)
    {
      this.i = paramBundle.getBoolean("environmentLoaded");
      this.k = paramBundle.getBoolean("containerLoaded");
      this.g = paramBundle.getInt("lastTutorialVersion");
      this.h = paramBundle.getBoolean("skipTutorial");
      this.j = paramBundle.getBoolean("openDevicesTab");
    }
    try
    {
      for (;;)
      {
        this.f = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
        return;
        this.g = PreferenceManager.getDefaultSharedPreferences(SetupApplication.a()).getInt("warmWelcomeVersion", 0);
      }
    }
    catch (PackageManager.NameNotFoundException paramBundle)
    {
      for (;;) {}
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    bkh.a().e = null;
  }
  
  public void onResume()
  {
    super.onResume();
    if (!SetupApplication.a().b)
    {
      bol.a(this);
      this.h = true;
      this.j = true;
    }
    for (;;)
    {
      return;
      e();
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("environmentLoaded", this.i);
    paramBundle.putBoolean("containerLoaded", this.k);
    paramBundle.putLong("lastTutorialVersion", this.g);
    paramBundle.putBoolean("skipTutorial", this.h);
    paramBundle.putBoolean("openDevicesTab", this.j);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\DiscoveryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
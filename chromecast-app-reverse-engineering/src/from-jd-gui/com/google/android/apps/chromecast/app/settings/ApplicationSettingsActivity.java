package com.google.android.apps.chromecast.app.settings;

import a;
import ana;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.view.MenuItem;
import blx;
import com.google.android.apps.chromecast.app.SetupApplication;

public class ApplicationSettingsActivity
  extends PreferenceActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    blx.g(this);
    addPreferencesFromResource(a.hl);
    findPreference("privacy_link").setIntent(new Intent("android.intent.action.VIEW").setData(Uri.parse(blx.a(this))));
    findPreference("software_version").setSummary(SetupApplication.a().e());
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    }
    for (boolean bool = super.onOptionsItemSelected(paramMenuItem);; bool = true)
    {
      return bool;
      startActivity(SetupApplication.a(this, ana.a));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\settings\ApplicationSettingsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
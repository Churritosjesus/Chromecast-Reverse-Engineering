package com.google.android.apps.chromecast.app.settings;

import android.os.Bundle;
import android.webkit.WebView;
import bgn;
import f;

public class OpenSourceLicenseActivity
  extends bgn
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ((WebView)findViewById(f.ai)).loadUrl("file:///android_asset/html/licenses.html");
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\settings\OpenSourceLicenseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
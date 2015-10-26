import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import com.google.android.apps.chromecast.app.SetupApplication;

public final class bgm
  extends PreferenceFragment
{
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getActivity().getApplicationContext();
    addPreferencesFromResource(a.hl);
    findPreference("software_version").setSummary(SetupApplication.a().e());
    findPreference("privacy_link").setIntent(new Intent("android.intent.action.VIEW").setData(Uri.parse(blx.a(paramBundle))));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bgm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
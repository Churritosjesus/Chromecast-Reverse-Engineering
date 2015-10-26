import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.google.android.apps.chromecast.app.DeviceSettingsActivity;

public final class bmg
  extends i
{
  private EditText Z;
  private DeviceSettingsActivity aa;
  private String ab;
  
  public static bmg a(String paramString)
  {
    bmg localbmg = new bmg();
    Bundle localBundle = new Bundle();
    localBundle.putString("oldName", paramString);
    localbmg.f(localBundle);
    return localbmg;
  }
  
  public final void a()
  {
    super.a();
    this.aa = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.aa = ((DeviceSettingsActivity)paramActivity);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    this.ab = this.m.getString("oldName");
    paramBundle = this.y.getLayoutInflater().inflate(a.fZ, null);
    this.Z = ((EditText)paramBundle.findViewById(f.bl));
    this.Z.setText(this.ab);
    this.Z.selectAll();
    paramBundle = new AlertDialog.Builder(this.aa).setInverseBackgroundForced(true).setTitle(a(b.cW, new Object[] { this.ab })).setView(paramBundle).setNegativeButton(b.H, null).setPositiveButton(b.I, new bmh(this)).create();
    paramBundle.getWindow().setSoftInputMode(5);
    return paramBundle;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bmg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.apps.chromecast.app.mirror.CastScreenActivity;

public final class bbi
  extends i
{
  private CheckBox Z;
  private boolean aa = true;
  
  public final Dialog c(Bundle paramBundle)
  {
    paramBundle = this.y.getLayoutInflater().inflate(a.fG, null);
    this.Z = ((CheckBox)paramBundle.findViewById(f.X));
    return new AlertDialog.Builder(this.y).setView(paramBundle).setPositiveButton(b.I, null).create();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.aa = false;
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    if (this.aa)
    {
      if (this.Z.isChecked()) {
        PreferenceManager.getDefaultSharedPreferences(this.y.getApplicationContext()).edit().putBoolean("CAST_SCREEN_DO_NOT_SHOW_WARNING", true).apply();
      }
      this.Z = null;
      CastScreenActivity.h((CastScreenActivity)this.y);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
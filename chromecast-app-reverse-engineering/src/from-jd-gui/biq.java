import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.apps.chromecast.app.setup.DeviceSetupActivity;

public final class biq
  implements DialogInterface.OnCancelListener
{
  public biq(DeviceSetupActivity paramDeviceSetupActivity) {}
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.finish();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\biq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
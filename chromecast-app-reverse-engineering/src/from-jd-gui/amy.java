import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.google.android.apps.chromecast.app.MainActivity;

public final class amy
  implements DialogInterface.OnDismissListener
{
  amy(MainActivity paramMainActivity) {}
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    MainActivity.a(this.a, null);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\amy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
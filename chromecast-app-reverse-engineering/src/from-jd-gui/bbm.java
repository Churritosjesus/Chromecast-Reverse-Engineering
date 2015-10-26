import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.wifi.WifiManager;
import com.google.android.apps.chromecast.app.mirror.CastScreenActivity;

final class bbm
  implements DialogInterface.OnClickListener
{
  bbm(bbl parambbl) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    CastScreenActivity.g().setWifiEnabled(true);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
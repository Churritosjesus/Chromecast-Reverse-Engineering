import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

final class baf
  extends BroadcastReceiver
{
  baf(bae parambae, String[] paramArrayOfString) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (this.b.b != null)
    {
      Iterator localIterator = this.b.c.getScanResults().iterator();
      label129:
      while (localIterator.hasNext())
      {
        ScanResult localScanResult = (ScanResult)localIterator.next();
        if (localScanResult != null)
        {
          String str = localScanResult.BSSID.toUpperCase();
          paramIntent = this.a;
          int j = paramIntent.length;
          for (int i = 0;; i++)
          {
            if (i >= j) {
              break label129;
            }
            if (str.startsWith(paramIntent[i]))
            {
              if (TextUtils.isEmpty(localScanResult.SSID)) {
                break;
              }
              this.b.b.a(localScanResult.SSID, str);
              break;
            }
          }
        }
      }
    }
    try
    {
      paramContext.unregisterReceiver(this);
      return;
    }
    catch (IllegalArgumentException paramContext)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\baf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
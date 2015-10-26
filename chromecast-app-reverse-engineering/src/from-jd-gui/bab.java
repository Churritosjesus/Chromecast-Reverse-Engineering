import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.NetworkInfo.DetailedState;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

final class bab
{
  final baa a;
  final Runnable b;
  boolean c;
  NetworkInfo.DetailedState d;
  boolean e = true;
  boolean f = true;
  private final BroadcastReceiver h;
  
  public bab(azv paramazv, String paramString, boolean paramBoolean, baa parambaa)
  {
    this.a = parambaa;
    this.h = new bad(this, paramString, paramBoolean);
    this.b = new bac(this, paramazv);
    this.c = true;
    paramazv.a.registerReceiver(this.h, new IntentFilter("android.net.wifi.STATE_CHANGE"));
    paramazv.b.postDelayed(this.b, paramazv.e);
  }
  
  public final void a()
  {
    if (!this.c) {}
    for (;;)
    {
      return;
      if (this.h != null) {}
      try
      {
        this.g.a.unregisterReceiver(this.h);
        if (this.b != null) {
          this.g.b.removeCallbacks(this.b);
        }
        this.c = false;
        azv localazv = this.g;
        Object localObject = localazv.c.getConfiguredNetworks();
        if (localObject == null) {
          continue;
        }
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          WifiConfiguration localWifiConfiguration = (WifiConfiguration)((Iterator)localObject).next();
          localazv.c.enableNetwork(localWifiConfiguration.networkId, false);
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
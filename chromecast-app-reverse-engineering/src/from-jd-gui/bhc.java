import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;

final class bhc
  implements baa
{
  bhc(bhb parambhb) {}
  
  private void b()
  {
    azv localazv = bha.b(this.a.a);
    WifiConfiguration localWifiConfiguration = localazv.a(bha.c(this.a.a));
    if (localWifiConfiguration != null) {
      localazv.c.removeNetwork(localWifiConfiguration.networkId);
    }
  }
  
  public final void a()
  {
    b();
  }
  
  public final void a(boolean paramBoolean)
  {
    b();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bhc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
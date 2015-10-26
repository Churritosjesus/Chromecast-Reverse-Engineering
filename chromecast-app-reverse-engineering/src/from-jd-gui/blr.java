import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class blr
{
  private static final blp a = new blp("NetworkUtil");
  private static final ArrayList b = new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(0), Integer.valueOf(2412), Integer.valueOf(2417), Integer.valueOf(2422), Integer.valueOf(2427), Integer.valueOf(2432), Integer.valueOf(2437), Integer.valueOf(2442), Integer.valueOf(2447), Integer.valueOf(2452), Integer.valueOf(2457), Integer.valueOf(2462), Integer.valueOf(2467), Integer.valueOf(2472), Integer.valueOf(2484) }));
  
  private static String a(Context paramContext, int paramInt)
  {
    if (a(paramInt)) {
      paramContext = paramContext.getResources().getString(b.dZ);
    }
    for (;;)
    {
      return paramContext;
      if ((paramInt >= 4915) && (paramInt <= 5825)) {}
      for (paramInt = 1;; paramInt = 0)
      {
        if (paramInt == 0) {
          break label59;
        }
        paramContext = paramContext.getResources().getString(b.ea);
        break;
      }
      label59:
      paramContext = paramContext.getResources().getString(b.en);
    }
  }
  
  public static String a(WifiInfo paramWifiInfo)
  {
    if (paramWifiInfo == null) {}
    for (paramWifiInfo = "";; paramWifiInfo = a(paramWifiInfo.getSSID())) {
      return paramWifiInfo;
    }
  }
  
  private static String a(String paramString)
  {
    String str;
    if (paramString == null) {
      str = "";
    }
    for (;;)
    {
      return str;
      str = paramString;
      if (paramString.startsWith("\""))
      {
        str = paramString;
        if (paramString.endsWith("\"")) {
          str = paramString.substring(1, paramString.length() - 1);
        }
      }
    }
  }
  
  public static Set a(Context paramContext, String[] paramArrayOfString)
  {
    HashSet localHashSet = new HashSet();
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    if (paramContext != null)
    {
      paramContext = paramContext.getScanResults();
      if (paramContext != null)
      {
        paramContext = paramContext.iterator();
        while (paramContext.hasNext())
        {
          ScanResult localScanResult = (ScanResult)paramContext.next();
          String str = a(localScanResult.SSID);
          if ((!TextUtils.isEmpty(str)) && (!a(localScanResult.BSSID, paramArrayOfString))) {
            localHashSet.add(str);
          }
        }
      }
    }
    localHashSet.size();
    return localHashSet;
  }
  
  private static boolean a(int paramInt)
  {
    if ((paramInt >= 2412) && (paramInt <= 2484)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean a(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getNetworkInfo(1);
    if ((paramContext != null) && (paramContext.isConnected())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {}
    for (boolean bool = false;; bool = a(paramString1).equals(a(paramString2))) {
      return bool;
    }
  }
  
  private static boolean a(String paramString, String[] paramArrayOfString)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramArrayOfString == null)
    {
      bool1 = bool2;
      return bool1;
    }
    int j = paramArrayOfString.length;
    for (int i = 0;; i++)
    {
      bool1 = bool2;
      if (i >= j) {
        break;
      }
      String str = paramArrayOfString[i];
      if (paramString.toUpperCase().startsWith(str.toUpperCase()))
      {
        bool1 = true;
        break;
      }
    }
  }
  
  public static bfs b(Context paramContext)
  {
    Object localObject = null;
    if (!a(paramContext)) {
      paramContext = (Context)localObject;
    }
    WifiManager localWifiManager;
    WifiInfo localWifiInfo;
    do
    {
      return paramContext;
      localWifiManager = (WifiManager)paramContext.getSystemService("wifi");
      localWifiInfo = localWifiManager.getConnectionInfo();
      paramContext = (Context)localObject;
    } while (localWifiInfo == null);
    paramContext = localWifiManager.getConfiguredNetworks();
    if (paramContext != null)
    {
      localObject = paramContext.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        paramContext = (WifiConfiguration)((Iterator)localObject).next();
      } while (paramContext.networkId != localWifiInfo.getNetworkId());
    }
    for (;;)
    {
      localObject = new bfs();
      ((bfs)localObject).a = a(localWifiInfo);
      if (paramContext != null) {
        ((bfs)localObject).i = paramContext.BSSID;
      }
      if (paramContext != null) {
        if (paramContext.allowedKeyManagement.get(1)) {
          paramContext = bfu.h;
        }
      }
      for (;;)
      {
        ((bfs)localObject).b = paramContext;
        paramContext = (Context)localObject;
        break;
        if ((paramContext.allowedKeyManagement.get(2)) || (paramContext.allowedKeyManagement.get(3)))
        {
          paramContext = bfu.i;
        }
        else if (paramContext.wepKeys[0] != null)
        {
          paramContext = bfu.c;
        }
        else
        {
          paramContext = bfu.b;
          continue;
          paramContext = bfu.a;
        }
      }
      paramContext = null;
    }
  }
  
  public static String c(Context paramContext)
  {
    paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
    if (paramContext == null) {}
    for (paramContext = "";; paramContext = a(paramContext)) {
      return paramContext;
    }
  }
  
  public static int d(Context paramContext)
  {
    int i;
    if (!a(paramContext)) {
      i = -1;
    }
    for (;;)
    {
      return i;
      Object localObject = (WifiManager)paramContext.getSystemService("wifi");
      WifiInfo localWifiInfo = ((WifiManager)localObject).getConnectionInfo();
      if (localWifiInfo == null)
      {
        i = -1;
      }
      else
      {
        String str = localWifiInfo.getBSSID();
        if (!TextUtils.isEmpty(str))
        {
          Iterator localIterator = ((WifiManager)localObject).getScanResults().iterator();
          do
          {
            if (!localIterator.hasNext()) {
              break;
            }
            localObject = (ScanResult)localIterator.next();
          } while ((localObject == null) || (!str.equalsIgnoreCase(((ScanResult)localObject).BSSID)));
        }
        for (;;)
        {
          if (localObject != null) {
            break label122;
          }
          localWifiInfo.getSSID();
          localWifiInfo.getBSSID();
          i = -1;
          break;
          localObject = null;
        }
        label122:
        i = ((ScanResult)localObject).frequency;
        if (!a(i)) {}
        for (i = -1;; i = b.indexOf(Integer.valueOf(i)))
        {
          if (i != -1) {
            break label183;
          }
          localWifiInfo.getSSID();
          localWifiInfo.getBSSID();
          a(paramContext, ((ScanResult)localObject).frequency);
          break;
        }
        label183:
        localWifiInfo.getSSID();
        localWifiInfo.getBSSID();
        a(paramContext, ((ScanResult)localObject).frequency);
      }
    }
  }
  
  public static boolean e(Context paramContext)
  {
    boolean bool2 = false;
    paramContext = paramContext.getContentResolver();
    int i;
    boolean bool1;
    if (Build.VERSION.SDK_INT >= 17)
    {
      i = Settings.Global.getInt(paramContext, "wifi_watchdog_poor_network_test_enabled", -1);
      if (i == -1) {
        break label62;
      }
      bool1 = bool2;
      if (i == 1) {
        bool1 = true;
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if (Build.VERSION.SDK_INT >= 15)
      {
        i = Settings.Secure.getInt(paramContext, "wifi_watchdog_poor_network_test_enabled", -1);
        break;
        label62:
        if (Build.VERSION.SDK_INT >= 17) {}
        try
        {
          paramContext = Class.forName("android.net.wifi.WifiWatchdogStateMachine").getField("DEFAULT_POOR_NETWORK_AVOIDANCE_ENABLED");
          if (!paramContext.isAccessible()) {
            paramContext.setAccessible(true);
          }
          bool1 = paramContext.getBoolean(null);
          continue;
          bool1 = true;
        }
        catch (IllegalArgumentException paramContext)
        {
          bool1 = bool2;
        }
        catch (ClassNotFoundException paramContext)
        {
          bool1 = bool2;
        }
        catch (NoSuchFieldException paramContext)
        {
          bool1 = bool2;
        }
        catch (IllegalAccessException paramContext)
        {
          bool1 = bool2;
        }
      }
    }
  }
  
  public static Intent f(Context paramContext)
  {
    Intent localIntent = new Intent("android.settings.WIFI_IP_SETTINGS");
    int i;
    if (paramContext.getPackageManager().resolveActivity(localIntent, 65536) != null)
    {
      i = 1;
      if (i == 0) {
        break label40;
      }
    }
    label40:
    for (paramContext = localIntent;; paramContext = null)
    {
      return paramContext;
      i = 0;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\blr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.NetworkRequest.Builder;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class azv
{
  final Context a;
  final Handler b;
  public final WifiManager c;
  final ConnectivityManager d;
  final long e;
  bab f;
  String g;
  public long h;
  public long i;
  public String j;
  final blp k = new blp("WifiConnectionManager");
  private ConnectivityManager.NetworkCallback l;
  
  public azv(Context paramContext)
  {
    this.a = paramContext;
    this.b = new Handler();
    this.e = paramContext.getResources().getInteger(a.fk);
    this.c = ((WifiManager)this.a.getSystemService("wifi"));
    this.d = ((ConnectivityManager)paramContext.getSystemService("connectivity"));
    this.h = blf.Y(this.a);
  }
  
  static void a(baa parambaa)
  {
    if (parambaa != null) {
      parambaa.a();
    }
  }
  
  static void a(baa parambaa, boolean paramBoolean)
  {
    if (parambaa != null) {
      parambaa.a(paramBoolean);
    }
  }
  
  static boolean a(String paramString, WifiInfo paramWifiInfo)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null)
    {
      if (paramWifiInfo != null) {
        break label16;
      }
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      label16:
      bool1 = bool2;
      if (paramString.equals(blr.a(paramWifiInfo))) {
        bool1 = true;
      }
    }
  }
  
  private static String b(String paramString)
  {
    String str;
    if (TextUtils.isEmpty(paramString)) {
      str = "";
    }
    for (;;)
    {
      return str;
      int m = paramString.length() - 1;
      if ((m > 0) && (paramString.charAt(0) == '"'))
      {
        str = paramString;
        if (paramString.charAt(m) == '"') {}
      }
      else
      {
        str = String.valueOf(paramString).length() + 2 + "\"" + paramString + "\"";
      }
    }
  }
  
  static boolean c()
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private int e()
  {
    int m = 0;
    List localList = this.c.getConfiguredNetworks();
    if (localList == null) {}
    for (;;)
    {
      return m;
      Collections.sort(localList, new azx());
      int n = localList.size();
      for (m = 0; m < n; m++)
      {
        WifiConfiguration localWifiConfiguration = (WifiConfiguration)localList.get(m);
        localWifiConfiguration.priority = m;
        this.c.updateNetwork(localWifiConfiguration);
      }
      this.c.saveConfiguration();
      m = n;
    }
  }
  
  private int f()
  {
    Object localObject = this.c.getConfiguredNetworks();
    int n;
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      int m = 0;
      n = m;
      if (!((Iterator)localObject).hasNext()) {
        break label62;
      }
      WifiConfiguration localWifiConfiguration = (WifiConfiguration)((Iterator)localObject).next();
      if (localWifiConfiguration.priority <= m) {
        break label65;
      }
      m = localWifiConfiguration.priority;
    }
    label62:
    label65:
    for (;;)
    {
      break;
      n = 0;
      return n;
    }
  }
  
  public final WifiConfiguration a(bfs parambfs)
  {
    int m;
    Object localObject;
    switch (azz.a[parambfs.b.ordinal()])
    {
    default: 
      this.k.a("authType %s not supported", new Object[] { parambfs.b });
      m = 0;
      if (m == 0) {
        localObject = null;
      }
      break;
    }
    for (;;)
    {
      return (WifiConfiguration)localObject;
      m = 1;
      break;
      WifiConfiguration localWifiConfiguration = a(parambfs.a);
      localObject = localWifiConfiguration;
      if (localWifiConfiguration == null)
      {
        localWifiConfiguration = new WifiConfiguration();
        localWifiConfiguration.SSID = b(parambfs.a);
        if (!TextUtils.isEmpty(parambfs.i)) {
          localWifiConfiguration.BSSID = parambfs.i;
        }
        localObject = parambfs.e;
        if (localObject == null)
        {
          m = 0;
          label142:
          switch (azz.a[parambfs.b.ordinal()])
          {
          }
        }
        for (;;)
        {
          localWifiConfiguration.hiddenSSID = parambfs.g;
          if ((this.c.addNetwork(localWifiConfiguration) != -1) && (this.c.saveConfiguration())) {
            break label489;
          }
          localObject = null;
          break;
          m = ((String)localObject).length();
          break label142;
          localWifiConfiguration.allowedKeyManagement.set(0);
          continue;
          localWifiConfiguration.allowedKeyManagement.set(0);
          localWifiConfiguration.allowedProtocols.set(1);
          localWifiConfiguration.allowedProtocols.set(0);
          localWifiConfiguration.allowedAuthAlgorithms.set(0);
          localWifiConfiguration.allowedAuthAlgorithms.set(1);
          localWifiConfiguration.allowedPairwiseCiphers.set(2);
          localWifiConfiguration.allowedPairwiseCiphers.set(1);
          localWifiConfiguration.allowedGroupCiphers.set(0);
          localWifiConfiguration.allowedGroupCiphers.set(1);
          if ((localObject != null) && (m > 0))
          {
            if (((m == 10) || (m == 26) || (m == 58)) && (((String)localObject).matches("[0-9A-Fa-f]*"))) {
              localWifiConfiguration.wepKeys[0] = localObject;
            }
            for (;;)
            {
              localWifiConfiguration.wepTxKeyIndex = 0;
              break;
              localWifiConfiguration.wepKeys[0] = b((String)localObject);
            }
            localWifiConfiguration.allowedKeyManagement.set(1);
            localWifiConfiguration.allowedProtocols.set(1);
            localWifiConfiguration.allowedProtocols.set(0);
            localWifiConfiguration.allowedPairwiseCiphers.set(1);
            localWifiConfiguration.allowedPairwiseCiphers.set(2);
            localWifiConfiguration.allowedGroupCiphers.set(0);
            localWifiConfiguration.allowedGroupCiphers.set(1);
            localWifiConfiguration.allowedGroupCiphers.set(2);
            localWifiConfiguration.allowedGroupCiphers.set(3);
            if ((localObject != null) && (m > 0)) {
              if (((String)localObject).matches("[0-9A-Fa-f]{64}")) {
                localWifiConfiguration.preSharedKey = ((String)localObject);
              } else {
                localWifiConfiguration.preSharedKey = b((String)localObject);
              }
            }
          }
        }
        label489:
        localObject = a(parambfs.a);
      }
    }
  }
  
  public WifiConfiguration a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      String str = b(paramString);
      paramString = this.c.getConfiguredNetworks();
      if (paramString != null)
      {
        Iterator localIterator = paramString.iterator();
        for (;;)
        {
          if (localIterator.hasNext())
          {
            paramString = (WifiConfiguration)localIterator.next();
            if (TextUtils.equals(str, paramString.SSID)) {
              break;
            }
          }
        }
      }
      paramString = null;
    }
  }
  
  public final void a()
  {
    if (this.f != null)
    {
      this.f.a();
      this.f = null;
    }
  }
  
  public final boolean a(String paramString, baa parambaa, boolean paramBoolean)
  {
    a();
    if (a(paramString, true))
    {
      a(parambaa);
      paramBoolean = false;
    }
    for (;;)
    {
      return paramBoolean;
      b();
      WifiConfiguration localWifiConfiguration = a(paramString);
      if (localWifiConfiguration == null)
      {
        a(parambaa, false);
        paramBoolean = false;
      }
      else
      {
        this.f = new bab(this, paramString, paramBoolean, new azw(this, parambaa));
        if ((paramBoolean) && (c()))
        {
          this.l = new azy(this, paramString);
          localObject = new NetworkRequest.Builder().addTransportType(1).build();
          this.d.registerNetworkCallback((NetworkRequest)localObject, this.l);
        }
        Object localObject = localWifiConfiguration;
        int m;
        int n;
        if (Build.VERSION.SDK_INT < 22)
        {
          m = localWifiConfiguration.priority;
          n = f();
          if (n >= 100000)
          {
            n = e();
            localWifiConfiguration = a(paramString);
            if (localWifiConfiguration == null) {
              paramBoolean = false;
            }
          }
        }
        for (;;)
        {
          if (paramBoolean) {
            break label330;
          }
          a();
          a(parambaa, false);
          paramBoolean = false;
          break;
          m = localWifiConfiguration.priority;
          for (localWifiConfiguration.priority = n;; localWifiConfiguration.priority = (n + 1))
          {
            n = this.c.updateNetwork(localWifiConfiguration);
            if (n != -1) {
              break label241;
            }
            paramBoolean = false;
            break;
          }
          label241:
          if ((!this.c.enableNetwork(n, false)) || (!this.c.saveConfiguration()))
          {
            if (m != -1) {
              localWifiConfiguration.priority = m;
            }
            paramBoolean = false;
          }
          else
          {
            paramString = a(paramString);
            localObject = paramString;
            if (paramString == null)
            {
              paramBoolean = false;
            }
            else
            {
              paramString = ((WifiConfiguration)localObject).SSID;
              m = ((WifiConfiguration)localObject).networkId;
              paramBoolean = this.c.enableNetwork(((WifiConfiguration)localObject).networkId, true);
            }
          }
        }
        label330:
        paramBoolean = true;
      }
    }
  }
  
  public boolean a(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    if (TextUtils.equals(paramString, this.g)) {
      if (!paramBoolean) {}
    }
    for (;;)
    {
      return bool;
      localObject = this.d.getNetworkInfo(1);
      if ((localObject != null) && (((NetworkInfo)localObject).isConnected())) {
        break;
      }
      if (paramBoolean) {}
      bool = false;
    }
    Object localObject = ((NetworkInfo)localObject).getExtraInfo();
    if (TextUtils.isEmpty((CharSequence)localObject)) {}
    for (bool = a(paramString, this.c.getConnectionInfo());; bool = blr.a(paramString, (String)localObject))
    {
      if (paramBoolean) {}
      break;
    }
  }
  
  public final void b()
  {
    if (!c()) {}
    for (;;)
    {
      return;
      if (this.g != null) {
        d();
      }
    }
  }
  
  @TargetApi(21)
  void d()
  {
    String str;
    if (ConnectivityManager.setProcessDefaultNetwork(null))
    {
      str = this.g;
      this.g = null;
      if (this.l != null)
      {
        this.d.unregisterNetworkCallback(this.l);
        this.l = null;
      }
    }
    for (;;)
    {
      return;
      str = this.g;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\azv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
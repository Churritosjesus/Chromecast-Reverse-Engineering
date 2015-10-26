import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

final class azm
{
  private static final Locale b = Locale.ROOT;
  azr a;
  private Context c;
  private List d;
  private InetSocketAddress e;
  private String f;
  private int g;
  private int h;
  private Handler i;
  private volatile boolean j;
  private List k;
  private AtomicBoolean l;
  private ConnectivityManager m;
  private azq n;
  private WifiManager o;
  private String p;
  private azt q;
  private volatile boolean r;
  private final blp s = new blp("SsdpScanner", false);
  
  public azm(Context paramContext, String paramString, int paramInt1, int paramInt2, Handler paramHandler)
  {
    if (paramInt1 <= 0) {
      throw new IllegalArgumentException("delay must be at least 1 second");
    }
    this.c = paramContext;
    this.f = paramString;
    this.h = paramInt2;
    this.g = paramInt1;
    this.i = paramHandler;
    this.e = new InetSocketAddress("239.255.255.250", 1900);
    this.l = new AtomicBoolean();
    this.d = new ArrayList();
    this.k = new ArrayList();
    this.m = ((ConnectivityManager)this.c.getSystemService("connectivity"));
    if (this.c.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0) {
      this.o = ((WifiManager)this.c.getSystemService("wifi"));
    }
  }
  
  private void d()
  {
    if ((!this.l.getAndSet(true)) && (this.a != null)) {
      this.i.post(new azp(this));
    }
  }
  
  private void e()
  {
    if (!this.r)
    {
      this.r = true;
      if (this.a != null) {
        this.a.a();
      }
    }
  }
  
  public final void a()
  {
    if ((!this.d.isEmpty()) || (this.q != null)) {}
    for (;;)
    {
      return;
      if (this.n == null)
      {
        this.n = new azq(this);
        IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.c.registerReceiver(this.n, localIntentFilter);
      }
      this.q = new azt(this);
      this.q.execute(new Void[0]);
    }
  }
  
  void b()
  {
    if (this.q != null)
    {
      this.q.cancel(true);
      this.q = null;
    }
    if (this.d.isEmpty()) {}
    for (;;)
    {
      return;
      this.j = true;
      Iterator localIterator1 = this.d.iterator();
      while (localIterator1.hasNext()) {
        ((MulticastSocket)localIterator1.next()).close();
      }
      Iterator localIterator2 = this.k.iterator();
      if (localIterator2.hasNext())
      {
        Thread localThread = (Thread)localIterator2.next();
        localThread.interrupt();
        for (;;)
        {
          try
          {
            localThread.join();
          }
          catch (InterruptedException localInterruptedException) {}
        }
      }
      this.k.clear();
      this.d.clear();
    }
  }
  
  void c()
  {
    if (this.n == null) {}
    for (;;)
    {
      return;
      try
      {
        this.c.unregisterReceiver(this.n);
        this.n = null;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\azm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
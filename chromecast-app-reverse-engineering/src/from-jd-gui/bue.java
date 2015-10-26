import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class bue
  extends byo
{
  private static final Object A = new Object();
  private static final Object B = new Object();
  private static final buu j = new buu("CastClientImpl");
  public ApplicationMetadata a;
  public final Map b;
  public boolean c;
  public double d;
  public final AtomicLong e;
  public final Map f;
  private final CastDevice k;
  private final btc l;
  private final long m;
  private buh n;
  private String o;
  private boolean p;
  private boolean q;
  private boolean r;
  private int s;
  private int t;
  private String u;
  private String v;
  private Bundle w;
  private final bug x;
  private bwq y;
  private bwq z;
  
  public bue(Context paramContext, Looper paramLooper, CastDevice paramCastDevice, long paramLong, btc parambtc, bwg parambwg, bwh parambwh)
  {
    super(paramContext, paramLooper, 10, parambwg, parambwh);
    this.k = paramCastDevice;
    this.l = parambtc;
    this.m = paramLong;
    this.b = new HashMap();
    this.e = new AtomicLong(0L);
    this.f = new HashMap();
    q();
    this.x = new bug(this);
    a(this.x);
  }
  
  private void q()
  {
    this.r = false;
    this.s = -1;
    this.t = -1;
    this.a = null;
    this.o = null;
    this.d = 0.0D;
    this.c = false;
  }
  
  private void r()
  {
    j.b("removing all MessageReceivedCallbacks", new Object[0]);
    synchronized (this.b)
    {
      this.b.clear();
      return;
    }
  }
  
  public final void a()
  {
    j.b("disconnect(); ServiceListener=%s, isConnected=%b", new Object[] { this.n, Boolean.valueOf(k()) });
    buh localbuh = this.n;
    this.n = null;
    if ((localbuh == null) || (localbuh.a() == null)) {
      j.b("already disposed, so short-circuiting", new Object[0]);
    }
    for (;;)
    {
      return;
      r();
      try
      {
        if ((k()) || (m())) {
          ((buo)o()).a();
        }
        super.a();
      }
      catch (RemoteException localRemoteException)
      {
        j.a(localRemoteException, "Error while disconnecting the controller interface: %s", new Object[] { localRemoteException.getMessage() });
        super.a();
      }
      finally
      {
        super.a();
      }
    }
  }
  
  protected final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    j.b("in onPostInitHandler; statusCode=%d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt == 0) || (paramInt == 1001))
    {
      this.r = true;
      this.p = true;
      this.q = true;
    }
    for (;;)
    {
      int i = paramInt;
      if (paramInt == 1001)
      {
        this.w = new Bundle();
        this.w.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
        i = 0;
      }
      super.a(i, paramIBinder, paramBundle);
      return;
      this.r = false;
    }
  }
  
  public void a(bwq parambwq)
  {
    synchronized (A)
    {
      if (this.y != null)
      {
        bwq localbwq = this.y;
        buf localbuf = new buf;
        Status localStatus = new com/google/android/gms/common/api/Status;
        localStatus.<init>(2002);
        localbuf.<init>(localStatus);
        localbwq.a(localbuf);
      }
      this.y = parambwq;
      return;
    }
  }
  
  public final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }
    synchronized (this.b)
    {
      btd localbtd = (btd)this.b.remove(paramString);
      if (localbtd == null) {}
    }
    try
    {
      ((buo)o()).c(paramString);
      return;
      paramString = finally;
      throw paramString;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        j.a(localIllegalStateException, "Error unregistering namespace (%s): %s", new Object[] { paramString, localIllegalStateException.getMessage() });
      }
    }
  }
  
  public final Bundle b()
  {
    Bundle localBundle;
    if (this.w != null)
    {
      localBundle = this.w;
      this.w = null;
    }
    for (;;)
    {
      return localBundle;
      localBundle = super.b();
    }
  }
  
  public void b(bwq parambwq)
  {
    synchronized (B)
    {
      if (this.z != null)
      {
        Status localStatus = new com/google/android/gms/common/api/Status;
        localStatus.<init>(2001);
        parambwq.a(localStatus);
        return;
      }
      this.z = parambwq;
    }
  }
  
  protected final String c()
  {
    return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
  }
  
  protected final String d()
  {
    return "com.google.android.gms.cast.internal.ICastDeviceController";
  }
  
  protected final Bundle e()
  {
    Bundle localBundle = new Bundle();
    j.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] { this.u, this.v });
    localBundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this.k);
    localBundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.m);
    this.n = new buh(this);
    localBundle.putParcelable("listener", new BinderWrapper(this.n.asBinder()));
    if (this.u != null)
    {
      localBundle.putString("last_application_id", this.u);
      if (this.v != null) {
        localBundle.putString("last_session_id", this.v);
      }
    }
    return localBundle;
  }
  
  public void f()
  {
    if ((this.r) && (this.n != null)) {
      if (this.n.a.get() != null) {
        break label44;
      }
    }
    label44:
    for (int i = 1; i != 0; i = 0) {
      throw new IllegalStateException("Not connected to a device");
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
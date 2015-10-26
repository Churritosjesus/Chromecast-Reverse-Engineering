import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

final class buh
  extends bus
{
  final AtomicReference a;
  private final Handler b;
  
  public buh(bue parambue)
  {
    this.a = new AtomicReference(parambue);
    this.b = new Handler(parambue.h);
  }
  
  private static void a(bue parambue, long paramLong, int paramInt)
  {
    synchronized (bue.g(parambue))
    {
      parambue = (bwq)bue.g(parambue).remove(Long.valueOf(paramLong));
      if (parambue != null) {
        parambue.a(new Status(paramInt));
      }
      return;
    }
  }
  
  private static boolean a(bue parambue, int paramInt)
  {
    synchronized ()
    {
      if (bue.h(parambue) != null)
      {
        bwq localbwq = bue.h(parambue);
        Status localStatus = new com/google/android/gms/common/api/Status;
        localStatus.<init>(paramInt);
        localbwq.a(localStatus);
        bue.b(parambue, null);
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
  
  public final bue a()
  {
    bue localbue = (bue)this.a.getAndSet(null);
    if (localbue == null) {
      localbue = null;
    }
    for (;;)
    {
      return localbue;
      bue.b(localbue);
    }
  }
  
  public final void a(int paramInt)
  {
    bue localbue = a();
    if (localbue == null) {}
    for (;;)
    {
      return;
      bue.g().b("ICastDeviceControllerListener.onDisconnected: %d", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt != 0) {
        localbue.a(2);
      }
    }
  }
  
  public final void a(long paramLong)
  {
    bue localbue = (bue)this.a.get();
    if (localbue == null) {}
    for (;;)
    {
      return;
      a(localbue, paramLong, 0);
    }
  }
  
  public final void a(long paramLong, int paramInt)
  {
    bue localbue = (bue)this.a.get();
    if (localbue == null) {}
    for (;;)
    {
      return;
      a(localbue, paramLong, paramInt);
    }
  }
  
  public final void a(ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
  {
    bue localbue = (bue)this.a.get();
    if (localbue == null) {}
    for (;;)
    {
      return;
      bue.a(localbue, paramApplicationMetadata);
      bue.a(localbue, paramApplicationMetadata.b);
      bue.b(localbue, paramString2);
      synchronized (bue.h())
      {
        if (bue.c(localbue) != null)
        {
          bwq localbwq = bue.c(localbue);
          buf localbuf = new buf;
          Status localStatus = new com/google/android/gms/common/api/Status;
          localStatus.<init>(0);
          localbuf.<init>(localStatus, paramApplicationMetadata, paramString1, paramString2, paramBoolean);
          localbwq.a(localbuf);
          bue.a(localbue, null);
        }
      }
    }
  }
  
  public final void a(ApplicationStatus paramApplicationStatus)
  {
    bue localbue = (bue)this.a.get();
    if (localbue == null) {}
    for (;;)
    {
      return;
      bue.g().b("onApplicationStatusChanged", new Object[0]);
      this.b.post(new buk(this, localbue, paramApplicationStatus));
    }
  }
  
  public final void a(DeviceStatus paramDeviceStatus)
  {
    bue localbue = (bue)this.a.get();
    if (localbue == null) {}
    for (;;)
    {
      return;
      bue.g().b("onDeviceStatusChanged", new Object[0]);
      this.b.post(new buj(this, localbue, paramDeviceStatus));
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    bue localbue = (bue)this.a.get();
    if (localbue == null) {}
    for (;;)
    {
      return;
      bue.g().b("Receive (type=text, ns=%s) %s", new Object[] { paramString1, paramString2 });
      this.b.post(new bul(this, localbue, paramString1, paramString2));
    }
  }
  
  public final void a(String paramString, byte[] paramArrayOfByte)
  {
    if ((bue)this.a.get() == null) {}
    for (;;)
    {
      return;
      bue.g().b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] { paramString, Integer.valueOf(paramArrayOfByte.length) });
    }
  }
  
  public final void b()
  {
    bue.g().b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
  }
  
  public final void b(int paramInt)
  {
    bue localbue = (bue)this.a.get();
    if (localbue == null) {}
    for (;;)
    {
      return;
      synchronized (bue.h())
      {
        if (bue.c(localbue) != null)
        {
          bwq localbwq = bue.c(localbue);
          buf localbuf = new buf;
          Status localStatus = new com/google/android/gms/common/api/Status;
          localStatus.<init>(paramInt);
          localbuf.<init>(localStatus);
          localbwq.a(localbuf);
          bue.a(localbue, null);
        }
      }
    }
  }
  
  public final void c(int paramInt)
  {
    bue localbue = (bue)this.a.get();
    if (localbue == null) {}
    for (;;)
    {
      return;
      a(localbue, paramInt);
    }
  }
  
  public final void d(int paramInt)
  {
    bue localbue = (bue)this.a.get();
    if (localbue == null) {}
    for (;;)
    {
      return;
      a(localbue, paramInt);
    }
  }
  
  public final void e(int paramInt)
  {
    bue localbue = (bue)this.a.get();
    if (localbue == null) {}
    for (;;)
    {
      return;
      bue.a(localbue, null);
      bue.b(localbue, null);
      a(localbue, paramInt);
      if (bue.d(localbue) != null) {
        this.b.post(new bui(this, localbue, paramInt));
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\buh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
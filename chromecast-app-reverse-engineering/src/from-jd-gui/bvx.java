import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public abstract class bvx
  implements bwj
{
  private bvy a;
  public final Object b = new Object();
  public final ArrayList c = new ArrayList();
  public volatile bwm d;
  public volatile boolean e;
  private final CountDownLatch f = new CountDownLatch(1);
  private bwn g;
  private boolean h;
  private boolean i;
  private bye j;
  
  public bvx(Looper paramLooper)
  {
    this.a = new bvy(paramLooper);
  }
  
  static void b(bwm parambwm)
  {
    if ((parambwm instanceof bwl)) {}
    try
    {
      ((bwl)parambwm).a();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        Log.w("AbstractPendingResult", "Unable to release " + parambwm, localRuntimeException);
      }
    }
  }
  
  private void c(bwm parambwm)
  {
    this.d = parambwm;
    this.j = null;
    this.f.countDown();
    parambwm = this.d;
    if (this.g != null)
    {
      this.a.removeMessages(2);
      if (!this.h) {
        this.a.a(this.g, f());
      }
    }
    parambwm = this.c.iterator();
    while (parambwm.hasNext()) {
      ((bwk)parambwm.next()).a();
    }
    this.c.clear();
  }
  
  private bwm f()
  {
    boolean bool = true;
    synchronized (this.b)
    {
      if (!this.e)
      {
        a.a(bool, "Result has already been consumed.");
        a.a(a(), "Result is not ready.");
        bwm localbwm = this.d;
        this.d = null;
        this.g = null;
        this.e = true;
        d();
        return localbwm;
      }
      bool = false;
    }
  }
  
  public abstract bwm a(Status paramStatus);
  
  public final void a(bwk parambwk)
  {
    boolean bool;
    if (!this.e) {
      bool = true;
    }
    for (;;)
    {
      a.a(bool, "Result has already been consumed.");
      synchronized (this.b)
      {
        if (a())
        {
          bwm localbwm = this.d;
          parambwk.a();
          return;
          bool = false;
          continue;
        }
        this.c.add(parambwk);
      }
    }
  }
  
  public final void a(bwm parambwm)
  {
    boolean bool2 = true;
    for (;;)
    {
      synchronized (this.b)
      {
        if ((this.i) || (this.h))
        {
          b(parambwm);
          return;
        }
        if (!a())
        {
          bool1 = true;
          a.a(bool1, "Results have already been set");
          if (this.e) {
            break label82;
          }
          bool1 = bool2;
          a.a(bool1, "Result has already been consumed");
          c(parambwm);
        }
      }
      boolean bool1 = false;
      continue;
      label82:
      bool1 = false;
    }
  }
  
  public final void a(bwn parambwn)
  {
    boolean bool;
    if (!this.e)
    {
      bool = true;
      a.a(bool, "Result has already been consumed.");
    }
    for (;;)
    {
      synchronized (this.b)
      {
        if (c())
        {
          return;
          bool = false;
          break;
        }
        if (a()) {
          this.a.a(parambwn, f());
        }
      }
      this.g = parambwn;
    }
  }
  
  public final void a(bye parambye)
  {
    synchronized (this.b)
    {
      this.j = parambye;
      return;
    }
  }
  
  public final boolean a()
  {
    if (this.f.getCount() == 0L) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void b()
  {
    for (;;)
    {
      synchronized (this.b)
      {
        if ((this.h) || (this.e)) {
          return;
        }
        bye localbye = this.j;
        if (localbye == null) {}
      }
      try
      {
        this.j.a();
        b(this.d);
        this.g = null;
        this.h = true;
        c(a(Status.d));
        continue;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  public final void c(Status paramStatus)
  {
    synchronized (this.b)
    {
      if (!a())
      {
        a(a(paramStatus));
        this.i = true;
      }
      return;
    }
  }
  
  public final boolean c()
  {
    synchronized (this.b)
    {
      boolean bool = this.h;
      return bool;
    }
  }
  
  protected void d() {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
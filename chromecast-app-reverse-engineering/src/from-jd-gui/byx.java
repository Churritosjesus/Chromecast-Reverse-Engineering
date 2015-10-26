import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class byx
  implements Handler.Callback
{
  final byy a;
  public final ArrayList b = new ArrayList();
  public final ArrayList c = new ArrayList();
  public final ArrayList d = new ArrayList();
  public volatile boolean e = false;
  public boolean f = false;
  public final Object g = new Object();
  private final AtomicInteger h = new AtomicInteger(0);
  private final Handler i;
  
  public byx(Looper paramLooper, byy parambyy)
  {
    this.a = parambyy;
    this.i = new Handler(paramLooper, this);
  }
  
  public final void a()
  {
    this.e = false;
    this.h.incrementAndGet();
  }
  
  public final void a(int paramInt)
  {
    this.i.removeMessages(1);
    synchronized (this.g)
    {
      this.f = true;
      Object localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(this.b);
      int j = this.h.get();
      Iterator localIterator = ((ArrayList)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (bwg)localIterator.next();
        if ((this.e) && (this.h.get() == j)) {
          if (this.b.contains(localObject2)) {
            ((bwg)localObject2).a(paramInt);
          }
        }
      }
    }
    this.c.clear();
    this.f = false;
  }
  
  public final void a(Bundle paramBundle)
  {
    boolean bool2 = true;
    for (;;)
    {
      synchronized (this.g)
      {
        if (!this.f)
        {
          bool1 = true;
          a.a(bool1);
          this.i.removeMessages(1);
          this.f = true;
          if (this.c.size() != 0) {
            break label168;
          }
          bool1 = bool2;
          a.a(bool1);
          Object localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>(this.b);
          int j = this.h.get();
          Iterator localIterator = ((ArrayList)localObject2).iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          localObject2 = (bwg)localIterator.next();
          if ((!this.e) || (!this.a.k()) || (this.h.get() != j)) {
            break;
          }
          if (this.c.contains(localObject2)) {
            continue;
          }
          ((bwg)localObject2).a(paramBundle);
        }
      }
      boolean bool1 = false;
      continue;
      label168:
      bool1 = false;
    }
    this.c.clear();
    this.f = false;
  }
  
  public final void a(bwg parambwg)
  {
    a.c(parambwg);
    synchronized (this.g)
    {
      if (this.b.contains(parambwg))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("registerConnectionCallbacks(): listener ");
        Log.w("GmsClientEvents", parambwg + " is already registered");
        if (this.a.k()) {
          this.i.sendMessage(this.i.obtainMessage(1, parambwg));
        }
        return;
      }
      this.b.add(parambwg);
    }
  }
  
  public final void a(bwh parambwh)
  {
    a.c(parambwh);
    synchronized (this.g)
    {
      if (this.d.contains(parambwh))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("registerConnectionFailedListener(): listener ");
        Log.w("GmsClientEvents", parambwh + " is already registered");
        return;
      }
      this.d.add(parambwh);
    }
  }
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    this.i.removeMessages(1);
    for (;;)
    {
      synchronized (this.g)
      {
        Object localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(this.d);
        int j = this.h.get();
        Iterator localIterator = ((ArrayList)localObject2).iterator();
        if (localIterator.hasNext())
        {
          localObject2 = (bwh)localIterator.next();
          if ((!this.e) || (this.h.get() != j)) {
            return;
          }
          if (!this.d.contains(localObject2)) {
            continue;
          }
          ((bwh)localObject2).a(paramConnectionResult);
        }
      }
    }
  }
  
  public final boolean handleMessage(Message arg1)
  {
    bwg localbwg;
    if (???.what == 1) {
      localbwg = (bwg)???.obj;
    }
    for (;;)
    {
      synchronized (this.g)
      {
        if ((this.e) && (this.a.k()) && (this.b.contains(localbwg))) {
          localbwg.a(this.a.b());
        }
        bool = true;
        return bool;
      }
      Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
      boolean bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
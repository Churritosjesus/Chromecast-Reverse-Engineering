import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class bwy
  implements bxj
{
  private final bwz a;
  
  public bwy(bwz parambwz)
  {
    this.a = parambwz;
  }
  
  public final bwp a(bwp parambwp)
  {
    this.a.f.add(parambwp);
    return parambwp;
  }
  
  public final void a()
  {
    Iterator localIterator = this.a.j.values().iterator();
    while (localIterator.hasNext()) {
      ((bwc)localIterator.next()).a();
    }
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == -1) {
      paramInt = 1;
    }
    while (paramInt != 0)
    {
      Iterator localIterator = this.a.f.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          ((bxi)localIterator.next()).b();
          continue;
          paramInt = 0;
          break;
        }
      }
      this.a.f.clear();
      this.a.f();
      this.a.k.clear();
    }
  }
  
  public final void a(Bundle paramBundle) {}
  
  public final void a(ConnectionResult paramConnectionResult, bvz parambvz, int paramInt) {}
  
  public final bwp b(bwp parambwp)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void b()
  {
    bwz localbwz = this.a;
    localbwz.a.lock();
    try
    {
      bws localbws = new bws;
      localbws.<init>(localbwz, localbwz.m, localbwz.n, localbwz.o, localbwz.a, localbwz.d);
      localbwz.p = localbws;
      localbwz.p.a();
      localbwz.b.signalAll();
      return;
    }
    finally
    {
      localbwz.a.unlock();
    }
  }
  
  public final String c()
  {
    return "DISCONNECTED";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bwy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
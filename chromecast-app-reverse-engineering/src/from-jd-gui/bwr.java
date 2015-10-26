import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class bwr
  implements bxj
{
  private final bwz a;
  
  public bwr(bwz parambwz)
  {
    this.a = parambwz;
  }
  
  private void a(bxi parambxi)
  {
    this.a.a(parambxi);
    bwc localbwc = this.a.a(parambxi.e());
    if ((!localbwc.k()) && (this.a.k.containsKey(parambxi.e()))) {
      parambxi.d(new Status(17));
    }
    for (;;)
    {
      return;
      parambxi.b(localbwc);
    }
  }
  
  public final bwp a(bwp parambwp)
  {
    return b(parambwp);
  }
  
  public final void a()
  {
    while (!this.a.f.isEmpty()) {
      try
      {
        a((bxi)this.a.f.remove());
      }
      catch (DeadObjectException localDeadObjectException)
      {
        Log.w("GoogleApiClientConnected", "Service died while flushing queue", localDeadObjectException);
      }
    }
  }
  
  public final void a(int paramInt)
  {
    int i;
    if (paramInt == -1)
    {
      i = 1;
      if (i == 0) {
        break label69;
      }
      this.a.f();
      this.a.k.clear();
    }
    for (;;)
    {
      this.a.a(null);
      if (i == 0) {
        this.a.c.a(paramInt);
      }
      this.a.c.a();
      return;
      i = 0;
      break;
      label69:
      Iterator localIterator = this.a.q.iterator();
      while (localIterator.hasNext()) {
        ((bxi)localIterator.next()).c(new Status(8, "The connection to Google Play services was lost"));
      }
    }
  }
  
  public final void a(Bundle paramBundle) {}
  
  public final void a(ConnectionResult paramConnectionResult, bvz parambvz, int paramInt) {}
  
  public final bwp b(bwp parambwp)
  {
    try
    {
      a(parambwp);
      return parambwp;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      for (;;)
      {
        a(1);
      }
    }
  }
  
  public final void b() {}
  
  public final String c()
  {
    return "CONNECTED";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bwr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
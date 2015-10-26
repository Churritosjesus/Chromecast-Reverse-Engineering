import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

public abstract class bwp
  extends bvx
  implements bwq, bxi
{
  private AtomicReference a = new AtomicReference();
  final bwe f;
  
  public bwp(bwe parambwe, GoogleApiClient paramGoogleApiClient)
  {
    super(((GoogleApiClient)a.f(paramGoogleApiClient, "GoogleApiClient must not be null")).a());
    this.f = ((bwe)a.c(parambwe));
  }
  
  private void a(RemoteException paramRemoteException)
  {
    d(new Status(8, paramRemoteException.getLocalizedMessage(), null));
  }
  
  public abstract void a(bwc parambwc);
  
  public final void a(bxg parambxg)
  {
    this.a.set(parambxg);
  }
  
  public final void b(bwc parambwc)
  {
    try
    {
      a(parambwc);
      return;
    }
    catch (DeadObjectException parambwc)
    {
      a(parambwc);
      throw parambwc;
    }
    catch (RemoteException parambwc)
    {
      for (;;)
      {
        a(parambwc);
      }
    }
  }
  
  protected final void d()
  {
    bxg localbxg = (bxg)this.a.getAndSet(null);
    if (localbxg != null) {
      localbxg.a(this);
    }
  }
  
  public final void d(Status paramStatus)
  {
    if (!paramStatus.a()) {}
    for (boolean bool = true;; bool = false)
    {
      a.b(bool, "Failed result must not be success");
      a(a(paramStatus));
      return;
    }
  }
  
  public final bwe e()
  {
    return this.f;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bwp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
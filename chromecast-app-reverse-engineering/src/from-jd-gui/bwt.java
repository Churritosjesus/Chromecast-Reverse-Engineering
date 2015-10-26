import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.lang.ref.WeakReference;

final class bwt
  extends csw
{
  private final WeakReference a;
  
  bwt(bws parambws)
  {
    this.a = new WeakReference(parambws);
  }
  
  public final void a(ConnectionResult paramConnectionResult, AuthAccountResult paramAuthAccountResult)
  {
    paramAuthAccountResult = (bws)this.a.get();
    if (paramAuthAccountResult == null) {}
    for (;;)
    {
      return;
      paramAuthAccountResult.a.h.post(new bwu(this, paramAuthAccountResult, paramConnectionResult));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bwt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
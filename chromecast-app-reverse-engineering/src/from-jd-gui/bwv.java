import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.lang.ref.WeakReference;

final class bwv
  extends bzp
{
  private final WeakReference a;
  
  bwv(bws parambws)
  {
    this.a = new WeakReference(parambws);
  }
  
  public final void a(ResolveAccountResponse paramResolveAccountResponse)
  {
    bws localbws = (bws)this.a.get();
    if (localbws == null) {}
    for (;;)
    {
      return;
      localbws.a.h.post(new bww(this, localbws, paramResolveAccountResponse));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bwv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
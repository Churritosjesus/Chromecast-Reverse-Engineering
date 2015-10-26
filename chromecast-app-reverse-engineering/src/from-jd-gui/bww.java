import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.util.concurrent.locks.Lock;

final class bww
  implements Runnable
{
  bww(bwv parambwv, bws parambws, ResolveAccountResponse paramResolveAccountResponse) {}
  
  public final void run()
  {
    bws localbws = this.a;
    ResolveAccountResponse localResolveAccountResponse = this.b;
    ConnectionResult localConnectionResult1 = localResolveAccountResponse.c;
    localbws.b.lock();
    for (;;)
    {
      try
      {
        boolean bool = localbws.b(0);
        if (!bool) {
          return;
        }
        if (localConnectionResult1.b())
        {
          localbws.g = bzg.a(localResolveAccountResponse.b);
          localbws.f = true;
          localbws.h = localResolveAccountResponse.d;
          localbws.i = localResolveAccountResponse.e;
          localbws.e();
          localbws.b.unlock();
        }
        else if (localbws.a(localConnectionResult1))
        {
          localbws.h();
          if (localbws.c == 0) {
            localbws.g();
          }
        }
        else
        {
          localbws.b(localConnectionResult2);
        }
      }
      finally
      {
        localbws.b.unlock();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bww.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class bwu
  implements Runnable
{
  bwu(bwt parambwt, bws parambws, ConnectionResult paramConnectionResult) {}
  
  public final void run()
  {
    bws localbws = this.a;
    ConnectionResult localConnectionResult1 = this.b;
    localbws.b.lock();
    for (;;)
    {
      try
      {
        boolean bool = localbws.b(2);
        if (!bool) {
          return;
        }
        if (localConnectionResult1.b())
        {
          localbws.g();
          localbws.b.unlock();
        }
        else if (localbws.a(localConnectionResult1))
        {
          localbws.h();
          localbws.g();
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


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bwu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.IOException;

final class aqm
  implements Runnable
{
  aqm(aqj paramaqj) {}
  
  public final void run()
  {
    aqj.h();
    aqj.b(this.a).g();
    try
    {
      bsr.b.a(this.a.a, aqj.c(this.a).c(), aqj.c(this.a));
      aqj.c(this.a).d = new aqn(this);
      aqj.c(this.a).e = new aqo(this);
      btl localbtl = aqj.c(this.a);
      GoogleApiClient localGoogleApiClient = this.a.a;
      localGoogleApiClient.b(new btn(localbtl, localGoogleApiClient, localGoogleApiClient));
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        aqj.h().a("Exception while creating media channel for %s: %s", new Object[] { aqj.b(this.a).g(), localIOException });
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
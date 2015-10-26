import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ckc
  implements bvm
{
  private static final Object a = new Object();
  private static final ckk b = new ckk();
  private static ExecutorService c;
  
  private final bwj a(GoogleApiClient paramGoogleApiClient, ckh paramckh)
  {
    synchronized (a)
    {
      if (c == null) {
        c = Executors.newSingleThreadExecutor();
      }
      c.execute(new ckd(this, paramGoogleApiClient, paramckh));
      return paramckh;
    }
  }
  
  public final bwj a(GoogleApiClient paramGoogleApiClient, LogEventParcelable paramLogEventParcelable)
  {
    b.a();
    paramLogEventParcelable = new cki(this, paramLogEventParcelable, paramGoogleApiClient);
    paramLogEventParcelable.a(new ckg(this));
    return a(paramGoogleApiClient, paramLogEventParcelable);
  }
  
  public final void a(GoogleApiClient paramGoogleApiClient)
  {
    cke localcke = new cke(this, paramGoogleApiClient, paramGoogleApiClient);
    synchronized (a)
    {
      if (c == null)
      {
        paramGoogleApiClient.a(localcke);
        return;
      }
      ExecutorService localExecutorService = c;
      ckf localckf = new ckf;
      localckf.<init>(this, paramGoogleApiClient, localcke);
      localExecutorService.execute(localckf);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ckc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
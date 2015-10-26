import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.Iterator;
import java.util.List;

final class aos
  implements Runnable
{
  public final void run()
  {
    aor.a();
    alm localalm = SetupApplication.a().b();
    synchronized (localalm.g)
    {
      Iterator localIterator = localalm.g.iterator();
      if (localIterator.hasNext())
      {
        aow localaow = (aow)localIterator.next();
        localalm.c.b(localaow);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
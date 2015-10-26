import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class aor
  implements Application.ActivityLifecycleCallbacks
{
  private static final blp a = new blp("SetupApplicationLifecycleHandler");
  private static final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();
  private static final Runnable g = new aos();
  private int b;
  private int c;
  private Future e;
  private final long f = blf.u(SetupApplication.a());
  private final Set h = new HashSet();
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity)
  {
    int i = this.c;
    paramActivity.getClass().getSimpleName();
    paramActivity = new aot(this);
    d.schedule(paramActivity, 2000L, TimeUnit.MILLISECONDS);
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    int i = this.c;
    paramActivity.getClass().getSimpleName();
    if (this.c == 0)
    {
      paramActivity = ape.a();
      paramActivity.g = paramActivity.a.nextInt();
      ape.a().b(108);
      if (this.e != null)
      {
        this.e.cancel(false);
        this.e = null;
      }
    }
    this.c += 1;
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    int i = this.b;
    paramActivity.getClass().getSimpleName();
    this.b += 1;
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    this.b -= 1;
    int i = this.b;
    paramActivity.getClass().getSimpleName();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
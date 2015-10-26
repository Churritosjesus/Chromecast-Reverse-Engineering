import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class aot
  implements Runnable
{
  aot(aor paramaor) {}
  
  public final void run()
  {
    aor.a(this.a);
    if (aor.b(this.a) == 0)
    {
      aor.a();
      ape.a().b(109);
      Object localObject2 = ape.a();
      Object localObject1 = ((ape)localObject2).e;
      localObject2 = ((ape)localObject2).d;
      ((bvh)localObject1).c.a((GoogleApiClient)localObject2);
      if (aor.c(this.a) != null) {
        aor.c(this.a).cancel(false);
      }
      aor.a(this.a, aor.c().schedule(aor.b(), aor.d(this.a), TimeUnit.MILLISECONDS));
      localObject1 = aor.e(this.a).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((Runnable)((Iterator)localObject1).next()).run();
      }
      aor.e(this.a).clear();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
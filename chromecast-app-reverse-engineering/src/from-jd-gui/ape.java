import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class ape
  implements bwg
{
  private static ape h = null;
  public final Random a = new Random();
  public Context b;
  public SharedPreferences c;
  public GoogleApiClient d;
  public bvh e;
  public boolean f = true;
  public int g;
  private final blp i = new blp("ClearcutAnalytics");
  private final Queue j = new ConcurrentLinkedQueue();
  
  public static ape a()
  {
    if (h == null) {
      h = new ape();
    }
    return h;
  }
  
  private void b()
  {
    for (;;)
    {
      Object localObject4;
      synchronized (this.j)
      {
        if (this.j.isEmpty()) {
          break;
        }
        localObject4 = this.e;
        localObject3 = new apf;
        ((apf)localObject3).<init>(this, (apd)this.j.poll());
        Object localObject1 = new bvj;
        ((bvj)localObject1).<init>((bvh)localObject4, (bvk)localObject3);
        localObject4 = this.d;
        if (((bvj)localObject1).g)
        {
          localObject1 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject1).<init>("do not reuse LogEventBuilder");
          throw ((Throwable)localObject1);
        }
      }
      ((bvj)localObject2).g = true;
      bvm localbvm = bvh.j(((bvj)localObject2).h);
      Object localObject3 = new com/google/android/gms/clearcut/LogEventParcelable;
      PlayLoggerContext localPlayLoggerContext = new com/google/android/gms/playlog/internal/PlayLoggerContext;
      localPlayLoggerContext.<init>(bvh.h(((bvj)localObject2).h), bvh.i(((bvj)localObject2).h), ((bvj)localObject2).a, ((bvj)localObject2).b, ((bvj)localObject2).c, ((bvj)localObject2).d, bvh.g(((bvj)localObject2).h));
      ((LogEventParcelable)localObject3).<init>(localPlayLoggerContext, ((bvj)localObject2).f, ((bvj)localObject2).e);
      localbvm.a((GoogleApiClient)localObject4, (LogEventParcelable)localObject3);
    }
  }
  
  public final int a(String paramString)
  {
    int k = this.a.nextInt();
    apg localapg = new apg();
    localapg.a = 111;
    localapg.e = paramString;
    a(localapg.c(k).a());
    return k;
  }
  
  public final void a(int paramInt) {}
  
  public final void a(int paramInt, Integer paramInteger)
  {
    a(new apd(15, paramInteger));
  }
  
  public final void a(int paramInt, Integer paramInteger, Long paramLong)
  {
    paramInteger = new apd(paramInt, paramInteger);
    paramInteger.b(SystemClock.elapsedRealtime() - paramLong.longValue());
    a(paramInteger);
  }
  
  public final void a(Bundle paramBundle)
  {
    b();
  }
  
  public final void a(apd paramapd)
  {
    if (paramapd.c == null) {
      paramapd.c = Long.valueOf(SystemClock.elapsedRealtime() - paramapd.b);
    }
    paramapd.i = Integer.valueOf(a().g);
    if (!this.f) {}
    for (;;)
    {
      return;
      synchronized (this.j)
      {
        this.j.add(paramapd);
        if (!this.d.d()) {
          this.d.b();
        }
      }
      b();
    }
  }
  
  public final void b(int paramInt)
  {
    a(new apd(paramInt));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
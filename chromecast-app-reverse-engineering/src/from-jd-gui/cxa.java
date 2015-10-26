import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class cxa
  implements ctu
{
  final String a;
  final Context b;
  private final ScheduledExecutorService c;
  private final cxd d;
  private ScheduledFuture e;
  private boolean f;
  private czb g;
  private String h;
  private cwb i;
  
  public cxa(Context paramContext, String paramString, czb paramczb)
  {
    this(paramContext, paramString, paramczb, null, null);
  }
  
  private cxa(Context paramContext, String paramString, czb paramczb, cxe paramcxe, cxd paramcxd)
  {
    this.g = paramczb;
    this.b = paramContext;
    this.a = paramString;
    this.c = new cxb(this).a();
    this.d = new cxc(this);
  }
  
  private void b()
  {
    try
    {
      if (this.f)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("called method after closed");
        throw localIllegalStateException;
      }
    }
    finally {}
  }
  
  public final void a()
  {
    try
    {
      b();
      if (this.e != null) {
        this.e.cancel(false);
      }
      this.c.shutdown();
      this.f = true;
      return;
    }
    finally {}
  }
  
  public final void a(long paramLong, String paramString)
  {
    try
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("loadAfterDelay: containerId=");
      cuh.e(this.a + " delay=" + paramLong);
      b();
      if (this.i == null)
      {
        paramString = new java/lang/IllegalStateException;
        paramString.<init>("callback must be set before loadAfterDelay() is called.");
        throw paramString;
      }
    }
    finally {}
    if (this.e != null) {
      this.e.cancel(false);
    }
    ScheduledExecutorService localScheduledExecutorService = this.c;
    Object localObject1 = this.d.a(this.g);
    ((cwz)localObject1).b = this.i;
    Object localObject2 = this.h;
    if (localObject2 == null) {}
    for (((cwz)localObject1).c = ((cwz)localObject1).a;; ((cwz)localObject1).c = ((String)localObject2))
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Setting previous container version: ");
      cuh.d(paramString);
      ((cwz)localObject1).d = paramString;
      this.e = localScheduledExecutorService.schedule((Runnable)localObject1, paramLong, TimeUnit.MILLISECONDS);
      return;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("Setting CTFE URL path: ");
      cuh.d((String)localObject2);
    }
  }
  
  public final void a(cwb paramcwb)
  {
    try
    {
      b();
      this.i = paramcwb;
      return;
    }
    finally
    {
      paramcwb = finally;
      throw paramcwb;
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      b();
      this.h = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
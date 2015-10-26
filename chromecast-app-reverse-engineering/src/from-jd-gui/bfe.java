import android.os.AsyncTask;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

public final class bfe
  extends AsyncTask
{
  private static final Object[] b = new Void[0];
  public bff a;
  private bfd[] c;
  private bfd d;
  private final blp e;
  
  public bfe(bfd... paramVarArgs)
  {
    this.c = paramVarArgs;
    this.e = new blp("NetworkTask", false);
  }
  
  public final void a()
  {
    if (Build.VERSION.SDK_INT >= 11) {}
    try
    {
      getClass().getMethod("executeOnExecutor", new Class[] { Executor.class, Object[].class }).invoke(this, new Object[] { THREAD_POOL_EXECUTOR, b });
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        this.e.b(localNoSuchMethodException, "reflection failed", new Object[0]);
        super.execute(new Void[0]);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        this.e.b(localIllegalAccessException, "reflection failed", new Object[0]);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        this.e.b(localIllegalArgumentException, "reflection failed", new Object[0]);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        this.e.b(localInvocationTargetException, "reflection failed", new Object[0]);
      }
    }
  }
  
  public final void b()
  {
    bfd localbfd;
    if (this.d != null) {
      localbfd = this.d;
    }
    synchronized (localbfd.e)
    {
      localbfd.f = true;
      if (localbfd.d != null) {
        localbfd.d.a();
      }
      super.cancel(true);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
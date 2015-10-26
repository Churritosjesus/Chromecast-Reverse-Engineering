import android.os.AsyncTask;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.concurrent.Executor;

public class agl
  extends AsyncTask
{
  private static final String a = agl.class.getCanonicalName();
  private static Method b;
  private final HttpURLConnection c;
  private final agm d;
  private Exception e;
  
  static
  {
    Method[] arrayOfMethod = AsyncTask.class.getMethods();
    int j = arrayOfMethod.length;
    for (int i = 0;; i++) {
      if (i < j)
      {
        Method localMethod = arrayOfMethod[i];
        if ("executeOnExecutor".equals(localMethod.getName()))
        {
          Class[] arrayOfClass = localMethod.getParameterTypes();
          if ((arrayOfClass.length == 2) && (arrayOfClass[0] == Executor.class) && (arrayOfClass[1].isArray())) {
            b = localMethod;
          }
        }
      }
      else
      {
        return;
      }
    }
  }
  
  public agl(agm paramagm)
  {
    this(null, paramagm);
  }
  
  private agl(HttpURLConnection paramHttpURLConnection, agm paramagm)
  {
    this.d = paramagm;
    this.c = null;
  }
  
  private List b()
  {
    try
    {
      if (this.c == null) {}
      for (List localList = aga.a(this.d);; localList = aga.a(this.c, this.d)) {
        return localList;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.e = localException;
        Object localObject = null;
      }
    }
  }
  
  final agl a()
  {
    if (b != null) {}
    try
    {
      b.invoke(this, new Object[] { afv.d(), null });
      for (;;)
      {
        return this;
        execute(new Void[0]);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (this.d.a == null) {
      this.d.a = new Handler();
    }
  }
  
  public String toString()
  {
    return "{RequestAsyncTask: " + " connection: " + this.c + ", requests: " + this.d + "}";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
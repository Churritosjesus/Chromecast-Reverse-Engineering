import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class afv
{
  private static final HashSet a = new HashSet(Arrays.asList(new ags[] { ags.f }));
  private static volatile Executor b;
  private static volatile String c;
  private static volatile String d;
  private static volatile String e;
  private static volatile int f;
  private static volatile String g = "facebook.com";
  private static AtomicLong h = new AtomicLong(65536L);
  private static volatile boolean i = true;
  private static boolean j = false;
  private static Context k;
  private static int l = 64206;
  private static final Object m = new Object();
  private static final BlockingQueue n = new LinkedBlockingQueue(10);
  private static final ThreadFactory o = new afw();
  private static Boolean p = Boolean.valueOf(false);
  
  static
  {
    afv.class.getCanonicalName();
  }
  
  public static void a(Context paramContext)
  {
    try
    {
      a(paramContext, null);
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  private static void a(Context paramContext, s params)
  {
    for (;;)
    {
      try
      {
        boolean bool = p.booleanValue();
        if (bool) {
          return;
        }
        ajp.a(paramContext, "applicationContext");
        ajp.b(paramContext, false);
        ajp.a(paramContext, false);
        paramContext = paramContext.getApplicationContext();
        k = paramContext;
        if (paramContext == null) {}
      }
      finally {}
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        if (paramContext != null) {
          if (paramContext.metaData != null) {
            break;
          }
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        continue;
      }
      aji.a(k, c);
      aix.b();
      aia.a(k);
      k.getCacheDir();
      params = new java/util/concurrent/FutureTask;
      paramContext = new afx;
      paramContext.<init>(null);
      params.<init>(paramContext);
      d().execute(params);
      p = Boolean.valueOf(true);
    }
    if (c == null)
    {
      params = paramContext.metaData.get("com.facebook.sdk.ApplicationId");
      if (!(params instanceof String)) {
        break label229;
      }
      c = (String)params;
    }
    for (;;)
    {
      if (d == null) {
        d = paramContext.metaData.getString("com.facebook.sdk.ApplicationName");
      }
      if (e == null) {
        e = paramContext.metaData.getString("com.facebook.sdk.ClientToken");
      }
      if (f != 0) {
        break;
      }
      f = paramContext.metaData.getInt("com.facebook.sdk.WebDialogTheme");
      break;
      label229:
      if ((params instanceof Integer)) {
        c = params.toString();
      }
    }
  }
  
  public static boolean a()
  {
    try
    {
      boolean bool = p.booleanValue();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean a(ags paramags)
  {
    synchronized (a)
    {
      if ((i) && (a.contains(paramags)))
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
  
  public static boolean b()
  {
    return i;
  }
  
  public static boolean b(Context paramContext)
  {
    ajp.b();
    return paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
  }
  
  public static boolean c()
  {
    return false;
  }
  
  public static Executor d()
  {
    synchronized (m)
    {
      if (b == null)
      {
        Executor localExecutor = l();
        Object localObject1 = localExecutor;
        if (localExecutor == null)
        {
          localObject1 = new java/util/concurrent/ThreadPoolExecutor;
          ((ThreadPoolExecutor)localObject1).<init>(5, 128, 1L, TimeUnit.SECONDS, n, o);
        }
        b = (Executor)localObject1;
      }
      return b;
    }
  }
  
  public static String e()
  {
    return g;
  }
  
  public static Context f()
  {
    ajp.b();
    return k;
  }
  
  public static long g()
  {
    ajp.b();
    return h.get();
  }
  
  public static String h()
  {
    ajp.b();
    return c;
  }
  
  public static String i()
  {
    ajp.b();
    return e;
  }
  
  public static int j()
  {
    ajp.b();
    return f;
  }
  
  public static int k()
  {
    ajp.b();
    return l;
  }
  
  private static Executor l()
  {
    try
    {
      localObject1 = AsyncTask.class.getField("THREAD_POOL_EXECUTOR");
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        Object localObject1;
        label22:
        Object localObject2 = null;
      }
    }
    try
    {
      localObject1 = ((Field)localObject1).get(null);
      if (localObject1 != null) {
        break label36;
      }
      localObject1 = null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Executor localExecutor = null;
      break label22;
      if ((localExecutor instanceof Executor)) {
        break label48;
      }
      localExecutor = null;
      break label22;
      localExecutor = (Executor)localExecutor;
      break label22;
    }
    return (Executor)localObject1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\afv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
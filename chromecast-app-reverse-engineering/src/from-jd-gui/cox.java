import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class cox
{
  private static volatile cox d;
  public final Context a;
  public final coz b;
  public Thread.UncaughtExceptionHandler c;
  private final List e;
  private volatile cpe f;
  
  private cox(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    a.c(paramContext);
    this.a = paramContext;
    this.b = new coz(this);
    this.e = new CopyOnWriteArrayList();
    new cos();
  }
  
  public static cox a(Context paramContext)
  {
    a.c(paramContext);
    if (d == null) {}
    try
    {
      if (d == null)
      {
        cox localcox = new cox;
        localcox.<init>(paramContext);
        d = localcox;
      }
      return d;
    }
    finally {}
  }
  
  public static void b()
  {
    if (!(Thread.currentThread() instanceof cpc)) {
      throw new IllegalStateException("Call expected from worker thread");
    }
  }
  
  public final cpe a()
  {
    if (this.f == null) {}
    Object localObject5;
    Object localObject3;
    try
    {
      cpe localcpe;
      PackageManager localPackageManager;
      String str2;
      if (this.f == null)
      {
        localcpe = new cpe;
        localcpe.<init>();
        localPackageManager = this.a.getPackageManager();
        str2 = this.a.getPackageName();
        localcpe.c = str2;
        localcpe.d = localPackageManager.getInstallerPackageName(str2);
        localObject5 = null;
        localObject3 = str2;
      }
      try
      {
        PackageInfo localPackageInfo = localPackageManager.getPackageInfo(this.a.getPackageName(), 0);
        localObject4 = localObject5;
        str1 = str2;
        if (localPackageInfo != null)
        {
          localObject3 = str2;
          localObject4 = localPackageManager.getApplicationLabel(localPackageInfo.applicationInfo);
          str1 = str2;
          localObject3 = str2;
          if (!TextUtils.isEmpty((CharSequence)localObject4))
          {
            localObject3 = str2;
            str1 = ((CharSequence)localObject4).toString();
          }
          localObject3 = str1;
          localObject4 = localPackageInfo.versionName;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;)
        {
          String str1;
          Object localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("Error retrieving package info: appName set to ");
          Log.e("GAv4", (String)localObject3);
          Object localObject4 = localObject5;
          localObject1 = localObject3;
        }
      }
      localcpe.a = str1;
      localcpe.b = ((String)localObject4);
      this.f = localcpe;
      return this.f;
    }
    finally {}
  }
  
  public final Future a(Callable paramCallable)
  {
    a.c(paramCallable);
    if ((Thread.currentThread() instanceof cpc))
    {
      paramCallable = new FutureTask(paramCallable);
      paramCallable.run();
    }
    for (;;)
    {
      return paramCallable;
      paramCallable = this.b.submit(paramCallable);
    }
  }
  
  public final void a(Runnable paramRunnable)
  {
    a.c(paramRunnable);
    this.b.submit(paramRunnable);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
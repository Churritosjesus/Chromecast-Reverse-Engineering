import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public final class bpe
  extends BroadcastReceiver
{
  static Object a = new Object();
  static PowerManager.WakeLock b;
  private static Boolean c;
  
  public static boolean a(Context paramContext)
  {
    a.c(paramContext);
    boolean bool;
    if (c != null) {
      bool = c.booleanValue();
    }
    for (;;)
    {
      return bool;
      bool = bqs.a(paramContext, bpe.class, false);
      c = Boolean.valueOf(bool);
    }
  }
  
  public final void onReceive(Context paramContext, Intent arg2)
  {
    localbql = brb.a(paramContext).a();
    ??? = ???.getAction();
    if (byk.a) {
      localbql.a("Device AnalyticsReceiver got", ???);
    }
    for (;;)
    {
      boolean bool;
      Intent localIntent;
      if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(???))
      {
        bool = bpf.a(paramContext);
        localIntent = new Intent(paramContext, bpf.class);
        localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      }
      synchronized (a)
      {
        paramContext.startService(localIntent);
        if (!bool)
        {
          return;
          localbql.a("Local AnalyticsReceiver got", ???);
          continue;
        }
        try
        {
          paramContext = (PowerManager)paramContext.getSystemService("power");
          if (b == null)
          {
            paramContext = paramContext.newWakeLock(1, "Analytics WakeLock");
            b = paramContext;
            paramContext.setReferenceCounted(false);
          }
          b.acquire(1000L);
        }
        catch (SecurityException paramContext)
        {
          for (;;)
          {
            localbql.e("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          }
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
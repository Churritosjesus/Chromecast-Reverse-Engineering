import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;

public class bpj
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
      bool = bqs.a(paramContext, bpj.class, true);
      c = Boolean.valueOf(bool);
    }
  }
  
  public void onReceive(Context paramContext, Intent arg2)
  {
    localbql = brb.a(paramContext).a();
    String str = ???.getStringExtra("referrer");
    ??? = ???.getAction();
    localbql.a("CampaignTrackingReceiver received", ???);
    if ((!"com.android.vending.INSTALL_REFERRER".equals(???)) || (TextUtils.isEmpty(str))) {
      localbql.e("CampaignTrackingReceiver received unexpected intent without referrer extra");
    }
    for (;;)
    {
      return;
      boolean bool = bpk.a(paramContext);
      if (!bool) {
        localbql.e("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
      }
      if (byk.a)
      {
        localbql.f("Received unexpected installation campaign on package side");
      }
      else
      {
        a.c(bpk.class);
        Intent localIntent = new Intent(paramContext, bpk.class);
        localIntent.putExtra("referrer", str);
        synchronized (a)
        {
          paramContext.startService(localIntent);
          if (bool) {}
        }
      }
      try
      {
        paramContext = (PowerManager)paramContext.getSystemService("power");
        if (b == null)
        {
          paramContext = paramContext.newWakeLock(1, "Analytics campaign WakeLock");
          b = paramContext;
          paramContext.setReferenceCounted(false);
        }
        b.acquire(1000L);
      }
      catch (SecurityException paramContext)
      {
        for (;;)
        {
          localbql.e("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
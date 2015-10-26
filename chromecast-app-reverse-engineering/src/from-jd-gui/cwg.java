import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

class cwg
  extends BroadcastReceiver
{
  private static String a = cwg.class.getName();
  private final cxt b;
  
  cwg(cxt paramcxt)
  {
    this.b = paramcxt;
  }
  
  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent("com.google.analytics.RADIO_POWERED");
    localIntent.addCategory(paramContext.getPackageName());
    localIntent.putExtra(a, true);
    paramContext.sendBroadcast(localIntent);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    boolean bool;
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      Bundle localBundle = paramIntent.getExtras();
      paramContext = Boolean.FALSE;
      if (localBundle != null) {
        paramContext = Boolean.valueOf(paramIntent.getExtras().getBoolean("noConnectivity"));
      }
      paramIntent = this.b;
      if (!paramContext.booleanValue())
      {
        bool = true;
        paramIntent.a(bool);
      }
    }
    for (;;)
    {
      return;
      bool = false;
      break;
      if (("com.google.analytics.RADIO_POWERED".equals(paramContext)) && (!paramIntent.hasExtra(a))) {
        this.b.d();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cwg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
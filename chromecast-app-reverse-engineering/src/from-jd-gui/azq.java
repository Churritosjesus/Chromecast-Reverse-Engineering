import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class azq
  extends BroadcastReceiver
{
  azq(azm paramazm) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = azm.f(this.a).getActiveNetworkInfo();
    int i;
    if ((paramContext != null) && (paramContext.isConnected()))
    {
      i = 1;
      azm.b(this.a);
      azm.g(this.a);
      if (i == 0) {
        azm.a(this.a, null);
      }
      azm.h(this.a);
      if (i == 0) {
        break label85;
      }
      azm.b(this.a);
      this.a.a();
    }
    for (;;)
    {
      return;
      i = 0;
      break;
      label85:
      if (!azm.g(this.a))
      {
        azm.b(this.a);
        azm.i(this.a);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\azq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
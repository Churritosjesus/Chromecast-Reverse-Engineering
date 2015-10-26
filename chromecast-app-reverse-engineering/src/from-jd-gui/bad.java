import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;

final class bad
  extends BroadcastReceiver
{
  bad(bab parambab, String paramString, boolean paramBoolean) {}
  
  @TargetApi(14)
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    int j = 0;
    int i = 0;
    if (!this.c.c) {}
    for (;;)
    {
      return;
      boolean bool1 = this.c.e;
      this.c.e = false;
      this.c.g.b.removeCallbacks(this.c.b);
      this.c.g.b.postDelayed(this.c.b, this.c.g.e);
      paramContext = (NetworkInfo)paramIntent.getParcelableExtra("networkInfo");
      Object localObject1 = paramContext.getState();
      Object localObject2 = paramContext.getDetailedState();
      if (Build.VERSION.SDK_INT < 14) {
        paramContext = this.c.g.c.getConnectionInfo();
      }
      boolean bool2;
      for (;;)
      {
        ((NetworkInfo.State)localObject1).toString();
        ((NetworkInfo.DetailedState)localObject2).toString();
        blr.a(paramContext);
        bool2 = azv.a(this.a, paramContext);
        if (localObject2 != NetworkInfo.DetailedState.FAILED) {
          break label199;
        }
        this.c.a();
        azv.a(this.c.a, false);
        break;
        paramContext = (WifiInfo)paramIntent.getParcelableExtra("wifiInfo");
        bool1 = false;
      }
      label199:
      switch (azz.b[localObject1.ordinal()])
      {
      default: 
        this.c.f = false;
        break;
      case 1: 
        if (!bool1)
        {
          if (bool2)
          {
            if ((azv.c()) && (this.b) && (this.c.g.g == null))
            {
              paramIntent = this.c.g;
              localObject1 = this.a;
              localObject2 = paramIntent.d.getAllNetworks();
              j = localObject2.length;
              if (i >= j) {
                break label425;
              }
              paramContext = localObject2[i];
              if (!blr.a((String)localObject1, paramIntent.d.getNetworkInfo(paramContext).getExtraInfo())) {
                break label419;
              }
            }
            for (;;)
            {
              if (paramContext != null) {
                azv.a(this.c.g, paramContext, this.a);
              }
              this.c.a();
              if (this.c.g.k.a) {
                blr.d(this.c.g.a);
              }
              this.c.g.i = SystemClock.elapsedRealtime();
              azv.a(this.c.a);
              break;
              i++;
              break label306;
              paramContext = null;
            }
          }
          if (!this.c.f)
          {
            this.c.a();
            blr.a(paramContext);
            paramContext = this.a;
            azv.a(this.c.a, false);
          }
        }
        break;
      case 2: 
        this.c.f = false;
        if (bool2) {
          this.c.d = ((NetworkInfo.DetailedState)localObject2);
        }
        break;
      case 3: 
        label306:
        label419:
        label425:
        this.c.f = false;
        if (this.c.d != null)
        {
          i = j;
          if (Build.VERSION.SDK_INT >= 16)
          {
            i = j;
            if (this.c.d == NetworkInfo.DetailedState.VERIFYING_POOR_LINK) {
              i = 1;
            }
          }
          if (i != 0)
          {
            this.c.a();
            azv.a(this.c.a, true);
          }
        }
        break;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.google.android.apps.chromecast.app.MainActivity;

public final class amx
  extends BroadcastReceiver
{
  public amx(MainActivity paramMainActivity) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent = ((NetworkInfo)paramIntent.getParcelableExtra("networkInfo")).getState();
    paramContext = blr.c(this.a);
    paramIntent.toString();
    MainActivity.e(this.a).a(paramContext);
    MainActivity.f(this.a).a(paramContext);
    switch (amp.a[paramIntent.ordinal()])
    {
    default: 
      MainActivity.a(this.a, false);
    }
    for (;;)
    {
      MainActivity.i(this.a);
      return;
      if (!MainActivity.g(this.a))
      {
        paramContext = MainActivity.h(this.a);
        paramContext.c = false;
        paramContext.a(false);
        paramContext.b = true;
        paramContext.p();
      }
      MainActivity.a(this.a, true);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\amx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
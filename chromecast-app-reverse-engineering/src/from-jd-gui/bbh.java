import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.chromecast.app.mirror.CastScreenActivity;

public final class bbh
  extends BroadcastReceiver
{
  public bbh(CastScreenActivity paramCastScreenActivity) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getIntExtra("wifi_state", 4) == 3)
    {
      this.a.unregisterReceiver(this);
      if ((CastScreenActivity.d(this.a).a()) && (!CastScreenActivity.d(this.a).b()) && (CastScreenActivity.g(this.a)))
      {
        CastScreenActivity.b(this.a, false);
        CastScreenActivity.h(this.a);
        CastScreenActivity.a(this.a, false);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
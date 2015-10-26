import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.WifiManager;

public final class bae
{
  final Context a;
  bag b;
  final WifiManager c;
  final BroadcastReceiver d;
  
  public bae(Context paramContext)
  {
    this.a = paramContext;
    this.c = ((WifiManager)this.a.getSystemService("wifi"));
    this.d = new baf(this, this.a.getResources().getStringArray(a.dh));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
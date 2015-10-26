import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkInfo;

final class azy
  extends ConnectivityManager.NetworkCallback
{
  azy(azv paramazv, String paramString) {}
  
  public final void onAvailable(Network paramNetwork)
  {
    Object localObject = this.b.d.getNetworkInfo(paramNetwork);
    String str = ((NetworkInfo)localObject).getExtraInfo();
    ((NetworkInfo)localObject).getTypeName();
    localObject = this.a;
    if ((this.b.g == null) && (blr.a(this.a, str))) {
      azv.a(this.b, paramNetwork, this.a);
    }
  }
  
  public final void onLost(Network paramNetwork)
  {
    paramNetwork = this.b.d.getNetworkInfo(paramNetwork);
    if (paramNetwork != null) {
      if (blr.a(paramNetwork.getExtraInfo(), this.a)) {
        paramNetwork = this.a;
      }
    }
    for (;;)
    {
      if (this.b.g != null) {
        this.b.d();
      }
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\azy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
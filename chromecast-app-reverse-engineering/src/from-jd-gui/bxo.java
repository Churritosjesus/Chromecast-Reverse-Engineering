import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

final class bxo
  implements bwh
{
  public final int a;
  public final GoogleApiClient b;
  public final bwh c;
  
  public bxo(bxn parambxn, int paramInt, GoogleApiClient paramGoogleApiClient, bwh parambwh)
  {
    this.a = paramInt;
    this.b = paramGoogleApiClient;
    this.c = parambwh;
    paramGoogleApiClient.a(this);
  }
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    bxn.d(this.d).post(new bxp(this.d, this.a, paramConnectionResult));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
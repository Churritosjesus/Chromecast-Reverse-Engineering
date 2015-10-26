import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;

public class bvf
{
  public bwj a(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new cji(this, paramGoogleApiClient));
  }
  
  public void a(GoogleApiClient paramGoogleApiClient, bve parambve)
  {
    paramGoogleApiClient.b(new cjh(this, paramGoogleApiClient, parambve));
  }
  
  public bwj b(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new cjj(this, paramGoogleApiClient));
  }
  
  public bwj startMirroring(GoogleApiClient paramGoogleApiClient, String paramString, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new cjg(this, paramGoogleApiClient, paramString, paramPendingIntent));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
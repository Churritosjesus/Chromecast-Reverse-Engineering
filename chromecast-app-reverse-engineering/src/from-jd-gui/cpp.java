import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;

public class cpp
{
  public bwj a(GoogleApiClient paramGoogleApiClient, cpq paramcpq)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      a.a("loadOwners", new Object[] { paramcpq });
    }
    return paramGoogleApiClient.a(new cle(this, paramGoogleApiClient, paramcpq));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
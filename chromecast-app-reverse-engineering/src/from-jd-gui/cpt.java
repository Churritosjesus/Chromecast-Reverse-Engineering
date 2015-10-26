import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;

public class cpt
{
  public bwj a(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    return b(paramGoogleApiClient, paramString1, paramString2);
  }
  
  public bwj a(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      a.a("loadOwnerAvatar", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(1) });
    }
    return paramGoogleApiClient.a(new clg(this, paramGoogleApiClient, paramString1, paramString2, paramInt1, 1));
  }
  
  public bwj b(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      a.a("loadOwnerCoverPhoto", new Object[] { paramString1, paramString2 });
    }
    return paramGoogleApiClient.a(new clh(this, paramGoogleApiClient, paramString1, paramString2));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
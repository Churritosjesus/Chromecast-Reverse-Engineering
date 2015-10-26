import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;

public class cpv
{
  public bwj sendFeedback(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      a.a("sendFeedback", new Object[] { paramString, Integer.valueOf(paramInt) });
    }
    return paramGoogleApiClient.b(new clk(this, paramGoogleApiClient, paramString, paramInt));
  }
  
  public bwj sendFeedback(GoogleApiClient paramGoogleApiClient, String[] paramArrayOfString, int paramInt)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      a.a("sendFeedback", new Object[] { paramArrayOfString, Integer.valueOf(paramInt) });
    }
    return paramGoogleApiClient.b(new cll(this, paramGoogleApiClient, TextUtils.join(csi.a, paramArrayOfString), paramInt));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;

public final class cib
{
  public static final bvz a = new bvz("Feedback.API", c, b, new Scope[0]);
  private static final bwe b = new bwe();
  private static final bwd c = new cic();
  
  @Deprecated
  public static bwj a(GoogleApiClient paramGoogleApiClient, Bitmap paramBitmap, Bundle paramBundle)
  {
    return paramGoogleApiClient.a(new cid(paramGoogleApiClient, paramBitmap, paramBundle));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
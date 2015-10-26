import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;

public final class cni
{
  public static final bvz a;
  public static cnd b;
  private static final bwe c = new bwe();
  private static final bwd d = new cnj();
  
  static
  {
    a = new bvz("LocationServices.API", d, c, new Scope[0]);
    b = new cnd();
    new cne();
    new cnl();
  }
  
  public static cod a(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool2 = true;
    if (paramGoogleApiClient != null)
    {
      bool1 = true;
      a.b(bool1, "GoogleApiClient parameter is required.");
      paramGoogleApiClient = (cod)paramGoogleApiClient.a(c);
      if (paramGoogleApiClient == null) {
        break label46;
      }
    }
    label46:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      a.a(bool1, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
      return paramGoogleApiClient;
      bool1 = false;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
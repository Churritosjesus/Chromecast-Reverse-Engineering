import android.content.Context;
import android.os.Bundle;

final class ale
  extends ajv
{
  String f;
  boolean g;
  
  public ale(Context paramContext, String paramString, Bundle paramBundle)
  {
    super(paramContext, paramString, "oauth", paramBundle);
  }
  
  public final ajq a()
  {
    Bundle localBundle = this.e;
    localBundle.putString("redirect_uri", "fbconnect://success");
    localBundle.putString("client_id", this.b);
    localBundle.putString("e2e", this.f);
    localBundle.putString("response_type", "token,signed_request");
    localBundle.putString("return_scopes", "true");
    if (this.g) {
      localBundle.putString("auth_type", "rerequest");
    }
    return new ajq(this.a, "oauth", localBundle, this.c, this.d);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
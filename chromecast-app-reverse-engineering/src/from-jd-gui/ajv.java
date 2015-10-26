import android.content.Context;
import android.os.Bundle;

public class ajv
{
  public Context a;
  public String b;
  public int c = 16973840;
  public ajx d;
  public Bundle e;
  private String f;
  private afb g;
  
  public ajv(Context paramContext, String paramString, Bundle paramBundle)
  {
    this.g = afb.a();
    if (this.g == null)
    {
      String str = aji.a(paramContext);
      if (str != null) {
        this.b = str;
      }
    }
    else
    {
      a(paramContext, paramString, paramBundle);
      return;
    }
    throw new afq("Attempted to create a builder without a valid access token or a valid default Application ID.");
  }
  
  public ajv(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    String str = paramString1;
    if (paramString1 == null) {
      str = aji.a(paramContext);
    }
    ajp.a(str, "applicationId");
    this.b = str;
    a(paramContext, paramString2, paramBundle);
  }
  
  private void a(Context paramContext, String paramString, Bundle paramBundle)
  {
    this.a = paramContext;
    this.f = paramString;
    if (paramBundle != null) {}
    for (this.e = paramBundle;; this.e = new Bundle()) {
      return;
    }
  }
  
  public ajq a()
  {
    if (this.g != null)
    {
      this.e.putString("app_id", this.g.g);
      this.e.putString("access_token", this.g.d);
    }
    for (;;)
    {
      return new ajq(this.a, this.f, this.e, this.c, this.d);
      this.e.putString("app_id", this.b);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ajv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
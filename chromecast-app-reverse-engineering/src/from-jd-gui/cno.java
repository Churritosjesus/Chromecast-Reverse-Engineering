import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

public class cno
  extends byo
{
  public final coh a = new cnp(this);
  private final String b;
  
  public cno(Context paramContext, Looper paramLooper, bwg parambwg, bwh parambwh, String paramString, byl parambyl)
  {
    super(paramContext, paramLooper, 23, parambwg, parambwh, parambyl);
    this.b = paramString;
  }
  
  protected final String c()
  {
    return "com.google.android.location.internal.GoogleLocationManagerService.START";
  }
  
  protected final String d()
  {
    return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
  }
  
  protected final Bundle e()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("client_name", this.b);
    return localBundle;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cno.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
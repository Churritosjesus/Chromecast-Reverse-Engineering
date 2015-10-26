import android.content.Context;
import android.provider.Settings.Secure;
import java.util.Map;

final class cwf
  extends cvf
{
  private static final String b = cip.A.toString();
  private final Context c;
  
  public cwf(Context paramContext)
  {
    super(b, new String[0]);
    this.c = paramContext;
  }
  
  public final cje a(Map paramMap)
  {
    paramMap = Settings.Secure.getString(this.c.getContentResolver(), "android_id");
    if (paramMap == null) {}
    for (paramMap = cyh.f();; paramMap = cyh.a(paramMap)) {
      return paramMap;
    }
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cwf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
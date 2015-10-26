import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public abstract class atb
  extends ads
{
  String l;
  adz m;
  
  public atb(int paramInt, String paramString, adz paramadz)
  {
    super(paramInt, paramString, paramadz);
  }
  
  public final Map a()
  {
    int i = 3;
    String str = h();
    if (this.l != null) {
      i = 4;
    }
    int j = i;
    if (str != null) {
      j = i + 1;
    }
    HashMap localHashMap = new HashMap(j);
    localHashMap.put("Accept", c());
    localHashMap.put("IMAX_PROTOCOL_VERSION", "3");
    localHashMap.put("CAST_APP_TYPE", "ANDROID");
    if (this.l != null) {
      localHashMap.put("Authorization", String.format(Locale.US, "Bearer %s", new Object[] { this.l }));
    }
    if (str != null) {
      localHashMap.put("CAST-APP-DEVICE-ID", str);
    }
    return localHashMap;
  }
  
  public final void b(aef paramaef)
  {
    super.b(paramaef);
    if ((this.m != null) && ((paramaef instanceof adf))) {
      this.m.a(paramaef);
    }
  }
  
  public abstract String g();
  
  public abstract String h();
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\atb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
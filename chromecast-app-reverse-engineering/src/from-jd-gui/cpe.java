import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class cpe
  extends cov
{
  public String a;
  public String b;
  public String c;
  public String d;
  
  public final void a(cpe paramcpe)
  {
    if (!TextUtils.isEmpty(this.a)) {
      paramcpe.a = this.a;
    }
    if (!TextUtils.isEmpty(this.b)) {
      paramcpe.b = this.b;
    }
    if (!TextUtils.isEmpty(this.c)) {
      paramcpe.c = this.c;
    }
    if (!TextUtils.isEmpty(this.d)) {
      paramcpe.d = this.d;
    }
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("appName", this.a);
    localHashMap.put("appVersion", this.b);
    localHashMap.put("appId", this.c);
    localHashMap.put("appInstallerId", this.d);
    return a(localHashMap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
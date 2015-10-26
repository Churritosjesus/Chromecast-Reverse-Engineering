import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class cpk
  extends cov
{
  public String a;
  public int b;
  public String c;
  private int d;
  private String e;
  private boolean f;
  private boolean g;
  
  public cpk()
  {
    this(false);
  }
  
  private cpk(boolean paramBoolean) {}
  
  private cpk(boolean paramBoolean, int paramInt)
  {
    if (paramInt == 0) {
      throw new IllegalArgumentException("Given Integer is zero");
    }
    this.b = paramInt;
    this.g = paramBoolean;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("screenName", this.a);
    localHashMap.put("interstitial", Boolean.valueOf(this.f));
    localHashMap.put("automatic", Boolean.valueOf(this.g));
    localHashMap.put("screenId", Integer.valueOf(this.b));
    localHashMap.put("referrerScreenId", Integer.valueOf(this.d));
    localHashMap.put("referrerScreenName", this.e);
    localHashMap.put("referrerUri", this.c);
    return a(localHashMap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
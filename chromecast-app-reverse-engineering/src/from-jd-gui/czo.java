import android.os.Build;
import java.util.Map;

final class czo
  extends cvf
{
  private static final String b = cip.i.toString();
  
  public czo()
  {
    super(b, new String[0]);
  }
  
  public final cje a(Map paramMap)
  {
    String str2 = Build.MANUFACTURER;
    String str1 = Build.MODEL;
    paramMap = str1;
    if (!str1.startsWith(str2))
    {
      paramMap = str1;
      if (!str2.equals("unknown")) {
        paramMap = str2 + " " + str1;
      }
    }
    return cyh.a(paramMap);
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
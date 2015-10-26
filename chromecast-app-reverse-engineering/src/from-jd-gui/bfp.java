import android.net.Uri;
import android.net.Uri.Builder;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeoutException;

public abstract class bfp
  extends bfd
{
  private final Uri a;
  public blp g = new blp("SetupRequest");
  public int h = 3;
  public boolean i = false;
  
  protected bfp(String paramString)
  {
    String str = String.valueOf("/setup");
    this.a = Uri.parse(String.valueOf(paramString).length() + 19 + String.valueOf(str).length() + "http://" + paramString + ":8008" + str);
  }
  
  private Uri a(String paramString1, String paramString2)
  {
    paramString1 = this.a.buildUpon().appendPath(paramString1);
    if (paramString2 != null) {
      paramString1.encodedQuery(paramString2);
    }
    return paramString1.build();
  }
  
  protected final bfq a(String paramString, int paramInt)
  {
    return a(paramString, null, null, paramInt);
  }
  
  protected final bfq a(String paramString, bfc parambfc, int paramInt)
  {
    try
    {
      paramString = super.a(a(paramString, null), parambfc, paramInt);
      return paramString;
    }
    catch (IOException paramString)
    {
      getClass().getSimpleName();
      paramString.toString();
      throw paramString;
    }
    catch (TimeoutException paramString)
    {
      getClass().getSimpleName();
      paramString.toString();
      throw paramString;
    }
  }
  
  protected final bfq a(String paramString1, String paramString2, Map paramMap, int paramInt)
  {
    try
    {
      paramString1 = super.a(a(paramString1, paramString2), paramMap, paramInt);
      return paramString1;
    }
    catch (IOException paramString1)
    {
      getClass().getSimpleName();
      paramString1.toString();
      throw paramString1;
    }
    catch (TimeoutException paramString1)
    {
      getClass().getSimpleName();
      paramString1.toString();
      throw paramString1;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
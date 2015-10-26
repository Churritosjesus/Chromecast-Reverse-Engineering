import android.os.Build.VERSION;
import java.util.List;

public final class jn
{
  private static final jo b;
  public final Object a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19) {
      b = new jr();
    }
    for (;;)
    {
      return;
      if (Build.VERSION.SDK_INT >= 16) {
        b = new jp();
      } else {
        b = new jo();
      }
    }
  }
  
  public jn()
  {
    this.a = b.a(this);
  }
  
  public jn(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public static jd a()
  {
    return null;
  }
  
  public static boolean b()
  {
    return false;
  }
  
  public static List c()
  {
    return null;
  }
  
  public static jd d()
  {
    return null;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\jn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
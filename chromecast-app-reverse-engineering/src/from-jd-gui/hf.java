import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class hf
{
  private static hj a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14) {
      a = new hi();
    }
    for (;;)
    {
      return;
      if (Build.VERSION.SDK_INT >= 11) {
        a = new hh();
      } else if (Build.VERSION.SDK_INT >= 8) {
        a = new hg();
      } else {
        a = new hj();
      }
    }
  }
  
  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }
  
  public static boolean b(ViewConfiguration paramViewConfiguration)
  {
    return a.b(paramViewConfiguration);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\hf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
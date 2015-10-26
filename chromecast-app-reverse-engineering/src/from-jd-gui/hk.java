import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class hk
{
  private static hn a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      a = new hp();
    }
    for (;;)
    {
      return;
      if (i >= 18) {
        a = new ho();
      } else if (i >= 14) {
        a = new hm();
      } else if (i >= 11) {
        a = new hl();
      } else {
        a = new hn();
      }
    }
  }
  
  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, false);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\hk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
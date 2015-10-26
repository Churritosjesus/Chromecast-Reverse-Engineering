import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class fm
{
  private static fn a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      a = new fp();
    }
    for (;;)
    {
      return;
      if (i >= 11) {
        a = new fo();
      } else {
        a = new fn();
      }
    }
  }
  
  public static void a(LayoutInflater paramLayoutInflater, fs paramfs)
  {
    a.a(paramLayoutInflater, paramfs);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\fm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
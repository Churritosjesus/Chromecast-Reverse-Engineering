import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class be
{
  private static final bf a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 15) {
      a = new bh();
    }
    for (;;)
    {
      return;
      if (i >= 11) {
        a = new bg();
      } else {
        a = new bf();
      }
    }
  }
  
  public static Intent a(ComponentName paramComponentName)
  {
    return a.a(paramComponentName);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
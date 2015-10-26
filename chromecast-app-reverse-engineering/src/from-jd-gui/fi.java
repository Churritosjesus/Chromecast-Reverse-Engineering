import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class fi
{
  private static fl a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11) {}
    for (a = new fk();; a = new fl()) {
      return;
    }
  }
  
  public static boolean a(KeyEvent paramKeyEvent)
  {
    return a.b(paramKeyEvent.getMetaState());
  }
  
  public static boolean a(KeyEvent paramKeyEvent, int paramInt)
  {
    return a.a(paramKeyEvent.getMetaState(), 1);
  }
  
  public static void b(KeyEvent paramKeyEvent)
  {
    a.a(paramKeyEvent);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\fi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
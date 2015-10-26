import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class iz
{
  private static final jc a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19) {
      a = new jb();
    }
    for (;;)
    {
      return;
      if (Build.VERSION.SDK_INT >= 14) {
        a = new ja();
      } else {
        a = new jc();
      }
    }
  }
  
  public static jx a(AccessibilityEvent paramAccessibilityEvent)
  {
    return new jx(paramAccessibilityEvent);
  }
  
  public static void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    a.a(paramAccessibilityEvent, paramInt);
  }
  
  public static int b(AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(paramAccessibilityEvent);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\iz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
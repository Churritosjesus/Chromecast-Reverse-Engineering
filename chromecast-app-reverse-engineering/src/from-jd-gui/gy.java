import android.view.View;
import android.view.View.AccessibilityDelegate;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class gy
  extends gx
{
  private static Field b;
  private static boolean c = false;
  
  public final void a(View paramView, er paramer)
  {
    if (paramer == null) {}
    for (paramer = null;; paramer = paramer.a)
    {
      paramView.setAccessibilityDelegate((View.AccessibilityDelegate)paramer);
      return;
    }
  }
  
  public final boolean a(View paramView, int paramInt)
  {
    return paramView.canScrollHorizontally(paramInt);
  }
  
  public final boolean b(View paramView)
  {
    boolean bool = false;
    if (c) {}
    for (;;)
    {
      return bool;
      if (b == null) {}
      try
      {
        Field localField = View.class.getDeclaredField("mAccessibilityDelegate");
        b = localField;
        localField.setAccessible(true);
      }
      catch (Throwable paramView)
      {
        try
        {
          paramView = b.get(paramView);
          if (paramView == null) {
            continue;
          }
          bool = true;
        }
        catch (Throwable paramView)
        {
          c = true;
        }
        paramView = paramView;
        c = true;
      }
    }
  }
  
  public final boolean b(View paramView, int paramInt)
  {
    return paramView.canScrollVertically(paramInt);
  }
  
  public final ih o(View paramView)
  {
    if (this.a == null) {
      this.a = new WeakHashMap();
    }
    ih localih2 = (ih)this.a.get(paramView);
    ih localih1 = localih2;
    if (localih2 == null)
    {
      localih1 = new ih(paramView);
      this.a.put(paramView, localih1);
    }
    return localih1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\gy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
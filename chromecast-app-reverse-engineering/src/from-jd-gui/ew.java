import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

final class ew
  implements fa
{
  ew(ev paramev, er paramer) {}
  
  public final Object a(View paramView)
  {
    paramView = er.a(paramView);
    if (paramView != null) {}
    for (paramView = paramView.a;; paramView = null) {
      return paramView;
    }
  }
  
  public final void a(View paramView, int paramInt)
  {
    er.a(paramView, paramInt);
  }
  
  public final void a(View paramView, Object paramObject)
  {
    this.a.a(paramView, new jd(paramObject));
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return this.a.a(paramView, paramInt, paramBundle);
  }
  
  public final boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.a.b(paramView, paramAccessibilityEvent);
  }
  
  public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.a.a(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public final void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.a.d(paramView, paramAccessibilityEvent);
  }
  
  public final void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    er.c(paramView, paramAccessibilityEvent);
  }
  
  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    er.a(paramView, paramAccessibilityEvent);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
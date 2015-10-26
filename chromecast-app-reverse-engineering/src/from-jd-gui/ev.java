import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;

final class ev
  extends es
{
  public final Object a(er paramer)
  {
    return new ez(new ew(this, paramer));
  }
  
  public final jn a(Object paramObject, View paramView)
  {
    paramObject = ((View.AccessibilityDelegate)paramObject).getAccessibilityNodeProvider(paramView);
    if (paramObject != null) {}
    for (paramObject = new jn(paramObject);; paramObject = null) {
      return (jn)paramObject;
    }
  }
  
  public final boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return ((View.AccessibilityDelegate)paramObject).performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
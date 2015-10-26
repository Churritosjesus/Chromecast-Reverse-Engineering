import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public final class jv
  extends AccessibilityNodeProvider
{
  public jv(jw paramjw) {}
  
  public final AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
  {
    return (AccessibilityNodeInfo)this.a.a(paramInt);
  }
  
  public final List findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    return this.a.a(paramString, paramInt);
  }
  
  public final AccessibilityNodeInfo findFocus(int paramInt)
  {
    return (AccessibilityNodeInfo)this.a.b(paramInt);
  }
  
  public final boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.a.a(paramInt1, paramInt2, paramBundle);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\jv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
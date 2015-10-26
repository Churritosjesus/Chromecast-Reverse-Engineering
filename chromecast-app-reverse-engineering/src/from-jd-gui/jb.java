import android.view.accessibility.AccessibilityEvent;

final class jb
  extends ja
{
  public final int a(AccessibilityEvent paramAccessibilityEvent)
  {
    return paramAccessibilityEvent.getContentChangeTypes();
  }
  
  public final void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    paramAccessibilityEvent.setContentChangeTypes(paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\jb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
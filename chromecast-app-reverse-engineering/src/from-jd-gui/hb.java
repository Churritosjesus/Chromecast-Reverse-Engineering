import android.view.View;

class hb
  extends ha
{
  public final void c(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(paramInt);
  }
  
  public final boolean u(View paramView)
  {
    return paramView.isLaidOut();
  }
  
  public final boolean v(View paramView)
  {
    return paramView.isAttachedToWindow();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
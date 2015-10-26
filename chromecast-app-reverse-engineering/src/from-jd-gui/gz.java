import android.view.View;
import android.view.ViewParent;

class gz
  extends gy
{
  public final void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
  
  public final void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
  
  public void c(View paramView, int paramInt)
  {
    int i = paramInt;
    if (paramInt == 4) {
      i = 2;
    }
    paramView.setImportantForAccessibility(i);
  }
  
  public final boolean c(View paramView)
  {
    return paramView.hasTransientState();
  }
  
  public final void d(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }
  
  public final int e(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }
  
  public final ViewParent h(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
  
  public final int m(View paramView)
  {
    return paramView.getMinimumWidth();
  }
  
  public final int n(View paramView)
  {
    return paramView.getMinimumHeight();
  }
  
  public void q(View paramView)
  {
    paramView.requestFitSystemWindows();
  }
  
  public final boolean r(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\gz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
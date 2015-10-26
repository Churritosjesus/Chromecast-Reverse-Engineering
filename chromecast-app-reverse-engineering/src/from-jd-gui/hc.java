import android.view.View;
import android.view.WindowInsets;

final class hc
  extends hb
{
  public final ix a(View paramView, ix paramix)
  {
    Object localObject = paramix;
    if ((paramix instanceof iy))
    {
      WindowInsets localWindowInsets = ((iy)paramix).a;
      paramView = paramView.onApplyWindowInsets(localWindowInsets);
      localObject = paramix;
      if (paramView != localWindowInsets) {
        localObject = new iy(paramView);
      }
    }
    return (ix)localObject;
  }
  
  public final void a(View paramView, gm paramgm)
  {
    paramView.setOnApplyWindowInsetsListener(new he(paramgm));
  }
  
  public final void f(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }
  
  public final void q(View paramView)
  {
    paramView.requestApplyInsets();
  }
  
  public final void t(View paramView)
  {
    paramView.stopNestedScroll();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
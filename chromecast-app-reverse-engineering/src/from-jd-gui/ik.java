import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;

class ik
  extends ii
{
  public final void a(View paramView, long paramLong)
  {
    paramView.animate().setDuration(paramLong);
  }
  
  public final void a(View paramView, Interpolator paramInterpolator)
  {
    paramView.animate().setInterpolator(paramInterpolator);
  }
  
  public final void a(ih paramih, View paramView)
  {
    paramView.animate().cancel();
  }
  
  public final void a(ih paramih, View paramView, float paramFloat)
  {
    paramView.animate().alpha(paramFloat);
  }
  
  public void a(ih paramih, View paramView, iu paramiu)
  {
    paramView.setTag(2113929216, paramiu);
    paramih = new il(paramih);
    paramView.animate().setListener(new ir(paramih, paramView));
  }
  
  public final void b(ih paramih, View paramView)
  {
    paramView.animate().start();
  }
  
  public final void b(ih paramih, View paramView, float paramFloat)
  {
    paramView.animate().translationX(paramFloat);
  }
  
  public final void c(ih paramih, View paramView, float paramFloat)
  {
    paramView.animate().translationY(paramFloat);
  }
  
  public final void d(ih paramih, View paramView, float paramFloat)
  {
    paramView.animate().scaleY(paramFloat);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
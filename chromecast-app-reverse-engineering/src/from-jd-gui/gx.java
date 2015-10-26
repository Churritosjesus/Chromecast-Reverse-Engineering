import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class gx
  extends gw
{
  public final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3);
  }
  
  final long a()
  {
    return ValueAnimator.getFrameDelay();
  }
  
  public final void a(View paramView, float paramFloat)
  {
    paramView.setTranslationX(paramFloat);
  }
  
  public final void a(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }
  
  public final void a(View paramView, boolean paramBoolean)
  {
    paramView.setSaveFromParentEnabled(paramBoolean);
  }
  
  public final void b(View paramView, float paramFloat)
  {
    paramView.setTranslationY(paramFloat);
  }
  
  public final void b(View paramView, boolean paramBoolean)
  {
    paramView.setActivated(paramBoolean);
  }
  
  public final void c(View paramView, float paramFloat)
  {
    paramView.setAlpha(paramFloat);
  }
  
  public final void d(View paramView, float paramFloat)
  {
    paramView.setScaleX(paramFloat);
  }
  
  public final void e(View paramView, float paramFloat)
  {
    paramView.setScaleY(paramFloat);
  }
  
  public final float f(View paramView)
  {
    return paramView.getAlpha();
  }
  
  public final int i(View paramView)
  {
    return paramView.getMeasuredWidthAndState();
  }
  
  public final int j(View paramView)
  {
    return paramView.getMeasuredState();
  }
  
  public final float k(View paramView)
  {
    return paramView.getTranslationX();
  }
  
  public final float l(View paramView)
  {
    return paramView.getTranslationY();
  }
  
  public final void s(View paramView)
  {
    paramView.jumpDrawablesToCurrentState();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\gx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;

public final class sm
  extends HorizontalScrollView
  implements rz
{
  Runnable a;
  public boolean b;
  int c;
  private sp d;
  private sr e;
  private int f;
  private int g;
  private int h;
  
  static
  {
    new DecelerateInterpolator();
  }
  
  private void a(int paramInt)
  {
    this.h = paramInt;
    throw new NullPointerException();
  }
  
  private boolean a()
  {
    if ((this.e != null) && (this.e.getParent() == this)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean b()
  {
    if (!a()) {}
    for (;;)
    {
      return false;
      removeView(this.e);
      addView(null, new ViewGroup.LayoutParams(-2, -1));
      a(this.e.n);
    }
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.a != null) {
      post(this.a);
    }
  }
  
  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    ph localph = ph.a(getContext());
    TypedArray localTypedArray = localph.a.obtainStyledAttributes(null, oq.a, a.i, 0);
    int j = localTypedArray.getLayoutDimension(oq.j, 0);
    paramConfiguration = localph.a.getResources();
    int i = j;
    if (!localph.a()) {
      i = Math.min(j, paramConfiguration.getDimensionPixelSize(a.Z));
    }
    localTypedArray.recycle();
    this.g = i;
    requestLayout();
    this.f = localph.a.getResources().getDimensionPixelSize(a.aa);
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a != null) {
      removeCallbacks(this.a);
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {}
    for (boolean bool = true;; bool = false)
    {
      setFillViewport(bool);
      throw new NullPointerException();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
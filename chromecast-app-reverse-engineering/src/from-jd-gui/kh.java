import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

final class kh
  extends ImageView
{
  Animation.AnimationListener a;
  private int b;
  
  public kh(Context paramContext, int paramInt, float paramFloat)
  {
    super(paramContext);
    paramFloat = getContext().getResources().getDisplayMetrics().density;
    int j = (int)(20.0F * paramFloat * 2.0F);
    paramInt = (int)(1.75F * paramFloat);
    int i = (int)(0.0F * paramFloat);
    this.b = ((int)(3.5F * paramFloat));
    if (a())
    {
      paramContext = new ShapeDrawable(new OvalShape());
      gt.f(this, paramFloat * 4.0F);
    }
    for (;;)
    {
      paramContext.getPaint().setColor(-328966);
      setBackgroundDrawable(paramContext);
      return;
      paramContext = new ShapeDrawable(new ki(this, this.b, j));
      gt.a(this, 1, paramContext.getPaint());
      paramContext.getPaint().setShadowLayer(this.b, i, paramInt, 503316480);
      paramInt = this.b;
      setPadding(paramInt, paramInt, paramInt, paramInt);
    }
  }
  
  private static boolean a()
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void onAnimationEnd()
  {
    super.onAnimationEnd();
    if (this.a != null) {
      this.a.onAnimationEnd(getAnimation());
    }
  }
  
  public final void onAnimationStart()
  {
    super.onAnimationStart();
    if (this.a != null) {
      this.a.onAnimationStart(getAnimation());
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!a()) {
      setMeasuredDimension(getMeasuredWidth() + (this.b << 1), getMeasuredHeight() + (this.b << 1));
    }
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    if ((getBackground() instanceof ShapeDrawable)) {
      ((ShapeDrawable)getBackground()).getPaint().setColor(paramInt);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\kh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
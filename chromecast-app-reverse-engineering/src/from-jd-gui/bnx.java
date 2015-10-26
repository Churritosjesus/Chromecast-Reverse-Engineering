import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

final class bnx
  extends Animation
{
  private final int a;
  private final View b;
  private final boolean c;
  
  public bnx(bmu parambmu, View paramView, int paramInt, boolean paramBoolean)
  {
    this.b = paramView;
    this.a = paramInt;
    this.c = paramBoolean;
    if (Build.VERSION.SDK_INT >= 11) {
      setInterpolator(parambmu.h, 17563650);
    }
    setDuration(200L);
  }
  
  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (this.c) {}
    for (int i = (int)(this.a * paramFloat);; i = (int)(this.a * (1.0F - paramFloat)))
    {
      this.b.getLayoutParams().height = i;
      this.b.requestLayout();
      this.d.g.a();
      return;
    }
  }
  
  public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final boolean willChangeBounds()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bnx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
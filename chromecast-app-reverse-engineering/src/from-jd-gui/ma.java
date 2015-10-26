import android.view.animation.Animation;
import android.view.animation.Transformation;

final class ma
  extends Animation
{
  ma(lw paramlw, int paramInt1, int paramInt2) {}
  
  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    lw.b(this.c).setAlpha((int)(this.a + (this.b - this.a) * paramFloat));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
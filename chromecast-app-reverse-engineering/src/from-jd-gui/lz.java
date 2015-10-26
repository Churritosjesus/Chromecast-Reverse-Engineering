import android.view.animation.Animation;
import android.view.animation.Transformation;

final class lz
  extends Animation
{
  lz(lw paramlw) {}
  
  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    lw.a(this.a, 1.0F - paramFloat);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\lz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.view.animation.Animation;
import android.view.animation.Transformation;

final class mc
  extends Animation
{
  mc(lw paramlw) {}
  
  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (!lw.h(this.a)) {}
    for (int i = (int)(lw.i(this.a) - Math.abs(this.a.d));; i = (int)lw.i(this.a))
    {
      int j = this.a.c;
      int k = (int)((i - this.a.c) * paramFloat);
      i = lw.e(this.a).getTop();
      lw.a(this.a, k + j - i, false);
      lw.b(this.a).a(1.0F - paramFloat);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
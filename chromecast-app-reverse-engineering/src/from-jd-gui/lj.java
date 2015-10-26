import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

final class lj
  extends Animation
{
  lj(li paramli, lm paramlm) {}
  
  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (this.b.b) {
      li.a(this.b, paramFloat, this.a);
    }
    for (;;)
    {
      return;
      float f3 = li.a(this.b, this.a);
      float f1 = this.a.l;
      float f4 = this.a.k;
      float f2 = this.a.m;
      li.b(this.b, paramFloat, this.a);
      if (paramFloat <= 0.5F)
      {
        float f5 = paramFloat / 0.5F;
        f5 = li.a().getInterpolation(f5);
        this.a.a(f4 + f5 * (0.8F - f3));
      }
      if (paramFloat > 0.5F)
      {
        f4 = (paramFloat - 0.5F) / 0.5F;
        f4 = li.a().getInterpolation(f4);
        this.a.b((0.8F - f3) * f4 + f1);
      }
      this.a.c(0.25F * paramFloat + f2);
      f1 = li.a(this.b) / 5.0F;
      this.b.b(216.0F * paramFloat + 1080.0F * f1);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\lj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
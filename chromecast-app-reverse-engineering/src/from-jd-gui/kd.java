import android.view.animation.Interpolator;

class kd
  implements Interpolator
{
  private final float[] a;
  private final float b;
  
  public kd(float[] paramArrayOfFloat)
  {
    this.a = paramArrayOfFloat;
    this.b = (1.0F / (this.a.length - 1));
  }
  
  public float getInterpolation(float paramFloat)
  {
    float f = 1.0F;
    if (paramFloat >= 1.0F) {
      paramFloat = f;
    }
    for (;;)
    {
      return paramFloat;
      if (paramFloat <= 0.0F)
      {
        paramFloat = 0.0F;
      }
      else
      {
        int i = Math.min((int)((this.a.length - 1) * paramFloat), this.a.length - 2);
        paramFloat = (paramFloat - i * this.b) / this.b;
        f = this.a[i];
        paramFloat = (this.a[(i + 1)] - this.a[i]) * paramFloat + f;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
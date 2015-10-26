import android.view.animation.Interpolator;

final class mg
  implements Interpolator
{
  public final float getInterpolation(float paramFloat)
  {
    paramFloat -= 1.0F;
    return paramFloat * (paramFloat * paramFloat * paramFloat * paramFloat) + 1.0F;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
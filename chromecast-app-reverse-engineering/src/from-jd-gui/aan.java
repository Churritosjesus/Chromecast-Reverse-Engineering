import android.support.v7.widget.SwitchCompat;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class aan
  extends Animation
{
  public aan(SwitchCompat paramSwitchCompat, float paramFloat1, float paramFloat2) {}
  
  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    SwitchCompat.a(this.c, this.a + this.b * paramFloat);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
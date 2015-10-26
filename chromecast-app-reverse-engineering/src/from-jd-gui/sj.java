import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

final class sj
  extends os
{
  boolean a = true;
  
  public sj(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (this.a) {
      super.draw(paramCanvas);
    }
  }
  
  public final void setHotspot(float paramFloat1, float paramFloat2)
  {
    if (this.a) {
      super.setHotspot(paramFloat1, paramFloat2);
    }
  }
  
  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a) {
      super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final boolean setState(int[] paramArrayOfInt)
  {
    if (this.a) {}
    for (boolean bool = super.setState(paramArrayOfInt);; bool = false) {
      return bool;
    }
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.a) {}
    for (paramBoolean1 = super.setVisible(paramBoolean1, paramBoolean2);; paramBoolean1 = false) {
      return paramBoolean1;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
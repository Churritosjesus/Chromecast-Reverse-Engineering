import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ActionBarContainer;

public class rc
  extends Drawable
{
  final ActionBarContainer a;
  
  public rc(ActionBarContainer paramActionBarContainer)
  {
    this.a = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.a.e) {
      if (this.a.d != null) {
        this.a.d.draw(paramCanvas);
      }
    }
    for (;;)
    {
      return;
      if (this.a.b != null) {
        this.a.b.draw(paramCanvas);
      }
      if ((this.a.c != null) && (this.a.f)) {
        this.a.c.draw(paramCanvas);
      }
    }
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
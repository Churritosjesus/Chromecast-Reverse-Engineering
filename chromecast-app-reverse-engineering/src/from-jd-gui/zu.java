import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

final class zu
  extends Drawable
{
  float a;
  float b;
  boolean c = false;
  boolean d = true;
  private final Paint e;
  private final RectF f;
  private final Rect g;
  
  public zu(int paramInt, float paramFloat)
  {
    this.a = paramFloat;
    this.e = new Paint(5);
    this.e.setColor(paramInt);
    this.f = new RectF();
    this.g = new Rect();
  }
  
  void a(Rect paramRect)
  {
    Rect localRect = paramRect;
    if (paramRect == null) {
      localRect = getBounds();
    }
    this.f.set(localRect.left, localRect.top, localRect.right, localRect.bottom);
    this.g.set(localRect);
    if (this.c)
    {
      float f1 = zv.a(this.b, this.a, this.d);
      float f2 = zv.b(this.b, this.a, this.d);
      this.g.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
      this.f.set(this.g);
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    paramCanvas.drawRoundRect(this.f, this.a, this.a, this.e);
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final void getOutline(Outline paramOutline)
  {
    paramOutline.setRoundRect(this.g, this.a);
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    a(paramRect);
  }
  
  public final void setAlpha(int paramInt) {}
  
  public final void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
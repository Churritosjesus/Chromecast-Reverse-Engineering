import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;

final class ki
  extends OvalShape
{
  private RadialGradient a;
  private Paint b = new Paint();
  private int c;
  
  public ki(kh paramkh, int paramInt1, int paramInt2)
  {
    kh.a(paramkh, paramInt1);
    this.c = paramInt2;
    float f3 = this.c / 2;
    float f1 = this.c / 2;
    float f2 = kh.a(paramkh);
    paramkh = Shader.TileMode.CLAMP;
    this.a = new RadialGradient(f3, f1, f2, new int[] { 1023410176, 0 }, null, paramkh);
    this.b.setShader(this.a);
  }
  
  public final void draw(Canvas paramCanvas, Paint paramPaint)
  {
    int i = this.d.getWidth();
    int j = this.d.getHeight();
    paramCanvas.drawCircle(i / 2, j / 2, this.c / 2 + kh.a(this.d), this.b);
    paramCanvas.drawCircle(i / 2, j / 2, this.c / 2, paramPaint);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

abstract class nz
  extends Drawable
{
  private static final float d = (float)Math.toRadians(45.0D);
  boolean a = false;
  float b;
  private final Paint c = new Paint();
  private final float e;
  private final float f;
  private final float g;
  private final float h;
  private final float i;
  private final boolean j;
  private final Path k = new Path();
  private final int l;
  private float m;
  private float n;
  
  nz(Context paramContext)
  {
    paramContext = paramContext.getTheme().obtainStyledAttributes(null, oq.R, a.F, a.bY);
    this.c.setAntiAlias(true);
    this.c.setColor(paramContext.getColor(oq.T, 0));
    this.l = paramContext.getDimensionPixelSize(oq.U, 0);
    this.g = Math.round(paramContext.getDimension(oq.S, 0.0F));
    this.f = Math.round(paramContext.getDimension(oq.Z, 0.0F));
    this.e = paramContext.getDimension(oq.Y, 0.0F);
    this.i = Math.round(paramContext.getDimension(oq.V, 0.0F));
    this.j = paramContext.getBoolean(oq.X, true);
    this.h = paramContext.getDimension(oq.W, 0.0F);
    this.n = ((int)(this.l - this.e * 3.0F - this.i * 2.0F) / 4 << 1);
    this.n = ((float)(this.n + (this.e * 1.5D + this.i)));
    paramContext.recycle();
    this.c.setStyle(Paint.Style.STROKE);
    this.c.setStrokeJoin(Paint.Join.MITER);
    this.c.setStrokeCap(Paint.Cap.BUTT);
    this.c.setStrokeWidth(this.e);
    this.m = ((float)(this.e / 2.0F * Math.cos(d)));
  }
  
  abstract boolean a();
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    boolean bool = a();
    float f1 = this.g;
    float f5 = f1 + (this.f - f1) * this.b;
    f1 = this.g;
    float f4 = f1 + (this.h - f1) * this.b;
    float f3 = Math.round(0.0F + (this.m - 0.0F) * this.b);
    float f7 = 0.0F + (d - 0.0F) * this.b;
    float f2;
    label100:
    int i1;
    if (bool)
    {
      f1 = 0.0F;
      if (!bool) {
        break label340;
      }
      f2 = 180.0F;
      float f8 = this.b;
      float f6 = (float)Math.round(f5 * Math.cos(f7));
      f5 = (float)Math.round(f5 * Math.sin(f7));
      this.k.rewind();
      f7 = this.i + this.e;
      f7 += (-this.m - f7) * this.b;
      float f9 = -f4 / 2.0F;
      this.k.moveTo(f9 + f3, 0.0F);
      this.k.rLineTo(f4 - f3 * 2.0F, 0.0F);
      this.k.moveTo(f9, f7);
      this.k.rLineTo(f6, f5);
      this.k.moveTo(f9, -f7);
      this.k.rLineTo(f6, -f5);
      this.k.close();
      paramCanvas.save();
      paramCanvas.translate(localRect.centerX(), this.n);
      if (!this.j) {
        break label351;
      }
      if (!(this.a ^ bool)) {
        break label345;
      }
      i1 = -1;
      label301:
      paramCanvas.rotate(i1 * (f1 + (f2 - f1) * f8));
    }
    for (;;)
    {
      paramCanvas.drawPath(this.k, this.c);
      paramCanvas.restore();
      return;
      f1 = -180.0F;
      break;
      label340:
      f2 = 0.0F;
      break label100;
      label345:
      i1 = 1;
      break label301;
      label351:
      if (bool) {
        paramCanvas.rotate(180.0F);
      }
    }
  }
  
  public int getIntrinsicHeight()
  {
    return this.l;
  }
  
  public int getIntrinsicWidth()
  {
    return this.l;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean isAutoMirrored()
  {
    return true;
  }
  
  public void setAlpha(int paramInt)
  {
    this.c.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.c.setColorFilter(paramColorFilter);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
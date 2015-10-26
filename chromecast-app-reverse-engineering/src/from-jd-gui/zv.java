import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

final class zv
  extends Drawable
{
  static zw b;
  private static double f = Math.cos(Math.toRadians(45.0D));
  final int a;
  float c;
  float d;
  boolean e = true;
  private Paint g;
  private Paint h;
  private Paint i;
  private RectF j;
  private Path k;
  private float l;
  private float m;
  private boolean n = true;
  private final int o;
  private final int p;
  private boolean q = false;
  
  zv(Resources paramResources, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.o = paramResources.getColor(a.cc);
    this.p = paramResources.getColor(a.cb);
    this.a = paramResources.getDimensionPixelSize(a.cd);
    this.g = new Paint(5);
    this.g.setColor(paramInt);
    this.h = new Paint(5);
    this.h.setStyle(Paint.Style.FILL);
    this.c = ((int)(paramFloat1 + 0.5F));
    this.j = new RectF();
    this.i = new Paint(this.h);
    this.i.setAntiAlias(false);
    if ((paramFloat2 < 0.0F) || (paramFloat3 < 0.0F)) {
      throw new IllegalArgumentException("invalid shadow size");
    }
    float f1 = a(paramFloat2);
    paramFloat2 = a(paramFloat3);
    paramFloat1 = f1;
    if (f1 > paramFloat2)
    {
      if (!this.q) {
        this.q = true;
      }
      paramFloat1 = paramFloat2;
    }
    if ((this.m != paramFloat1) || (this.d != paramFloat2))
    {
      this.m = paramFloat1;
      this.d = paramFloat2;
      this.l = ((int)(paramFloat1 * 1.5F + this.a + 0.5F));
      this.n = true;
      invalidateSelf();
    }
  }
  
  static float a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (paramFloat1 = (float)(1.5F * paramFloat1 + (1.0D - f) * paramFloat2);; paramFloat1 = 1.5F * paramFloat1) {
      return paramFloat1;
    }
  }
  
  private static int a(float paramFloat)
  {
    int i2 = (int)(0.5F + paramFloat);
    int i1 = i2;
    if (i2 % 2 == 1) {
      i1 = i2 - 1;
    }
    return i1;
  }
  
  static float b(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f1 = paramFloat1;
    if (paramBoolean) {
      f1 = (float)(paramFloat1 + (1.0D - f) * paramFloat2);
    }
    return f1;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int i1 = 1;
    float f1;
    float f3;
    float f2;
    int i3;
    int i2;
    float f4;
    if (this.n)
    {
      Object localObject1 = getBounds();
      f1 = this.d * 1.5F;
      this.j.set(((Rect)localObject1).left + this.d, ((Rect)localObject1).top + f1, ((Rect)localObject1).right - this.d, ((Rect)localObject1).bottom - f1);
      localObject1 = new RectF(-this.c, -this.c, this.c, this.c);
      Object localObject2 = new RectF((RectF)localObject1);
      ((RectF)localObject2).inset(-this.l, -this.l);
      if (this.k == null)
      {
        this.k = new Path();
        this.k.setFillType(Path.FillType.EVEN_ODD);
        this.k.moveTo(-this.c, 0.0F);
        this.k.rLineTo(-this.l, 0.0F);
        this.k.arcTo((RectF)localObject2, 180.0F, 90.0F, false);
        this.k.arcTo((RectF)localObject1, 270.0F, -90.0F, false);
        this.k.close();
        f3 = this.c / (this.c + this.l);
        localObject2 = this.h;
        f2 = this.c;
        f1 = this.l;
        i3 = this.o;
        i2 = this.o;
        int i4 = this.p;
        localObject1 = Shader.TileMode.CLAMP;
        ((Paint)localObject2).setShader(new RadialGradient(0.0F, 0.0F, f2 + f1, new int[] { i3, i2, i4 }, new float[] { 0.0F, f3, 1.0F }, (Shader.TileMode)localObject1));
        localObject1 = this.i;
        f1 = -this.c;
        f2 = this.l;
        f3 = -this.c;
        f4 = this.l;
        i3 = this.o;
        i2 = this.o;
        i4 = this.p;
        localObject2 = Shader.TileMode.CLAMP;
        ((Paint)localObject1).setShader(new LinearGradient(0.0F, f1 + f2, 0.0F, f3 - f4, new int[] { i3, i2, i4 }, new float[] { 0.0F, 0.5F, 1.0F }, (Shader.TileMode)localObject2));
        this.i.setAntiAlias(false);
        this.n = false;
      }
    }
    else
    {
      paramCanvas.translate(0.0F, this.m / 2.0F);
      f3 = -this.c - this.l;
      f1 = this.c + this.a + this.m / 2.0F;
      if (this.j.width() - f1 * 2.0F <= 0.0F) {
        break label906;
      }
      i2 = 1;
      label505:
      if (this.j.height() - f1 * 2.0F <= 0.0F) {
        break label912;
      }
    }
    for (;;)
    {
      i3 = paramCanvas.save();
      paramCanvas.translate(this.j.left + f1, this.j.top + f1);
      paramCanvas.drawPath(this.k, this.h);
      if (i2 != 0) {
        paramCanvas.drawRect(0.0F, f3, this.j.width() - f1 * 2.0F, -this.c, this.i);
      }
      paramCanvas.restoreToCount(i3);
      i3 = paramCanvas.save();
      paramCanvas.translate(this.j.right - f1, this.j.bottom - f1);
      paramCanvas.rotate(180.0F);
      paramCanvas.drawPath(this.k, this.h);
      if (i2 != 0)
      {
        f2 = this.j.width();
        f4 = -this.c;
        paramCanvas.drawRect(0.0F, f3, f2 - f1 * 2.0F, this.l + f4, this.i);
      }
      paramCanvas.restoreToCount(i3);
      i2 = paramCanvas.save();
      paramCanvas.translate(this.j.left + f1, this.j.bottom - f1);
      paramCanvas.rotate(270.0F);
      paramCanvas.drawPath(this.k, this.h);
      if (i1 != 0) {
        paramCanvas.drawRect(0.0F, f3, this.j.height() - f1 * 2.0F, -this.c, this.i);
      }
      paramCanvas.restoreToCount(i2);
      i2 = paramCanvas.save();
      paramCanvas.translate(this.j.right - f1, this.j.top + f1);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawPath(this.k, this.h);
      if (i1 != 0) {
        paramCanvas.drawRect(0.0F, f3, this.j.height() - f1 * 2.0F, -this.c, this.i);
      }
      paramCanvas.restoreToCount(i2);
      paramCanvas.translate(0.0F, -this.m / 2.0F);
      b.a(paramCanvas, this.j, this.c, this.g);
      return;
      this.k.reset();
      break;
      label906:
      i2 = 0;
      break label505;
      label912:
      i1 = 0;
    }
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final boolean getPadding(Rect paramRect)
  {
    int i1 = (int)Math.ceil(a(this.d, this.c, this.e));
    int i2 = (int)Math.ceil(b(this.d, this.c, this.e));
    paramRect.set(i2, i1, i2, i1);
    return true;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.n = true;
  }
  
  public final void setAlpha(int paramInt)
  {
    this.g.setAlpha(paramInt);
    this.h.setAlpha(paramInt);
    this.i.setAlpha(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.g.setColorFilter(paramColorFilter);
    this.h.setColorFilter(paramColorFilter);
    this.i.setColorFilter(paramColorFilter);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
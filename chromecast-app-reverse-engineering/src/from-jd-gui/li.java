import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

public final class li
  extends Drawable
  implements Animatable
{
  private static final Interpolator c = new LinearInterpolator();
  private static final Interpolator d = new kc();
  public final lm a;
  boolean b;
  private final int[] e = { -16777216 };
  private final ArrayList f = new ArrayList();
  private float g;
  private Resources h;
  private View i;
  private Animation j;
  private float k;
  private double l;
  private double m;
  private final Drawable.Callback n = new ll(this);
  
  public li(Context paramContext, View paramView)
  {
    this.i = paramView;
    this.h = paramContext.getResources();
    this.a = new lm(this.n);
    this.a.a(this.e);
    paramContext = this.a;
    float f2 = this.h.getDisplayMetrics().density;
    this.l = (40.0D * f2);
    this.m = (f2 * 40.0D);
    float f1 = (float)2.5D * f2;
    paramContext.g = f1;
    paramContext.b.setStrokeWidth(f1);
    paramContext.d();
    paramContext.q = (f2 * 8.75D);
    paramContext.a(0);
    paramContext.r = ((int)(10.0F * f2));
    paramContext.s = ((int)(5.0F * f2));
    f1 = Math.min((int)this.l, (int)this.m);
    if ((paramContext.q <= 0.0D) || (f1 < 0.0F)) {}
    for (f1 = (float)Math.ceil(paramContext.g / 2.0F);; f1 = (float)(f1 / 2.0F - paramContext.q))
    {
      paramContext.h = f1;
      paramContext = this.a;
      paramView = new lj(this, paramContext);
      paramView.setRepeatCount(-1);
      paramView.setRepeatMode(1);
      paramView.setInterpolator(c);
      paramView.setAnimationListener(new lk(this, paramContext));
      this.j = paramView;
      return;
    }
  }
  
  private static float a(lm paramlm)
  {
    return (float)Math.toRadians(paramlm.g / (6.283185307179586D * paramlm.q));
  }
  
  private void a(float paramFloat, lm paramlm)
  {
    if (paramFloat > 0.75F)
    {
      paramFloat = (paramFloat - 0.75F) / 0.25F;
      int i1 = paramlm.i[paramlm.j];
      int i5 = paramlm.i[paramlm.a()];
      int i4 = Integer.valueOf(i1).intValue();
      int i2 = i4 >>> 24;
      i1 = i4 >> 16 & 0xFF;
      int i3 = i4 >> 8 & 0xFF;
      i4 &= 0xFF;
      int i8 = Integer.valueOf(i5).intValue();
      int i6 = (int)(((i8 >>> 24) - i2) * paramFloat);
      int i7 = (int)(((i8 >> 16 & 0xFF) - i1) * paramFloat);
      i5 = (int)(((i8 >> 8 & 0xFF) - i3) * paramFloat);
      paramlm.w = ((int)(paramFloat * ((i8 & 0xFF) - i4)) + i4 | i2 + i6 << 24 | i1 + i7 << 16 | i5 + i3 << 8);
    }
  }
  
  public final void a(float paramFloat)
  {
    lm locallm = this.a;
    if (paramFloat != locallm.p)
    {
      locallm.p = paramFloat;
      locallm.d();
    }
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    this.a.a(0.0F);
    this.a.b(paramFloat2);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  final void b(float paramFloat)
  {
    this.g = paramFloat;
    invalidateSelf();
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int i1 = paramCanvas.save();
    paramCanvas.rotate(this.g, localRect.exactCenterX(), localRect.exactCenterY());
    lm locallm = this.a;
    RectF localRectF = locallm.a;
    localRectF.set(localRect);
    localRectF.inset(locallm.h, locallm.h);
    float f3 = 360.0F * (locallm.d + locallm.f);
    float f1 = (locallm.e + locallm.f) * 360.0F - f3;
    locallm.b.setColor(locallm.w);
    paramCanvas.drawArc(localRectF, f3, f1, false, locallm.b);
    if (locallm.n)
    {
      if (locallm.o != null) {
        break label438;
      }
      locallm.o = new Path();
      locallm.o.setFillType(Path.FillType.EVEN_ODD);
    }
    for (;;)
    {
      float f2 = (int)locallm.h / 2;
      float f5 = locallm.p;
      float f6 = (float)(locallm.q * Math.cos(0.0D) + localRect.exactCenterX());
      float f4 = (float)(locallm.q * Math.sin(0.0D) + localRect.exactCenterY());
      locallm.o.moveTo(0.0F, 0.0F);
      locallm.o.lineTo(locallm.r * locallm.p, 0.0F);
      locallm.o.lineTo(locallm.r * locallm.p / 2.0F, locallm.s * locallm.p);
      locallm.o.offset(f6 - f2 * f5, f4);
      locallm.o.close();
      locallm.c.setColor(locallm.w);
      paramCanvas.rotate(f3 + f1 - 5.0F, localRect.exactCenterX(), localRect.exactCenterY());
      paramCanvas.drawPath(locallm.o, locallm.c);
      if (locallm.t < 255)
      {
        locallm.u.setColor(locallm.v);
        locallm.u.setAlpha(255 - locallm.t);
        paramCanvas.drawCircle(localRect.exactCenterX(), localRect.exactCenterY(), localRect.width() / 2, locallm.u);
      }
      paramCanvas.restoreToCount(i1);
      return;
      label438:
      locallm.o.reset();
    }
  }
  
  public final int getAlpha()
  {
    return this.a.t;
  }
  
  public final int getIntrinsicHeight()
  {
    return (int)this.m;
  }
  
  public final int getIntrinsicWidth()
  {
    return (int)this.l;
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final boolean isRunning()
  {
    ArrayList localArrayList = this.f;
    int i2 = localArrayList.size();
    int i1 = 0;
    if (i1 < i2)
    {
      Animation localAnimation = (Animation)localArrayList.get(i1);
      if ((!localAnimation.hasStarted()) || (localAnimation.hasEnded())) {}
    }
    for (boolean bool = true;; bool = false)
    {
      return bool;
      i1++;
      break;
    }
  }
  
  public final void setAlpha(int paramInt)
  {
    this.a.t = paramInt;
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    lm locallm = this.a;
    locallm.b.setColorFilter(paramColorFilter);
    locallm.d();
  }
  
  public final void start()
  {
    this.j.reset();
    this.a.b();
    if (this.a.e != this.a.d)
    {
      this.b = true;
      this.j.setDuration(666L);
      this.i.startAnimation(this.j);
    }
    for (;;)
    {
      return;
      this.a.a(0);
      this.a.c();
      this.j.setDuration(1332L);
      this.i.startAnimation(this.j);
    }
  }
  
  public final void stop()
  {
    this.i.clearAnimation();
    b(0.0F);
    this.a.a(false);
    this.a.a(0);
    this.a.c();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\li.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
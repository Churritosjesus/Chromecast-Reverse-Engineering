package com.google.android.libraries.view.pagingindicator;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import czs;
import czu;
import czv;
import czw;
import czx;
import czy;
import dac;
import dag;
import dah;
import dai;
import hx;
import java.util.Arrays;

@TargetApi(15)
public class PagingIndicator
  extends View
  implements hx
{
  private final Path A;
  private final Path B;
  private final Path C;
  private final RectF D;
  private ValueAnimator E;
  private ValueAnimator[] F;
  private AnimatorSet G;
  private czy H;
  private dac[] I;
  private final Interpolator J;
  private float K;
  private float L;
  private float M;
  private float N;
  private float O;
  private float P;
  private float Q;
  private float R;
  public ViewPager a;
  public hx b;
  private int c;
  private int d;
  private long e;
  private int f;
  private int g;
  private float h;
  private float i;
  private long j;
  private float k;
  private float l;
  private float m;
  private int n;
  private int o;
  private float p;
  private boolean q;
  private float[] r;
  private float[] s;
  private float t;
  private float u;
  private float[] v;
  private boolean w;
  private final Paint x;
  private final Paint y;
  private final Path z;
  
  static
  {
    PagingIndicator.class.getSimpleName();
  }
  
  public PagingIndicator(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public PagingIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PagingIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int i1 = (int)paramContext.getResources().getDisplayMetrics().scaledDensity;
    paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, dai.a, paramInt, 0);
    this.c = paramAttributeSet.getDimensionPixelSize(dai.d, i1 * 8);
    this.h = (this.c / 2);
    this.i = (this.h / 2.0F);
    this.d = paramAttributeSet.getDimensionPixelSize(dai.e, i1 * 12);
    this.e = paramAttributeSet.getInteger(dai.b, 400);
    this.j = (this.e / 2L);
    this.f = paramAttributeSet.getColor(dai.f, -2130706433);
    this.g = paramAttributeSet.getColor(dai.c, -1);
    paramAttributeSet.recycle();
    this.x = new Paint(1);
    this.x.setColor(this.f);
    this.y = new Paint(1);
    this.y.setColor(this.g);
    if (Build.VERSION.SDK_INT >= 21) {}
    for (this.J = AnimationUtils.loadInterpolator(paramContext, 17563661);; this.J = AnimationUtils.loadInterpolator(paramContext, 17432580))
    {
      this.z = new Path();
      this.A = new Path();
      this.B = new Path();
      this.C = new Path();
      this.D = new RectF();
      addOnAttachStateChangeListener(new czs(this));
      return;
    }
  }
  
  private void b()
  {
    int i1 = getPaddingLeft();
    int i2 = getPaddingTop();
    float f1 = i1 + (getWidth() - getPaddingRight() - i1 - d()) / 2;
    float f2 = this.h;
    this.r = new float[this.n];
    for (i1 = 0; i1 < this.n; i1++) {
      this.r[i1] = ((this.c + this.d) * i1 + (f2 + f1));
    }
    this.k = i2;
    this.l = (i2 + this.h);
    this.m = (this.c + i2);
    a();
  }
  
  private void c()
  {
    if (this.n > 0)
    {
      this.s = new float[this.n - 1];
      Arrays.fill(this.s, 0.0F);
      this.v = new float[this.n];
      Arrays.fill(this.v, 0.0F);
      this.t = -1.0F;
      this.u = -1.0F;
      this.q = true;
    }
  }
  
  private int d()
  {
    return this.n * this.c + (this.n - 1) * this.d;
  }
  
  private void e()
  {
    if ((this.E != null) && (this.E.isRunning())) {
      this.E.cancel();
    }
    f();
    if ((this.H != null) && (this.H.isRunning())) {
      this.H.cancel();
    }
    if (this.I != null)
    {
      dac[] arrayOfdac = this.I;
      int i2 = arrayOfdac.length;
      for (int i1 = 0; i1 < i2; i1++) {
        arrayOfdac[i1].cancel();
      }
    }
    c();
  }
  
  private void f()
  {
    if ((this.G != null) && (this.G.isRunning())) {
      this.G.cancel();
    }
  }
  
  public void a()
  {
    if (this.a != null) {}
    for (this.o = this.a.b;; this.o = 0)
    {
      if (this.n > 0) {
        this.p = this.r[this.o];
      }
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.w) {
      if ((paramInt != this.o) && (this.n != 0)) {}
    }
    for (;;)
    {
      if (this.b != null) {
        this.b.a(paramInt);
      }
      return;
      int i3 = this.o;
      this.o = paramInt;
      if (Build.VERSION.SDK_INT >= 16)
      {
        e();
        int i4 = Math.abs(paramInt - i3);
        float f1 = this.r[paramInt];
        Object localObject2 = ValueAnimator.ofFloat(new float[] { this.p, f1 });
        Object localObject1;
        long l1;
        label186:
        int i1;
        if (paramInt > i3)
        {
          localObject1 = new dag(this, f1 - (f1 - this.p) * 0.25F);
          this.H = new czy(this, i3, paramInt, i4, (dah)localObject1);
          ((ValueAnimator)localObject2).addUpdateListener(new czu(this));
          ((ValueAnimator)localObject2).addListener(new czv(this));
          if (!this.q) {
            break label370;
          }
          l1 = this.e / 4L;
          ((ValueAnimator)localObject2).setStartDelay(l1);
          ((ValueAnimator)localObject2).setDuration(this.e * 3L / 4L);
          ((ValueAnimator)localObject2).setInterpolator(this.J);
          this.E = ((ValueAnimator)localObject2);
          this.F = new ValueAnimator[i4];
          i1 = 0;
          label238:
          if (i1 >= i4) {
            break label388;
          }
          localObject2 = this.F;
          if (paramInt <= i3) {
            break label376;
          }
        }
        label370:
        label376:
        for (int i2 = i3 + i1;; i2 = i3 - 1 - i1)
        {
          l1 = i1;
          long l2 = this.e / 8L;
          localObject1 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
          ((ValueAnimator)localObject1).addUpdateListener(new czw(this, i2));
          ((ValueAnimator)localObject1).setDuration(this.j);
          ((ValueAnimator)localObject1).setStartDelay(l1 * l2);
          ((ValueAnimator)localObject1).setInterpolator(this.J);
          localObject2[i1] = localObject1;
          i1++;
          break label238;
          localObject1 = new czx(this, f1 + (this.p - f1) * 0.25F);
          break;
          l1 = 0L;
          break label186;
        }
        label388:
        this.E.start();
        this.G = new AnimatorSet();
        this.G.playTogether(this.F);
        this.G.start();
      }
      else
      {
        a();
        invalidate();
        continue;
        a();
      }
    }
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.b != null) {
      this.b.a(paramInt1, paramFloat, paramInt2);
    }
  }
  
  public final void b(int paramInt)
  {
    if (this.b != null) {
      this.b.b(paramInt);
    }
  }
  
  public void c(int paramInt)
  {
    this.n = paramInt;
    b();
    c();
  }
  
  public void clearAnimation()
  {
    super.clearAnimation();
    if (Build.VERSION.SDK_INT >= 16) {
      e();
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if ((this.a == null) || (this.n == 0)) {}
    for (;;)
    {
      return;
      this.z.rewind();
      int i1 = 0;
      label49:
      label89:
      Path localPath;
      if (i1 < this.n)
      {
        int i2;
        float f1;
        if (i1 == this.n - 1)
        {
          i2 = i1;
          if (Build.VERSION.SDK_INT < 21) {
            break label1401;
          }
          float f3 = this.r[i1];
          float f2 = this.r[i2];
          if (i1 != this.n - 1) {
            break label1390;
          }
          f1 = -1.0F;
          float f4 = this.v[i1];
          this.A.rewind();
          if (((f1 == 0.0F) || (f1 == -1.0F)) && (f4 == 0.0F) && ((i1 != this.o) || (this.q != true))) {
            this.A.addCircle(this.r[i1], this.l, this.h, Path.Direction.CW);
          }
          if ((f1 > 0.0F) && (f1 < 0.5F) && (this.t == -1.0F))
          {
            this.B.rewind();
            this.B.moveTo(f3, this.m);
            this.D.set(f3 - this.h, this.k, this.h + f3, this.m);
            this.B.arcTo(this.D, 90.0F, 180.0F, true);
            this.K = (this.h + f3 + this.d * f1);
            this.L = this.l;
            this.O = (this.i + f3);
            this.P = this.k;
            this.Q = this.K;
            this.R = (this.L - this.i);
            this.B.cubicTo(this.O, this.P, this.Q, this.R, this.K, this.L);
            this.M = f3;
            this.N = this.m;
            this.O = this.K;
            this.P = (this.L + this.i);
            this.Q = (this.i + f3);
            this.R = this.m;
            this.B.cubicTo(this.O, this.P, this.Q, this.R, this.M, this.N);
            if (Build.VERSION.SDK_INT >= 21) {
              this.A.op(this.B, Path.Op.UNION);
            }
            this.C.rewind();
            this.C.moveTo(f2, this.m);
            this.D.set(f2 - this.h, this.k, this.h + f2, this.m);
            this.C.arcTo(this.D, 90.0F, -180.0F, true);
            this.K = (f2 - this.h - this.d * f1);
            this.L = this.l;
            this.O = (f2 - this.i);
            this.P = this.k;
            this.Q = this.K;
            this.R = (this.L - this.i);
            this.C.cubicTo(this.O, this.P, this.Q, this.R, this.K, this.L);
            this.M = f2;
            this.N = this.m;
            this.O = this.K;
            this.P = (this.L + this.i);
            this.Q = (this.M - this.i);
            this.R = this.m;
            this.C.cubicTo(this.O, this.P, this.Q, this.R, this.M, this.N);
            if (Build.VERSION.SDK_INT >= 21) {
              this.A.op(this.C, Path.Op.UNION);
            }
          }
          if ((f1 > 0.5F) && (f1 < 1.0F) && (this.t == -1.0F))
          {
            this.A.moveTo(f3, this.m);
            this.D.set(f3 - this.h, this.k, this.h + f3, this.m);
            this.A.arcTo(this.D, 90.0F, 180.0F, true);
            this.K = (this.h + f3 + this.d / 2);
            this.L = (this.l - this.h * f1);
            this.O = (this.K - this.h * f1);
            this.P = this.k;
            this.Q = (this.K - (1.0F - f1) * this.h);
            this.R = this.L;
            this.A.cubicTo(this.O, this.P, this.Q, this.R, this.K, this.L);
            this.M = f2;
            this.N = this.k;
            this.O = (this.K + (1.0F - f1) * this.h);
            this.P = this.L;
            this.Q = (this.K + this.h * f1);
            this.R = this.k;
            this.A.cubicTo(this.O, this.P, this.Q, this.R, this.M, this.N);
            this.D.set(f2 - this.h, this.k, this.h + f2, this.m);
            this.A.arcTo(this.D, 270.0F, 180.0F, true);
            this.L = (this.l + this.h * f1);
            this.O = (this.K + this.h * f1);
            this.P = this.m;
            this.Q = (this.K + (1.0F - f1) * this.h);
            this.R = this.L;
            this.A.cubicTo(this.O, this.P, this.Q, this.R, this.K, this.L);
            this.M = f3;
            this.N = this.m;
            this.O = (this.K - (1.0F - f1) * this.h);
            this.P = this.L;
            this.Q = (this.K - this.h * f1);
            this.R = this.N;
            this.A.cubicTo(this.O, this.P, this.Q, this.R, this.M, this.N);
          }
          if ((f1 == 1.0F) && (this.t == -1.0F))
          {
            this.D.set(f3 - this.h, this.k, this.h + f2, this.m);
            this.A.addRoundRect(this.D, this.h, this.h, Path.Direction.CW);
          }
          if (f4 > 1.0E-5F) {
            this.A.addCircle(f3, this.l, this.h * f4, Path.Direction.CW);
          }
          localPath = this.A;
          this.z.op(localPath, Path.Op.UNION);
        }
        for (;;)
        {
          i1++;
          break;
          i2 = i1 + 1;
          break label49;
          label1390:
          f1 = this.s[i1];
          break label89;
          label1401:
          paramCanvas.drawCircle(this.r[i1], this.l, this.h, this.x);
        }
      }
      if ((this.t != -1.0F) && (Build.VERSION.SDK_INT >= 21))
      {
        localPath = this.z;
        this.A.rewind();
        this.D.set(this.t, this.k, this.u, this.m);
        this.A.addRoundRect(this.D, this.h, this.h, Path.Direction.CW);
        localPath.op(this.A, Path.Op.UNION);
      }
      paramCanvas.drawPath(this.z, this.x);
      paramCanvas.drawCircle(this.p, this.l, this.h, this.y);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = getPaddingTop() + this.c + getPaddingBottom();
    switch (View.MeasureSpec.getMode(paramInt2))
    {
    default: 
      paramInt2 = i1;
      i1 = getPaddingLeft() + d() + getPaddingRight();
      switch (View.MeasureSpec.getMode(paramInt1))
      {
      default: 
        paramInt1 = i1;
      }
      break;
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      b();
      return;
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      break;
      paramInt2 = Math.min(i1, View.MeasureSpec.getSize(paramInt2));
      break;
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
      continue;
      paramInt1 = Math.min(i1, View.MeasureSpec.getSize(paramInt1));
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    setMeasuredDimension(paramInt1, paramInt2);
    b();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\libraries\view\pagingindicator\PagingIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
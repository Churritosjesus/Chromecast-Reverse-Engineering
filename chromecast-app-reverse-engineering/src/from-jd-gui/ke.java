import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class ke
  implements View.OnTouchListener
{
  private static final int q = ;
  private final kf a = new kf();
  private final Interpolator b = new AccelerateInterpolator();
  private final View c;
  private Runnable d;
  private float[] e = { 0.0F, 0.0F };
  private float[] f = { Float.MAX_VALUE, Float.MAX_VALUE };
  private int g;
  private int h;
  private float[] i = { 0.0F, 0.0F };
  private float[] j = { 0.0F, 0.0F };
  private float[] k = { Float.MAX_VALUE, Float.MAX_VALUE };
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private boolean p;
  
  public ke(View paramView)
  {
    this.c = paramView;
    paramView = Resources.getSystem().getDisplayMetrics();
    int i1 = (int)(1575.0F * paramView.density + 0.5F);
    int i2 = (int)(paramView.density * 315.0F + 0.5F);
    float f2 = i1;
    float f1 = i1;
    this.k[0] = (f2 / 1000.0F);
    this.k[1] = (f1 / 1000.0F);
    f1 = i2;
    f2 = i2;
    this.j[0] = (f1 / 1000.0F);
    this.j[1] = (f2 / 1000.0F);
    this.g = 1;
    this.f[0] = Float.MAX_VALUE;
    this.f[1] = Float.MAX_VALUE;
    this.e[0] = 0.2F;
    this.e[1] = 0.2F;
    this.i[0] = 0.001F;
    this.i[1] = 0.001F;
    this.h = q;
    this.a.a = 500;
    this.a.b = 500;
  }
  
  private float a(float paramFloat1, float paramFloat2)
  {
    float f2 = 0.0F;
    float f1;
    if (paramFloat2 == 0.0F) {
      f1 = f2;
    }
    for (;;)
    {
      return f1;
      switch (this.g)
      {
      default: 
        f1 = f2;
        break;
      case 0: 
      case 1: 
        f1 = f2;
        if (paramFloat1 < paramFloat2) {
          if (paramFloat1 >= 0.0F)
          {
            f1 = 1.0F - paramFloat1 / paramFloat2;
          }
          else
          {
            f1 = f2;
            if (this.o)
            {
              f1 = f2;
              if (this.g == 1) {
                f1 = 1.0F;
              }
            }
          }
        }
        break;
      case 2: 
        f1 = f2;
        if (paramFloat1 < 0.0F) {
          f1 = paramFloat1 / -paramFloat2;
        }
        break;
      }
    }
  }
  
  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f2 = b(this.e[paramInt] * paramFloat2, 0.0F, this.f[paramInt]);
    float f1 = a(paramFloat1, f2);
    paramFloat1 = a(paramFloat2 - paramFloat1, f2) - f1;
    if (paramFloat1 < 0.0F)
    {
      paramFloat1 = -this.b.getInterpolation(-paramFloat1);
      paramFloat1 = b(paramFloat1, -1.0F, 1.0F);
      label69:
      if (paramFloat1 != 0.0F) {
        break label104;
      }
      paramFloat1 = 0.0F;
    }
    for (;;)
    {
      return paramFloat1;
      if (paramFloat1 > 0.0F)
      {
        paramFloat1 = this.b.getInterpolation(paramFloat1);
        break;
      }
      paramFloat1 = 0.0F;
      break label69;
      label104:
      f2 = this.i[paramInt];
      f1 = this.j[paramInt];
      paramFloat2 = this.k[paramInt];
      paramFloat3 = f2 * paramFloat3;
      if (paramFloat1 > 0.0F) {
        paramFloat1 = b(paramFloat1 * paramFloat3, f1, paramFloat2);
      } else {
        paramFloat1 = -b(-paramFloat1 * paramFloat3, f1, paramFloat2);
      }
    }
  }
  
  private boolean a()
  {
    kf localkf = this.a;
    int i2 = (int)(localkf.d / Math.abs(localkf.d));
    int i1 = (int)(localkf.c / Math.abs(localkf.c));
    if ((i2 == 0) || (!b(i2))) {
      if (i1 == 0) {}
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  private static float b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3) {}
    for (;;)
    {
      return paramFloat3;
      if (paramFloat1 < paramFloat2) {
        paramFloat3 = paramFloat2;
      } else {
        paramFloat3 = paramFloat1;
      }
    }
  }
  
  private void b()
  {
    if (this.m)
    {
      this.o = false;
      return;
    }
    kf localkf = this.a;
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    int i2 = (int)(l1 - localkf.e);
    int i1 = localkf.b;
    if (i2 > i1) {}
    for (;;)
    {
      localkf.k = i1;
      localkf.j = localkf.a(l1);
      localkf.i = l1;
      break;
      if (i2 < 0) {
        i1 = 0;
      } else {
        i1 = i2;
      }
    }
  }
  
  public final ke a(boolean paramBoolean)
  {
    if ((this.p) && (!paramBoolean)) {
      b();
    }
    this.p = paramBoolean;
    return this;
  }
  
  public abstract void a(int paramInt);
  
  public abstract boolean b(int paramInt);
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!this.p) {}
    for (;;)
    {
      return false;
      switch (gd.a(paramMotionEvent))
      {
      default: 
        break;
      case 0: 
        this.n = true;
        this.l = false;
      case 2: 
        float f2 = a(0, paramMotionEvent.getX(), paramView.getWidth(), this.c.getWidth());
        float f1 = a(1, paramMotionEvent.getY(), paramView.getHeight(), this.c.getHeight());
        paramView = this.a;
        paramView.c = f2;
        paramView.d = f1;
        if ((!this.o) && (a()))
        {
          if (this.d == null) {
            this.d = new kg(this);
          }
          this.o = true;
          this.m = true;
          if ((!this.l) && (this.h > 0)) {
            gt.a(this.c, this.d, this.h);
          }
          for (;;)
          {
            this.l = true;
            break;
            this.d.run();
          }
        }
        break;
      case 1: 
      case 3: 
        b();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
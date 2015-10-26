import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;

public final class lr
{
  public Object a;
  public ls b;
  
  private lr(int paramInt, Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInt >= 14) {
      this.b = new lv();
    }
    for (;;)
    {
      this.a = this.b.a(paramContext, paramInterpolator);
      return;
      if (paramInt >= 9) {
        this.b = new lu();
      } else {
        this.b = new lt();
      }
    }
  }
  
  private lr(Context paramContext, Interpolator paramInterpolator)
  {
    this(Build.VERSION.SDK_INT, paramContext, paramInterpolator);
  }
  
  public static lr a(Context paramContext, Interpolator paramInterpolator)
  {
    return new lr(paramContext, paramInterpolator);
  }
  
  public final int a()
  {
    return this.b.b(this.a);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.b.a(this.a, 0, 0, paramInt3, paramInt4, paramInt5, paramInt6, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  
  public final int b()
  {
    return this.b.c(this.a);
  }
  
  public final int c()
  {
    return this.b.g(this.a);
  }
  
  public final int d()
  {
    return this.b.h(this.a);
  }
  
  public final boolean e()
  {
    return this.b.e(this.a);
  }
  
  public final void f()
  {
    this.b.f(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\lr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class ih
{
  public static final iq b;
  public WeakReference a;
  private Runnable c = null;
  private Runnable d = null;
  private int e = -1;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      b = new ip();
    }
    for (;;)
    {
      return;
      if (i >= 19) {
        b = new io();
      } else if (i >= 18) {
        b = new im();
      } else if (i >= 16) {
        b = new in();
      } else if (i >= 14) {
        b = new ik();
      } else {
        b = new ii();
      }
    }
  }
  
  ih(View paramView)
  {
    this.a = new WeakReference(paramView);
  }
  
  public final ih a(float paramFloat)
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      b.a(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ih a(long paramLong)
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      b.a(localView, paramLong);
    }
    return this;
  }
  
  public final ih a(Interpolator paramInterpolator)
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      b.a(localView, paramInterpolator);
    }
    return this;
  }
  
  public final ih a(iu paramiu)
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      b.a(this, localView, paramiu);
    }
    return this;
  }
  
  public final ih a(iw paramiw)
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      b.a(localView, paramiw);
    }
    return this;
  }
  
  public final void a()
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      b.a(this, localView);
    }
  }
  
  public final ih b(float paramFloat)
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      b.b(this, localView, paramFloat);
    }
    return this;
  }
  
  public final void b()
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      b.b(this, localView);
    }
  }
  
  public final ih c(float paramFloat)
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      b.c(this, localView, paramFloat);
    }
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
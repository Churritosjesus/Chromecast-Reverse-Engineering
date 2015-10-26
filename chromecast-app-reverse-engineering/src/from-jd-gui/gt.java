import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class gt
{
  private static hd a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      a = new hc();
    }
    for (;;)
    {
      return;
      if (i >= 19) {
        a = new hb();
      } else if (i >= 17) {
        a = new ha();
      } else if (i >= 16) {
        a = new gz();
      } else if (i >= 14) {
        a = new gy();
      } else if (i >= 11) {
        a = new gx();
      } else if (i >= 9) {
        a = new gw();
      } else if (i >= 7) {
        a = new gv();
      } else {
        a = new gu();
      }
    }
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a.a(paramInt1, paramInt2, paramInt3);
  }
  
  public static int a(View paramView)
  {
    return a.a(paramView);
  }
  
  public static ix a(View paramView, ix paramix)
  {
    return a.a(paramView, paramix);
  }
  
  public static void a(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }
  
  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    a.a(paramView, paramInt, paramPaint);
  }
  
  public static void a(View paramView, er paramer)
  {
    a.a(paramView, paramer);
  }
  
  public static void a(View paramView, gm paramgm)
  {
    a.a(paramView, paramgm);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    a.a(paramView, paramRunnable, paramLong);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    a.a(paramView, false);
  }
  
  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, true);
  }
  
  public static boolean a(View paramView, int paramInt)
  {
    return a.a(paramView, paramInt);
  }
  
  public static void b(View paramView, float paramFloat)
  {
    a.b(paramView, paramFloat);
  }
  
  public static void b(View paramView, boolean paramBoolean)
  {
    a.b(paramView, paramBoolean);
  }
  
  public static boolean b(View paramView)
  {
    return a.b(paramView);
  }
  
  public static boolean b(View paramView, int paramInt)
  {
    return a.b(paramView, paramInt);
  }
  
  public static void c(View paramView, float paramFloat)
  {
    a.c(paramView, paramFloat);
  }
  
  public static void c(View paramView, int paramInt)
  {
    a.c(paramView, paramInt);
  }
  
  public static boolean c(View paramView)
  {
    return a.c(paramView);
  }
  
  public static void d(View paramView)
  {
    a.d(paramView);
  }
  
  public static void d(View paramView, float paramFloat)
  {
    a.d(paramView, paramFloat);
  }
  
  public static int e(View paramView)
  {
    return a.e(paramView);
  }
  
  public static void e(View paramView, float paramFloat)
  {
    a.e(paramView, paramFloat);
  }
  
  public static float f(View paramView)
  {
    return a.f(paramView);
  }
  
  public static void f(View paramView, float paramFloat)
  {
    a.f(paramView, paramFloat);
  }
  
  public static int g(View paramView)
  {
    return a.g(paramView);
  }
  
  public static ViewParent h(View paramView)
  {
    return a.h(paramView);
  }
  
  public static int i(View paramView)
  {
    return a.i(paramView);
  }
  
  public static int j(View paramView)
  {
    return a.j(paramView);
  }
  
  public static float k(View paramView)
  {
    return a.k(paramView);
  }
  
  public static float l(View paramView)
  {
    return a.l(paramView);
  }
  
  public static int m(View paramView)
  {
    return a.m(paramView);
  }
  
  public static int n(View paramView)
  {
    return a.n(paramView);
  }
  
  public static ih o(View paramView)
  {
    return a.o(paramView);
  }
  
  public static int p(View paramView)
  {
    return a.p(paramView);
  }
  
  public static void q(View paramView)
  {
    a.q(paramView);
  }
  
  public static boolean r(View paramView)
  {
    return a.r(paramView);
  }
  
  public static void s(View paramView)
  {
    a.s(paramView);
  }
  
  public static void t(View paramView)
  {
    a.t(paramView);
  }
  
  public static boolean u(View paramView)
  {
    return a.u(paramView);
  }
  
  public static boolean v(View paramView)
  {
    return a.v(paramView);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\gt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
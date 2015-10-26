import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

class gu
  implements hd
{
  WeakHashMap a = null;
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSize(paramInt1, paramInt2);
  }
  
  public int a(View paramView)
  {
    return 2;
  }
  
  long a()
  {
    return 10L;
  }
  
  public ix a(View paramView, ix paramix)
  {
    return paramix;
  }
  
  public void a(View paramView, float paramFloat) {}
  
  public void a(View paramView, int paramInt, Paint paramPaint) {}
  
  public void a(View paramView, er paramer) {}
  
  public void a(View paramView, gm paramgm) {}
  
  public void a(View paramView, Runnable paramRunnable)
  {
    paramView.postDelayed(paramRunnable, a());
  }
  
  public void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postDelayed(paramRunnable, a() + paramLong);
  }
  
  public void a(View paramView, boolean paramBoolean) {}
  
  public void a(ViewGroup paramViewGroup, boolean paramBoolean) {}
  
  public boolean a(View paramView, int paramInt)
  {
    boolean bool = true;
    int i;
    int j;
    if ((paramView instanceof go))
    {
      paramView = (go)paramView;
      i = paramView.computeHorizontalScrollOffset();
      j = paramView.computeHorizontalScrollRange() - paramView.computeHorizontalScrollExtent();
      if (j != 0) {
        if (paramInt < 0) {
          if (i > 0)
          {
            paramInt = 1;
            if (paramInt == 0) {
              break label82;
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      paramInt = 0;
      break;
      if (i < j - 1)
      {
        paramInt = 1;
        break;
      }
      paramInt = 0;
      break;
      label82:
      bool = false;
    }
  }
  
  public void b(View paramView, float paramFloat) {}
  
  public void b(View paramView, boolean paramBoolean) {}
  
  public boolean b(View paramView)
  {
    return false;
  }
  
  public boolean b(View paramView, int paramInt)
  {
    boolean bool = true;
    int j;
    int i;
    if ((paramView instanceof go))
    {
      paramView = (go)paramView;
      j = paramView.computeVerticalScrollOffset();
      i = paramView.computeVerticalScrollRange() - paramView.computeVerticalScrollExtent();
      if (i != 0) {
        if (paramInt < 0) {
          if (j > 0)
          {
            paramInt = 1;
            if (paramInt == 0) {
              break label82;
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      paramInt = 0;
      break;
      if (j < i - 1)
      {
        paramInt = 1;
        break;
      }
      paramInt = 0;
      break;
      label82:
      bool = false;
    }
  }
  
  public void c(View paramView, float paramFloat) {}
  
  public void c(View paramView, int paramInt) {}
  
  public boolean c(View paramView)
  {
    return false;
  }
  
  public void d(View paramView)
  {
    paramView.invalidate();
  }
  
  public void d(View paramView, float paramFloat) {}
  
  public int e(View paramView)
  {
    return 0;
  }
  
  public void e(View paramView, float paramFloat) {}
  
  public float f(View paramView)
  {
    return 1.0F;
  }
  
  public void f(View paramView, float paramFloat) {}
  
  public int g(View paramView)
  {
    return 0;
  }
  
  public ViewParent h(View paramView)
  {
    return paramView.getParent();
  }
  
  public int i(View paramView)
  {
    return paramView.getMeasuredWidth();
  }
  
  public int j(View paramView)
  {
    return 0;
  }
  
  public float k(View paramView)
  {
    return 0.0F;
  }
  
  public float l(View paramView)
  {
    return 0.0F;
  }
  
  public int m(View paramView)
  {
    return a.b(paramView);
  }
  
  public int n(View paramView)
  {
    return a.c(paramView);
  }
  
  public ih o(View paramView)
  {
    return new ih(paramView);
  }
  
  public int p(View paramView)
  {
    return 0;
  }
  
  public void q(View paramView) {}
  
  public boolean r(View paramView)
  {
    return false;
  }
  
  public void s(View paramView) {}
  
  public void t(View paramView)
  {
    if ((paramView instanceof gi)) {
      ((gi)paramView).stopNestedScroll();
    }
  }
  
  public boolean u(View paramView)
  {
    if ((paramView.getWidth() > 0) && (paramView.getHeight() > 0)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean v(View paramView)
  {
    if (paramView.getWindowToken() != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\gu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
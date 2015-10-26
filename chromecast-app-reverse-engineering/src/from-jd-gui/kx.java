import android.support.v4.widget.DrawerLayout;
import android.view.View;

public final class kx
  extends mi
{
  final int a;
  public mf b;
  private final Runnable d = new ky(this);
  
  public kx(DrawerLayout paramDrawerLayout, int paramInt)
  {
    this.a = paramInt;
  }
  
  public final void a()
  {
    this.c.removeCallbacks(this.d);
  }
  
  public final void a(int paramInt)
  {
    DrawerLayout localDrawerLayout = this.c;
    View localView = this.b.m;
    int j = localDrawerLayout.b.a;
    int i = localDrawerLayout.c.a;
    ku localku;
    if ((j == 1) || (i == 1))
    {
      i = 1;
      if ((localView != null) && (paramInt == 0))
      {
        localku = (ku)localView.getLayoutParams();
        if (localku.b != 0.0F) {
          break label180;
        }
        localku = (ku)localView.getLayoutParams();
        if (localku.d)
        {
          localku.d = false;
          if (localDrawerLayout.f != null) {
            localDrawerLayout.f.b();
          }
          localDrawerLayout.a(localView, false);
          if (localDrawerLayout.hasWindowFocus())
          {
            localView = localDrawerLayout.getRootView();
            if (localView != null) {
              localView.sendAccessibilityEvent(32);
            }
          }
        }
      }
    }
    for (;;)
    {
      if (i != localDrawerLayout.d) {
        localDrawerLayout.d = i;
      }
      return;
      if ((j == 2) || (i == 2))
      {
        i = 2;
        break;
      }
      i = 0;
      break;
      label180:
      if (localku.b == 1.0F)
      {
        localku = (ku)localView.getLayoutParams();
        if (!localku.d)
        {
          localku.d = true;
          if (localDrawerLayout.f != null) {
            localDrawerLayout.f.a();
          }
          localDrawerLayout.a(localView, true);
          if (localDrawerLayout.hasWindowFocus()) {
            localDrawerLayout.sendAccessibilityEvent(32);
          }
          localView.requestFocus();
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & 0x1) == 1) {}
    for (View localView = this.c.b(3);; localView = this.c.b(5))
    {
      if ((localView != null) && (this.c.a(localView) == 0)) {
        this.b.a(localView, paramInt2);
      }
      return;
    }
  }
  
  public final void a(View paramView, float paramFloat)
  {
    float f = DrawerLayout.b(paramView);
    int k = paramView.getWidth();
    int i;
    if (this.c.a(paramView, 3)) {
      if ((paramFloat > 0.0F) || ((paramFloat == 0.0F) && (f > 0.5F))) {
        i = 0;
      }
    }
    mf localmf;
    int j;
    for (;;)
    {
      localmf = this.b;
      j = paramView.getTop();
      if (localmf.n) {
        break;
      }
      throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
      i = -k;
      continue;
      j = this.c.getWidth();
      if (paramFloat >= 0.0F)
      {
        i = j;
        if (paramFloat == 0.0F)
        {
          i = j;
          if (f <= 0.5F) {}
        }
      }
      else
      {
        i = j - k;
      }
    }
    localmf.a(i, j, (int)gp.a(localmf.i, localmf.c), (int)gp.b(localmf.i, localmf.c));
    this.c.invalidate();
  }
  
  public final void a(View paramView, int paramInt)
  {
    int i = paramView.getWidth();
    float f;
    if (this.c.a(paramView, 3))
    {
      f = (i + paramInt) / i;
      this.c.a(paramView, f);
      if (f != 0.0F) {
        break label76;
      }
    }
    label76:
    for (paramInt = 4;; paramInt = 0)
    {
      paramView.setVisibility(paramInt);
      this.c.invalidate();
      return;
      f = (this.c.getWidth() - paramInt) / i;
      break;
    }
  }
  
  public final boolean a(View paramView)
  {
    if ((DrawerLayout.d(paramView)) && (this.c.a(paramView, this.a)) && (this.c.a(paramView) == 0)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final int b(View paramView, int paramInt)
  {
    if (this.c.a(paramView, 3)) {}
    int i;
    for (paramInt = Math.max(-paramView.getWidth(), Math.min(paramInt, 0));; paramInt = Math.max(i - paramView.getWidth(), Math.min(paramInt, i)))
    {
      return paramInt;
      i = this.c.getWidth();
    }
  }
  
  void b()
  {
    int i = 3;
    if (this.a == 3) {
      i = 5;
    }
    View localView = this.c.b(i);
    if (localView != null) {
      this.c.f(localView);
    }
  }
  
  public final void b(View paramView)
  {
    ((ku)paramView.getLayoutParams()).c = false;
    b();
  }
  
  public final int c(View paramView)
  {
    if (DrawerLayout.d(paramView)) {}
    for (int i = paramView.getWidth();; i = 0) {
      return i;
    }
  }
  
  public final void c()
  {
    this.c.postDelayed(this.d, 160L);
  }
  
  public final int d(View paramView)
  {
    return paramView.getTop();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\kx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
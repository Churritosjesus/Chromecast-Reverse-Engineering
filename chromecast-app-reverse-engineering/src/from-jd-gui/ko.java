import android.graphics.Rect;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public final class ko
  extends er
{
  private final Rect b = new Rect();
  
  public ko(DrawerLayout paramDrawerLayout) {}
  
  public final void a(View paramView, jd paramjd)
  {
    if (DrawerLayout.b()) {
      super.a(paramView, paramjd);
    }
    for (;;)
    {
      paramjd.a(DrawerLayout.class.getName());
      paramjd.a(false);
      paramjd.b(false);
      return;
      Object localObject1 = jd.a(paramjd);
      super.a(paramView, (jd)localObject1);
      jd.a.c(paramjd.b, paramView);
      Object localObject2 = gt.h(paramView);
      if ((localObject2 instanceof View)) {
        paramjd.a((View)localObject2);
      }
      localObject2 = this.b;
      ((jd)localObject1).a((Rect)localObject2);
      jd.a.c(paramjd.b, (Rect)localObject2);
      ((jd)localObject1).b((Rect)localObject2);
      jd.a.d(paramjd.b, (Rect)localObject2);
      boolean bool = jd.a.r(((jd)localObject1).b);
      jd.a.h(paramjd.b, bool);
      localObject2 = ((jd)localObject1).h();
      jd.a.c(paramjd.b, (CharSequence)localObject2);
      paramjd.a(((jd)localObject1).i());
      localObject2 = ((jd)localObject1).j();
      jd.a.b(paramjd.b, (CharSequence)localObject2);
      bool = ((jd)localObject1).g();
      jd.a.b(paramjd.b, bool);
      bool = ((jd)localObject1).e();
      jd.a.a(paramjd.b, bool);
      paramjd.a(((jd)localObject1).b());
      paramjd.b(((jd)localObject1).c());
      bool = jd.a.s(((jd)localObject1).b);
      jd.a.i(paramjd.b, bool);
      bool = ((jd)localObject1).d();
      jd.a.g(paramjd.b, bool);
      bool = ((jd)localObject1).f();
      jd.a.e(paramjd.b, bool);
      paramjd.a(((jd)localObject1).a());
      jd.a.q(((jd)localObject1).b);
      paramView = (ViewGroup)paramView;
      int j = paramView.getChildCount();
      for (int i = 0; i < j; i++)
      {
        localObject1 = paramView.getChildAt(i);
        if (DrawerLayout.i((View)localObject1)) {
          jd.a.a(paramjd.b, (View)localObject1);
        }
      }
    }
  }
  
  public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if ((DrawerLayout.b()) || (DrawerLayout.i(paramView))) {}
    for (boolean bool = super.a(paramViewGroup, paramView, paramAccessibilityEvent);; bool = false) {
      return bool;
    }
  }
  
  public final boolean b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() == 32)
    {
      paramView = paramAccessibilityEvent.getText();
      paramAccessibilityEvent = DrawerLayout.a(this.c);
      if ((paramAccessibilityEvent != null) && ((fe.a(this.c.c(paramAccessibilityEvent), gt.g(this.c)) == 3) || (0 != 0))) {
        paramView.add(null);
      }
    }
    for (boolean bool = true;; bool = super.b(paramView, paramAccessibilityEvent)) {
      return bool;
    }
  }
  
  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(DrawerLayout.class.getName());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ko.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
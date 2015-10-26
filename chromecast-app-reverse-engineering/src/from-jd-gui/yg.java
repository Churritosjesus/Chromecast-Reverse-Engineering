import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.PopupWindow;

public abstract class yg
  implements View.OnTouchListener
{
  private final float a;
  private final int b;
  private final int c;
  private final View d;
  private Runnable e;
  private Runnable f;
  private boolean g;
  private boolean h;
  private int i;
  private final int[] j = new int[2];
  
  public yg(View paramView)
  {
    this.d = paramView;
    this.a = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.b = ViewConfiguration.getTapTimeout();
    this.c = ((this.b + ViewConfiguration.getLongPressTimeout()) / 2);
  }
  
  private boolean a(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    Object localObject2 = this.d;
    Object localObject1 = a();
    if ((localObject1 == null) || (!((yc)localObject1).b.isShowing())) {
      bool1 = false;
    }
    label171:
    for (;;)
    {
      return bool1;
      yf localyf = yc.a((yc)localObject1);
      if ((localyf == null) || (!localyf.isShown()))
      {
        bool1 = false;
      }
      else
      {
        localObject1 = MotionEvent.obtainNoHistory(paramMotionEvent);
        int[] arrayOfInt = this.j;
        ((View)localObject2).getLocationOnScreen(arrayOfInt);
        ((MotionEvent)localObject1).offsetLocation(arrayOfInt[0], arrayOfInt[1]);
        localObject2 = this.j;
        localyf.getLocationOnScreen((int[])localObject2);
        ((MotionEvent)localObject1).offsetLocation(-localObject2[0], -localObject2[1]);
        boolean bool2 = localyf.a((MotionEvent)localObject1, this.i);
        ((MotionEvent)localObject1).recycle();
        int k = gd.a(paramMotionEvent);
        if ((k != 1) && (k != 3)) {}
        for (k = 1;; k = 0)
        {
          if ((bool2) && (k != 0)) {
            break label171;
          }
          bool1 = false;
          break;
        }
      }
    }
  }
  
  private void d()
  {
    if (this.f != null) {
      this.d.removeCallbacks(this.f);
    }
    if (this.e != null) {
      this.d.removeCallbacks(this.e);
    }
  }
  
  public abstract yc a();
  
  public boolean b()
  {
    yc localyc = a();
    if ((localyc != null) && (!localyc.b.isShowing())) {
      localyc.c();
    }
    return true;
  }
  
  public boolean c()
  {
    yc localyc = a();
    if ((localyc != null) && (localyc.b.isShowing())) {
      localyc.a();
    }
    return true;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    boolean bool3 = this.g;
    if (bool3)
    {
      if (this.h) {
        bool1 = a(paramMotionEvent);
      }
      for (;;)
      {
        this.g = bool1;
        if (!bool1)
        {
          bool1 = bool2;
          if (!bool3) {}
        }
        else
        {
          bool1 = true;
        }
        return bool1;
        if ((a(paramMotionEvent)) || (!c())) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
    }
    paramView = this.d;
    if (paramView.isEnabled()) {}
    label128:
    int k;
    switch (gd.a(paramMotionEvent))
    {
    default: 
      k = 0;
      label131:
      if ((k == 0) || (!b())) {
        break;
      }
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      if (bool1)
      {
        long l = SystemClock.uptimeMillis();
        paramView = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        this.d.onTouchEvent(paramView);
        paramView.recycle();
      }
      break;
      this.i = paramMotionEvent.getPointerId(0);
      this.h = false;
      if (this.e == null) {
        this.e = new yh(this);
      }
      paramView.postDelayed(this.e, this.b);
      if (this.f == null) {
        this.f = new yi(this);
      }
      paramView.postDelayed(this.f, this.c);
      break label128;
      k = paramMotionEvent.findPointerIndex(this.i);
      if (k < 0) {
        break label128;
      }
      float f2 = paramMotionEvent.getX(k);
      float f1 = paramMotionEvent.getY(k);
      float f3 = this.a;
      if ((f2 >= -f3) && (f1 >= -f3) && (f2 < paramView.getRight() - paramView.getLeft() + f3) && (f1 < paramView.getBottom() - paramView.getTop() + f3)) {}
      for (k = 1; k == 0; k = 0)
      {
        d();
        paramView.getParent().requestDisallowInterceptTouchEvent(true);
        k = 1;
        break label131;
      }
      d();
      break label128;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
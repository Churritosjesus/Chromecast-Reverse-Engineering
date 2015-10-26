import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

public abstract class rx
  extends ViewGroup
{
  private int a;
  private boolean b;
  private boolean c;
  private sa d;
  @ViewDebug.ExportedProperty(category="scrolling")
  int f = 0;
  int g;
  long h = Long.MIN_VALUE;
  boolean i = false;
  int j;
  boolean k = false;
  rz l;
  boolean m;
  @ViewDebug.ExportedProperty(category="list")
  int n = -1;
  long o = Long.MIN_VALUE;
  @ViewDebug.ExportedProperty(category="list")
  int p = -1;
  long q = Long.MIN_VALUE;
  @ViewDebug.ExportedProperty(category="list")
  int r;
  int s;
  int t = -1;
  long u = Long.MIN_VALUE;
  boolean v = false;
  
  rx(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private long a(int paramInt)
  {
    Adapter localAdapter = c();
    if ((localAdapter == null) || (paramInt < 0)) {}
    for (long l1 = Long.MIN_VALUE;; l1 = localAdapter.getItemId(paramInt)) {
      return l1;
    }
  }
  
  public void a(rz paramrz)
  {
    this.l = paramrz;
  }
  
  public final boolean a(View paramView, int paramInt, long paramLong)
  {
    boolean bool2 = true;
    if (this.l != null)
    {
      playSoundEffect(0);
      bool1 = bool2;
      if (paramView != null) {
        paramView.sendAccessibilityEvent(1);
      }
    }
    for (boolean bool1 = bool2;; bool1 = false) {
      return bool1;
    }
  }
  
  public void addView(View paramView)
  {
    throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
  }
  
  public void addView(View paramView, int paramInt)
  {
    throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
  }
  
  public abstract View b();
  
  final void b(int paramInt)
  {
    this.p = paramInt;
    this.q = a(paramInt);
  }
  
  public abstract Adapter c();
  
  final void c(int paramInt)
  {
    this.n = paramInt;
    this.o = a(paramInt);
    if ((this.i) && (this.j == 0) && (paramInt >= 0))
    {
      this.g = paramInt;
      this.h = this.o;
    }
  }
  
  protected boolean canAnimate()
  {
    if ((super.canAnimate()) && (this.r > 0)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  final void d()
  {
    boolean bool2 = true;
    Adapter localAdapter = c();
    int i1;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      i1 = 1;
      if (i1 != 0) {
        break label72;
      }
      i1 = 1;
      label29:
      if ((i1 == 0) || (!this.c)) {
        break label77;
      }
      bool1 = true;
      label42:
      super.setFocusableInTouchMode(bool1);
      if ((i1 == 0) || (!this.b)) {
        break label82;
      }
    }
    label72:
    label77:
    label82:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      super.setFocusable(bool1);
      return;
      i1 = 0;
      break;
      i1 = 0;
      break label29;
      bool1 = false;
      break label42;
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    View localView = b();
    if ((localView != null) && (localView.getVisibility() == 0) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  final void e()
  {
    int i7 = this.r;
    int i8;
    int i1;
    int i5;
    int i3;
    int i4;
    if (i7 > 0) {
      if (this.i)
      {
        this.i = false;
        i8 = this.r;
        if (i8 != 0)
        {
          long l1 = this.h;
          i1 = this.g;
          if (l1 != Long.MIN_VALUE)
          {
            i2 = Math.min(i8 - 1, Math.max(0, i1));
            long l2 = SystemClock.uptimeMillis();
            i5 = 0;
            Adapter localAdapter = c();
            if (localAdapter != null)
            {
              i3 = i2;
              i1 = i2;
              i4 = i2;
              i2 = i5;
              if (SystemClock.uptimeMillis() <= 100L + l2) {
                if (localAdapter.getItemId(i1) == l1)
                {
                  label121:
                  if (i1 < 0) {
                    break label328;
                  }
                  c(i1);
                  i1 = 1;
                  label132:
                  i2 = i1;
                  if (i1 == 0)
                  {
                    i3 = this.n;
                    i2 = i3;
                    if (i3 >= i7) {
                      i2 = i7 - 1;
                    }
                    i3 = i2;
                    if (i2 < 0) {
                      i3 = 0;
                    }
                    if (i3 < 0) {}
                    i2 = i1;
                    if (i3 >= 0)
                    {
                      c(i3);
                      f();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    for (int i2 = 1;; i2 = 0)
    {
      if (i2 == 0)
      {
        this.p = -1;
        this.q = Long.MIN_VALUE;
        this.n = -1;
        this.o = Long.MIN_VALUE;
        this.i = false;
        f();
      }
      return;
      label243:
      int i6;
      if (i4 == i8 - 1)
      {
        i5 = 1;
        if (i3 != 0) {
          break label292;
        }
        i6 = 1;
      }
      for (;;)
      {
        if ((i5 == 0) || (i6 == 0))
        {
          if ((i6 != 0) || ((i2 != 0) && (i5 == 0)))
          {
            i4++;
            i2 = 0;
            i1 = i4;
            break;
            i5 = 0;
            break label243;
            label292:
            i6 = 0;
            continue;
          }
          if ((i5 == 0) && ((i2 != 0) || (i6 != 0))) {
            break;
          }
          i3--;
          i2 = 1;
          i1 = i3;
          break;
        }
      }
      i1 = -1;
      break label121;
      label328:
      i1 = 0;
      break label132;
    }
  }
  
  final void f()
  {
    if ((this.p != this.t) || (this.q != this.u))
    {
      if ((this.p != -1) && (isShown()) && (!isInTouchMode())) {
        sendAccessibilityEvent(4);
      }
      this.t = this.p;
      this.u = this.q;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.d);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = getHeight();
  }
  
  public void removeAllViews()
  {
    throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
  }
  
  public void removeView(View paramView)
  {
    throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
  }
  
  public void removeViewAt(int paramInt)
  {
    throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
  }
  
  public void setFocusable(boolean paramBoolean)
  {
    boolean bool = true;
    Adapter localAdapter = c();
    int i1;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      i1 = 1;
      this.b = paramBoolean;
      if (!paramBoolean) {
        this.c = false;
      }
      if ((!paramBoolean) || (i1 != 0)) {
        break label59;
      }
    }
    label59:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      super.setFocusable(paramBoolean);
      return;
      i1 = 0;
      break;
    }
  }
  
  public void setFocusableInTouchMode(boolean paramBoolean)
  {
    boolean bool = true;
    Adapter localAdapter = c();
    int i1;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      i1 = 1;
      this.c = paramBoolean;
      if (paramBoolean) {
        this.b = true;
      }
      if ((!paramBoolean) || (i1 != 0)) {
        break label59;
      }
    }
    label59:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      super.setFocusableInTouchMode(paramBoolean);
      return;
      i1 = 0;
      break;
    }
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
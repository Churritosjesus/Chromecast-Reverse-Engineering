package android.support.v7.internal.widget;

import a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import gk;
import gl;
import gt;
import ih;
import iu;
import lr;
import qq;
import rf;
import rg;
import rh;
import ri;
import rj;
import rk;
import sd;
import se;
import tm;

public class ActionBarOverlayLayout
  extends ViewGroup
  implements gk, sd
{
  private static int[] C = { a.h, 16842841 };
  private final Runnable A = new rh(this);
  private final Runnable B = new ri(this);
  private final gl D;
  public int a = 0;
  public boolean b;
  public boolean c;
  public int d;
  public rj e;
  private int f;
  private ContentFrameLayout g;
  private ActionBarContainer h;
  private ActionBarContainer i;
  private se j;
  private Drawable k;
  private boolean l;
  private boolean m;
  private boolean n;
  private int o;
  private final Rect p = new Rect();
  private final Rect q = new Rect();
  private final Rect r = new Rect();
  private final Rect s = new Rect();
  private final Rect t = new Rect();
  private final Rect u = new Rect();
  private lr v;
  private ih w;
  private ih x;
  private final iu y = new rf(this);
  private final iu z = new rg(this);
  
  public ActionBarOverlayLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
    this.D = new gl(this);
  }
  
  public static void a() {}
  
  private void a(Context paramContext)
  {
    boolean bool2 = true;
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(C);
    this.f = localTypedArray.getDimensionPixelSize(0, 0);
    this.k = localTypedArray.getDrawable(1);
    if (this.k == null)
    {
      bool1 = true;
      setWillNotDraw(bool1);
      localTypedArray.recycle();
      if (paramContext.getApplicationInfo().targetSdkVersion >= 19) {
        break label89;
      }
    }
    label89:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.l = bool1;
      this.v = lr.a(paramContext, null);
      return;
      bool1 = false;
      break;
    }
  }
  
  private static boolean a(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    boolean bool = true;
    paramBoolean4 = false;
    paramView = (rk)paramView.getLayoutParams();
    if (paramView.leftMargin != paramRect.left)
    {
      paramView.leftMargin = paramRect.left;
      paramBoolean4 = true;
    }
    paramBoolean1 = paramBoolean4;
    if (paramBoolean2)
    {
      paramBoolean1 = paramBoolean4;
      if (paramView.topMargin != paramRect.top)
      {
        paramView.topMargin = paramRect.top;
        paramBoolean1 = true;
      }
    }
    if (paramView.rightMargin != paramRect.right)
    {
      paramView.rightMargin = paramRect.right;
      paramBoolean1 = true;
    }
    if ((paramBoolean3) && (paramView.bottomMargin != paramRect.bottom))
    {
      paramView.bottomMargin = paramRect.bottom;
      paramBoolean1 = bool;
    }
    for (;;)
    {
      return paramBoolean1;
    }
  }
  
  private void b(int paramInt)
  {
    j();
    int i1 = this.i.getHeight();
    paramInt = Math.max(0, Math.min(paramInt, i1));
    gt.b(this.i, -paramInt);
    if ((this.h != null) && (this.h.getVisibility() != 8))
    {
      paramInt = (int)(paramInt / i1 * this.h.getHeight());
      gt.b(this.h, paramInt);
    }
  }
  
  private void i()
  {
    if (this.g == null)
    {
      this.g = ((ContentFrameLayout)findViewById(a.aQ));
      this.i = ((ActionBarContainer)findViewById(a.aR));
      localObject = findViewById(a.aP);
      if (!(localObject instanceof se)) {
        break label75;
      }
    }
    for (Object localObject = (se)localObject;; localObject = ((Toolbar)localObject).h())
    {
      this.j = ((se)localObject);
      this.h = ((ActionBarContainer)findViewById(a.bu));
      return;
      label75:
      if (!(localObject instanceof Toolbar)) {
        break;
      }
    }
    throw new IllegalStateException("Can't make a decor toolbar out of " + localObject.getClass().getSimpleName());
  }
  
  private void j()
  {
    removeCallbacks(this.A);
    removeCallbacks(this.B);
    if (this.w != null) {
      this.w.a();
    }
    if (this.x != null) {
      this.x.a();
    }
  }
  
  public final void a(int paramInt)
  {
    boolean bool = true;
    i();
    switch (paramInt)
    {
    case 2: 
    case 5: 
    default: 
      return;
    }
    this.b = true;
    if (getContext().getApplicationInfo().targetSdkVersion < 19) {}
    for (;;)
    {
      this.l = bool;
      break;
      bool = false;
    }
  }
  
  public final void a(Menu paramMenu, qq paramqq)
  {
    i();
    this.j.a(paramMenu, paramqq);
  }
  
  public final void a(Window.Callback paramCallback)
  {
    i();
    this.j.a(paramCallback);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    i();
    this.j.a(paramCharSequence);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean != this.m)
    {
      this.m = paramBoolean;
      if (!paramBoolean)
      {
        j();
        b(0);
      }
    }
  }
  
  public final boolean b()
  {
    i();
    return this.j.f();
  }
  
  public final boolean c()
  {
    i();
    return this.j.g();
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof rk;
  }
  
  public final boolean d()
  {
    i();
    return this.j.h();
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((this.k != null) && (!this.l)) {
      if (this.i.getVisibility() != 0) {
        break label82;
      }
    }
    label82:
    for (int i1 = (int)(this.i.getBottom() + gt.l(this.i) + 0.5F);; i1 = 0)
    {
      this.k.setBounds(0, i1, getWidth(), this.k.getIntrinsicHeight() + i1);
      this.k.draw(paramCanvas);
      return;
    }
  }
  
  public final boolean e()
  {
    i();
    return this.j.i();
  }
  
  public final boolean f()
  {
    i();
    return this.j.j();
  }
  
  protected boolean fitSystemWindows(Rect paramRect)
  {
    i();
    gt.p(this);
    boolean bool2 = a(this.i, paramRect, true, true, false, true);
    boolean bool1 = bool2;
    if (this.h != null) {
      bool1 = bool2 | a(this.h, paramRect, true, false, true, true);
    }
    this.s.set(paramRect);
    tm.a(this, this.s, this.p);
    if (!this.q.equals(this.p))
    {
      this.q.set(this.p);
      bool1 = true;
    }
    if (bool1) {
      requestLayout();
    }
    return true;
  }
  
  public final void g()
  {
    i();
    this.j.k();
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new rk(paramLayoutParams);
  }
  
  public int getNestedScrollAxes()
  {
    return this.D.a;
  }
  
  public final void h()
  {
    i();
    this.j.l();
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    a(getContext());
    gt.q(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    j();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i4 = getChildCount();
    int i1 = getPaddingLeft();
    getPaddingRight();
    int i3 = getPaddingTop();
    int i2 = getPaddingBottom();
    paramInt1 = 0;
    if (paramInt1 < i4)
    {
      View localView = getChildAt(paramInt1);
      rk localrk;
      int i7;
      int i5;
      int i6;
      if (localView.getVisibility() != 8)
      {
        localrk = (rk)localView.getLayoutParams();
        i7 = localView.getMeasuredWidth();
        i5 = localView.getMeasuredHeight();
        i6 = localrk.leftMargin + i1;
        if (localView != this.h) {
          break label140;
        }
      }
      label140:
      for (paramInt3 = paramInt4 - paramInt2 - i2 - i5 - localrk.bottomMargin;; paramInt3 = localrk.topMargin + i3)
      {
        localView.layout(i6, paramInt3, i7 + i6, i5 + paramInt3);
        paramInt1++;
        break;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    i();
    measureChildWithMargins(this.i, paramInt1, 0, paramInt2, 0);
    Object localObject = (rk)this.i.getLayoutParams();
    int i4 = Math.max(0, this.i.getMeasuredWidth() + ((rk)localObject).leftMargin + ((rk)localObject).rightMargin);
    int i1 = this.i.getMeasuredHeight();
    int i2 = ((rk)localObject).topMargin;
    int i3 = Math.max(0, ((rk)localObject).bottomMargin + (i1 + i2));
    i2 = tm.a(0, gt.j(this.i));
    int i5;
    if (this.h != null)
    {
      measureChildWithMargins(this.h, paramInt1, 0, paramInt2, 0);
      localObject = (rk)this.h.getLayoutParams();
      i4 = Math.max(i4, this.h.getMeasuredWidth() + ((rk)localObject).leftMargin + ((rk)localObject).rightMargin);
      i1 = this.h.getMeasuredHeight();
      i5 = ((rk)localObject).topMargin;
      i3 = Math.max(i3, ((rk)localObject).bottomMargin + (i1 + i5));
      i2 = tm.a(i2, gt.j(this.h));
    }
    for (;;)
    {
      if ((gt.p(this) & 0x100) != 0)
      {
        i5 = 1;
        if (i5 == 0) {
          break label537;
        }
        int i6 = this.f;
        i1 = i6;
        if (this.c)
        {
          i1 = i6;
          if (this.i.a != null) {
            i1 = i6 + this.f;
          }
        }
      }
      for (;;)
      {
        label253:
        this.r.set(this.p);
        this.t.set(this.s);
        if ((!this.b) && (i5 == 0))
        {
          localObject = this.r;
          ((Rect)localObject).top = (i1 + ((Rect)localObject).top);
          localObject = this.r;
        }
        for (((Rect)localObject).bottom = ((Rect)localObject).bottom;; ((Rect)localObject).bottom = ((Rect)localObject).bottom)
        {
          a(this.g, this.r, true, true, true, true);
          if (!this.u.equals(this.t))
          {
            this.u.set(this.t);
            this.g.a(this.t);
          }
          measureChildWithMargins(this.g, paramInt1, 0, paramInt2, 0);
          localObject = (rk)this.g.getLayoutParams();
          i1 = Math.max(i4, this.g.getMeasuredWidth() + ((rk)localObject).leftMargin + ((rk)localObject).rightMargin);
          i5 = this.g.getMeasuredHeight();
          i4 = ((rk)localObject).topMargin;
          i4 = Math.max(i3, ((rk)localObject).bottomMargin + (i5 + i4));
          i3 = tm.a(i2, gt.j(this.g));
          i5 = getPaddingLeft();
          i2 = getPaddingRight();
          i4 = Math.max(i4 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
          setMeasuredDimension(gt.a(Math.max(i1 + (i5 + i2), getSuggestedMinimumWidth()), paramInt1, i3), gt.a(i4, paramInt2, i3 << 16));
          return;
          i5 = 0;
          break;
          label537:
          if (this.i.getVisibility() == 8) {
            break label593;
          }
          i1 = this.i.getMeasuredHeight();
          break label253;
          localObject = this.t;
          ((Rect)localObject).top = (i1 + ((Rect)localObject).top);
          localObject = this.t;
        }
        label593:
        i1 = 0;
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i1 = 0;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.m)
    {
      if (!paramBoolean) {
        bool1 = bool2;
      }
    }
    else {
      return bool1;
    }
    this.v.a(0, 0, 0, (int)paramFloat2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    if (this.v.d() > this.i.getHeight()) {
      i1 = 1;
    }
    if (i1 != 0)
    {
      j();
      this.B.run();
    }
    for (;;)
    {
      this.n = true;
      bool1 = true;
      break;
      j();
      this.A.run();
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.o += paramInt2;
    b(this.o);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.D.a = paramInt;
    if (this.i != null) {}
    for (paramInt = -(int)gt.l(this.i);; paramInt = 0)
    {
      this.o = paramInt;
      j();
      if (this.e != null) {
        this.e.j();
      }
      return;
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) == 0) || (this.i.getVisibility() != 0)) {}
    for (boolean bool = false;; bool = this.m) {
      return bool;
    }
  }
  
  public void onStopNestedScroll(View paramView)
  {
    if ((this.m) && (!this.n))
    {
      if (this.o > this.i.getHeight()) {
        break label45;
      }
      j();
      postDelayed(this.A, 600L);
    }
    for (;;)
    {
      return;
      label45:
      j();
      postDelayed(this.B, 600L);
    }
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 16) {
      super.onWindowSystemUiVisibilityChanged(paramInt);
    }
    i();
    int i3 = this.d;
    this.d = paramInt;
    int i1;
    int i2;
    if ((paramInt & 0x4) == 0)
    {
      i1 = 1;
      if ((paramInt & 0x100) == 0) {
        break label121;
      }
      i2 = 1;
      label50:
      if (this.e != null)
      {
        rj localrj = this.e;
        if (i2 != 0) {
          break label127;
        }
        label67:
        localrj.f(bool);
        if ((i1 == 0) && (i2 != 0)) {
          break label133;
        }
        this.e.h();
      }
    }
    for (;;)
    {
      if ((((i3 ^ paramInt) & 0x100) != 0) && (this.e != null)) {
        gt.q(this);
      }
      return;
      i1 = 0;
      break;
      label121:
      i2 = 0;
      break label50;
      label127:
      bool = false;
      break label67;
      label133:
      this.e.i();
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    this.a = paramInt;
    if (this.e != null) {
      this.e.c(paramInt);
    }
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\internal\widget\ActionBarOverlayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import fe;
import fi;
import gd;
import gt;
import hk;
import ko;
import kp;
import kq;
import kr;
import ks;
import kt;
import ku;
import kv;
import kx;
import lb;
import mf;

public class DrawerLayout
  extends ViewGroup
  implements lb
{
  private static final int[] j;
  private static final boolean k;
  private static kq z;
  public int a = -1728053248;
  public final mf b;
  public final mf c;
  public int d;
  public boolean e;
  public kt f;
  public Drawable g;
  public Drawable h;
  public Drawable i;
  private final kp l = new kp(this);
  private int m;
  private float n;
  private Paint o = new Paint();
  private final kx p;
  private final kx q;
  private boolean r;
  private boolean s = true;
  private int t;
  private int u;
  private float v;
  private float w;
  private Object x;
  private boolean y;
  
  static
  {
    boolean bool = true;
    j = new int[] { 16842931 };
    if (Build.VERSION.SDK_INT >= 19)
    {
      k = bool;
      if (Build.VERSION.SDK_INT < 21) {
        break label49;
      }
    }
    label49:
    for (z = new kr();; z = new ks())
    {
      return;
      bool = false;
      break;
    }
  }
  
  public DrawerLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = getResources().getDisplayMetrics().density;
    this.m = ((int)(64.0F * f1 + 0.5F));
    f1 *= 400.0F;
    this.p = new kx(this, 3);
    this.q = new kx(this, 5);
    this.b = mf.a(this, 1.0F, this.p);
    this.b.l = 1;
    this.b.j = f1;
    this.p.b = this.b;
    this.c = mf.a(this, 1.0F, this.q);
    this.c.l = 2;
    this.c.j = f1;
    this.q.b = this.c;
    setFocusableInTouchMode(true);
    gt.c(this, 1);
    gt.a(this, new ko(this));
    hk.a(this, false);
    if (gt.r(this))
    {
      z.a(this);
      this.i = z.a(paramContext);
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    paramInt2 = fe.a(paramInt2, gt.g(this));
    Object localObject;
    if (paramInt2 == 3)
    {
      this.t = paramInt1;
      if (paramInt1 != 0)
      {
        if (paramInt2 != 3) {
          break label74;
        }
        localObject = this.b;
        label33:
        ((mf)localObject).a();
      }
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      return;
      if (paramInt2 != 5) {
        break;
      }
      this.u = paramInt1;
      break;
      label74:
      localObject = this.c;
      break label33;
      localObject = b(paramInt2);
      if (localObject != null)
      {
        e((View)localObject);
        continue;
        localObject = b(paramInt2);
        if (localObject != null) {
          f((View)localObject);
        }
      }
    }
  }
  
  private void a(boolean paramBoolean)
  {
    int i4 = getChildCount();
    int i2 = 0;
    int i1 = 0;
    if (i2 < i4)
    {
      View localView = getChildAt(i2);
      ku localku = (ku)localView.getLayoutParams();
      boolean bool = i1;
      int i3;
      if (d(localView)) {
        if (paramBoolean)
        {
          bool = i1;
          if (!localku.c) {}
        }
        else
        {
          i3 = localView.getWidth();
          if (!a(localView, 3)) {
            break label114;
          }
          i1 |= this.b.a(localView, -i3, localView.getTop());
        }
      }
      for (;;)
      {
        localku.c = false;
        i3 = i1;
        i2++;
        i1 = i3;
        break;
        label114:
        i1 |= this.c.a(localView, getWidth(), localView.getTop());
      }
    }
    this.p.a();
    this.q.a();
    if (i1 != 0) {
      invalidate();
    }
  }
  
  public static float b(View paramView)
  {
    return ((ku)paramView.getLayoutParams()).b;
  }
  
  private View c()
  {
    int i2 = getChildCount();
    int i1 = 0;
    View localView;
    if (i1 < i2)
    {
      localView = getChildAt(i1);
      if (!((ku)localView.getLayoutParams()).d) {}
    }
    for (;;)
    {
      return localView;
      i1++;
      break;
      localView = null;
    }
  }
  
  public static String c(int paramInt)
  {
    String str;
    if ((paramInt & 0x3) == 3) {
      str = "LEFT";
    }
    for (;;)
    {
      return str;
      if ((paramInt & 0x5) == 5) {
        str = "RIGHT";
      } else {
        str = Integer.toHexString(paramInt);
      }
    }
  }
  
  private View d()
  {
    int i2 = getChildCount();
    int i1 = 0;
    View localView;
    if (i1 < i2)
    {
      localView = getChildAt(i1);
      if ((!d(localView)) || (!h(localView))) {}
    }
    for (;;)
    {
      return localView;
      i1++;
      break;
      localView = null;
    }
  }
  
  public static boolean d(View paramView)
  {
    if ((fe.a(((ku)paramView.getLayoutParams()).a, gt.g(paramView)) & 0x7) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static boolean j(View paramView)
  {
    if (((ku)paramView.getLayoutParams()).a == 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final int a(View paramView)
  {
    int i1 = c(paramView);
    if (i1 == 3) {
      i1 = this.t;
    }
    for (;;)
    {
      return i1;
      if (i1 == 5) {
        i1 = this.u;
      } else {
        i1 = 0;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    a(paramInt, 3);
    a(paramInt, 5);
  }
  
  public final void a(View paramView, float paramFloat)
  {
    paramView = (ku)paramView.getLayoutParams();
    if (paramFloat == paramView.b) {}
    for (;;)
    {
      return;
      paramView.b = paramFloat;
      if (this.f != null) {
        this.f.a(paramFloat);
      }
    }
  }
  
  public void a(View paramView, boolean paramBoolean)
  {
    int i2 = getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = getChildAt(i1);
      if (((!paramBoolean) && (!d(localView))) || ((paramBoolean) && (localView == paramView))) {
        gt.c(localView, 1);
      }
      for (;;)
      {
        i1++;
        break;
        gt.c(localView, 4);
      }
    }
  }
  
  public final void a(Object paramObject, boolean paramBoolean)
  {
    this.x = paramObject;
    this.y = paramBoolean;
    if ((!paramBoolean) && (getBackground() == null)) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      setWillNotDraw(paramBoolean);
      requestLayout();
      return;
    }
  }
  
  public final boolean a(View paramView, int paramInt)
  {
    if ((c(paramView) & paramInt) == paramInt) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if ((c() != null) || (d(paramView))) {
      gt.c(paramView, 4);
    }
    for (;;)
    {
      if (!k) {
        gt.a(paramView, this.l);
      }
      return;
      gt.c(paramView, 1);
    }
  }
  
  public final View b(int paramInt)
  {
    int i2 = fe.a(paramInt, gt.g(this));
    int i1 = getChildCount();
    paramInt = 0;
    View localView;
    if (paramInt < i1)
    {
      localView = getChildAt(paramInt);
      if ((c(localView) & 0x7) != (i2 & 0x7)) {}
    }
    for (;;)
    {
      return localView;
      paramInt++;
      break;
      localView = null;
    }
  }
  
  public final int c(View paramView)
  {
    return fe.a(((ku)paramView.getLayoutParams()).a, gt.g(this));
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (((paramLayoutParams instanceof ku)) && (super.checkLayoutParams(paramLayoutParams))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void computeScroll()
  {
    int i2 = getChildCount();
    float f1 = 0.0F;
    for (int i1 = 0; i1 < i2; i1++) {
      f1 = Math.max(f1, ((ku)getChildAt(i1).getLayoutParams()).b);
    }
    this.n = f1;
    if ((this.b.a(true) | this.c.a(true))) {
      gt.d(this);
    }
  }
  
  public final void d(int paramInt)
  {
    View localView = b(8388611);
    if (localView == null) {
      throw new IllegalArgumentException("No drawer view found with gravity " + c(8388611));
    }
    e(localView);
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i8 = getHeight();
    boolean bool1 = j(paramView);
    int i2 = 0;
    int i5 = 0;
    int i1 = getWidth();
    int i7 = paramCanvas.save();
    int i3 = i1;
    int i4;
    View localView;
    if (bool1)
    {
      int i9 = getChildCount();
      i4 = 0;
      i2 = i5;
      if (i4 < i9)
      {
        localView = getChildAt(i4);
        if ((localView != paramView) && (localView.getVisibility() == 0))
        {
          Drawable localDrawable = localView.getBackground();
          if (localDrawable != null) {
            if (localDrawable.getOpacity() == -1)
            {
              i3 = 1;
              label105:
              if ((i3 == 0) || (!d(localView)) || (localView.getHeight() < i8)) {
                break label212;
              }
              if (!a(localView, 3)) {
                break label190;
              }
              i3 = localView.getRight();
              if (i3 <= i2) {
                break label555;
              }
              i2 = i3;
            }
          }
        }
      }
    }
    label190:
    label212:
    label555:
    for (;;)
    {
      i5 = i2;
      i3 = i1;
      for (;;)
      {
        i4++;
        i1 = i3;
        i2 = i5;
        break;
        i3 = 0;
        break label105;
        i3 = 0;
        break label105;
        int i6 = localView.getLeft();
        i3 = i6;
        i5 = i2;
        if (i6 >= i1)
        {
          i3 = i1;
          i5 = i2;
        }
      }
      paramCanvas.clipRect(i2, 0, i1, getHeight());
      i3 = i1;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i7);
      if ((this.n > 0.0F) && (bool1))
      {
        i1 = (int)(((this.a & 0xFF000000) >>> 24) * this.n);
        i4 = this.a;
        this.o.setColor(i1 << 24 | i4 & 0xFFFFFF);
        paramCanvas.drawRect(i2, 0.0F, i3, getHeight(), this.o);
      }
      for (;;)
      {
        return bool2;
        float f1;
        if ((this.g != null) && (a(paramView, 3)))
        {
          i1 = this.g.getIntrinsicWidth();
          i3 = paramView.getRight();
          i2 = this.b.k;
          f1 = Math.max(0.0F, Math.min(i3 / i2, 1.0F));
          this.g.setBounds(i3, paramView.getTop(), i1 + i3, paramView.getBottom());
          this.g.setAlpha((int)(255.0F * f1));
          this.g.draw(paramCanvas);
        }
        else if ((this.h != null) && (a(paramView, 5)))
        {
          i1 = this.h.getIntrinsicWidth();
          i4 = paramView.getLeft();
          i3 = getWidth();
          i2 = this.c.k;
          f1 = Math.max(0.0F, Math.min((i3 - i4) / i2, 1.0F));
          this.h.setBounds(i4 - i1, paramView.getTop(), i4, paramView.getBottom());
          this.h.setAlpha((int)(255.0F * f1));
          this.h.draw(paramCanvas);
        }
      }
    }
  }
  
  public final void e(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    if (this.s)
    {
      ku localku = (ku)paramView.getLayoutParams();
      localku.b = 1.0F;
      localku.d = true;
      a(paramView, true);
    }
    for (;;)
    {
      invalidate();
      return;
      if (a(paramView, 3)) {
        this.b.a(paramView, 0, paramView.getTop());
      } else {
        this.c.a(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
      }
    }
  }
  
  public final boolean e(int paramInt)
  {
    View localView = b(8388611);
    if (localView != null) {}
    for (boolean bool = g(localView);; bool = false) {
      return bool;
    }
  }
  
  public final void f(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    if (this.s)
    {
      paramView = (ku)paramView.getLayoutParams();
      paramView.b = 0.0F;
      paramView.d = false;
    }
    for (;;)
    {
      invalidate();
      return;
      if (a(paramView, 3)) {
        this.b.a(paramView, -paramView.getWidth(), paramView.getTop());
      } else {
        this.c.a(paramView, getWidth(), paramView.getTop());
      }
    }
  }
  
  public final boolean g(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return ((ku)paramView.getLayoutParams()).d;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ku(-1, -1);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ku(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ku)) {
      paramLayoutParams = new ku((ku)paramLayoutParams);
    }
    for (;;)
    {
      return paramLayoutParams;
      if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
        paramLayoutParams = new ku((ViewGroup.MarginLayoutParams)paramLayoutParams);
      } else {
        paramLayoutParams = new ku(paramLayoutParams);
      }
    }
  }
  
  public final boolean h(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    if (((ku)paramView.getLayoutParams()).b > 0.0F) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.s = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.s = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.y) && (this.i != null))
    {
      int i1 = z.a(this.x);
      if (i1 > 0)
      {
        this.i.setBounds(0, 0, getWidth(), i1);
        this.i.draw(paramCanvas);
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i1 = gd.a(paramMotionEvent);
    boolean bool3 = this.b.a(paramMotionEvent);
    boolean bool2 = this.c.a(paramMotionEvent);
    label63:
    int i2;
    label85:
    label113:
    float f2;
    float f1;
    switch (i1)
    {
    default: 
      i1 = 0;
      if ((!(bool2 | bool3)) && (i1 == 0))
      {
        i2 = getChildCount();
        i1 = 0;
        if (i1 >= i2) {
          break label374;
        }
        if (!((ku)getChildAt(i1).getLayoutParams()).c) {
          break;
        }
        i1 = 1;
        if ((i1 == 0) && (!this.e)) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    case 0: 
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      this.v = f2;
      this.w = f1;
      if (this.n > 0.0F)
      {
        paramMotionEvent = this.b.a((int)f2, (int)f1);
        if ((paramMotionEvent == null) || (!j(paramMotionEvent))) {}
      }
      break;
    }
    for (i1 = 1;; i1 = 0)
    {
      this.e = false;
      break label63;
      paramMotionEvent = this.b;
      int i3 = paramMotionEvent.d.length;
      i2 = 0;
      label209:
      if (i2 < i3) {
        if ((paramMotionEvent.h & 1 << i2) != 0)
        {
          i1 = 1;
          label231:
          if (i1 == 0) {
            break label337;
          }
          f1 = paramMotionEvent.f[i2] - paramMotionEvent.d[i2];
          f2 = paramMotionEvent.g[i2] - paramMotionEvent.e[i2];
          if (f1 * f1 + f2 * f2 <= paramMotionEvent.b * paramMotionEvent.b) {
            break label331;
          }
          i1 = 1;
          label292:
          if (i1 == 0) {
            break label343;
          }
        }
      }
      for (i1 = 1; i1 != 0; i1 = 0)
      {
        this.p.a();
        this.q.a();
        i1 = 0;
        break label63;
        i1 = 0;
        break label231;
        label331:
        i1 = 0;
        break label292;
        label337:
        i1 = 0;
        break label292;
        label343:
        i2++;
        break label209;
      }
      a(true);
      this.e = false;
      break;
      i1++;
      break label85;
      label374:
      i1 = 0;
      break label113;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    int i1;
    if (paramInt == 4) {
      if (d() != null)
      {
        i1 = 1;
        if (i1 == 0) {
          break label33;
        }
        fi.b(paramKeyEvent);
      }
    }
    for (;;)
    {
      return bool;
      i1 = 0;
      break;
      label33:
      bool = super.onKeyDown(paramInt, paramKeyEvent);
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if (paramInt == 4)
    {
      paramKeyEvent = d();
      if ((paramKeyEvent != null) && (a(paramKeyEvent) == 0)) {
        a(false);
      }
      if (paramKeyEvent == null) {}
    }
    for (bool = true;; bool = super.onKeyUp(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.r = true;
    int i5 = paramInt3 - paramInt1;
    int i4 = getChildCount();
    paramInt3 = 0;
    while (paramInt3 < i4)
    {
      View localView = getChildAt(paramInt3);
      ku localku;
      if (localView.getVisibility() != 8)
      {
        localku = (ku)localView.getLayoutParams();
        if (j(localView)) {
          localView.layout(localku.leftMargin, localku.topMargin, localku.leftMargin + localView.getMeasuredWidth(), localku.topMargin + localView.getMeasuredHeight());
        }
      }
      else
      {
        paramInt3++;
        continue;
      }
      int i6 = localView.getMeasuredWidth();
      int i7 = localView.getMeasuredHeight();
      int i1;
      float f1;
      label160:
      int i2;
      if (a(localView, 3))
      {
        paramInt1 = -i6;
        i1 = (int)(i6 * localku.b) + paramInt1;
        f1 = (i6 + i1) / i6;
        if (f1 == localku.b) {
          break label306;
        }
        i2 = 1;
        label174:
        switch (localku.a & 0x70)
        {
        default: 
          localView.layout(i1, localku.topMargin, i6 + i1, i7 + localku.topMargin);
          label233:
          if (i2 != 0) {
            a(localView, f1);
          }
          if (localku.b <= 0.0F) {
            break;
          }
        }
      }
      for (paramInt1 = 0; localView.getVisibility() != paramInt1; paramInt1 = 4)
      {
        localView.setVisibility(paramInt1);
        break;
        i1 = i5 - (int)(i6 * localku.b);
        f1 = (i5 - i1) / i6;
        break label160;
        label306:
        i2 = 0;
        break label174;
        paramInt1 = paramInt4 - paramInt2;
        localView.layout(i1, paramInt1 - localku.bottomMargin - localView.getMeasuredHeight(), i6 + i1, paramInt1 - localku.bottomMargin);
        break label233;
        int i8 = paramInt4 - paramInt2;
        int i3 = (i8 - i7) / 2;
        if (i3 < localku.topMargin) {
          paramInt1 = localku.topMargin;
        }
        for (;;)
        {
          localView.layout(i1, paramInt1, i6 + i1, i7 + paramInt1);
          break;
          paramInt1 = i3;
          if (i3 + i7 > i8 - localku.bottomMargin) {
            paramInt1 = i8 - localku.bottomMargin - i7;
          }
        }
      }
    }
    this.r = false;
    this.s = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i5 = 300;
    int i4 = 0;
    int i8 = View.MeasureSpec.getMode(paramInt1);
    int i7 = View.MeasureSpec.getMode(paramInt2);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i6 = View.MeasureSpec.getSize(paramInt2);
    int i2;
    int i1;
    if (i8 == 1073741824)
    {
      i2 = i3;
      if (i7 == 1073741824) {}
    }
    else if (isInEditMode())
    {
      i1 = i3;
      if (i8 != Integer.MIN_VALUE)
      {
        i1 = i3;
        if (i8 == 0) {
          i1 = 300;
        }
      }
      i2 = i1;
      if (i7 == Integer.MIN_VALUE) {
        break label471;
      }
      i2 = i1;
      if (i7 != 0) {
        break label471;
      }
      i3 = i5;
    }
    for (;;)
    {
      setMeasuredDimension(i1, i3);
      label147:
      View localView;
      ku localku;
      if ((this.x != null) && (gt.r(this)))
      {
        i2 = 1;
        i5 = gt.g(this);
        i6 = getChildCount();
        if (i4 >= i6) {
          break label470;
        }
        localView = getChildAt(i4);
        if (localView.getVisibility() != 8)
        {
          localku = (ku)localView.getLayoutParams();
          if (i2 != 0)
          {
            i7 = fe.a(localku.a, i5);
            if (!gt.r(localView)) {
              break label292;
            }
            z.a(localView, this.x, i7);
          }
          label218:
          if (!j(localView)) {
            break label311;
          }
          localView.measure(View.MeasureSpec.makeMeasureSpec(i1 - localku.leftMargin - localku.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i3 - localku.topMargin - localku.bottomMargin, 1073741824));
        }
      }
      for (;;)
      {
        i4++;
        break label147;
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        i2 = 0;
        break;
        label292:
        z.a(localku, this.x, i7);
        break label218;
        label311:
        if (!d(localView)) {
          break label428;
        }
        i7 = c(localView) & 0x7;
        if ((i7 & 0x0) != 0) {
          throw new IllegalStateException("Child drawer has absolute gravity " + c(i7) + " but this DrawerLayout" + " already has a drawer view along that edge");
        }
        localView.measure(getChildMeasureSpec(paramInt1, this.m + localku.leftMargin + localku.rightMargin, localku.width), getChildMeasureSpec(paramInt2, localku.topMargin + localku.bottomMargin, localku.height));
      }
      label428:
      throw new IllegalStateException("Child " + localView + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
      label470:
      return;
      label471:
      i3 = i6;
      i1 = i2;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (kv)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (paramParcelable.a != 0)
    {
      View localView = b(paramParcelable.a);
      if (localView != null) {
        e(localView);
      }
    }
    a(paramParcelable.b, 3);
    a(paramParcelable.c, 5);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    kv localkv = new kv(super.onSaveInstanceState());
    View localView = c();
    if (localView != null) {
      localkv.a = ((ku)localView.getLayoutParams()).a;
    }
    localkv.b = this.t;
    localkv.c = this.u;
    return localkv;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    this.b.b(paramMotionEvent);
    this.c.b(paramMotionEvent);
    float f2;
    float f1;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 2: 
    default: 
    case 0: 
      for (;;)
      {
        return true;
        f2 = paramMotionEvent.getX();
        f1 = paramMotionEvent.getY();
        this.v = f2;
        this.w = f1;
        this.e = false;
      }
    case 1: 
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      paramMotionEvent = this.b.a((int)f1, (int)f2);
      if ((paramMotionEvent != null) && (j(paramMotionEvent)))
      {
        f1 -= this.v;
        f2 -= this.w;
        int i1 = this.b.b;
        if (f1 * f1 + f2 * f2 < i1 * i1)
        {
          paramMotionEvent = c();
          if (paramMotionEvent != null) {
            if (a(paramMotionEvent) != 2) {
              break;
            }
          }
        }
      }
      break;
    }
    for (bool = true;; bool = true)
    {
      a(bool);
      break;
      a(true);
      this.e = false;
      break;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if (paramBoolean) {
      a(true);
    }
  }
  
  public void requestLayout()
  {
    if (!this.r) {
      super.requestLayout();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v4\widget\DrawerLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
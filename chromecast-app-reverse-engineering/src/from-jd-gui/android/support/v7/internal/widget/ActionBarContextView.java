package android.support.v7.internal.widget;

import a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import gt;
import ih;
import iq;
import iu;
import java.lang.ref.WeakReference;
import oq;
import pp;
import qa;
import qw;
import re;
import th;
import tm;
import vr;
import vu;

public class ActionBarContextView
  extends qw
  implements iu
{
  public CharSequence g;
  public CharSequence h;
  public View i;
  public boolean j;
  public pp k;
  public int l;
  private View m;
  private LinearLayout n;
  private TextView o;
  private TextView p;
  private int q;
  private int r;
  private Drawable s;
  private int t;
  private boolean u;
  
  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.q);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = th.a(paramContext, paramAttributeSet, oq.x, paramInt, 0);
    setBackgroundDrawable(paramContext.a(oq.y));
    this.q = paramContext.e(oq.D, 0);
    this.r = paramContext.e(oq.C, 0);
    this.e = paramContext.d(oq.B, 0);
    this.s = paramContext.a(oq.z);
    this.t = paramContext.e(oq.A, a.bE);
    paramContext.a.recycle();
  }
  
  private void d()
  {
    int i4 = 8;
    int i2 = 1;
    if (this.n == null)
    {
      LayoutInflater.from(getContext()).inflate(a.bB, this);
      this.n = ((LinearLayout)getChildAt(getChildCount() - 1));
      this.o = ((TextView)this.n.findViewById(a.aT));
      this.p = ((TextView)this.n.findViewById(a.aS));
      if (this.q != 0) {
        this.o.setTextAppearance(getContext(), this.q);
      }
      if (this.r != 0) {
        this.p.setTextAppearance(getContext(), this.r);
      }
    }
    this.o.setText(this.g);
    this.p.setText(this.h);
    int i1;
    label167:
    Object localObject;
    if (!TextUtils.isEmpty(this.g))
    {
      i1 = 1;
      if (TextUtils.isEmpty(this.h)) {
        break label232;
      }
      localObject = this.p;
      if (i2 == 0) {
        break label237;
      }
    }
    label232:
    label237:
    for (int i3 = 0;; i3 = 8)
    {
      ((TextView)localObject).setVisibility(i3);
      localObject = this.n;
      if (i1 == 0)
      {
        i1 = i4;
        if (i2 == 0) {}
      }
      else
      {
        i1 = 0;
      }
      ((LinearLayout)localObject).setVisibility(i1);
      if (this.n.getParent() == null) {
        addView(this.n);
      }
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label167;
    }
  }
  
  public final void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public final void a(View paramView) {}
  
  public final void a(CharSequence paramCharSequence)
  {
    this.g = paramCharSequence;
    d();
  }
  
  public final void a(vr paramvr)
  {
    if (this.i == null)
    {
      this.i = LayoutInflater.from(getContext()).inflate(this.t, this, false);
      addView(this.i);
    }
    for (;;)
    {
      this.i.findViewById(a.aW).setOnClickListener(new re(this, paramvr));
      qa localqa = (qa)paramvr.b();
      if (this.c != null) {
        this.c.d();
      }
      this.c = new vu(getContext());
      this.c.c(true);
      paramvr = new ViewGroup.LayoutParams(-2, -1);
      localqa.a(this.c, this.a);
      this.b = ((ActionMenuView)this.c.a(this));
      this.b.setBackgroundDrawable(null);
      addView(this.b, paramvr);
      this.u = true;
      return;
      if (this.i.getParent() == null) {
        addView(this.i);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean != this.j) {
      requestLayout();
    }
    this.j = paramBoolean;
  }
  
  public final boolean a()
  {
    if (this.c != null) {}
    for (boolean bool = this.c.b();; bool = false) {
      return bool;
    }
  }
  
  public void b()
  {
    pp localpp = this.k;
    if (localpp != null)
    {
      this.k = null;
      localpp.b();
    }
  }
  
  public final void b(View paramView)
  {
    if (this.l == 2) {
      c();
    }
    this.l = 0;
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    this.h = paramCharSequence;
    d();
  }
  
  public final void c()
  {
    b();
    removeAllViews();
    this.m = null;
    this.b = null;
    this.u = false;
  }
  
  public final void c(View paramView) {}
  
  public final void d(View paramView)
  {
    if (this.m != null) {
      removeView(this.m);
    }
    this.m = paramView;
    if (this.n != null)
    {
      removeView(this.n);
      this.n = null;
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.c != null)
    {
      this.c.c();
      this.c.e();
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      if (paramAccessibilityEvent.getEventType() != 32) {
        break label53;
      }
      paramAccessibilityEvent.setSource(this);
      paramAccessibilityEvent.setClassName(getClass().getName());
      paramAccessibilityEvent.setPackageName(getContext().getPackageName());
      paramAccessibilityEvent.setContentDescription(this.g);
    }
    for (;;)
    {
      return;
      label53:
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = tm.a(this);
    int i1;
    int i2;
    int i3;
    Object localObject1;
    if (paramBoolean)
    {
      i1 = paramInt3 - paramInt1 - getPaddingRight();
      i2 = getPaddingTop();
      i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      paramInt2 = i1;
      if (this.i == null) {
        break label387;
      }
      paramInt2 = i1;
      if (this.i.getVisibility() == 8) {
        break label387;
      }
      localObject1 = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
      if (!paramBoolean) {
        break label347;
      }
      paramInt2 = ((ViewGroup.MarginLayoutParams)localObject1).rightMargin;
      label89:
      if (!paramBoolean) {
        break label356;
      }
    }
    label347:
    label356:
    for (paramInt4 = ((ViewGroup.MarginLayoutParams)localObject1).leftMargin;; paramInt4 = ((ViewGroup.MarginLayoutParams)localObject1).rightMargin)
    {
      paramInt2 = a(i1, paramInt2, paramBoolean);
      paramInt4 = a(paramInt2 + a(this.i, paramInt2, i2, i3, paramBoolean), paramInt4, paramBoolean);
      paramInt2 = paramInt4;
      if (!this.u) {
        break label387;
      }
      this.l = 1;
      gt.a(this.i, -this.i.getWidth() - ((ViewGroup.MarginLayoutParams)this.i.getLayoutParams()).leftMargin);
      Object localObject2 = gt.o(this.i).b(0.0F);
      ((ih)localObject2).a(200L);
      ((ih)localObject2).a(this);
      ((ih)localObject2).a(new DecelerateInterpolator());
      localObject1 = new pp();
      ((pp)localObject1).a((ih)localObject2);
      if (this.b == null) {
        break label366;
      }
      paramInt2 = this.b.getChildCount();
      if (paramInt2 <= 0) {
        break label366;
      }
      paramInt2--;
      while (paramInt2 >= 0)
      {
        localObject2 = this.b.getChildAt(paramInt2);
        gt.e((View)localObject2, 0.0F);
        localObject2 = gt.o((View)localObject2);
        View localView = (View)((ih)localObject2).a.get();
        if (localView != null) {
          ih.b.d((ih)localObject2, localView, 1.0F);
        }
        ((ih)localObject2).a(300L);
        ((pp)localObject1).a((ih)localObject2);
        paramInt2--;
      }
      i1 = getPaddingLeft();
      break;
      paramInt2 = ((ViewGroup.MarginLayoutParams)localObject1).leftMargin;
      break label89;
    }
    label366:
    this.k = ((pp)localObject1);
    this.k.a();
    this.u = false;
    paramInt2 = paramInt4;
    label387:
    paramInt4 = paramInt2;
    if (this.n != null)
    {
      paramInt4 = paramInt2;
      if (this.m == null)
      {
        paramInt4 = paramInt2;
        if (this.n.getVisibility() != 8) {
          paramInt4 = paramInt2 + a(this.n, paramInt2, i2, i3, paramBoolean);
        }
      }
    }
    if (this.m != null) {
      a(this.m, paramInt4, i2, i3, paramBoolean);
    }
    if (paramBoolean)
    {
      paramInt1 = getPaddingLeft();
      if (this.b != null)
      {
        localObject1 = this.b;
        if (paramBoolean) {
          break label515;
        }
      }
    }
    label515:
    for (paramBoolean = true;; paramBoolean = false)
    {
      a((View)localObject1, paramInt1, i2, i3, paramBoolean);
      return;
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
      break;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i3 = 1073741824;
    int i4 = 0;
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
    }
    int i6 = View.MeasureSpec.getSize(paramInt1);
    int i1;
    int i5;
    int i2;
    if (this.e > 0)
    {
      i1 = this.e;
      int i7 = getPaddingTop() + getPaddingBottom();
      paramInt1 = i6 - getPaddingLeft() - getPaddingRight();
      i5 = i1 - i7;
      i2 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
      paramInt2 = paramInt1;
      Object localObject;
      if (this.i != null)
      {
        paramInt2 = a(this.i, paramInt1, i2, 0);
        localObject = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
        paramInt1 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
        paramInt2 -= ((ViewGroup.MarginLayoutParams)localObject).rightMargin + paramInt1;
      }
      paramInt1 = paramInt2;
      if (this.b != null)
      {
        paramInt1 = paramInt2;
        if (this.b.getParent() == this) {
          paramInt1 = a(this.b, paramInt2, i2, 0);
        }
      }
      paramInt2 = paramInt1;
      if (this.n != null)
      {
        paramInt2 = paramInt1;
        if (this.m == null)
        {
          if (!this.j) {
            break label491;
          }
          paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
          this.n.measure(paramInt2, i2);
          int i8 = this.n.getMeasuredWidth();
          if (i8 > paramInt1) {
            break label479;
          }
          i2 = 1;
          label292:
          paramInt2 = paramInt1;
          if (i2 != 0) {
            paramInt2 = paramInt1 - i8;
          }
          localObject = this.n;
          if (i2 == 0) {
            break label485;
          }
          paramInt1 = 0;
          label316:
          ((LinearLayout)localObject).setVisibility(paramInt1);
        }
      }
      label321:
      if (this.m != null)
      {
        localObject = this.m.getLayoutParams();
        if (((ViewGroup.LayoutParams)localObject).width == -2) {
          break label506;
        }
        paramInt1 = 1073741824;
        label349:
        i2 = paramInt2;
        if (((ViewGroup.LayoutParams)localObject).width >= 0) {
          i2 = Math.min(((ViewGroup.LayoutParams)localObject).width, paramInt2);
        }
        if (((ViewGroup.LayoutParams)localObject).height == -2) {
          break label513;
        }
        paramInt2 = i3;
        label381:
        if (((ViewGroup.LayoutParams)localObject).height < 0) {
          break label520;
        }
        i3 = Math.min(((ViewGroup.LayoutParams)localObject).height, i5);
        label399:
        this.m.measure(View.MeasureSpec.makeMeasureSpec(i2, paramInt1), View.MeasureSpec.makeMeasureSpec(i3, paramInt2));
      }
      if (this.e > 0) {
        break label535;
      }
      i2 = getChildCount();
      paramInt1 = 0;
      paramInt2 = i4;
      label436:
      if (paramInt2 >= i2) {
        break label527;
      }
      i1 = getChildAt(paramInt2).getMeasuredHeight() + i7;
      if (i1 <= paramInt1) {
        break label546;
      }
      paramInt1 = i1;
    }
    label479:
    label485:
    label491:
    label506:
    label513:
    label520:
    label527:
    label535:
    label546:
    for (;;)
    {
      paramInt2++;
      break label436;
      i1 = View.MeasureSpec.getSize(paramInt2);
      break;
      i2 = 0;
      break label292;
      paramInt1 = 8;
      break label316;
      paramInt2 = a(this.n, paramInt1, i2, 0);
      break label321;
      paramInt1 = Integer.MIN_VALUE;
      break label349;
      paramInt2 = Integer.MIN_VALUE;
      break label381;
      i3 = i5;
      break label399;
      setMeasuredDimension(i6, paramInt1);
      for (;;)
      {
        return;
        setMeasuredDimension(i6, i1);
      }
    }
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\internal\widget\ActionBarContextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
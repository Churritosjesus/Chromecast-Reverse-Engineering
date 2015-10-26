package com.google.android.gms.people.accountswitcherview;

import a;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.google.android.gms.common.api.GoogleApiClient;
import cqe;
import cqf;
import cqg;
import cqh;
import cqj;
import cqs;
import cqw;
import crd;
import crf;
import csq;
import java.util.List;

public class AccountSwitcherView
  extends FrameLayout
  implements View.OnClickListener, AdapterView.OnItemClickListener, crd, crf
{
  public cqf a;
  public cqh b;
  public cqg c;
  public csq d;
  public List e;
  public ListView f;
  public FrameLayout g;
  public SelectedAccountNavigationView h;
  public cqs i;
  public GoogleApiClient j;
  public cqj k;
  public int l;
  public View m;
  public boolean n = true;
  public boolean o = true;
  public cqw p;
  public View q;
  private ShrinkingItem r;
  private ViewGroup s;
  private ExpanderView t;
  private int u;
  private int v;
  private boolean w;
  private boolean x = false;
  
  public AccountSwitcherView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AccountSwitcherView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    new TypedValue();
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { a.hJ });
    this.w = paramAttributeSet.getBoolean(0, b(21));
    paramAttributeSet.recycle();
    LayoutInflater.from(paramContext).inflate(a.iq, this);
    this.s = ((ViewGroup)findViewById(a.im));
    this.s.setOnClickListener(this);
    this.t = ((ExpanderView)findViewById(a.hT));
    this.t.setOnClickListener(this);
    this.h = ((SelectedAccountNavigationView)findViewById(a.il));
    paramContext = this.h;
    if ((this.w) && (b(11))) {}
    for (boolean bool = true;; bool = false)
    {
      paramContext.j = bool;
      paramContext.i = paramContext.j;
      this.h.a = this;
      this.h.g = this;
      this.f = ((ListView)findViewById(a.hW));
      this.f.setOnItemClickListener(this);
      this.r = ((ShrinkingItem)findViewById(a.hX));
      this.l = -1;
      this.g = ((FrameLayout)findViewById(a.ie));
      a(0);
      return;
    }
  }
  
  private void a(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
    this.u = paramView.getTop();
  }
  
  private void a(boolean paramBoolean)
  {
    AlphaAnimation localAlphaAnimation;
    switch (this.h.b)
    {
    default: 
      return;
    case 0: 
      if (paramBoolean)
      {
        localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
        localAlphaAnimation.setDuration(200L);
        this.g.setAnimation(localAlphaAnimation);
        a(false, new AccelerateInterpolator(0.8F));
      }
      for (;;)
      {
        this.g.setVisibility(0);
        this.r.setVisibility(8);
        break;
        this.g.setAnimation(null);
      }
    }
    if (paramBoolean)
    {
      localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
      localAlphaAnimation.setDuration(200L);
      localAlphaAnimation.setStartOffset(133L);
      a(true, new DecelerateInterpolator(0.8F));
    }
    for (;;)
    {
      this.g.setVisibility(8);
      this.r.setVisibility(0);
      break;
      this.g.setAnimation(null);
    }
  }
  
  private void a(boolean paramBoolean, Interpolator paramInterpolator)
  {
    int i1;
    int i2;
    if (paramBoolean)
    {
      i1 = 1;
      i2 = 0;
      if (!b(11)) {
        break label71;
      }
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.r, "animatedHeightFraction", new float[] { i2, i1 });
      localObjectAnimator.setDuration(200L);
      localObjectAnimator.setInterpolator(paramInterpolator);
      localObjectAnimator.start();
    }
    for (;;)
    {
      return;
      i1 = 0;
      i2 = 1;
      break;
      label71:
      paramInterpolator = this.r;
      paramInterpolator.a = i1;
      paramInterpolator.requestLayout();
    }
  }
  
  public static boolean b(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= paramInt) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void c(int paramInt)
  {
    this.g.offsetTopAndBottom(paramInt);
    this.v = this.g.getTop();
  }
  
  public static boolean c()
  {
    return b(21);
  }
  
  private void d(int paramInt)
  {
    this.h.a(paramInt);
  }
  
  public final void a()
  {
    a(true);
  }
  
  public final void a(int paramInt)
  {
    boolean bool = true;
    d(0);
    a(false);
    ExpanderView localExpanderView = this.t;
    if (this.h.b == 1) {}
    for (;;)
    {
      localExpanderView.a(bool);
      return;
      bool = false;
    }
  }
  
  public final void a(csq paramcsq)
  {
    a(paramcsq, true);
    if (this.a != null) {
      this.a.a(this.d);
    }
  }
  
  public void a(csq paramcsq, boolean paramBoolean)
  {
    csq localcsq = this.d;
    this.d = paramcsq;
    if (this.e != null)
    {
      this.e = cqs.a(this.e, localcsq, this.d);
      if (!paramBoolean) {
        this.h.a(this.d);
      }
      this.i.a(this.e);
    }
    for (;;)
    {
      return;
      this.h.a(null);
    }
  }
  
  public final void b()
  {
    if (this.i != null)
    {
      cqs localcqs = this.i;
      if (localcqs.e != null) {
        localcqs.e.a();
      }
    }
  }
  
  public int getNestedScrollAxes()
  {
    return 2;
  }
  
  public void onClick(View paramView)
  {
    boolean bool = false;
    if ((paramView != this.s) && (paramView == this.t)) {
      if (this.h.b != 1) {
        break label65;
      }
    }
    label65:
    for (int i1 = 0;; i1 = 1)
    {
      d(i1);
      paramView = this.t;
      if (this.h.b == 1) {
        bool = true;
      }
      paramView.a(bool);
      a(true);
      return;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.q != null)
    {
      this.q.setOnApplyWindowInsetsListener(null);
      this.q = null;
    }
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.i.getItemViewType(paramInt) == 0)
    {
      a(this.i.a(paramInt), false);
      if (this.a != null) {
        this.a.a(this.d);
      }
    }
    for (;;)
    {
      return;
      if (this.i.getItemViewType(paramInt) == 1)
      {
        if (this.c != null) {
          this.c.a();
        }
      }
      else if ((this.i.getItemViewType(paramInt) == 2) && (this.b != null)) {
        this.b.a();
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    SelectedAccountNavigationView localSelectedAccountNavigationView = this.h;
    if (this.u != localSelectedAccountNavigationView.getTop()) {
      localSelectedAccountNavigationView.offsetTopAndBottom(this.u - localSelectedAccountNavigationView.getTop());
    }
    if (this.v != this.g.getTop()) {
      this.g.offsetTopAndBottom(this.v - this.g.getTop());
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    for (paramInt2 = 0;; paramInt2++) {
      if (paramInt2 < getChildCount())
      {
        if (getChildAt(paramInt2).equals(this.g))
        {
          paramInt2 = this.h.getMeasuredHeight();
          this.g.setPadding(this.g.getPaddingLeft(), paramInt2, this.g.getPaddingRight(), this.g.getPaddingBottom());
          this.g.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        }
      }
      else {
        return;
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    paramView = this.h;
    if ((!paramBoolean) && (paramFloat2 < 0.0F) && (paramView.getBottom() < 0))
    {
      a(paramView, -paramView.getTop());
      c(-paramView.getTop());
    }
    for (paramBoolean = true;; paramBoolean = false)
    {
      return paramBoolean;
      if ((paramBoolean) && (paramFloat2 > 0.0F))
      {
        if (paramView.getTop() > -paramView.getMeasuredHeight()) {
          a(paramView, -paramView.getMeasuredHeight() - paramView.getTop());
        }
        if (this.g.getTop() > -paramView.getMeasuredHeight()) {
          c(-paramView.getMeasuredHeight() - this.g.getTop());
        }
      }
    }
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    paramView = this.h;
    if (this.h.b == 1) {}
    label39:
    label72:
    label137:
    label148:
    for (;;)
    {
      return;
      if ((paramInt2 > 0) && (paramView.getBottom() > 0)) {
        if (paramView.getBottom() > paramInt2) {
          paramInt1 = -paramInt2;
        }
      }
      for (;;)
      {
        if (paramInt1 == 0) {
          break label148;
        }
        if (paramView.getTop() + paramInt1 < -paramView.getMeasuredHeight())
        {
          a(paramView, -paramView.getMeasuredHeight() - paramView.getTop());
          if (this.g.getTop() + paramInt1 >= -paramView.getMeasuredHeight()) {
            break label137;
          }
          c(-paramView.getMeasuredHeight() - this.g.getTop());
        }
        for (;;)
        {
          paramArrayOfInt[0] = 0;
          paramArrayOfInt[1] = paramInt1;
          break;
          paramInt1 = -paramView.getBottom();
          break label39;
          a(paramView, paramInt1);
          break label72;
          c(paramInt1);
        }
        paramInt1 = 0;
      }
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView = this.h;
    if ((paramInt4 < 0) && (paramView.getTop() < 0))
    {
      paramInt1 = paramInt4;
      if (paramInt4 > paramView.getTop()) {}
    }
    for (paramInt1 = paramView.getTop();; paramInt1 = 0)
    {
      if (paramInt1 != 0)
      {
        if (paramView.getTop() - paramInt1 <= 0) {
          break label90;
        }
        a(paramView, -paramView.getTop());
        if (this.g.getTop() - paramInt1 <= paramView.getMeasuredHeight()) {
          break label100;
        }
        c(paramView.getMeasuredHeight() - this.g.getTop());
      }
      for (;;)
      {
        return;
        label90:
        a(paramView, -paramInt1);
        break;
        label100:
        c(-paramInt1);
      }
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return false;
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\people\accountswitcherview\AccountSwitcherView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
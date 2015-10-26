package android.support.v7.widget;

import a;
import aao;
import aap;
import aar;
import aas;
import aat;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import fe;
import ft;
import fx;
import gd;
import gt;
import java.util.ArrayList;
import java.util.List;
import mk;
import oq;
import qb;
import qe;
import qq;
import se;
import sl;
import th;
import ti;
import tm;
import vu;
import wg;

public class Toolbar
  extends ViewGroup
{
  private int A;
  private int B;
  private int C = 8388627;
  private boolean D;
  private boolean E;
  private final ArrayList F = new ArrayList();
  private final int[] G = new int[2];
  private final wg H = new aao(this);
  private ti I;
  private final Runnable J = new aap(this);
  public ActionMenuView a;
  public TextView b;
  public TextView c;
  public ImageView d;
  public View e;
  public Context f;
  public int g;
  public int h;
  public int i;
  public final sl j = new sl();
  public CharSequence k;
  public CharSequence l;
  public wg m;
  public vu n;
  public aar o;
  public qq p;
  public qb q;
  public boolean r;
  private ImageButton s;
  private Drawable t;
  private CharSequence u;
  private ImageButton v;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public Toolbar(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.T);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = th.a(getContext(), paramAttributeSet, oq.cb, paramInt, 0);
    this.h = paramContext.e(oq.cv, 0);
    this.i = paramContext.e(oq.co, 0);
    int i1 = oq.cc;
    paramInt = this.C;
    this.C = paramContext.a.getInteger(i1, paramInt);
    this.w = 48;
    paramInt = paramContext.b(oq.cu, 0);
    this.B = paramInt;
    this.A = paramInt;
    this.z = paramInt;
    this.y = paramInt;
    paramInt = paramContext.b(oq.cs, -1);
    if (paramInt >= 0) {
      this.y = paramInt;
    }
    paramInt = paramContext.b(oq.cr, -1);
    if (paramInt >= 0) {
      this.z = paramInt;
    }
    paramInt = paramContext.b(oq.ct, -1);
    if (paramInt >= 0) {
      this.A = paramInt;
    }
    paramInt = paramContext.b(oq.cq, -1);
    if (paramInt >= 0) {
      this.B = paramInt;
    }
    this.x = paramContext.c(oq.cj, -1);
    int i3 = paramContext.b(oq.ci, Integer.MIN_VALUE);
    paramInt = paramContext.b(oq.cf, Integer.MIN_VALUE);
    i1 = paramContext.c(oq.cg, 0);
    int i2 = paramContext.c(oq.ch, 0);
    paramAttributeSet = this.j;
    paramAttributeSet.h = false;
    if (i1 != Integer.MIN_VALUE)
    {
      paramAttributeSet.e = i1;
      paramAttributeSet.a = i1;
    }
    if (i2 != Integer.MIN_VALUE)
    {
      paramAttributeSet.f = i2;
      paramAttributeSet.b = i2;
    }
    if ((i3 != Integer.MIN_VALUE) || (paramInt != Integer.MIN_VALUE)) {
      this.j.a(i3, paramInt);
    }
    this.t = paramContext.a(oq.ce);
    this.u = paramContext.c(oq.cd);
    paramAttributeSet = paramContext.c(oq.cp);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      a(paramAttributeSet);
    }
    paramAttributeSet = paramContext.c(oq.cn);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      b(paramAttributeSet);
    }
    this.f = getContext();
    a(paramContext.e(oq.cm, 0));
    paramAttributeSet = paramContext.a(oq.cl);
    if (paramAttributeSet != null) {
      a(paramAttributeSet);
    }
    paramAttributeSet = paramContext.c(oq.ck);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      c(paramAttributeSet);
    }
    paramContext.a.recycle();
    paramContext.a();
  }
  
  private int a(View paramView, int paramInt)
  {
    aas localaas = (aas)paramView.getLayoutParams();
    int i3 = paramView.getMeasuredHeight();
    int i2;
    int i1;
    int i4;
    if (paramInt > 0)
    {
      paramInt = (i3 - paramInt) / 2;
      i2 = localaas.a & 0x70;
      i1 = i2;
      switch (i2)
      {
      default: 
        i1 = this.C & 0x70;
      }
      switch (i1)
      {
      default: 
        i1 = getPaddingTop();
        i4 = getPaddingBottom();
        i2 = getHeight();
        paramInt = (i2 - i1 - i4 - i3) / 2;
        if (paramInt < localaas.topMargin) {
          paramInt = localaas.topMargin;
        }
        break;
      }
    }
    for (;;)
    {
      paramInt += i1;
      for (;;)
      {
        return paramInt;
        paramInt = 0;
        break;
        paramInt = getPaddingTop() - paramInt;
        continue;
        paramInt = getHeight() - getPaddingBottom() - i3 - localaas.bottomMargin - paramInt;
      }
      i2 = i2 - i4 - i3 - paramInt - i1;
      if (i2 < localaas.bottomMargin) {
        paramInt = Math.max(0, paramInt - (localaas.bottomMargin - i2));
      }
    }
  }
  
  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i2 = localMarginLayoutParams.leftMargin - paramArrayOfInt[0];
    int i3 = localMarginLayoutParams.rightMargin - paramArrayOfInt[1];
    int i1 = Math.max(0, i2) + Math.max(0, i3);
    paramArrayOfInt[0] = Math.max(0, -i2);
    paramArrayOfInt[1] = Math.max(0, -i3);
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + i1 + paramInt2, localMarginLayoutParams.width), getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin + paramInt4, localMarginLayoutParams.height));
    return paramView.getMeasuredWidth() + i1;
  }
  
  private int a(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    aas localaas = (aas)paramView.getLayoutParams();
    int i1 = localaas.leftMargin - paramArrayOfInt[0];
    paramInt1 = Math.max(0, i1) + paramInt1;
    paramArrayOfInt[0] = Math.max(0, -i1);
    paramInt2 = a(paramView, paramInt2);
    i1 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, paramInt2, paramInt1 + i1, paramView.getMeasuredHeight() + paramInt2);
    return localaas.rightMargin + i1 + paramInt1;
  }
  
  private static aas a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof aas)) {
      paramLayoutParams = new aas((aas)paramLayoutParams);
    }
    for (;;)
    {
      return paramLayoutParams;
      if ((paramLayoutParams instanceof mk)) {
        paramLayoutParams = new aas((mk)paramLayoutParams);
      } else if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
        paramLayoutParams = new aas((ViewGroup.MarginLayoutParams)paramLayoutParams);
      } else {
        paramLayoutParams = new aas(paramLayoutParams);
      }
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramInt4 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin + paramInt2, localMarginLayoutParams.width);
    paramInt2 = getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin, localMarginLayoutParams.height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824)
    {
      paramInt1 = paramInt2;
      if (paramInt5 >= 0)
      {
        paramInt1 = paramInt5;
        if (paramInt3 != 0) {
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt5);
        }
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      }
    }
    paramView.measure(paramInt4, paramInt1);
  }
  
  private void a(List paramList, int paramInt)
  {
    int i1 = 1;
    int i2 = 0;
    if (gt.g(this) == 1) {}
    int i4;
    int i3;
    View localView;
    aas localaas;
    for (;;)
    {
      i4 = getChildCount();
      i3 = fe.a(paramInt, gt.g(this));
      paramList.clear();
      paramInt = i2;
      if (i1 == 0) {
        break;
      }
      for (paramInt = i4 - 1; paramInt >= 0; paramInt--)
      {
        localView = getChildAt(paramInt);
        localaas = (aas)localView.getLayoutParams();
        if ((localaas.b == 0) && (c(localView)) && (c(localaas.a) == i3)) {
          paramList.add(localView);
        }
      }
      i1 = 0;
    }
    while (paramInt < i4)
    {
      localView = getChildAt(paramInt);
      localaas = (aas)localView.getLayoutParams();
      if ((localaas.b == 0) && (c(localView)) && (c(localaas.a) == i3)) {
        paramList.add(localView);
      }
      paramInt++;
    }
  }
  
  private int b(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    aas localaas = (aas)paramView.getLayoutParams();
    int i1 = localaas.rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i1);
    paramArrayOfInt[1] = Math.max(0, -i1);
    paramInt2 = a(paramView, paramInt2);
    i1 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i1, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - (localaas.leftMargin + i1);
  }
  
  private int c(int paramInt)
  {
    int i2 = gt.g(this);
    int i1 = fe.a(paramInt, i2) & 0x7;
    paramInt = i1;
    switch (i1)
    {
    case 2: 
    case 4: 
    default: 
      if (i2 != 1) {
        break;
      }
    }
    for (paramInt = 5;; paramInt = 3) {
      return paramInt;
    }
  }
  
  private boolean c(View paramView)
  {
    if ((paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static int d(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = ft.a(paramView);
    return ft.b(paramView) + i1;
  }
  
  private static int e(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = paramView.topMargin;
    return paramView.bottomMargin + i1;
  }
  
  public static aas g()
  {
    return new aas(-2, -2);
  }
  
  private int i()
  {
    return this.j.a;
  }
  
  private int j()
  {
    return this.j.b;
  }
  
  private void k()
  {
    if (this.s == null)
    {
      this.s = new ImageButton(getContext(), null, a.S);
      aas localaas = g();
      localaas.a = (0x800003 | this.w & 0x70);
      this.s.setLayoutParams(localaas);
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.g != paramInt)
    {
      this.g = paramInt;
      if (paramInt != 0) {
        break label26;
      }
    }
    label26:
    for (this.f = getContext();; this.f = new ContextThemeWrapper(getContext(), paramInt)) {
      return;
    }
  }
  
  public final void a(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      k();
      if (this.s.getParent() == null)
      {
        a(this.s);
        b(this.s);
      }
    }
    for (;;)
    {
      if (this.s != null) {
        this.s.setImageDrawable(paramDrawable);
      }
      return;
      if ((this.s != null) && (this.s.getParent() != null)) {
        removeView(this.s);
      }
    }
  }
  
  public final void a(View.OnClickListener paramOnClickListener)
  {
    k();
    this.s.setOnClickListener(paramOnClickListener);
  }
  
  public void a(View paramView)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject == null) {
      localObject = g();
    }
    for (;;)
    {
      ((aas)localObject).b = 1;
      addView(paramView, (ViewGroup.LayoutParams)localObject);
      return;
      if (!checkLayoutParams((ViewGroup.LayoutParams)localObject)) {
        localObject = a((ViewGroup.LayoutParams)localObject);
      } else {
        localObject = (aas)localObject;
      }
    }
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.b == null)
      {
        Context localContext = getContext();
        this.b = new TextView(localContext);
        this.b.setSingleLine();
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        if (this.h != 0) {
          this.b.setTextAppearance(localContext, this.h);
        }
      }
      if (this.b.getParent() == null)
      {
        a(this.b);
        b(this.b);
      }
    }
    for (;;)
    {
      if (this.b != null) {
        this.b.setText(paramCharSequence);
      }
      this.k = paramCharSequence;
      return;
      if ((this.b != null) && (this.b.getParent() != null)) {
        removeView(this.b);
      }
    }
  }
  
  public final boolean a()
  {
    boolean bool = true;
    int i1;
    if (this.a != null)
    {
      ActionMenuView localActionMenuView = this.a;
      if ((localActionMenuView.c != null) && (localActionMenuView.c.f()))
      {
        i1 = 1;
        if (i1 == 0) {
          break label44;
        }
      }
    }
    for (;;)
    {
      return bool;
      i1 = 0;
      break;
      label44:
      bool = false;
    }
  }
  
  public final void b(int paramInt)
  {
    if (paramInt != 0) {}
    for (CharSequence localCharSequence = getContext().getText(paramInt);; localCharSequence = null)
    {
      c(localCharSequence);
      return;
    }
  }
  
  public void b(View paramView)
  {
    if ((((aas)paramView.getLayoutParams()).b != 2) && (paramView != this.a)) {
      if (this.e == null) {
        break label38;
      }
    }
    label38:
    for (int i1 = 8;; i1 = 0)
    {
      paramView.setVisibility(i1);
      return;
    }
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.c == null)
      {
        Context localContext = getContext();
        this.c = new TextView(localContext);
        this.c.setSingleLine();
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        if (this.i != 0) {
          this.c.setTextAppearance(localContext, this.i);
        }
      }
      if (this.c.getParent() == null)
      {
        a(this.c);
        b(this.c);
      }
    }
    for (;;)
    {
      if (this.c != null) {
        this.c.setText(paramCharSequence);
      }
      this.l = paramCharSequence;
      return;
      if ((this.c != null) && (this.c.getParent() != null)) {
        removeView(this.c);
      }
    }
  }
  
  public final boolean b()
  {
    boolean bool = true;
    int i1;
    if (this.a != null)
    {
      ActionMenuView localActionMenuView = this.a;
      if ((localActionMenuView.c != null) && (localActionMenuView.c.b()))
      {
        i1 = 1;
        if (i1 == 0) {
          break label44;
        }
      }
    }
    for (;;)
    {
      return bool;
      i1 = 0;
      break;
      label44:
      bool = false;
    }
  }
  
  public final void c()
  {
    if (this.o == null) {}
    for (qe localqe = null;; localqe = this.o.a)
    {
      if (localqe != null) {
        localqe.collapseActionView();
      }
      return;
    }
  }
  
  public final void c(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      k();
    }
    if (this.s != null) {
      this.s.setContentDescription(paramCharSequence);
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof aas))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final CharSequence d()
  {
    if (this.s != null) {}
    for (CharSequence localCharSequence = this.s.getContentDescription();; localCharSequence = null) {
      return localCharSequence;
    }
  }
  
  public final Drawable e()
  {
    if (this.s != null) {}
    for (Drawable localDrawable = this.s.getDrawable();; localDrawable = null) {
      return localDrawable;
    }
  }
  
  public void f()
  {
    if (this.a == null)
    {
      this.a = new ActionMenuView(getContext());
      this.a.a(this.g);
      this.a.f = this.H;
      ActionMenuView localActionMenuView = this.a;
      qq localqq = this.p;
      Object localObject = this.q;
      localActionMenuView.d = localqq;
      localActionMenuView.e = ((qb)localObject);
      localObject = g();
      ((aas)localObject).a = (0x800005 | this.w & 0x70);
      this.a.setLayoutParams((ViewGroup.LayoutParams)localObject);
      a(this.a);
    }
  }
  
  public final se h()
  {
    if (this.I == null) {
      this.I = new ti(this, true);
    }
    return this.I;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.J);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i1 = gd.a(paramMotionEvent);
    if (i1 == 9) {
      this.E = false;
    }
    if (!this.E)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i1 == 9) && (!bool)) {
        this.E = true;
      }
    }
    if ((i1 == 10) || (i1 == 3)) {
      this.E = false;
    }
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i3;
    int i6;
    int i10;
    int i1;
    int i7;
    int i8;
    int i9;
    int[] arrayOfInt;
    int i5;
    if (gt.g(this) == 1)
    {
      i3 = 1;
      i6 = getWidth();
      i10 = getHeight();
      i1 = getPaddingLeft();
      i7 = getPaddingRight();
      i8 = getPaddingTop();
      i9 = getPaddingBottom();
      paramInt4 = i6 - i7;
      arrayOfInt = this.G;
      arrayOfInt[1] = 0;
      arrayOfInt[0] = 0;
      i5 = gt.n(this);
      if (!c(this.s)) {
        break label1704;
      }
      if (i3 == 0) {
        break label882;
      }
      paramInt4 = b(this.s, paramInt4, arrayOfInt, i5);
      paramInt1 = i1;
    }
    for (;;)
    {
      label111:
      paramInt3 = paramInt4;
      paramInt2 = paramInt1;
      if (c(this.v))
      {
        if (i3 != 0)
        {
          paramInt3 = b(this.v, paramInt4, arrayOfInt, i5);
          paramInt2 = paramInt1;
        }
      }
      else
      {
        label151:
        paramInt1 = paramInt3;
        paramInt4 = paramInt2;
        if (c(this.a))
        {
          if (i3 == 0) {
            break label921;
          }
          paramInt4 = a(this.a, paramInt2, arrayOfInt, i5);
          paramInt1 = paramInt3;
        }
        label191:
        arrayOfInt[0] = Math.max(0, i() - paramInt4);
        arrayOfInt[1] = Math.max(0, j() - (i6 - i7 - paramInt1));
        paramInt3 = Math.max(paramInt4, i());
        paramInt4 = Math.min(paramInt1, i6 - i7 - j());
        paramInt2 = paramInt4;
        paramInt1 = paramInt3;
        if (c(this.e))
        {
          if (i3 == 0) {
            break label942;
          }
          paramInt2 = b(this.e, paramInt4, arrayOfInt, i5);
          paramInt1 = paramInt3;
        }
        label293:
        if (!c(this.d)) {
          break label1696;
        }
        if (i3 == 0) {
          break label963;
        }
        paramInt3 = b(this.d, paramInt2, arrayOfInt, i5);
        paramInt2 = paramInt1;
      }
      for (;;)
      {
        label326:
        paramBoolean = c(this.b);
        boolean bool = c(this.c);
        paramInt1 = 0;
        Object localObject1;
        if (paramBoolean)
        {
          localObject1 = (aas)this.b.getLayoutParams();
          paramInt4 = ((aas)localObject1).topMargin;
          paramInt1 = this.b.getMeasuredHeight();
          paramInt1 = ((aas)localObject1).bottomMargin + (paramInt4 + paramInt1) + 0;
        }
        int i2;
        if (bool)
        {
          localObject1 = (aas)this.c.getLayoutParams();
          paramInt4 = ((aas)localObject1).topMargin;
          i2 = this.c.getMeasuredHeight();
        }
        for (int i4 = ((aas)localObject1).bottomMargin + (paramInt4 + i2) + paramInt1;; i4 = paramInt1)
        {
          label464:
          Object localObject2;
          if (!paramBoolean)
          {
            paramInt4 = paramInt3;
            paramInt1 = paramInt2;
            if (!bool) {}
          }
          else
          {
            if (!paramBoolean) {
              break label985;
            }
            localObject1 = this.b;
            if (!bool) {
              break label994;
            }
            localObject2 = this.c;
            label475:
            localObject1 = (aas)((View)localObject1).getLayoutParams();
            localObject2 = (aas)((View)localObject2).getLayoutParams();
            if (((!paramBoolean) || (this.b.getMeasuredWidth() <= 0)) && ((!bool) || (this.c.getMeasuredWidth() <= 0))) {
              break label1003;
            }
            i2 = 1;
            label527:
            switch (this.C & 0x70)
            {
            default: 
              paramInt1 = (i10 - i8 - i9 - i4) / 2;
              if (paramInt1 < ((aas)localObject1).topMargin + this.A) {
                paramInt1 = ((aas)localObject1).topMargin + this.A;
              }
              break;
            }
          }
          label599:
          label604:
          label620:
          label882:
          label921:
          label942:
          label963:
          label985:
          label994:
          label1003:
          label1123:
          label1662:
          label1680:
          label1687:
          for (;;)
          {
            paramInt1 = i8 + paramInt1;
            if (i3 != 0) {
              if (i2 != 0)
              {
                paramInt4 = this.y;
                paramInt4 -= arrayOfInt[1];
                paramInt3 -= Math.max(0, paramInt4);
                arrayOfInt[1] = Math.max(0, -paramInt4);
                if (!paramBoolean) {
                  break label1680;
                }
                localObject1 = (aas)this.b.getLayoutParams();
                paramInt4 = paramInt3 - this.b.getMeasuredWidth();
                i3 = this.b.getMeasuredHeight() + paramInt1;
                this.b.layout(paramInt4, paramInt1, paramInt3, i3);
                i4 = this.z;
                paramInt1 = i3 + ((aas)localObject1).bottomMargin;
                paramInt4 -= i4;
              }
            }
            for (;;)
            {
              if (bool)
              {
                localObject1 = (aas)this.c.getLayoutParams();
                paramInt1 = ((aas)localObject1).topMargin + paramInt1;
                i4 = this.c.getMeasuredWidth();
                i3 = this.c.getMeasuredHeight();
                this.c.layout(paramInt3 - i4, paramInt1, paramInt3, i3 + paramInt1);
                i3 = this.z;
                paramInt1 = ((aas)localObject1).bottomMargin;
              }
              for (paramInt1 = paramInt3 - i3;; paramInt1 = paramInt3)
              {
                if (i2 != 0) {}
                for (paramInt1 = Math.min(paramInt4, paramInt1);; paramInt1 = paramInt3)
                {
                  paramInt4 = paramInt1;
                  paramInt1 = paramInt2;
                  a(this.F, 3);
                  paramInt3 = this.F.size();
                  paramInt2 = 0;
                  for (;;)
                  {
                    if (paramInt2 < paramInt3)
                    {
                      paramInt1 = a((View)this.F.get(paramInt2), paramInt1, arrayOfInt, i5);
                      paramInt2++;
                      continue;
                      i3 = 0;
                      break;
                      paramInt1 = a(this.s, i1, arrayOfInt, i5);
                      break label111;
                      paramInt2 = a(this.v, paramInt1, arrayOfInt, i5);
                      paramInt3 = paramInt4;
                      break label151;
                      paramInt1 = b(this.a, paramInt3, arrayOfInt, i5);
                      paramInt4 = paramInt2;
                      break label191;
                      paramInt1 = a(this.e, paramInt3, arrayOfInt, i5);
                      paramInt2 = paramInt4;
                      break label293;
                      paramInt1 = a(this.d, paramInt1, arrayOfInt, i5);
                      paramInt3 = paramInt2;
                      paramInt2 = paramInt1;
                      break label326;
                      localObject1 = this.c;
                      break label464;
                      localObject2 = this.b;
                      break label475;
                      i2 = 0;
                      break label527;
                      paramInt1 = getPaddingTop();
                      paramInt1 = ((aas)localObject1).topMargin + paramInt1 + this.A;
                      break label604;
                      paramInt4 = i10 - i9 - i4 - paramInt1 - i8;
                      if (paramInt4 >= ((aas)localObject1).bottomMargin + this.B) {
                        break label1687;
                      }
                      paramInt1 = Math.max(0, paramInt1 - (((aas)localObject2).bottomMargin + this.B - paramInt4));
                      break label599;
                      paramInt1 = i10 - i9 - ((aas)localObject2).bottomMargin - this.B - i4;
                      break label604;
                      paramInt4 = 0;
                      break label620;
                      if (i2 != 0)
                      {
                        paramInt4 = this.y;
                        paramInt4 -= arrayOfInt[0];
                        paramInt2 += Math.max(0, paramInt4);
                        arrayOfInt[0] = Math.max(0, -paramInt4);
                        if (!paramBoolean) {
                          break label1662;
                        }
                        localObject1 = (aas)this.b.getLayoutParams();
                        i3 = this.b.getMeasuredWidth() + paramInt2;
                        paramInt4 = this.b.getMeasuredHeight() + paramInt1;
                        this.b.layout(paramInt2, paramInt1, i3, paramInt4);
                        i4 = this.z;
                        paramInt1 = ((aas)localObject1).bottomMargin;
                        i3 += i4;
                        paramInt1 += paramInt4;
                      }
                    }
                  }
                  for (;;)
                  {
                    if (bool)
                    {
                      localObject1 = (aas)this.c.getLayoutParams();
                      paramInt4 = paramInt1 + ((aas)localObject1).topMargin;
                      paramInt1 = this.c.getMeasuredWidth() + paramInt2;
                      i4 = this.c.getMeasuredHeight();
                      this.c.layout(paramInt2, paramInt4, paramInt1, i4 + paramInt4);
                      i4 = this.z;
                      paramInt4 = ((aas)localObject1).bottomMargin;
                      i4 += paramInt1;
                    }
                    for (;;)
                    {
                      paramInt4 = paramInt3;
                      paramInt1 = paramInt2;
                      if (i2 == 0) {
                        break;
                      }
                      paramInt1 = Math.max(i3, i4);
                      paramInt4 = paramInt3;
                      break;
                      paramInt4 = 0;
                      break label1123;
                      a(this.F, 5);
                      i2 = this.F.size();
                      paramInt3 = 0;
                      paramInt2 = paramInt4;
                      while (paramInt3 < i2)
                      {
                        paramInt2 = b((View)this.F.get(paramInt3), paramInt2, arrayOfInt, i5);
                        paramInt3++;
                      }
                      a(this.F, 1);
                      localObject2 = this.F;
                      i3 = arrayOfInt[0];
                      i2 = arrayOfInt[1];
                      i4 = ((List)localObject2).size();
                      paramInt4 = 0;
                      paramInt3 = 0;
                      while (paramInt4 < i4)
                      {
                        View localView = (View)((List)localObject2).get(paramInt4);
                        localObject1 = (aas)localView.getLayoutParams();
                        i3 = ((aas)localObject1).leftMargin - i3;
                        i2 = ((aas)localObject1).rightMargin - i2;
                        i9 = Math.max(0, i3);
                        i8 = Math.max(0, i2);
                        i3 = Math.max(0, -i3);
                        i2 = Math.max(0, -i2);
                        i10 = localView.getMeasuredWidth();
                        paramInt4++;
                        paramInt3 += i10 + i9 + i8;
                      }
                      paramInt4 = (i6 - i1 - i7) / 2 + i1 - paramInt3 / 2;
                      paramInt3 = paramInt4 + paramInt3;
                      if (paramInt4 < paramInt1) {}
                      for (;;)
                      {
                        paramInt3 = this.F.size();
                        for (paramInt2 = 0; paramInt2 < paramInt3; paramInt2++) {
                          paramInt1 = a((View)this.F.get(paramInt2), paramInt1, arrayOfInt, i5);
                        }
                        paramInt1 = paramInt4;
                        if (paramInt3 > paramInt2) {
                          paramInt1 = paramInt4 - (paramInt3 - paramInt2);
                        }
                      }
                      this.F.clear();
                      return;
                      i4 = paramInt2;
                    }
                    i3 = paramInt2;
                  }
                }
              }
              paramInt4 = paramInt3;
            }
          }
        }
        label1696:
        paramInt3 = paramInt2;
        paramInt2 = paramInt1;
      }
      label1704:
      paramInt1 = i1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject1 = this.G;
    int i5;
    int i6;
    int i1;
    int i4;
    int i3;
    if (tm.a(this))
    {
      i5 = 0;
      i6 = 1;
      i1 = 0;
      if (!c(this.s)) {
        break label1074;
      }
      a(this.s, paramInt1, 0, paramInt2, 0, this.x);
      i1 = this.s.getMeasuredWidth() + d(this.s);
      i4 = Math.max(0, this.s.getMeasuredHeight() + e(this.s));
      i3 = tm.a(0, gt.j(this.s));
    }
    for (;;)
    {
      int i7 = i1;
      int i2 = i3;
      i1 = i4;
      if (c(this.v))
      {
        a(this.v, paramInt1, 0, paramInt2, 0, this.x);
        i7 = this.v.getMeasuredWidth() + d(this.v);
        i1 = Math.max(i4, this.v.getMeasuredHeight() + e(this.v));
        i2 = tm.a(i3, gt.j(this.v));
      }
      Object localObject2 = this.j;
      label212:
      int i8;
      if (((sl)localObject2).g)
      {
        i3 = ((sl)localObject2).b;
        i8 = Math.max(i3, i7) + 0;
        localObject1[i6] = Math.max(0, i3 - i7);
        i6 = 0;
        i4 = i2;
        i3 = i1;
        if (c(this.a))
        {
          a(this.a, paramInt1, i8, paramInt2, 0, this.x);
          i6 = this.a.getMeasuredWidth() + d(this.a);
          i3 = Math.max(i1, this.a.getMeasuredHeight() + e(this.a));
          i4 = tm.a(i2, gt.j(this.a));
        }
        localObject2 = this.j;
        if (!((sl)localObject2).g) {
          break label681;
        }
        i1 = ((sl)localObject2).a;
        label349:
        i7 = i8 + Math.max(i1, i6);
        localObject1[i5] = Math.max(0, i1 - i6);
        i6 = i7;
        i2 = i4;
        i1 = i3;
        if (c(this.e))
        {
          i6 = i7 + a(this.e, paramInt1, i7, paramInt2, 0, (int[])localObject1);
          i1 = Math.max(i3, this.e.getMeasuredHeight() + e(this.e));
          i2 = tm.a(i4, gt.j(this.e));
        }
        i3 = i6;
        i4 = i2;
        i5 = i1;
        if (c(this.d))
        {
          i3 = i6 + a(this.d, paramInt1, i6, paramInt2, 0, (int[])localObject1);
          i5 = Math.max(i1, this.d.getMeasuredHeight() + e(this.d));
          i4 = tm.a(i2, gt.j(this.d));
        }
        i7 = getChildCount();
        i6 = 0;
        i2 = i5;
        i1 = i4;
        i4 = i6;
        i6 = i3;
        label555:
        if (i4 >= i7) {
          break label691;
        }
        localObject2 = getChildAt(i4);
        if ((((aas)((View)localObject2).getLayoutParams()).b != 0) || (!c((View)localObject2))) {
          break label1059;
        }
        i6 += a((View)localObject2, paramInt1, i6, paramInt2, 0, (int[])localObject1);
        i3 = Math.max(i2, ((View)localObject2).getMeasuredHeight() + e((View)localObject2));
        i2 = tm.a(i1, gt.j((View)localObject2));
      }
      for (i1 = i3;; i1 = i3)
      {
        i4++;
        i3 = i1;
        i1 = i2;
        i2 = i3;
        break label555;
        i5 = 1;
        i6 = 0;
        break;
        i3 = ((sl)localObject2).a;
        break label212;
        label681:
        i1 = ((sl)localObject2).b;
        break label349;
        label691:
        i5 = 0;
        i4 = 0;
        int i10 = this.A + this.B;
        int i9 = this.y + this.z;
        i3 = i1;
        if (c(this.b))
        {
          a(this.b, paramInt1, i6 + i9, paramInt2, i10, (int[])localObject1);
          i3 = this.b.getMeasuredWidth();
          i5 = d(this.b) + i3;
          i4 = this.b.getMeasuredHeight() + e(this.b);
          i3 = tm.a(i1, gt.j(this.b));
        }
        i8 = i4;
        i7 = i5;
        i1 = i3;
        if (c(this.c))
        {
          i7 = Math.max(i5, a(this.c, paramInt1, i6 + i9, paramInt2, i10 + i4, (int[])localObject1));
          i8 = i4 + (this.c.getMeasuredHeight() + e(this.c));
          i1 = tm.a(i3, gt.j(this.c));
        }
        i3 = Math.max(i2, i8);
        i2 = getPaddingLeft();
        i8 = getPaddingRight();
        i4 = getPaddingTop();
        i5 = getPaddingBottom();
        i2 = gt.a(Math.max(i7 + i6 + (i2 + i8), getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i1);
        paramInt2 = gt.a(Math.max(i3 + (i4 + i5), getSuggestedMinimumHeight()), paramInt2, i1 << 16);
        if (!this.r) {
          paramInt1 = 0;
        }
        for (;;)
        {
          if (paramInt1 != 0) {
            paramInt2 = 0;
          }
          setMeasuredDimension(i2, paramInt2);
          return;
          i1 = getChildCount();
          for (paramInt1 = 0;; paramInt1++)
          {
            if (paramInt1 >= i1) {
              break label1054;
            }
            localObject1 = getChildAt(paramInt1);
            if ((c((View)localObject1)) && (((View)localObject1).getMeasuredWidth() > 0) && (((View)localObject1).getMeasuredHeight() > 0))
            {
              paramInt1 = 0;
              break;
            }
          }
          label1054:
          paramInt1 = 1;
        }
        label1059:
        i3 = i2;
        i2 = i1;
      }
      label1074:
      i3 = 0;
      i4 = 0;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    aat localaat = (aat)paramParcelable;
    super.onRestoreInstanceState(localaat.getSuperState());
    if (this.a != null) {}
    for (paramParcelable = this.a.a;; paramParcelable = null)
    {
      if ((localaat.a != 0) && (this.o != null) && (paramParcelable != null))
      {
        paramParcelable = paramParcelable.findItem(localaat.a);
        if (paramParcelable != null) {
          fx.b(paramParcelable);
        }
      }
      if (localaat.b)
      {
        removeCallbacks(this.J);
        post(this.J);
      }
      return;
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 17) {
      super.onRtlPropertiesChanged(paramInt);
    }
    sl localsl = this.j;
    if (paramInt == 1) {
      if (bool != localsl.g)
      {
        localsl.g = bool;
        if (!localsl.h) {
          break label166;
        }
        if (!bool) {
          break label109;
        }
        if (localsl.d == Integer.MIN_VALUE) {
          break label93;
        }
        paramInt = localsl.d;
        label63:
        localsl.a = paramInt;
        if (localsl.c == Integer.MIN_VALUE) {
          break label101;
        }
        paramInt = localsl.c;
        label82:
        localsl.b = paramInt;
      }
    }
    for (;;)
    {
      return;
      bool = false;
      break;
      label93:
      paramInt = localsl.e;
      break label63;
      label101:
      paramInt = localsl.f;
      break label82;
      label109:
      if (localsl.c != Integer.MIN_VALUE)
      {
        paramInt = localsl.c;
        label123:
        localsl.a = paramInt;
        if (localsl.d == Integer.MIN_VALUE) {
          break label158;
        }
      }
      label158:
      for (paramInt = localsl.d;; paramInt = localsl.f)
      {
        localsl.b = paramInt;
        break;
        paramInt = localsl.e;
        break label123;
      }
      label166:
      localsl.a = localsl.e;
      localsl.b = localsl.f;
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    aat localaat = new aat(super.onSaveInstanceState());
    if ((this.o != null) && (this.o.a != null)) {
      localaat.a = this.o.a.getItemId();
    }
    localaat.b = a();
    return localaat;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = gd.a(paramMotionEvent);
    if (i1 == 0) {
      this.D = false;
    }
    if (!this.D)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i1 == 0) && (!bool)) {
        this.D = true;
      }
    }
    if ((i1 == 1) || (i1 == 3)) {
      this.D = false;
    }
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\widget\Toolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
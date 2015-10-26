package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import qa;
import qb;
import qc;
import qe;
import qq;
import qr;
import tm;
import vu;
import wc;
import wd;
import we;
import wf;
import wg;
import xu;

public class ActionMenuView
  extends xu
  implements qc, qr
{
  public qa a;
  public boolean b;
  public vu c;
  qq d;
  qb e;
  wg f;
  private Context i;
  private Context j;
  private int k;
  private boolean l;
  private int m;
  private int n;
  private int o;
  
  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.i = paramContext;
    this.g = false;
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.n = ((int)(56.0F * f1));
    this.o = ((int)(f1 * 4.0F));
    this.j = paramContext;
    this.k = 0;
  }
  
  public static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool2 = false;
    we localwe = (we)paramView.getLayoutParams();
    int i1 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    ActionMenuItemView localActionMenuItemView;
    if ((paramView instanceof ActionMenuItemView))
    {
      localActionMenuItemView = (ActionMenuItemView)paramView;
      if ((localActionMenuItemView == null) || (!localActionMenuItemView.c())) {
        break label184;
      }
      paramInt4 = 1;
      label57:
      if ((paramInt2 <= 0) || ((paramInt4 != 0) && (paramInt2 < 2))) {
        break label190;
      }
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, Integer.MIN_VALUE), i1);
      int i2 = paramView.getMeasuredWidth();
      paramInt3 = i2 / paramInt1;
      paramInt2 = paramInt3;
      if (i2 % paramInt1 != 0) {
        paramInt2 = paramInt3 + 1;
      }
      paramInt3 = paramInt2;
      if (paramInt4 != 0)
      {
        paramInt3 = paramInt2;
        if (paramInt2 >= 2) {}
      }
    }
    label184:
    label190:
    for (paramInt3 = 2;; paramInt3 = 0)
    {
      boolean bool1 = bool2;
      if (!localwe.a)
      {
        bool1 = bool2;
        if (paramInt4 != 0) {
          bool1 = true;
        }
      }
      localwe.d = bool1;
      localwe.b = paramInt3;
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt3 * paramInt1, 1073741824), i1);
      return paramInt3;
      localActionMenuItemView = null;
      break;
      paramInt4 = 0;
      break label57;
    }
  }
  
  private we b(AttributeSet paramAttributeSet)
  {
    return new we(getContext(), paramAttributeSet);
  }
  
  private boolean c(int paramInt)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramInt == 0) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      View localView2 = getChildAt(paramInt - 1);
      View localView1 = getChildAt(paramInt);
      bool1 = bool2;
      if (paramInt < getChildCount())
      {
        bool1 = bool2;
        if ((localView2 instanceof wc)) {
          bool1 = ((wc)localView2).e() | false;
        }
      }
      if ((paramInt > 0) && ((localView1 instanceof wc))) {
        bool1 = ((wc)localView1).d() | bool1;
      }
    }
  }
  
  private static we e()
  {
    we localwe = new we(-2, -2);
    localwe.h = 16;
    return localwe;
  }
  
  public final we a()
  {
    we localwe = e();
    localwe.a = true;
    return localwe;
  }
  
  public final we a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null) {
      if ((paramLayoutParams instanceof we))
      {
        paramLayoutParams = new we((we)paramLayoutParams);
        localObject = paramLayoutParams;
        if (paramLayoutParams.h <= 0) {
          paramLayoutParams.h = 16;
        }
      }
    }
    for (Object localObject = paramLayoutParams;; localObject = e())
    {
      return (we)localObject;
      paramLayoutParams = new we(paramLayoutParams);
      break;
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.k != paramInt)
    {
      this.k = paramInt;
      if (paramInt != 0) {
        break label26;
      }
    }
    label26:
    for (this.j = this.i;; this.j = new ContextThemeWrapper(this.i, paramInt)) {
      return;
    }
  }
  
  public final void a(qa paramqa)
  {
    this.a = paramqa;
  }
  
  public final void a(vu paramvu)
  {
    this.c = paramvu;
    this.c.a(this);
  }
  
  public final boolean a(qe paramqe)
  {
    return this.a.a(paramqe, null, 0);
  }
  
  public final Menu b()
  {
    vu localvu;
    if (this.a == null)
    {
      localObject = getContext();
      this.a = new qa((Context)localObject);
      this.a.a(new wf(this));
      this.c = new vu((Context)localObject);
      this.c.c(true);
      localvu = this.c;
      if (this.d == null) {
        break label109;
      }
    }
    label109:
    for (Object localObject = this.d;; localObject = new wd(this))
    {
      localvu.d = ((qq)localObject);
      this.a.a(this.c, this.j);
      this.c.a(this);
      return this.a;
    }
  }
  
  public final void c()
  {
    if (this.c != null) {
      this.c.d();
    }
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams != null) && ((paramLayoutParams instanceof we))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    if (this.c != null)
    {
      this.c.b(false);
      if (this.c.f())
      {
        this.c.c();
        this.c.b();
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    c();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!this.l)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int i6 = getChildCount();
    int i5 = (paramInt4 - paramInt2) / 2;
    int i7 = this.h;
    paramInt2 = 0;
    int i1 = paramInt3 - paramInt1 - getPaddingRight() - getPaddingLeft();
    paramInt4 = 0;
    paramBoolean = tm.a(this);
    int i2 = 0;
    label68:
    Object localObject2;
    Object localObject1;
    int i3;
    int i8;
    int i4;
    label172:
    int i9;
    if (i2 < i6)
    {
      localObject2 = getChildAt(i2);
      if (((View)localObject2).getVisibility() == 8) {
        break label682;
      }
      localObject1 = (we)((View)localObject2).getLayoutParams();
      if (((we)localObject1).a)
      {
        i3 = ((View)localObject2).getMeasuredWidth();
        paramInt4 = i3;
        if (c(i2)) {
          paramInt4 = i3 + i7;
        }
        i8 = ((View)localObject2).getMeasuredHeight();
        if (paramBoolean)
        {
          i3 = getPaddingLeft();
          i3 = ((we)localObject1).leftMargin + i3;
          i4 = i3 + paramInt4;
          i9 = i5 - i8 / 2;
          ((View)localObject2).layout(i3, i9, i4, i8 + i9);
          paramInt4 = i1 - paramInt4;
          i3 = 1;
          i1 = paramInt2;
          paramInt2 = i3;
        }
      }
    }
    for (;;)
    {
      i3 = i2 + 1;
      i2 = i1;
      i1 = paramInt4;
      paramInt4 = paramInt2;
      paramInt2 = i2;
      i2 = i3;
      break label68;
      i4 = getWidth() - getPaddingRight() - ((we)localObject1).rightMargin;
      i3 = i4 - paramInt4;
      break label172;
      i9 = ((View)localObject2).getMeasuredWidth();
      i8 = ((we)localObject1).leftMargin;
      i4 = ((we)localObject1).rightMargin;
      c(i2);
      i3 = paramInt2 + 1;
      i1 -= i4 + (i9 + i8);
      paramInt2 = paramInt4;
      paramInt4 = i1;
      i1 = i3;
      continue;
      if ((i6 == 1) && (paramInt4 == 0))
      {
        localObject1 = getChildAt(0);
        paramInt2 = ((View)localObject1).getMeasuredWidth();
        paramInt4 = ((View)localObject1).getMeasuredHeight();
        paramInt1 = (paramInt3 - paramInt1) / 2 - paramInt2 / 2;
        paramInt3 = i5 - paramInt4 / 2;
        ((View)localObject1).layout(paramInt1, paramInt3, paramInt2 + paramInt1, paramInt4 + paramInt3);
        break;
      }
      if (paramInt4 != 0)
      {
        paramInt1 = 0;
        label404:
        paramInt1 = paramInt2 - paramInt1;
        if (paramInt1 <= 0) {
          break label555;
        }
        paramInt1 = i1 / paramInt1;
        label417:
        paramInt3 = Math.max(0, paramInt1);
        if (!paramBoolean) {
          break label560;
        }
        paramInt1 = getWidth() - getPaddingRight();
        paramInt2 = 0;
        label440:
        if (paramInt2 < i6)
        {
          localObject2 = getChildAt(paramInt2);
          localObject1 = (we)((View)localObject2).getLayoutParams();
          if ((((View)localObject2).getVisibility() == 8) || (((we)localObject1).a)) {
            break label679;
          }
          i1 = paramInt1 - ((we)localObject1).rightMargin;
          paramInt1 = ((View)localObject2).getMeasuredWidth();
          i2 = ((View)localObject2).getMeasuredHeight();
          paramInt4 = i5 - i2 / 2;
          ((View)localObject2).layout(i1 - paramInt1, paramInt4, i1, i2 + paramInt4);
          paramInt1 = i1 - (((we)localObject1).leftMargin + paramInt1 + paramInt3);
        }
      }
      label555:
      label560:
      label567:
      label676:
      label679:
      for (;;)
      {
        paramInt2++;
        break label440;
        break;
        paramInt1 = 1;
        break label404;
        paramInt1 = 0;
        break label417;
        paramInt1 = getPaddingLeft();
        paramInt2 = 0;
        if (paramInt2 < i6)
        {
          localObject1 = getChildAt(paramInt2);
          localObject2 = (we)((View)localObject1).getLayoutParams();
          if ((((View)localObject1).getVisibility() == 8) || (((we)localObject2).a)) {
            break label676;
          }
          paramInt1 += ((we)localObject2).leftMargin;
          paramInt4 = ((View)localObject1).getMeasuredWidth();
          i1 = ((View)localObject1).getMeasuredHeight();
          i2 = i5 - i1 / 2;
          ((View)localObject1).layout(paramInt1, i2, paramInt1 + paramInt4, i1 + i2);
          paramInt1 = ((we)localObject2).rightMargin + paramInt4 + paramInt3 + paramInt1;
        }
        for (;;)
        {
          paramInt2++;
          break label567;
          break;
        }
      }
      label682:
      i3 = paramInt2;
      paramInt2 = paramInt4;
      paramInt4 = i1;
      i1 = i3;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool2 = this.l;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {}
    int i1;
    int i2;
    int i12;
    int i11;
    int i9;
    int i13;
    int i14;
    for (boolean bool1 = true;; bool1 = false)
    {
      this.l = bool1;
      if (bool2 != this.l) {
        this.m = 0;
      }
      i1 = View.MeasureSpec.getSize(paramInt1);
      if ((this.l) && (this.a != null) && (i1 != this.m))
      {
        this.m = i1;
        this.a.b(true);
      }
      i2 = getChildCount();
      if ((!this.l) || (i2 <= 0)) {
        break label1290;
      }
      i12 = View.MeasureSpec.getMode(paramInt2);
      i1 = View.MeasureSpec.getSize(paramInt1);
      i11 = View.MeasureSpec.getSize(paramInt2);
      i2 = getPaddingLeft();
      paramInt1 = getPaddingRight();
      i9 = getPaddingTop() + getPaddingBottom();
      i13 = getChildMeasureSpec(paramInt2, i9, -2);
      i14 = i1 - (i2 + paramInt1);
      paramInt1 = i14 / this.n;
      paramInt2 = this.n;
      if (paramInt1 != 0) {
        break;
      }
      setMeasuredDimension(i14, 0);
      return;
    }
    int i16 = this.n + i14 % paramInt2 / paramInt1;
    paramInt2 = 0;
    int i5 = 0;
    int i4 = 0;
    int i6 = 0;
    int i3 = 0;
    long l1 = 0L;
    int i15 = getChildCount();
    int i7 = 0;
    label228:
    View localView;
    we localwe;
    label348:
    label366:
    int i8;
    label404:
    label415:
    long l2;
    if (i7 < i15)
    {
      localView = getChildAt(i7);
      if (localView.getVisibility() == 8) {
        break label1418;
      }
      bool1 = localView instanceof ActionMenuItemView;
      i6++;
      if (bool1) {
        localView.setPadding(this.o, 0, this.o, 0);
      }
      localwe = (we)localView.getLayoutParams();
      localwe.f = false;
      localwe.c = 0;
      localwe.b = 0;
      localwe.d = false;
      localwe.leftMargin = 0;
      localwe.rightMargin = 0;
      if ((bool1) && (((ActionMenuItemView)localView).c()))
      {
        bool1 = true;
        localwe.e = bool1;
        if (!localwe.a) {
          break label504;
        }
        i1 = 1;
        i8 = a(localView, i16, i1, i13, i9);
        i5 = Math.max(i5, i8);
        if (!localwe.d) {
          break label1411;
        }
        i1 = i4 + 1;
        if (!localwe.a) {
          break label1404;
        }
        i2 = 1;
        i3 = paramInt1 - i8;
        i4 = Math.max(paramInt2, localView.getMeasuredHeight());
        if (i8 != 1) {
          break label1371;
        }
        l2 = 1 << i7;
        paramInt1 = i4;
        i8 = i3;
        i4 = i1;
        i3 = i2;
        l1 = l2 | l1;
        paramInt2 = i5;
        i2 = i8;
        i1 = paramInt1;
        paramInt1 = i6;
      }
    }
    for (;;)
    {
      i7++;
      i6 = paramInt1;
      paramInt1 = i2;
      i5 = paramInt2;
      paramInt2 = i1;
      break label228;
      bool1 = false;
      break label348;
      label504:
      i1 = paramInt1;
      break label366;
      label524:
      label533:
      long l3;
      if ((i3 != 0) && (i6 == 2))
      {
        i8 = 1;
        i1 = 0;
        i7 = paramInt1;
        paramInt1 = i1;
        l3 = l1;
        if (i4 <= 0) {
          break label851;
        }
        l3 = l1;
        if (i7 <= 0) {
          break label851;
        }
        i1 = Integer.MAX_VALUE;
        l2 = 0L;
        i2 = 0;
        i9 = 0;
        label565:
        if (i9 >= i15) {
          break label689;
        }
        localwe = (we)getChildAt(i9).getLayoutParams();
        if (!localwe.d) {
          break label1356;
        }
        if (localwe.b >= i1) {
          break label652;
        }
        i2 = localwe.b;
        l2 = 1 << i9;
        i1 = 1;
      }
      for (;;)
      {
        int i10 = i9 + 1;
        i9 = i2;
        i2 = i1;
        i1 = i9;
        i9 = i10;
        break label565;
        i8 = 0;
        break label524;
        label652:
        if (localwe.b == i1)
        {
          l2 |= 1 << i9;
          i10 = i2 + 1;
          i2 = i1;
          i1 = i10;
          continue;
          label689:
          l1 |= l2;
          l3 = l1;
          if (i2 <= i7)
          {
            i2 = 0;
            paramInt1 = i7;
            label713:
            if (i2 < i15)
            {
              localView = getChildAt(i2);
              localwe = (we)localView.getLayoutParams();
              if ((1 << i2 & l2) == 0L)
              {
                if (localwe.b != i1 + 1) {
                  break label1353;
                }
                l1 |= 1 << i2;
              }
            }
          }
          label851:
          label1017:
          label1020:
          label1125:
          label1193:
          label1196:
          label1199:
          label1290:
          label1347:
          label1353:
          for (;;)
          {
            i2++;
            break label713;
            if ((i8 != 0) && (localwe.e) && (paramInt1 == 1)) {
              localView.setPadding(this.o + i16, 0, this.o, 0);
            }
            localwe.b += 1;
            localwe.f = true;
            paramInt1--;
            continue;
            i1 = 1;
            i7 = paramInt1;
            paramInt1 = i1;
            break label533;
            float f2;
            float f1;
            if ((i3 == 0) && (i6 == 1))
            {
              i1 = 1;
              if ((i7 <= 0) || (l3 == 0L) || ((i7 >= i6 - 1) && (i1 == 0) && (i5 <= 1))) {
                break label1196;
              }
              float f3 = Long.bitCount(l3);
              f2 = f3;
              if (i1 != 0) {
                break label1347;
              }
              f1 = f3;
              if ((1L & l3) != 0L)
              {
                f1 = f3;
                if (!((we)getChildAt(0).getLayoutParams()).e) {
                  f1 = f3 - 0.5F;
                }
              }
              f2 = f1;
              if ((1 << i15 - 1 & l3) == 0L) {
                break label1347;
              }
              f2 = f1;
              if (((we)getChildAt(i15 - 1).getLayoutParams()).e) {
                break label1347;
              }
            }
            for (f1 -= 0.5F;; f1 = f2)
            {
              if (f1 > 0.0F)
              {
                i1 = (int)(i7 * i16 / f1);
                i2 = 0;
                i3 = paramInt1;
                if (i2 >= i15) {
                  break label1199;
                }
                if ((1 << i2 & l3) == 0L) {
                  break label1193;
                }
                localView = getChildAt(i2);
                localwe = (we)localView.getLayoutParams();
                if (!(localView instanceof ActionMenuItemView)) {
                  break label1125;
                }
                localwe.c = i1;
                localwe.f = true;
                if ((i2 == 0) && (!localwe.e)) {
                  localwe.leftMargin = (-i1 / 2);
                }
                paramInt1 = 1;
              }
              for (;;)
              {
                i2++;
                break label1020;
                i1 = 0;
                break;
                i1 = 0;
                break label1017;
                if (localwe.a)
                {
                  localwe.c = i1;
                  localwe.f = true;
                  localwe.rightMargin = (-i1 / 2);
                  paramInt1 = 1;
                }
                else
                {
                  if (i2 != 0) {
                    localwe.leftMargin = (i1 / 2);
                  }
                  if (i2 != i15 - 1) {
                    localwe.rightMargin = (i1 / 2);
                  }
                }
              }
              i3 = paramInt1;
              if (i3 != 0) {
                for (paramInt1 = 0; paramInt1 < i15; paramInt1++)
                {
                  localView = getChildAt(paramInt1);
                  localwe = (we)localView.getLayoutParams();
                  if (localwe.f)
                  {
                    i1 = localwe.b;
                    localView.measure(View.MeasureSpec.makeMeasureSpec(localwe.c + i1 * i16, 1073741824), i13);
                  }
                }
              }
              if (i12 != 1073741824) {}
              for (;;)
              {
                setMeasuredDimension(i14, paramInt2);
                break;
                for (i1 = 0; i1 < i2; i1++)
                {
                  localwe = (we)getChildAt(i1).getLayoutParams();
                  localwe.rightMargin = 0;
                  localwe.leftMargin = 0;
                }
                super.onMeasure(paramInt1, paramInt2);
                break;
                paramInt2 = i11;
              }
            }
          }
        }
        else
        {
          label1356:
          i10 = i2;
          i2 = i1;
          i1 = i10;
        }
      }
      label1371:
      paramInt1 = i6;
      paramInt2 = i5;
      i5 = i4;
      i6 = i3;
      i4 = i1;
      i3 = i2;
      i1 = i5;
      i2 = i6;
      continue;
      label1404:
      i2 = i3;
      break label415;
      label1411:
      i1 = i4;
      break label404;
      label1418:
      i1 = paramInt2;
      i2 = paramInt1;
      paramInt2 = i5;
      paramInt1 = i6;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\widget\ActionMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
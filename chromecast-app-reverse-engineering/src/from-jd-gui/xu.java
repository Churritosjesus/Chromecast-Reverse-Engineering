import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class xu
  extends ViewGroup
{
  private int a = -1;
  private int b = 0;
  private int c;
  private int d = 8388659;
  private int e;
  private float f;
  public boolean g = true;
  public int h;
  private boolean i;
  private int[] j;
  private int[] k;
  private Drawable l;
  private int m;
  private int n;
  private int o;
  
  public xu(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public xu(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public xu(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = th.a(paramContext, paramAttributeSet, oq.aa, paramInt, 0);
    paramInt = paramContext.a(oq.ae, -1);
    if ((paramInt >= 0) && (this.c != paramInt))
    {
      this.c = paramInt;
      requestLayout();
    }
    paramInt = paramContext.a(oq.ad, -1);
    if (paramInt >= 0) {
      b(paramInt);
    }
    boolean bool2 = paramContext.a(oq.ab, true);
    if (!bool2) {
      this.g = bool2;
    }
    paramInt = oq.af;
    this.f = paramContext.a.getFloat(paramInt, -1.0F);
    this.a = paramContext.a(oq.ac, -1);
    this.i = paramContext.a(oq.ai, false);
    paramAttributeSet = paramContext.a(oq.ag);
    if (paramAttributeSet != this.l)
    {
      this.l = paramAttributeSet;
      if (paramAttributeSet == null) {
        break label240;
      }
      this.h = paramAttributeSet.getIntrinsicWidth();
      this.m = paramAttributeSet.getIntrinsicHeight();
      if (paramAttributeSet != null) {
        break label253;
      }
    }
    for (;;)
    {
      setWillNotDraw(bool1);
      requestLayout();
      this.n = paramContext.a(oq.aj, 0);
      this.o = paramContext.c(oq.ah, 0);
      paramContext.a.recycle();
      return;
      label240:
      this.h = 0;
      this.m = 0;
      break;
      label253:
      bool1 = false;
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (int i1 = 0; i1 < paramInt1; i1++)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() != 8)
      {
        xv localxv = (xv)localView.getLayoutParams();
        if (localxv.width == -1)
        {
          int i3 = localxv.height;
          localxv.height = localView.getMeasuredHeight();
          measureChildWithMargins(localView, i2, 0, paramInt2, 0);
          localxv.height = i3;
        }
      }
    }
  }
  
  private void a(Canvas paramCanvas, int paramInt)
  {
    this.l.setBounds(getPaddingLeft() + this.o, paramInt, getWidth() - getPaddingRight() - this.o, this.m + paramInt);
    this.l.draw(paramCanvas);
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private boolean a(int paramInt)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramInt == 0) {
      if ((this.n & 0x1) != 0) {
        bool1 = bool2;
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      continue;
      if (paramInt == getChildCount())
      {
        bool1 = bool2;
        if ((this.n & 0x4) == 0) {
          bool1 = false;
        }
      }
      else
      {
        if ((this.n & 0x2) != 0)
        {
          paramInt--;
          for (;;)
          {
            if (paramInt < 0) {
              break label90;
            }
            bool1 = bool2;
            if (getChildAt(paramInt).getVisibility() != 8) {
              break;
            }
            paramInt--;
          }
        }
        bool1 = false;
        continue;
        label90:
        bool1 = false;
      }
    }
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    this.e = 0;
    int i8 = 0;
    int i4 = 0;
    int i3 = 0;
    int i7 = 0;
    int i5 = 1;
    float f1 = 0.0F;
    int i16 = getChildCount();
    int i18 = View.MeasureSpec.getMode(paramInt1);
    int i17 = View.MeasureSpec.getMode(paramInt2);
    int i6 = 0;
    int i1 = 0;
    if ((this.j == null) || (this.k == null))
    {
      this.j = new int[4];
      this.k = new int[4];
    }
    Object localObject1 = this.j;
    Object localObject2 = this.k;
    localObject1[3] = -1;
    localObject1[2] = -1;
    localObject1[1] = -1;
    localObject1[0] = -1;
    localObject2[3] = -1;
    localObject2[2] = -1;
    localObject2[1] = -1;
    localObject2[0] = -1;
    boolean bool2 = this.g;
    boolean bool1 = this.i;
    if (i18 == 1073741824) {}
    int i2;
    int i11;
    Object localObject4;
    int i9;
    int i14;
    int i13;
    int i12;
    for (int i10 = 1;; i10 = 0)
    {
      i2 = Integer.MIN_VALUE;
      i11 = 0;
      for (;;)
      {
        if (i11 >= i16) {
          break label899;
        }
        localObject4 = getChildAt(i11);
        if (localObject4 != null) {
          break;
        }
        this.e = this.e;
        i9 = i3;
        i14 = i7;
        i13 = i1;
        i1 = i2;
        i12 = i6;
        i11++;
        i6 = i12;
        i2 = i1;
        i1 = i13;
        i7 = i14;
        i3 = i9;
      }
    }
    Object localObject3;
    label335:
    label368:
    label393:
    int i15;
    if (((View)localObject4).getVisibility() != 8)
    {
      if (a(i11)) {
        this.e += this.h;
      }
      localObject3 = (xv)((View)localObject4).getLayoutParams();
      f1 += ((xv)localObject3).g;
      if ((i18 == 1073741824) && (((xv)localObject3).width == 0) && (((xv)localObject3).g > 0.0F)) {
        if (i10 != 0)
        {
          this.e += ((xv)localObject3).leftMargin + ((xv)localObject3).rightMargin;
          if (!bool2) {
            break label644;
          }
          i9 = View.MeasureSpec.makeMeasureSpec(0, 0);
          ((View)localObject4).measure(i9, i9);
          i9 = i2;
          i2 = i1;
          i1 = i9;
          i12 = 0;
          if ((i17 == 1073741824) || (((xv)localObject3).height != -1)) {
            break label2294;
          }
          i9 = 1;
          i12 = 1;
          i13 = ((xv)localObject3).topMargin + ((xv)localObject3).bottomMargin;
          i14 = ((View)localObject4).getMeasuredHeight() + i13;
          i15 = tm.a(i4, gt.j((View)localObject4));
          if (bool2)
          {
            i6 = ((View)localObject4).getBaseline();
            if (i6 != -1)
            {
              if (((xv)localObject3).h >= 0) {
                break label832;
              }
              i4 = this.d;
              label460:
              i4 = ((i4 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              localObject1[i4] = Math.max(localObject1[i4], i6);
              localObject2[i4] = Math.max(localObject2[i4], i14 - i6);
            }
          }
          i6 = Math.max(i8, i14);
          if ((i5 == 0) || (((xv)localObject3).height != -1)) {
            break label842;
          }
          i4 = 1;
          label533:
          if (((xv)localObject3).g <= 0.0F) {
            break label851;
          }
          if (i12 == 0) {
            break label848;
          }
          i14 = i13;
          label552:
          i8 = Math.max(i7, i14);
          i5 = i4;
          i4 = i3;
          i3 = i6;
          i7 = i15;
          i6 = i4;
          i4 = i8;
        }
      }
    }
    for (;;)
    {
      i12 = i9;
      i13 = i2;
      i14 = i4;
      i9 = i6;
      i4 = i7;
      i8 = i3;
      break;
      i9 = this.e;
      this.e = Math.max(i9, ((xv)localObject3).leftMargin + i9 + ((xv)localObject3).rightMargin);
      break label335;
      label644:
      i1 = i2;
      i2 = 1;
      break label368;
      i12 = Integer.MIN_VALUE;
      i9 = i12;
      if (((xv)localObject3).width == 0)
      {
        i9 = i12;
        if (((xv)localObject3).g > 0.0F)
        {
          i9 = 0;
          ((xv)localObject3).width = -2;
        }
      }
      if (f1 == 0.0F)
      {
        i12 = this.e;
        label706:
        a((View)localObject4, paramInt1, i12, paramInt2, 0);
        if (i9 != Integer.MIN_VALUE) {
          ((xv)localObject3).width = i9;
        }
        i9 = ((View)localObject4).getMeasuredWidth();
        if (i10 == 0) {
          break label797;
        }
        this.e += ((xv)localObject3).leftMargin + i9 + ((xv)localObject3).rightMargin;
      }
      for (;;)
      {
        if (bool1)
        {
          i9 = Math.max(i9, i2);
          i2 = i1;
          i1 = i9;
          break;
          i12 = 0;
          break label706;
          label797:
          i12 = this.e;
          this.e = Math.max(i12, i12 + i9 + ((xv)localObject3).leftMargin + ((xv)localObject3).rightMargin);
          continue;
          label832:
          i4 = ((xv)localObject3).h;
          break label460;
          label842:
          i4 = 0;
          break label533;
          label848:
          break label552;
          label851:
          if (i12 != 0) {}
          for (;;)
          {
            i3 = Math.max(i3, i13);
            i8 = i6;
            i5 = i4;
            i4 = i7;
            i6 = i3;
            i7 = i15;
            i3 = i8;
            break;
            i13 = i14;
          }
          label899:
          if ((this.e > 0) && (a(i16))) {
            this.e += this.h;
          }
          if ((localObject1[1] != -1) || (localObject1[0] != -1) || (localObject1[2] != -1) || (localObject1[3] != -1)) {
            i8 = Math.max(i8, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + Math.max(localObject2[3], Math.max(localObject2[0], Math.max(localObject2[1], localObject2[2]))));
          }
          for (;;)
          {
            if ((bool1) && ((i18 == Integer.MIN_VALUE) || (i18 == 0)))
            {
              this.e = 0;
              i9 = 0;
              if (i9 < i16)
              {
                localObject3 = getChildAt(i9);
                if (localObject3 == null) {
                  this.e = this.e;
                }
                for (;;)
                {
                  i9++;
                  break;
                  if (((View)localObject3).getVisibility() != 8)
                  {
                    localObject3 = (xv)((View)localObject3).getLayoutParams();
                    if (i10 != 0)
                    {
                      i12 = this.e;
                      i11 = ((xv)localObject3).leftMargin;
                      this.e = (((xv)localObject3).rightMargin + (i11 + i2) + i12);
                    }
                    else
                    {
                      i11 = this.e;
                      i12 = ((xv)localObject3).leftMargin;
                      this.e = Math.max(i11, ((xv)localObject3).rightMargin + (i11 + i2 + i12));
                    }
                  }
                }
              }
            }
            this.e += getPaddingLeft() + getPaddingRight();
            i13 = gt.a(Math.max(this.e, getSuggestedMinimumWidth()), paramInt1, 0);
            i9 = (0xFFFFFF & i13) - this.e;
            if ((i1 != 0) || ((i9 != 0) && (f1 > 0.0F)))
            {
              if (this.f > 0.0F) {
                f1 = this.f;
              }
              localObject1[3] = -1;
              localObject1[2] = -1;
              localObject1[1] = -1;
              localObject1[0] = -1;
              localObject2[3] = -1;
              localObject2[2] = -1;
              localObject2[1] = -1;
              localObject2[0] = -1;
              this.e = 0;
              i8 = 0;
              i2 = i5;
              i5 = -1;
              i1 = i4;
              i4 = i5;
              i5 = i9;
              if (i8 < i16)
              {
                localObject3 = getChildAt(i8);
                if ((localObject3 == null) || (((View)localObject3).getVisibility() == 8)) {
                  break label2260;
                }
                localObject4 = (xv)((View)localObject3).getLayoutParams();
                float f2 = ((xv)localObject4).g;
                if (f2 <= 0.0F) {
                  break label2245;
                }
                i9 = (int)(i5 * f2 / f1);
                i12 = getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom() + ((xv)localObject4).topMargin + ((xv)localObject4).bottomMargin, ((xv)localObject4).height);
                if ((((xv)localObject4).width != 0) || (i18 != 1073741824))
                {
                  i11 = i9 + ((View)localObject3).getMeasuredWidth();
                  i7 = i11;
                  if (i11 < 0) {
                    i7 = 0;
                  }
                  label1458:
                  ((View)localObject3).measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), i12);
                  i1 = tm.a(i1, gt.j((View)localObject3) & 0xFF000000);
                  f1 -= f2;
                  i7 = i5 - i9;
                  i5 = i1;
                  i1 = i7;
                  label1508:
                  if (i10 == 0) {
                    break label1779;
                  }
                  this.e += ((View)localObject3).getMeasuredWidth() + ((xv)localObject4).leftMargin + ((xv)localObject4).rightMargin;
                  label1539:
                  if ((i17 == 1073741824) || (((xv)localObject4).height != -1)) {
                    break label1817;
                  }
                  i7 = 1;
                  label1558:
                  i12 = ((xv)localObject4).topMargin + ((xv)localObject4).bottomMargin;
                  i11 = ((View)localObject3).getMeasuredHeight() + i12;
                  i9 = Math.max(i4, i11);
                  if (i7 == 0) {
                    break label1823;
                  }
                  i4 = i12;
                  label1599:
                  i4 = Math.max(i3, i4);
                  if ((i2 == 0) || (((xv)localObject4).height != -1)) {
                    break label1830;
                  }
                  i2 = 1;
                  label1625:
                  if (bool2)
                  {
                    i7 = ((View)localObject3).getBaseline();
                    if (i7 != -1)
                    {
                      if (((xv)localObject4).h >= 0) {
                        break label1836;
                      }
                      i3 = this.d;
                      label1657:
                      i3 = ((i3 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                      localObject1[i3] = Math.max(localObject1[i3], i7);
                      localObject2[i3] = Math.max(localObject2[i3], i11 - i7);
                    }
                  }
                  i7 = i5;
                  i5 = i2;
                  i3 = i9;
                  i2 = i7;
                }
              }
            }
            for (;;)
            {
              i9 = i8 + 1;
              i7 = i5;
              i8 = i3;
              i5 = i1;
              i1 = i2;
              i2 = i7;
              i3 = i4;
              i4 = i8;
              i8 = i9;
              break;
              if (i9 > 0)
              {
                i7 = i9;
                break label1458;
              }
              i7 = 0;
              break label1458;
              label1779:
              i7 = this.e;
              this.e = Math.max(i7, ((View)localObject3).getMeasuredWidth() + i7 + ((xv)localObject4).leftMargin + ((xv)localObject4).rightMargin);
              break label1539;
              label1817:
              i7 = 0;
              break label1558;
              label1823:
              i4 = i11;
              break label1599;
              label1830:
              i2 = 0;
              break label1625;
              label1836:
              i3 = ((xv)localObject4).h;
              break label1657;
              this.e += getPaddingLeft() + getPaddingRight();
              if ((localObject1[1] == -1) && (localObject1[0] == -1) && (localObject1[2] == -1))
              {
                i5 = i4;
                if (localObject1[3] == -1) {}
              }
              else
              {
                i5 = Math.max(i4, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + Math.max(localObject2[3], Math.max(localObject2[0], Math.max(localObject2[1], localObject2[2]))));
              }
              i4 = i1;
              i1 = i5;
              i5 = i2;
              i2 = i3;
              for (;;)
              {
                if ((i5 == 0) && (i17 != 1073741824)) {}
                for (;;)
                {
                  setMeasuredDimension(0xFF000000 & i4 | i13, gt.a(Math.max(i2 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), paramInt2, i4 << 16));
                  if (i6 != 0)
                  {
                    i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    paramInt2 = 0;
                    while (paramInt2 < i16)
                    {
                      localObject2 = getChildAt(paramInt2);
                      if (((View)localObject2).getVisibility() != 8)
                      {
                        localObject1 = (xv)((View)localObject2).getLayoutParams();
                        if (((xv)localObject1).height == -1)
                        {
                          i2 = ((xv)localObject1).width;
                          ((xv)localObject1).width = ((View)localObject2).getMeasuredWidth();
                          measureChildWithMargins((View)localObject2, paramInt1, 0, i1, 0);
                          ((xv)localObject1).width = i2;
                        }
                      }
                      paramInt2++;
                      continue;
                      i3 = Math.max(i3, i7);
                      if ((!bool1) || (i18 == 1073741824)) {
                        break label2234;
                      }
                      for (i1 = 0; i1 < i16; i1++)
                      {
                        localObject1 = getChildAt(i1);
                        if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (((xv)((View)localObject1).getLayoutParams()).g > 0.0F)) {
                          ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredHeight(), 1073741824));
                        }
                      }
                    }
                  }
                  return;
                  i2 = i1;
                }
                label2234:
                i2 = i3;
                i1 = i8;
              }
              label2245:
              i7 = i5;
              i5 = i1;
              i1 = i7;
              break label1508;
              label2260:
              i9 = i2;
              i2 = i1;
              i7 = i4;
              i1 = i5;
              i5 = i9;
              i4 = i3;
              i3 = i7;
            }
          }
          label2294:
          i9 = i6;
          break label393;
        }
      }
      i9 = i1;
      i1 = i2;
      i2 = i9;
      break label368;
      i9 = i1;
      i12 = i4;
      i1 = i2;
      i2 = i9;
      i9 = i6;
      i4 = i7;
      i6 = i3;
      i7 = i12;
      i3 = i8;
    }
  }
  
  private void b(Canvas paramCanvas, int paramInt)
  {
    this.l.setBounds(paramInt, getPaddingTop() + this.o, this.h + paramInt, getHeight() - getPaddingBottom() - this.o);
    this.l.draw(paramCanvas);
  }
  
  private static void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
  }
  
  public xv a(AttributeSet paramAttributeSet)
  {
    return new xv(getContext(), paramAttributeSet);
  }
  
  public xv b(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new xv(paramLayoutParams);
  }
  
  public final void b(int paramInt)
  {
    if (this.d != paramInt)
    {
      if ((0x800007 & paramInt) != 0) {
        break label46;
      }
      paramInt = 0x800003 | paramInt;
    }
    label46:
    for (;;)
    {
      int i1 = paramInt;
      if ((paramInt & 0x70) == 0) {
        i1 = paramInt | 0x30;
      }
      this.d = i1;
      requestLayout();
      return;
    }
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof xv;
  }
  
  public xv d()
  {
    xv localxv;
    if (this.c == 0) {
      localxv = new xv(-2, -2);
    }
    for (;;)
    {
      return localxv;
      if (this.c == 1) {
        localxv = new xv(-1, -2);
      } else {
        localxv = null;
      }
    }
  }
  
  public int getBaseline()
  {
    int i1 = -1;
    if (this.a < 0) {
      i1 = super.getBaseline();
    }
    View localView;
    int i2;
    do
    {
      return i1;
      if (getChildCount() <= this.a) {
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
      }
      localView = getChildAt(this.a);
      i2 = localView.getBaseline();
      if (i2 != -1) {
        break;
      }
    } while (this.a == 0);
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    i1 = this.b;
    if (this.c == 1)
    {
      int i3 = this.d & 0x70;
      if (i3 != 48) {
        switch (i3)
        {
        }
      }
    }
    for (;;)
    {
      i1 = ((xv)localView.getLayoutParams()).topMargin + i1 + i2;
      break;
      i1 = getBottom() - getTop() - getPaddingBottom() - this.e;
      continue;
      i1 += (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.e) / 2;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.l == null) {}
    int i1;
    Object localObject2;
    int i3;
    boolean bool;
    label260:
    do
    {
      int i2;
      do
      {
        return;
        if (this.c != 1) {
          break;
        }
        i2 = getChildCount();
        for (i1 = 0; i1 < i2; i1++)
        {
          localObject2 = getChildAt(i1);
          if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8) && (a(i1)))
          {
            localObject1 = (xv)((View)localObject2).getLayoutParams();
            a(paramCanvas, ((View)localObject2).getTop() - ((xv)localObject1).topMargin - this.m);
          }
        }
      } while (!a(i2));
      localObject2 = getChildAt(i2 - 1);
      if (localObject2 == null) {}
      for (i1 = getHeight() - getPaddingBottom() - this.m;; i1 = ((xv)localObject1).bottomMargin + i1)
      {
        a(paramCanvas, i1);
        break;
        localObject1 = (xv)((View)localObject2).getLayoutParams();
        i1 = ((View)localObject2).getBottom();
      }
      i3 = getChildCount();
      bool = tm.a(this);
      i1 = 0;
      if (i1 < i3)
      {
        localObject1 = getChildAt(i1);
        if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (a(i1)))
        {
          localObject2 = (xv)((View)localObject1).getLayoutParams();
          if (!bool) {
            break label260;
          }
          i2 = ((View)localObject1).getRight();
        }
        for (i2 = ((xv)localObject2).rightMargin + i2;; i2 = ((View)localObject1).getLeft() - ((xv)localObject2).leftMargin - this.h)
        {
          b(paramCanvas, i2);
          i1++;
          break;
        }
      }
    } while (!a(i3));
    Object localObject1 = getChildAt(i3 - 1);
    if (localObject1 == null) {
      if (bool) {
        i1 = getPaddingLeft();
      }
    }
    for (;;)
    {
      b(paramCanvas, i1);
      break;
      i1 = getWidth() - getPaddingRight() - this.h;
      continue;
      localObject2 = (xv)((View)localObject1).getLayoutParams();
      if (bool)
      {
        i1 = ((View)localObject1).getLeft() - ((xv)localObject2).leftMargin - this.h;
      }
      else
      {
        i1 = ((View)localObject1).getRight();
        i1 = ((xv)localObject2).rightMargin + i1;
      }
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(xu.class.getName());
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(xu.class.getName());
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1;
    int i6;
    int i4;
    int i5;
    int i3;
    int i2;
    label88:
    Object localObject;
    if (this.c == 1)
    {
      i1 = getPaddingLeft();
      i6 = paramInt3 - paramInt1;
      i4 = getPaddingRight();
      i5 = getPaddingRight();
      i3 = getChildCount();
      paramInt1 = this.d;
      i2 = this.d;
      switch (paramInt1 & 0x70)
      {
      default: 
        paramInt1 = getPaddingTop();
        paramInt3 = 0;
        if (paramInt3 < i3)
        {
          localObject = getChildAt(paramInt3);
          if (localObject != null) {
            break;
          }
        }
        break;
      }
    }
    for (;;)
    {
      paramInt3++;
      break label88;
      paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - this.e;
      break;
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - this.e) / 2;
      break;
      if (((View)localObject).getVisibility() != 8)
      {
        int i8 = ((View)localObject).getMeasuredWidth();
        int i7 = ((View)localObject).getMeasuredHeight();
        xv localxv = (xv)((View)localObject).getLayoutParams();
        paramInt4 = localxv.h;
        paramInt2 = paramInt4;
        if (paramInt4 < 0) {
          paramInt2 = 0x800007 & i2;
        }
        switch (fe.a(paramInt2, gt.g(this)) & 0x7)
        {
        default: 
          paramInt2 = localxv.leftMargin + i1;
        }
        for (;;)
        {
          paramInt4 = paramInt1;
          if (a(paramInt3)) {
            paramInt4 = paramInt1 + this.m;
          }
          paramInt1 = paramInt4 + localxv.topMargin;
          b((View)localObject, paramInt2, paramInt1, i8, i7);
          paramInt1 += localxv.bottomMargin + i7;
          break;
          paramInt2 = (i6 - i1 - i5 - i8) / 2 + i1 + localxv.leftMargin - localxv.rightMargin;
          continue;
          paramInt2 = i6 - i4 - i8 - localxv.rightMargin;
        }
        paramBoolean = tm.a(this);
        i3 = getPaddingTop();
        i7 = paramInt4 - paramInt2;
        i8 = getPaddingBottom();
        i5 = getPaddingBottom();
        int i9 = getChildCount();
        paramInt2 = this.d;
        i6 = this.d;
        boolean bool = this.g;
        int[] arrayOfInt = this.j;
        localObject = this.k;
        switch (fe.a(paramInt2 & 0x800007, gt.g(this)))
        {
        default: 
          paramInt1 = getPaddingLeft();
          if (paramBoolean) {
            paramInt3 = i9 - 1;
          }
          break;
        }
        for (paramInt4 = -1;; paramInt4 = 1)
        {
          i1 = 0;
          paramInt2 = paramInt1;
          label483:
          int i12;
          View localView;
          if (i1 < i9)
          {
            i12 = paramInt3 + paramInt4 * i1;
            localView = getChildAt(i12);
            if (localView != null) {}
          }
          for (;;)
          {
            i1++;
            break label483;
            paramInt1 = getPaddingLeft() + paramInt3 - paramInt1 - this.e;
            break;
            paramInt1 = getPaddingLeft() + (paramInt3 - paramInt1 - this.e) / 2;
            break;
            if (localView.getVisibility() != 8)
            {
              int i11 = localView.getMeasuredWidth();
              int i10 = localView.getMeasuredHeight();
              paramInt1 = -1;
              localxv = (xv)localView.getLayoutParams();
              i2 = paramInt1;
              if (bool)
              {
                i2 = paramInt1;
                if (localxv.height != -1) {
                  i2 = localView.getBaseline();
                }
              }
              i4 = localxv.h;
              paramInt1 = i4;
              if (i4 < 0) {
                paramInt1 = i6 & 0x70;
              }
              switch (paramInt1 & 0x70)
              {
              default: 
                paramInt1 = i3;
              }
              label683:
              label848:
              for (;;)
              {
                if (a(i12)) {
                  paramInt2 = this.h + paramInt2;
                }
                for (;;)
                {
                  paramInt2 += localxv.leftMargin;
                  b(localView, paramInt2, paramInt1, i11, i10);
                  paramInt2 += localxv.rightMargin + i11;
                  break;
                  i4 = localxv.topMargin + i3;
                  paramInt1 = i4;
                  if (i2 == -1) {
                    break label848;
                  }
                  paramInt1 = arrayOfInt[1] - i2 + i4;
                  break label683;
                  paramInt1 = (i7 - i3 - i5 - i10) / 2 + i3 + localxv.topMargin - localxv.bottomMargin;
                  break label683;
                  i4 = i7 - i8 - i10 - localxv.bottomMargin;
                  paramInt1 = i4;
                  if (i2 == -1) {
                    break label848;
                  }
                  paramInt1 = localView.getMeasuredHeight();
                  paramInt1 = i4 - (localObject[2] - (paramInt1 - i2));
                  break label683;
                  return;
                }
              }
            }
          }
          paramInt3 = 0;
        }
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i3;
    int i1;
    int i2;
    int i8;
    int i4;
    float f1;
    int i14;
    int i15;
    int i16;
    int i7;
    int i6;
    boolean bool;
    int i5;
    int i9;
    View localView;
    int i10;
    int i12;
    int i11;
    Object localObject;
    label246:
    label460:
    int i13;
    if (this.c == 1)
    {
      this.e = 0;
      i3 = 0;
      i1 = 0;
      i2 = 0;
      i8 = 0;
      i4 = 1;
      f1 = 0.0F;
      i14 = getChildCount();
      i15 = View.MeasureSpec.getMode(paramInt1);
      i16 = View.MeasureSpec.getMode(paramInt2);
      i7 = 0;
      i6 = 0;
      int i17 = this.a;
      bool = this.i;
      i5 = Integer.MIN_VALUE;
      i9 = 0;
      for (;;)
      {
        if (i9 < i14)
        {
          localView = getChildAt(i9);
          if (localView == null)
          {
            this.e = this.e;
            i10 = i2;
            i2 = i8;
            i12 = i6;
            i11 = i5;
            i9++;
            i5 = i11;
            i6 = i12;
            i8 = i2;
            i2 = i10;
          }
          else
          {
            if (localView.getVisibility() == 8) {
              break label1567;
            }
            if (a(i9)) {
              this.e += this.m;
            }
            localObject = (xv)localView.getLayoutParams();
            f1 += ((xv)localObject).g;
            if ((i16 == 1073741824) && (((xv)localObject).height == 0) && (((xv)localObject).g > 0.0F))
            {
              i6 = this.e;
              this.e = Math.max(i6, ((xv)localObject).topMargin + i6 + ((xv)localObject).bottomMargin);
              i6 = 1;
              if ((i17 >= 0) && (i17 == i9 + 1)) {
                this.b = this.e;
              }
              if ((i9 < i17) && (((xv)localObject).g > 0.0F)) {
                throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
              }
            }
            else
            {
              i11 = Integer.MIN_VALUE;
              i10 = i11;
              if (((xv)localObject).height == 0)
              {
                i10 = i11;
                if (((xv)localObject).g > 0.0F)
                {
                  i10 = 0;
                  ((xv)localObject).height = -2;
                }
              }
              if (f1 == 0.0F) {}
              for (i11 = this.e;; i11 = 0)
              {
                a(localView, paramInt1, 0, paramInt2, i11);
                if (i10 != Integer.MIN_VALUE) {
                  ((xv)localObject).height = i10;
                }
                i10 = localView.getMeasuredHeight();
                i11 = this.e;
                this.e = Math.max(i11, i11 + i10 + ((xv)localObject).topMargin + ((xv)localObject).bottomMargin);
                if (!bool) {
                  break label1564;
                }
                i5 = Math.max(i10, i5);
                break;
              }
            }
            i10 = 0;
            if ((i15 == 1073741824) || (((xv)localObject).width != -1)) {
              break label1561;
            }
            i7 = 1;
            i10 = 1;
            i12 = ((xv)localObject).leftMargin + ((xv)localObject).rightMargin;
            i11 = localView.getMeasuredWidth() + i12;
            i3 = Math.max(i3, i11);
            i13 = tm.a(i1, gt.j(localView));
            if ((i4 != 0) && (((xv)localObject).width == -1))
            {
              i1 = 1;
              label521:
              if (((xv)localObject).g <= 0.0F) {
                break label617;
              }
              if (i10 == 0) {
                break label610;
              }
              i4 = i12;
              label540:
              i11 = Math.max(i8, i4);
              i4 = i2;
              i2 = i6;
              i10 = i5;
              i8 = i13;
              i6 = i4;
              i5 = i11;
              i4 = i1;
              i1 = i10;
            }
          }
        }
      }
    }
    for (;;)
    {
      i11 = i1;
      i12 = i2;
      i2 = i5;
      i10 = i6;
      i1 = i8;
      break;
      i1 = 0;
      break label521;
      label610:
      i4 = i11;
      break label540;
      label617:
      if (i10 != 0) {}
      for (;;)
      {
        i10 = Math.max(i2, i12);
        i4 = i1;
        i2 = i6;
        i1 = i5;
        i5 = i8;
        i6 = i10;
        i8 = i13;
        break;
        i12 = i11;
      }
      if ((this.e > 0) && (a(i14))) {
        this.e += this.m;
      }
      if ((bool) && ((i16 == Integer.MIN_VALUE) || (i16 == 0)))
      {
        this.e = 0;
        i9 = 0;
        if (i9 < i14)
        {
          localObject = getChildAt(i9);
          if (localObject == null) {
            this.e = this.e;
          }
          for (;;)
          {
            i9++;
            break;
            if (((View)localObject).getVisibility() != 8)
            {
              localObject = (xv)((View)localObject).getLayoutParams();
              i10 = this.e;
              i11 = ((xv)localObject).topMargin;
              this.e = Math.max(i10, ((xv)localObject).bottomMargin + (i10 + i5 + i11));
            }
          }
        }
      }
      this.e += getPaddingTop() + getPaddingBottom();
      i11 = gt.a(Math.max(this.e, getSuggestedMinimumHeight()), paramInt2, 0);
      i9 = (0xFFFFFF & i11) - this.e;
      if ((i6 != 0) || ((i9 != 0) && (f1 > 0.0F)))
      {
        if (this.f > 0.0F) {
          f1 = this.f;
        }
        this.e = 0;
        i8 = 0;
        i5 = i4;
        i4 = i3;
        i3 = i2;
        i2 = i5;
        i5 = i9;
        if (i8 < i14)
        {
          localView = getChildAt(i8);
          if (localView.getVisibility() == 8) {
            break label1534;
          }
          localObject = (xv)localView.getLayoutParams();
          float f2 = ((xv)localObject).g;
          if (f2 <= 0.0F) {
            break label1519;
          }
          i9 = (int)(i5 * f2 / f1);
          i12 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + ((xv)localObject).leftMargin + ((xv)localObject).rightMargin, ((xv)localObject).width);
          if ((((xv)localObject).height != 0) || (i16 != 1073741824))
          {
            i10 = i9 + localView.getMeasuredHeight();
            i6 = i10;
            if (i10 < 0) {
              i6 = 0;
            }
            label1051:
            localView.measure(i12, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            i6 = tm.a(i1, gt.j(localView) & 0xFF00);
            i1 = i5 - i9;
            i5 = i6;
            f1 -= f2;
            label1097:
            i9 = ((xv)localObject).leftMargin + ((xv)localObject).rightMargin;
            i10 = localView.getMeasuredWidth() + i9;
            i6 = Math.max(i4, i10);
            if ((i15 == 1073741824) || (((xv)localObject).width != -1)) {
              break label1289;
            }
            i4 = 1;
            label1148:
            if (i4 == 0) {
              break label1295;
            }
            i4 = i9;
            label1157:
            i3 = Math.max(i3, i4);
            if ((i2 == 0) || (((xv)localObject).width != -1)) {
              break label1302;
            }
            i2 = 1;
            label1183:
            i4 = this.e;
            i9 = localView.getMeasuredHeight();
            i10 = ((xv)localObject).topMargin;
            this.e = Math.max(i4, ((xv)localObject).bottomMargin + (i9 + i4 + i10));
            i4 = i2;
            i2 = i6;
          }
        }
      }
      for (;;)
      {
        i9 = i8 + 1;
        i8 = i5;
        i6 = i2;
        i5 = i1;
        i1 = i8;
        i2 = i4;
        i4 = i6;
        i8 = i9;
        break;
        if (i9 > 0)
        {
          i6 = i9;
          break label1051;
        }
        i6 = 0;
        break label1051;
        label1289:
        i4 = 0;
        break label1148;
        label1295:
        i4 = i10;
        break label1157;
        label1302:
        i2 = 0;
        break label1183;
        this.e += getPaddingTop() + getPaddingBottom();
        i5 = i3;
        i3 = i4;
        i4 = i2;
        for (i2 = i5;; i2 = i6)
        {
          if ((i4 == 0) && (i15 != 1073741824)) {}
          for (;;)
          {
            setMeasuredDimension(gt.a(Math.max(i2 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), paramInt1, i1), i11);
            if (i7 != 0) {
              a(i14, paramInt2);
            }
            for (;;)
            {
              return;
              i6 = Math.max(i2, i8);
              if ((!bool) || (i16 == 1073741824)) {
                break;
              }
              for (i2 = 0; i2 < i14; i2++)
              {
                localObject = getChildAt(i2);
                if ((localObject != null) && (((View)localObject).getVisibility() != 8) && (((xv)((View)localObject).getLayoutParams()).g > 0.0F)) {
                  ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(((View)localObject).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                }
              }
              b(paramInt1, paramInt2);
            }
            i2 = i3;
          }
        }
        label1519:
        i6 = i1;
        i1 = i5;
        i5 = i6;
        break label1097;
        label1534:
        i6 = i2;
        i2 = i4;
        i4 = i5;
        i5 = i1;
        i1 = i4;
        i4 = i6;
      }
      label1561:
      break label460;
      label1564:
      break label246;
      label1567:
      i10 = i5;
      i11 = i6;
      i5 = i8;
      i6 = i2;
      i8 = i1;
      i1 = i10;
      i2 = i11;
    }
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
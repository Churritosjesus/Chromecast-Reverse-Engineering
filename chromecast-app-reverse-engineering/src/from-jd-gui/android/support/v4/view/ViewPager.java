package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.DataSetObservable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import fi;
import gd;
import gn;
import gp;
import gt;
import hf;
import hq;
import hr;
import hs;
import ht;
import hu;
import hv;
import hw;
import hx;
import hy;
import hz;
import ib;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import lc;

public class ViewPager
  extends ViewGroup
{
  private static final ib T = new ib();
  private static final int[] e = { 16842931 };
  private static final Comparator g = new hq();
  private static final Interpolator h = new hr();
  private int A;
  private int B;
  private int C;
  private float D;
  private float E;
  private float F;
  private float G;
  private int H = -1;
  private VelocityTracker I;
  private int J;
  private int K;
  private int L;
  private int M;
  private lc N;
  private lc O;
  private boolean P = true;
  private boolean Q;
  private int R;
  private ArrayList S;
  private final Runnable U = new hs(this);
  private int V = 0;
  public gn a;
  public int b;
  public int c = 1;
  public hx d;
  private int f;
  private final ArrayList i = new ArrayList();
  private final hu j = new hu();
  private final Rect k = new Rect();
  private int l = -1;
  private Parcelable m = null;
  private ClassLoader n = null;
  private Scroller o;
  private hy p;
  private int q;
  private int r;
  private float s = -3.4028235E38F;
  private float t = Float.MAX_VALUE;
  private int u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  private boolean z;
  
  public ViewPager(Context paramContext)
  {
    super(paramContext);
    d();
  }
  
  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    d();
  }
  
  private Rect a(Rect paramRect, View paramView)
  {
    if (paramRect == null) {
      paramRect = new Rect();
    }
    for (;;)
    {
      if (paramView == null) {
        paramRect.set(0, 0, 0, 0);
      }
      for (;;)
      {
        return paramRect;
        paramRect.left = paramView.getLeft();
        paramRect.right = paramView.getRight();
        paramRect.top = paramView.getTop();
        paramRect.bottom = paramView.getBottom();
        for (paramView = paramView.getParent(); ((paramView instanceof ViewGroup)) && (paramView != this); paramView = paramView.getParent())
        {
          paramView = (ViewGroup)paramView;
          paramRect.left += paramView.getLeft();
          paramRect.right += paramView.getRight();
          paramRect.top += paramView.getTop();
          paramRect.bottom += paramView.getBottom();
        }
      }
    }
  }
  
  private hu a(int paramInt1, int paramInt2)
  {
    hu localhu = new hu();
    localhu.b = paramInt1;
    localhu.a = this.a.a(this, paramInt1);
    localhu.d = 1.0F;
    if ((paramInt2 < 0) || (paramInt2 >= this.i.size())) {
      this.i.add(localhu);
    }
    for (;;)
    {
      return localhu;
      this.i.add(paramInt2, localhu);
    }
  }
  
  private hu a(View paramView)
  {
    int i1 = 0;
    hu localhu;
    if (i1 < this.i.size())
    {
      localhu = (hu)this.i.get(i1);
      if (!this.a.a(paramView, localhu.a)) {}
    }
    for (paramView = localhu;; paramView = null)
    {
      return paramView;
      i1++;
      break;
    }
  }
  
  private void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i1;
    int i2;
    int i7;
    int i5;
    View localView;
    int i3;
    int i4;
    label132:
    int i9;
    if (this.R > 0)
    {
      int i8 = getScrollX();
      i1 = getPaddingLeft();
      i2 = getPaddingRight();
      i7 = getWidth();
      int i6 = getChildCount();
      i5 = 0;
      if (i5 < i6)
      {
        localView = getChildAt(i5);
        hv localhv = (hv)localView.getLayoutParams();
        if (!localhv.a) {
          break label311;
        }
        switch (localhv.b & 0x7)
        {
        case 2: 
        case 4: 
        default: 
          i3 = i1;
          i4 = i2;
          i2 = i1;
          i1 = i4;
          i9 = i3 + i8 - localView.getLeft();
          i3 = i1;
          i4 = i2;
          if (i9 != 0)
          {
            localView.offsetLeftAndRight(i9);
            i4 = i2;
            i3 = i1;
          }
          break;
        }
      }
    }
    for (;;)
    {
      i5++;
      i1 = i4;
      i2 = i3;
      break;
      i3 = localView.getWidth();
      i4 = i3 + i1;
      i3 = i1;
      i1 = i2;
      i2 = i4;
      break label132;
      i3 = Math.max((i7 - localView.getMeasuredWidth()) / 2, i1);
      i4 = i1;
      i1 = i2;
      i2 = i4;
      break label132;
      i3 = i7 - i2 - localView.getMeasuredWidth();
      i9 = localView.getMeasuredWidth();
      i4 = i1;
      i1 = i2 + i9;
      i2 = i4;
      break label132;
      if (this.d != null) {
        this.d.a(paramInt1, paramFloat, paramInt2);
      }
      this.Q = true;
      return;
      label311:
      i3 = i2;
      i4 = i1;
    }
  }
  
  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    hu localhu = d(paramInt1);
    int i1 = 0;
    if (localhu != null) {
      i1 = (int)(e() * Math.max(this.s, Math.min(localhu.e, this.t)));
    }
    if (paramBoolean1) {
      if (getChildCount() == 0)
      {
        c(false);
        if (paramBoolean2) {
          f(paramInt1);
        }
      }
    }
    for (;;)
    {
      return;
      int i2 = getScrollX();
      int i3 = getScrollY();
      int i4 = i1 - i2;
      i1 = 0 - i3;
      if ((i4 == 0) && (i1 == 0))
      {
        a(false);
        b();
        b(0);
        break;
      }
      c(true);
      b(2);
      int i5 = e();
      int i6 = i5 / 2;
      float f3 = Math.min(1.0F, 1.0F * Math.abs(i4) / i5);
      float f1 = i6;
      float f2 = i6;
      f3 = (float)Math.sin((float)((f3 - 0.5F) * 0.4712389167638204D));
      paramInt2 = Math.abs(paramInt2);
      if (paramInt2 > 0) {}
      for (paramInt2 = Math.round(1000.0F * Math.abs((f2 * f3 + f1) / paramInt2)) * 4;; paramInt2 = (int)((Math.abs(i4) / (f1 + 0.0F) + 1.0F) * 100.0F))
      {
        paramInt2 = Math.min(paramInt2, 600);
        this.o.startScroll(i2, i3, i4, i1, paramInt2);
        gt.d(this);
        break;
        f1 = i5;
      }
      if (paramBoolean2) {
        f(paramInt1);
      }
      a(false);
      scrollTo(i1, 0);
      e(i1);
    }
  }
  
  private void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  private void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    boolean bool = false;
    if ((this.a == null) || (this.a.a() <= 0)) {
      c(false);
    }
    for (;;)
    {
      return;
      if ((!paramBoolean2) && (this.b == paramInt1) && (this.i.size() != 0))
      {
        c(false);
      }
      else
      {
        int i1;
        if (paramInt1 < 0) {
          i1 = 0;
        }
        for (;;)
        {
          paramInt1 = this.c;
          if ((i1 <= this.b + paramInt1) && (i1 >= this.b - paramInt1)) {
            break;
          }
          for (paramInt1 = 0; paramInt1 < this.i.size(); paramInt1++) {
            ((hu)this.i.get(paramInt1)).c = true;
          }
          i1 = paramInt1;
          if (paramInt1 >= this.a.a()) {
            i1 = this.a.a() - 1;
          }
        }
        paramBoolean2 = bool;
        if (this.b != i1) {
          paramBoolean2 = true;
        }
        if (this.P)
        {
          this.b = i1;
          if (paramBoolean2) {
            f(i1);
          }
          requestLayout();
        }
        else
        {
          c(i1);
          a(i1, paramBoolean1, paramInt2, paramBoolean2);
        }
      }
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = gd.b(paramMotionEvent);
    if (gd.b(paramMotionEvent, i1) == this.H) {
      if (i1 != 0) {
        break label56;
      }
    }
    label56:
    for (i1 = 1;; i1 = 0)
    {
      this.D = gd.c(paramMotionEvent, i1);
      this.H = gd.b(paramMotionEvent, i1);
      if (this.I != null) {
        this.I.clear();
      }
      return;
    }
  }
  
  private void a(hu paramhu1, int paramInt, hu paramhu2)
  {
    int i3 = this.a.a();
    int i1 = e();
    if (i1 > 0) {}
    float f1;
    float f3;
    int i2;
    for (float f2 = 0.0F / i1;; f2 = 0.0F)
    {
      if (paramhu2 == null) {
        break label342;
      }
      i1 = paramhu2.b;
      if (i1 >= paramhu1.b) {
        break;
      }
      f1 = paramhu2.e;
      f3 = paramhu2.d;
      i2 = 0;
      f1 = f1 + f3 + f2;
      i1++;
      if ((i1 > paramhu1.b) || (i2 >= this.i.size())) {
        break label342;
      }
      for (paramhu2 = (hu)this.i.get(i2); (i1 > paramhu2.b) && (i2 < this.i.size() - 1); paramhu2 = (hu)this.i.get(i2)) {
        i2++;
      }
    }
    for (;;)
    {
      if (i1 < paramhu2.b)
      {
        i1++;
        f1 = f2 + 1.0F + f1;
      }
      else
      {
        paramhu2.e = f1;
        f1 += paramhu2.d + f2;
        i1++;
        break;
        if (i1 > paramhu1.b)
        {
          i2 = this.i.size();
          f1 = paramhu2.e;
          i2--;
          i1--;
          if ((i1 >= paramhu1.b) && (i2 >= 0)) {
            for (paramhu2 = (hu)this.i.get(i2); (i1 < paramhu2.b) && (i2 > 0); paramhu2 = (hu)this.i.get(i2)) {
              i2--;
            }
          }
        }
        for (;;)
        {
          if (i1 > paramhu2.b)
          {
            i1--;
            f1 -= f2 + 1.0F;
          }
          else
          {
            f1 -= paramhu2.d + f2;
            paramhu2.e = f1;
            i1--;
            break;
            label342:
            int i4 = this.i.size();
            f3 = paramhu1.e;
            i1 = paramhu1.b - 1;
            if (paramhu1.b == 0)
            {
              f1 = paramhu1.e;
              this.s = f1;
              if (paramhu1.b != i3 - 1) {
                break label472;
              }
              f1 = paramhu1.e + paramhu1.d - 1.0F;
              label408:
              this.t = f1;
              i2 = paramInt - 1;
              f1 = f3;
            }
            for (;;)
            {
              if (i2 < 0) {
                break label519;
              }
              paramhu2 = (hu)this.i.get(i2);
              for (;;)
              {
                if (i1 > paramhu2.b)
                {
                  i1--;
                  f1 -= f2 + 1.0F;
                  continue;
                  f1 = -3.4028235E38F;
                  break;
                  label472:
                  f1 = Float.MAX_VALUE;
                  break label408;
                }
              }
              f1 -= paramhu2.d + f2;
              paramhu2.e = f1;
              if (paramhu2.b == 0) {
                this.s = f1;
              }
              i1--;
              i2--;
            }
            label519:
            f1 = paramhu1.e + paramhu1.d + f2;
            i2 = paramhu1.b + 1;
            i1 = paramInt + 1;
            paramInt = i2;
            while (i1 < i4)
            {
              paramhu1 = (hu)this.i.get(i1);
              while (paramInt < paramhu1.b)
              {
                paramInt++;
                f1 += f2 + 1.0F;
              }
              if (paramhu1.b == i3 - 1) {
                this.t = (paramhu1.d + f1 - 1.0F);
              }
              paramhu1.e = f1;
              f1 += paramhu1.d + f2;
              paramInt++;
              i1++;
            }
            return;
          }
        }
      }
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.V == 2) {}
    int i2;
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0)
      {
        c(false);
        this.o.abortAnimation();
        int i4 = getScrollX();
        int i5 = getScrollY();
        i2 = this.o.getCurrX();
        i3 = this.o.getCurrY();
        if ((i4 != i2) || (i5 != i3))
        {
          scrollTo(i2, i3);
          if (i2 != i4) {
            e(i2);
          }
        }
      }
      this.x = false;
      int i3 = 0;
      i2 = i1;
      for (i1 = i3; i1 < this.i.size(); i1++)
      {
        hu localhu = (hu)this.i.get(i1);
        if (localhu.c)
        {
          localhu.c = false;
          i2 = 1;
        }
      }
    }
    if (i2 != 0)
    {
      if (!paramBoolean) {
        break label173;
      }
      gt.a(this, this.U);
    }
    for (;;)
    {
      return;
      label173:
      this.U.run();
    }
  }
  
  private boolean a(float paramFloat)
  {
    int i2 = 1;
    boolean bool2 = false;
    boolean bool1 = false;
    float f1 = this.D;
    this.D = paramFloat;
    float f2 = getScrollX() + (f1 - paramFloat);
    int i3 = e();
    paramFloat = i3 * this.s;
    float f3 = i3;
    f1 = this.t;
    hu localhu2 = (hu)this.i.get(0);
    hu localhu1 = (hu)this.i.get(this.i.size() - 1);
    if (localhu2.b != 0) {
      paramFloat = localhu2.e * i3;
    }
    for (int i1 = 0;; i1 = 1)
    {
      if (localhu1.b != this.a.a() - 1)
      {
        f1 = localhu1.e * i3;
        i2 = 0;
      }
      for (;;)
      {
        if (f2 < paramFloat)
        {
          f1 = paramFloat;
          if (i1 != 0)
          {
            bool1 = this.N.a(Math.abs(paramFloat - f2) / i3);
            f1 = paramFloat;
          }
        }
        for (;;)
        {
          this.D += f1 - (int)f1;
          scrollTo((int)f1, getScrollY());
          e((int)f1);
          return bool1;
          if (f2 > f1)
          {
            bool1 = bool2;
            if (i2 != 0) {
              bool1 = this.O.a(Math.abs(f2 - f1) / i3);
            }
          }
          else
          {
            f1 = f2;
          }
        }
        f1 = f3 * f1;
      }
    }
  }
  
  private boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    int i1;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i2 = paramView.getScrollX();
      int i3 = paramView.getScrollY();
      i1 = localViewGroup.getChildCount() - 1;
      if (i1 >= 0)
      {
        View localView = localViewGroup.getChildAt(i1);
        if ((paramInt2 + i2 >= localView.getLeft()) && (paramInt2 + i2 < localView.getRight()) && (paramInt3 + i3 >= localView.getTop()) && (paramInt3 + i3 < localView.getBottom()) && (a(localView, true, paramInt1, paramInt2 + i2 - localView.getLeft(), paramInt3 + i3 - localView.getTop()))) {
          paramBoolean = bool;
        }
      }
    }
    for (;;)
    {
      return paramBoolean;
      i1--;
      break;
      if (paramBoolean)
      {
        paramBoolean = bool;
        if (gt.a(paramView, -paramInt1)) {}
      }
      else
      {
        paramBoolean = false;
      }
    }
  }
  
  private hu b(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if (localViewParent != this) {
      if ((localViewParent != null) && ((localViewParent instanceof View))) {}
    }
    for (paramView = null;; paramView = a(paramView))
    {
      return paramView;
      paramView = (View)localViewParent;
      break;
    }
  }
  
  private void b(int paramInt)
  {
    if (this.V == paramInt) {}
    for (;;)
    {
      return;
      this.V = paramInt;
      if (this.d != null) {
        this.d.b(paramInt);
      }
    }
  }
  
  private void b(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(true);
    }
  }
  
  private void c(int paramInt)
  {
    int i1;
    Object localObject2;
    if (this.b != paramInt) {
      if (this.b < paramInt)
      {
        i1 = 66;
        localObject2 = d(this.b);
        this.b = paramInt;
      }
    }
    for (int i2 = i1;; i2 = 2)
    {
      if (this.a == null) {}
      while ((this.x) || (getWindowToken() == null))
      {
        return;
        i1 = 17;
        break;
      }
      paramInt = this.c;
      int i8 = Math.max(0, this.b - paramInt);
      int i6 = this.a.a();
      int i7 = Math.min(i6 - 1, paramInt + this.b);
      Object localObject1;
      if (i6 != this.f) {
        try
        {
          String str = getResources().getResourceName(getId());
          throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f + ", found: " + i6 + " Pager id: " + str + " Pager class: " + getClass() + " Problematic adapter: " + this.a.getClass());
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          for (;;)
          {
            localObject1 = Integer.toHexString(getId());
          }
        }
      }
      paramInt = 0;
      if (paramInt < this.i.size())
      {
        localObject1 = (hu)this.i.get(paramInt);
        if (((hu)localObject1).b >= this.b) {
          if (((hu)localObject1).b != this.b) {
            break label1235;
          }
        }
      }
      for (;;)
      {
        if ((localObject1 == null) && (i6 > 0)) {}
        for (Object localObject3 = a(this.b, paramInt);; localObject3 = localObject1)
        {
          label324:
          int i9;
          float f2;
          label337:
          float f3;
          int i3;
          label359:
          float f1;
          if (localObject3 != null)
          {
            int i5 = paramInt - 1;
            int i4;
            Object localObject4;
            if (i5 >= 0)
            {
              localObject1 = (hu)this.i.get(i5);
              i9 = e();
              if (i9 > 0) {
                break label517;
              }
              f2 = 0.0F;
              i1 = this.b;
              f3 = 0.0F;
              i4 = i1 - 1;
              i3 = paramInt;
              localObject4 = localObject1;
              if (i4 < 0) {
                break label667;
              }
              if ((f3 < f2) || (i4 >= i8)) {
                break label547;
              }
              if (localObject4 == null) {
                break label667;
              }
              localObject1 = localObject4;
              paramInt = i5;
              f1 = f3;
              i1 = i3;
              if (i4 == ((hu)localObject4).b)
              {
                localObject1 = localObject4;
                paramInt = i5;
                f1 = f3;
                i1 = i3;
                if (!((hu)localObject4).c)
                {
                  this.i.remove(i5);
                  this.a.a(this, i4, ((hu)localObject4).a);
                  paramInt = i5 - 1;
                  i1 = i3 - 1;
                  if (paramInt < 0) {
                    break label538;
                  }
                  localObject1 = (hu)this.i.get(paramInt);
                  f1 = f3;
                }
              }
            }
            for (;;)
            {
              i4--;
              localObject4 = localObject1;
              i5 = paramInt;
              f3 = f1;
              i3 = i1;
              break label359;
              paramInt++;
              break;
              localObject1 = null;
              break label324;
              label517:
              f2 = 2.0F - ((hu)localObject3).d + getPaddingLeft() / i9;
              break label337;
              label538:
              localObject1 = null;
              f1 = f3;
              continue;
              label547:
              if ((localObject4 != null) && (i4 == ((hu)localObject4).b))
              {
                f1 = f3 + ((hu)localObject4).d;
                paramInt = i5 - 1;
                if (paramInt >= 0)
                {
                  localObject1 = (hu)this.i.get(paramInt);
                  i1 = i3;
                }
                else
                {
                  localObject1 = null;
                  i1 = i3;
                }
              }
              else
              {
                f1 = f3 + a(i4, i5 + 1).d;
                i1 = i3 + 1;
                if (i5 >= 0)
                {
                  localObject1 = (hu)this.i.get(i5);
                  paramInt = i5;
                }
                else
                {
                  localObject1 = null;
                  paramInt = i5;
                }
              }
            }
            label667:
            f1 = ((hu)localObject3).d;
            paramInt = i3 + 1;
            if (f1 < 2.0F) {
              if (paramInt < this.i.size())
              {
                localObject1 = (hu)this.i.get(paramInt);
                label708:
                if (i9 > 0) {
                  break label827;
                }
                f2 = 0.0F;
                label715:
                i1 = this.b;
                i1++;
                label724:
                if (i1 >= i6) {
                  break label968;
                }
                if ((f1 < f2) || (i1 <= i7)) {
                  break label848;
                }
                if (localObject1 == null) {
                  break label968;
                }
                if ((i1 != ((hu)localObject1).b) || (((hu)localObject1).c)) {
                  break label1225;
                }
                this.i.remove(paramInt);
                this.a.a(this, i1, ((hu)localObject1).a);
                if (paramInt >= this.i.size()) {
                  break label842;
                }
                localObject1 = (hu)this.i.get(paramInt);
              }
            }
          }
          label827:
          label842:
          label848:
          label968:
          label1217:
          label1223:
          label1225:
          for (;;)
          {
            i1++;
            break label724;
            localObject1 = null;
            break label708;
            f2 = getPaddingRight() / i9 + 2.0F;
            break label715;
            localObject1 = null;
            continue;
            if ((localObject1 != null) && (i1 == ((hu)localObject1).b))
            {
              f3 = ((hu)localObject1).d;
              paramInt++;
              if (paramInt < this.i.size()) {}
              for (localObject1 = (hu)this.i.get(paramInt);; localObject1 = null)
              {
                f1 += f3;
                break;
              }
            }
            localObject1 = a(i1, paramInt);
            paramInt++;
            f3 = ((hu)localObject1).d;
            if (paramInt < this.i.size()) {}
            for (localObject1 = (hu)this.i.get(paramInt);; localObject1 = null)
            {
              f1 += f3;
              break;
            }
            a((hu)localObject3, i3, (hu)localObject2);
            localObject2 = this.a;
            paramInt = this.b;
            if (localObject3 != null) {}
            for (localObject1 = ((hu)localObject3).a;; localObject1 = null)
            {
              ((gn)localObject2).b(this, paramInt, localObject1);
              this.a.a(this);
              i1 = getChildCount();
              for (paramInt = 0; paramInt < i1; paramInt++)
              {
                localObject2 = getChildAt(paramInt);
                localObject1 = (hv)((View)localObject2).getLayoutParams();
                ((hv)localObject1).f = paramInt;
                if ((!((hv)localObject1).a) && (((hv)localObject1).c == 0.0F))
                {
                  localObject2 = a((View)localObject2);
                  if (localObject2 != null)
                  {
                    ((hv)localObject1).c = ((hu)localObject2).d;
                    ((hv)localObject1).e = ((hu)localObject2).b;
                  }
                }
              }
            }
            if (!hasFocus()) {
              break;
            }
            localObject1 = findFocus();
            if (localObject1 != null) {}
            for (localObject1 = b((View)localObject1);; localObject1 = null)
            {
              if ((localObject1 != null) && (((hu)localObject1).b == this.b)) {
                break label1223;
              }
              for (paramInt = 0;; paramInt++)
              {
                if (paramInt >= getChildCount()) {
                  break label1217;
                }
                localObject2 = getChildAt(paramInt);
                localObject1 = a((View)localObject2);
                if ((localObject1 != null) && (((hu)localObject1).b == this.b) && (((View)localObject2).requestFocus(i2))) {
                  break;
                }
              }
              break;
            }
            break;
          }
        }
        label1235:
        localObject1 = null;
      }
      localObject2 = null;
    }
  }
  
  private void c(boolean paramBoolean)
  {
    if (this.w != paramBoolean) {
      this.w = paramBoolean;
    }
  }
  
  private hu d(int paramInt)
  {
    int i1 = 0;
    hu localhu;
    if (i1 < this.i.size())
    {
      localhu = (hu)this.i.get(i1);
      if (localhu.b != paramInt) {}
    }
    for (;;)
    {
      return localhu;
      i1++;
      break;
      localhu = null;
    }
  }
  
  private void d()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.o = new Scroller(localContext, h);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f1 = localContext.getResources().getDisplayMetrics().density;
    this.C = hf.a(localViewConfiguration);
    this.J = ((int)(400.0F * f1));
    this.K = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.N = new lc(localContext);
    this.O = new lc(localContext);
    this.L = ((int)(25.0F * f1));
    this.M = ((int)(2.0F * f1));
    this.A = ((int)(16.0F * f1));
    gt.a(this, new hw(this));
    if (gt.e(this) == 0) {
      gt.c(this, 1);
    }
  }
  
  private int e()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private boolean e(int paramInt)
  {
    boolean bool = false;
    if (this.i.size() == 0)
    {
      this.Q = false;
      a(0, 0.0F, 0);
      if (!this.Q) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
    }
    else
    {
      hu localhu = f();
      int i2 = e();
      float f1 = 0.0F / i2;
      int i1 = localhu.b;
      f1 = (paramInt / i2 - localhu.e) / (localhu.d + f1);
      paramInt = (int)(i2 * f1);
      this.Q = false;
      a(i1, f1, paramInt);
      if (!this.Q) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
      bool = true;
    }
    return bool;
  }
  
  private hu f()
  {
    int i1 = e();
    float f1;
    float f2;
    label32:
    float f4;
    float f3;
    int i3;
    int i2;
    Object localObject1;
    label49:
    Object localObject2;
    hu localhu;
    if (i1 > 0)
    {
      f1 = getScrollX() / i1;
      if (i1 <= 0) {
        break label196;
      }
      f2 = 0.0F / i1;
      f4 = 0.0F;
      f3 = 0.0F;
      i3 = -1;
      i1 = 0;
      i2 = 1;
      localObject1 = null;
      localObject2 = localObject1;
      if (i1 < this.i.size())
      {
        localhu = (hu)this.i.get(i1);
        if ((i2 != 0) || (localhu.b == i3 + 1)) {
          break label228;
        }
        localhu = this.j;
        localhu.e = (f4 + f3 + f2);
        localhu.b = (i3 + 1);
        localhu.d = 1.0F;
        i1--;
      }
    }
    label196:
    label201:
    label228:
    for (;;)
    {
      f3 = localhu.e;
      f4 = localhu.d;
      if (i2 == 0)
      {
        localObject2 = localObject1;
        if (f1 < f3) {}
      }
      else
      {
        if ((f1 >= f4 + f3 + f2) && (i1 != this.i.size() - 1)) {
          break label201;
        }
        localObject2 = localhu;
      }
      return (hu)localObject2;
      f1 = 0.0F;
      break;
      f2 = 0.0F;
      break label32;
      i3 = localhu.b;
      f4 = localhu.d;
      i2 = 0;
      i1++;
      localObject1 = localhu;
      break label49;
    }
  }
  
  private void f(int paramInt)
  {
    if (this.d != null) {
      this.d.a(paramInt);
    }
  }
  
  private void g()
  {
    this.y = false;
    this.z = false;
    if (this.I != null)
    {
      this.I.recycle();
      this.I = null;
    }
  }
  
  private boolean g(int paramInt)
  {
    View localView = findFocus();
    Object localObject;
    int i2;
    boolean bool;
    if (localView == this)
    {
      localObject = null;
      localView = FocusFinder.getInstance().findNextFocus(this, (View)localObject, paramInt);
      if ((localView == null) || (localView == localObject)) {
        break label305;
      }
      if (paramInt != 17) {
        break label242;
      }
      i2 = a(this.k, localView).left;
      i1 = a(this.k, (View)localObject).left;
      if ((localObject != null) && (i2 >= i1))
      {
        bool = h();
        label82:
        if (bool) {
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        }
        return bool;
      }
    }
    else
    {
      if (localView == null) {
        break label351;
      }
      localObject = localView.getParent();
      if (!(localObject instanceof ViewGroup)) {
        break label356;
      }
      if (localObject != this) {}
    }
    label242:
    label305:
    label351:
    label356:
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 == 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localView.getClass().getSimpleName());
        localObject = localView.getParent();
        for (;;)
        {
          if ((localObject instanceof ViewGroup))
          {
            localStringBuilder.append(" => ").append(localObject.getClass().getSimpleName());
            localObject = ((ViewParent)localObject).getParent();
            continue;
            localObject = ((ViewParent)localObject).getParent();
            break;
          }
        }
        Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + localStringBuilder.toString());
        localObject = null;
        break;
        bool = localView.requestFocus();
        break label82;
        if (paramInt == 66)
        {
          i1 = a(this.k, localView).left;
          i2 = a(this.k, (View)localObject).left;
          if ((localObject != null) && (i1 <= i2))
          {
            bool = i();
            break label82;
          }
          bool = localView.requestFocus();
          break label82;
          if ((paramInt == 17) || (paramInt == 1))
          {
            bool = h();
            break label82;
          }
          if ((paramInt == 66) || (paramInt == 2))
          {
            bool = i();
            break label82;
          }
        }
        bool = false;
        break label82;
      }
      localObject = localView;
      break;
    }
  }
  
  private boolean h()
  {
    boolean bool = true;
    if (this.b > 0) {
      a(this.b - 1, true);
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  private boolean i()
  {
    boolean bool = true;
    if ((this.a != null) && (this.b < this.a.a() - 1)) {
      a(this.b + 1, true);
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public final void a()
  {
    int i1 = this.a.a();
    this.f = i1;
    if ((this.i.size() < (this.c << 1) + 1) && (this.i.size() < i1)) {}
    int i3;
    int i2;
    for (i1 = 1;; i1 = 0)
    {
      i3 = this.b;
      for (i2 = 0; i2 < this.i.size(); i2++) {
        this.i.get(i2);
      }
    }
    Collections.sort(this.i, g);
    if (i1 != 0)
    {
      i2 = getChildCount();
      for (i1 = 0; i1 < i2; i1++)
      {
        hv localhv = (hv)getChildAt(i1).getLayoutParams();
        if (!localhv.a) {
          localhv.c = 0.0F;
        }
      }
      a(i3, false, true);
      requestLayout();
    }
  }
  
  public final void a(int paramInt)
  {
    this.x = false;
    if (!this.P) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramInt, bool, false);
      return;
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    this.x = false;
    a(paramInt, true, false);
  }
  
  public final void a(gn paramgn)
  {
    if (this.a != null)
    {
      gn localgn = this.a;
      Object localObject = this.p;
      localgn.a.unregisterObserver(localObject);
      for (int i1 = 0; i1 < this.i.size(); i1++)
      {
        localObject = (hu)this.i.get(i1);
        this.a.a(this, ((hu)localObject).b, ((hu)localObject).a);
      }
      this.a.a(this);
      this.i.clear();
      int i2;
      for (i1 = 0; i1 < getChildCount(); i1 = i2 + 1)
      {
        i2 = i1;
        if (!((hv)getChildAt(i1).getLayoutParams()).a)
        {
          removeViewAt(i1);
          i2 = i1 - 1;
        }
      }
      this.b = 0;
      scrollTo(0, 0);
    }
    this.a = paramgn;
    this.f = 0;
    boolean bool;
    if (this.a != null)
    {
      if (this.p == null) {
        this.p = new hy(this);
      }
      this.a.a(this.p);
      this.x = false;
      bool = this.P;
      this.P = true;
      this.f = this.a.a();
      if (this.l < 0) {
        break label263;
      }
      a(this.l, false, true);
      this.l = -1;
      this.m = null;
      this.n = null;
    }
    for (;;)
    {
      return;
      label263:
      if (!bool) {
        b();
      } else {
        requestLayout();
      }
    }
  }
  
  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    int i2 = paramArrayList.size();
    int i3 = getDescendantFocusability();
    if (i3 != 393216) {
      for (int i1 = 0; i1 < getChildCount(); i1++)
      {
        View localView = getChildAt(i1);
        if (localView.getVisibility() == 0)
        {
          hu localhu = a(localView);
          if ((localhu != null) && (localhu.b == this.b)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
      }
    }
    if (((i3 == 262144) && (i2 != paramArrayList.size())) || (!isFocusable())) {}
    for (;;)
    {
      return;
      if ((((paramInt2 & 0x1) != 1) || (!isInTouchMode()) || (isFocusableInTouchMode())) && (paramArrayList != null)) {
        paramArrayList.add(this);
      }
    }
  }
  
  public void addTouchables(ArrayList paramArrayList)
  {
    for (int i1 = 0; i1 < getChildCount(); i1++)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 0)
      {
        hu localhu = a(localView);
        if ((localhu != null) && (localhu.b == this.b)) {
          localView.addTouchables(paramArrayList);
        }
      }
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!checkLayoutParams(paramLayoutParams)) {
      paramLayoutParams = generateLayoutParams(paramLayoutParams);
    }
    for (;;)
    {
      hv localhv = (hv)paramLayoutParams;
      localhv.a |= paramView instanceof ht;
      if (this.v)
      {
        if ((localhv != null) && (localhv.a)) {
          throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        localhv.d = true;
        addViewInLayout(paramView, paramInt, paramLayoutParams);
      }
      for (;;)
      {
        return;
        super.addView(paramView, paramInt, paramLayoutParams);
      }
    }
  }
  
  public final void b()
  {
    c(this.b);
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this.a == null) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      int i2 = e();
      int i1 = getScrollX();
      if (paramInt < 0)
      {
        bool1 = bool2;
        if (i1 > (int)(i2 * this.s)) {
          bool1 = true;
        }
      }
      else
      {
        bool1 = bool2;
        if (paramInt > 0)
        {
          bool1 = bool2;
          if (i1 < (int)(i2 * this.t)) {
            bool1 = true;
          }
        }
      }
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (((paramLayoutParams instanceof hv)) && (super.checkLayoutParams(paramLayoutParams))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void computeScroll()
  {
    if ((!this.o.isFinished()) && (this.o.computeScrollOffset()))
    {
      int i1 = getScrollX();
      int i2 = getScrollY();
      int i4 = this.o.getCurrX();
      int i3 = this.o.getCurrY();
      if ((i1 != i4) || (i2 != i3))
      {
        scrollTo(i4, i3);
        if (!e(i4))
        {
          this.o.abortAnimation();
          scrollTo(0, i3);
        }
      }
      gt.d(this);
    }
    for (;;)
    {
      return;
      a(true);
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    boolean bool1;
    if (!super.dispatchKeyEvent(paramKeyEvent))
    {
      if (paramKeyEvent.getAction() == 0) {}
      switch (paramKeyEvent.getKeyCode())
      {
      default: 
        bool1 = false;
      }
    }
    for (;;)
    {
      if (bool1) {
        bool2 = true;
      }
      return bool2;
      bool1 = g(17);
      continue;
      bool1 = g(66);
      continue;
      if (Build.VERSION.SDK_INT < 11) {
        break;
      }
      if (fi.a(paramKeyEvent))
      {
        bool1 = g(2);
      }
      else
      {
        if (!fi.a(paramKeyEvent, 1)) {
          break;
        }
        bool1 = g(1);
      }
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool1 = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      return bool1;
    }
    int i2 = getChildCount();
    for (int i1 = 0;; i1++)
    {
      bool1 = bool2;
      if (i1 >= i2) {
        break;
      }
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 0)
      {
        hu localhu = a(localView);
        if ((localhu != null) && (localhu.b == this.b) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent)))
        {
          bool1 = true;
          break;
        }
      }
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i3 = 0;
    int i1 = 0;
    int i4 = gt.a(this);
    boolean bool;
    if ((i4 == 0) || ((i4 == 1) && (this.a != null) && (this.a.a() > 1)))
    {
      int i2;
      if (!this.N.a())
      {
        i3 = paramCanvas.save();
        i4 = getHeight() - getPaddingTop() - getPaddingBottom();
        i1 = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i4 + getPaddingTop(), this.s * i1);
        this.N.a(i4, i1);
        i2 = this.N.a(paramCanvas) | false;
        paramCanvas.restoreToCount(i3);
      }
      i3 = i2;
      if (!this.O.a())
      {
        i4 = paramCanvas.save();
        int i6 = getWidth();
        int i5 = getHeight();
        int i7 = getPaddingTop();
        i3 = getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(this.t + 1.0F) * i6);
        this.O.a(i5 - i7 - i3, i6);
        bool = i2 | this.O.a(paramCanvas);
        paramCanvas.restoreToCount(i4);
      }
    }
    for (;;)
    {
      if (bool) {
        gt.d(this);
      }
      return;
      this.N.b();
      this.O.b();
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new hv();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new hv(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    return ((hv)((View)this.S.get(paramInt2)).getLayoutParams()).f;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.P = true;
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.U);
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    int i1 = paramMotionEvent.getAction() & 0xFF;
    boolean bool1;
    if ((i1 == 3) || (i1 == 1))
    {
      this.y = false;
      this.z = false;
      this.H = -1;
      bool1 = bool2;
      if (this.I != null)
      {
        this.I.recycle();
        this.I = null;
        bool1 = bool2;
      }
    }
    do
    {
      for (;;)
      {
        return bool1;
        if (i1 == 0) {
          break label99;
        }
        if (!this.y) {
          break;
        }
        bool1 = true;
      }
      bool1 = bool2;
    } while (this.z);
    label99:
    switch (i1)
    {
    }
    for (;;)
    {
      if (this.I == null) {
        this.I = VelocityTracker.obtain();
      }
      this.I.addMovement(paramMotionEvent);
      bool1 = this.y;
      break;
      i1 = this.H;
      if (i1 != -1)
      {
        i1 = gd.a(paramMotionEvent, i1);
        float f2 = gd.c(paramMotionEvent, i1);
        float f6 = f2 - this.D;
        float f4 = Math.abs(f6);
        float f3 = gd.d(paramMotionEvent, i1);
        float f1 = Math.abs(f3 - this.G);
        if (f6 != 0.0F)
        {
          float f5 = this.D;
          if (((f5 < this.B) && (f6 > 0.0F)) || ((f5 > getWidth() - this.B) && (f6 < 0.0F))) {}
          for (i1 = 1;; i1 = 0)
          {
            if ((i1 != 0) || (!a(this, false, (int)f6, (int)f2, (int)f3))) {
              break label336;
            }
            this.D = f2;
            this.E = f3;
            this.z = true;
            bool1 = bool2;
            break;
          }
        }
        label336:
        if ((f4 > this.C) && (0.5F * f4 > f1))
        {
          this.y = true;
          b(true);
          b(1);
          if (f6 > 0.0F)
          {
            f1 = this.F + this.C;
            label391:
            this.D = f1;
            this.E = f3;
            c(true);
          }
        }
        while ((this.y) && (a(f2)))
        {
          gt.d(this);
          break;
          f1 = this.F - this.C;
          break label391;
          if (f1 > this.C) {
            this.z = true;
          }
        }
        f1 = paramMotionEvent.getX();
        this.F = f1;
        this.D = f1;
        f1 = paramMotionEvent.getY();
        this.G = f1;
        this.E = f1;
        this.H = gd.b(paramMotionEvent, 0);
        this.z = false;
        this.o.computeScrollOffset();
        if ((this.V == 2) && (Math.abs(this.o.getFinalX() - this.o.getCurrX()) > this.M))
        {
          this.o.abortAnimation();
          this.x = false;
          b();
          this.y = true;
          b(true);
          b(1);
        }
        else
        {
          a(false);
          this.y = false;
          continue;
          a(paramMotionEvent);
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i6 = getChildCount();
    int i8 = paramInt3 - paramInt1;
    int i7 = paramInt4 - paramInt2;
    paramInt2 = getPaddingLeft();
    paramInt1 = getPaddingTop();
    int i1 = getPaddingRight();
    paramInt3 = getPaddingBottom();
    int i9 = getScrollX();
    int i2 = 0;
    int i4 = 0;
    View localView;
    hv localhv;
    int i10;
    int i3;
    label154:
    int i5;
    if (i4 < i6)
    {
      localView = getChildAt(i4);
      if (localView.getVisibility() == 8) {
        break label662;
      }
      localhv = (hv)localView.getLayoutParams();
      if (!localhv.a) {
        break label662;
      }
      paramInt4 = localhv.b;
      i10 = localhv.b;
      switch (paramInt4 & 0x7)
      {
      case 2: 
      case 4: 
      default: 
        paramInt4 = paramInt2;
        i3 = paramInt2;
        switch (i10 & 0x70)
        {
        default: 
          i5 = paramInt1;
          paramInt2 = paramInt1;
          paramInt1 = paramInt3;
          paramInt3 = i5;
          label204:
          paramInt4 += i9;
          localView.layout(paramInt4, paramInt3, localView.getMeasuredWidth() + paramInt4, localView.getMeasuredHeight() + paramInt3);
          i2++;
          paramInt4 = i1;
          paramInt3 = i3;
          i1 = paramInt1;
          paramInt1 = i2;
        }
        break;
      }
    }
    for (;;)
    {
      i4++;
      i3 = paramInt3;
      i2 = paramInt1;
      paramInt1 = paramInt2;
      paramInt3 = i1;
      i1 = paramInt4;
      paramInt2 = i3;
      break;
      i3 = localView.getMeasuredWidth();
      paramInt4 = paramInt2;
      i3 += paramInt2;
      break label154;
      paramInt4 = Math.max((i8 - localView.getMeasuredWidth()) / 2, paramInt2);
      i3 = paramInt2;
      break label154;
      i3 = localView.getMeasuredWidth();
      paramInt4 = i1 + localView.getMeasuredWidth();
      i5 = i8 - i1 - i3;
      i1 = paramInt4;
      i3 = paramInt2;
      paramInt4 = i5;
      break label154;
      i5 = localView.getMeasuredHeight();
      paramInt2 = paramInt3;
      i5 += paramInt1;
      paramInt3 = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = i5;
      break label204;
      i5 = Math.max((i7 - localView.getMeasuredHeight()) / 2, paramInt1);
      paramInt2 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = i5;
      break label204;
      i5 = i7 - paramInt3 - localView.getMeasuredHeight();
      i10 = localView.getMeasuredHeight();
      paramInt2 = paramInt1;
      paramInt1 = paramInt3 + i10;
      paramInt3 = i5;
      break label204;
      i1 = i8 - paramInt2 - i1;
      for (paramInt4 = 0; paramInt4 < i6; paramInt4++)
      {
        localView = getChildAt(paramInt4);
        if (localView.getVisibility() != 8)
        {
          localhv = (hv)localView.getLayoutParams();
          if (!localhv.a)
          {
            hu localhu = a(localView);
            if (localhu != null)
            {
              float f1 = i1;
              i3 = (int)(localhu.e * f1) + paramInt2;
              if (localhv.d)
              {
                localhv.d = false;
                f1 = i1;
                localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localhv.c * f1), 1073741824), View.MeasureSpec.makeMeasureSpec(i7 - paramInt1 - paramInt3, 1073741824));
              }
              localView.layout(i3, paramInt1, localView.getMeasuredWidth() + i3, localView.getMeasuredHeight() + paramInt1);
            }
          }
        }
      }
      this.q = paramInt1;
      this.r = (i7 - paramInt3);
      this.R = i2;
      if (this.P) {
        a(this.b, false, 0, false);
      }
      this.P = false;
      return;
      label662:
      paramInt4 = i2;
      i2 = paramInt1;
      i3 = paramInt2;
      paramInt1 = paramInt4;
      paramInt4 = i1;
      i1 = paramInt3;
      paramInt2 = i2;
      paramInt3 = i3;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    paramInt1 = getMeasuredWidth();
    this.B = Math.min(paramInt1 / 10, this.A);
    paramInt1 = paramInt1 - getPaddingLeft() - getPaddingRight();
    paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i9 = getChildCount();
    int i3 = 0;
    Object localObject1;
    int i2;
    int i1;
    Object localObject2;
    int i4;
    int i6;
    label183:
    int i5;
    if (i3 < i9)
    {
      localObject1 = getChildAt(i3);
      i2 = paramInt1;
      i1 = paramInt2;
      if (((View)localObject1).getVisibility() != 8)
      {
        localObject2 = (hv)((View)localObject1).getLayoutParams();
        i2 = paramInt1;
        i1 = paramInt2;
        if (localObject2 != null)
        {
          i2 = paramInt1;
          i1 = paramInt2;
          if (((hv)localObject2).a)
          {
            i1 = ((hv)localObject2).b & 0x7;
            i4 = ((hv)localObject2).b & 0x70;
            i6 = Integer.MIN_VALUE;
            i2 = Integer.MIN_VALUE;
            if ((i4 != 48) && (i4 != 80)) {
              break label330;
            }
            i4 = 1;
            if ((i1 != 3) && (i1 != 5)) {
              break label336;
            }
            i5 = 1;
            label198:
            if (i4 == 0) {
              break label342;
            }
            i1 = 1073741824;
            label208:
            if (((hv)localObject2).width == -2) {
              break label521;
            }
            i6 = 1073741824;
            if (((hv)localObject2).width == -1) {
              break label515;
            }
            i1 = ((hv)localObject2).width;
          }
        }
      }
    }
    for (;;)
    {
      int i8;
      if (((hv)localObject2).height != -2)
      {
        i7 = 1073741824;
        i2 = i7;
        if (((hv)localObject2).height != -1)
        {
          i8 = ((hv)localObject2).height;
          i2 = i7;
        }
      }
      for (int i7 = i8;; i7 = paramInt2)
      {
        ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(i1, i6), View.MeasureSpec.makeMeasureSpec(i7, i2));
        if (i4 != 0)
        {
          i1 = paramInt2 - ((View)localObject1).getMeasuredHeight();
          i2 = paramInt1;
        }
        for (;;)
        {
          i3++;
          paramInt1 = i2;
          paramInt2 = i1;
          break;
          label330:
          i4 = 0;
          break label183;
          label336:
          i5 = 0;
          break label198;
          label342:
          i1 = i6;
          if (i5 == 0) {
            break label208;
          }
          i2 = 1073741824;
          i1 = i6;
          break label208;
          i2 = paramInt1;
          i1 = paramInt2;
          if (i5 != 0)
          {
            i2 = paramInt1 - ((View)localObject1).getMeasuredWidth();
            i1 = paramInt2;
          }
        }
        View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
        this.u = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
        this.v = true;
        b();
        this.v = false;
        i1 = getChildCount();
        for (paramInt2 = 0; paramInt2 < i1; paramInt2++)
        {
          localObject2 = getChildAt(paramInt2);
          if (((View)localObject2).getVisibility() != 8)
          {
            localObject1 = (hv)((View)localObject2).getLayoutParams();
            if ((localObject1 == null) || (!((hv)localObject1).a))
            {
              float f1 = paramInt1;
              ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec((int)(((hv)localObject1).c * f1), 1073741824), this.u);
            }
          }
        }
        return;
      }
      label515:
      i1 = paramInt1;
      continue;
      label521:
      i6 = i1;
      i1 = paramInt1;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    boolean bool = true;
    int i3 = -1;
    int i2 = getChildCount();
    int i1;
    if ((paramInt & 0x2) != 0)
    {
      i3 = 1;
      i1 = 0;
      if (i1 == i2) {
        break label104;
      }
      View localView = getChildAt(i1);
      if (localView.getVisibility() != 0) {
        break label94;
      }
      hu localhu = a(localView);
      if ((localhu == null) || (localhu.b != this.b) || (!localView.requestFocus(paramInt, paramRect))) {
        break label94;
      }
    }
    for (;;)
    {
      return bool;
      i1 = i2 - 1;
      i2 = -1;
      break;
      label94:
      i1 += i3;
      break;
      label104:
      bool = false;
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof hz)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (hz)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getSuperState());
      if (this.a != null)
      {
        Object localObject = paramParcelable.b;
        localObject = paramParcelable.c;
        a(paramParcelable.a, false, true);
      }
      else
      {
        this.l = paramParcelable.a;
        this.m = paramParcelable.b;
        this.n = paramParcelable.c;
      }
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    hz localhz = new hz(super.onSaveInstanceState());
    localhz.a = this.b;
    if (this.a != null) {
      localhz.b = null;
    }
    return localhz;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      if ((paramInt3 <= 0) || (this.i.isEmpty())) {
        break label153;
      }
      paramInt2 = getPaddingLeft();
      int i1 = getPaddingRight();
      int i2 = getPaddingLeft();
      paramInt4 = getPaddingRight();
      f1 = getScrollX() / (paramInt3 - i2 - paramInt4 + 0);
      paramInt3 = (int)((paramInt1 - paramInt2 - i1 + 0) * f1);
      scrollTo(paramInt3, getScrollY());
      if (!this.o.isFinished())
      {
        paramInt4 = this.o.getDuration();
        paramInt2 = this.o.timePassed();
        localhu = d(this.b);
        this.o.startScroll(paramInt3, 0, (int)(localhu.e * paramInt1), 0, paramInt4 - paramInt2);
      }
    }
    return;
    label153:
    hu localhu = d(this.b);
    if (localhu != null) {}
    for (float f1 = Math.min(localhu.e, this.t);; f1 = 0.0F)
    {
      paramInt1 = (int)(f1 * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 == getScrollX()) {
        break;
      }
      a(false);
      scrollTo(paramInt1, getScrollY());
      break;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i6 = 0;
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0)) {}
    for (boolean bool3 = false;; bool3 = false)
    {
      return bool3;
      if ((this.a != null) && (this.a.a() != 0)) {
        break;
      }
    }
    if (this.I == null) {
      this.I = VelocityTracker.obtain();
    }
    this.I.addMovement(paramMotionEvent);
    int i1 = i6;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
      i1 = i6;
    }
    for (;;)
    {
      if (i1 != 0) {
        gt.d(this);
      }
      bool3 = true;
      break;
      this.o.abortAnimation();
      this.x = false;
      b();
      float f1 = paramMotionEvent.getX();
      this.F = f1;
      this.D = f1;
      f1 = paramMotionEvent.getY();
      this.G = f1;
      this.E = f1;
      this.H = gd.b(paramMotionEvent, 0);
      i1 = i6;
      continue;
      float f2;
      if (!this.y)
      {
        i1 = gd.a(paramMotionEvent, this.H);
        f1 = gd.c(paramMotionEvent, i1);
        float f4 = Math.abs(f1 - this.D);
        f2 = gd.d(paramMotionEvent, i1);
        float f3 = Math.abs(f2 - this.E);
        if ((f4 > this.C) && (f4 > f3))
        {
          this.y = true;
          b(true);
          if (f1 - this.F <= 0.0F) {
            break label382;
          }
        }
      }
      Object localObject;
      label382:
      for (f1 = this.F + this.C;; f1 = this.F - this.C)
      {
        this.D = f1;
        this.E = f2;
        b(1);
        c(true);
        localObject = getParent();
        if (localObject != null) {
          ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
        }
        i1 = i6;
        if (!this.y) {
          break;
        }
        bool1 = a(gd.c(paramMotionEvent, gd.a(paramMotionEvent, this.H))) | false;
        break;
      }
      boolean bool1 = i6;
      if (this.y)
      {
        localObject = this.I;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.K);
        int i7 = (int)gp.a((VelocityTracker)localObject, this.H);
        this.x = true;
        i6 = e();
        int i8 = getScrollX();
        localObject = f();
        int i2 = ((hu)localObject).b;
        f2 = (i8 / i6 - ((hu)localObject).e) / ((hu)localObject).d;
        int i3;
        if ((Math.abs((int)(gd.c(paramMotionEvent, gd.a(paramMotionEvent, this.H)) - this.F)) > this.L) && (Math.abs(i7) > this.J))
        {
          if (i7 > 0) {}
          for (;;)
          {
            i6 = i2;
            if (this.i.size() > 0)
            {
              localObject = (hu)this.i.get(0);
              paramMotionEvent = (hu)this.i.get(this.i.size() - 1);
              i6 = Math.max(((hu)localObject).b, Math.min(i2, paramMotionEvent.b));
            }
            a(i6, true, true, i7);
            this.H = -1;
            g();
            i3 = this.N.c() | this.O.c();
            break;
            i3++;
          }
        }
        if (i3 >= this.b) {}
        for (f1 = 0.4F;; f1 = 0.6F)
        {
          i4 = (int)(i3 + f2 + f1);
          break;
        }
        int i4 = i6;
        if (this.y)
        {
          a(this.b, true, 0, false);
          this.H = -1;
          g();
          boolean bool2 = this.N.c() | this.O.c();
          continue;
          int i5 = gd.b(paramMotionEvent);
          this.D = gd.c(paramMotionEvent, i5);
          this.H = gd.b(paramMotionEvent, i5);
          i5 = i6;
          continue;
          a(paramMotionEvent);
          this.D = gd.c(paramMotionEvent, gd.a(paramMotionEvent, this.H));
          i5 = i6;
        }
      }
    }
  }
  
  public void removeView(View paramView)
  {
    if (this.v) {
      removeViewInLayout(paramView);
    }
    for (;;)
    {
      return;
      super.removeView(paramView);
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == null)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v4\view\ViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
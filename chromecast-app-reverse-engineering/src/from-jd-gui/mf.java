import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

public final class mf
{
  private static final Interpolator v = new mg();
  int a;
  public int b;
  int c = -1;
  public float[] d;
  public float[] e;
  public float[] f;
  public float[] g;
  public int h;
  VelocityTracker i;
  public float j;
  public int k;
  public int l;
  View m;
  boolean n;
  private int[] o;
  private int[] p;
  private int[] q;
  private float r;
  private lr s;
  private final mi t;
  private final ViewGroup u;
  private final Runnable w = new mh(this);
  
  private mf(Context paramContext, ViewGroup paramViewGroup, mi parammi)
  {
    if (paramViewGroup == null) {
      throw new IllegalArgumentException("Parent view may not be null");
    }
    if (parammi == null) {
      throw new IllegalArgumentException("Callback may not be null");
    }
    this.u = paramViewGroup;
    this.t = parammi;
    paramViewGroup = ViewConfiguration.get(paramContext);
    this.k = ((int)(paramContext.getResources().getDisplayMetrics().density * 20.0F + 0.5F));
    this.b = paramViewGroup.getScaledTouchSlop();
    this.r = paramViewGroup.getScaledMaximumFlingVelocity();
    this.j = paramViewGroup.getScaledMinimumFlingVelocity();
    this.s = lr.a(paramContext, v);
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = Math.abs(paramFloat1);
    if (f1 < paramFloat2) {
      paramFloat2 = 0.0F;
    }
    for (;;)
    {
      return paramFloat2;
      if (f1 > paramFloat3)
      {
        paramFloat2 = paramFloat3;
        if (paramFloat1 <= 0.0F) {
          paramFloat2 = -paramFloat3;
        }
      }
      else
      {
        paramFloat2 = paramFloat1;
      }
    }
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0)
    {
      paramInt1 = 0;
      return paramInt1;
    }
    int i2 = this.u.getWidth();
    int i1 = i2 / 2;
    float f3 = Math.min(1.0F, Math.abs(paramInt1) / i2);
    float f2 = i1;
    float f1 = i1;
    f3 = (float)Math.sin((float)((f3 - 0.5F) * 0.4712389167638204D));
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0) {}
    for (paramInt1 = Math.round(Math.abs((f3 * f1 + f2) / paramInt2) * 1000.0F) * 4;; paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F))
    {
      paramInt1 = Math.min(paramInt1, 600);
      break;
    }
  }
  
  public static mf a(ViewGroup paramViewGroup, float paramFloat, mi parammi)
  {
    paramViewGroup = new mf(paramViewGroup.getContext(), paramViewGroup, parammi);
    paramViewGroup.b = ((int)paramViewGroup.b);
    return paramViewGroup;
  }
  
  private void a(float paramFloat1, float paramFloat2)
  {
    this.n = true;
    this.t.a(this.m, paramFloat1);
    this.n = false;
    if (this.a == 1) {
      a(0);
    }
  }
  
  private void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i2 = 0;
    if ((this.d == null) || (this.d.length <= paramInt))
    {
      localObject = new float[paramInt + 1];
      float[] arrayOfFloat2 = new float[paramInt + 1];
      float[] arrayOfFloat1 = new float[paramInt + 1];
      float[] arrayOfFloat3 = new float[paramInt + 1];
      int[] arrayOfInt2 = new int[paramInt + 1];
      int[] arrayOfInt3 = new int[paramInt + 1];
      int[] arrayOfInt1 = new int[paramInt + 1];
      if (this.d != null)
      {
        System.arraycopy(this.d, 0, localObject, 0, this.d.length);
        System.arraycopy(this.e, 0, arrayOfFloat2, 0, this.e.length);
        System.arraycopy(this.f, 0, arrayOfFloat1, 0, this.f.length);
        System.arraycopy(this.g, 0, arrayOfFloat3, 0, this.g.length);
        System.arraycopy(this.o, 0, arrayOfInt2, 0, this.o.length);
        System.arraycopy(this.p, 0, arrayOfInt3, 0, this.p.length);
        System.arraycopy(this.q, 0, arrayOfInt1, 0, this.q.length);
      }
      this.d = ((float[])localObject);
      this.e = arrayOfFloat2;
      this.f = arrayOfFloat1;
      this.g = arrayOfFloat3;
      this.o = arrayOfInt2;
      this.p = arrayOfInt3;
      this.q = arrayOfInt1;
    }
    Object localObject = this.d;
    this.f[paramInt] = paramFloat1;
    localObject[paramInt] = paramFloat1;
    localObject = this.e;
    this.g[paramInt] = paramFloat2;
    localObject[paramInt] = paramFloat2;
    localObject = this.o;
    int i4 = (int)paramFloat1;
    int i3 = (int)paramFloat2;
    if (i4 < this.u.getLeft() + this.k) {
      i2 = 1;
    }
    int i1 = i2;
    if (i3 < this.u.getTop() + this.k) {
      i1 = i2 | 0x4;
    }
    i2 = i1;
    if (i4 > this.u.getRight() - this.k) {
      i2 = i1 | 0x2;
    }
    i1 = i2;
    if (i3 > this.u.getBottom() - this.k) {
      i1 = i2 | 0x8;
    }
    localObject[paramInt] = i1;
    this.h |= 1 << paramInt;
  }
  
  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    boolean bool1 = bool2;
    if ((this.o[paramInt1] & paramInt2) == paramInt2)
    {
      bool1 = bool2;
      if ((this.l & paramInt2) != 0)
      {
        bool1 = bool2;
        if ((this.q[paramInt1] & paramInt2) != paramInt2)
        {
          bool1 = bool2;
          if ((this.p[paramInt1] & paramInt2) != paramInt2)
          {
            if ((paramFloat1 > this.b) || (paramFloat2 > this.b)) {
              break label108;
            }
            bool1 = bool2;
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      label108:
      bool1 = bool2;
      if ((this.p[paramInt1] & paramInt2) == 0)
      {
        bool1 = bool2;
        if (paramFloat1 > this.b) {
          bool1 = true;
        }
      }
    }
  }
  
  private boolean a(View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramView == null)
    {
      bool1 = bool2;
      return bool1;
    }
    if (this.t.c(paramView) > 0) {}
    for (int i1 = 1;; i1 = 0)
    {
      bool1 = bool2;
      if (i1 == 0) {
        break;
      }
      bool1 = bool2;
      if (Math.abs(paramFloat1) <= this.b) {
        break;
      }
      bool1 = true;
      break;
    }
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = Math.abs(paramInt1);
    if (i1 < paramInt2) {
      paramInt2 = 0;
    }
    for (;;)
    {
      return paramInt2;
      if (i1 > paramInt3)
      {
        paramInt2 = paramInt3;
        if (paramInt1 <= 0) {
          paramInt2 = -paramInt3;
        }
      }
      else
      {
        paramInt2 = paramInt1;
      }
    }
  }
  
  private void b()
  {
    this.i.computeCurrentVelocity(1000, this.r);
    a(a(gp.a(this.i, this.c), this.j, this.r), a(gp.b(this.i, this.c), this.j, this.r));
  }
  
  private void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i1 = 1;
    if (a(paramFloat1, paramFloat2, paramInt, 1)) {}
    for (;;)
    {
      int i2 = i1;
      if (a(paramFloat2, paramFloat1, paramInt, 4)) {
        i2 = i1 | 0x4;
      }
      i1 = i2;
      if (a(paramFloat1, paramFloat2, paramInt, 2)) {
        i1 = i2 | 0x2;
      }
      i2 = i1;
      if (a(paramFloat2, paramFloat1, paramInt, 8)) {
        i2 = i1 | 0x8;
      }
      if (i2 != 0)
      {
        int[] arrayOfInt = this.p;
        arrayOfInt[paramInt] |= i2;
        this.t.a(i2, paramInt);
      }
      return;
      i1 = 0;
    }
  }
  
  private void b(int paramInt)
  {
    if (this.d == null) {}
    for (;;)
    {
      return;
      this.d[paramInt] = 0.0F;
      this.e[paramInt] = 0.0F;
      this.f[paramInt] = 0.0F;
      this.g[paramInt] = 0.0F;
      this.o[paramInt] = 0;
      this.p[paramInt] = 0;
      this.q[paramInt] = 0;
      this.h &= (1 << paramInt ^ 0xFFFFFFFF);
    }
  }
  
  private boolean b(View paramView, int paramInt)
  {
    boolean bool = true;
    if ((paramView == this.m) && (this.c == paramInt)) {}
    for (;;)
    {
      return bool;
      if ((paramView != null) && (this.t.a(paramView)))
      {
        this.c = paramInt;
        a(paramView, paramInt);
      }
      else
      {
        bool = false;
      }
    }
  }
  
  private void c(MotionEvent paramMotionEvent)
  {
    int i2 = gd.c(paramMotionEvent);
    for (int i1 = 0; i1 < i2; i1++)
    {
      int i3 = gd.b(paramMotionEvent, i1);
      float f1 = gd.c(paramMotionEvent, i1);
      float f2 = gd.d(paramMotionEvent, i1);
      this.f[i3] = f1;
      this.g[i3] = f2;
    }
  }
  
  public final View a(int paramInt1, int paramInt2)
  {
    int i1 = this.u.getChildCount() - 1;
    View localView;
    if (i1 >= 0)
    {
      localView = this.u.getChildAt(i1);
      if ((paramInt1 < localView.getLeft()) || (paramInt1 >= localView.getRight()) || (paramInt2 < localView.getTop()) || (paramInt2 >= localView.getBottom())) {}
    }
    for (;;)
    {
      return localView;
      i1--;
      break;
      localView = null;
    }
  }
  
  public final void a()
  {
    this.c = -1;
    if (this.d != null)
    {
      Arrays.fill(this.d, 0.0F);
      Arrays.fill(this.e, 0.0F);
      Arrays.fill(this.f, 0.0F);
      Arrays.fill(this.g, 0.0F);
      Arrays.fill(this.o, 0);
      Arrays.fill(this.p, 0);
      Arrays.fill(this.q, 0);
      this.h = 0;
    }
    if (this.i != null)
    {
      this.i.recycle();
      this.i = null;
    }
  }
  
  final void a(int paramInt)
  {
    this.u.removeCallbacks(this.w);
    if (this.a != paramInt)
    {
      this.a = paramInt;
      this.t.a(paramInt);
      if (this.a == 0) {
        this.m = null;
      }
    }
  }
  
  public final void a(View paramView, int paramInt)
  {
    if (paramView.getParent() != this.u) {
      throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
    }
    this.m = paramView;
    this.c = paramInt;
    this.t.b(paramView);
    a(1);
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = this.m.getLeft();
    int i2 = this.m.getTop();
    paramInt1 -= i1;
    paramInt2 -= i2;
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.s.f();
      a(0);
      bool = false;
      return bool;
    }
    View localView = this.m;
    int i3 = b(paramInt3, (int)this.j, (int)this.r);
    paramInt3 = b(paramInt4, (int)this.j, (int)this.r);
    int i7 = Math.abs(paramInt1);
    int i6 = Math.abs(paramInt2);
    int i5 = Math.abs(i3);
    int i4 = Math.abs(paramInt3);
    paramInt4 = i5 + i4;
    int i8 = i7 + i6;
    float f1;
    if (i3 != 0)
    {
      f1 = i5 / paramInt4;
      label145:
      if (paramInt3 == 0) {
        break label239;
      }
    }
    label239:
    for (float f2 = i4 / paramInt4;; f2 = i6 / i8)
    {
      paramInt4 = a(paramInt1, i3, this.t.c(localView));
      paramInt3 = a(paramInt2, paramInt3, 0);
      float f3 = paramInt4;
      paramInt3 = (int)(f2 * paramInt3 + f1 * f3);
      this.s.a(i1, i2, paramInt1, paramInt2, paramInt3);
      a(2);
      bool = true;
      break;
      f1 = i7 / i8;
      break label145;
    }
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    int i2 = gd.a(paramMotionEvent);
    int i1 = gd.b(paramMotionEvent);
    if (i2 == 0) {
      a();
    }
    if (this.i == null) {
      this.i = VelocityTracker.obtain();
    }
    this.i.addMovement(paramMotionEvent);
    switch (i2)
    {
    case 4: 
    default: 
      if (this.a != 1) {
        break;
      }
    }
    for (;;)
    {
      return bool;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      i1 = gd.b(paramMotionEvent, 0);
      a(f1, f2, i1);
      paramMotionEvent = a((int)f1, (int)f2);
      if ((paramMotionEvent == this.m) && (this.a == 2)) {
        b(paramMotionEvent, i1);
      }
      if ((this.o[i1] & this.l) == 0) {
        break;
      }
      this.t.c();
      break;
      i2 = gd.b(paramMotionEvent, i1);
      f2 = gd.c(paramMotionEvent, i1);
      f1 = gd.d(paramMotionEvent, i1);
      a(f2, f1, i2);
      if (this.a == 0)
      {
        if ((this.o[i2] & this.l) == 0) {
          break;
        }
        this.t.c();
        break;
      }
      if (this.a != 2) {
        break;
      }
      paramMotionEvent = a((int)f2, (int)f1);
      if (paramMotionEvent != this.m) {
        break;
      }
      b(paramMotionEvent, i2);
      break;
      if ((this.d == null) || (this.e == null)) {
        break;
      }
      int i3 = gd.c(paramMotionEvent);
      for (i1 = 0;; i1++)
      {
        int i4;
        float f3;
        float f4;
        View localView;
        if (i1 < i3)
        {
          i4 = gd.b(paramMotionEvent, i1);
          f1 = gd.c(paramMotionEvent, i1);
          f2 = gd.d(paramMotionEvent, i1);
          f3 = f1 - this.d[i4];
          f4 = f2 - this.e[i4];
          localView = a((int)f1, (int)f2);
          if ((localView == null) || (!a(localView, f3, f4))) {
            break label474;
          }
          i2 = 1;
          label389:
          if (i2 == 0) {
            break label480;
          }
          int i5 = localView.getLeft();
          int i6 = (int)f3;
          int i7 = this.t.b(localView, i6 + i5);
          localView.getTop();
          this.t.d(localView);
          i6 = this.t.c(localView);
          if ((i6 != 0) && ((i6 <= 0) || (i7 != i5))) {
            break label480;
          }
        }
        label474:
        label480:
        do
        {
          c(paramMotionEvent);
          break;
          i2 = 0;
          break label389;
          b(f3, f4, i4);
        } while ((this.a == 1) || ((i2 != 0) && (b(localView, i4))));
      }
      b(gd.b(paramMotionEvent, i1));
      break;
      a();
      break;
      bool = false;
    }
  }
  
  public final boolean a(View paramView, int paramInt1, int paramInt2)
  {
    this.m = paramView;
    this.c = -1;
    boolean bool = a(paramInt1, paramInt2, 0, 0);
    if ((!bool) && (this.a == 0) && (this.m != null)) {
      this.m = null;
    }
    return bool;
  }
  
  public final boolean a(boolean paramBoolean)
  {
    boolean bool1 = false;
    if (this.a == 2)
    {
      boolean bool2 = this.s.e();
      int i1 = this.s.a();
      int i4 = this.s.b();
      int i2 = i1 - this.m.getLeft();
      int i3 = i4 - this.m.getTop();
      if (i2 != 0) {
        this.m.offsetLeftAndRight(i2);
      }
      if (i3 != 0) {
        this.m.offsetTopAndBottom(i3);
      }
      if ((i2 != 0) || (i3 != 0)) {
        this.t.a(this.m, i1);
      }
      paramBoolean = bool2;
      if (bool2)
      {
        paramBoolean = bool2;
        if (i1 == this.s.c())
        {
          paramBoolean = bool2;
          if (i4 == this.s.d())
          {
            this.s.f();
            paramBoolean = false;
          }
        }
      }
      if (!paramBoolean) {
        this.u.post(this.w);
      }
    }
    paramBoolean = bool1;
    if (this.a == 2) {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public final void b(MotionEvent paramMotionEvent)
  {
    int i3 = 0;
    int i1 = 0;
    int i2 = 0;
    int i5 = gd.a(paramMotionEvent);
    int i4 = gd.b(paramMotionEvent);
    if (i5 == 0) {
      a();
    }
    if (this.i == null) {
      this.i = VelocityTracker.obtain();
    }
    this.i.addMovement(paramMotionEvent);
    float f2;
    float f1;
    switch (i5)
    {
    case 4: 
    default: 
    case 0: 
    case 5: 
    case 2: 
      for (;;)
      {
        return;
        f2 = paramMotionEvent.getX();
        f1 = paramMotionEvent.getY();
        i1 = gd.b(paramMotionEvent, 0);
        paramMotionEvent = a((int)f2, (int)f1);
        a(f2, f1, i1);
        b(paramMotionEvent, i1);
        if ((this.o[i1] & this.l) != 0)
        {
          this.t.c();
          continue;
          i3 = gd.b(paramMotionEvent, i4);
          f2 = gd.c(paramMotionEvent, i4);
          f1 = gd.d(paramMotionEvent, i4);
          a(f2, f1, i3);
          if (this.a == 0)
          {
            b(a((int)f2, (int)f1), i3);
            if ((this.o[i3] & this.l) != 0) {
              this.t.c();
            }
          }
          else
          {
            i5 = (int)f2;
            i4 = (int)f1;
            paramMotionEvent = this.m;
            i1 = i2;
            if (paramMotionEvent != null)
            {
              i1 = i2;
              if (i5 >= paramMotionEvent.getLeft())
              {
                i1 = i2;
                if (i5 < paramMotionEvent.getRight())
                {
                  i1 = i2;
                  if (i4 >= paramMotionEvent.getTop())
                  {
                    i1 = i2;
                    if (i4 < paramMotionEvent.getBottom()) {
                      i1 = 1;
                    }
                  }
                }
              }
            }
            if (i1 != 0)
            {
              b(this.m, i3);
              continue;
              if (this.a == 1)
              {
                i1 = gd.a(paramMotionEvent, this.c);
                f1 = gd.c(paramMotionEvent, i1);
                f2 = gd.d(paramMotionEvent, i1);
                i4 = (int)(f1 - this.f[this.c]);
                i3 = (int)(f2 - this.g[this.c]);
                i2 = this.m.getLeft() + i4;
                this.m.getTop();
                int i6 = this.m.getLeft();
                i5 = this.m.getTop();
                i1 = i2;
                if (i4 != 0)
                {
                  i1 = this.t.b(this.m, i2);
                  this.m.offsetLeftAndRight(i1 - i6);
                }
                if (i3 != 0)
                {
                  i2 = this.t.d(this.m);
                  this.m.offsetTopAndBottom(i2 - i5);
                }
                if ((i4 != 0) || (i3 != 0)) {
                  this.t.a(this.m, i1);
                }
                c(paramMotionEvent);
              }
              else
              {
                i2 = gd.c(paramMotionEvent);
                for (i1 = i3; i1 < i2; i1++)
                {
                  i3 = gd.b(paramMotionEvent, i1);
                  f1 = gd.c(paramMotionEvent, i1);
                  f2 = gd.d(paramMotionEvent, i1);
                  float f4 = f1 - this.d[i3];
                  float f3 = f2 - this.e[i3];
                  b(f4, f3, i3);
                  if (this.a == 1) {
                    break;
                  }
                  View localView = a((int)f1, (int)f2);
                  if ((a(localView, f4, f3)) && (b(localView, i3))) {
                    break;
                  }
                }
                c(paramMotionEvent);
              }
            }
          }
        }
      }
    case 6: 
      i2 = gd.b(paramMotionEvent, i4);
      if ((this.a == 1) && (i2 == this.c))
      {
        i3 = gd.c(paramMotionEvent);
        label689:
        if (i1 >= i3) {
          break label826;
        }
        i4 = gd.b(paramMotionEvent, i1);
        if (i4 == this.c) {
          break label780;
        }
        f1 = gd.c(paramMotionEvent, i1);
        f2 = gd.d(paramMotionEvent, i1);
        if ((a((int)f1, (int)f2) != this.m) || (!b(this.m, i4))) {
          break label780;
        }
      }
      break;
    }
    label780:
    label826:
    for (i1 = this.c;; i1 = -1)
    {
      if (i1 == -1) {
        b();
      }
      b(i2);
      break;
      i1++;
      break label689;
      if (this.a == 1) {
        b();
      }
      a();
      break;
      if (this.a == 1) {
        a(0.0F, 0.0F);
      }
      a();
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
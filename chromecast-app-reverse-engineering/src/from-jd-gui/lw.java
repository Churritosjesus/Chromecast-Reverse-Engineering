import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;

public class lw
  extends ViewGroup
{
  private static final String f = lw.class.getSimpleName();
  private static final int[] r = { 16842766 };
  private int A;
  private int B;
  private Animation.AnimationListener C = new lx(this);
  private final Animation D = new mc(this);
  private final Animation E = new md(this);
  public me a;
  public boolean b = false;
  public int c;
  public int d;
  public li e;
  private View g;
  private int h;
  private float i = -1.0F;
  private int j;
  private int k;
  private boolean l = false;
  private float m;
  private float n;
  private boolean o;
  private int p = -1;
  private final DecelerateInterpolator q;
  private kh s;
  private int t = -1;
  private Animation u;
  private Animation v;
  private Animation w;
  private Animation x;
  private float y;
  private boolean z;
  
  public lw(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public lw(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.h = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.j = getResources().getInteger(17694721);
    setWillNotDraw(false);
    this.q = new DecelerateInterpolator(2.0F);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, r);
    setEnabled(paramContext.getBoolean(0, true));
    paramContext.recycle();
    paramContext = getResources().getDisplayMetrics();
    this.A = ((int)(paramContext.density * 40.0F));
    this.B = ((int)(paramContext.density * 40.0F));
    this.s = new kh(getContext(), -328966, 20.0F);
    this.e = new li(getContext(), this);
    this.e.a.v = -328966;
    this.s.setImageDrawable(this.e);
    this.s.setVisibility(8);
    addView(this.s);
    gt.a(this, true);
    this.y = (paramContext.density * 64.0F);
    this.i = this.y;
  }
  
  private static float a(MotionEvent paramMotionEvent, int paramInt)
  {
    paramInt = gd.a(paramMotionEvent, paramInt);
    if (paramInt < 0) {}
    for (float f1 = -1.0F;; f1 = gd.d(paramMotionEvent, paramInt)) {
      return f1;
    }
  }
  
  private Animation a(int paramInt1, int paramInt2)
  {
    ma localma = new ma(this, paramInt1, paramInt2);
    localma.setDuration(300L);
    this.s.a = null;
    this.s.clearAnimation();
    this.s.startAnimation(localma);
    return localma;
  }
  
  private void a(int paramInt)
  {
    this.s.getBackground().setAlpha(paramInt);
    this.e.setAlpha(paramInt);
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    this.s.bringToFront();
    this.s.offsetTopAndBottom(paramInt);
    this.k = this.s.getTop();
    if ((paramBoolean) && (Build.VERSION.SDK_INT < 11)) {
      invalidate();
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = gd.b(paramMotionEvent);
    if (gd.b(paramMotionEvent, i1) == this.p) {
      if (i1 != 0) {
        break label33;
      }
    }
    label33:
    for (i1 = 1;; i1 = 0)
    {
      this.p = gd.b(paramMotionEvent, i1);
      return;
    }
  }
  
  private void a(Animation.AnimationListener paramAnimationListener)
  {
    this.v = new lz(this);
    this.v.setDuration(150L);
    this.s.a = paramAnimationListener;
    this.s.clearAnimation();
    this.s.startAnimation(this.v);
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.b != paramBoolean1)
    {
      this.z = paramBoolean2;
      a();
      this.b = paramBoolean1;
      if (!this.b) {
        break label105;
      }
      int i1 = this.k;
      Animation.AnimationListener localAnimationListener = this.C;
      this.c = i1;
      this.D.reset();
      this.D.setDuration(200L);
      this.D.setInterpolator(this.q);
      if (localAnimationListener != null) {
        this.s.a = localAnimationListener;
      }
      this.s.clearAnimation();
      this.s.startAnimation(this.D);
    }
    for (;;)
    {
      return;
      label105:
      a(this.C);
    }
  }
  
  private static boolean a(Animation paramAnimation)
  {
    if ((paramAnimation != null) && (paramAnimation.hasStarted()) && (!paramAnimation.hasEnded())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static boolean c()
  {
    if (Build.VERSION.SDK_INT < 11) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void a()
  {
    if (this.g == null) {}
    for (int i1 = 0;; i1++) {
      if (i1 < getChildCount())
      {
        View localView = getChildAt(i1);
        if (!localView.equals(this.s)) {
          this.g = localView;
        }
      }
      else
      {
        return;
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.b != paramBoolean))
    {
      this.b = paramBoolean;
      a((int)(this.y + this.d) - this.k, true);
      this.z = false;
      Animation.AnimationListener localAnimationListener = this.C;
      this.s.setVisibility(0);
      if (Build.VERSION.SDK_INT >= 11) {
        this.e.setAlpha(255);
      }
      this.u = new ly(this);
      this.u.setDuration(this.j);
      if (localAnimationListener != null) {
        this.s.a = localAnimationListener;
      }
      this.s.clearAnimation();
      this.s.startAnimation(this.u);
    }
    for (;;)
    {
      return;
      a(paramBoolean, false);
    }
  }
  
  public boolean b()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT < 14) {
      if ((this.g instanceof AbsListView))
      {
        AbsListView localAbsListView = (AbsListView)this.g;
        if ((localAbsListView.getChildCount() > 0) && ((localAbsListView.getFirstVisiblePosition() > 0) || (localAbsListView.getChildAt(0).getTop() < localAbsListView.getPaddingTop()))) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      if ((gt.b(this.g, -1)) || (this.g.getScrollY() > 0))
      {
        bool = true;
      }
      else
      {
        bool = false;
        continue;
        bool = gt.b(this.g, -1);
      }
    }
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.t < 0) {
      paramInt1 = paramInt2;
    }
    for (;;)
    {
      return paramInt1;
      if (paramInt2 == paramInt1 - 1)
      {
        paramInt1 = this.t;
      }
      else
      {
        paramInt1 = paramInt2;
        if (paramInt2 >= this.t) {
          paramInt1 = paramInt2 + 1;
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    a();
    int i1 = gd.a(paramMotionEvent);
    boolean bool1 = bool2;
    if (isEnabled())
    {
      bool1 = bool2;
      if (!b())
      {
        if (!this.b) {
          break label48;
        }
        bool1 = bool2;
      }
    }
    return bool1;
    label48:
    switch (i1)
    {
    }
    for (;;)
    {
      bool1 = this.o;
      break;
      a(this.d - this.s.getTop(), true);
      this.p = gd.b(paramMotionEvent, 0);
      this.o = false;
      float f1 = a(paramMotionEvent, this.p);
      bool1 = bool2;
      if (f1 == -1.0F) {
        break;
      }
      this.n = f1;
      continue;
      if (this.p == -1)
      {
        Log.e(f, "Got ACTION_MOVE event but don't have an active pointer id.");
        bool1 = bool2;
        break;
      }
      f1 = a(paramMotionEvent, this.p);
      bool1 = bool2;
      if (f1 == -1.0F) {
        break;
      }
      if ((f1 - this.n > this.h) && (!this.o))
      {
        this.m = (this.n + this.h);
        this.o = true;
        this.e.setAlpha(76);
        continue;
        a(paramMotionEvent);
        continue;
        this.o = false;
        this.p = -1;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = getMeasuredWidth();
    paramInt3 = getMeasuredHeight();
    if (getChildCount() == 0) {}
    for (;;)
    {
      return;
      if (this.g == null) {
        a();
      }
      if (this.g != null)
      {
        View localView = this.g;
        paramInt2 = getPaddingLeft();
        paramInt4 = getPaddingTop();
        localView.layout(paramInt2, paramInt4, paramInt1 - getPaddingLeft() - getPaddingRight() + paramInt2, paramInt3 - getPaddingTop() - getPaddingBottom() + paramInt4);
        paramInt3 = this.s.getMeasuredWidth();
        paramInt2 = this.s.getMeasuredHeight();
        this.s.layout(paramInt1 / 2 - paramInt3 / 2, this.k, paramInt1 / 2 + paramInt3 / 2, this.k + paramInt2);
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.g == null) {
      a();
    }
    if (this.g == null) {}
    label169:
    for (;;)
    {
      return;
      this.g.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
      this.s.measure(View.MeasureSpec.makeMeasureSpec(this.A, 1073741824), View.MeasureSpec.makeMeasureSpec(this.B, 1073741824));
      if (!this.l)
      {
        this.l = true;
        paramInt1 = -this.s.getMeasuredHeight();
        this.d = paramInt1;
        this.k = paramInt1;
      }
      this.t = -1;
      for (paramInt1 = 0;; paramInt1++)
      {
        if (paramInt1 >= getChildCount()) {
          break label169;
        }
        if (getChildAt(paramInt1) == this.s)
        {
          this.t = paramInt1;
          break;
        }
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = gd.a(paramMotionEvent);
    boolean bool;
    if ((!isEnabled()) || (b())) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      switch (i1)
      {
      case 4: 
      default: 
      case 0: 
      case 2: 
      case 5: 
      case 6: 
        for (;;)
        {
          bool = true;
          break;
          this.p = gd.b(paramMotionEvent, 0);
          this.o = false;
          continue;
          i1 = gd.a(paramMotionEvent, this.p);
          if (i1 < 0)
          {
            Log.e(f, "Got ACTION_MOVE event but have an invalid active pointer id.");
            bool = false;
            break;
          }
          f1 = (gd.d(paramMotionEvent, i1) - this.m) * 0.5F;
          if (this.o)
          {
            this.e.a(true);
            f2 = f1 / this.i;
            if (f2 < 0.0F)
            {
              bool = false;
              break;
            }
            float f4 = Math.min(1.0F, Math.abs(f2));
            float f3 = (float)Math.max(f4 - 0.4D, 0.0D) * 5.0F / 3.0F;
            float f5 = Math.abs(f1);
            float f6 = this.i;
            f2 = this.y;
            f5 = Math.max(0.0F, Math.min(f5 - f6, 2.0F * f2) / f2);
            f5 = (float)(f5 / 4.0F - Math.pow(f5 / 4.0F, 2.0D)) * 2.0F;
            i1 = this.d;
            int i2 = (int)(f4 * f2 + f2 * f5 * 2.0F);
            if (this.s.getVisibility() != 0) {
              this.s.setVisibility(0);
            }
            gt.d(this.s, 1.0F);
            gt.e(this.s, 1.0F);
            if (f1 < this.i)
            {
              if ((this.e.getAlpha() > 76) && (!a(this.w))) {
                this.w = a(this.e.getAlpha(), 76);
              }
              this.e.a(0.0F, Math.min(0.8F, 0.8F * f3));
              this.e.a(Math.min(1.0F, f3));
            }
            for (;;)
            {
              this.e.a.c((-0.25F + f3 * 0.4F + 2.0F * f5) * 0.5F);
              a(i2 + i1 - this.k, true);
              break;
              if ((this.e.getAlpha() < 255) && (!a(this.x))) {
                this.x = a(this.e.getAlpha(), 255);
              }
            }
            this.p = gd.b(paramMotionEvent, gd.b(paramMotionEvent));
            continue;
            a(paramMotionEvent);
          }
        }
      }
      if (this.p != -1) {
        break;
      }
      if (i1 == 1) {
        Log.e(f, "Got ACTION_UP event but don't have an active pointer id.");
      }
      bool = false;
    }
    float f2 = gd.d(paramMotionEvent, gd.a(paramMotionEvent, this.p));
    float f1 = this.m;
    this.o = false;
    if ((f2 - f1) * 0.5F > this.i) {
      a(true, true);
    }
    for (;;)
    {
      this.p = -1;
      bool = false;
      break;
      this.b = false;
      this.e.a(0.0F, 0.0F);
      paramMotionEvent = new mb(this);
      this.c = this.k;
      this.E.reset();
      this.E.setDuration(200L);
      this.E.setInterpolator(this.q);
      if (paramMotionEvent != null) {
        this.s.a = paramMotionEvent;
      }
      this.s.clearAnimation();
      this.s.startAnimation(this.E);
      this.e.a(false);
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\lw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
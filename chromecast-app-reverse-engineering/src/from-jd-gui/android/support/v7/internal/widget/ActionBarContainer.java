package android.support.v7.internal.widget;

import a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import oq;
import rc;
import rd;
import sm;

public class ActionBarContainer
  extends FrameLayout
{
  View a;
  public Drawable b;
  public Drawable c;
  public Drawable d;
  public boolean e;
  public boolean f;
  private boolean g;
  private View h;
  private View i;
  private int j;
  
  public ActionBarContainer(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int k;
    Object localObject;
    label31:
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21)
    {
      k = 1;
      if (k == 0) {
        break label139;
      }
      localObject = new rd(this);
      setBackgroundDrawable((Drawable)localObject);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, oq.a);
      this.b = paramContext.getDrawable(oq.b);
      this.c = paramContext.getDrawable(oq.d);
      this.j = paramContext.getDimensionPixelSize(oq.j, -1);
      if (getId() == a.bu)
      {
        this.e = true;
        this.d = paramContext.getDrawable(oq.c);
      }
      paramContext.recycle();
      if (!this.e) {
        break label157;
      }
      if (this.d != null) {
        break label151;
      }
      bool = true;
    }
    for (;;)
    {
      setWillNotDraw(bool);
      return;
      k = 0;
      break;
      label139:
      localObject = new rc(this);
      break label31;
      label151:
      bool = false;
      continue;
      label157:
      if ((this.b == null) && (this.c == null)) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  private static boolean a(View paramView)
  {
    if ((paramView == null) || (paramView.getVisibility() == 8) || (paramView.getMeasuredHeight() == 0)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static int b(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    int k = paramView.getMeasuredHeight();
    int m = localLayoutParams.topMargin;
    return localLayoutParams.bottomMargin + (k + m);
  }
  
  public final void a(sm paramsm)
  {
    if (this.a != null) {
      removeView(this.a);
    }
    this.a = paramsm;
    if (paramsm != null)
    {
      addView(paramsm);
      ViewGroup.LayoutParams localLayoutParams = paramsm.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      paramsm.b = false;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if (paramBoolean) {}
    for (int k = 393216;; k = 262144)
    {
      setDescendantFocusability(k);
      return;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.b != null) && (this.b.isStateful())) {
      this.b.setState(getDrawableState());
    }
    if ((this.c != null) && (this.c.isStateful())) {
      this.c.setState(getDrawableState());
    }
    if ((this.d != null) && (this.d.isStateful())) {
      this.d.setState(getDrawableState());
    }
  }
  
  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.b != null) {
        this.b.jumpToCurrentState();
      }
      if (this.c != null) {
        this.c.jumpToCurrentState();
      }
      if (this.d != null) {
        this.d.jumpToCurrentState();
      }
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.h = findViewById(a.aP);
    this.i = findViewById(a.aU);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.g) || (super.onInterceptTouchEvent(paramMotionEvent))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = 1;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = this.a;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      paramBoolean = true;
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        paramInt2 = getMeasuredHeight();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        localView.layout(paramInt1, paramInt2 - localView.getMeasuredHeight() - localLayoutParams.bottomMargin, paramInt3, paramInt2 - localLayoutParams.bottomMargin);
      }
      if (!this.e) {
        break label143;
      }
      if (this.d == null) {
        break label323;
      }
      this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
      paramInt1 = k;
    }
    for (;;)
    {
      if (paramInt1 != 0) {
        invalidate();
      }
      return;
      paramBoolean = false;
      break;
      label143:
      if (this.b != null) {
        if (this.h.getVisibility() == 0) {
          this.b.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
        }
      }
      label195:
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        this.f = paramBoolean;
        if ((paramBoolean) && (this.c != null))
        {
          this.c.setBounds(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          paramInt1 = k;
          break;
          if ((this.i != null) && (this.i.getVisibility() == 0))
          {
            this.b.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            break label195;
          }
          this.b.setBounds(0, 0, 0, 0);
          break label195;
        }
        break;
      }
      label323:
      paramInt1 = 0;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int k = paramInt2;
    if (this.h == null)
    {
      k = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE)
      {
        k = paramInt2;
        if (this.j >= 0) {
          k = View.MeasureSpec.makeMeasureSpec(Math.min(this.j, View.MeasureSpec.getSize(paramInt2)), Integer.MIN_VALUE);
        }
      }
    }
    super.onMeasure(paramInt1, k);
    if (this.h == null) {}
    do
    {
      return;
      paramInt2 = View.MeasureSpec.getMode(k);
    } while ((this.a == null) || (this.a.getVisibility() == 8) || (paramInt2 == 1073741824));
    if (!a(this.h))
    {
      paramInt1 = b(this.h);
      label108:
      if (paramInt2 != Integer.MIN_VALUE) {
        break label169;
      }
    }
    label169:
    for (paramInt2 = View.MeasureSpec.getSize(k);; paramInt2 = Integer.MAX_VALUE)
    {
      setMeasuredDimension(getMeasuredWidth(), Math.min(paramInt1 + b(this.a), paramInt2));
      break;
      if (!a(this.i))
      {
        paramInt1 = b(this.i);
        break label108;
      }
      paramInt1 = 0;
      break label108;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if (this.b != null) {
        this.b.setVisible(bool, false);
      }
      if (this.c != null) {
        this.c.setVisible(bool, false);
      }
      if (this.d != null) {
        this.d.setVisible(bool, false);
      }
      return;
    }
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if (((paramDrawable == this.b) && (!this.e)) || ((paramDrawable == this.c) && (this.f)) || ((paramDrawable == this.d) && (this.e)) || (super.verifyDrawable(paramDrawable))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\internal\widget\ActionBarContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
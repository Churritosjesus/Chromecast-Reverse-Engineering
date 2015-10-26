package android.support.v7.internal.view.menu;

import a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;
import gt;
import oq;
import pt;
import pu;
import qc;
import qe;
import qs;
import wc;
import wt;
import yg;

public class ActionMenuItemView
  extends wt
  implements View.OnClickListener, View.OnLongClickListener, qs, wc
{
  public qc a;
  public pu b;
  private qe c;
  private CharSequence d;
  private Drawable e;
  private yg f;
  private boolean g;
  private int h;
  private int i;
  private int j;
  
  public ActionMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = paramContext.getResources();
    this.g = localResources.getBoolean(a.W);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, oq.v, paramInt, 0);
    this.h = paramContext.getDimensionPixelSize(oq.w, 0);
    paramContext.recycle();
    this.j = ((int)(localResources.getDisplayMetrics().density * 32.0F + 0.5F));
    setOnClickListener(this);
    setOnLongClickListener(this);
    this.i = -1;
  }
  
  private void f()
  {
    int i1 = 0;
    int k;
    int n;
    if (!TextUtils.isEmpty(this.d))
    {
      k = 1;
      label38:
      int m;
      if (this.e != null)
      {
        if ((this.c.c & 0x4) != 4) {
          break label80;
        }
        n = 1;
        m = i1;
        if (n != 0)
        {
          m = i1;
          if (!this.g) {}
        }
      }
      else
      {
        m = 1;
      }
      if ((k & m) == 0) {
        break label86;
      }
    }
    label80:
    label86:
    for (CharSequence localCharSequence = this.d;; localCharSequence = null)
    {
      setText(localCharSequence);
      return;
      k = 0;
      break;
      n = 0;
      break label38;
    }
  }
  
  public final qe a()
  {
    return this.c;
  }
  
  public final void a(qe paramqe, int paramInt)
  {
    this.c = paramqe;
    Drawable localDrawable = paramqe.getIcon();
    this.e = localDrawable;
    if (localDrawable != null)
    {
      int n = localDrawable.getIntrinsicWidth();
      int m = localDrawable.getIntrinsicHeight();
      int k = m;
      paramInt = n;
      float f1;
      if (n > this.j)
      {
        f1 = this.j / n;
        paramInt = this.j;
        k = (int)(m * f1);
      }
      n = k;
      m = paramInt;
      if (k > this.j)
      {
        f1 = this.j / k;
        n = this.j;
        m = (int)(paramInt * f1);
      }
      localDrawable.setBounds(0, 0, m, n);
    }
    setCompoundDrawables(localDrawable, null, null, null);
    f();
    this.d = paramqe.a(this);
    setContentDescription(this.d);
    f();
    setId(paramqe.getItemId());
    if (paramqe.isVisible()) {}
    for (paramInt = 0;; paramInt = 8)
    {
      setVisibility(paramInt);
      setEnabled(paramqe.isEnabled());
      if ((paramqe.hasSubMenu()) && (this.f == null)) {
        this.f = new pt(this);
      }
      return;
    }
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final boolean c()
  {
    if (!TextUtils.isEmpty(getText())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean d()
  {
    if ((c()) && (this.c.getIcon() == null)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean e()
  {
    return c();
  }
  
  public void onClick(View paramView)
  {
    if (this.a != null) {
      this.a.a(this.c);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    this.g = getContext().getResources().getBoolean(a.W);
    f();
  }
  
  public boolean onLongClick(View paramView)
  {
    boolean bool;
    if (c())
    {
      bool = false;
      return bool;
    }
    int[] arrayOfInt = new int[2];
    Rect localRect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Context localContext = getContext();
    int k = getWidth();
    int n = getHeight();
    int i1 = arrayOfInt[1];
    int i2 = n / 2;
    int m = arrayOfInt[0] + k / 2;
    k = m;
    if (gt.g(paramView) == 0) {
      k = localContext.getResources().getDisplayMetrics().widthPixels - m;
    }
    paramView = Toast.makeText(localContext, this.c.getTitle(), 0);
    if (i1 + i2 < localRect.height()) {
      paramView.setGravity(8388661, k, n);
    }
    for (;;)
    {
      paramView.show();
      bool = true;
      break;
      paramView.setGravity(81, 0, n);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = c();
    if ((bool) && (this.i >= 0)) {
      super.setPadding(this.i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
    super.onMeasure(paramInt1, paramInt2);
    int k = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int m = getMeasuredWidth();
    if (k == Integer.MIN_VALUE) {}
    for (paramInt1 = Math.min(paramInt1, this.h);; paramInt1 = this.h)
    {
      if ((k != 1073741824) && (this.h > 0) && (m < paramInt1)) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
      }
      if ((!bool) && (this.e != null)) {
        super.setPadding((getMeasuredWidth() - this.e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      }
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.c.hasSubMenu()) && (this.f != null) && (this.f.onTouch(this, paramMotionEvent))) {}
    for (boolean bool = true;; bool = super.onTouchEvent(paramMotionEvent)) {
      return bool;
    }
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.i = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\internal\view\menu\ActionMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.ApplicationInfo;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

final class sr
  extends qy
  implements DialogInterface.OnClickListener
{
  private boolean A;
  private Rect B = new Rect();
  private yg w;
  private ta x;
  private sv y;
  private int z;
  
  sr(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, null, paramInt, -1);
  }
  
  private sr(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    th localth = th.a(paramContext, paramAttributeSet, oq.bo, paramInt1, 0);
    if (localth.d(oq.bp)) {
      setBackgroundDrawable(localth.a(oq.bp));
    }
    switch (localth.a(oq.bv, 0))
    {
    }
    for (;;)
    {
      this.z = localth.a(oq.br, 17);
      paramContext = this.x;
      paramInt1 = oq.bu;
      paramContext.a(localth.a.getString(paramInt1));
      this.A = localth.a(oq.bt, false);
      localth.a.recycle();
      if (this.y != null)
      {
        this.x.a(this.y);
        this.y = null;
      }
      localth.a();
      return;
      this.x = new su(this);
      continue;
      paramAttributeSet = new sw(this, paramContext, paramAttributeSet, paramInt1);
      localth.d(oq.bq, -2);
      paramContext = localth.a(oq.bs);
      paramAttributeSet.b.setBackgroundDrawable(paramContext);
      this.x = paramAttributeSet;
      this.w = new ss(this, this, paramAttributeSet);
    }
  }
  
  private View a(int paramInt, boolean paramBoolean)
  {
    View localView;
    if (!this.m)
    {
      localView = this.e.a(paramInt);
      if (localView != null) {
        a(localView, paramBoolean);
      }
    }
    for (;;)
    {
      return localView;
      localView = this.a.getView(paramInt, null, this);
      a(localView, paramBoolean);
    }
  }
  
  private void a(View paramView, boolean paramBoolean)
  {
    ViewGroup.LayoutParams localLayoutParams2 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = generateDefaultLayoutParams();
    }
    if (paramBoolean) {
      addViewInLayout(paramView, 0, localLayoutParams1);
    }
    paramView.setSelected(hasFocus());
    if (this.A) {
      paramView.setEnabled(isEnabled());
    }
    int i = ViewGroup.getChildMeasureSpec(this.b, this.d.top + this.d.bottom, localLayoutParams1.height);
    paramView.measure(ViewGroup.getChildMeasureSpec(this.c, this.d.left + this.d.right, localLayoutParams1.width), i);
    i = this.d.top + (getMeasuredHeight() - this.d.bottom - this.d.top - paramView.getMeasuredHeight()) / 2;
    int j = paramView.getMeasuredHeight();
    paramView.layout(0, i, paramView.getMeasuredWidth() + 0, j + i);
  }
  
  public final void a(SpinnerAdapter paramSpinnerAdapter)
  {
    super.a(paramSpinnerAdapter);
    this.e.a();
    if ((getContext().getApplicationInfo().targetSdkVersion >= 21) && (paramSpinnerAdapter != null) && (paramSpinnerAdapter.getViewTypeCount() != 1)) {
      throw new IllegalArgumentException("Spinner adapter view type count must be 1");
    }
    if (this.x != null) {
      this.x.a(new sv(paramSpinnerAdapter));
    }
    for (;;)
    {
      return;
      this.y = new sv(paramSpinnerAdapter);
    }
  }
  
  public final void a(rz paramrz)
  {
    throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
  }
  
  final void b(rz paramrz)
  {
    super.a(paramrz);
  }
  
  public final int getBaseline()
  {
    int j = -1;
    Object localObject2 = null;
    Object localObject1;
    if (getChildCount() > 0) {
      localObject1 = getChildAt(0);
    }
    for (;;)
    {
      int i = j;
      if (localObject1 != null)
      {
        int k = ((View)localObject1).getBaseline();
        i = j;
        if (k >= 0) {
          i = ((View)localObject1).getTop() + k;
        }
      }
      return i;
      localObject1 = localObject2;
      if (this.a != null)
      {
        localObject1 = localObject2;
        if (this.a.getCount() > 0)
        {
          localObject1 = a(0, false);
          this.e.a(0, (View)localObject1);
        }
      }
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a(paramInt);
    paramDialogInterface.dismiss();
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.x != null) && (this.x.b())) {
      this.x.a();
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.k = true;
    paramInt2 = this.d.left;
    paramInt3 = getRight() - getLeft() - this.d.left - this.d.right;
    if (this.m) {
      e();
    }
    if (this.r == 0)
    {
      a();
      this.k = false;
      return;
    }
    if (this.n >= 0) {
      b(this.n);
    }
    paramInt4 = getChildCount();
    Object localObject = this.e;
    int i = this.f;
    for (paramInt1 = 0; paramInt1 < paramInt4; paramInt1++) {
      ((qz)localObject).a(i + paramInt1, getChildAt(paramInt1));
    }
    removeAllViewsInLayout();
    this.f = this.p;
    if (this.a != null)
    {
      localObject = a(this.p, true);
      paramInt4 = ((View)localObject).getMeasuredWidth();
      paramInt1 = gt.g(this);
      switch (fe.a(this.z, paramInt1) & 0x7)
      {
      default: 
        paramInt1 = paramInt2;
      }
    }
    for (;;)
    {
      ((View)localObject).offsetLeftAndRight(paramInt1);
      this.e.a();
      invalidate();
      f();
      this.m = false;
      this.i = false;
      c(this.p);
      break;
      paramInt1 = paramInt2 + paramInt3 / 2 - paramInt4 / 2;
      continue;
      paramInt1 = paramInt2 + paramInt3 - paramInt4;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    super.onMeasure(paramInt1, paramInt2);
    SpinnerAdapter localSpinnerAdapter;
    Drawable localDrawable;
    if ((this.x != null) && (View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE))
    {
      int m = getMeasuredWidth();
      localSpinnerAdapter = this.a;
      localDrawable = getBackground();
      if (localSpinnerAdapter == null)
      {
        paramInt2 = i;
        setMeasuredDimension(Math.min(Math.max(m, paramInt2), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
      }
    }
    else
    {
      return;
    }
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    paramInt2 = Math.max(0, this.n);
    int i2 = Math.min(localSpinnerAdapter.getCount(), paramInt2 + 15);
    int j = Math.max(0, paramInt2 - (15 - (i2 - paramInt2)));
    View localView = null;
    paramInt2 = 0;
    i = 0;
    label135:
    if (j < i2)
    {
      int k = localSpinnerAdapter.getItemViewType(j);
      if (k == i) {
        break label262;
      }
      localView = null;
      i = k;
    }
    label262:
    for (;;)
    {
      localView = localSpinnerAdapter.getView(j, localView, this);
      if (localView.getLayoutParams() == null) {
        localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      }
      localView.measure(n, i1);
      paramInt2 = Math.max(paramInt2, localView.getMeasuredWidth());
      j++;
      break label135;
      if (localDrawable != null)
      {
        localDrawable.getPadding(this.B);
        paramInt2 = this.B.left + this.B.right + paramInt2;
        break;
      }
      break;
    }
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (sy)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (paramParcelable.c)
    {
      paramParcelable = getViewTreeObserver();
      if (paramParcelable != null) {
        paramParcelable.addOnGlobalLayoutListener(new st(this));
      }
    }
  }
  
  public final Parcelable onSaveInstanceState()
  {
    sy localsy = new sy(super.onSaveInstanceState());
    if ((this.x != null) && (this.x.b())) {}
    for (boolean bool = true;; bool = false)
    {
      localsy.c = bool;
      return localsy;
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.w != null) && (this.w.onTouch(this, paramMotionEvent))) {}
    for (boolean bool = true;; bool = super.onTouchEvent(paramMotionEvent)) {
      return bool;
    }
  }
  
  public final boolean performClick()
  {
    boolean bool2 = super.performClick();
    boolean bool1 = bool2;
    if (!bool2)
    {
      bool2 = true;
      bool1 = bool2;
      if (!this.x.b())
      {
        this.x.c();
        bool1 = bool2;
      }
    }
    return bool1;
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (this.A)
    {
      int j = getChildCount();
      for (int i = 0; i < j; i++) {
        getChildAt(i).setEnabled(paramBoolean);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
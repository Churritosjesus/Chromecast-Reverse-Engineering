import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.SpinnerAdapter;

abstract class qy
  extends rx
{
  private DataSetObserver A;
  SpinnerAdapter a;
  int b;
  int c;
  final Rect d = new Rect();
  final qz e = new qz(this);
  private int w = 0;
  private int x = 0;
  private int y = 0;
  private int z = 0;
  
  qy(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setFocusable(true);
    setWillNotDraw(false);
  }
  
  final void a()
  {
    this.m = false;
    this.i = false;
    removeAllViewsInLayout();
    this.t = -1;
    this.u = Long.MIN_VALUE;
    b(-1);
    c(-1);
    invalidate();
  }
  
  public final void a(int paramInt)
  {
    c(paramInt);
    requestLayout();
    invalidate();
  }
  
  public void a(SpinnerAdapter paramSpinnerAdapter)
  {
    int i = -1;
    if (this.a != null)
    {
      this.a.unregisterDataSetObserver(this.A);
      a();
    }
    this.a = paramSpinnerAdapter;
    this.t = -1;
    this.u = Long.MIN_VALUE;
    if (this.a != null)
    {
      this.s = this.r;
      this.r = this.a.getCount();
      d();
      this.A = new ry(this);
      this.a.registerDataSetObserver(this.A);
      if (this.r > 0) {
        i = 0;
      }
      b(i);
      c(i);
      if (this.r == 0) {
        f();
      }
    }
    for (;;)
    {
      requestLayout();
      return;
      d();
      a();
      f();
    }
  }
  
  public final View b()
  {
    if ((this.r > 0) && (this.p >= 0)) {}
    for (View localView = getChildAt(this.p - this.f);; localView = null) {
      return localView;
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.LayoutParams(-1, -2);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int n = View.MeasureSpec.getMode(paramInt1);
    int i = getPaddingLeft();
    int m = getPaddingTop();
    int k = getPaddingRight();
    int j = getPaddingBottom();
    Object localObject = this.d;
    if (i > 0)
    {
      ((Rect)localObject).left = i;
      localObject = this.d;
      if (m <= 0) {
        break label396;
      }
      i = m;
      label60:
      ((Rect)localObject).top = i;
      localObject = this.d;
      if (k <= 0) {
        break label402;
      }
      i = k;
      label80:
      ((Rect)localObject).right = i;
      localObject = this.d;
      if (j <= 0) {
        break label408;
      }
      i = j;
      label100:
      ((Rect)localObject).bottom = i;
      if (this.m) {
        e();
      }
      i = this.n;
      if ((i < 0) || (this.a == null) || (i >= this.a.getCount())) {
        break label414;
      }
      View localView = this.e.a(i);
      localObject = localView;
      if (localView == null) {
        localObject = this.a.getView(i, null, this);
      }
      if (localObject == null) {
        break label414;
      }
      this.e.a(i, (View)localObject);
      if (((View)localObject).getLayoutParams() == null)
      {
        this.v = true;
        ((View)localObject).setLayoutParams(generateDefaultLayoutParams());
        this.v = false;
      }
      measureChild((View)localObject, paramInt1, paramInt2);
      j = ((View)localObject).getMeasuredHeight() + this.d.top + this.d.bottom;
      i = ((View)localObject).getMeasuredWidth() + this.d.left + this.d.right;
      k = 0;
    }
    for (;;)
    {
      m = i;
      if (k != 0)
      {
        k = this.d.top + this.d.bottom;
        m = i;
        j = k;
        if (n == 0)
        {
          m = this.d.left + this.d.right;
          j = k;
        }
      }
      j = Math.max(j, getSuggestedMinimumHeight());
      i = Math.max(m, getSuggestedMinimumWidth());
      j = gt.a(j, paramInt2, 0);
      setMeasuredDimension(gt.a(i, paramInt1, 0), j);
      this.b = paramInt2;
      this.c = paramInt1;
      return;
      i = 0;
      break;
      label396:
      i = 0;
      break label60;
      label402:
      i = 0;
      break label80;
      label408:
      i = 0;
      break label100;
      label414:
      k = 1;
      i = 0;
      j = 0;
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (ra)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (paramParcelable.a >= 0L)
    {
      this.m = true;
      this.i = true;
      this.h = paramParcelable.a;
      this.g = paramParcelable.b;
      this.j = 0;
      requestLayout();
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    ra localra = new ra(super.onSaveInstanceState());
    localra.a = this.o;
    if (localra.a >= 0L) {}
    for (localra.b = this.n;; localra.b = -1) {
      return localra;
    }
  }
  
  public void requestLayout()
  {
    if (!this.v) {
      super.requestLayout();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
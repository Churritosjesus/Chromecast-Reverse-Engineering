import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class yc
{
  private static Method a;
  public PopupWindow b;
  public yf c;
  public int d = 0;
  int e = Integer.MAX_VALUE;
  public int f = 0;
  public View g;
  public AdapterView.OnItemClickListener h;
  private Context i;
  private ListAdapter j;
  private int k = -2;
  private int l = -2;
  private int m;
  private int n;
  private boolean o;
  private boolean p = false;
  private boolean q = false;
  private DataSetObserver r;
  private final yn s = new yn(this);
  private final ym t = new ym(this);
  private final yl u = new yl(this);
  private final yj v = new yj(this);
  private Handler w = new Handler();
  private Rect x = new Rect();
  private boolean y;
  
  static
  {
    try
    {
      a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { Boolean.TYPE });
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  public yc(Context paramContext)
  {
    this(paramContext, null, a.J);
  }
  
  public yc(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public yc(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.i = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, oq.an, paramInt1, paramInt2);
    this.m = localTypedArray.getDimensionPixelOffset(oq.ao, 0);
    this.n = localTypedArray.getDimensionPixelOffset(oq.ap, 0);
    if (this.n != 0) {
      this.o = true;
    }
    localTypedArray.recycle();
    this.b = new sb(paramContext, paramAttributeSet, paramInt1);
    this.b.setInputMethodMode(1);
    ec.a(this.i.getResources().getConfiguration().locale);
  }
  
  public final void a()
  {
    this.b.dismiss();
    this.b.setContentView(null);
    this.c = null;
    this.w.removeCallbacks(this.s);
  }
  
  public final void a(int paramInt)
  {
    Drawable localDrawable = this.b.getBackground();
    if (localDrawable != null) {
      localDrawable.getPadding(this.x);
    }
    for (this.l = (this.x.left + this.x.right + paramInt);; this.l = paramInt) {
      return;
    }
  }
  
  public void a(ListAdapter paramListAdapter)
  {
    if (this.r == null) {
      this.r = new yk(this);
    }
    for (;;)
    {
      this.j = paramListAdapter;
      if (this.j != null) {
        paramListAdapter.registerDataSetObserver(this.r);
      }
      if (this.c != null) {
        this.c.setAdapter(this.j);
      }
      return;
      if (this.j != null) {
        this.j.unregisterDataSetObserver(this.r);
      }
    }
  }
  
  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.b.setOnDismissListener(paramOnDismissListener);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.y = true;
    this.b.setFocusable(true);
  }
  
  public final boolean b()
  {
    return this.b.isShowing();
  }
  
  public final void c()
  {
    Object localObject;
    boolean bool;
    label122:
    int i4;
    int i1;
    if (this.c == null)
    {
      localObject = this.i;
      new yd(this);
      if (!this.y)
      {
        bool = true;
        this.c = new yf((Context)localObject, bool);
        this.c.setAdapter(this.j);
        this.c.setOnItemClickListener(this.h);
        this.c.setFocusable(true);
        this.c.setFocusableInTouchMode(true);
        this.c.setOnItemSelectedListener(new ye(this));
        this.c.setOnScrollListener(this.u);
        localObject = this.c;
        this.b.setContentView((View)localObject);
        i4 = 0;
        localObject = this.b.getBackground();
        if (localObject == null) {
          break label350;
        }
        ((Drawable)localObject).getPadding(this.x);
        i1 = this.x.top + this.x.bottom;
        i4 = i1;
        if (!this.o)
        {
          this.n = (-this.x.top);
          i4 = i1;
        }
      }
    }
    int i8;
    int i2;
    label273:
    int i3;
    for (;;)
    {
      this.b.getInputMethodMode();
      i8 = this.b.getMaxAvailableHeight(this.g, this.n);
      if (this.k != -1) {
        break label360;
      }
      i1 = i4 + i8;
      i2 = 0;
      bool = e();
      if (!this.b.isShowing()) {
        break label824;
      }
      if (this.l != -1) {
        break label729;
      }
      i2 = -1;
      if (this.k != -1) {
        break label803;
      }
      if (!bool) {
        break label759;
      }
      if (!bool) {
        break label771;
      }
      localObject = this.b;
      if (this.l != -1) {
        break label765;
      }
      i3 = -1;
      label294:
      ((PopupWindow)localObject).setWindowLayoutMode(i3, 0);
      label301:
      this.b.setOutsideTouchable(true);
      this.b.update(this.g, this.m, this.n, i2, i1);
      label332:
      return;
      bool = false;
      break;
      this.b.getContentView();
      break label122;
      label350:
      this.x.setEmpty();
    }
    label360:
    label400:
    yf localyf;
    int i5;
    ListAdapter localListAdapter;
    switch (this.l)
    {
    default: 
      i2 = View.MeasureSpec.makeMeasureSpec(this.l, 1073741824);
      localyf = this.c;
      i3 = localyf.getListPaddingTop();
      i1 = localyf.getListPaddingBottom();
      localyf.getListPaddingLeft();
      localyf.getListPaddingRight();
      i5 = localyf.getDividerHeight();
      localObject = localyf.getDivider();
      localListAdapter = localyf.getAdapter();
      if (localListAdapter == null) {
        i3 = i1 + i3;
      }
      break;
    }
    label454:
    label465:
    label571:
    int i7;
    int i6;
    for (;;)
    {
      if (i3 > 0)
      {
        i1 = i4 + 0;
        i1 += i3;
        break;
        i2 = View.MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - (this.x.left + this.x.right), Integer.MIN_VALUE);
        break label400;
        i2 = View.MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - (this.x.left + this.x.right), 1073741824);
        break label400;
        i1 += i3;
        if ((i5 > 0) && (localObject != null))
        {
          localObject = null;
          i7 = 0;
          int i9 = localListAdapter.getCount();
          i6 = 0;
          label587:
          i3 = i1;
          if (i6 >= i9) {
            continue;
          }
          i3 = localListAdapter.getItemViewType(i6);
          if (i3 == i7) {
            break label1069;
          }
          localObject = null;
          label617:
          localObject = localListAdapter.getView(i6, (View)localObject, localyf);
          ViewGroup.LayoutParams localLayoutParams = ((View)localObject).getLayoutParams();
          if ((localLayoutParams == null) || (localLayoutParams.height <= 0)) {
            break label709;
          }
          i7 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
          label660:
          ((View)localObject).measure(i2, i7);
          if (i6 <= 0) {
            break label1076;
          }
          i1 += i5;
        }
      }
    }
    label709:
    label729:
    label759:
    label765:
    label771:
    label803:
    label824:
    label835:
    label846:
    label1018:
    label1069:
    label1076:
    for (;;)
    {
      i1 = ((View)localObject).getMeasuredHeight() + i1;
      if (i1 >= i8)
      {
        i3 = i8;
        break label454;
        i5 = 0;
        break label571;
        i7 = View.MeasureSpec.makeMeasureSpec(0, 0);
        break label660;
      }
      i6++;
      i7 = i3;
      break label587;
      if (this.l == -2)
      {
        i2 = this.g.getWidth();
        break;
      }
      i2 = this.l;
      break;
      i1 = -1;
      break label273;
      i3 = 0;
      break label294;
      localObject = this.b;
      if (this.l == -1) {}
      for (i3 = -1;; i3 = 0)
      {
        ((PopupWindow)localObject).setWindowLayoutMode(i3, -1);
        break;
      }
      if (this.k == -2) {
        break label301;
      }
      i1 = this.k;
      break label301;
      if (this.l == -1)
      {
        i2 = -1;
        if (this.k != -1) {
          break label1018;
        }
        i1 = -1;
        this.b.setWindowLayoutMode(i2, i1);
        if (a == null) {}
      }
      try
      {
        a.invoke(this.b, new Object[] { Boolean.valueOf(true) });
        this.b.setOutsideTouchable(true);
        this.b.setTouchInterceptor(this.t);
        ln.a(this.b, this.g, this.m, this.n, this.d);
        this.c.setSelection(-1);
        if ((!this.y) || (this.c.isInTouchMode())) {
          d();
        }
        if (this.y) {
          break label332;
        }
        this.w.post(this.v);
        break label332;
        if (this.l == -2)
        {
          this.b.setWidth(this.g.getWidth());
          break label835;
        }
        this.b.setWidth(this.l);
        break label835;
        if (this.k == -2)
        {
          this.b.setHeight(i1);
          i1 = 0;
          break label846;
        }
        this.b.setHeight(this.k);
        i1 = 0;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      i1 = 0;
      break label465;
      i3 = i7;
      break label617;
    }
  }
  
  public final void d()
  {
    yf localyf = this.c;
    if (localyf != null)
    {
      yf.a(localyf, true);
      localyf.requestLayout();
    }
  }
  
  public final boolean e()
  {
    if (this.b.getInputMethodMode() == 2) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
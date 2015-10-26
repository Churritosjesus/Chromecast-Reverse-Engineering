import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;

public class qn
  implements View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, qp
{
  static final int a = a.bN;
  public View b;
  public yc c;
  public qq d;
  public boolean e;
  public int f = 0;
  private final Context g;
  private final LayoutInflater h;
  private final qa i;
  private final qo j;
  private final boolean k;
  private final int l;
  private final int m;
  private final int n;
  private ViewTreeObserver o;
  private ViewGroup p;
  private boolean q;
  private int r;
  
  public qn(Context paramContext, qa paramqa, View paramView)
  {
    this(paramContext, paramqa, paramView, false, a.L);
  }
  
  public qn(Context paramContext, qa paramqa, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paramqa, paramView, paramBoolean, paramInt, 0);
  }
  
  public qn(Context paramContext, qa paramqa, View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.g = paramContext;
    this.h = LayoutInflater.from(paramContext);
    this.i = paramqa;
    this.j = new qo(this, this.i);
    this.k = paramBoolean;
    this.m = paramInt1;
    this.n = paramInt2;
    Resources localResources = paramContext.getResources();
    this.l = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(a.ab));
    this.b = paramView;
    paramqa.a(this, paramContext);
  }
  
  public final void a(Context paramContext, qa paramqa) {}
  
  public final void a(qa paramqa, boolean paramBoolean)
  {
    if (paramqa != this.i) {}
    for (;;)
    {
      return;
      d();
      if (this.d != null) {
        this.d.a(paramqa, paramBoolean);
      }
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(qu paramqu)
  {
    boolean bool2 = true;
    qn localqn;
    int i1;
    if (paramqu.hasVisibleItems())
    {
      localqn = new qn(this.g, paramqu, this.b);
      localqn.d = this.d;
      int i2 = paramqu.size();
      i1 = 0;
      if (i1 >= i2) {
        break label133;
      }
      MenuItem localMenuItem = paramqu.getItem(i1);
      if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null)) {}
    }
    label133:
    for (boolean bool1 = true;; bool1 = false)
    {
      localqn.e = bool1;
      if (localqn.c())
      {
        bool1 = bool2;
        if (this.d != null) {
          this.d.a_(paramqu);
        }
      }
      for (bool1 = bool2;; bool1 = false)
      {
        return bool1;
        i1++;
        break;
      }
    }
  }
  
  public final void b()
  {
    if (!c()) {
      throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    this.q = false;
    if (this.j != null) {
      this.j.notifyDataSetChanged();
    }
  }
  
  public final boolean b(qe paramqe)
  {
    return false;
  }
  
  public final boolean c()
  {
    boolean bool = true;
    int i4 = 0;
    this.c = new yc(this.g, null, this.m, this.n);
    this.c.a(this);
    this.c.h = this;
    this.c.a(this.j);
    this.c.a(true);
    View localView = this.b;
    int i1;
    int i2;
    if (localView != null) {
      if (this.o == null)
      {
        i1 = 1;
        this.o = localView.getViewTreeObserver();
        if (i1 != 0) {
          this.o.addOnGlobalLayoutListener(this);
        }
        this.c.g = localView;
        this.c.d = this.f;
        if (!this.q)
        {
          qo localqo = this.j;
          int i7 = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i6 = localqo.getCount();
          i2 = 0;
          int i3 = 0;
          localView = null;
          i1 = i4;
          i4 = i1;
          if (i2 < i6)
          {
            i4 = localqo.getItemViewType(i2);
            if (i4 == i3) {
              break label345;
            }
            i3 = i4;
            localView = null;
            label200:
            if (this.p == null) {
              this.p = new FrameLayout(this.g);
            }
            localView = localqo.getView(i2, localView, this.p);
            localView.measure(i7, i5);
            i4 = localView.getMeasuredWidth();
            if (i4 < this.l) {
              break label330;
            }
            i4 = this.l;
          }
          this.r = i4;
          this.q = true;
        }
        this.c.a(this.r);
        this.c.b.setInputMethodMode(2);
        this.c.c();
        this.c.c.setOnKeyListener(this);
      }
    }
    for (;;)
    {
      return bool;
      i1 = 0;
      break;
      bool = false;
    }
    label330:
    if (i4 > i1) {
      i1 = i4;
    }
    for (;;)
    {
      i2++;
      break;
      label345:
      break label200;
    }
  }
  
  public final boolean c(qe paramqe)
  {
    return false;
  }
  
  public final void d()
  {
    if (e()) {
      this.c.a();
    }
  }
  
  public final boolean e()
  {
    if ((this.c != null) && (this.c.b.isShowing())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void onDismiss()
  {
    this.c = null;
    this.i.close();
    if (this.o != null)
    {
      if (!this.o.isAlive()) {
        this.o = this.b.getViewTreeObserver();
      }
      this.o.removeGlobalOnLayoutListener(this);
      this.o = null;
    }
  }
  
  public void onGlobalLayout()
  {
    if (e())
    {
      View localView = this.b;
      if ((localView != null) && (localView.isShown())) {
        break label28;
      }
      d();
    }
    for (;;)
    {
      return;
      label28:
      if (e()) {
        this.c.c();
      }
    }
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.j;
    qo.a(paramAdapterView).a(paramAdapterView.a(paramInt), null, 0);
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82)) {
      d();
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
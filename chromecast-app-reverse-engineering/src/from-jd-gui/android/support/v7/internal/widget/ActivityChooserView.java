package android.support.v7.internal.widget;

import a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import fb;
import oq;
import rl;
import rr;
import rs;
import rt;
import ru;
import rv;
import rw;
import xu;
import yc;

public final class ActivityChooserView
  extends ViewGroup
{
  public final rv a;
  public final ImageView b;
  public fb c;
  public int d;
  private final rw e;
  private final xu f;
  private final Drawable g;
  private final FrameLayout h;
  private final FrameLayout i;
  private final ImageView j;
  private final int k;
  private final DataSetObserver l = new rr(this);
  private final ViewTreeObserver.OnGlobalLayoutListener m = new rs(this);
  private yc n;
  private boolean o;
  private int p = 4;
  private boolean q;
  
  public ActivityChooserView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    Object localObject = paramContext.obtainStyledAttributes(paramAttributeSet, oq.E, 0, 0);
    this.p = ((TypedArray)localObject).getInt(oq.G, 4);
    paramAttributeSet = ((TypedArray)localObject).getDrawable(oq.F);
    ((TypedArray)localObject).recycle();
    LayoutInflater.from(getContext()).inflate(a.bF, this, true);
    this.e = new rw(this);
    this.f = ((xu)findViewById(a.aX));
    this.g = this.f.getBackground();
    this.i = ((FrameLayout)findViewById(a.be));
    this.i.setOnClickListener(this.e);
    this.i.setOnLongClickListener(this.e);
    this.j = ((ImageView)this.i.findViewById(a.bi));
    localObject = (FrameLayout)findViewById(a.bg);
    ((FrameLayout)localObject).setOnClickListener(this.e);
    ((FrameLayout)localObject).setOnTouchListener(new rt(this, (View)localObject));
    this.h = ((FrameLayout)localObject);
    this.b = ((ImageView)((FrameLayout)localObject).findViewById(a.bi));
    this.b.setImageDrawable(paramAttributeSet);
    this.a = new rv(this);
    this.a.registerDataSetObserver(new ru(this));
    paramContext = paramContext.getResources();
    this.k = Math.max(paramContext.getDisplayMetrics().widthPixels / 2, paramContext.getDimensionPixelSize(a.ab));
  }
  
  private void a(int paramInt)
  {
    if (this.a.a == null) {
      throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }
    getViewTreeObserver().addOnGlobalLayoutListener(this.m);
    boolean bool;
    int i1;
    label63:
    label95:
    yc localyc;
    if (this.i.getVisibility() == 0)
    {
      bool = true;
      int i2 = this.a.a.a();
      if (!bool) {
        break label193;
      }
      i1 = 1;
      if ((paramInt == Integer.MAX_VALUE) || (i2 <= i1 + paramInt)) {
        break label198;
      }
      this.a.a(true);
      this.a.a(paramInt - 1);
      localyc = d();
      if (!localyc.b.isShowing())
      {
        if ((!this.o) && (bool)) {
          break label217;
        }
        this.a.a(true, bool);
      }
    }
    for (;;)
    {
      localyc.a(Math.min(this.a.a(), this.k));
      localyc.c();
      if (this.c != null) {
        this.c.a(true);
      }
      localyc.c.setContentDescription(getContext().getString(a.bV));
      return;
      bool = false;
      break;
      label193:
      i1 = 0;
      break label63;
      label198:
      this.a.a(false);
      this.a.a(paramInt);
      break label95;
      label217:
      this.a.a(false, false);
    }
  }
  
  private yc d()
  {
    if (this.n == null)
    {
      this.n = new yc(getContext());
      this.n.a(this.a);
      this.n.g = this;
      this.n.a(true);
      this.n.h = this.e;
      this.n.a(this.e);
    }
    return this.n;
  }
  
  public final boolean a()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (!d().b.isShowing()) {
      if (this.q) {
        break label28;
      }
    }
    for (bool1 = bool2;; bool1 = true)
    {
      return bool1;
      label28:
      this.o = false;
      a(this.p);
    }
  }
  
  public final boolean b()
  {
    if (d().b.isShowing())
    {
      d().a();
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      if (localViewTreeObserver.isAlive()) {
        localViewTreeObserver.removeGlobalOnLayoutListener(this.m);
      }
    }
    return true;
  }
  
  public final boolean c()
  {
    return d().b.isShowing();
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    rl localrl = this.a.a;
    if (localrl != null) {
      localrl.registerObserver(this.l);
    }
    this.q = true;
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = this.a.a;
    if (localObject != null) {
      ((rl)localObject).unregisterObserver(this.l);
    }
    localObject = getViewTreeObserver();
    if (((ViewTreeObserver)localObject).isAlive()) {
      ((ViewTreeObserver)localObject).removeGlobalOnLayoutListener(this.m);
    }
    if (c()) {
      b();
    }
    this.q = false;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.f.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    if (!c()) {
      b();
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    xu localxu = this.f;
    int i1 = paramInt2;
    if (this.i.getVisibility() != 0) {
      i1 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824);
    }
    measureChild(localxu, paramInt1, i1);
    setMeasuredDimension(localxu.getMeasuredWidth(), localxu.getMeasuredHeight());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\internal\widget\ActivityChooserView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
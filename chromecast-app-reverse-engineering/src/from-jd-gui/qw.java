import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public class qw
  extends ViewGroup
{
  private static final Interpolator g = new DecelerateInterpolator();
  public final Context a;
  public ActionMenuView b;
  public vu c;
  public ViewGroup d;
  public int e;
  public ih f;
  private qx h = new qx(this);
  
  qw(Context paramContext)
  {
    this(paramContext, null);
  }
  
  qw(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public qw(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = new TypedValue();
    if ((paramContext.getTheme().resolveAttribute(a.g, paramAttributeSet, true)) && (paramAttributeSet.resourceId != 0)) {}
    for (this.a = new ContextThemeWrapper(paramContext, paramAttributeSet.resourceId);; this.a = paramContext) {
      return;
    }
  }
  
  public static int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramInt1 -= paramInt2;
    }
    for (;;)
    {
      return paramInt1;
      paramInt1 += paramInt2;
    }
  }
  
  public static int a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, Integer.MIN_VALUE), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth());
  }
  
  public static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 = (paramInt3 - j) / 2 + paramInt2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    }
    for (;;)
    {
      paramInt1 = i;
      if (paramBoolean) {
        paramInt1 = -i;
      }
      return paramInt1;
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    }
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
    requestLayout();
  }
  
  public boolean a()
  {
    if (this.c != null) {}
    for (boolean bool = this.c.b();; bool = false) {
      return bool;
    }
  }
  
  public void b(int paramInt)
  {
    if (this.f != null) {
      this.f.a();
    }
    ih localih;
    if (paramInt == 0)
    {
      if (getVisibility() != 0) {
        gt.c(this, 0.0F);
      }
      localih = gt.o(this).a(1.0F);
      localih.a(200L);
      localih.a(g);
      localih.a(this.h.a(localih, paramInt));
      localih.b();
    }
    for (;;)
    {
      return;
      localih = gt.o(this).a(0.0F);
      localih.a(200L);
      localih.a(g);
      localih.a(this.h.a(localih, paramInt));
      localih.b();
    }
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    paramConfiguration = getContext().obtainStyledAttributes(null, oq.a, a.i, 0);
    a(paramConfiguration.getLayoutDimension(oq.j, 0));
    paramConfiguration.recycle();
    if (this.c != null)
    {
      paramConfiguration = this.c;
      if (!paramConfiguration.h) {
        paramConfiguration.g = paramConfiguration.b.getResources().getInteger(a.bA);
      }
      if (paramConfiguration.c != null) {
        paramConfiguration.c.b(true);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
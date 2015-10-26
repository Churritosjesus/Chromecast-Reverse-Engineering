import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

public final class sb
  extends PopupWindow
{
  private final boolean a;
  
  public sb(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = th.a(paramContext, paramAttributeSet, oq.aT, paramInt, 0);
    this.a = paramContext.a(oq.aV, false);
    setBackgroundDrawable(paramContext.a(oq.aU));
    paramContext.a.recycle();
    if (Build.VERSION.SDK_INT < 14) {}
    try
    {
      paramContext = PopupWindow.class.getDeclaredField("mAnchor");
      paramContext.setAccessible(true);
      paramAttributeSet = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
      paramAttributeSet.setAccessible(true);
      ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener)paramAttributeSet.get(this);
      sc localsc = new sc;
      localsc.<init>(paramContext, this, localOnScrollChangedListener);
      paramAttributeSet.set(this, localsc);
      return;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  public final void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (Build.VERSION.SDK_INT < 21)
    {
      i = paramInt2;
      if (this.a) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i);
  }
  
  @TargetApi(19)
  public final void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    if (Build.VERSION.SDK_INT < 21)
    {
      i = paramInt2;
      if (this.a) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }
  
  public final void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((Build.VERSION.SDK_INT < 21) && (this.a)) {
      paramInt2 -= paramView.getHeight();
    }
    for (;;)
    {
      super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
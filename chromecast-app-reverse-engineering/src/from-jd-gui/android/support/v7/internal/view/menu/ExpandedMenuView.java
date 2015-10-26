package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import qa;
import qc;
import qe;
import qr;
import th;

public final class ExpandedMenuView
  extends ListView
  implements AdapterView.OnItemClickListener, qc, qr
{
  private static final int[] a = { 16842964, 16843049 };
  private qa b;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    paramContext = th.a(paramContext, paramAttributeSet, a, paramInt, 0);
    if (paramContext.d(0)) {
      setBackgroundDrawable(paramContext.a(0));
    }
    if (paramContext.d(1)) {
      setDivider(paramContext.a(1));
    }
    paramContext.a.recycle();
  }
  
  public final void a(qa paramqa)
  {
    this.b = paramqa;
  }
  
  public final boolean a(qe paramqe)
  {
    return this.b.a(paramqe, null, 0);
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a((qe)getAdapter().getItem(paramInt));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\internal\view\menu\ExpandedMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
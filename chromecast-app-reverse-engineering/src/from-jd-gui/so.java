import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

final class so
  extends BaseAdapter
{
  so(sm paramsm) {}
  
  public final int getCount()
  {
    return sm.a(this.a).getChildCount();
  }
  
  public final Object getItem(int paramInt)
  {
    return ((sq)sm.a(this.a).getChildAt(paramInt)).a;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = sm.a(this.a, (ml)getItem(paramInt), true);
    }
    for (;;)
    {
      return paramView;
      paramViewGroup = (sq)paramView;
      paramViewGroup.a = ((ml)getItem(paramInt));
      paramViewGroup.a();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\so.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
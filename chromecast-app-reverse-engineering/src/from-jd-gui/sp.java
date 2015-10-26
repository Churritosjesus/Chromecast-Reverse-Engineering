import android.view.View;
import android.view.View.OnClickListener;

final class sp
  implements View.OnClickListener
{
  sp(sm paramsm) {}
  
  public final void onClick(View paramView)
  {
    int j = sm.a(this.a).getChildCount();
    int i = 0;
    if (i < j)
    {
      View localView = sm.a(this.a).getChildAt(i);
      if (localView == paramView) {}
      for (boolean bool = true;; bool = false)
      {
        localView.setSelected(bool);
        i++;
        break;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
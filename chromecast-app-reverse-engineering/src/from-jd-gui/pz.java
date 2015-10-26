import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class pz
  extends BaseAdapter
{
  private int a = -1;
  
  public pz(py parampy)
  {
    a();
  }
  
  private void a()
  {
    qe localqe = this.b.b.i;
    int i;
    if (localqe != null)
    {
      ArrayList localArrayList = this.b.b.j();
      int j = localArrayList.size();
      i = 0;
      if (i < j) {
        if ((qe)localArrayList.get(i) != localqe) {}
      }
    }
    for (this.a = i;; this.a = -1)
    {
      return;
      i++;
      break;
    }
  }
  
  public final qe a(int paramInt)
  {
    ArrayList localArrayList = this.b.b.j();
    int i = py.a(this.b) + paramInt;
    paramInt = i;
    if (this.a >= 0)
    {
      paramInt = i;
      if (i >= this.a) {
        paramInt = i + 1;
      }
    }
    return (qe)localArrayList.get(paramInt);
  }
  
  public final int getCount()
  {
    int i = this.b.b.j().size() - py.a(this.b);
    if (this.a < 0) {}
    for (;;)
    {
      return i;
      i--;
    }
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = this.b.a.inflate(this.b.c, paramViewGroup, false);
    }
    for (;;)
    {
      ((qs)paramView).a(a(paramInt), 0);
      return paramView;
    }
  }
  
  public final void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
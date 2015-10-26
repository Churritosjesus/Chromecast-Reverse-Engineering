import android.support.v7.internal.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class qo
  extends BaseAdapter
{
  private qa a;
  private int b = -1;
  
  public qo(qn paramqn, qa paramqa)
  {
    this.a = paramqa;
    a();
  }
  
  private void a()
  {
    qe localqe = qn.c(this.c).i;
    int i;
    if (localqe != null)
    {
      ArrayList localArrayList = qn.c(this.c).j();
      int j = localArrayList.size();
      i = 0;
      if (i < j) {
        if ((qe)localArrayList.get(i) != localqe) {}
      }
    }
    for (this.b = i;; this.b = -1)
    {
      return;
      i++;
      break;
    }
  }
  
  public final qe a(int paramInt)
  {
    if (qn.a(this.c)) {}
    for (ArrayList localArrayList = this.a.j();; localArrayList = this.a.h())
    {
      int i = paramInt;
      if (this.b >= 0)
      {
        i = paramInt;
        if (paramInt >= this.b) {
          i = paramInt + 1;
        }
      }
      return (qe)localArrayList.get(i);
    }
  }
  
  public final int getCount()
  {
    ArrayList localArrayList;
    if (qn.a(this.c))
    {
      localArrayList = this.a.j();
      if (this.b >= 0) {
        break label43;
      }
    }
    label43:
    for (int i = localArrayList.size();; i = localArrayList.size() - 1)
    {
      return i;
      localArrayList = this.a.h();
      break;
    }
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = qn.b(this.c).inflate(qn.a, paramViewGroup, false);
    }
    for (;;)
    {
      paramViewGroup = (qs)paramView;
      if (this.c.e)
      {
        ListMenuItemView localListMenuItemView = (ListMenuItemView)paramView;
        localListMenuItemView.b = true;
        localListMenuItemView.a = true;
      }
      paramViewGroup.a(a(paramInt), 0);
      return paramView;
    }
  }
  
  public final void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
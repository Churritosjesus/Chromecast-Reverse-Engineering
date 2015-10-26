import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

final class sv
  implements ListAdapter, SpinnerAdapter
{
  private SpinnerAdapter a;
  private ListAdapter b;
  
  public sv(SpinnerAdapter paramSpinnerAdapter)
  {
    this.a = paramSpinnerAdapter;
    if ((paramSpinnerAdapter instanceof ListAdapter)) {
      this.b = ((ListAdapter)paramSpinnerAdapter);
    }
  }
  
  public final boolean areAllItemsEnabled()
  {
    ListAdapter localListAdapter = this.b;
    if (localListAdapter != null) {}
    for (boolean bool = localListAdapter.areAllItemsEnabled();; bool = true) {
      return bool;
    }
  }
  
  public final int getCount()
  {
    if (this.a == null) {}
    for (int i = 0;; i = this.a.getCount()) {
      return i;
    }
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.a == null) {}
    for (paramView = null;; paramView = this.a.getDropDownView(paramInt, paramView, paramViewGroup)) {
      return paramView;
    }
  }
  
  public final Object getItem(int paramInt)
  {
    if (this.a == null) {}
    for (Object localObject = null;; localObject = this.a.getItem(paramInt)) {
      return localObject;
    }
  }
  
  public final long getItemId(int paramInt)
  {
    if (this.a == null) {}
    for (long l = -1L;; l = this.a.getItemId(paramInt)) {
      return l;
    }
  }
  
  public final int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return getDropDownView(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 1;
  }
  
  public final boolean hasStableIds()
  {
    if ((this.a != null) && (this.a.hasStableIds())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean isEmpty()
  {
    if (getCount() == 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean isEnabled(int paramInt)
  {
    ListAdapter localListAdapter = this.b;
    if (localListAdapter != null) {}
    for (boolean bool = localListAdapter.isEnabled(paramInt);; bool = true) {
      return bool;
    }
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.a != null) {
      this.a.registerDataSetObserver(paramDataSetObserver);
    }
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.a != null) {
      this.a.unregisterDataSetObserver(paramDataSetObserver);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
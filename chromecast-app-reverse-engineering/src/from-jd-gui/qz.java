import android.util.SparseArray;
import android.view.View;

final class qz
{
  private final SparseArray a = new SparseArray();
  
  qz(qy paramqy) {}
  
  final View a(int paramInt)
  {
    View localView = (View)this.a.get(paramInt);
    if (localView != null) {
      this.a.delete(paramInt);
    }
    return localView;
  }
  
  final void a()
  {
    SparseArray localSparseArray = this.a;
    int j = localSparseArray.size();
    for (int i = 0; i < j; i++)
    {
      View localView = (View)localSparseArray.valueAt(i);
      if (localView != null) {
        qy.a(this.b, localView, true);
      }
    }
    localSparseArray.clear();
  }
  
  public final void a(int paramInt, View paramView)
  {
    this.a.put(paramInt, paramView);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
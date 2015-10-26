import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public abstract class gn
{
  public DataSetObservable a = new DataSetObservable();
  
  public abstract int a();
  
  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
  }
  
  public final void a(DataSetObserver paramDataSetObserver)
  {
    this.a.registerObserver(paramDataSetObserver);
  }
  
  public void a(ViewGroup paramViewGroup) {}
  
  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException("Required method destroyItem was not overridden");
  }
  
  public abstract boolean a(View paramView, Object paramObject);
  
  public CharSequence b(int paramInt)
  {
    return null;
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\gn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
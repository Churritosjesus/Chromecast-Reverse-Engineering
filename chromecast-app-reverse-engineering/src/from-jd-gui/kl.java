import android.database.DataSetObserver;

final class kl
  extends DataSetObserver
{
  kl(kj paramkj) {}
  
  public final void onChanged()
  {
    this.a.a = true;
    this.a.notifyDataSetChanged();
  }
  
  public final void onInvalidated()
  {
    this.a.a = false;
    this.a.notifyDataSetInvalidated();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\kl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
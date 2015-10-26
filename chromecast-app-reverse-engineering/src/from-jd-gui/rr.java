import android.database.DataSetObserver;
import android.support.v7.internal.widget.ActivityChooserView;

public final class rr
  extends DataSetObserver
{
  public rr(ActivityChooserView paramActivityChooserView) {}
  
  public final void onChanged()
  {
    super.onChanged();
    ActivityChooserView.a(this.a).notifyDataSetChanged();
  }
  
  public final void onInvalidated()
  {
    super.onInvalidated();
    ActivityChooserView.a(this.a).notifyDataSetInvalidated();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
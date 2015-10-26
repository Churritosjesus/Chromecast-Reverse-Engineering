import android.database.DataSetObserver;
import android.support.v7.internal.widget.ActivityChooserView;

public final class ru
  extends DataSetObserver
{
  public ru(ActivityChooserView paramActivityChooserView) {}
  
  public final void onChanged()
  {
    super.onChanged();
    ActivityChooserView.c(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
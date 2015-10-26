import android.database.DataSetObserver;
import android.widget.PopupWindow;

final class yk
  extends DataSetObserver
{
  yk(yc paramyc) {}
  
  public final void onChanged()
  {
    if (this.a.b.isShowing()) {
      this.a.c();
    }
  }
  
  public final void onInvalidated()
  {
    this.a.a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public final class na
  implements AdapterView.OnItemClickListener
{
  public na(mz parammz, mx parammx) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.b.i.onClick(this.a.b, paramInt);
    this.a.b.dismiss();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\na.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
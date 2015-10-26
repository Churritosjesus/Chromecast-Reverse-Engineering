import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListPopupWindow;

final class ach
  implements AdapterView.OnItemClickListener
{
  ach(acb paramacb) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    acb.c(this.a).setOnItemClickListener(null);
    this.a.a(acb.d(this.a), ((aby)paramAdapterView.getAdapter()).a(paramInt));
    paramAdapterView = Message.obtain(acb.e(this.a), acb.h());
    paramAdapterView.obj = acb.c(this.a);
    acb.e(this.a).sendMessageDelayed(paramAdapterView, 300L);
    this.a.clearComposingText();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ach.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
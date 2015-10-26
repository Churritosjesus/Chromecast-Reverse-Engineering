import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class box
  implements AdapterView.OnItemSelectedListener
{
  box(bos parambos) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    bos.b(this.a);
    if (paramInt != bos.e(this.a)) {
      bos.a(this.a, null);
    }
    this.a.a(bos.f(this.a));
    bos.a(this.a);
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView)
  {
    bos.b(this.a);
    bos.a(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\box.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

final class of
  extends ArrayAdapter
  implements AdapterView.OnItemClickListener
{
  private final LayoutInflater a;
  
  public of(od paramod, Context paramContext, List paramList)
  {
    super(paramContext, 0, paramList);
    this.a = LayoutInflater.from(paramContext);
  }
  
  public final boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramView;
    if (paramView == null) {
      localView = this.a.inflate(a.cm, paramViewGroup, false);
    }
    paramView = (uh)getItem(paramInt);
    Object localObject = (TextView)localView.findViewById(16908308);
    paramViewGroup = (TextView)localView.findViewById(16908309);
    ((TextView)localObject).setText(paramView.c);
    localObject = paramView.d;
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      paramViewGroup.setVisibility(8);
      paramViewGroup.setText("");
    }
    for (;;)
    {
      localView.setEnabled(paramView.e);
      return localView;
      paramViewGroup.setVisibility(0);
      paramViewGroup.setText((CharSequence)localObject);
    }
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return ((uh)getItem(paramInt)).e;
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (uh)getItem(paramInt);
    if (paramAdapterView.e)
    {
      paramAdapterView.c();
      this.b.dismiss();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\of.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public final class bop
  extends ArrayAdapter
{
  public bop(Context paramContext, List paramList)
  {
    super(paramContext, a.gP, paramList);
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(a.gP, null);
    }
    paramView = (bdb)getItem(paramInt);
    ((TextView)paramViewGroup.findViewById(f.ce)).setText(paramView.b);
    TextView localTextView = (TextView)paramViewGroup.findViewById(f.cx);
    paramInt = paramView.c;
    localTextView.setText(getContext().getResources().getString(b.bB, new Object[] { Integer.valueOf(paramInt / 60), Integer.valueOf(Math.abs(paramInt) % 60) }));
    return paramViewGroup;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(a.gJ, null);
    }
    for (;;)
    {
      paramViewGroup = (bdb)getItem(paramInt);
      ((TextView)paramView).setText(paramViewGroup.b);
      return paramView;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
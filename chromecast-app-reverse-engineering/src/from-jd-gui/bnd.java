import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

final class bnd
  extends ArrayAdapter
{
  bnd(bmu parambmu, Context paramContext, int paramInt, List paramList)
  {
    super(paramContext, paramInt, paramList);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ast localast = (ast)this.a.d.get(paramInt);
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = LayoutInflater.from(this.a.h).inflate(a.fx, null);
    }
    ((TextView)paramViewGroup.findViewById(f.aE)).setText(localast.c);
    ((TextView)paramViewGroup.findViewById(f.h)).setText(this.a.h.getString(b.O, new Object[] { android.text.format.DateFormat.getDateFormat(this.a.h).format(Long.valueOf(localast.d)) }));
    ((ImageView)paramViewGroup.findViewById(f.er)).setContentDescription(this.a.h.getString(b.ak, new Object[] { localast.c }));
    paramViewGroup.setOnClickListener(new bne(this, localast));
    return paramViewGroup;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bnd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

final class bnb
  extends ArrayAdapter
{
  bnb(bmu parambmu, Context paramContext, int paramInt, List paramList, bny parambny)
  {
    super(paramContext, paramInt, paramList);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    aow localaow = (aow)this.b.c.get(paramInt);
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = LayoutInflater.from(this.b.h).inflate(a.gc, null);
    }
    ((TextView)paramViewGroup.findViewById(f.aE)).setText(localaow.g());
    paramViewGroup.setOnClickListener(new bnc(this, localaow));
    return paramViewGroup;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bnb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public final class bar
  extends ArrayAdapter
{
  private final LayoutInflater a;
  
  public bar(Context paramContext, List paramList)
  {
    super(paramContext, a.fY, paramList);
    this.a = LayoutInflater.from(paramContext);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = this.a.inflate(a.fY, null);
      paramViewGroup = new bas(paramView);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      bat localbat = (bat)getItem(paramInt);
      paramViewGroup.a.setText(localbat.g);
      if (localbat.f != 0)
      {
        paramViewGroup = paramViewGroup.b;
        paramViewGroup.setVisibility(0);
        paramViewGroup.setImageResource(localbat.f);
      }
      return paramView;
      paramViewGroup = (bas)paramView.getTag();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;

final class bnu
  extends zr
{
  TextView k;
  ListView l;
  View m;
  boolean n = false;
  
  public bnu(bmu parambmu, View paramView)
  {
    super(paramView);
    this.k = ((TextView)paramView.findViewById(f.au));
    this.l = ((ListView)paramView.findViewById(f.bs));
    this.m = paramView.findViewById(f.aQ);
    this.l.setVisibility(0);
    paramView = new LinearLayout.LayoutParams(parambmu.j, 0);
    this.l.setLayoutParams(paramView);
    this.k.setOnClickListener(new bnv(this, parambmu));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bnu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
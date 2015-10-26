import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.chromecast.app.widget.ReusableImageView;

public final class axy
  extends zr
{
  TextView k;
  ReusableImageView l;
  RecyclerView m;
  Button n;
  final xw o;
  
  public axy(View paramView)
  {
    super(paramView);
    this.l = ((ReusableImageView)paramView.findViewById(f.dg));
    this.k = ((TextView)paramView.findViewById(f.dh));
    this.n = ((Button)paramView.findViewById(f.cy));
    this.m = ((RecyclerView)paramView.findViewById(f.am));
    this.o = new xw(paramView.getContext());
    this.o.a(0);
    this.m.a(this.o);
    int i = paramView.getResources().getDimensionPixelSize(a.dH);
    this.m.a(new axz(this, i));
    this.m.a(new xe());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\axy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
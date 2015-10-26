import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.chromecast.app.widget.ReusableImageView;

public final class bgh
  extends zr
{
  final bgk k;
  ReusableImageView l;
  TextView m;
  RecyclerView n;
  Button o;
  
  public bgh(bgk parambgk, View paramView)
  {
    super(paramView);
    this.k = parambgk;
    this.l = ((ReusableImageView)paramView.findViewById(f.dN));
    this.m = ((TextView)paramView.findViewById(f.dO));
    this.o = ((Button)paramView.findViewById(f.et));
    this.n = ((RecyclerView)paramView.findViewById(f.am));
    parambgk = new xw(paramView.getContext());
    parambgk.a(0);
    this.n.a(parambgk);
    int i = paramView.getResources().getDimensionPixelSize(a.dH);
    this.n.a(new bgi(this, i));
    this.n.a(new xe());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bgh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
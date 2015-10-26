import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.chromecast.app.widget.ReusableImageView;

public final class bch
  extends zr
{
  public final ReusableImageView k;
  public final int l;
  public final int m;
  public final yt n;
  public final ImageView o;
  public final TextView p;
  public final View q;
  
  public bch(View paramView, int paramInt1, int paramInt2)
  {
    super(paramView);
    this.k = ((ReusableImageView)paramView.findViewById(f.cv));
    this.q = paramView.findViewById(f.cJ);
    this.n = new yt(paramView.getContext(), this.q, 5);
    yt localyt = this.n;
    int i = a.hb;
    new pm(localyt.a).inflate(i, localyt.b);
    this.o = ((ImageView)paramView.findViewById(f.ax));
    this.p = ((TextView)paramView.findViewById(f.aE));
    this.l = paramInt1;
    this.m = paramInt2;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
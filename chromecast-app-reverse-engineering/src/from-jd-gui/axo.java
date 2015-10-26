import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.chromecast.app.widget.ReusableImageView;

public final class axo
  extends zr
{
  final Context k;
  final ReusableImageView l;
  final TextView m;
  final TextView n;
  final TextView o;
  final TextView p;
  final TextView q;
  final int r;
  private final blp s = new blp("ContentThumbnailViewHolder");
  
  public axo(Context paramContext, View paramView, int paramInt1, int paramInt2)
  {
    super(paramView);
    this.k = paramContext;
    this.m = ((TextView)paramView.findViewById(f.em));
    this.n = ((TextView)paramView.findViewById(f.ed));
    this.o = ((TextView)paramView.findViewById(f.ee));
    this.p = ((TextView)paramView.findViewById(f.v));
    this.l = ((ReusableImageView)paramView.findViewById(f.al));
    this.q = ((TextView)paramView.findViewById(f.aZ));
    paramContext = paramView.getLayoutParams();
    paramContext.height = paramInt2;
    paramView.setLayoutParams(paramContext);
    this.r = paramInt1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\axo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.TextView;

final class bhe
  implements ViewTreeObserver.OnPreDrawListener
{
  bhe(bhd parambhd, ImageView paramImageView) {}
  
  public final boolean onPreDraw()
  {
    int i = this.a.getMeasuredWidth() / 8;
    int j = this.a.getMeasuredHeight() / 4;
    bhd.a(this.b).setPadding(0, 0, i, j);
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bhe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
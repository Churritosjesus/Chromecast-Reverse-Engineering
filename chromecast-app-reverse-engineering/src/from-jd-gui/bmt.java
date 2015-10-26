import android.graphics.Bitmap;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.chromecast.app.widget.ReusableImageView;

final class bmt
  implements Runnable
{
  bmt(bms parambms, boolean paramBoolean, Bitmap paramBitmap) {}
  
  public final void run()
  {
    if ((this.a) && (!this.c.a)) {
      this.c.b.setImageBitmap(this.b);
    }
    for (;;)
    {
      return;
      this.c.b.setAlpha(0.0F);
      this.c.b.setImageBitmap(this.b);
      this.c.b.animate().alpha(1.0F).setDuration(600L);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bmt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
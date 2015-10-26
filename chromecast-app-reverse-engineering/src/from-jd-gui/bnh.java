import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.apps.chromecast.app.widget.OverlaidImageView;

final class bnh
  implements ats
{
  bnh(bmu parambmu, aow paramaow, String paramString, boc paramboc) {}
  
  public final void a(Bitmap paramBitmap)
  {
    this.a.g();
    String str = this.b;
    if (paramBitmap == null) {
      this.a.g();
    }
    for (;;)
    {
      return;
      OverlaidImageView localOverlaidImageView = this.c.n;
      str = this.b;
      if ((localOverlaidImageView.g != null) && (localOverlaidImageView.g.equals(str))) {
        if (TextUtils.equals(localOverlaidImageView.i, str))
        {
          localOverlaidImageView.c = paramBitmap;
          localOverlaidImageView.invalidate();
        }
        else
        {
          localOverlaidImageView.e = paramBitmap;
          if ((Build.VERSION.SDK_INT < 11) || (localOverlaidImageView.a.isRunning())) {
            localOverlaidImageView.c = paramBitmap;
          } else {
            localOverlaidImageView.a.start();
          }
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bnh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
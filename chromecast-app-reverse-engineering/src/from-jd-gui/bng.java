import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.apps.chromecast.app.widget.OverlaidImageView;

final class bng
  implements ats
{
  bng(bmu parambmu, aow paramaow, String paramString, boc paramboc) {}
  
  public final void a(Bitmap paramBitmap)
  {
    this.a.g();
    String str = this.b;
    if (paramBitmap == null) {
      this.a.g();
    }
    OverlaidImageView localOverlaidImageView;
    do
    {
      return;
      localOverlaidImageView = this.c.n;
      str = this.b;
      localOverlaidImageView.k = true;
    } while ((localOverlaidImageView.f == null) || (!localOverlaidImageView.f.equals(str)));
    if (TextUtils.equals(localOverlaidImageView.h, str)) {
      localOverlaidImageView.b = paramBitmap;
    }
    for (;;)
    {
      localOverlaidImageView.invalidate();
      break;
      localOverlaidImageView.d = paramBitmap;
      if ((Build.VERSION.SDK_INT < 11) || (localOverlaidImageView.a.isRunning())) {
        localOverlaidImageView.b = paramBitmap;
      } else {
        localOverlaidImageView.a.start();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
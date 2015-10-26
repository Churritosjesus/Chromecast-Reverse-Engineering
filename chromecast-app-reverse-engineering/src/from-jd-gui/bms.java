import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.apps.chromecast.app.widget.ReusableImageView;

public final class bms
  implements aey
{
  public bms(ReusableImageView paramReusableImageView, boolean paramBoolean) {}
  
  public final void a(aef paramaef)
  {
    if (paramaef == null) {}
    for (paramaef = "null";; paramaef = paramaef.getMessage()) {
      return;
    }
  }
  
  public final void a(aex paramaex, boolean paramBoolean)
  {
    if (!TextUtils.equals(ReusableImageView.a(this.b), paramaex.c))
    {
      paramaex = paramaex.c;
      ReusableImageView.a(this.b);
    }
    for (;;)
    {
      return;
      Bitmap localBitmap = paramaex.a;
      if (localBitmap != null)
      {
        paramaex = paramaex.c;
        this.b.post(new bmt(this, paramBoolean, localBitmap));
      }
      else
      {
        paramaex = paramaex.c;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.google.android.gms.common.api.GoogleApiClient;

public final class cqj
  extends cqp
{
  public cqj(Context paramContext, GoogleApiClient paramGoogleApiClient)
  {
    super(paramContext, paramGoogleApiClient, true);
  }
  
  public static Bitmap a(Context paramContext)
  {
    return a.a(BitmapFactory.decodeResource(paramContext.getResources(), a.hQ));
  }
  
  public final void a(ImageView paramImageView, String paramString1, String paramString2, int paramInt)
  {
    a(new cqk(this, paramImageView, paramString1, paramString2, paramInt));
  }
  
  protected final void a(cqq paramcqq, Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      paramcqq.e.setImageBitmap(a(this.a));
    }
    for (;;)
    {
      return;
      super.a(paramcqq, paramBitmap);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
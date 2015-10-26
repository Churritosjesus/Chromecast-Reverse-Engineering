import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.google.android.gms.common.api.GoogleApiClient;

public final class cqm
  extends cqp
{
  private static Bitmap c;
  
  public cqm(Context paramContext, GoogleApiClient paramGoogleApiClient)
  {
    super(paramContext, paramGoogleApiClient, false);
  }
  
  public static Bitmap a(Context paramContext)
  {
    if (c == null) {
      c = BitmapFactory.decodeResource(paramContext.getResources(), a.hP);
    }
    return c;
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


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cqm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
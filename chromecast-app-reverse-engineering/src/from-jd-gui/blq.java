import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;

public final class blq
  extends eh
  implements aew
{
  private final blp a = new blp("LruBitmapCache", false);
  
  public blq(Context paramContext)
  {
    super((paramContext.heightPixels * i << 2) / 2 * 3 / 1024);
    b();
  }
  
  public final Bitmap a(String paramString)
  {
    return (Bitmap)a(paramString);
  }
  
  public final void a(String paramString, Bitmap paramBitmap)
  {
    a(paramString, paramBitmap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\blq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
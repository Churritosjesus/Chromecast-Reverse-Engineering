import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView.ScaleType;
import java.util.HashMap;
import java.util.LinkedList;

public final class aer
{
  final aew a;
  final HashMap b = new HashMap();
  final HashMap c = new HashMap();
  Runnable d;
  private final adv e;
  private int f = 100;
  private final Handler g = new Handler(Looper.getMainLooper());
  
  public aer(adv paramadv, aew paramaew)
  {
    this.e = paramadv;
    this.a = paramaew;
  }
  
  public final aex a(String paramString, aey paramaey)
  {
    ImageView.ScaleType localScaleType = ImageView.ScaleType.CENTER_INSIDE;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
    }
    String str = paramString.length() + 12 + "#W" + 0 + "#H" + 0 + "#S" + localScaleType.ordinal() + paramString;
    Object localObject = this.a.a(str);
    if (localObject != null)
    {
      paramString = new aex(this, (Bitmap)localObject, paramString, null, null);
      paramaey.a(paramString, true);
    }
    for (;;)
    {
      return paramString;
      localObject = new aex(this, null, paramString, str, paramaey);
      paramaey.a((aex)localObject, true);
      paramaey = (aev)this.b.get(str);
      if (paramaey != null)
      {
        paramaey.c.add(localObject);
        paramString = (String)localObject;
      }
      else
      {
        paramString = new aez(paramString, new aes(this, str), 0, 0, localScaleType, Bitmap.Config.RGB_565, new aet(this, str));
        this.e.a(paramString);
        this.b.put(str, new aev(this, paramString, (aex)localObject));
        paramString = (String)localObject;
      }
    }
  }
  
  void a(String paramString, aev paramaev)
  {
    this.c.put(paramString, paramaev);
    if (this.d == null)
    {
      this.d = new aeu(this);
      this.g.postDelayed(this.d, this.f);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
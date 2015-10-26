import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;

public final class aex
{
  public Bitmap a;
  final aey b;
  public final String c;
  private final String d;
  
  public aex(aer paramaer, Bitmap paramBitmap, String paramString1, String paramString2, aey paramaey)
  {
    this.a = paramBitmap;
    this.c = paramString1;
    this.d = paramString2;
    this.b = paramaey;
  }
  
  public final void a()
  {
    if (this.b == null) {}
    for (;;)
    {
      return;
      aev localaev = (aev)this.e.b.get(this.d);
      if (localaev != null)
      {
        if (localaev.a(this)) {
          this.e.b.remove(this.d);
        }
      }
      else
      {
        localaev = (aev)this.e.c.get(this.d);
        if (localaev != null)
        {
          localaev.a(this);
          if (localaev.c.size() == 0) {
            this.e.c.remove(this.d);
          }
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
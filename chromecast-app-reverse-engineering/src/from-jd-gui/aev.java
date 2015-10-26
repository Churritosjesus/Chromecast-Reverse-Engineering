import android.graphics.Bitmap;
import java.util.LinkedList;

final class aev
{
  Bitmap a;
  aef b;
  final LinkedList c = new LinkedList();
  private final ads d;
  
  public aev(aer paramaer, ads paramads, aex paramaex)
  {
    this.d = paramads;
    this.c.add(paramaex);
  }
  
  public final boolean a(aex paramaex)
  {
    boolean bool = true;
    this.c.remove(paramaex);
    if (this.c.size() == 0) {
      this.d.g = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
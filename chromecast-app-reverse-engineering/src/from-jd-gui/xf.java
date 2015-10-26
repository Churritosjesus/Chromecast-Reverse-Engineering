import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

final class xf
  implements Runnable
{
  xf(xe paramxe, ArrayList paramArrayList) {}
  
  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (xo)localIterator.next();
      xe localxe = this.b;
      zr localzr = ((xo)localObject).a;
      int k = ((xo)localObject).b;
      int j = ((xo)localObject).c;
      int m = ((xo)localObject).d;
      int i = ((xo)localObject).e;
      localObject = localzr.a;
      k = m - k;
      i -= j;
      if (k != 0) {
        gt.o((View)localObject).b(0.0F);
      }
      if (i != 0) {
        gt.o((View)localObject).c(0.0F);
      }
      localObject = gt.o((View)localObject);
      localxe.e.add(localzr);
      ((ih)localObject).a(localxe.k).a(new xk(localxe, localzr, k, i, (ih)localObject)).b();
    }
    this.a.clear();
    this.b.b.remove(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
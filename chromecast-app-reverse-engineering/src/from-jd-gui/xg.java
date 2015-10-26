import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

final class xg
  implements Runnable
{
  xg(xe paramxe, ArrayList paramArrayList) {}
  
  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    if (localIterator.hasNext())
    {
      xn localxn = (xn)localIterator.next();
      xe localxe = this.b;
      Object localObject1 = localxn.a;
      if (localObject1 == null)
      {
        localObject1 = null;
        label47:
        localObject2 = localxn.b;
        if (localObject2 == null) {
          break label215;
        }
      }
      label215:
      for (Object localObject2 = ((zr)localObject2).a;; localObject2 = null)
      {
        if (localObject1 != null)
        {
          localObject1 = gt.o((View)localObject1).a(localxe.l);
          localxe.g.add(localxn.a);
          ((ih)localObject1).b(localxn.e - localxn.c);
          ((ih)localObject1).c(localxn.f - localxn.d);
          ((ih)localObject1).a(0.0F).a(new xl(localxe, localxn, (ih)localObject1)).b();
        }
        if (localObject2 == null) {
          break;
        }
        localObject1 = gt.o((View)localObject2);
        localxe.g.add(localxn.b);
        ((ih)localObject1).b(0.0F).c(0.0F).a(localxe.l).a(1.0F).a(new xm(localxe, localxn, (ih)localObject1, (View)localObject2)).b();
        break;
        localObject1 = ((zr)localObject1).a;
        break label47;
      }
    }
    this.a.clear();
    this.b.c.remove(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
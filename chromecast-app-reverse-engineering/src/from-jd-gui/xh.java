import java.util.ArrayList;
import java.util.Iterator;

final class xh
  implements Runnable
{
  xh(xe paramxe, ArrayList paramArrayList) {}
  
  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      zr localzr = (zr)localIterator.next();
      xe localxe = this.b;
      ih localih = gt.o(localzr.a);
      localxe.d.add(localzr);
      localih.a(1.0F).a(localxe.i).a(new xj(localxe, localzr, localih)).b();
    }
    this.a.clear();
    this.b.a.remove(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

final class aeu
  implements Runnable
{
  aeu(aer paramaer) {}
  
  public final void run()
  {
    Iterator localIterator2 = this.a.c.values().iterator();
    while (localIterator2.hasNext())
    {
      aev localaev = (aev)localIterator2.next();
      Iterator localIterator1 = localaev.c.iterator();
      while (localIterator1.hasNext())
      {
        aex localaex = (aex)localIterator1.next();
        if (localaex.b != null) {
          if (localaev.b == null)
          {
            localaex.a = localaev.a;
            localaex.b.a(localaex, false);
          }
          else
          {
            localaex.b.a(localaev.b);
          }
        }
      }
    }
    this.a.c.clear();
    this.a.d = null;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aeu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
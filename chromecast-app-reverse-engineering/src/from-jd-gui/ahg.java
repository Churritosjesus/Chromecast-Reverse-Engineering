import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class ahg
  implements Runnable
{
  public final void run()
  {
    HashSet localHashSet = new HashSet();
    synchronized (ahe.b())
    {
      Iterator localIterator = ahe.c().keySet().iterator();
      if (localIterator.hasNext()) {
        localHashSet.add(((ahk)localIterator.next()).b);
      }
    }
    ??? = localHashSet.iterator();
    while (((Iterator)???).hasNext()) {
      aji.a((String)((Iterator)???).next(), true);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
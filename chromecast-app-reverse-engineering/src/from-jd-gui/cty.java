import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class cty
  implements cuc
{
  cty(ctw paramctw) {}
  
  public final void a(List paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (ctz)localIterator.next();
      ctw.a(this.a, ctw.b(paramList.a, paramList.b));
    }
    ctw.a(this.a).countDown();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
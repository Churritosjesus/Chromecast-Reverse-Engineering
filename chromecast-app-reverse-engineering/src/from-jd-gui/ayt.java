import java.util.Iterator;
import java.util.List;

final class ayt
  implements bff
{
  ayt(ayq paramayq, ayv paramayv) {}
  
  public final void a()
  {
    synchronized (ayq.c(this.b))
    {
      ayq.c(this.b).a.remove(this.a);
      ayq.c(this.b).b.add(this.a);
      this.a.c = null;
      this.a.d = null;
      aym localaym = this.a.b;
      ayq.d(this.b);
      ??? = ayq.e(this.b);
      if (??? != null)
      {
        ??? = ((List)???).iterator();
        if (((Iterator)???).hasNext()) {
          ((ayw)((Iterator)???).next()).a(localaym);
        }
      }
    }
  }
  
  public final void a(int paramInt)
  {
    this.a.f = true;
  }
  
  public final void b()
  {
    synchronized (ayq.c(this.b))
    {
      ayq.c(this.b).a.remove(this.a);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ayt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class pp
{
  final ArrayList a = new ArrayList();
  iu b;
  boolean c;
  private long d = -1L;
  private Interpolator e;
  private final iv f = new pq(this);
  
  public final pp a(long paramLong)
  {
    if (!this.c) {
      this.d = 250L;
    }
    return this;
  }
  
  public final pp a(Interpolator paramInterpolator)
  {
    if (!this.c) {
      this.e = paramInterpolator;
    }
    return this;
  }
  
  public final pp a(ih paramih)
  {
    if (!this.c) {
      this.a.add(paramih);
    }
    return this;
  }
  
  public final pp a(iu paramiu)
  {
    if (!this.c) {
      this.b = paramiu;
    }
    return this;
  }
  
  public final void a()
  {
    if (this.c) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        ih localih = (ih)localIterator.next();
        if (this.d >= 0L) {
          localih.a(this.d);
        }
        if (this.e != null) {
          localih.a(this.e);
        }
        if (this.b != null) {
          localih.a(this.f);
        }
        localih.b();
      }
      this.c = true;
    }
  }
  
  public final void b()
  {
    if (!this.c) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        ((ih)localIterator.next()).a();
      }
      this.c = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
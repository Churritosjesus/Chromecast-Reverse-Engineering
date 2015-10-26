import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ayq
{
  private static final int b = (int)TimeUnit.SECONDS.toSeconds(1L);
  private static final int c;
  private static final int d;
  private static final int e = (int)TimeUnit.SECONDS.toMillis(3L);
  public List a;
  private Context f;
  private ayx g;
  private azm h;
  private Handler i;
  private Runnable j;
  private int k = 0;
  private final blp l;
  
  static
  {
    int m = (int)TimeUnit.MILLISECONDS.toMillis(1000L);
    c = m;
    d = m * 10;
  }
  
  public ayq(Context paramContext)
  {
    this.f = paramContext.getApplicationContext();
    this.l = new blp("LegacyDeviceManager", false);
    this.g = new ayx(this);
    this.a = new ArrayList();
    this.i = new Handler(Looper.getMainLooper());
    this.j = new ayr(this);
  }
  
  private void a(int paramInt)
  {
    if (this.k == paramInt) {}
    for (;;)
    {
      return;
      this.k = paramInt;
      List localList = g();
      if (localList != null) {
        this.i.post(new ayu(this, localList, paramInt));
      }
    }
  }
  
  private List g()
  {
    ArrayList localArrayList = null;
    synchronized (this.a)
    {
      if (!this.a.isEmpty())
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>(this.a);
      }
      return localArrayList;
    }
  }
  
  public final void a()
  {
    synchronized (this.a)
    {
      this.a.clear();
      return;
    }
  }
  
  public final void a(ayw paramayw)
  {
    synchronized (this.a)
    {
      if (this.a.contains(paramayw))
      {
        paramayw = new java/lang/IllegalArgumentException;
        paramayw.<init>("the same listener cannot be added twice");
        throw paramayw;
      }
    }
    this.a.add(paramayw);
  }
  
  public final void b()
  {
    
    if (this.h == null)
    {
      this.h = new azm(this.f, "urn:dial-multiscreen-org:service:dial:1", b, c, this.i);
      this.h.a = new ays(this);
    }
    a(1);
    this.h.a();
    this.i.postDelayed(this.j, e);
  }
  
  public final void c()
  {
    
    if (this.h != null)
    {
      ??? = this.h;
      ((azm)???).c();
      ((azm)???).b();
      this.i.removeCallbacksAndMessages(null);
      synchronized (this.g)
      {
        Iterator localIterator = this.g.a.iterator();
        while (localIterator.hasNext())
        {
          ayv localayv = (ayv)localIterator.next();
          if (localayv.d != null) {
            localayv.d.b();
          }
        }
      }
      this.g.a.clear();
    }
    a(0);
  }
  
  public final List d()
  {
    ArrayList localArrayList = new ArrayList();
    synchronized (this.g)
    {
      Iterator localIterator = this.g.b.iterator();
      while (localIterator.hasNext())
      {
        ayv localayv = (ayv)localIterator.next();
        if (!localayv.f) {
          localArrayList.add(localayv.b);
        }
      }
    }
    return localList;
  }
  
  void e()
  {
    synchronized (this.g)
    {
      this.g.a.clear();
      if (this.g.b.isEmpty()) {
        break label135;
      }
      List localList = g();
      if (localList != null)
      {
        Iterator localIterator1 = this.g.b.iterator();
        while (localIterator1.hasNext())
        {
          ayv localayv = (ayv)localIterator1.next();
          Iterator localIterator2 = localList.iterator();
          if (localIterator2.hasNext()) {
            ((ayw)localIterator2.next()).b(localayv.b);
          }
        }
      }
    }
    this.g.b.clear();
    label135:
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ayq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
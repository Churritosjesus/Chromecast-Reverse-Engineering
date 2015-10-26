import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class adv
{
  final Map a = new HashMap();
  final Set b = new HashSet();
  final PriorityBlockingQueue c = new PriorityBlockingQueue();
  List d = new ArrayList();
  private AtomicInteger e = new AtomicInteger();
  private final PriorityBlockingQueue f = new PriorityBlockingQueue();
  private final adg g;
  private final adm h;
  private final aeb i;
  private adn[] j;
  private adi k;
  
  public adv(adg paramadg, adm paramadm)
  {
    this(paramadg, paramadm, 4);
  }
  
  private adv(adg paramadg, adm paramadm, int paramInt)
  {
    this(paramadg, paramadm, 4, new aeb(new Handler(Looper.getMainLooper())));
  }
  
  private adv(adg paramadg, adm paramadm, int paramInt, aeb paramaeb)
  {
    this.g = paramadg;
    this.h = paramadm;
    this.j = new adn[paramInt];
    this.i = paramaeb;
  }
  
  public final ads a(ads paramads)
  {
    paramads.e = this;
    synchronized (this.b)
    {
      this.b.add(paramads);
      paramads.d = Integer.valueOf(this.e.incrementAndGet());
      paramads.a("add-to-queue");
      if (!paramads.f)
      {
        this.f.add(paramads);
        return paramads;
      }
    }
    for (;;)
    {
      String str;
      synchronized (this.a)
      {
        str = paramads.b;
        if (this.a.containsKey(str))
        {
          Queue localQueue = (Queue)this.a.get(str);
          ??? = localQueue;
          if (localQueue == null)
          {
            ??? = new java/util/LinkedList;
            ((LinkedList)???).<init>();
          }
          ((Queue)???).add(paramads);
          this.a.put(str, ???);
          if (aeg.a) {
            aeg.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] { str });
          }
        }
      }
      this.a.put(str, null);
      this.c.add(paramads);
    }
  }
  
  public final void a()
  {
    int n = 0;
    Object localObject;
    if (this.k != null)
    {
      localObject = this.k;
      ((adi)localObject).a = true;
      ((adi)localObject).interrupt();
    }
    for (int m = 0; m < this.j.length; m++) {
      if (this.j[m] != null)
      {
        localObject = this.j[m];
        ((adn)localObject).a = true;
        ((adn)localObject).interrupt();
      }
    }
    this.k = new adi(this.c, this.f, this.g, this.i);
    this.k.start();
    for (m = n; m < this.j.length; m++)
    {
      localObject = new adn(this.f, this.h, this.g, this.i);
      this.j[m] = localObject;
      ((adn)localObject).start();
    }
  }
  
  public final void a(adx paramadx)
  {
    synchronized (this.b)
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        ads localads = (ads)localIterator.next();
        if (paramadx.a(localads)) {
          localads.g = true;
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\adv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
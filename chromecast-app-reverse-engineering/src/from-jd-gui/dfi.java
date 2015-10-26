import java.net.SocketException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class dfi
{
  private static final dfi a;
  private final int b;
  private final long c;
  private final LinkedList d = new LinkedList();
  private Executor e = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), dgs.a("OkHttp ConnectionPool", true));
  private final Runnable f = new dfj(this);
  
  static
  {
    String str2 = System.getProperty("http.keepAlive");
    String str3 = System.getProperty("http.keepAliveDuration");
    String str1 = System.getProperty("http.maxConnections");
    long l;
    if (str3 != null)
    {
      l = Long.parseLong(str3);
      if ((str2 == null) || (Boolean.parseBoolean(str2))) {
        break label58;
      }
      a = new dfi(0, l);
    }
    for (;;)
    {
      return;
      l = 300000L;
      break;
      label58:
      if (str1 != null) {
        a = new dfi(Integer.parseInt(str1), l);
      } else {
        a = new dfi(5, l);
      }
    }
  }
  
  private dfi(int paramInt, long paramLong)
  {
    this.b = paramInt;
    this.c = (paramLong * 1000L * 1000L);
  }
  
  public static dfi a()
  {
    return a;
  }
  
  private boolean b()
  {
    boolean bool;
    int i;
    long l2;
    ListIterator localListIterator;
    label57:
    dfh localdfh;
    long l3;
    try
    {
      if (this.d.isEmpty())
      {
        bool = false;
        return bool;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      i = 0;
      l2 = System.nanoTime();
      l1 = this.c;
      localListIterator = this.d.listIterator(this.d.size());
      for (;;)
      {
        if (!localListIterator.hasPrevious()) {
          break label148;
        }
        localdfh = (dfh)localListIterator.previous();
        l3 = localdfh.d() + this.c - l2;
        if ((l3 > 0L) && (localdfh.b())) {
          break;
        }
        localListIterator.remove();
        localArrayList.add(localdfh);
      }
      if (!localdfh.c()) {
        break label316;
      }
    }
    finally {}
    long l1 = Math.min(l1, l3);
    i++;
    label148:
    label163:
    label313:
    label316:
    for (;;)
    {
      break label57;
      localListIterator = this.d.listIterator(this.d.size());
      if ((localListIterator.hasPrevious()) && (i > this.b))
      {
        localdfh = (dfh)localListIterator.previous();
        if (!localdfh.c()) {
          break label313;
        }
        ((List)localObject).add(localdfh);
        localListIterator.remove();
        i--;
      }
      for (;;)
      {
        break label163;
        bool = ((List)localObject).isEmpty();
        if (bool) {
          try
          {
            l2 = l1 / 1000000L;
            wait(l2, (int)(l1 - 1000000L * l2));
            bool = true;
          }
          catch (InterruptedException localInterruptedException) {}
        }
        int j = ((List)localObject).size();
        for (i = 0; i < j; i++) {
          dgs.a(((dfh)((List)localObject).get(i)).c);
        }
        bool = true;
        break;
      }
    }
  }
  
  public final dfh a(dez paramdez)
  {
    for (;;)
    {
      try
      {
        ListIterator localListIterator = this.d.listIterator(this.d.size());
        if (localListIterator.hasPrevious())
        {
          Object localObject3 = (dfh)localListIterator.previous();
          if ((((dfh)localObject3).b.a.equals(paramdez)) && (((dfh)localObject3).b()) && (System.nanoTime() - ((dfh)localObject3).d() < this.c))
          {
            localListIterator.remove();
            boolean bool = ((dfh)localObject3).e();
            Object localObject1 = localObject3;
            if (!bool) {}
            try
            {
              dgn.a().a(((dfh)localObject3).c);
              localObject1 = localObject3;
              if ((localObject1 != null) && (((dfh)localObject1).e())) {
                this.d.addFirst(localObject1);
              }
              return (dfh)localObject1;
            }
            catch (SocketException localSocketException)
            {
              dgs.a(((dfh)localObject3).c);
              dgn.a();
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>("Unable to tagSocket(): ");
              dgn.a(localSocketException);
            }
          }
        }
        else
        {
          Object localObject2 = null;
        }
      }
      finally {}
    }
  }
  
  void a(dfh paramdfh)
  {
    boolean bool = this.d.isEmpty();
    this.d.addFirst(paramdfh);
    if (bool) {
      this.e.execute(this.f);
    }
    for (;;)
    {
      return;
      notifyAll();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
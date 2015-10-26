import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class dhu
  implements dhw
{
  private static final List a = dgs.a(new dke[] { dke.a("connection"), dke.a("host"), dke.a("keep-alive"), dke.a("proxy-connection"), dke.a("transfer-encoding") });
  private static final List b = dgs.a(new dke[] { dke.a("connection"), dke.a("host"), dke.a("keep-alive"), dke.a("proxy-connection"), dke.a("te"), dke.a("transfer-encoding"), dke.a("encoding"), dke.a("upgrade") });
  private final dhg c;
  private final djb d;
  private djn e;
  
  public dhu(dhg paramdhg, djb paramdjb)
  {
    this.c = paramdhg;
    this.d = paramdjb;
  }
  
  private static boolean a(dfx paramdfx, dke paramdke)
  {
    if (paramdfx == dfx.c) {}
    for (boolean bool = a.contains(paramdke);; bool = b.contains(paramdke))
    {
      return bool;
      if (paramdfx != dfx.d) {
        break;
      }
    }
    throw new AssertionError(paramdfx);
  }
  
  public final dge a(dgc paramdgc)
  {
    return new dhn(paramdgc.f, dkk.a(this.e.f));
  }
  
  public final dku a(dfy paramdfy, long paramLong)
  {
    return this.e.d();
  }
  
  public final void a()
  {
    this.e.d().close();
  }
  
  public final void a(dfy paramdfy)
  {
    if (this.e != null) {}
    for (;;)
    {
      return;
      this.c.b();
      boolean bool = this.c.c();
      Object localObject2 = a.a(this.c.c.g);
      djb localdjb = this.d;
      dfx localdfx = this.d.a;
      dfo localdfo = paramdfy.c;
      ArrayList localArrayList = new ArrayList(localdfo.a.length / 2 + 10);
      localArrayList.add(new die(die.b, paramdfy.b));
      localArrayList.add(new die(die.c, a.a(paramdfy.a())));
      Object localObject1 = dhg.a(paramdfy.a());
      int i;
      if (dfx.c == localdfx)
      {
        localArrayList.add(new die(die.g, (String)localObject2));
        localArrayList.add(new die(die.f, (String)localObject1));
        localArrayList.add(new die(die.d, paramdfy.a().getProtocol()));
        localObject2 = new LinkedHashSet();
        int k = localdfo.a.length / 2;
        i = 0;
        label227:
        if (i >= k) {
          break label511;
        }
        localObject1 = dke.a(localdfo.a(i).toLowerCase(Locale.US));
        paramdfy = localdfo.b(i);
        if ((!a(localdfx, (dke)localObject1)) && (!((dke)localObject1).equals(die.b)) && (!((dke)localObject1).equals(die.c)) && (!((dke)localObject1).equals(die.d)) && (!((dke)localObject1).equals(die.e)) && (!((dke)localObject1).equals(die.f)) && (!((dke)localObject1).equals(die.g)))
        {
          if (!((Set)localObject2).add(localObject1)) {
            break label409;
          }
          localArrayList.add(new die((dke)localObject1, paramdfy));
        }
      }
      label409:
      label509:
      for (;;)
      {
        i++;
        break label227;
        if (dfx.d == localdfx)
        {
          localArrayList.add(new die(die.e, (String)localObject1));
          break;
        }
        throw new AssertionError();
        for (int j = 0;; j++)
        {
          if (j >= localArrayList.size()) {
            break label509;
          }
          if (((die)localArrayList.get(j)).h.equals(localObject1))
          {
            localArrayList.set(j, new die((dke)localObject1, ((die)localArrayList.get(j)).i.a() + '\000' + paramdfy));
            break;
          }
        }
      }
      label511:
      this.e = localdjb.a(0, localArrayList, bool, true);
      this.e.h.a(this.c.b.w, TimeUnit.MILLISECONDS);
    }
  }
  
  public final void a(dhg paramdhg)
  {
    if (this.e != null) {
      this.e.a(dia.h);
    }
  }
  
  public final void a(dhp paramdhp)
  {
    paramdhp.a(this.e.d());
  }
  
  public final dgd b()
  {
    List localList = this.e.c();
    dfx localdfx = this.d.a;
    Object localObject1 = null;
    Object localObject2 = "HTTP/1.1";
    dfp localdfp = new dfp();
    localdfp.c(dhl.c, localdfx.toString());
    int n = localList.size();
    for (int i = 0; i < n; i++)
    {
      dke localdke = ((die)localList.get(i)).h;
      String str2 = ((die)localList.get(i)).i.a();
      int j = 0;
      if (j < str2.length())
      {
        int m = str2.indexOf(0, j);
        int k = m;
        if (m == -1) {
          k = str2.length();
        }
        String str1 = str2.substring(j, k);
        if (localdke.equals(die.a)) {
          localObject1 = str1;
        }
        for (;;)
        {
          j = k + 1;
          break;
          if (localdke.equals(die.g)) {
            localObject2 = str1;
          } else if (!a(localdfx, localdke)) {
            localdfp.a(localdke.a(), str1);
          }
        }
      }
    }
    if (localObject1 == null) {
      throw new ProtocolException("Expected ':status' header not present");
    }
    localObject2 = dhv.a((String)localObject2 + " " + (String)localObject1);
    localObject1 = new dgd();
    ((dgd)localObject1).b = localdfx;
    ((dgd)localObject1).c = ((dhv)localObject2).b;
    ((dgd)localObject1).d = ((dhv)localObject2).c;
    return ((dgd)localObject1).a(localdfp.a());
  }
  
  public final void c() {}
  
  public final boolean d()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
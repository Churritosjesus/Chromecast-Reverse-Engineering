import java.io.IOException;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.URL;

public final class dhg
{
  public static final dge a = new dhh();
  public final dft b;
  public dfh c;
  public dez d;
  public dhr e;
  public dgf f;
  public final dgc g;
  public dhw h;
  public long i = -1L;
  public boolean j;
  public final boolean k;
  public final dfy l;
  public dfy m;
  public dgc n;
  public dgc o;
  public dku p;
  public dkc q;
  public final boolean r;
  public final boolean s;
  public s t;
  public dgv u;
  
  public dhg(dft paramdft, dfy paramdfy, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, dfh paramdfh, dhr paramdhr, dhp paramdhp, dgc paramdgc)
  {
    this.b = paramdft;
    this.l = paramdfy;
    this.k = paramBoolean1;
    this.r = paramBoolean2;
    this.s = paramBoolean3;
    this.c = paramdfh;
    this.e = paramdhr;
    this.p = paramdhp;
    this.g = paramdgc;
    if (paramdfh != null) {
      dgi.b.b(paramdfh, this);
    }
    for (this.f = paramdfh.b;; this.f = null) {
      return;
    }
  }
  
  public static dfo a(dfo paramdfo1, dfo paramdfo2)
  {
    int i2 = 0;
    dfp localdfp = new dfp();
    int i3 = paramdfo1.a.length / 2;
    for (int i1 = 0; i1 < i3; i1++)
    {
      String str1 = paramdfo1.a(i1);
      String str2 = paramdfo1.b(i1);
      if (((!"Warning".equalsIgnoreCase(str1)) || (!str2.startsWith("1"))) && ((!dhl.a(str1)) || (paramdfo2.a(str1) == null))) {
        localdfp.a(str1, str2);
      }
    }
    i3 = paramdfo2.a.length / 2;
    for (i1 = i2; i1 < i3; i1++)
    {
      paramdfo1 = paramdfo2.a(i1);
      if ((!"Content-Length".equalsIgnoreCase(paramdfo1)) && (dhl.a(paramdfo1))) {
        localdfp.a(paramdfo1, paramdfo2.b(i1));
      }
    }
    return localdfp.a();
  }
  
  public static dgc a(dgc paramdgc)
  {
    dgc localdgc = paramdgc;
    if (paramdgc != null)
    {
      localdgc = paramdgc;
      if (paramdgc.g != null)
      {
        paramdgc = paramdgc.a();
        paramdgc.g = null;
        localdgc = paramdgc.a();
      }
    }
    return localdgc;
  }
  
  public static String a(URL paramURL)
  {
    if (dgs.a(paramURL) != dgs.a(paramURL.getProtocol())) {}
    for (paramURL = paramURL.getHost() + ":" + paramURL.getPort();; paramURL = paramURL.getHost()) {
      return paramURL;
    }
  }
  
  public static boolean c(dgc paramdgc)
  {
    boolean bool = false;
    if (paramdgc.a.b.equals("HEAD")) {}
    for (;;)
    {
      return bool;
      int i1 = paramdgc.c;
      if (((i1 < 100) || (i1 >= 200)) && (i1 != 204) && (i1 != 304)) {
        bool = true;
      } else if ((dhl.a(paramdgc) != -1L) || ("chunked".equalsIgnoreCase(paramdgc.a("Transfer-Encoding")))) {
        bool = true;
      }
    }
  }
  
  public dfh a()
  {
    dfi localdfi = this.b.q;
    dfh localdfh2 = localdfi.a(this.d);
    dfh localdfh1;
    if (localdfh2 != null)
    {
      localdfh1 = localdfh2;
      if (!this.m.b.equals("GET"))
      {
        if (!dgi.b.c(localdfh2)) {
          break label52;
        }
        localdfh1 = localdfh2;
      }
    }
    for (;;)
    {
      return localdfh1;
      label52:
      dgs.a(localdfh2.c);
      break;
      try
      {
        localdfh1 = new dfh(localdfi, this.e.b());
      }
      catch (IOException localIOException)
      {
        throw new dhq(localIOException);
      }
    }
  }
  
  public final void a(dfo paramdfo)
  {
    CookieHandler localCookieHandler = this.b.i;
    if (localCookieHandler != null) {
      localCookieHandler.put(this.l.b(), dhl.a(paramdfo, null));
    }
  }
  
  public void a(dhr paramdhr, IOException paramIOException)
  {
    if (dgi.b.b(this.c) > 0) {}
    for (;;)
    {
      return;
      dgf localdgf = this.c.b;
      if ((localdgf.b.type() != Proxy.Type.DIRECT) && (paramdhr.a.k != null)) {
        paramdhr.a.k.connectFailed(paramdhr.b, localdgf.b.address(), paramIOException);
      }
      paramdhr.c.a(localdgf);
    }
  }
  
  public dgc b(dgc paramdgc)
  {
    Object localObject = paramdgc;
    if (this.j)
    {
      if ("gzip".equalsIgnoreCase(this.o.a("Content-Encoding"))) {
        break label32;
      }
      localObject = paramdgc;
    }
    for (;;)
    {
      return (dgc)localObject;
      label32:
      localObject = paramdgc;
      if (paramdgc.g != null)
      {
        dki localdki = new dki(paramdgc.g.c());
        localObject = paramdgc.f.a().a("Content-Encoding").a("Content-Length").a();
        paramdgc = paramdgc.a().a((dfo)localObject);
        paramdgc.g = new dhn((dfo)localObject, dkk.a(localdki));
        localObject = paramdgc.a();
      }
    }
  }
  
  public final void b()
  {
    if (this.i != -1L) {
      throw new IllegalStateException();
    }
    this.i = System.currentTimeMillis();
  }
  
  public final boolean b(URL paramURL)
  {
    URL localURL = this.l.a();
    if ((localURL.getHost().equals(paramURL.getHost())) && (dgs.a(localURL) == dgs.a(paramURL)) && (localURL.getProtocol().equals(paramURL.getProtocol()))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean c()
  {
    return a.q(this.l.b);
  }
  
  public final dku d()
  {
    if (this.u == null) {
      throw new IllegalStateException();
    }
    return this.p;
  }
  
  public final boolean e()
  {
    if (this.o != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final dgc f()
  {
    if (this.o == null) {
      throw new IllegalStateException();
    }
    return this.o;
  }
  
  public void g()
  {
    Object localObject = dgi.b.a(this.b);
    if (localObject == null) {}
    for (;;)
    {
      return;
      if (!dgv.a(this.o, this.m))
      {
        localObject = this.m.b;
        if ((((String)localObject).equals("POST")) || (((String)localObject).equals("PATCH")) || (((String)localObject).equals("PUT")) || (!((String)localObject).equals("DELETE"))) {}
      }
      else
      {
        a(this.o);
        this.t = ((s)localObject).m();
      }
    }
  }
  
  public final void h()
  {
    if ((this.h != null) && (this.c != null)) {
      this.h.c();
    }
    this.c = null;
  }
  
  public final dfh i()
  {
    dfh localdfh = null;
    if (this.q != null)
    {
      dgs.a(this.q);
      if (this.o != null) {
        break label64;
      }
      if (this.c != null) {
        dgs.a(this.c.c);
      }
      this.c = null;
    }
    for (;;)
    {
      return localdfh;
      if (this.p == null) {
        break;
      }
      dgs.a(this.p);
      break;
      label64:
      dgs.a(this.o.g);
      if ((this.h != null) && (this.c != null) && (!this.h.d()))
      {
        dgs.a(this.c.c);
        this.c = null;
      }
      else
      {
        if ((this.c != null) && (!dgi.b.a(this.c))) {
          this.c = null;
        }
        localdfh = this.c;
        this.c = null;
      }
    }
  }
  
  public dgc j()
  {
    this.h.a();
    Object localObject = this.h.b();
    ((dgd)localObject).a = this.m;
    ((dgd)localObject).e = this.c.i;
    dgc localdgc = ((dgd)localObject).a(dhl.a, Long.toString(this.i)).a(dhl.b, Long.toString(System.currentTimeMillis())).a();
    localObject = localdgc;
    if (!this.s)
    {
      localObject = localdgc.a();
      ((dgd)localObject).g = this.h.a(localdgc);
      localObject = ((dgd)localObject).a();
    }
    dgi.b.a(this.c, ((dgc)localObject).b);
    return (dgc)localObject;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
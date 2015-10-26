import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.SocketException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class dhr
{
  final dez a;
  final URI b;
  final dgr c;
  private final dgk d;
  private final dft e;
  private Proxy f;
  private InetSocketAddress g;
  private List h = Collections.emptyList();
  private int i;
  private List j = Collections.emptyList();
  private int k;
  private final List l = new ArrayList();
  
  public dhr(dez paramdez, URI paramURI, dft paramdft)
  {
    this.a = paramdez;
    this.b = paramURI;
    this.e = paramdft;
    this.c = dgi.b.b(paramdft);
    this.d = dgi.b.c(paramdft);
    paramdez = paramdez.a;
    if (paramdez != null) {
      this.h = Collections.singletonList(paramdez);
    }
    for (;;)
    {
      this.i = 0;
      return;
      this.h = new ArrayList();
      paramdez = this.e.h.select(paramURI);
      if (paramdez != null) {
        this.h.addAll(paramdez);
      }
      this.h.removeAll(Collections.singleton(Proxy.NO_PROXY));
      this.h.add(Proxy.NO_PROXY);
    }
  }
  
  private void a(Proxy paramProxy)
  {
    this.j = new ArrayList();
    int m;
    InetSocketAddress localInetSocketAddress;
    if ((paramProxy.type() == Proxy.Type.DIRECT) || (paramProxy.type() == Proxy.Type.SOCKS))
    {
      paramProxy = this.a.b;
      m = dgs.a(this.b);
      if ((m <= 0) || (m > 65535)) {
        throw new SocketException("No route to " + paramProxy + ":" + m + "; port is out of range");
      }
    }
    else
    {
      paramProxy = paramProxy.address();
      if (!(paramProxy instanceof InetSocketAddress)) {
        throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + paramProxy.getClass());
      }
      localInetSocketAddress = (InetSocketAddress)paramProxy;
      paramProxy = localInetSocketAddress.getAddress();
      if (paramProxy == null) {}
      for (paramProxy = localInetSocketAddress.getHostName();; paramProxy = paramProxy.getHostAddress())
      {
        m = localInetSocketAddress.getPort();
        break;
      }
    }
    for (localInetSocketAddress : this.d.a(paramProxy)) {
      this.j.add(new InetSocketAddress(localInetSocketAddress, m));
    }
    this.k = 0;
  }
  
  private boolean c()
  {
    if (this.i < this.h.size()) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean d()
  {
    if (this.k < this.j.size()) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean e()
  {
    if (!this.l.isEmpty()) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean a()
  {
    if ((d()) || (c()) || (e())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final dgf b()
  {
    for (;;)
    {
      Object localObject;
      if (!d()) {
        if (!c())
        {
          if (!e()) {
            throw new NoSuchElementException();
          }
          localObject = (dgf)this.l.remove(0);
        }
      }
      dgf localdgf;
      do
      {
        return (dgf)localObject;
        if (!c()) {
          throw new SocketException("No route to " + this.a.b + "; exhausted proxy configurations: " + this.h);
        }
        localObject = this.h;
        int m = this.i;
        this.i = (m + 1);
        localObject = (Proxy)((List)localObject).get(m);
        a((Proxy)localObject);
        this.f = ((Proxy)localObject);
        if (!d()) {
          throw new SocketException("No route to " + this.a.b + "; exhausted inet socket addresses: " + this.j);
        }
        localObject = this.j;
        m = this.k;
        this.k = (m + 1);
        this.g = ((InetSocketAddress)((List)localObject).get(m));
        localdgf = new dgf(this.a, this.f, this.g);
        localObject = localdgf;
      } while (!this.c.c(localdgf));
      this.l.add(localdgf);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
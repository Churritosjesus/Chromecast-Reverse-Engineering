import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public final class dfh
{
  final dfi a;
  public final dgf b;
  public Socket c;
  boolean d = false;
  dgx e;
  djb f;
  public dfx g = dfx.b;
  long h;
  public dfn i;
  int j;
  Object k;
  
  public dfh(dfi paramdfi, dgf paramdgf)
  {
    this.a = paramdfi;
    this.b = paramdgf;
  }
  
  final void a(Object paramObject)
  {
    if (e()) {}
    for (;;)
    {
      return;
      synchronized (this.a)
      {
        if (this.k != null)
        {
          paramObject = new java/lang/IllegalStateException;
          ((IllegalStateException)paramObject).<init>("Connection already has an owner!");
          throw ((Throwable)paramObject);
        }
      }
      this.k = paramObject;
    }
  }
  
  final boolean a()
  {
    synchronized (this.a)
    {
      if (this.k == null)
      {
        bool = false;
        return bool;
      }
      this.k = null;
      boolean bool = true;
    }
  }
  
  final boolean b()
  {
    if ((!this.c.isClosed()) && (!this.c.isInputShutdown()) && (!this.c.isOutputShutdown())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  final boolean c()
  {
    if ((this.f == null) || (this.f.a())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  final long d()
  {
    if (this.f == null) {}
    for (long l = this.h;; l = this.f.b()) {
      return l;
    }
  }
  
  final boolean e()
  {
    if (this.f != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Connection{").append(this.b.a.b).append(":").append(this.b.a.c).append(", proxy=").append(this.b.b).append(" hostAddress=").append(this.b.c.getAddress().getHostAddress()).append(" cipherSuite=");
    if (this.i != null) {}
    for (String str = this.i.a;; str = "none") {
      return str + " protocol=" + this.g + '}';
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
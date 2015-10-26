import java.net.InetSocketAddress;
import java.net.Proxy;

public final class dgf
{
  public final dez a;
  public final Proxy b;
  public final InetSocketAddress c;
  
  public dgf(dez paramdez, Proxy paramProxy, InetSocketAddress paramInetSocketAddress)
  {
    if (paramdez == null) {
      throw new NullPointerException("address == null");
    }
    if (paramProxy == null) {
      throw new NullPointerException("proxy == null");
    }
    if (paramInetSocketAddress == null) {
      throw new NullPointerException("inetSocketAddress == null");
    }
    this.a = paramdez;
    this.b = paramProxy;
    this.c = paramInetSocketAddress;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof dgf))
    {
      paramObject = (dgf)paramObject;
      bool1 = bool2;
      if (this.a.equals(((dgf)paramObject).a))
      {
        bool1 = bool2;
        if (this.b.equals(((dgf)paramObject).b))
        {
          bool1 = bool2;
          if (this.c.equals(((dgf)paramObject).c)) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return ((this.a.hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class dez
{
  public final Proxy a;
  public final String b;
  public final int c;
  public final SocketFactory d;
  public final SSLSocketFactory e;
  public final HostnameVerifier f;
  public final dfd g;
  public final dfa h;
  public final List i;
  final List j;
  public final ProxySelector k;
  
  public dez(String paramString, int paramInt, SocketFactory paramSocketFactory, SSLSocketFactory paramSSLSocketFactory, HostnameVerifier paramHostnameVerifier, dfd paramdfd, dfa paramdfa, Proxy paramProxy, List paramList1, List paramList2, ProxySelector paramProxySelector)
  {
    if (paramString == null) {
      throw new NullPointerException("uriHost == null");
    }
    if (paramInt <= 0) {
      throw new IllegalArgumentException("uriPort <= 0: " + paramInt);
    }
    if (paramdfa == null) {
      throw new IllegalArgumentException("authenticator == null");
    }
    if (paramList1 == null) {
      throw new IllegalArgumentException("protocols == null");
    }
    if (paramProxySelector == null) {
      throw new IllegalArgumentException("proxySelector == null");
    }
    this.a = paramProxy;
    this.b = paramString;
    this.c = paramInt;
    this.d = paramSocketFactory;
    this.e = paramSSLSocketFactory;
    this.f = paramHostnameVerifier;
    this.g = paramdfd;
    this.h = paramdfa;
    this.i = dgs.a(paramList1);
    this.j = dgs.a(paramList2);
    this.k = paramProxySelector;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof dez))
    {
      paramObject = (dez)paramObject;
      bool1 = bool2;
      if (dgs.a(this.a, ((dez)paramObject).a))
      {
        bool1 = bool2;
        if (this.b.equals(((dez)paramObject).b))
        {
          bool1 = bool2;
          if (this.c == ((dez)paramObject).c)
          {
            bool1 = bool2;
            if (dgs.a(this.e, ((dez)paramObject).e))
            {
              bool1 = bool2;
              if (dgs.a(this.f, ((dez)paramObject).f))
              {
                bool1 = bool2;
                if (dgs.a(this.g, ((dez)paramObject).g))
                {
                  bool1 = bool2;
                  if (dgs.a(this.h, ((dez)paramObject).h))
                  {
                    bool1 = bool2;
                    if (dgs.a(this.i, ((dez)paramObject).i))
                    {
                      bool1 = bool2;
                      if (dgs.a(this.j, ((dez)paramObject).j))
                      {
                        bool1 = bool2;
                        if (dgs.a(this.k, ((dez)paramObject).k)) {
                          bool1 = true;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    int i2 = 0;
    int m;
    int i3;
    int i4;
    int n;
    if (this.a != null)
    {
      m = this.a.hashCode();
      i3 = this.b.hashCode();
      i4 = this.c;
      if (this.e == null) {
        break label166;
      }
      n = this.e.hashCode();
      label48:
      if (this.f == null) {
        break label171;
      }
    }
    label166:
    label171:
    for (int i1 = this.f.hashCode();; i1 = 0)
    {
      if (this.g != null) {
        i2 = this.g.hashCode();
      }
      return (((((i1 + (n + (((m + 527) * 31 + i3) * 31 + i4) * 31) * 31) * 31 + i2) * 31 + this.h.hashCode()) * 31 + this.i.hashCode()) * 31 + this.j.hashCode()) * 31 + this.k.hashCode();
      m = 0;
      break;
      n = 0;
      break label48;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
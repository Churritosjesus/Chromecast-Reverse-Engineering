import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class dfn
{
  public final String a;
  public final List b;
  public final List c;
  
  private dfn(String paramString, List paramList1, List paramList2)
  {
    this.a = paramString;
    this.b = paramList1;
    this.c = paramList2;
  }
  
  public static dfn a(SSLSession paramSSLSession)
  {
    String str = paramSSLSession.getCipherSuite();
    if (str == null) {
      throw new IllegalStateException("cipherSuite == null");
    }
    try
    {
      Object localObject = paramSSLSession.getPeerCertificates();
      if (localObject != null)
      {
        localObject = dgs.a((Object[])localObject);
        paramSSLSession = paramSSLSession.getLocalCertificates();
        if (paramSSLSession == null) {
          break label77;
        }
        paramSSLSession = dgs.a(paramSSLSession);
        return new dfn(str, (List)localObject, paramSSLSession);
      }
    }
    catch (SSLPeerUnverifiedException localSSLPeerUnverifiedException)
    {
      for (;;)
      {
        List localList = null;
        continue;
        localList = Collections.emptyList();
        continue;
        label77:
        paramSSLSession = Collections.emptyList();
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (!(paramObject instanceof dfn)) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      paramObject = (dfn)paramObject;
      bool1 = bool2;
      if (this.a.equals(((dfn)paramObject).a))
      {
        bool1 = bool2;
        if (this.b.equals(((dfn)paramObject).b))
        {
          bool1 = bool2;
          if (this.c.equals(((dfn)paramObject).c)) {
            bool1 = true;
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return ((this.a.hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
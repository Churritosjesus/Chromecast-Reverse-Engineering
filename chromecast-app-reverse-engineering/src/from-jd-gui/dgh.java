import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class dgh
{
  public boolean a;
  public boolean b;
  private final List c;
  private int d = 0;
  
  public dgh(List paramList)
  {
    this.c = paramList;
  }
  
  private boolean b(SSLSocket paramSSLSocket)
  {
    int i = this.d;
    if (i < this.c.size()) {
      if (!((dfk)this.c.get(i)).a(paramSSLSocket)) {}
    }
    for (boolean bool = true;; bool = false)
    {
      return bool;
      i++;
      break;
    }
  }
  
  public final dfk a(SSLSocket paramSSLSocket)
  {
    int i = this.d;
    int j = this.c.size();
    dfk localdfk;
    if (i < j)
    {
      localdfk = (dfk)this.c.get(i);
      if (localdfk.a(paramSSLSocket)) {
        this.d = (i + 1);
      }
    }
    for (;;)
    {
      if (localdfk == null)
      {
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.b + ", modes=" + this.c + ", supported protocols=" + Arrays.toString(paramSSLSocket.getEnabledProtocols()));
        i++;
        break;
      }
      this.a = b(paramSSLSocket);
      dgi.b.a(localdfk, paramSSLSocket, this.b);
      return localdfk;
      localdfk = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
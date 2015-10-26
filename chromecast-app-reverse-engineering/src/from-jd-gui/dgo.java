import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;

final class dgo
  extends dgn
{
  private final dgm a;
  private final dgm b;
  private final Method c;
  private final Method d;
  private final dgm e;
  private final dgm f;
  
  public dgo(dgm paramdgm1, dgm paramdgm2, Method paramMethod1, Method paramMethod2, dgm paramdgm3, dgm paramdgm4)
  {
    this.a = paramdgm1;
    this.b = paramdgm2;
    this.c = paramMethod1;
    this.d = paramMethod2;
    this.e = paramdgm3;
    this.f = paramdgm4;
  }
  
  public final void a(Socket paramSocket)
  {
    if (this.c == null) {}
    for (;;)
    {
      return;
      try
      {
        this.c.invoke(null, new Object[] { paramSocket });
      }
      catch (IllegalAccessException paramSocket)
      {
        throw new RuntimeException(paramSocket);
      }
      catch (InvocationTargetException paramSocket)
      {
        throw new RuntimeException(paramSocket.getCause());
      }
    }
  }
  
  public final void a(Socket paramSocket, InetSocketAddress paramInetSocketAddress, int paramInt)
  {
    try
    {
      paramSocket.connect(paramInetSocketAddress, paramInt);
      return;
    }
    catch (SecurityException paramInetSocketAddress)
    {
      paramSocket = new IOException("Exception in connect");
      paramSocket.initCause(paramInetSocketAddress);
      throw paramSocket;
    }
  }
  
  public final void a(SSLSocket paramSSLSocket, String paramString, List paramList)
  {
    if (paramString != null)
    {
      this.a.a(paramSSLSocket, new Object[] { Boolean.valueOf(true) });
      this.b.a(paramSSLSocket, new Object[] { paramString });
    }
    if ((this.f != null) && (this.f.a(paramSSLSocket)))
    {
      djz localdjz = new djz();
      int j = paramList.size();
      for (int i = 0; i < j; i++)
      {
        paramString = (dfx)paramList.get(i);
        if (paramString != dfx.a)
        {
          localdjz.b(paramString.toString().length());
          localdjz.a(paramString.toString());
        }
      }
      paramString = localdjz.p();
      this.f.b(paramSSLSocket, new Object[] { paramString });
    }
  }
  
  public final String b(SSLSocket paramSSLSocket)
  {
    if (this.e == null) {
      paramSSLSocket = null;
    }
    for (;;)
    {
      return paramSSLSocket;
      if (!this.e.a(paramSSLSocket))
      {
        paramSSLSocket = null;
      }
      else
      {
        paramSSLSocket = (byte[])this.e.b(paramSSLSocket, new Object[0]);
        if (paramSSLSocket != null) {
          paramSSLSocket = new String(paramSSLSocket, dgs.c);
        } else {
          paramSSLSocket = null;
        }
      }
    }
  }
  
  public final void b(Socket paramSocket)
  {
    if (this.d == null) {}
    for (;;)
    {
      return;
      try
      {
        this.d.invoke(null, new Object[] { paramSocket });
      }
      catch (IllegalAccessException paramSocket)
      {
        throw new RuntimeException(paramSocket);
      }
      catch (InvocationTargetException paramSocket)
      {
        throw new RuntimeException(paramSocket.getCause());
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
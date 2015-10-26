import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.util.List;

public final class dgu
  implements dfa
{
  public static final dfa a = new dgu();
  
  private static InetAddress a(Proxy paramProxy, URL paramURL)
  {
    if ((paramProxy != null) && (paramProxy.type() != Proxy.Type.DIRECT)) {}
    for (paramProxy = ((InetSocketAddress)paramProxy.address()).getAddress();; paramProxy = InetAddress.getByName(paramURL.getHost())) {
      return paramProxy;
    }
  }
  
  public final dfy a(Proxy paramProxy, dgc paramdgc)
  {
    List localList = paramdgc.b();
    paramdgc = paramdgc.a;
    URL localURL = paramdgc.a();
    int j = localList.size();
    int i = 0;
    if (i < j)
    {
      Object localObject = (dff)localList.get(i);
      if ("Basic".equalsIgnoreCase(((dff)localObject).a))
      {
        localObject = Authenticator.requestPasswordAuthentication(localURL.getHost(), a(paramProxy, localURL), dgs.a(localURL), localURL.getProtocol(), ((dff)localObject).b, ((dff)localObject).a, localURL, Authenticator.RequestorType.SERVER);
        if (localObject != null) {
          paramProxy = a.a(((PasswordAuthentication)localObject).getUserName(), new String(((PasswordAuthentication)localObject).getPassword()));
        }
      }
    }
    for (paramProxy = paramdgc.c().a("Authorization", paramProxy).a();; paramProxy = null)
    {
      return paramProxy;
      i++;
      break;
    }
  }
  
  public final dfy b(Proxy paramProxy, dgc paramdgc)
  {
    List localList = paramdgc.b();
    paramdgc = paramdgc.a;
    URL localURL = paramdgc.a();
    int j = localList.size();
    int i = 0;
    if (i < j)
    {
      dff localdff = (dff)localList.get(i);
      if ("Basic".equalsIgnoreCase(localdff.a))
      {
        Object localObject = (InetSocketAddress)paramProxy.address();
        localObject = Authenticator.requestPasswordAuthentication(((InetSocketAddress)localObject).getHostName(), a(paramProxy, localURL), ((InetSocketAddress)localObject).getPort(), localURL.getProtocol(), localdff.b, localdff.a, localURL, Authenticator.RequestorType.PROXY);
        if (localObject != null) {
          paramProxy = a.a(((PasswordAuthentication)localObject).getUserName(), new String(((PasswordAuthentication)localObject).getPassword()));
        }
      }
    }
    for (paramProxy = paramdgc.c().a("Proxy-Authorization", paramProxy).a();; paramProxy = null)
    {
      return paramProxy;
      i++;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
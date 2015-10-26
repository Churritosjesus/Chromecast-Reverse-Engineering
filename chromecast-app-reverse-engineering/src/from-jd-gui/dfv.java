import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import javax.net.SocketFactory;

public final class dfv
  implements Cloneable, URLStreamHandlerFactory
{
  private final dft a;
  
  public dfv(dft paramdft)
  {
    this.a = paramdft;
  }
  
  public final HttpURLConnection a(URL paramURL)
  {
    return a(paramURL, this.a.d);
  }
  
  final HttpURLConnection a(URL paramURL, Proxy paramProxy)
  {
    String str = paramURL.getProtocol();
    dft localdft2 = this.a;
    dft localdft1 = new dft(localdft2);
    if (localdft1.h == null) {
      localdft1.h = ProxySelector.getDefault();
    }
    if (localdft1.i == null) {
      localdft1.i = CookieHandler.getDefault();
    }
    if (localdft1.l == null) {
      localdft1.l = SocketFactory.getDefault();
    }
    if (localdft1.m == null) {
      localdft1.m = localdft2.a();
    }
    if (localdft1.n == null) {
      localdft1.n = djt.a;
    }
    if (localdft1.o == null) {
      localdft1.o = dfd.a;
    }
    if (localdft1.p == null) {
      localdft1.p = dgu.a;
    }
    if (localdft1.q == null) {
      localdft1.q = dfi.a();
    }
    if (localdft1.e == null) {
      localdft1.e = dft.a;
    }
    if (localdft1.f == null) {
      localdft1.f = dft.b;
    }
    if (localdft1.r == null) {
      localdft1.r = dgk.a;
    }
    localdft1.d = paramProxy;
    if (str.equals("http")) {}
    for (paramURL = new dhy(paramURL, localdft1);; paramURL = new dhz(paramURL, localdft1))
    {
      return paramURL;
      if (!str.equals("https")) {
        break;
      }
    }
    throw new IllegalArgumentException("Unexpected protocol: " + str);
  }
  
  public final URLStreamHandler createURLStreamHandler(String paramString)
  {
    if ((!paramString.equals("http")) && (!paramString.equals("https"))) {}
    for (paramString = null;; paramString = new dfw(this, paramString)) {
      return paramString;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
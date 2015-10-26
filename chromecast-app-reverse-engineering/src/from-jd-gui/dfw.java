import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

final class dfw
  extends URLStreamHandler
{
  dfw(dfv paramdfv, String paramString) {}
  
  protected final int getDefaultPort()
  {
    if (this.a.equals("http")) {}
    for (int i = 80;; i = 443)
    {
      return i;
      if (!this.a.equals("https")) {
        break;
      }
    }
    throw new AssertionError();
  }
  
  protected final URLConnection openConnection(URL paramURL)
  {
    return this.b.a(paramURL);
  }
  
  protected final URLConnection openConnection(URL paramURL, Proxy paramProxy)
  {
    return this.b.a(paramURL, paramProxy);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
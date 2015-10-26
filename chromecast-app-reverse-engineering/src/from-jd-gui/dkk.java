import java.net.Socket;
import java.util.logging.Logger;

public final class dkk
{
  private static final Logger a = Logger.getLogger(dkk.class.getName());
  
  public static dkc a(dku paramdku)
  {
    if (paramdku == null) {
      throw new IllegalArgumentException("sink == null");
    }
    return new dko(paramdku);
  }
  
  public static dkd a(dkv paramdkv)
  {
    if (paramdkv == null) {
      throw new IllegalArgumentException("source == null");
    }
    return new dkq(paramdkv);
  }
  
  public static dku a(Socket paramSocket)
  {
    if (paramSocket == null) {
      throw new IllegalArgumentException("socket == null");
    }
    dju localdju = c(paramSocket);
    paramSocket = paramSocket.getOutputStream();
    if (paramSocket == null) {
      throw new IllegalArgumentException("out == null");
    }
    if (localdju == null) {
      throw new IllegalArgumentException("timeout == null");
    }
    return new djv(localdju, new dkl(localdju, paramSocket));
  }
  
  public static dkv b(Socket paramSocket)
  {
    if (paramSocket == null) {
      throw new IllegalArgumentException("socket == null");
    }
    dju localdju = c(paramSocket);
    paramSocket = paramSocket.getInputStream();
    if (paramSocket == null) {
      throw new IllegalArgumentException("in == null");
    }
    if (localdju == null) {
      throw new IllegalArgumentException("timeout == null");
    }
    return new djw(localdju, new dkm(localdju, paramSocket));
  }
  
  private static dju c(Socket paramSocket)
  {
    return new dkn(paramSocket);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
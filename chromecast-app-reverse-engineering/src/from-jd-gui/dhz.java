import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class dhz
  extends dhx
{
  private final dhy a;
  
  private dhz(dhy paramdhy)
  {
    super(paramdhy);
    this.a = paramdhy;
  }
  
  public dhz(URL paramURL, dft paramdft)
  {
    this(new dhy(paramURL, paramdft));
  }
  
  protected final dfn a()
  {
    if (this.a.b == null) {
      throw new IllegalStateException("Connection has not yet been established");
    }
    if (this.a.b.e()) {}
    for (dfn localdfn = this.a.b.f().e;; localdfn = this.a.c) {
      return localdfn;
    }
  }
  
  public final HostnameVerifier getHostnameVerifier()
  {
    return this.a.a.n;
  }
  
  public final SSLSocketFactory getSSLSocketFactory()
  {
    return this.a.a.m;
  }
  
  public final void setFixedLengthStreamingMode(long paramLong)
  {
    this.a.setFixedLengthStreamingMode(paramLong);
  }
  
  public final void setHostnameVerifier(HostnameVerifier paramHostnameVerifier)
  {
    this.a.a.n = paramHostnameVerifier;
  }
  
  public final void setSSLSocketFactory(SSLSocketFactory paramSSLSocketFactory)
  {
    this.a.a.m = paramSSLSocketFactory;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
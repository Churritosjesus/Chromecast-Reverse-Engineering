import java.net.URL;

public final class dfz
{
  dfq a;
  String b;
  dfp c;
  dga d;
  Object e;
  
  public dfz()
  {
    this.b = "GET";
    this.c = new dfp();
  }
  
  dfz(dfy paramdfy)
  {
    this.a = paramdfy.a;
    this.b = paramdfy.b;
    this.d = paramdfy.d;
    this.e = paramdfy.e;
    this.c = paramdfy.c.a();
  }
  
  public final dfy a()
  {
    if (this.a == null) {
      throw new IllegalStateException("url == null");
    }
    return new dfy(this);
  }
  
  public final dfz a(String paramString)
  {
    this.c.a(paramString);
    return this;
  }
  
  public final dfz a(String paramString, dga paramdga)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new IllegalArgumentException("method == null || method.length() == 0");
    }
    if ((paramdga != null) && (!a.q(paramString))) {
      throw new IllegalArgumentException("method " + paramString + " must not have a request body.");
    }
    if ((paramdga == null) && (a.p(paramString))) {
      throw new IllegalArgumentException("method " + paramString + " must have a request body.");
    }
    this.b = paramString;
    this.d = paramdga;
    return this;
  }
  
  public final dfz a(String paramString1, String paramString2)
  {
    this.c.c(paramString1, paramString2);
    return this;
  }
  
  public final dfz a(URL paramURL)
  {
    if (paramURL == null) {
      throw new IllegalArgumentException("url == null");
    }
    dfq localdfq = dfq.a(paramURL);
    if (localdfq == null) {
      throw new IllegalArgumentException("unexpected url: " + paramURL);
    }
    if (localdfq == null) {
      throw new IllegalArgumentException("url == null");
    }
    this.a = localdfq;
    return this;
  }
  
  public final dfz b(String paramString1, String paramString2)
  {
    this.c.a(paramString1, paramString2);
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
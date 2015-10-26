public final class dgd
{
  public dfy a;
  public dfx b;
  public int c = -1;
  public String d;
  public dfn e;
  dfp f;
  public dge g;
  dgc h;
  dgc i;
  dgc j;
  
  public dgd()
  {
    this.f = new dfp();
  }
  
  dgd(dgc paramdgc)
  {
    this.a = paramdgc.a;
    this.b = paramdgc.b;
    this.c = paramdgc.c;
    this.d = paramdgc.d;
    this.e = paramdgc.e;
    this.f = paramdgc.f.a();
    this.g = paramdgc.g;
    this.h = paramdgc.h;
    this.i = paramdgc.i;
    this.j = paramdgc.j;
  }
  
  private static void a(String paramString, dgc paramdgc)
  {
    if (paramdgc.g != null) {
      throw new IllegalArgumentException(paramString + ".body != null");
    }
    if (paramdgc.h != null) {
      throw new IllegalArgumentException(paramString + ".networkResponse != null");
    }
    if (paramdgc.i != null) {
      throw new IllegalArgumentException(paramString + ".cacheResponse != null");
    }
    if (paramdgc.j != null) {
      throw new IllegalArgumentException(paramString + ".priorResponse != null");
    }
  }
  
  public final dgc a()
  {
    if (this.a == null) {
      throw new IllegalStateException("request == null");
    }
    if (this.b == null) {
      throw new IllegalStateException("protocol == null");
    }
    if (this.c < 0) {
      throw new IllegalStateException("code < 0: " + this.c);
    }
    return new dgc(this);
  }
  
  public final dgd a(dfo paramdfo)
  {
    this.f = paramdfo.a();
    return this;
  }
  
  public final dgd a(dgc paramdgc)
  {
    if (paramdgc != null) {
      a("networkResponse", paramdgc);
    }
    this.h = paramdgc;
    return this;
  }
  
  public final dgd a(String paramString1, String paramString2)
  {
    this.f.c(paramString1, paramString2);
    return this;
  }
  
  public final dgd b(dgc paramdgc)
  {
    if (paramdgc != null) {
      a("cacheResponse", paramdgc);
    }
    this.i = paramdgc;
    return this;
  }
  
  public final dgd b(String paramString1, String paramString2)
  {
    this.f.a(paramString1, paramString2);
    return this;
  }
  
  public final dgd c(dgc paramdgc)
  {
    if ((paramdgc != null) && (paramdgc.g != null)) {
      throw new IllegalArgumentException("priorResponse.body != null");
    }
    this.j = paramdgc;
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
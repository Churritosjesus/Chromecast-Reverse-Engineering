public final class apg
{
  int a;
  public String b;
  public String c;
  public Integer d;
  String e;
  public String f;
  private Integer g;
  private Integer h;
  
  public static apg a(int paramInt)
  {
    apg localapg = new apg();
    localapg.a = paramInt;
    return localapg;
  }
  
  public final apd a()
  {
    apd localapd = new apd(this.a);
    if (this.f != null) {
      localapd.f = this.f;
    }
    ddc localddc = new ddc();
    if (this.c != null) {
      localddc.b = this.c;
    }
    if (this.b != null) {
      localddc.a = this.b;
    }
    if (this.d != null) {
      localddc.c = this.d;
    }
    if (this.g != null) {
      localddc.d = this.g;
    }
    if (this.h != null) {
      localddc.f = this.h;
    }
    if (this.e != null) {
      localddc.e = this.e;
    }
    localapd.g = localddc;
    return localapd;
  }
  
  public final apg b(int paramInt)
  {
    this.g = Integer.valueOf(paramInt);
    return this;
  }
  
  public final void b()
  {
    apd localapd = a();
    ape.a().a(localapd);
  }
  
  public final apg c(int paramInt)
  {
    this.h = Integer.valueOf(paramInt);
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\apg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
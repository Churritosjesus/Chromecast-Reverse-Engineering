public final class brm
  extends bra
{
  private final cpe a = new cpe();
  
  brm(brb parambrb)
  {
    super(parambrb);
  }
  
  protected final void a()
  {
    this.d.b().a().a(this.a);
    Object localObject = this.d.e();
    String str = ((bqt)localObject).c();
    if (str != null) {
      this.a.a = str;
    }
    localObject = ((bqt)localObject).b();
    if (localObject != null) {
      this.a.b = ((String)localObject);
    }
  }
  
  public final cpe b()
  {
    r();
    return this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
public final class btl
  implements btd
{
  final Object a = new Object();
  final buv b = new btm(this, null);
  final bts c = new bts(this);
  public btq d;
  public btr e;
  
  public btl()
  {
    buv localbuv = this.b;
    localbuv.d = this.c;
    if (localbuv.d == null) {
      localbuv.c();
    }
  }
  
  public final btj a()
  {
    synchronized (this.a)
    {
      btj localbtj = this.b.e;
      return localbtj;
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.b.a(paramString2);
  }
  
  public final btg b()
  {
    synchronized (this.a)
    {
      Object localObject1 = this.b;
      if (((buv)localObject1).e == null)
      {
        localObject1 = null;
        return (btg)localObject1;
      }
      localObject1 = ((buv)localObject1).e.b;
    }
  }
  
  public final String c()
  {
    return this.b.c;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\btl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
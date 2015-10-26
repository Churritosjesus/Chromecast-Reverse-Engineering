public class ddr
  extends ddh
{
  public ddq a;
  private final ddq b;
  private boolean c;
  
  public ddr(ddq paramddq)
  {
    this.b = paramddq;
    this.a = ((ddq)paramddq.a(ddt.e));
    this.c = false;
  }
  
  /* Error */
  private ddr b(ddn paramddn, ddp paramddp)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	ddr:b	Lddq;
    //   4: invokevirtual 39	ddq:f	()Ldee;
    //   7: aload_1
    //   8: aload_2
    //   9: invokeinterface 44 3 0
    //   14: checkcast 24	ddq
    //   17: astore_1
    //   18: aload_1
    //   19: ifnull +9 -> 28
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual 47	ddr:a	(Lddq;)Lddr;
    //   27: pop
    //   28: aload_0
    //   29: areturn
    //   30: astore_2
    //   31: aload_2
    //   32: getfield 50	ddx:a	Ldea;
    //   35: checkcast 24	ddq
    //   38: astore_1
    //   39: aload_2
    //   40: athrow
    //   41: astore_2
    //   42: aload_1
    //   43: ifnull +9 -> 52
    //   46: aload_0
    //   47: aload_1
    //   48: invokevirtual 47	ddr:a	(Lddq;)Lddr;
    //   51: pop
    //   52: aload_2
    //   53: athrow
    //   54: astore_2
    //   55: aconst_null
    //   56: astore_1
    //   57: goto -15 -> 42
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	ddr
    //   0	60	1	paramddn	ddn
    //   0	60	2	paramddp	ddp
    // Exception table:
    //   from	to	target	type
    //   0	18	30	ddx
    //   39	41	41	finally
    //   0	18	54	finally
    //   31	39	54	finally
  }
  
  private ddr e()
  {
    ddr localddr = this.b.g();
    localddr.a(f());
    return localddr;
  }
  
  private ddq f()
  {
    this.a.a(ddt.d);
    this.c = true;
    return this.a;
  }
  
  public final ddr a(ddq paramddq)
  {
    b();
    this.a.a(ddt.c, paramddq);
    return this;
  }
  
  public final void b()
  {
    if (this.c)
    {
      ddq localddq = (ddq)this.a.a(ddt.e);
      localddq.a(ddt.c, this.a);
      this.a = localddq;
      this.c = false;
    }
  }
  
  public final ddq c()
  {
    ddq localddq = f();
    if (!localddq.h()) {
      throw new dej();
    }
    return localddq;
  }
  
  public final boolean h()
  {
    return ddq.a(this.a, false);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
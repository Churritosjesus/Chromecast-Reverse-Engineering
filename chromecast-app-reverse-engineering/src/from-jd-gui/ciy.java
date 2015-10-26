public final class ciy
  extends cmm
{
  private static volatile ciy[] c;
  public int a = 0;
  public int b = 0;
  
  public ciy()
  {
    this.m = null;
    this.n = -1;
  }
  
  public static ciy[] b()
  {
    if (c == null) {}
    synchronized (cmq.a)
    {
      if (c == null) {
        c = new ciy[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    return super.a() + cmk.b(1, this.a) + cmk.b(2, this.b);
  }
  
  public final void a(cmk paramcmk)
  {
    paramcmk.a(1, this.a);
    paramcmk.a(2, this.b);
    super.a(paramcmk);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if ((paramObject instanceof ciy))
      {
        paramObject = (ciy)paramObject;
        bool1 = bool2;
        if (this.a == ((ciy)paramObject).a)
        {
          bool1 = bool2;
          if (this.b == ((ciy)paramObject).b) {
            bool1 = a((cmm)paramObject);
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return ((this.a + 527) * 31 + this.b) * 31 + c();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ciy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
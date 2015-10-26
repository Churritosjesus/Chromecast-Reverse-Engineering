public final class ciw
  extends cmm
{
  private static volatile ciw[] f;
  public String a = "";
  public long b = 0L;
  public long c = 2147483647L;
  public boolean d = false;
  public long e = 0L;
  
  public ciw()
  {
    this.m = null;
    this.n = -1;
  }
  
  public static ciw[] b()
  {
    if (f == null) {}
    synchronized (cmq.a)
    {
      if (f == null) {
        f = new ciw[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (!this.a.equals("")) {
      i = j + cmk.b(1, this.a);
    }
    j = i;
    if (this.b != 0L) {
      j = i + cmk.b(2, this.b);
    }
    int k = j;
    if (this.c != 2147483647L) {
      k = j + cmk.b(3, this.c);
    }
    i = k;
    if (this.d)
    {
      boolean bool = this.d;
      i = k + (cmk.c(4) + 1);
    }
    j = i;
    if (this.e != 0L) {
      j = i + cmk.b(5, this.e);
    }
    return j;
  }
  
  public final void a(cmk paramcmk)
  {
    if (!this.a.equals("")) {
      paramcmk.a(1, this.a);
    }
    if (this.b != 0L) {
      paramcmk.a(2, this.b);
    }
    if (this.c != 2147483647L) {
      paramcmk.a(3, this.c);
    }
    if (this.d) {
      paramcmk.a(4, this.d);
    }
    if (this.e != 0L) {
      paramcmk.a(5, this.e);
    }
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
      if ((paramObject instanceof ciw))
      {
        paramObject = (ciw)paramObject;
        if (this.a == null)
        {
          bool1 = bool2;
          if (((ciw)paramObject).a != null) {}
        }
        else
        {
          while (this.a.equals(((ciw)paramObject).a))
          {
            bool1 = bool2;
            if (this.b != ((ciw)paramObject).b) {
              break;
            }
            bool1 = bool2;
            if (this.c != ((ciw)paramObject).c) {
              break;
            }
            bool1 = bool2;
            if (this.d != ((ciw)paramObject).d) {
              break;
            }
            bool1 = bool2;
            if (this.e != ((ciw)paramObject).e) {
              break;
            }
            bool1 = a((cmm)paramObject);
            break;
          }
          bool1 = bool2;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i;
    int m;
    int k;
    if (this.a == null)
    {
      i = 0;
      m = (int)(this.b ^ this.b >>> 32);
      k = (int)(this.c ^ this.c >>> 32);
      if (!this.d) {
        break label107;
      }
    }
    label107:
    for (int j = 1231;; j = 1237)
    {
      return ((j + (((i + 527) * 31 + m) * 31 + k) * 31) * 31 + (int)(this.e ^ this.e >>> 32)) * 31 + c();
      i = this.a.hashCode();
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ciw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
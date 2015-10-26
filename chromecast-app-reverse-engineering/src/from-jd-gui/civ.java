public final class civ
  extends cmm
{
  private static volatile civ[] b;
  public int[] a = cmu.a;
  private int c = 0;
  private int d = 0;
  private boolean e = false;
  private boolean f = false;
  
  public civ()
  {
    this.m = null;
    this.n = -1;
  }
  
  public static civ[] b()
  {
    if (b == null) {}
    synchronized (cmq.a)
    {
      if (b == null) {
        b = new civ[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int j = 0;
    int k = super.a();
    int i = k;
    boolean bool;
    if (this.f)
    {
      bool = this.f;
      i = k + (cmk.c(1) + 1);
    }
    k = cmk.b(2, this.c) + i;
    if ((this.a != null) && (this.a.length > 0))
    {
      int m = 0;
      i = j;
      for (j = m; j < this.a.length; j++) {
        i += cmk.a(this.a[j]);
      }
    }
    for (j = k + i + this.a.length * 1;; j = k)
    {
      i = j;
      if (this.d != 0) {
        i = j + cmk.b(4, this.d);
      }
      j = i;
      if (this.e)
      {
        bool = this.e;
        j = i + (cmk.c(6) + 1);
      }
      return j;
    }
  }
  
  public final void a(cmk paramcmk)
  {
    if (this.f) {
      paramcmk.a(1, this.f);
    }
    paramcmk.a(2, this.c);
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++) {
        paramcmk.a(3, this.a[i]);
      }
    }
    if (this.d != 0) {
      paramcmk.a(4, this.d);
    }
    if (this.e) {
      paramcmk.a(6, this.e);
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
      if ((paramObject instanceof civ))
      {
        paramObject = (civ)paramObject;
        bool1 = bool2;
        if (cmq.a(this.a, ((civ)paramObject).a))
        {
          bool1 = bool2;
          if (this.c == ((civ)paramObject).c)
          {
            bool1 = bool2;
            if (this.d == ((civ)paramObject).d)
            {
              bool1 = bool2;
              if (this.e == ((civ)paramObject).e)
              {
                bool1 = bool2;
                if (this.f == ((civ)paramObject).f) {
                  bool1 = a((cmm)paramObject);
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int j = 1231;
    int m = cmq.a(this.a);
    int n = this.c;
    int k = this.d;
    int i;
    if (this.e)
    {
      i = 1231;
      if (!this.f) {
        break label85;
      }
    }
    for (;;)
    {
      return ((i + (((m + 527) * 31 + n) * 31 + k) * 31) * 31 + j) * 31 + c();
      i = 1237;
      break;
      label85:
      j = 1237;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\civ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
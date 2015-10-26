public final class cmw
  extends cmm
{
  private int a = 0;
  private String b = "";
  private String c = "";
  
  public cmw()
  {
    this.m = null;
    this.n = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.a != 0) {
      i = j + cmk.b(1, this.a);
    }
    j = i;
    if (!this.b.equals("")) {
      j = i + cmk.b(2, this.b);
    }
    i = j;
    if (!this.c.equals("")) {
      i = j + cmk.b(3, this.c);
    }
    return i;
  }
  
  public final void a(cmk paramcmk)
  {
    if (this.a != 0) {
      paramcmk.a(1, this.a);
    }
    if (!this.b.equals("")) {
      paramcmk.a(2, this.b);
    }
    if (!this.c.equals("")) {
      paramcmk.a(3, this.c);
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
      if ((paramObject instanceof cmw))
      {
        paramObject = (cmw)paramObject;
        bool1 = bool2;
        if (this.a == ((cmw)paramObject).a)
        {
          if (this.b == null)
          {
            bool1 = bool2;
            if (((cmw)paramObject).b != null) {
              continue;
            }
            label54:
            if (this.c != null) {
              break label98;
            }
            bool1 = bool2;
            if (((cmw)paramObject).c != null) {
              continue;
            }
          }
          label98:
          while (this.c.equals(((cmw)paramObject).c))
          {
            bool1 = a((cmm)paramObject);
            break;
            if (this.b.equals(((cmw)paramObject).b)) {
              break label54;
            }
            bool1 = bool2;
            break;
          }
          bool1 = bool2;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int j = 0;
    int k = this.a;
    int i;
    if (this.b == null)
    {
      i = 0;
      if (this.c != null) {
        break label58;
      }
    }
    for (;;)
    {
      return ((i + (k + 527) * 31) * 31 + j) * 31 + c();
      i = this.b.hashCode();
      break;
      label58:
      j = this.c.hashCode();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
public final class cix
  extends cmm
{
  public cje[] a = cje.b();
  public cje[] b = cje.b();
  public ciw[] c = ciw.b();
  
  public cix()
  {
    this.m = null;
    this.n = -1;
  }
  
  protected final int a()
  {
    int m = 0;
    int i = super.a();
    int j = i;
    Object localObject;
    if (this.a != null)
    {
      j = i;
      if (this.a.length > 0)
      {
        k = 0;
        while (k < this.a.length)
        {
          localObject = this.a[k];
          j = i;
          if (localObject != null) {
            j = i + cmk.b(1, (cms)localObject);
          }
          k++;
          i = j;
        }
        j = i;
      }
    }
    i = j;
    if (this.b != null)
    {
      i = j;
      if (this.b.length > 0)
      {
        i = j;
        k = 0;
        while (k < this.b.length)
        {
          localObject = this.b[k];
          j = i;
          if (localObject != null) {
            j = i + cmk.b(2, (cms)localObject);
          }
          k++;
          i = j;
        }
      }
    }
    int k = i;
    if (this.c != null)
    {
      k = i;
      if (this.c.length > 0)
      {
        j = m;
        for (;;)
        {
          k = i;
          if (j >= this.c.length) {
            break;
          }
          localObject = this.c[j];
          k = i;
          if (localObject != null) {
            k = i + cmk.b(3, (cms)localObject);
          }
          j++;
          i = k;
        }
      }
    }
    return k;
  }
  
  public final void a(cmk paramcmk)
  {
    int j = 0;
    int i;
    Object localObject;
    if ((this.a != null) && (this.a.length > 0)) {
      for (i = 0; i < this.a.length; i++)
      {
        localObject = this.a[i];
        if (localObject != null) {
          paramcmk.a(1, (cms)localObject);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (i = 0; i < this.b.length; i++)
      {
        localObject = this.b[i];
        if (localObject != null) {
          paramcmk.a(2, (cms)localObject);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (i = j; i < this.c.length; i++)
      {
        localObject = this.c[i];
        if (localObject != null) {
          paramcmk.a(3, (cms)localObject);
        }
      }
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
      if ((paramObject instanceof cix))
      {
        paramObject = (cix)paramObject;
        bool1 = bool2;
        if (cmq.a(this.a, ((cix)paramObject).a))
        {
          bool1 = bool2;
          if (cmq.a(this.b, ((cix)paramObject).b))
          {
            bool1 = bool2;
            if (cmq.a(this.c, ((cix)paramObject).c)) {
              bool1 = a((cmm)paramObject);
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return (((cmq.a(this.a) + 527) * 31 + cmq.a(this.b)) * 31 + cmq.a(this.c)) * 31 + c();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
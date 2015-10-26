final class cmo
  implements Cloneable
{
  static final cmp a = new cmp();
  int[] b;
  cmp[] c;
  int d;
  private boolean e = false;
  
  public cmo()
  {
    this(10);
  }
  
  private cmo(int paramInt)
  {
    paramInt = b(paramInt);
    this.b = new int[paramInt];
    this.c = new cmp[paramInt];
    this.d = 0;
  }
  
  public final cmp a(int paramInt)
  {
    paramInt = c(paramInt);
    if ((paramInt < 0) || (this.c[paramInt] == a)) {}
    for (cmp localcmp = null;; localcmp = this.c[paramInt]) {
      return localcmp;
    }
  }
  
  public final boolean a()
  {
    if (this.d == 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  int b(int paramInt)
  {
    int j = paramInt << 2;
    for (int i = 4;; i++)
    {
      paramInt = j;
      if (i < 32)
      {
        if (j <= (1 << i) - 12) {
          paramInt = (1 << i) - 12;
        }
      }
      else {
        return paramInt / 4;
      }
    }
  }
  
  public final cmo b()
  {
    int i = 0;
    int j = this.d;
    cmo localcmo = new cmo(j);
    System.arraycopy(this.b, 0, localcmo.b, 0, j);
    while (i < j)
    {
      if (this.c[i] != null) {
        localcmo.c[i] = this.c[i].b();
      }
      i++;
    }
    localcmo.d = j;
    return localcmo;
  }
  
  int c(int paramInt)
  {
    int j = this.d;
    int i = 0;
    j--;
    while (i <= j)
    {
      int k = i + j >>> 1;
      int m = this.b[k];
      if (m < paramInt)
      {
        i = k + 1;
      }
      else
      {
        j = k;
        if (m <= paramInt) {
          return j;
        }
        j = k - 1;
      }
    }
    j = i ^ 0xFFFFFFFF;
    return j;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {}
    label65:
    label86:
    label110:
    label157:
    label163:
    label167:
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof cmo))
      {
        bool = false;
      }
      else
      {
        paramObject = (cmo)paramObject;
        if (this.d != ((cmo)paramObject).d)
        {
          bool = false;
        }
        else
        {
          Object localObject = this.b;
          int[] arrayOfInt = ((cmo)paramObject).b;
          int j = this.d;
          int i = 0;
          if (i < j) {
            if (localObject[i] != arrayOfInt[i])
            {
              i = 0;
              if (i != 0)
              {
                localObject = this.c;
                paramObject = ((cmo)paramObject).c;
                j = this.d;
                i = 0;
                if (i >= j) {
                  break label163;
                }
                if (localObject[i].equals(paramObject[i])) {
                  break label157;
                }
              }
            }
          }
          for (i = 0;; i = 1)
          {
            if (i != 0) {
              break label167;
            }
            bool = false;
            break;
            i++;
            break label65;
            i = 1;
            break label86;
            i++;
            break label110;
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = 17;
    for (int j = 0; j < this.d; j++) {
      i = (i * 31 + this.b[j]) * 31 + this.c[j].hashCode();
    }
    return i;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
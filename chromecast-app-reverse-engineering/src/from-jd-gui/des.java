public final class des
  implements Cloneable
{
  static final det a = new det();
  int[] b;
  det[] c;
  int d;
  private boolean e = false;
  
  des()
  {
    this(10);
  }
  
  private des(int paramInt)
  {
    paramInt = a(paramInt);
    this.b = new int[paramInt];
    this.c = new det[paramInt];
    this.d = 0;
  }
  
  int a(int paramInt)
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
  
  public final des a()
  {
    int i = 0;
    int j = this.d;
    des localdes = new des(j);
    System.arraycopy(this.b, 0, localdes.b, 0, j);
    while (i < j)
    {
      if (this.c[i] != null) {
        localdes.c[i] = this.c[i].b();
      }
      i++;
    }
    localdes.d = j;
    return localdes;
  }
  
  int b(int paramInt)
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
      if (!(paramObject instanceof des))
      {
        bool = false;
      }
      else
      {
        paramObject = (des)paramObject;
        if (this.d != ((des)paramObject).d)
        {
          bool = false;
        }
        else
        {
          int[] arrayOfInt = this.b;
          Object localObject = ((des)paramObject).b;
          int j = this.d;
          int i = 0;
          if (i < j) {
            if (arrayOfInt[i] != localObject[i])
            {
              i = 0;
              if (i != 0)
              {
                localObject = this.c;
                paramObject = ((des)paramObject).c;
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


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\des.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
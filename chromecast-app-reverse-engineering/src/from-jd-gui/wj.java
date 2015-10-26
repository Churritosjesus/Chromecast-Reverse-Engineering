final class wj
{
  int a;
  int b;
  int c;
  
  wj(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if (this == paramObject) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        bool1 = false;
      }
      else
      {
        paramObject = (wj)paramObject;
        if (this.a != ((wj)paramObject).a)
        {
          bool1 = false;
        }
        else if ((this.a == 3) && (Math.abs(this.c - this.b) == 1) && (this.c == ((wj)paramObject).b))
        {
          bool1 = bool2;
          if (this.b == ((wj)paramObject).c) {}
        }
        else if (this.c != ((wj)paramObject).c)
        {
          bool1 = false;
        }
        else
        {
          bool1 = bool2;
          if (this.b != ((wj)paramObject).b) {
            bool1 = false;
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return (this.a * 31 + this.b) * 31 + this.c;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[");
    String str;
    switch (this.a)
    {
    default: 
      str = "??";
    }
    for (;;)
    {
      return str + ",s:" + this.b + "c:" + this.c + "]";
      str = "add";
      continue;
      str = "rm";
      continue;
      str = "up";
      continue;
      str = "mv";
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
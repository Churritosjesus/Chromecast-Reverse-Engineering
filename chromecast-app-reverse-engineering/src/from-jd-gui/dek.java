import java.util.Arrays;

public final class dek
{
  private static final int[] a = new int[0];
  private static final Object[] b = new Object[0];
  private static final dek c = new dek(0, a, b);
  private int d;
  private int[] e;
  private Object[] f;
  private int g = -1;
  
  dek(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject)
  {
    this.d = paramInt;
    this.e = paramArrayOfInt;
    this.f = paramArrayOfObject;
  }
  
  public static dek a()
  {
    return c;
  }
  
  static dek a(dek paramdek1, dek paramdek2)
  {
    int i = paramdek1.d + paramdek2.d;
    int[] arrayOfInt = Arrays.copyOf(paramdek1.e, i);
    System.arraycopy(paramdek2.e, 0, arrayOfInt, paramdek1.d, paramdek2.d);
    Object[] arrayOfObject = Arrays.copyOf(paramdek1.f, i);
    System.arraycopy(paramdek2.f, 0, arrayOfObject, paramdek1.d, paramdek2.d);
    return new dek(i, arrayOfInt, arrayOfObject);
  }
  
  public static del b()
  {
    return new del();
  }
  
  public final void a(ddo paramddo)
  {
    int i = 0;
    if (i < this.d)
    {
      int k = this.e[i];
      int j = den.b(k);
      long l;
      switch (den.a(k))
      {
      case 4: 
      default: 
        throw ddx.f();
      case 0: 
        l = ((Long)this.f[i]).longValue();
        paramddo.d(j, 0);
        paramddo.a(l);
      }
      for (;;)
      {
        i++;
        break;
        k = ((Integer)this.f[i]).intValue();
        paramddo.d(j, 5);
        paramddo.a(k & 0xFF);
        paramddo.a(k >> 8 & 0xFF);
        paramddo.a(k >> 16 & 0xFF);
        paramddo.a(k >>> 24);
        continue;
        l = ((Long)this.f[i]).longValue();
        paramddo.d(j, 1);
        paramddo.a((int)l & 0xFF);
        paramddo.a((int)(l >> 8) & 0xFF);
        paramddo.a((int)(l >> 16) & 0xFF);
        paramddo.a((int)(l >> 24) & 0xFF);
        paramddo.a((int)(l >> 32) & 0xFF);
        paramddo.a((int)(l >> 40) & 0xFF);
        paramddo.a((int)(l >> 48) & 0xFF);
        paramddo.a((int)(l >> 56) & 0xFF);
        continue;
        ddl localddl = (ddl)this.f[i];
        paramddo.d(j, 2);
        paramddo.c(localddl.b());
        j = localddl.b();
        if (paramddo.b - paramddo.c >= j)
        {
          localddl.a(paramddo.a, 0, paramddo.c, j);
          paramddo.c += j;
          paramddo.d += j;
        }
        else
        {
          i = paramddo.b - paramddo.c;
          localddl.a(paramddo.a, 0, paramddo.c, i);
          paramddo.c = paramddo.b;
          paramddo.d += i;
          throw new cml();
          paramddo.d(j, 3);
          ((dek)this.f[i]).a(paramddo);
          paramddo.d(j, 4);
        }
      }
    }
  }
  
  public final int c()
  {
    int i = this.g;
    if (i != -1) {}
    for (;;)
    {
      return i;
      int j = 0;
      i = 0;
      if (j < this.d)
      {
        int k = this.e[j];
        int m = den.b(k);
        switch (den.a(k))
        {
        case 4: 
        default: 
          throw new IllegalStateException(ddx.f());
        case 0: 
          i += ddo.a(m, ((Long)this.f[j]).longValue());
        }
        for (;;)
        {
          j++;
          break;
          i += ddo.b(m, ((Integer)this.f[j]).intValue());
          continue;
          i += ddo.c(m, ((Long)this.f[j]).longValue());
          continue;
          i += ddo.a(m, (ddl)this.f[j]);
          continue;
          k = ddo.b(m);
          i += ((dek)this.f[j]).c() + (k << 1);
        }
      }
      this.g = i;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (paramObject == null)
      {
        bool = false;
      }
      else if (!(paramObject instanceof dek))
      {
        bool = false;
      }
      else
      {
        paramObject = (dek)paramObject;
        if ((this.d != ((dek)paramObject).d) || (!Arrays.equals(this.e, ((dek)paramObject).e)) || (!Arrays.deepEquals(this.f, ((dek)paramObject).f))) {
          bool = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return ((this.d + 527) * 31 + Arrays.hashCode(this.e)) * 31 + Arrays.deepHashCode(this.f);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
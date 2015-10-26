import java.util.Arrays;

public final class del
{
  private int a = 0;
  private int[] b = dek.d();
  private Object[] c = dek.e();
  private boolean d;
  
  private void a(int paramInt, Object paramObject)
  {
    if (this.a == this.b.length) {
      if (this.a >= 4) {
        break label85;
      }
    }
    label85:
    for (int i = 8;; i = this.a >> 1)
    {
      i += this.a;
      this.b = Arrays.copyOf(this.b, i);
      this.c = Arrays.copyOf(this.c, i);
      this.b[this.a] = paramInt;
      this.c[this.a] = paramObject;
      this.a += 1;
      return;
    }
  }
  
  private void b()
  {
    if (this.d) {
      throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
    }
  }
  
  public final dek a()
  {
    if (this.d) {
      throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
    }
    this.d = true;
    if (this.a == 0) {}
    for (dek localdek = dek.f();; localdek = new dek(this.a, this.b, this.c)) {
      return localdek;
    }
  }
  
  public final del a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      throw new IllegalArgumentException("Zero is not a valid field number.");
    }
    b();
    a(den.a(paramInt1, 0), Long.valueOf(paramInt2));
    return this;
  }
  
  public final boolean a(int paramInt, ddn paramddn)
  {
    b();
    int i = den.b(paramInt);
    boolean bool;
    switch (den.a(paramInt))
    {
    default: 
      throw ddx.f();
    case 0: 
      a(paramInt, Long.valueOf(paramddn.b()));
      bool = true;
    }
    for (;;)
    {
      return bool;
      int j = paramddn.c;
      i = j;
      if (paramddn.b - j < 4)
      {
        paramddn.b(4);
        i = paramddn.c;
      }
      Object localObject = paramddn.a;
      paramddn.c = (i + 4);
      int m = localObject[i];
      j = localObject[(i + 1)];
      int k = localObject[(i + 2)];
      a(paramInt, Integer.valueOf((localObject[(i + 3)] & 0xFF) << 24 | m & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16));
      bool = true;
      continue;
      j = paramddn.c;
      i = j;
      if (paramddn.b - j < 8)
      {
        paramddn.b(8);
        i = paramddn.c;
      }
      localObject = paramddn.a;
      paramddn.c = (i + 8);
      long l4 = localObject[i];
      long l1 = localObject[(i + 1)];
      long l3 = localObject[(i + 2)];
      long l7 = localObject[(i + 3)];
      long l2 = localObject[(i + 4)];
      long l6 = localObject[(i + 5)];
      long l5 = localObject[(i + 6)];
      a(paramInt, Long.valueOf((localObject[(i + 7)] & 0xFF) << 56 | l4 & 0xFF | (l1 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l7 & 0xFF) << 24 | (l2 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l5 & 0xFF) << 48));
      bool = true;
      continue;
      i = paramddn.d();
      if ((i <= paramddn.b - paramddn.c) && (i > 0))
      {
        localObject = ddl.a(paramddn.a, paramddn.c, i);
        paramddn.c = (i + paramddn.c);
        paramddn = (ddn)localObject;
      }
      for (;;)
      {
        a(paramInt, paramddn);
        bool = true;
        break;
        if (i == 0) {
          paramddn = ddl.a;
        } else {
          paramddn = new ddy(paramddn.c(i));
        }
      }
      localObject = dek.b();
      do
      {
        j = paramddn.a();
      } while ((j != 0) && (((del)localObject).a(j, paramddn)));
      paramddn.a(den.a(i, 4));
      a(paramInt, ((del)localObject).a());
      bool = true;
      continue;
      bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\del.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
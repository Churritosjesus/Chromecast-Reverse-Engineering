import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class dih
{
  final List a = new ArrayList();
  final dkd b;
  int c;
  int d;
  die[] e = new die[8];
  private int f = this.e.length - 1;
  private int g = 0;
  private int h = 0;
  
  dih(int paramInt, dkv paramdkv)
  {
    this.c = paramInt;
    this.d = paramInt;
    this.b = dkk.a(paramdkv);
  }
  
  private void c()
  {
    this.a.clear();
    Arrays.fill(this.e, null);
    this.f = (this.e.length - 1);
    this.g = 0;
    this.h = 0;
  }
  
  static boolean c(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= dig.a().length - 1)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private int d()
  {
    return this.b.g() & 0xFF;
  }
  
  private int d(int paramInt)
  {
    int i = 0;
    int j = 0;
    if (paramInt > 0)
    {
      int k = this.e.length - 1;
      i = paramInt;
      paramInt = j;
      for (j = k; (j >= this.f) && (i > 0); j--)
      {
        i -= this.e[j].j;
        this.h -= this.e[j].j;
        this.g -= 1;
        paramInt++;
      }
      System.arraycopy(this.e, this.f + 1, this.e, this.f + 1 + paramInt, this.g);
      this.f += paramInt;
      i = paramInt;
    }
    return i;
  }
  
  int a(int paramInt)
  {
    return this.f + 1 + paramInt;
  }
  
  final int a(int paramInt1, int paramInt2)
  {
    paramInt1 &= paramInt2;
    if (paramInt1 < paramInt2) {}
    for (;;)
    {
      return paramInt1;
      int i;
      for (paramInt1 = 0;; paramInt1 += 7)
      {
        i = d();
        if ((i & 0x80) == 0) {
          break;
        }
        paramInt2 += ((i & 0x7F) << paramInt1);
      }
      paramInt1 = (i << paramInt1) + paramInt2;
    }
  }
  
  void a()
  {
    if (this.d < this.h)
    {
      if (this.d != 0) {
        break label23;
      }
      c();
    }
    for (;;)
    {
      return;
      label23:
      d(this.h - this.d);
    }
  }
  
  void a(int paramInt, die paramdie)
  {
    this.a.add(paramdie);
    int i = paramdie.j;
    if (i > this.d) {
      c();
    }
    for (;;)
    {
      return;
      d(this.h + i - this.d);
      if (this.g + 1 > this.e.length)
      {
        die[] arrayOfdie = new die[this.e.length << 1];
        System.arraycopy(this.e, 0, arrayOfdie, this.e.length, this.e.length);
        this.f = (this.e.length - 1);
        this.e = arrayOfdie;
      }
      paramInt = this.f;
      this.f = (paramInt - 1);
      this.e[paramInt] = paramdie;
      this.g += 1;
      this.h = (i + this.h);
    }
  }
  
  final dke b()
  {
    int j = 0;
    int k = d();
    int i;
    dio localdio;
    byte[] arrayOfByte;
    ByteArrayOutputStream localByteArrayOutputStream;
    if ((k & 0x80) == 128)
    {
      i = 1;
      k = a(k, 127);
      if (i != 0)
      {
        localdio = dio.a();
        arrayOfByte = this.b.e(k);
        localByteArrayOutputStream = new ByteArrayOutputStream();
        localObject1 = localdio.a;
        k = 0;
        i = 0;
      }
    }
    else
    {
      int m;
      Object localObject2;
      for (;;)
      {
        m = i;
        localObject2 = localObject1;
        if (j >= arrayOfByte.length) {
          break label188;
        }
        k = k << 8 | arrayOfByte[j] & 0xFF;
        i += 8;
        for (;;)
        {
          if (i < 8) {
            break label182;
          }
          localObject1 = localObject1.a[(k >>> i - 8 & 0xFF)];
          if (((dip)localObject1).a == null)
          {
            localByteArrayOutputStream.write(((dip)localObject1).b);
            i -= ((dip)localObject1).c;
            localObject1 = localdio.a;
            continue;
            i = 0;
            break;
          }
          i -= 8;
        }
        label182:
        j++;
      }
      label188:
      while (m > 0)
      {
        localObject1 = localObject2.a[(k << 8 - m & 0xFF)];
        if ((((dip)localObject1).a != null) || (((dip)localObject1).c > m)) {
          break;
        }
        localByteArrayOutputStream.write(((dip)localObject1).b);
        m -= ((dip)localObject1).c;
        localObject2 = localdio.a;
      }
    }
    for (Object localObject1 = dke.a(localByteArrayOutputStream.toByteArray());; localObject1 = this.b.c(k)) {
      return (dke)localObject1;
    }
  }
  
  dke b(int paramInt)
  {
    if (c(paramInt)) {}
    for (dke localdke = dig.a()[paramInt].h;; localdke = this.e[a(paramInt - dig.a().length)].h) {
      return localdke;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
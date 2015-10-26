import java.util.Arrays;

public final class cmy
  extends cmm
{
  public long a = 0L;
  public byte[] b = cmu.d;
  public long c = 180000L;
  private long d = 0L;
  private String e = "";
  private int f = 0;
  private int g = 0;
  private boolean h = false;
  private cmz[] i = cmz.b();
  private cmw j = null;
  private byte[] k = cmu.d;
  private byte[] l = cmu.d;
  private cmv o = null;
  private String p = "";
  private cmx q = null;
  
  public cmy()
  {
    this.m = null;
    this.n = -1;
  }
  
  protected final int a()
  {
    int m = super.a();
    int n = m;
    if (this.a != 0L) {
      n = m + cmk.b(1, this.a);
    }
    m = n;
    if (!this.e.equals("")) {
      m = n + cmk.b(2, this.e);
    }
    n = m;
    if (this.i != null)
    {
      n = m;
      if (this.i.length > 0)
      {
        n = 0;
        while (n < this.i.length)
        {
          cmz localcmz = this.i[n];
          i1 = m;
          if (localcmz != null) {
            i1 = m + cmk.b(3, localcmz);
          }
          n++;
          m = i1;
        }
        n = m;
      }
    }
    int i1 = n;
    if (!Arrays.equals(this.b, cmu.d)) {
      i1 = n + cmk.b(6, this.b);
    }
    m = i1;
    if (this.o != null) {
      m = i1 + cmk.b(7, this.o);
    }
    i1 = m;
    if (!Arrays.equals(this.k, cmu.d)) {
      i1 = m + cmk.b(8, this.k);
    }
    n = i1;
    if (this.j != null) {
      n = i1 + cmk.b(9, this.j);
    }
    m = n;
    if (this.h)
    {
      boolean bool = this.h;
      m = n + (cmk.c(10) + 1);
    }
    n = m;
    if (this.f != 0) {
      n = m + cmk.b(11, this.f);
    }
    m = n;
    if (this.g != 0) {
      m = n + cmk.b(12, this.g);
    }
    i1 = m;
    if (!Arrays.equals(this.l, cmu.d)) {
      i1 = m + cmk.b(13, this.l);
    }
    n = i1;
    if (!this.p.equals("")) {
      n = i1 + cmk.b(14, this.p);
    }
    m = n;
    if (this.c != 180000L)
    {
      long l1 = this.c;
      m = n + (cmk.c(15) + cmk.b(cmk.c(l1)));
    }
    n = m;
    if (this.q != null) {
      n = m + cmk.b(16, this.q);
    }
    m = n;
    if (this.d != 0L) {
      m = n + cmk.b(17, this.d);
    }
    return m;
  }
  
  public final void a(cmk paramcmk)
  {
    if (this.a != 0L) {
      paramcmk.a(1, this.a);
    }
    if (!this.e.equals("")) {
      paramcmk.a(2, this.e);
    }
    if ((this.i != null) && (this.i.length > 0)) {
      for (int m = 0; m < this.i.length; m++)
      {
        cmz localcmz = this.i[m];
        if (localcmz != null) {
          paramcmk.a(3, localcmz);
        }
      }
    }
    if (!Arrays.equals(this.b, cmu.d)) {
      paramcmk.a(6, this.b);
    }
    if (this.o != null) {
      paramcmk.a(7, this.o);
    }
    if (!Arrays.equals(this.k, cmu.d)) {
      paramcmk.a(8, this.k);
    }
    if (this.j != null) {
      paramcmk.a(9, this.j);
    }
    if (this.h) {
      paramcmk.a(10, this.h);
    }
    if (this.f != 0) {
      paramcmk.a(11, this.f);
    }
    if (this.g != 0) {
      paramcmk.a(12, this.g);
    }
    if (!Arrays.equals(this.l, cmu.d)) {
      paramcmk.a(13, this.l);
    }
    if (!this.p.equals("")) {
      paramcmk.a(14, this.p);
    }
    if (this.c != 180000L)
    {
      long l1 = this.c;
      paramcmk.c(15, 0);
      paramcmk.a(cmk.c(l1));
    }
    if (this.q != null) {
      paramcmk.a(16, this.q);
    }
    if (this.d != 0L) {
      paramcmk.a(17, this.d);
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
      if ((paramObject instanceof cmy))
      {
        paramObject = (cmy)paramObject;
        bool1 = bool2;
        if (this.a == ((cmy)paramObject).a)
        {
          bool1 = bool2;
          if (this.d == ((cmy)paramObject).d)
          {
            if (this.e == null)
            {
              bool1 = bool2;
              if (((cmy)paramObject).e != null) {
                continue;
              }
              label69:
              bool1 = bool2;
              if (this.f != ((cmy)paramObject).f) {
                continue;
              }
              bool1 = bool2;
              if (this.g != ((cmy)paramObject).g) {
                continue;
              }
              bool1 = bool2;
              if (this.h != ((cmy)paramObject).h) {
                continue;
              }
              bool1 = bool2;
              if (!cmq.a(this.i, ((cmy)paramObject).i)) {
                continue;
              }
              if (this.j != null) {
                break label278;
              }
              bool1 = bool2;
              if (((cmy)paramObject).j != null) {
                continue;
              }
              label140:
              bool1 = bool2;
              if (!Arrays.equals(this.b, ((cmy)paramObject).b)) {
                continue;
              }
              bool1 = bool2;
              if (!Arrays.equals(this.k, ((cmy)paramObject).k)) {
                continue;
              }
              bool1 = bool2;
              if (!Arrays.equals(this.l, ((cmy)paramObject).l)) {
                continue;
              }
              if (this.o != null) {
                break label297;
              }
              bool1 = bool2;
              if (((cmy)paramObject).o != null) {
                continue;
              }
              label204:
              if (this.p != null) {
                break label316;
              }
              bool1 = bool2;
              if (((cmy)paramObject).p != null) {
                continue;
              }
              label220:
              bool1 = bool2;
              if (this.c != ((cmy)paramObject).c) {
                continue;
              }
              if (this.q != null) {
                break label335;
              }
              bool1 = bool2;
              if (((cmy)paramObject).q != null) {
                continue;
              }
            }
            label278:
            label297:
            label316:
            label335:
            while (this.q.equals(((cmy)paramObject).q))
            {
              bool1 = a((cmm)paramObject);
              break;
              if (this.e.equals(((cmy)paramObject).e)) {
                break label69;
              }
              bool1 = bool2;
              break;
              if (this.j.equals(((cmy)paramObject).j)) {
                break label140;
              }
              bool1 = bool2;
              break;
              if (this.o.equals(((cmy)paramObject).o)) {
                break label204;
              }
              bool1 = bool2;
              break;
              if (this.p.equals(((cmy)paramObject).p)) {
                break label220;
              }
              bool1 = bool2;
              break;
            }
            bool1 = bool2;
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i4 = 0;
    int i5 = (int)(this.a ^ this.a >>> 32);
    int i6 = (int)(this.d ^ this.d >>> 32);
    int m;
    int i7;
    int i8;
    int n;
    label65:
    int i9;
    int i1;
    label83:
    int i10;
    int i11;
    int i12;
    int i2;
    label120:
    int i3;
    label130:
    int i13;
    if (this.e == null)
    {
      m = 0;
      i7 = this.f;
      i8 = this.g;
      if (!this.h) {
        break label259;
      }
      n = 1231;
      i9 = cmq.a(this.i);
      if (this.j != null) {
        break label266;
      }
      i1 = 0;
      i10 = Arrays.hashCode(this.b);
      i11 = Arrays.hashCode(this.k);
      i12 = Arrays.hashCode(this.l);
      if (this.o != null) {
        break label277;
      }
      i2 = 0;
      if (this.p != null) {
        break label289;
      }
      i3 = 0;
      i13 = (int)(this.c ^ this.c >>> 32);
      if (this.q != null) {
        break label301;
      }
    }
    for (;;)
    {
      return (((i3 + (i2 + ((((i1 + ((n + (((m + ((i5 + 527) * 31 + i6) * 31) * 31 + i7) * 31 + i8) * 31) * 31 + i9) * 31) * 31 + i10) * 31 + i11) * 31 + i12) * 31) * 31) * 31 + i13) * 31 + i4) * 31 + c();
      m = this.e.hashCode();
      break;
      label259:
      n = 1237;
      break label65;
      label266:
      i1 = this.j.hashCode();
      break label83;
      label277:
      i2 = this.o.hashCode();
      break label120;
      label289:
      i3 = this.p.hashCode();
      break label130;
      label301:
      i4 = this.q.hashCode();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
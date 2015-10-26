public final class cje
  extends cmm
{
  private static volatile cje[] o;
  public int a = 1;
  public String b = "";
  public cje[] c = b();
  public cje[] d = b();
  public cje[] e = b();
  public String f = "";
  public String g = "";
  public long h = 0L;
  public boolean i = false;
  public cje[] j = b();
  public int[] k = cmu.a;
  public boolean l = false;
  
  public cje()
  {
    this.m = null;
    this.n = -1;
  }
  
  public static cje[] b()
  {
    if (o == null) {}
    synchronized (cmq.a)
    {
      if (o == null) {
        o = new cje[0];
      }
      return o;
    }
  }
  
  protected final int a()
  {
    int i2 = 0;
    int m = super.a() + cmk.b(1, this.a);
    int n = m;
    if (!this.b.equals("")) {
      n = m + cmk.b(2, this.b);
    }
    m = n;
    cje localcje;
    if (this.c != null)
    {
      m = n;
      if (this.c.length > 0)
      {
        m = n;
        n = 0;
        while (n < this.c.length)
        {
          localcje = this.c[n];
          i1 = m;
          if (localcje != null) {
            i1 = m + cmk.b(3, localcje);
          }
          n++;
          m = i1;
        }
      }
    }
    n = m;
    if (this.d != null)
    {
      n = m;
      if (this.d.length > 0)
      {
        n = 0;
        while (n < this.d.length)
        {
          localcje = this.d[n];
          i1 = m;
          if (localcje != null) {
            i1 = m + cmk.b(4, localcje);
          }
          n++;
          m = i1;
        }
        n = m;
      }
    }
    m = n;
    if (this.e != null)
    {
      m = n;
      if (this.e.length > 0)
      {
        m = n;
        n = 0;
        while (n < this.e.length)
        {
          localcje = this.e[n];
          i1 = m;
          if (localcje != null) {
            i1 = m + cmk.b(5, localcje);
          }
          n++;
          m = i1;
        }
      }
    }
    n = m;
    if (!this.f.equals("")) {
      n = m + cmk.b(6, this.f);
    }
    m = n;
    if (!this.g.equals("")) {
      m = n + cmk.b(7, this.g);
    }
    int i1 = m;
    if (this.h != 0L) {
      i1 = m + cmk.b(8, this.h);
    }
    n = i1;
    boolean bool;
    if (this.l)
    {
      bool = this.l;
      n = i1 + (cmk.c(9) + 1);
    }
    m = n;
    if (this.k != null)
    {
      m = n;
      if (this.k.length > 0)
      {
        m = 0;
        i1 = 0;
        while (m < this.k.length)
        {
          i1 += cmk.a(this.k[m]);
          m++;
        }
        m = n + i1 + this.k.length * 1;
      }
    }
    n = m;
    if (this.j != null)
    {
      n = m;
      if (this.j.length > 0)
      {
        i1 = i2;
        for (;;)
        {
          n = m;
          if (i1 >= this.j.length) {
            break;
          }
          localcje = this.j[i1];
          n = m;
          if (localcje != null) {
            n = m + cmk.b(11, localcje);
          }
          i1++;
          m = n;
        }
      }
    }
    m = n;
    if (this.i)
    {
      bool = this.i;
      m = n + (cmk.c(12) + 1);
    }
    return m;
  }
  
  public final void a(cmk paramcmk)
  {
    int n = 0;
    paramcmk.a(1, this.a);
    if (!this.b.equals("")) {
      paramcmk.a(2, this.b);
    }
    int m;
    cje localcje;
    if ((this.c != null) && (this.c.length > 0)) {
      for (m = 0; m < this.c.length; m++)
      {
        localcje = this.c[m];
        if (localcje != null) {
          paramcmk.a(3, localcje);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (m = 0; m < this.d.length; m++)
      {
        localcje = this.d[m];
        if (localcje != null) {
          paramcmk.a(4, localcje);
        }
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (m = 0; m < this.e.length; m++)
      {
        localcje = this.e[m];
        if (localcje != null) {
          paramcmk.a(5, localcje);
        }
      }
    }
    if (!this.f.equals("")) {
      paramcmk.a(6, this.f);
    }
    if (!this.g.equals("")) {
      paramcmk.a(7, this.g);
    }
    if (this.h != 0L) {
      paramcmk.a(8, this.h);
    }
    if (this.l) {
      paramcmk.a(9, this.l);
    }
    if ((this.k != null) && (this.k.length > 0)) {
      for (m = 0; m < this.k.length; m++) {
        paramcmk.a(10, this.k[m]);
      }
    }
    if ((this.j != null) && (this.j.length > 0)) {
      for (m = n; m < this.j.length; m++)
      {
        localcje = this.j[m];
        if (localcje != null) {
          paramcmk.a(11, localcje);
        }
      }
    }
    if (this.i) {
      paramcmk.a(12, this.i);
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
      if ((paramObject instanceof cje))
      {
        paramObject = (cje)paramObject;
        bool1 = bool2;
        if (this.a == ((cje)paramObject).a)
        {
          if (this.b == null)
          {
            bool1 = bool2;
            if (((cje)paramObject).b != null) {
              continue;
            }
            label54:
            bool1 = bool2;
            if (!cmq.a(this.c, ((cje)paramObject).c)) {
              continue;
            }
            bool1 = bool2;
            if (!cmq.a(this.d, ((cje)paramObject).d)) {
              continue;
            }
            bool1 = bool2;
            if (!cmq.a(this.e, ((cje)paramObject).e)) {
              continue;
            }
            if (this.f != null) {
              break label234;
            }
            bool1 = bool2;
            if (((cje)paramObject).f != null) {
              continue;
            }
            label118:
            if (this.g != null) {
              break label253;
            }
            bool1 = bool2;
            if (((cje)paramObject).g != null) {
              continue;
            }
          }
          label234:
          label253:
          while (this.g.equals(((cje)paramObject).g))
          {
            bool1 = bool2;
            if (this.h != ((cje)paramObject).h) {
              break;
            }
            bool1 = bool2;
            if (this.i != ((cje)paramObject).i) {
              break;
            }
            bool1 = bool2;
            if (!cmq.a(this.j, ((cje)paramObject).j)) {
              break;
            }
            bool1 = bool2;
            if (!cmq.a(this.k, ((cje)paramObject).k)) {
              break;
            }
            bool1 = bool2;
            if (this.l != ((cje)paramObject).l) {
              break;
            }
            bool1 = a((cmm)paramObject);
            break;
            if (this.b.equals(((cje)paramObject).b)) {
              break label54;
            }
            bool1 = bool2;
            break;
            if (this.f.equals(((cje)paramObject).f)) {
              break label118;
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
    int i3 = 1231;
    int i1 = 0;
    int i4 = this.a;
    int m;
    int i5;
    int i7;
    int i6;
    int n;
    label58:
    label65:
    int i8;
    int i2;
    label92:
    int i10;
    int i9;
    if (this.b == null)
    {
      m = 0;
      i5 = cmq.a(this.c);
      i7 = cmq.a(this.d);
      i6 = cmq.a(this.e);
      if (this.f != null) {
        break label206;
      }
      n = 0;
      if (this.g != null) {
        break label217;
      }
      i8 = (int)(this.h ^ this.h >>> 32);
      if (!this.i) {
        break label228;
      }
      i2 = 1231;
      i10 = cmq.a(this.j);
      i9 = cmq.a(this.k);
      if (!this.l) {
        break label236;
      }
    }
    for (;;)
    {
      return ((((i2 + (((n + ((((m + (i4 + 527) * 31) * 31 + i5) * 31 + i7) * 31 + i6) * 31) * 31 + i1) * 31 + i8) * 31) * 31 + i10) * 31 + i9) * 31 + i3) * 31 + c();
      m = this.b.hashCode();
      break;
      label206:
      n = this.f.hashCode();
      break label58;
      label217:
      i1 = this.g.hashCode();
      break label65;
      label228:
      i2 = 1237;
      break label92;
      label236:
      i3 = 1237;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
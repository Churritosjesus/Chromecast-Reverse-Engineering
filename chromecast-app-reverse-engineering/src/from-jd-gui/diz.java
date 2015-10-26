import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;

final class diz
  implements dib
{
  private final dkd a;
  private final boolean b;
  private final dis c;
  
  diz(dkd paramdkd, boolean paramBoolean)
  {
    this.a = paramdkd;
    this.c = new dis(this.a);
    this.b = paramBoolean;
  }
  
  private static IOException a(String paramString, Object... paramVarArgs)
  {
    throw new IOException(String.format(paramString, paramVarArgs));
  }
  
  private void a(dic paramdic, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    int i = this.a.i();
    if (paramInt2 != i * 8 + 4) {
      throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i) });
    }
    dix localdix = new dix();
    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
    {
      int j = this.a.i();
      localdix.a(j & 0xFFFFFF, (0xFF000000 & j) >>> 24, this.a.i());
    }
    if ((paramInt1 & 0x1) != 0) {}
    for (;;)
    {
      paramdic.a(bool, localdix);
      return;
      bool = false;
    }
  }
  
  public final void a() {}
  
  public final boolean a(dic paramdic)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = true;
    int j;
    int m;
    int i;
    int k;
    try
    {
      j = this.a.i();
      m = this.a.i();
      if ((0x80000000 & j) != 0)
      {
        i = 1;
        k = (0xFF000000 & m) >>> 24;
        m = 0xFFFFFF & m;
        if (i == 0) {
          break label766;
        }
        i = (0x7FFF0000 & j) >>> 16;
        if (i == 3) {
          break label112;
        }
        throw new ProtocolException("version != 3: " + i);
      }
    }
    catch (IOException paramdic)
    {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      i = 0;
      break;
      label112:
      Object localObject;
      switch (j & 0xFFFF)
      {
      case 5: 
      default: 
        this.a.f(m);
        bool1 = bool3;
        break;
      case 1: 
        i = this.a.i();
        this.a.i();
        this.a.h();
        localObject = this.c.a(m - 10);
        if ((k & 0x1) != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          if ((k & 0x2) != 0) {
            bool2 = true;
          }
          paramdic.a(bool2, bool1, i & 0x7FFFFFFF, (List)localObject, dif.a);
          bool1 = bool3;
          break;
        }
      case 2: 
        i = this.a.i();
        localObject = this.c.a(m - 4);
        if ((k & 0x1) != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          paramdic.a(false, bool1, i & 0x7FFFFFFF, (List)localObject, dif.b);
          bool1 = bool3;
          break;
        }
      case 3: 
        if (m != 8) {
          throw a("TYPE_RST_STREAM length: %d != 8", new Object[] { Integer.valueOf(m) });
        }
        j = this.a.i();
        i = this.a.i();
        localObject = dia.a(i);
        if (localObject == null) {
          throw a("TYPE_RST_STREAM unexpected error code: %d", new Object[] { Integer.valueOf(i) });
        }
        paramdic.a(j & 0x7FFFFFFF, (dia)localObject);
        bool1 = bool3;
        break;
      case 4: 
        a(paramdic, k, m);
        bool1 = bool3;
        break;
      case 6: 
        if (m != 4) {
          throw a("TYPE_PING length: %d != 4", new Object[] { Integer.valueOf(m) });
        }
        i = this.a.i();
        bool2 = this.b;
        if ((i & 0x1) == 1)
        {
          bool1 = true;
          if (bool2 != bool1) {
            break label533;
          }
        }
        for (bool1 = true;; bool1 = false)
        {
          paramdic.a(bool1, i, 0);
          bool1 = bool3;
          break;
          bool1 = false;
          break label500;
        }
      case 7: 
        if (m != 8) {
          throw a("TYPE_GOAWAY length: %d != 8", new Object[] { Integer.valueOf(m) });
        }
        i = this.a.i();
        j = this.a.i();
        if (dia.c(j) == null) {
          throw a("TYPE_GOAWAY unexpected error code: %d", new Object[] { Integer.valueOf(j) });
        }
        paramdic.a(i & 0x7FFFFFFF, dke.a);
        bool1 = bool3;
        break;
      case 8: 
        paramdic.a(false, false, this.a.i() & 0x7FFFFFFF, this.c.a(m - 4), dif.c);
        bool1 = bool3;
        break;
      case 9: 
        label500:
        label533:
        if (m != 8) {
          throw a("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] { Integer.valueOf(m) });
        }
        i = this.a.i();
        long l = this.a.i() & 0x7FFFFFFF;
        if (l == 0L) {
          throw a("windowSizeIncrement was 0", new Object[] { Long.valueOf(l) });
        }
        paramdic.a(i & 0x7FFFFFFF, l);
        bool1 = bool3;
        continue;
        label766:
        if ((k & 0x1) != 0) {
          bool1 = true;
        }
        paramdic.a(bool1, j & 0x7FFFFFFF, this.a, m);
        bool1 = bool3;
      }
    }
  }
  
  public final void close()
  {
    this.c.b.close();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\diz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
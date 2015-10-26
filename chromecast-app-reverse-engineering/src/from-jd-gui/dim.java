import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class dim
  implements dib
{
  private final dkd a;
  private final dik b;
  private final boolean c;
  private dih d;
  
  dim(dkd paramdkd, int paramInt, boolean paramBoolean)
  {
    this.a = paramdkd;
    this.c = paramBoolean;
    this.b = new dik(this.a);
    this.d = new dih(4096, this.b);
  }
  
  private List a(int paramInt1, short paramShort, byte paramByte, int paramInt2)
  {
    Object localObject1 = this.b;
    this.b.d = paramInt1;
    ((dik)localObject1).a = paramInt1;
    this.b.e = paramShort;
    this.b.b = paramByte;
    this.b.c = paramInt2;
    localObject1 = this.d;
    while (!((dih)localObject1).b.e())
    {
      paramInt1 = ((dih)localObject1).b.g() & 0xFF;
      if (paramInt1 == 128) {
        throw new IOException("index == 0");
      }
      if ((paramInt1 & 0x80) == 128)
      {
        paramInt2 = ((dih)localObject1).a(paramInt1, 127) - 1;
        if (dih.c(paramInt2))
        {
          localObject2 = dig.a()[paramInt2];
          ((dih)localObject1).a.add(localObject2);
        }
        else
        {
          paramInt1 = ((dih)localObject1).a(paramInt2 - dig.a().length);
          if ((paramInt1 < 0) || (paramInt1 > ((dih)localObject1).e.length - 1)) {
            throw new IOException("Header index too large " + (paramInt2 + 1));
          }
          ((dih)localObject1).a.add(localObject1.e[paramInt1]);
        }
      }
      else if (paramInt1 == 64)
      {
        ((dih)localObject1).a(-1, new die(dig.a(((dih)localObject1).b()), ((dih)localObject1).b()));
      }
      else if ((paramInt1 & 0x40) == 64)
      {
        ((dih)localObject1).a(-1, new die(((dih)localObject1).b(((dih)localObject1).a(paramInt1, 63) - 1), ((dih)localObject1).b()));
      }
      else if ((paramInt1 & 0x20) == 32)
      {
        ((dih)localObject1).d = ((dih)localObject1).a(paramInt1, 31);
        if ((((dih)localObject1).d < 0) || (((dih)localObject1).d > ((dih)localObject1).c)) {
          throw new IOException("Invalid dynamic table size update " + ((dih)localObject1).d);
        }
        ((dih)localObject1).a();
      }
      else
      {
        dke localdke;
        if ((paramInt1 == 16) || (paramInt1 == 0))
        {
          localdke = dig.a(((dih)localObject1).b());
          localObject2 = ((dih)localObject1).b();
          ((dih)localObject1).a.add(new die(localdke, (dke)localObject2));
        }
        else
        {
          localdke = ((dih)localObject1).b(((dih)localObject1).a(paramInt1, 15) - 1);
          localObject2 = ((dih)localObject1).b();
          ((dih)localObject1).a.add(new die(localdke, (dke)localObject2));
        }
      }
    }
    localObject1 = this.d;
    Object localObject2 = new ArrayList(((dih)localObject1).a);
    ((dih)localObject1).a.clear();
    return (List)localObject2;
  }
  
  private void a(dic paramdic, int paramInt)
  {
    this.a.i();
    this.a.g();
  }
  
  public final void a()
  {
    if (this.c) {}
    dke localdke;
    do
    {
      return;
      localdke = this.a.c(dij.a().b.length);
      if (dij.b().isLoggable(Level.FINE)) {
        dij.b().fine(String.format("<< CONNECTION %s", new Object[] { localdke.b() }));
      }
    } while (dij.a().equals(localdke));
    throw dij.a("Expected a connection header but was %s", new Object[] { localdke.a() });
  }
  
  public final boolean a(dic paramdic)
  {
    boolean bool2 = true;
    int j = 0;
    boolean bool1 = false;
    int i = 0;
    int n;
    try
    {
      this.a.a(9L);
      n = dij.a(this.a);
      if ((n < 0) || (n > 16384)) {
        throw dij.a("FRAME_SIZE_ERROR: %s", new Object[] { Integer.valueOf(n) });
      }
    }
    catch (IOException paramdic)
    {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      byte b2 = this.a.g();
      byte b1 = this.a.g();
      int m = this.a.i() & 0x7FFFFFFF;
      if (dij.b().isLoggable(Level.FINE)) {
        dij.b().fine(dil.a(true, m, n, b2, b1));
      }
      int k;
      label243:
      label249:
      label341:
      label432:
      Object localObject;
      switch (b2)
      {
      default: 
        this.a.f(n);
        bool1 = bool2;
        break;
      case 0: 
        if ((b1 & 0x1) != 0)
        {
          bool1 = true;
          if ((b1 & 0x20) == 0) {
            break label243;
          }
        }
        for (k = 1;; k = 0)
        {
          if (k == 0) {
            break label249;
          }
          throw dij.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
          bool1 = false;
          break;
        }
        if ((b1 & 0x8) != 0) {
          i = (short)(this.a.g() & 0xFF);
        }
        k = dij.a(n, b1, i);
        paramdic.a(bool1, m, this.a, k);
        this.a.f(i);
        bool1 = bool2;
        break;
      case 1: 
        if (m == 0) {
          throw dij.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        if ((b1 & 0x1) != 0)
        {
          bool1 = true;
          if ((b1 & 0x8) == 0) {
            break label432;
          }
        }
        for (i = (short)(this.a.g() & 0xFF);; i = 0)
        {
          k = n;
          if ((b1 & 0x20) != 0)
          {
            a(paramdic, m);
            k = n - 5;
          }
          paramdic.a(false, bool1, m, a(dij.a(k, b1, i), i, b1, m), dif.d);
          bool1 = bool2;
          break;
          bool1 = false;
          break label341;
        }
      case 2: 
        if (n != 5) {
          throw dij.a("TYPE_PRIORITY length: %d != 5", new Object[] { Integer.valueOf(n) });
        }
        if (m == 0) {
          throw dij.a("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        a(paramdic, m);
        bool1 = bool2;
        break;
      case 3: 
        if (n != 4) {
          throw dij.a("TYPE_RST_STREAM length: %d != 4", new Object[] { Integer.valueOf(n) });
        }
        if (m == 0) {
          throw dij.a("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        k = this.a.i();
        localObject = dia.b(k);
        if (localObject == null) {
          throw dij.a("TYPE_RST_STREAM unexpected error code: %d", new Object[] { Integer.valueOf(k) });
        }
        paramdic.a(m, (dia)localObject);
        bool1 = bool2;
        break;
      case 4: 
        if (m != 0) {
          throw dij.a("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b1 & 0x1) != 0)
        {
          bool1 = bool2;
          if (n != 0) {
            throw dij.a("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
          }
        }
        else
        {
          if (n % 6 != 0) {
            throw dij.a("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] { Integer.valueOf(n) });
          }
          localObject = new dix();
          k = 0;
          if (k < n)
          {
            i = this.a.h();
            int i1 = this.a.i();
            m = i;
            switch (i)
            {
            default: 
              throw dij.a("PROTOCOL_ERROR invalid settings id: %s", new Object[] { Short.valueOf(i) });
            case 2: 
              m = i;
              if (i1 != 0)
              {
                m = i;
                if (i1 != 1) {
                  throw dij.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
              }
              break;
            case 3: 
              m = 4;
            }
            do
            {
              do
              {
                ((dix)localObject).a(m, 0, i1);
                k += 6;
                break;
                m = 7;
              } while (i1 >= 0);
              throw dij.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
              if (i1 < 16384) {
                break label853;
              }
              m = i;
            } while (i1 <= 16777215);
            throw dij.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] { Integer.valueOf(i1) });
          }
          paramdic.a(false, (dix)localObject);
          bool1 = bool2;
          if (((dix)localObject).a() >= 0)
          {
            paramdic = this.d;
            k = ((dix)localObject).a();
            paramdic.c = k;
            paramdic.d = k;
            paramdic.a();
            bool1 = bool2;
          }
        }
        break;
      case 5: 
        if (m == 0) {
          throw dij.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        i = j;
        if ((b1 & 0x8) != 0) {
          i = (short)(this.a.g() & 0xFF);
        }
        paramdic.a(this.a.i() & 0x7FFFFFFF, a(dij.a(n - 4, b1, i), i, b1, m));
        bool1 = bool2;
        break;
      case 6: 
        if (n != 8) {
          throw dij.a("TYPE_PING length != 8: %s", new Object[] { Integer.valueOf(n) });
        }
        if (m != 0) {
          throw dij.a("TYPE_PING streamId != 0", new Object[0]);
        }
        k = this.a.i();
        m = this.a.i();
        if ((b1 & 0x1) != 0) {
          bool1 = true;
        }
        paramdic.a(bool1, k, m);
        bool1 = bool2;
        break;
      case 7: 
        if (n < 8) {
          throw dij.a("TYPE_GOAWAY length < 8: %s", new Object[] { Integer.valueOf(n) });
        }
        if (m != 0) {
          throw dij.a("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        k = this.a.i();
        m = this.a.i();
        n -= 8;
        if (dia.b(m) == null) {
          throw dij.a("TYPE_GOAWAY unexpected error code: %d", new Object[] { Integer.valueOf(m) });
        }
        localObject = dke.a;
        if (n > 0) {
          localObject = this.a.c(n);
        }
        paramdic.a(k, (dke)localObject);
        bool1 = bool2;
        break;
      case 8: 
        label853:
        if (n != 4) {
          throw dij.a("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] { Integer.valueOf(n) });
        }
        long l = this.a.i() & 0x7FFFFFFF;
        if (l == 0L) {
          throw dij.a("windowSizeIncrement was 0", new Object[] { Long.valueOf(l) });
        }
        paramdic.a(m, l);
        bool1 = bool2;
      }
    }
  }
  
  public final void close()
  {
    this.a.close();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
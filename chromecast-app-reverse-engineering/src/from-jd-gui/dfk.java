import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class dfk
{
  public static final dfk a;
  public static final dfk b = new dfl(a).a(new dgg[] { dgg.c }).a(true).a();
  public static final dfk c = new dfl(false).a();
  private static final dfg[] h = { dfg.m, dfg.n, dfg.h, dfg.j, dfg.i, dfg.k, dfg.l, dfg.d, dfg.c, dfg.f, dfg.g, dfg.b, dfg.e, dfg.a };
  final boolean d;
  final String[] e;
  final String[] f;
  public final boolean g;
  
  static
  {
    dfl localdfl = new dfl(true);
    dfg[] arrayOfdfg = h;
    if (!localdfl.a) {
      throw new IllegalStateException("no cipher suites for cleartext connections");
    }
    String[] arrayOfString = new String[arrayOfdfg.length];
    for (int i = 0; i < arrayOfdfg.length; i++) {
      arrayOfString[i] = arrayOfdfg[i].o;
    }
    localdfl.b = arrayOfString;
    a = localdfl.a(new dgg[] { dgg.a, dgg.b, dgg.c }).a(true).a();
  }
  
  dfk(dfl paramdfl)
  {
    this.d = paramdfl.a;
    this.e = paramdfl.b;
    this.f = paramdfl.c;
    this.g = paramdfl.d;
  }
  
  private List a()
  {
    dgg[] arrayOfdgg = new dgg[this.f.length];
    for (int i = 0; i < this.f.length; i++) {
      arrayOfdgg[i] = dgg.a(this.f[i]);
    }
    return dgs.a(arrayOfdgg);
  }
  
  private static boolean a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramArrayOfString1 == null) || (paramArrayOfString2 == null) || (paramArrayOfString1.length == 0) || (paramArrayOfString2.length == 0)) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      int k = paramArrayOfString1.length;
      int i = 0;
      label33:
      if (i < k)
      {
        String str = paramArrayOfString1[i];
        int m = paramArrayOfString2.length;
        int j = 0;
        label50:
        if (j < m) {
          if (!dgs.a(str, paramArrayOfString2[j])) {}
        }
        for (j = 1;; j = 0)
        {
          bool1 = bool2;
          if (j != 0) {
            break;
          }
          i++;
          break label33;
          j++;
          break label50;
        }
      }
      bool1 = false;
    }
  }
  
  public final boolean a(SSLSocket paramSSLSocket)
  {
    boolean bool2 = false;
    boolean bool1;
    if (!this.d) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      String[] arrayOfString = paramSSLSocket.getEnabledProtocols();
      bool1 = bool2;
      if (a(this.f, arrayOfString)) {
        if (this.e == null)
        {
          bool1 = bool2;
          if (paramSSLSocket.getEnabledCipherSuites().length > 0) {
            bool1 = true;
          }
        }
        else
        {
          paramSSLSocket = paramSSLSocket.getEnabledCipherSuites();
          bool1 = a(this.e, paramSSLSocket);
        }
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (!(paramObject instanceof dfk)) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      if (paramObject == this)
      {
        bool1 = true;
      }
      else
      {
        paramObject = (dfk)paramObject;
        bool1 = bool2;
        if (this.d == ((dfk)paramObject).d) {
          if (this.d)
          {
            bool1 = bool2;
            if (Arrays.equals(this.e, ((dfk)paramObject).e))
            {
              bool1 = bool2;
              if (Arrays.equals(this.f, ((dfk)paramObject).f))
              {
                bool1 = bool2;
                if (this.g != ((dfk)paramObject).g) {}
              }
            }
          }
          else
          {
            bool1 = true;
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = 17;
    int j;
    int k;
    if (this.d)
    {
      j = Arrays.hashCode(this.e);
      k = Arrays.hashCode(this.f);
      if (!this.g) {
        break label53;
      }
    }
    label53:
    for (i = 0;; i = 1)
    {
      i += ((j + 527) * 31 + k) * 31;
      return i;
    }
  }
  
  public final String toString()
  {
    if (this.d) {
      if (this.e == null)
      {
        localObject = null;
        if (localObject != null) {
          break label117;
        }
        localObject = "[use default]";
      }
    }
    label23:
    for (Object localObject = "ConnectionSpec(cipherSuites=" + (String)localObject + ", tlsVersions=" + a() + ", supportsTlsExtensions=" + this.g + ")";; localObject = "ConnectionSpec()")
    {
      return (String)localObject;
      localObject = new dfg[this.e.length];
      for (int i = 0; i < this.e.length; i++) {
        localObject[i] = dfg.a(this.e[i]);
      }
      localObject = dgs.a((Object[])localObject);
      break;
      label117:
      localObject = localObject.toString();
      break label23;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
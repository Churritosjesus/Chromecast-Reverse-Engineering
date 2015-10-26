import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public class dft
  implements Cloneable
{
  static final List a = dgs.a(new dfx[] { dfx.d, dfx.c, dfx.b });
  static final List b = dgs.a(new dfk[] { dfk.a, dfk.b, dfk.c });
  private static SSLSocketFactory y;
  private final List A = new ArrayList();
  final dgr c;
  public Proxy d;
  public List e;
  public List f;
  public final List g = new ArrayList();
  public ProxySelector h;
  public CookieHandler i;
  public s j;
  public dh k;
  public SocketFactory l;
  public SSLSocketFactory m;
  public HostnameVerifier n;
  public dfd o;
  public dfa p;
  public dfi q;
  dgk r;
  public boolean s = true;
  public boolean t = true;
  public boolean u = true;
  public int v;
  public int w;
  int x;
  private dfm z;
  
  static
  {
    dgi.b = new dfu();
  }
  
  public dft()
  {
    this.c = new dgr();
    this.z = new dfm();
  }
  
  dft(dft paramdft)
  {
    this.c = paramdft.c;
    this.z = paramdft.z;
    this.d = paramdft.d;
    this.e = paramdft.e;
    this.f = paramdft.f;
    this.A.addAll(paramdft.A);
    this.g.addAll(paramdft.g);
    this.h = paramdft.h;
    this.i = paramdft.i;
    this.k = paramdft.k;
    if (this.k != null) {}
    for (s locals = null;; locals = paramdft.j)
    {
      this.j = locals;
      this.l = paramdft.l;
      this.m = paramdft.m;
      this.n = paramdft.n;
      this.o = paramdft.o;
      this.p = paramdft.p;
      this.q = paramdft.q;
      this.r = paramdft.r;
      this.s = paramdft.s;
      this.t = paramdft.t;
      this.u = paramdft.u;
      this.v = paramdft.v;
      this.w = paramdft.w;
      this.x = paramdft.x;
      return;
    }
  }
  
  /* Error */
  SSLSocketFactory a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 161	dft:y	Ljavax/net/ssl/SSLSocketFactory;
    //   5: astore_1
    //   6: aload_1
    //   7: ifnonnull +23 -> 30
    //   10: ldc -93
    //   12: invokestatic 169	javax/net/ssl/SSLContext:getInstance	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   15: astore_1
    //   16: aload_1
    //   17: aconst_null
    //   18: aconst_null
    //   19: aconst_null
    //   20: invokevirtual 173	javax/net/ssl/SSLContext:init	([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   23: aload_1
    //   24: invokevirtual 176	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   27: putstatic 161	dft:y	Ljavax/net/ssl/SSLSocketFactory;
    //   30: getstatic 161	dft:y	Ljavax/net/ssl/SSLSocketFactory;
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: areturn
    //   38: astore_1
    //   39: new 178	java/lang/AssertionError
    //   42: astore_1
    //   43: aload_1
    //   44: invokespecial 179	java/lang/AssertionError:<init>	()V
    //   47: aload_1
    //   48: athrow
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_1
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	dft
    //   5	32	1	localObject1	Object
    //   38	1	1	localGeneralSecurityException	java.security.GeneralSecurityException
    //   42	6	1	localAssertionError	AssertionError
    //   49	4	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   10	30	38	java/security/GeneralSecurityException
    //   2	6	49	finally
    //   10	30	49	finally
    //   30	34	49	finally
    //   39	49	49	finally
  }
  
  public final dft b()
  {
    return new dft(this);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
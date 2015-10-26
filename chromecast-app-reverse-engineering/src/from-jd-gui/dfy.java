import java.net.URI;
import java.net.URL;

public final class dfy
{
  final dfq a;
  public final String b;
  public final dfo c;
  public final dga d;
  final Object e;
  private volatile URL f;
  private volatile URI g;
  private volatile dfb h;
  
  dfy(dfz paramdfz)
  {
    this.a = paramdfz.a;
    this.b = paramdfz.b;
    this.c = paramdfz.c.a();
    this.d = paramdfz.d;
    if (paramdfz.e != null) {}
    for (paramdfz = paramdfz.e;; paramdfz = this)
    {
      this.e = paramdfz;
      return;
    }
  }
  
  public final String a(String paramString)
  {
    return this.c.a(paramString);
  }
  
  public final URL a()
  {
    URL localURL = this.f;
    if (localURL != null) {}
    for (;;)
    {
      return localURL;
      localURL = this.a.a();
      this.f = localURL;
    }
  }
  
  /* Error */
  public final URI b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 67	dfy:g	Ljava/net/URI;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull +5 -> 11
    //   9: aload_1
    //   10: areturn
    //   11: aload_0
    //   12: getfield 30	dfy:a	Ldfq;
    //   15: invokevirtual 69	dfq:b	()Ljava/net/URI;
    //   18: astore_1
    //   19: aload_0
    //   20: aload_1
    //   21: putfield 67	dfy:g	Ljava/net/URI;
    //   24: goto -15 -> 9
    //   27: astore_1
    //   28: new 71	java/io/IOException
    //   31: dup
    //   32: aload_1
    //   33: invokevirtual 75	java/lang/IllegalStateException:getMessage	()Ljava/lang/String;
    //   36: invokespecial 78	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	dfy
    //   4	17	1	localURI	URI
    //   27	6	1	localIllegalStateException	IllegalStateException
    // Exception table:
    //   from	to	target	type
    //   0	5	27	java/lang/IllegalStateException
    //   11	24	27	java/lang/IllegalStateException
  }
  
  public final dfz c()
  {
    return new dfz(this);
  }
  
  public final dfb d()
  {
    dfb localdfb = this.h;
    if (localdfb != null) {}
    for (;;)
    {
      return localdfb;
      localdfb = dfb.a(this.c);
      this.h = localdfb;
    }
  }
  
  public final boolean e()
  {
    return this.a.a.equals("https");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Request{method=").append(this.b).append(", url=").append(this.a).append(", tag=");
    if (this.e != this) {}
    for (Object localObject = this.e;; localObject = null) {
      return localObject + '}';
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
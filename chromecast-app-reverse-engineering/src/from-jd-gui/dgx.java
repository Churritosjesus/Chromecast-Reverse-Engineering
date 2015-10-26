import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public final class dgx
{
  final dfi a;
  final dfh b;
  final dkd c;
  final dkc d;
  int e = 0;
  int f = 0;
  private final Socket g;
  
  public dgx(dfi paramdfi, dfh paramdfh, Socket paramSocket)
  {
    this.a = paramdfi;
    this.b = paramdfh;
    this.g = paramSocket;
    this.c = dkk.a(dkk.b(paramSocket));
    this.d = dkk.a(dkk.a(paramSocket));
  }
  
  public final dkv a(long paramLong)
  {
    if (this.e != 4) {
      throw new IllegalStateException("state: " + this.e);
    }
    this.e = 5;
    return new dhc(this, paramLong);
  }
  
  public final void a()
  {
    this.d.flush();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 0) {
      this.c.a().a(paramInt1, TimeUnit.MILLISECONDS);
    }
    if (paramInt2 != 0) {
      this.d.a().a(paramInt2, TimeUnit.MILLISECONDS);
    }
  }
  
  public final void a(dfo paramdfo, String paramString)
  {
    if (this.e != 0) {
      throw new IllegalStateException("state: " + this.e);
    }
    this.d.b(paramString).b("\r\n");
    int i = 0;
    int j = paramdfo.a.length / 2;
    while (i < j)
    {
      this.d.b(paramdfo.a(i)).b(": ").b(paramdfo.b(i)).b("\r\n");
      i++;
    }
    this.d.b("\r\n");
    this.e = 1;
  }
  
  public final void a(dfp paramdfp)
  {
    for (;;)
    {
      String str = this.c.o();
      if (str.length() == 0) {
        break;
      }
      dgi.b.a(paramdfp, str);
    }
  }
  
  /* Error */
  public final boolean b()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 32	dgx:g	Ljava/net/Socket;
    //   6: invokevirtual 162	java/net/Socket:getSoTimeout	()I
    //   9: istore_2
    //   10: aload_0
    //   11: getfield 32	dgx:g	Ljava/net/Socket;
    //   14: iconst_1
    //   15: invokevirtual 166	java/net/Socket:setSoTimeout	(I)V
    //   18: aload_0
    //   19: getfield 42	dgx:c	Ldkd;
    //   22: invokeinterface 168 1 0
    //   27: istore 4
    //   29: iload 4
    //   31: ifeq +13 -> 44
    //   34: aload_0
    //   35: getfield 32	dgx:g	Ljava/net/Socket;
    //   38: iload_2
    //   39: invokevirtual 166	java/net/Socket:setSoTimeout	(I)V
    //   42: iload_3
    //   43: ireturn
    //   44: aload_0
    //   45: getfield 32	dgx:g	Ljava/net/Socket;
    //   48: iload_2
    //   49: invokevirtual 166	java/net/Socket:setSoTimeout	(I)V
    //   52: iconst_1
    //   53: istore_3
    //   54: goto -12 -> 42
    //   57: astore_1
    //   58: aload_0
    //   59: getfield 32	dgx:g	Ljava/net/Socket;
    //   62: iload_2
    //   63: invokevirtual 166	java/net/Socket:setSoTimeout	(I)V
    //   66: aload_1
    //   67: athrow
    //   68: astore_1
    //   69: iconst_1
    //   70: istore_3
    //   71: goto -29 -> 42
    //   74: astore_1
    //   75: goto -33 -> 42
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	dgx
    //   57	10	1	localObject	Object
    //   68	1	1	localSocketTimeoutException	java.net.SocketTimeoutException
    //   74	1	1	localIOException	IOException
    //   9	54	2	i	int
    //   1	70	3	bool1	boolean
    //   27	3	4	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   10	29	57	finally
    //   2	10	68	java/net/SocketTimeoutException
    //   34	42	68	java/net/SocketTimeoutException
    //   44	52	68	java/net/SocketTimeoutException
    //   58	68	68	java/net/SocketTimeoutException
    //   2	10	74	java/io/IOException
    //   34	42	74	java/io/IOException
    //   44	52	74	java/io/IOException
    //   58	68	74	java/io/IOException
  }
  
  public final dgd c()
  {
    if ((this.e != 1) && (this.e != 3)) {
      throw new IllegalStateException("state: " + this.e);
    }
    try
    {
      dhv localdhv;
      dgd localdgd;
      do
      {
        localdhv = dhv.a(this.c.o());
        localdgd = new dgd;
        localdgd.<init>();
        localdgd.b = localdhv.a;
        localdgd.c = localdhv.b;
        localdgd.d = localdhv.c;
        localObject = new dfp;
        ((dfp)localObject).<init>();
        a((dfp)localObject);
        ((dfp)localObject).a(dhl.c, localdhv.a.toString());
        localdgd.a(((dfp)localObject).a());
      } while (localdhv.b == 100);
      this.e = 4;
      return localdgd;
    }
    catch (EOFException localEOFException)
    {
      Object localObject = new IOException("unexpected end of stream on " + this.b + " (recycle count=" + dgi.b.b(this.b) + ")");
      ((IOException)localObject).initCause(localEOFException);
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
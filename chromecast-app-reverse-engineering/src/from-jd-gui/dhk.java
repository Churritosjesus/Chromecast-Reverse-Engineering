import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;

public final class dhk
  implements dhw
{
  private final dhg a;
  private final dgx b;
  
  public dhk(dhg paramdhg, dgx paramdgx)
  {
    this.a = paramdhg;
    this.b = paramdgx;
  }
  
  public final dge a(dgc paramdgc)
  {
    Object localObject;
    if (!dhg.c(paramdgc)) {
      localObject = this.b.a(0L);
    }
    for (;;)
    {
      return new dhn(paramdgc.f, dkk.a((dkv)localObject));
      if ("chunked".equalsIgnoreCase(paramdgc.a("Transfer-Encoding")))
      {
        localObject = this.b;
        dhg localdhg = this.a;
        if (((dgx)localObject).e != 4) {
          throw new IllegalStateException("state: " + ((dgx)localObject).e);
        }
        ((dgx)localObject).e = 5;
        localObject = new dha((dgx)localObject, localdhg);
      }
      else
      {
        long l = dhl.a(paramdgc);
        if (l != -1L)
        {
          localObject = this.b.a(l);
        }
        else
        {
          localObject = this.b;
          if (((dgx)localObject).e != 4) {
            throw new IllegalStateException("state: " + ((dgx)localObject).e);
          }
          ((dgx)localObject).e = 5;
          localObject = new dhd((dgx)localObject);
        }
      }
    }
  }
  
  public final dku a(dfy paramdfy, long paramLong)
  {
    if ("chunked".equalsIgnoreCase(paramdfy.a("Transfer-Encoding")))
    {
      paramdfy = this.b;
      if (paramdfy.e != 1) {
        throw new IllegalStateException("state: " + paramdfy.e);
      }
      paramdfy.e = 2;
    }
    for (paramdfy = new dgz(paramdfy);; paramdfy = new dhb(paramdfy, paramLong))
    {
      return paramdfy;
      if (paramLong == -1L) {
        break;
      }
      paramdfy = this.b;
      if (paramdfy.e != 1) {
        throw new IllegalStateException("state: " + paramdfy.e);
      }
      paramdfy.e = 2;
    }
    throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
  }
  
  public final void a()
  {
    this.b.a();
  }
  
  public final void a(dfy paramdfy)
  {
    this.a.b();
    Object localObject = this.a.c.b.b.type();
    dfx localdfx = this.a.c.g;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramdfy.b);
    localStringBuilder.append(' ');
    int i;
    if ((!paramdfy.e()) && (localObject == Proxy.Type.HTTP))
    {
      i = 1;
      if (i == 0) {
        break label132;
      }
      localStringBuilder.append(paramdfy.a());
    }
    for (;;)
    {
      localStringBuilder.append(' ');
      localStringBuilder.append(a.a(localdfx));
      localObject = localStringBuilder.toString();
      this.b.a(paramdfy.c, (String)localObject);
      return;
      i = 0;
      break;
      label132:
      localStringBuilder.append(a.a(paramdfy.a()));
    }
  }
  
  public final void a(dhg paramdhg)
  {
    dgx localdgx = this.b;
    dgi.b.a(localdgx.b, paramdhg);
  }
  
  public final void a(dhp paramdhp)
  {
    dgx localdgx = this.b;
    if (localdgx.e != 1) {
      throw new IllegalStateException("state: " + localdgx.e);
    }
    localdgx.e = 3;
    paramdhp.a(localdgx.d);
  }
  
  public final dgd b()
  {
    return this.b.c();
  }
  
  public final void c()
  {
    dgx localdgx;
    if (d())
    {
      localdgx = this.b;
      localdgx.f = 1;
      if (localdgx.e == 0)
      {
        localdgx.f = 0;
        dgi.b.a(localdgx.a, localdgx.b);
      }
    }
    for (;;)
    {
      return;
      localdgx = this.b;
      localdgx.f = 2;
      if (localdgx.e == 0)
      {
        localdgx.e = 6;
        localdgx.b.c.close();
      }
    }
  }
  
  public final boolean d()
  {
    boolean bool2 = false;
    boolean bool1;
    if ("close".equalsIgnoreCase(this.a.l.a("Connection"))) {
      bool1 = bool2;
    }
    do
    {
      return bool1;
      bool1 = bool2;
    } while ("close".equalsIgnoreCase(this.a.f().a("Connection")));
    if (this.b.e == 6) {}
    for (int i = 1;; i = 0)
    {
      bool1 = bool2;
      if (i != 0) {
        break;
      }
      bool1 = true;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
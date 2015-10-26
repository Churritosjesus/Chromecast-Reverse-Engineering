import java.util.Collections;
import java.util.List;

public final class dgc
{
  public final dfy a;
  public final dfx b;
  public final int c;
  public final String d;
  public final dfn e;
  public final dfo f;
  public final dge g;
  public dgc h;
  public dgc i;
  final dgc j;
  private volatile dfb k;
  
  dgc(dgd paramdgd)
  {
    this.a = paramdgd.a;
    this.b = paramdgd.b;
    this.c = paramdgd.c;
    this.d = paramdgd.d;
    this.e = paramdgd.e;
    this.f = paramdgd.f.a();
    this.g = paramdgd.g;
    this.h = paramdgd.h;
    this.i = paramdgd.i;
    this.j = paramdgd.j;
  }
  
  public final dgd a()
  {
    return new dgd(this);
  }
  
  public final String a(String paramString)
  {
    paramString = this.f.a(paramString);
    if (paramString != null) {}
    for (;;)
    {
      return paramString;
      paramString = null;
    }
  }
  
  public final List b()
  {
    if (this.c == 401) {
      localObject = "WWW-Authenticate";
    }
    for (Object localObject = dhl.b(this.f, (String)localObject);; localObject = Collections.emptyList())
    {
      return (List)localObject;
      if (this.c == 407)
      {
        localObject = "Proxy-Authenticate";
        break;
      }
    }
  }
  
  public final dfb c()
  {
    dfb localdfb = this.k;
    if (localdfb != null) {}
    for (;;)
    {
      return localdfb;
      localdfb = dfb.a(this.f);
      this.k = localdfb;
    }
  }
  
  public final String toString()
  {
    return "Response{protocol=" + this.b + ", code=" + this.c + ", message=" + this.d + ", url=" + this.a.a.toString() + '}';
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
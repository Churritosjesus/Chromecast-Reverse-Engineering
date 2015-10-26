import java.util.Date;

public final class dgw
{
  public final long a;
  public final dfy b;
  public final dgc c;
  public Date d;
  public String e;
  public Date f;
  public String g;
  public Date h;
  public long i;
  public long j;
  public String k;
  public int l = -1;
  
  public dgw(long paramLong, dfy paramdfy, dgc paramdgc)
  {
    this.a = paramLong;
    this.b = paramdfy;
    this.c = paramdgc;
    if (paramdgc != null)
    {
      paramdgc = paramdgc.f;
      int m = 0;
      int n = paramdgc.a.length / 2;
      if (m < n)
      {
        String str = paramdgc.a(m);
        paramdfy = paramdgc.b(m);
        if ("Date".equalsIgnoreCase(str))
        {
          this.d = dhe.a(paramdfy);
          this.e = paramdfy;
        }
        for (;;)
        {
          m++;
          break;
          if ("Expires".equalsIgnoreCase(str))
          {
            this.h = dhe.a(paramdfy);
          }
          else if ("Last-Modified".equalsIgnoreCase(str))
          {
            this.f = dhe.a(paramdfy);
            this.g = paramdfy;
          }
          else if ("ETag".equalsIgnoreCase(str))
          {
            this.k = paramdfy;
          }
          else if ("Age".equalsIgnoreCase(str))
          {
            this.l = a.c(paramdfy, -1);
          }
          else if (dhl.a.equalsIgnoreCase(str))
          {
            this.i = Long.parseLong(paramdfy);
          }
          else if (dhl.b.equalsIgnoreCase(str))
          {
            this.j = Long.parseLong(paramdfy);
          }
        }
      }
    }
  }
  
  public static boolean a(dfy paramdfy)
  {
    if ((paramdfy.a("If-Modified-Since") != null) || (paramdfy.a("If-None-Match") != null)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
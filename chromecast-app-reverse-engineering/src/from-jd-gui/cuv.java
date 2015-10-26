import android.content.Context;

final class cuv
{
  private static Object j = new Object();
  private static cuv k;
  volatile bpb a;
  private volatile long b = 900000L;
  private volatile long c = 30000L;
  private volatile boolean d = false;
  private volatile long e;
  private final Context f;
  private final cac g;
  private final Thread h;
  private cuy i = new cuw(this);
  
  private cuv(Context paramContext)
  {
    this(paramContext, null, cad.c());
  }
  
  private cuv(Context paramContext, cuy paramcuy, cac paramcac)
  {
    this.g = paramcac;
    if (paramContext != null) {}
    for (this.f = paramContext.getApplicationContext();; this.f = paramContext)
    {
      this.h = new Thread(new cux(this));
      return;
    }
  }
  
  static cuv a(Context paramContext)
  {
    if (k == null) {}
    synchronized (j)
    {
      if (k == null)
      {
        cuv localcuv = new cuv;
        localcuv.<init>(paramContext);
        k = localcuv;
        localcuv.h.start();
      }
      return k;
    }
  }
  
  void a()
  {
    if (this.g.a() - this.e < this.c) {}
    for (;;)
    {
      return;
      this.h.interrupt();
      this.e = this.g.a();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cuv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
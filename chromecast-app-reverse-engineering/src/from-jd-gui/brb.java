import android.app.Application;
import android.content.Context;

public class brb
{
  private static brb i;
  final Context a;
  final Context b;
  public final cac c;
  final brz d;
  final bql e;
  final bse f;
  final bqp g;
  public final bsd h;
  private final cox j;
  private final bqu k;
  private final bqt l;
  private final bpo m;
  private final brt n;
  private final bqf o;
  private final brm p;
  
  private brb(brd parambrd)
  {
    Object localObject1 = parambrd.a;
    a.f(localObject1, "Application context can't be null");
    a.b(localObject1 instanceof Application, "getApplicationContext didn't return the application");
    Object localObject2 = parambrd.b;
    a.c(localObject2);
    this.a = ((Context)localObject1);
    this.b = ((Context)localObject2);
    this.c = cad.c();
    this.d = brd.b(this);
    localObject2 = new bql(this);
    ((bql)localObject2).s();
    this.e = ((bql)localObject2);
    if (byk.a) {
      a().d("Google Analytics 4.5.0/" + 7327 + " is starting up.");
    }
    for (;;)
    {
      localObject2 = brd.f(this);
      ((bqp)localObject2).s();
      this.g = ((bqp)localObject2);
      localObject2 = new bqt(this);
      ((bqt)localObject2).s();
      this.l = ((bqt)localObject2);
      parambrd = new bqu(this, parambrd);
      Object localObject3 = brd.a(this);
      bqf localbqf = new bqf(this);
      localObject2 = new brm(this);
      bsd localbsd = new bsd(this);
      localObject1 = cox.a((Context)localObject1);
      ((cox)localObject1).c = new brc(this);
      this.j = ((cox)localObject1);
      localObject1 = new bpo(this);
      ((brt)localObject3).s();
      this.n = ((brt)localObject3);
      localbqf.s();
      this.o = localbqf;
      ((brm)localObject2).s();
      this.p = ((brm)localObject2);
      localbsd.s();
      this.h = localbsd;
      localObject2 = brd.e(this);
      ((bse)localObject2).s();
      this.f = ((bse)localObject2);
      parambrd.s();
      this.k = parambrd;
      if (byk.a) {
        a().b("Device AnalyticsService version", c().b);
      }
      localObject3 = ((bpd)localObject1).a.e();
      if (((bqt)localObject3).d()) {
        bqk.a().a(((bqt)localObject3).e());
      }
      if (((bqt)localObject3).h()) {
        ((bpo)localObject1).d = ((bqt)localObject3).i();
      }
      if (((bqt)localObject3).d())
      {
        localObject2 = bqk.a();
        if (localObject2 != null) {
          ((bpr)localObject2).a(((bqt)localObject3).e());
        }
      }
      ((bpo)localObject1).c = true;
      this.m = ((bpo)localObject1);
      parambrd.a.b();
      return;
      a().d("Google Analytics 4.5.0/" + 7327 + " is starting up. To enable debug logging on a device run:\n" + "  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
    }
  }
  
  public static brb a(Context paramContext)
  {
    a.c(paramContext);
    if (i == null) {}
    try
    {
      if (i == null)
      {
        cac localcac = cad.c();
        long l1 = localcac.b();
        Object localObject = paramContext.getApplicationContext();
        paramContext = new brd;
        paramContext.<init>((Context)localObject);
        localObject = new brb;
        ((brb)localObject).<init>(paramContext);
        i = (brb)localObject;
        bpo.b();
        long l2 = localcac.b() - l1;
        l1 = ((Long)bqd.E.a()).longValue();
        if (l2 > l1) {
          ((brb)localObject).a().c("Slow initialization (ms)", Long.valueOf(l2), Long.valueOf(l1));
        }
      }
      return i;
    }
    finally {}
  }
  
  static void a(bra parambra)
  {
    a.f(parambra, "Analytics service not created/initialized");
    a.b(parambra.q(), "Analytics service not initialized");
  }
  
  public static void i() {}
  
  public final bql a()
  {
    a(this.e);
    return this.e;
  }
  
  public final cox b()
  {
    a.c(this.j);
    return this.j;
  }
  
  public final bqu c()
  {
    a(this.k);
    return this.k;
  }
  
  public final bpo d()
  {
    a.c(this.m);
    if (this.m.c) {}
    for (boolean bool = true;; bool = false)
    {
      a.b(bool, "Analytics instance not initialized");
      return this.m;
    }
  }
  
  public final bqt e()
  {
    a(this.l);
    return this.l;
  }
  
  public final bqf f()
  {
    a(this.o);
    return this.o;
  }
  
  public final brt g()
  {
    a(this.n);
    return this.n;
  }
  
  public final brm h()
  {
    a(this.p);
    return this.p;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
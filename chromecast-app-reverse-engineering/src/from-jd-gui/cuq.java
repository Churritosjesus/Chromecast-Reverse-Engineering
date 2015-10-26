import android.content.Context;
import android.os.Build.VERSION;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class cuq
{
  private static cuq g;
  public final ctw a;
  final cxt b;
  final ConcurrentMap c;
  private final cut d;
  private final Context e;
  private final czb f;
  
  private cuq(Context paramContext, cut paramcut, ctw paramctw, cxt paramcxt)
  {
    if (paramContext == null) {
      throw new NullPointerException("context cannot be null");
    }
    this.e = paramContext.getApplicationContext();
    this.b = paramcxt;
    this.d = paramcut;
    this.c = new ConcurrentHashMap();
    this.a = paramctw;
    this.a.a(new cur(this));
    this.a.a(new cyk(this.e));
    this.f = new czb();
    if (Build.VERSION.SDK_INT >= 14) {
      this.e.registerComponentCallbacks(new cus(this));
    }
  }
  
  public static cuq a(Context paramContext)
  {
    try
    {
      if (g != null) {
        break label81;
      }
      if (paramContext == null)
      {
        cuh.a("TagManager.getInstance requires non-null context.");
        paramContext = new java/lang/NullPointerException;
        paramContext.<init>();
        throw paramContext;
      }
    }
    finally {}
    cut localcut = new cut;
    localcut.<init>();
    czg localczg = new czg;
    localczg.<init>(paramContext);
    cuq localcuq = new cuq;
    ctw localctw = new ctw;
    localctw.<init>(localczg);
    localcuq.<init>(paramContext, localcut, localctw, cum.a());
    g = localcuq;
    label81:
    paramContext = g;
    return paramContext;
  }
  
  public final bwj a(String paramString, int paramInt)
  {
    paramString = this.d.a(this.e, this, null, paramString, paramInt, this.f);
    paramString.l.a(new ctr(paramString));
    paramString.q.a(new cts(paramString));
    clz localclz = paramString.l.a(paramString.h);
    if (localclz != null) {
      paramString.m = new ctn(paramString.j, paramString.g, new ctk(paramString.i, paramString.j.a, paramString.k, 0L, localclz), paramString.f);
    }
    paramString.r = new ctp(paramString, false);
    if (paramString.e()) {
      paramString.q.a(0L, "");
    }
    for (;;)
    {
      return paramString;
      paramString.l.b();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cuq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
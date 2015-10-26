import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ctk
{
  cxi a;
  volatile long b;
  private final Context c;
  private final String d;
  private final ctw e;
  private Map f = new HashMap();
  private Map g = new HashMap();
  private volatile String h = "";
  
  ctk(Context paramContext, ctw paramctw, String paramString, long paramLong, cjd paramcjd)
  {
    this.c = paramContext;
    this.e = paramctw;
    this.d = paramString;
    this.b = paramLong;
    paramContext = paramcjd.b;
    if (paramContext == null) {
      throw new NullPointerException();
    }
    try
    {
      paramctw = a.a(paramContext);
      a(paramctw);
    }
    catch (cmd paramctw)
    {
      for (;;)
      {
        cuh.a("Not loading resource: " + paramContext + " because it is invalid: " + paramctw.toString());
      }
    }
    if (paramcjd.a != null) {
      a(paramcjd.a);
    }
  }
  
  ctk(Context paramContext, ctw paramctw, String paramString, long paramLong, clz paramclz)
  {
    this.c = paramContext;
    this.e = paramctw;
    this.d = paramString;
    this.b = 0L;
    a(paramclz);
  }
  
  private void a(clz paramclz)
  {
    this.h = paramclz.c;
    Object localObject = this.h;
    cuk.a().a.equals(cul.c);
    localObject = new cvd();
    a(new cxi(this.c, paramclz, this.e, new ctl(this), new ctm(this), (cvd)localObject));
    if (d("_gtm.loadEventEnabled"))
    {
      paramclz = this.e;
      localObject = new HashMap(ctw.a(new Object[] { "gtm.id", this.d }));
      ((Map)localObject).put("event", "gtm.load");
      paramclz.a((Map)localObject);
    }
  }
  
  private void a(cxi paramcxi)
  {
    try
    {
      this.a = paramcxi;
      return;
    }
    finally
    {
      paramcxi = finally;
      throw paramcxi;
    }
  }
  
  private void a(cjc[] paramArrayOfcjc)
  {
    ArrayList localArrayList = new ArrayList();
    int j = paramArrayOfcjc.length;
    for (int i = 0; i < j; i++) {
      localArrayList.add(paramArrayOfcjc[i]);
    }
    a().a(localArrayList);
  }
  
  private boolean d(String paramString)
  {
    cxi localcxi = a();
    boolean bool;
    if (localcxi == null)
    {
      cuh.a("getBoolean called for closed container.");
      bool = cyh.c().booleanValue();
    }
    for (;;)
    {
      return bool;
      try
      {
        bool = cyh.d((cje)localcxi.b(paramString).a).booleanValue();
      }
      catch (Exception paramString)
      {
        cuh.a("Calling getBoolean() threw an exception: " + paramString.getMessage() + " Returning default value.");
        bool = cyh.c().booleanValue();
      }
    }
  }
  
  cxi a()
  {
    try
    {
      cxi localcxi = this.a;
      return localcxi;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String a(String paramString)
  {
    cxi localcxi = a();
    if (localcxi == null)
    {
      cuh.a("getString called for closed container.");
      paramString = cyh.e();
    }
    for (;;)
    {
      return paramString;
      try
      {
        paramString = cyh.a((cje)localcxi.b(paramString).a);
      }
      catch (Exception paramString)
      {
        cuh.a("Calling getString() threw an exception: " + paramString.getMessage() + " Returning default value.");
        paramString = cyh.e();
      }
    }
  }
  
  final s b(String paramString)
  {
    synchronized (this.f)
    {
      paramString = (s)this.f.get(paramString);
      return paramString;
    }
  }
  
  final s c(String paramString)
  {
    synchronized (this.g)
    {
      paramString = (s)this.g.get(paramString);
      return paramString;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ctk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
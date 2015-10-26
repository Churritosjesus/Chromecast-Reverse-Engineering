import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class cou
{
  final cow a;
  public final cac b;
  public boolean c;
  public long d;
  public long e;
  public long f;
  public boolean g;
  final Map h;
  public final List i;
  private long j;
  private long k;
  
  private cou(cou paramcou)
  {
    this.a = paramcou.a;
    this.b = paramcou.b;
    this.d = paramcou.d;
    this.e = paramcou.e;
    this.f = paramcou.f;
    this.j = paramcou.j;
    this.k = paramcou.k;
    this.i = new ArrayList(paramcou.i);
    this.h = new HashMap(paramcou.h.size());
    paramcou = paramcou.h.entrySet().iterator();
    while (paramcou.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramcou.next();
      cov localcov = c((Class)localEntry.getKey());
      ((cov)localEntry.getValue()).a(localcov);
      this.h.put(localEntry.getKey(), localcov);
    }
  }
  
  cou(cow paramcow, cac paramcac)
  {
    a.c(paramcow);
    a.c(paramcac);
    this.a = paramcow;
    this.b = paramcac;
    this.j = 1800000L;
    this.k = 3024000000L;
    this.h = new HashMap();
    this.i = new ArrayList();
  }
  
  private static cov c(Class paramClass)
  {
    try
    {
      paramClass = (cov)paramClass.newInstance();
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalArgumentException("dataType doesn't have default constructor", paramClass);
    }
    catch (IllegalAccessException paramClass)
    {
      throw new IllegalArgumentException("dataType default constructor is not accessible", paramClass);
    }
  }
  
  public final cou a()
  {
    return new cou(this);
  }
  
  public final cov a(Class paramClass)
  {
    return (cov)this.h.get(paramClass);
  }
  
  public final void a(cov paramcov)
  {
    a.c(paramcov);
    Class localClass = paramcov.getClass();
    if (localClass.getSuperclass() != cov.class) {
      throw new IllegalArgumentException();
    }
    paramcov.a(b(localClass));
  }
  
  public final cov b(Class paramClass)
  {
    cov localcov2 = (cov)this.h.get(paramClass);
    cov localcov1 = localcov2;
    if (localcov2 == null)
    {
      localcov1 = c(paramClass);
      this.h.put(paramClass, localcov1);
    }
    return localcov1;
  }
  
  public final cox b()
  {
    return this.a.g;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
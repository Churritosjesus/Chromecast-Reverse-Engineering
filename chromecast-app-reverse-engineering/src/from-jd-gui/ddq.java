import java.io.Serializable;
import java.util.List;

public abstract class ddq
  extends ddg
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public dek h = dek.a();
  public int i = -1;
  
  static ddq a(ddq paramddq, ddn paramddn, ddp paramddp)
  {
    try
    {
      paramddq = (ddq)paramddq.a(ddt.b, paramddn, paramddp);
      return paramddq;
    }
    catch (RuntimeException paramddq)
    {
      if ((paramddq.getCause() instanceof ddx)) {
        throw ((ddx)paramddq.getCause());
      }
      throw paramddq;
    }
  }
  
  public static ddw a(List paramList)
  {
    return new def(paramList);
  }
  
  protected static final boolean a(ddq paramddq, boolean paramBoolean)
  {
    paramBoolean = false;
    if (paramddq.a(ddt.a, Boolean.valueOf(false), null) != null) {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  protected final Object a(int paramInt)
  {
    return a(paramInt, null, null);
  }
  
  protected final Object a(int paramInt, Object paramObject)
  {
    return a(paramInt, paramObject, null);
  }
  
  public abstract Object a(int paramInt, Object paramObject1, Object paramObject2);
  
  public final void a(dek paramdek)
  {
    this.h = dek.a(this.h, paramdek);
  }
  
  public final dee f()
  {
    return (dee)a(ddt.h, null, null);
  }
  
  public final ddr g()
  {
    return (ddr)a(ddt.f, null, null);
  }
  
  public final boolean h()
  {
    if (a(ddt.a, Boolean.TRUE, null) != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final ddr i()
  {
    ddr localddr = (ddr)a(ddt.f, null, null);
    localddr.a(this);
    return localddr;
  }
  
  protected Object writeReplace()
  {
    return new ddu(this);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
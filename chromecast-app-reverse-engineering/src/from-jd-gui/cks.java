import android.os.Binder;

public abstract class cks
{
  private static s c = null;
  private static int d = 0;
  public final String a;
  public final Object b;
  private Object e = null;
  
  static
  {
    new Object();
  }
  
  protected cks(String paramString, Object paramObject)
  {
    this.a = paramString;
    this.b = paramObject;
  }
  
  public static int a()
  {
    return 0;
  }
  
  public static cks a(String paramString, Float paramFloat)
  {
    return new ckw(paramString, paramFloat);
  }
  
  public static cks a(String paramString, Integer paramInteger)
  {
    return new ckv(paramString, paramInteger);
  }
  
  public static cks a(String paramString, Long paramLong)
  {
    return new cku(paramString, paramLong);
  }
  
  public static cks a(String paramString1, String paramString2)
  {
    return new ckx(paramString1, paramString2);
  }
  
  public static cks a(String paramString, boolean paramBoolean)
  {
    return new ckt(paramString, Boolean.valueOf(paramBoolean));
  }
  
  public static boolean b()
  {
    return false;
  }
  
  protected abstract Object a(String paramString);
  
  public final Object c()
  {
    return a(this.a);
  }
  
  public final Object d()
  {
    long l = Binder.clearCallingIdentity();
    try
    {
      Object localObject1 = c();
      return localObject1;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
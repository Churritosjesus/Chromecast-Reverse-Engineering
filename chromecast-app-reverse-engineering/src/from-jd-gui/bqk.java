import android.util.Log;

@Deprecated
public final class bqk
{
  private static volatile bpr a = new bsa();
  
  public static bpr a()
  {
    return a;
  }
  
  public static void a(bpr parambpr)
  {
    a = parambpr;
  }
  
  public static void a(String paramString)
  {
    Object localObject = bql.b();
    if (localObject != null) {
      ((bql)localObject).e(paramString);
    }
    for (;;)
    {
      localObject = a;
      if (localObject != null) {
        ((bpr)localObject).a(paramString);
      }
      return;
      if (a(2)) {
        Log.w((String)bqd.b.a(), paramString);
      }
    }
  }
  
  public static void a(String paramString, Object paramObject)
  {
    bql localbql = bql.b();
    if (localbql != null) {
      localbql.e(paramString, paramObject);
    }
    while (!a(3))
    {
      paramObject = a;
      if (paramObject != null) {
        ((bpr)paramObject).b(paramString);
      }
      return;
    }
    if (paramObject != null) {}
    for (paramObject = paramString + ":" + paramObject;; paramObject = paramString)
    {
      Log.e((String)bqd.b.a(), (String)paramObject);
      break;
    }
  }
  
  private static boolean a(int paramInt)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (a != null)
    {
      bool1 = bool2;
      if (a.a() <= paramInt) {
        bool1 = true;
      }
    }
    return bool1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
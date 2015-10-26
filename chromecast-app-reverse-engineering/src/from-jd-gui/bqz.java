import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

public class bqz
{
  public final brb d;
  
  public bqz(brb parambrb)
  {
    a.c(parambrb);
    this.d = parambrb;
  }
  
  private static String a(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = "";
    }
    for (;;)
    {
      return (String)paramObject;
      if ((paramObject instanceof String)) {
        paramObject = (String)paramObject;
      } else if ((paramObject instanceof Boolean))
      {
        if (paramObject == Boolean.TRUE) {
          paramObject = "true";
        } else {
          paramObject = "false";
        }
      }
      else if ((paramObject instanceof Throwable)) {
        paramObject = ((Throwable)paramObject).toString();
      } else {
        paramObject = paramObject.toString();
      }
    }
  }
  
  private void a(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    Object localObject = null;
    if (this.d != null) {
      localObject = this.d.e;
    }
    if (localObject != null) {
      ((bql)localObject).a(paramInt, paramString, paramObject1, paramObject2, paramObject3);
    }
    for (;;)
    {
      return;
      localObject = (String)bqd.b.a();
      if (Log.isLoggable((String)localObject, paramInt)) {
        Log.println(paramInt, (String)localObject, c(paramString, paramObject1, paramObject2, paramObject3));
      }
    }
  }
  
  protected static String c(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str1 = paramString;
    if (paramString == null) {
      str1 = "";
    }
    String str3 = a(paramObject1);
    paramObject2 = a(paramObject2);
    String str2 = a(paramObject3);
    paramObject3 = new StringBuilder();
    paramObject1 = "";
    if (!TextUtils.isEmpty(str1))
    {
      ((StringBuilder)paramObject3).append(str1);
      paramObject1 = ": ";
    }
    paramString = (String)paramObject1;
    if (!TextUtils.isEmpty(str3))
    {
      ((StringBuilder)paramObject3).append((String)paramObject1);
      ((StringBuilder)paramObject3).append(str3);
      paramString = ", ";
    }
    paramObject1 = paramString;
    if (!TextUtils.isEmpty((CharSequence)paramObject2))
    {
      ((StringBuilder)paramObject3).append(paramString);
      ((StringBuilder)paramObject3).append((String)paramObject2);
      paramObject1 = ", ";
    }
    if (!TextUtils.isEmpty(str2))
    {
      ((StringBuilder)paramObject3).append((String)paramObject1);
      ((StringBuilder)paramObject3).append(str2);
    }
    return ((StringBuilder)paramObject3).toString();
  }
  
  public static boolean p()
  {
    return Log.isLoggable((String)bqd.b.a(), 2);
  }
  
  public final void a(String paramString, Object paramObject)
  {
    a(2, paramString, paramObject, null, null);
  }
  
  public final void a(String paramString, Object paramObject1, Object paramObject2)
  {
    a(2, paramString, paramObject1, paramObject2, null);
  }
  
  public final void a(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    a(3, paramString, paramObject1, paramObject2, paramObject3);
  }
  
  public final void b(String paramString)
  {
    a(2, paramString, null, null, null);
  }
  
  public final void b(String paramString, Object paramObject)
  {
    a(3, paramString, paramObject, null, null);
  }
  
  public final void b(String paramString, Object paramObject1, Object paramObject2)
  {
    a(3, paramString, paramObject1, paramObject2, null);
  }
  
  public final void b(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    a(5, paramString, paramObject1, paramObject2, paramObject3);
  }
  
  public final void c(String paramString)
  {
    a(3, paramString, null, null, null);
  }
  
  public final void c(String paramString, Object paramObject)
  {
    a(4, paramString, paramObject, null, null);
  }
  
  public final void c(String paramString, Object paramObject1, Object paramObject2)
  {
    a(5, paramString, paramObject1, paramObject2, null);
  }
  
  public final void d(String paramString)
  {
    a(4, paramString, null, null, null);
  }
  
  public final void d(String paramString, Object paramObject)
  {
    a(5, paramString, paramObject, null, null);
  }
  
  public final void d(String paramString, Object paramObject1, Object paramObject2)
  {
    a(6, paramString, paramObject1, paramObject2, null);
  }
  
  public final void e(String paramString)
  {
    a(5, paramString, null, null, null);
  }
  
  public final void e(String paramString, Object paramObject)
  {
    a(6, paramString, paramObject, null, null);
  }
  
  public final void f(String paramString)
  {
    a(6, paramString, null, null, null);
  }
  
  protected final void j()
  {
    if (byk.a) {
      throw new IllegalStateException("Call only supported on the client side");
    }
  }
  
  public final cac k()
  {
    return this.d.c;
  }
  
  protected final Context l()
  {
    return this.d.a;
  }
  
  protected final brz m()
  {
    return this.d.d;
  }
  
  protected final bse n()
  {
    brb localbrb = this.d;
    brb.a(localbrb.f);
    return localbrb.f;
  }
  
  protected final bqp o()
  {
    brb localbrb = this.d;
    brb.a(localbrb.g);
    return localbrb.g;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
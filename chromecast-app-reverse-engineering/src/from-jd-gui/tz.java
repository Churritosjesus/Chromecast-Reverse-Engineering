import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class tz
{
  public static uc a;
  private static final boolean d = Log.isLoggable("MediaRouter", 3);
  final Context b;
  final ArrayList c = new ArrayList();
  
  tz(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public static List a()
  {
    f();
    return a.c;
  }
  
  public static tz a(Context paramContext)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("context must not be null");
    }
    f();
    if (a == null)
    {
      Object localObject = new uc(paramContext.getApplicationContext());
      a = (uc)localObject;
      ((uc)localObject).f = new uz(((uc)localObject).a, (vc)localObject);
      uz localuz = ((uc)localObject).f;
      if (!localuz.c)
      {
        localuz.c = true;
        localObject = new IntentFilter();
        ((IntentFilter)localObject).addAction("android.intent.action.PACKAGE_ADDED");
        ((IntentFilter)localObject).addAction("android.intent.action.PACKAGE_REMOVED");
        ((IntentFilter)localObject).addAction("android.intent.action.PACKAGE_CHANGED");
        ((IntentFilter)localObject).addAction("android.intent.action.PACKAGE_REPLACED");
        ((IntentFilter)localObject).addAction("android.intent.action.PACKAGE_RESTARTED");
        ((IntentFilter)localObject).addDataScheme("package");
        localuz.a.registerReceiver(localuz.d, (IntentFilter)localObject, null, localuz.b);
        localuz.b.post(localuz.e);
      }
    }
    return a.a(paramContext);
  }
  
  public static void a(uh paramuh)
  {
    if (paramuh == null) {
      throw new IllegalArgumentException("route must not be null");
    }
    f();
    if (d) {
      new StringBuilder("selectRoute: ").append(paramuh);
    }
    a.a(paramuh, 3);
  }
  
  static boolean a(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject2 != null) && (paramObject1.equals(paramObject2)))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean a(tx paramtx, int paramInt)
  {
    if (paramtx == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    f();
    return a.a(paramtx, 1);
  }
  
  private int b(ua paramua)
  {
    int j = this.c.size();
    int i = 0;
    if (i < j) {
      if (((ub)this.c.get(i)).b != paramua) {}
    }
    for (;;)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }
  
  public static List b()
  {
    f();
    return a.d;
  }
  
  public static uh c()
  {
    f();
    return a.a();
  }
  
  public static uh d()
  {
    f();
    return a.b();
  }
  
  public static dm e()
  {
    uc localuc = a;
    return null;
  }
  
  public static void f()
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {
      throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }
  }
  
  public final void a(tx paramtx, ua paramua, int paramInt)
  {
    int i = 1;
    boolean bool = false;
    if (paramtx == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    if (paramua == null) {
      throw new IllegalArgumentException("callback must not be null");
    }
    f();
    if (d) {
      new StringBuilder("addCallback: selector=").append(paramtx).append(", callback=").append(paramua).append(", flags=").append(Integer.toHexString(paramInt));
    }
    int j = b(paramua);
    if (j < 0)
    {
      paramua = new ub(this, paramua);
      this.c.add(paramua);
      if (((paramua.d ^ 0xFFFFFFFF) & paramInt) == 0) {
        break label227;
      }
      paramua.d |= paramInt;
    }
    label227:
    for (paramInt = 1;; paramInt = 0)
    {
      tx localtx = paramua.c;
      if (paramtx != null)
      {
        localtx.b();
        paramtx.b();
        bool = localtx.b.containsAll(paramtx.b);
      }
      if (!bool)
      {
        paramua.c = new ty(paramua.c).a(paramtx).a();
        paramInt = i;
      }
      for (;;)
      {
        if (paramInt != 0) {
          a.c();
        }
        return;
        paramua = (ub)this.c.get(j);
        break;
      }
    }
  }
  
  public final void a(ua paramua)
  {
    if (paramua == null) {
      throw new IllegalArgumentException("callback must not be null");
    }
    f();
    if (d) {
      new StringBuilder("removeCallback: callback=").append(paramua);
    }
    int i = b(paramua);
    if (i >= 0)
    {
      this.c.remove(i);
      a.c();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class bzw
{
  private static final Object a = new Object();
  private static bzw b;
  private static final ComponentName g = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
  private final List c;
  private final List d;
  private final List e;
  private final List f;
  private caa h;
  
  private bzw()
  {
    if (b() == 0)
    {
      this.c = Collections.EMPTY_LIST;
      this.d = Collections.EMPTY_LIST;
      this.e = Collections.EMPTY_LIST;
      this.f = Collections.EMPTY_LIST;
      return;
    }
    Object localObject = (String)bzy.b.c();
    if (localObject == null)
    {
      localObject = Collections.EMPTY_LIST;
      label57:
      this.c = ((List)localObject);
      localObject = (String)bzy.c.c();
      if (localObject != null) {
        break label173;
      }
      localObject = Collections.EMPTY_LIST;
      label80:
      this.d = ((List)localObject);
      localObject = (String)bzy.d.c();
      if (localObject != null) {
        break label186;
      }
      localObject = Collections.EMPTY_LIST;
      label103:
      this.e = ((List)localObject);
      localObject = (String)bzy.e.c();
      if (localObject != null) {
        break label199;
      }
    }
    label173:
    label186:
    label199:
    for (localObject = Collections.EMPTY_LIST;; localObject = Arrays.asList(((String)localObject).split(",")))
    {
      this.f = ((List)localObject);
      this.h = new caa(1024, ((Long)bzy.f.c()).longValue());
      break;
      localObject = Arrays.asList(((String)localObject).split(","));
      break label57;
      localObject = Arrays.asList(((String)localObject).split(","));
      break label80;
      localObject = Arrays.asList(((String)localObject).split(","));
      break label103;
    }
  }
  
  private static ServiceInfo a(Context paramContext, Intent paramIntent)
  {
    paramContext = paramContext.getPackageManager().queryIntentServices(paramIntent, 128);
    if ((paramContext == null) || (paramContext.size() == 0))
    {
      Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] { paramIntent.toUri(0), a.b(3, 20) }));
      paramContext = null;
    }
    for (;;)
    {
      return paramContext;
      if (paramContext.size() > 1)
      {
        Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] { paramIntent.toUri(0), a.b(3, 20) }));
        paramIntent = paramContext.iterator();
        if (paramIntent.hasNext())
        {
          Log.w("ConnectionTracker", ((ResolveInfo)paramIntent.next()).serviceInfo.name);
          paramContext = null;
          continue;
        }
      }
      paramContext = ((ResolveInfo)paramContext.get(0)).serviceInfo;
    }
  }
  
  public static bzw a()
  {
    synchronized (a)
    {
      if (b == null)
      {
        bzw localbzw = new bzw;
        localbzw.<init>();
        b = localbzw;
      }
      return b;
    }
  }
  
  private static int b()
  {
    try
    {
      if ((byk.a) && (cks.b()) && (cks.a() == Process.myUid())) {}
      for (i = ((Integer)bzy.a.c()).intValue();; i = 0) {
        return i;
      }
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        int i = 0;
      }
    }
  }
  
  public final void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    a(paramContext, paramServiceConnection, null, null, "UNBIND");
    paramContext.unbindService(paramServiceConnection);
  }
  
  public void a(Context paramContext, ServiceConnection paramServiceConnection, String paramString1, Intent paramIntent, String paramString2)
  {
    if (!byk.a) {
      return;
    }
    long l2 = Process.myPid() << 32 | System.identityHashCode(paramServiceConnection);
    int i = b();
    label42:
    long l3;
    long l1;
    if ((i == 0) || (this.h == null))
    {
      i = 0;
      if (i == 0) {
        break label359;
      }
      l3 = System.currentTimeMillis();
      paramServiceConnection = null;
      if ((b() & bzz.b) != 0) {
        paramServiceConnection = a.b(3, 5);
      }
      l1 = 0L;
      if ((b() & bzz.d) != 0) {
        l1 = Debug.getNativeHeapAllocatedSize();
      }
      if ((!paramString2.equals("UNBIND")) && (!paramString2.equals("DISCONNECT"))) {
        break label361;
      }
    }
    for (paramServiceConnection = new ConnectionEvent(l3, paramString2, null, null, null, null, paramServiceConnection, l2, SystemClock.elapsedRealtime(), l1);; paramServiceConnection = new ConnectionEvent(l3, paramString2, a.b(paramContext), paramString1, paramIntent.processName, paramIntent.name, paramServiceConnection, l2, SystemClock.elapsedRealtime(), l1))
    {
      paramContext.startService(new Intent().setComponent(g).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", paramServiceConnection));
      break;
      if ((paramString2 == "DISCONNECT") || (paramString2 == "UNBIND"))
      {
        if (this.h.a(l2))
        {
          i = 1;
          break label42;
        }
        i = 0;
        break label42;
      }
      Object localObject = a(paramContext, paramIntent);
      if (localObject == null)
      {
        Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[] { paramString1, paramIntent.toUri(0) }));
        i = 0;
        break label42;
      }
      String str = a.b(paramContext);
      paramServiceConnection = ((ServiceInfo)localObject).processName;
      localObject = ((ServiceInfo)localObject).name;
      if ((this.c.contains(str)) || (this.d.contains(paramString1)) || (this.e.contains(paramServiceConnection)) || (this.f.contains(localObject)) || ((paramServiceConnection.equals(str)) && ((i & bzz.c) != 0)))
      {
        i = 0;
        break label42;
      }
      this.h.a(Long.valueOf(l2));
      i = 1;
      break label42;
      label359:
      break;
      label361:
      paramIntent = a(paramContext, paramIntent);
    }
  }
  
  public final boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return a(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt);
  }
  
  public final boolean a(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    a(paramContext, paramServiceConnection, paramString, paramIntent, "BIND");
    return paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
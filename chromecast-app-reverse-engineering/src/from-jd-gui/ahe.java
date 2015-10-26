import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ahe
{
  private static final String a = ahe.class.getCanonicalName();
  private static Map d = new ConcurrentHashMap();
  private static ScheduledThreadPoolExecutor e;
  private static int f = aho.a;
  private static boolean g;
  private static Context h;
  private static Object i = new Object();
  private static String j;
  private final String b;
  private final ahk c;
  
  private ahe(Context arg1, String arg2, afb paramafb)
  {
    ajp.a(???, "context");
    this.b = aji.c(???);
    paramafb = afb.a();
    if ((paramafb != null) && ((??? == null) || (???.equals(paramafb.g)))) {
      this.c = new ahk(paramafb);
    }
    for (;;)
    {
      synchronized (i)
      {
        if (h == null) {
          h = ???.getApplicationContext();
        }
      }
      synchronized (i)
      {
        if (e != null)
        {
          return;
          paramafb = ???;
          if (??? == null) {
            paramafb = aji.a(???);
          }
          this.c = new ahk(null, paramafb);
          continue;
          ??? = finally;
          throw ???;
        }
        ??? = new java/util/concurrent/ScheduledThreadPoolExecutor;
        ???.<init>(1);
        e = ???;
        ??? = new ahf();
        e.scheduleAtFixedRate(???, 0L, 15L, TimeUnit.SECONDS);
        ??? = new ahg();
        e.scheduleAtFixedRate(???, 0L, 86400L, TimeUnit.SECONDS);
      }
    }
  }
  
  public static int a()
  {
    synchronized (i)
    {
      int k = f;
      return k;
    }
  }
  
  public static ahe a(Context paramContext)
  {
    return new ahe(paramContext, null, null);
  }
  
  public static ahe a(Context paramContext, String paramString)
  {
    return new ahe(paramContext, paramString, null);
  }
  
  private static ahr a(ahp paramahp, Set paramSet)
  {
    ahr localahr = new ahr();
    boolean bool = afv.b(h);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramSet.iterator();
    label217:
    while (localIterator.hasNext())
    {
      ahk localahk = (ahk)localIterator.next();
      aht localaht = a(localahk);
      if (localaht != null)
      {
        paramSet = localahk.b;
        ajn localajn = aji.a(paramSet, false);
        aga localaga = aga.a(null, String.format("%s/activities", new Object[] { paramSet }), null, null);
        Bundle localBundle = localaga.d;
        paramSet = localBundle;
        if (localBundle == null) {
          paramSet = new Bundle();
        }
        paramSet.putString("access_token", localahk.a);
        localaga.d = paramSet;
        if (localajn == null) {
          paramSet = null;
        }
        for (;;)
        {
          if (paramSet == null) {
            break label217;
          }
          localArrayList.add(paramSet);
          break;
          int k = localaht.a(localaga, localajn.a, bool);
          if (k == 0)
          {
            paramSet = null;
          }
          else
          {
            localahr.a = (k + localahr.a);
            localaga.a(new ahj(localahk, localaga, localaht, localahr));
            paramSet = localaga;
          }
        }
      }
    }
    if (localArrayList.size() > 0)
    {
      aiw.a(ags.e, a, "Flushing %d events due to %s.", new Object[] { Integer.valueOf(localahr.a), paramahp.toString() });
      paramahp = localArrayList.iterator();
      while (paramahp.hasNext()) {
        ((aga)paramahp.next()).a();
      }
    }
    for (paramahp = localahr;; paramahp = null) {
      return paramahp;
    }
  }
  
  private static aht a(ahk paramahk)
  {
    synchronized (i)
    {
      paramahk = (aht)d.get(paramahk);
      return paramahk;
    }
  }
  
  private static aht b(Context paramContext, ahk paramahk)
  {
    Object localObject1 = (aht)d.get(paramahk);
    ahx localahx = null;
    if (localObject1 == null) {
      localahx = ahx.a(paramContext);
    }
    synchronized (i)
    {
      aht localaht = (aht)d.get(paramahk);
      localObject1 = localaht;
      if (localaht == null)
      {
        localObject1 = new aht;
        ((aht)localObject1).<init>(localahx, paramContext.getPackageName(), b(paramContext));
        d.put(paramahk, localObject1);
      }
      return (aht)localObject1;
    }
  }
  
  private static String b(Context paramContext)
  {
    if (j == null) {}
    synchronized (i)
    {
      if (j == null)
      {
        str = paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
        j = str;
        if (str == null)
        {
          str = String.valueOf(UUID.randomUUID().toString());
          if (str.length() == 0) {
            break label108;
          }
          str = "XZ".concat(str);
          j = str;
          paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", j).apply();
        }
      }
      return j;
      label108:
      String str = new String("XZ");
    }
  }
  
  private static int g()
  {
    synchronized (i)
    {
      Iterator localIterator = d.values().iterator();
      for (int k = 0; localIterator.hasNext(); k = ((aht)localIterator.next()).a() + k) {}
      return k;
    }
  }
  
  private static int h()
  {
    ahs localahs = ahs.a(h);
    Iterator localIterator = localahs.a.keySet().iterator();
    Object localObject;
    for (int k = 0; localIterator.hasNext(); k = ((List)localObject).size() + k)
    {
      localObject = (ahk)localIterator.next();
      aht localaht = b(h, (ahk)localObject);
      localObject = (List)localahs.a.get(localObject);
      localaht.a((List)localObject);
    }
    return k;
  }
  
  public final void a(String paramString, Bundle paramBundle)
  {
    a(paramString, null, paramBundle, false);
  }
  
  public final void a(String paramString, Double paramDouble, Bundle paramBundle)
  {
    a(paramString, null, paramBundle, true);
  }
  
  void a(String paramString, Double paramDouble, Bundle paramBundle, boolean paramBoolean)
  {
    paramBundle = new ahm(this.b, paramString, paramDouble, paramBundle, paramBoolean);
    paramDouble = h;
    paramString = this.c;
    afv.d().execute(new ahh(paramDouble, paramString, paramBundle));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

public abstract class ads
  implements Comparable
{
  public final int a;
  public final String b;
  final int c;
  Integer d;
  adv e;
  boolean f;
  public boolean g;
  boolean h;
  public aec i;
  public adh j;
  public Object k;
  private final aeh l;
  private final adz m;
  private long n;
  
  public ads(int paramInt, String paramString, adz paramadz)
  {
    aeh localaeh;
    if (aeh.a)
    {
      localaeh = new aeh();
      this.l = localaeh;
      this.f = true;
      this.g = false;
      this.h = false;
      this.n = 0L;
      this.j = null;
      this.a = paramInt;
      this.b = paramString;
      this.m = paramadz;
      this.i = new aec();
      if (TextUtils.isEmpty(paramString)) {
        break label118;
      }
      paramString = Uri.parse(paramString);
      if (paramString == null) {
        break label118;
      }
      paramString = paramString.getHost();
      if (paramString == null) {
        break label118;
      }
    }
    label118:
    for (paramInt = paramString.hashCode();; paramInt = 0)
    {
      this.c = paramInt;
      return;
      localaeh = null;
      break;
    }
  }
  
  protected static aef a(aef paramaef)
  {
    return paramaef;
  }
  
  private static byte[] a(Map paramMap, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getKey(), paramString));
        localStringBuilder.append('=');
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getValue(), paramString));
        localStringBuilder.append('&');
      }
      paramMap = localStringBuilder.toString().getBytes(paramString);
    }
    catch (UnsupportedEncodingException paramMap)
    {
      throw new RuntimeException("Encoding not supported: " + paramString, paramMap);
    }
    return paramMap;
  }
  
  public abstract ady a(adp paramadp);
  
  public Map a()
  {
    return Collections.emptyMap();
  }
  
  public abstract void a(Object paramObject);
  
  public final void a(String paramString)
  {
    if (aeh.a) {
      this.l.a(paramString, Thread.currentThread().getId());
    }
    for (;;)
    {
      return;
      if (this.n == 0L) {
        this.n = SystemClock.elapsedRealtime();
      }
    }
  }
  
  public void b(aef paramaef)
  {
    if (this.m != null) {
      this.m.a(paramaef);
    }
  }
  
  final void b(String paramString)
  {
    adv localadv;
    Object localObject2;
    if (this.e != null)
    {
      localadv = this.e;
      synchronized (localadv.b)
      {
        localadv.b.remove(this);
        synchronized (localadv.d)
        {
          localObject2 = localadv.d.iterator();
          if (((Iterator)localObject2).hasNext()) {
            ((Iterator)localObject2).next();
          }
        }
      }
      if (!this.f) {}
    }
    for (;;)
    {
      synchronized (localadv.a)
      {
        localObject2 = this.b;
        Queue localQueue = (Queue)localadv.a.remove(localObject2);
        if (localQueue != null)
        {
          if (aeg.a) {
            aeg.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] { Integer.valueOf(localQueue.size()), localObject2 });
          }
          localadv.c.addAll(localQueue);
        }
        if (!aeh.a) {
          break label247;
        }
        l1 = Thread.currentThread().getId();
        if (Looper.myLooper() != Looper.getMainLooper())
        {
          new Handler(Looper.getMainLooper()).post(new adt(this, paramString, l1));
          return;
        }
      }
      this.l.a(paramString, l1);
      this.l.a(toString());
      continue;
      label247:
      long l1 = SystemClock.elapsedRealtime() - this.n;
      if (l1 >= 3000L) {
        aeg.b("%d ms: %s", new Object[] { Long.valueOf(l1), toString() });
      }
    }
  }
  
  @Deprecated
  public final byte[] b()
  {
    if (0 != 0) {
      throw new NullPointerException();
    }
    return null;
  }
  
  public String c()
  {
    return "application/x-www-form-urlencoded; charset=" + "UTF-8";
  }
  
  public byte[] d()
  {
    return null;
  }
  
  public adu e()
  {
    return adu.b;
  }
  
  public final int f()
  {
    return this.i.a();
  }
  
  public String toString()
  {
    String str2 = "0x" + Integer.toHexString(this.c);
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.g) {}
    for (String str1 = "[X] ";; str1 = "[ ] ") {
      return str1 + this.b + " " + str2 + " " + e() + " " + this.d;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ads.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
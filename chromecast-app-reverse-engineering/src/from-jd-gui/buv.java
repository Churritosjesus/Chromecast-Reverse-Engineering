import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class buv
  extends bub
{
  private static final String g = a.e("com.google.cast.media");
  public btj e;
  public final List f = new ArrayList();
  private final buy h = new buy(86400000L);
  private final buy i = new buy(86400000L);
  private final buy j = new buy(86400000L);
  private final buy k = new buy(86400000L);
  private final buy l = new buy(86400000L);
  private final buy m = new buy(86400000L);
  private final buy n = new buy(86400000L);
  private final buy o = new buy(86400000L);
  private final buy p = new buy(86400000L);
  private final buy q = new buy(86400000L);
  
  public buv(String paramString)
  {
    super(g, "MediaControlChannel", paramString, 1000L);
    this.f.add(this.h);
    this.f.add(this.i);
    this.f.add(this.j);
    this.f.add(this.k);
    this.f.add(this.l);
    this.f.add(this.m);
    this.f.add(this.n);
    this.f.add(this.o);
    this.f.add(this.p);
    this.f.add(this.q);
    f();
  }
  
  private void a(long paramLong, JSONObject paramJSONObject)
  {
    int i3 = 1;
    boolean bool = this.h.a(paramLong);
    int i2;
    if ((this.l.b()) && (!this.l.a(paramLong)))
    {
      i1 = 1;
      if (this.m.b())
      {
        i2 = i3;
        if (!this.m.a(paramLong)) {}
      }
      else
      {
        if ((!this.n.b()) || (this.n.a(paramLong))) {
          break label227;
        }
        i2 = i3;
      }
      label87:
      if (i1 == 0) {
        break label249;
      }
    }
    label227:
    label249:
    for (int i1 = 2;; i1 = 0)
    {
      i3 = i1;
      if (i2 != 0) {
        i3 = i1 | 0x1;
      }
      if ((bool) || (this.e == null))
      {
        this.e = new btj(paramJSONObject);
        SystemClock.elapsedRealtime();
      }
      for (i1 = 7;; i1 = this.e.a(paramJSONObject, i3))
      {
        if ((i1 & 0x1) != 0)
        {
          SystemClock.elapsedRealtime();
          a();
        }
        if ((i1 & 0x2) != 0)
        {
          SystemClock.elapsedRealtime();
          a();
        }
        if ((i1 & 0x4) != 0) {
          b();
        }
        paramJSONObject = this.f.iterator();
        while (paramJSONObject.hasNext()) {
          ((buy)paramJSONObject.next()).a(paramLong, 0, null);
        }
        i1 = 0;
        break;
        i2 = 0;
        break label87;
      }
      return;
    }
  }
  
  private long e()
  {
    if (this.e == null) {
      throw new IllegalStateException("No current media session");
    }
    return this.e.a;
  }
  
  private void f()
  {
    this.e = null;
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      buy localbuy = (buy)localIterator.next();
      synchronized (buy.b)
      {
        if (localbuy.a != -1L) {
          localbuy.a();
        }
      }
    }
  }
  
  public final long a(bux parambux)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = d();
    this.o.a(l1, parambux);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "GET_STATUS");
      if (this.e != null) {
        localJSONObject.put("mediaSessionId", this.e.a);
      }
      a(localJSONObject.toString(), l1, null);
      return l1;
    }
    catch (JSONException parambux)
    {
      for (;;) {}
    }
  }
  
  public final long a(bux parambux, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = d();
    this.i.a(l1, parambux);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "PAUSE");
      localJSONObject.put("mediaSessionId", e());
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException parambux)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public void a() {}
  
  public final void a(String paramString)
  {
    this.b.b("message received: %s", new Object[] { paramString });
    for (;;)
    {
      Object localObject2;
      long l1;
      JSONObject localJSONObject;
      try
      {
        Object localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramString);
        localObject2 = ((JSONObject)localObject1).getString("type");
        l1 = ((JSONObject)localObject1).optLong("requestId", -1L);
        if (((String)localObject2).equals("MEDIA_STATUS"))
        {
          localObject1 = ((JSONObject)localObject1).getJSONArray("status");
          if (((JSONArray)localObject1).length() > 0)
          {
            a(l1, ((JSONArray)localObject1).getJSONObject(0));
            return;
          }
          this.e = null;
          a();
          b();
          this.o.a(l1, 0, null);
          continue;
        }
      }
      catch (JSONException localJSONException)
      {
        this.b.d("Message is malformed (%s); ignoring: %s", new Object[] { localJSONException.getMessage(), paramString });
        continue;
        if (((String)localObject2).equals("INVALID_PLAYER_STATE"))
        {
          this.b.d("received unexpected error: Invalid Player State.", new Object[0]);
          localJSONObject = localJSONException.optJSONObject("customData");
          localObject2 = this.f.iterator();
          if (!((Iterator)localObject2).hasNext()) {
            continue;
          }
          ((buy)((Iterator)localObject2).next()).a(l1, 2100, localJSONObject);
          continue;
        }
        if (((String)localObject2).equals("LOAD_FAILED"))
        {
          localJSONObject = localJSONObject.optJSONObject("customData");
          this.h.a(l1, 2100, localJSONObject);
          continue;
        }
        if (((String)localObject2).equals("LOAD_CANCELLED"))
        {
          localJSONObject = localJSONObject.optJSONObject("customData");
          this.h.a(l1, 2101, localJSONObject);
          continue;
        }
        if (!((String)localObject2).equals("INVALID_REQUEST")) {
          continue;
        }
        this.b.d("received unexpected error: Invalid Request.", new Object[0]);
        localJSONObject = localJSONObject.optJSONObject("customData");
        localObject2 = this.f.iterator();
      }
      while (((Iterator)localObject2).hasNext()) {
        ((buy)((Iterator)localObject2).next()).a(l1, 2100, localJSONObject);
      }
    }
  }
  
  protected final boolean a(long paramLong)
  {
    ??? = this.f.iterator();
    while (((Iterator)???).hasNext()) {
      ((buy)((Iterator)???).next()).a(paramLong, 2102);
    }
    for (;;)
    {
      synchronized (buy.b)
      {
        Iterator localIterator = this.f.iterator();
        if (localIterator.hasNext())
        {
          if (!((buy)localIterator.next()).b()) {
            continue;
          }
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final long b(bux parambux, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = d();
    this.j.a(l1, parambux);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "PLAY");
      localJSONObject.put("mediaSessionId", e());
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException parambux)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public void b() {}
  
  public final void c()
  {
    super.c();
    f();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\buv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
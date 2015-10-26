import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.gms.cast.CastDevice;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class alm
{
  public final bkl a;
  public final SharedPreferences b;
  public final ass c;
  bmu d;
  final List e = new ArrayList();
  public final List f = new ArrayList();
  public final List g = Collections.synchronizedList(new ArrayList());
  public final List h = Collections.synchronizedList(new ArrayList());
  public final HashSet i;
  final Set j = Collections.synchronizedSet(new HashSet());
  final Set k = Collections.synchronizedSet(new HashSet());
  final Set l = Collections.synchronizedSet(new HashSet());
  final List m = Collections.synchronizedList(new ArrayList());
  private final als n = new aln(this);
  private final String o;
  private final blp p = new blp("DeviceManager");
  private String q;
  private List r;
  private final ExecutorService s;
  
  public alm(bkl parambkl, SharedPreferences paramSharedPreferences)
  {
    this.a = parambkl;
    this.b = paramSharedPreferences;
    this.o = blf.I(SetupApplication.a());
    this.c = SetupApplication.a().j;
    parambkl = this.b.getString("hiddenDevices", "");
    this.i = new HashSet();
    if (!TextUtils.isEmpty(parambkl)) {
      this.i.addAll(Arrays.asList(parambkl.split(",")));
    }
    this.s = Executors.newFixedThreadPool(4);
  }
  
  private boolean a(int paramInt1, int paramInt2)
  {
    Object localObject;
    aow localaow;
    if (paramInt2 == alr.a)
    {
      localObject = this.g;
      localaow = (aow)((List)localObject).get(paramInt1);
      localaow.c(aoz.a);
      localaow.c(aoz.b);
      localaow.c(aoz.c);
      if ((!localaow.d(aoz.a)) && (!localaow.d(aoz.d)) && (!localaow.d(aoz.c)) && (!localaow.d(aoz.b))) {
        break label141;
      }
    }
    boolean bool;
    label141:
    for (paramInt2 = 1;; paramInt2 = 0)
    {
      if (paramInt2 == 0) {
        break label146;
      }
      for (bool = false;; bool = false)
      {
        return bool;
        if (paramInt2 == alr.b)
        {
          localObject = this.h;
          break;
        }
        this.p.a("purgeStaleDevice: Unknown device list type passed in", new Object[0]);
      }
    }
    label146:
    a(paramInt1, (List)localObject);
    if (this.d != null)
    {
      if (localObject != this.g) {
        break label206;
      }
      this.d.g(paramInt1);
    }
    for (;;)
    {
      localObject = localaow.c.b;
      localaow.f();
      bkl.b();
      localaow.a();
      bool = true;
      break;
      label206:
      if (localObject == this.h) {
        this.d.a(this.h.isEmpty());
      }
    }
  }
  
  private void g(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    for (;;)
    {
      boolean bool = this.m.isEmpty();
      if (this.r != null)
      {
        Iterator localIterator = this.r.iterator();
        if (localIterator.hasNext())
        {
          Object localObject = (ast)localIterator.next();
          if (!((ast)localObject).b.equals(paramString)) {
            break;
          }
          this.m.add(localObject);
          this.m.size();
          if (this.d != null)
          {
            localObject = this.d;
            paramString = ((bmu)localObject).d;
            if (bool)
            {
              ((bmu)localObject).b();
              ((bmu)localObject).c(((bmu)localObject).b());
            }
            else
            {
              ((bmu)localObject).b();
              ((bmu)localObject).b(((bmu)localObject).b());
            }
          }
        }
      }
    }
  }
  
  public aow a(String paramString1, String paramString2)
  {
    Object localObject = e(paramString1);
    paramString1 = (String)localObject;
    if (localObject == null)
    {
      localObject = this.g.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        paramString1 = (aow)((Iterator)localObject).next();
      } while ((paramString1.n() == null) || (!paramString1.n().equals(paramString2)));
    }
    for (;;)
    {
      return paramString1;
      paramString1 = null;
    }
  }
  
  public aow a(boolean paramBoolean)
  {
    aow localaow = new aow(this.a);
    localaow.a(this.n);
    if (paramBoolean) {}
    for (int i1 = this.g.size();; i1 = e())
    {
      a(i1, localaow);
      if (this.d != null) {
        this.d.f(i1);
      }
      g();
      return localaow;
    }
  }
  
  void a(int paramInt, aow paramaow)
  {
    this.g.add(paramInt, paramaow);
    this.g.size();
    f(paramaow.j);
  }
  
  void a(int paramInt, List paramList)
  {
    aow localaow = (aow)paramList.remove(paramInt);
    paramList.size();
    if ((localaow != null) && (paramList == this.g)) {
      g(localaow.j);
    }
  }
  
  public final void a(aow paramaow)
  {
    String str = paramaow.c.b;
    int i1 = this.g.indexOf(paramaow);
    if (i1 != -1)
    {
      a(i1, this.g);
      if (this.d != null) {
        this.d.g(i1);
      }
    }
    this.c.b(paramaow);
  }
  
  public final void a(azf paramazf, String paramString)
  {
    this.e.add(paramazf);
    if (this.e.size() == 1)
    {
      paramazf = this.c.a.values().iterator();
      while (paramazf.hasNext())
      {
        aqj localaqj = (aqj)paramazf.next();
        String str;
        if (localaqj.b.m)
        {
          str = localaqj.b.c.b;
        }
        else
        {
          str = localaqj.b.c.b;
          localaqj.f();
        }
      }
    }
    a(paramString);
    this.q = paramString;
  }
  
  public final void a(String arg1)
  {
    Object localObject1 = this.q;
    if (!TextUtils.equals(this.q, ???))
    {
      this.q = ???;
      synchronized (this.g)
      {
        localObject1 = this.g.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          aow localaow = (aow)((Iterator)localObject1).next();
          if ((localaow.b(aoz.b) == -1L) && (localaow.b(aoz.c) == -1L))
          {
            this.c.b(localaow);
            int i1 = this.g.indexOf(localaow);
            ((Iterator)localObject1).remove();
            this.g.size();
            if (this.d != null) {
              this.d.g(i1);
            }
            g(localaow.j);
          }
        }
      }
    }
  }
  
  public final void a(List paramList)
  {
    this.r = paramList;
    this.m.clear();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      ast localast = (ast)paramList.next();
      if (b(localast.b) == null) {
        this.m.add(localast);
      }
    }
    if (this.d != null) {
      this.d.a.a();
    }
  }
  
  public final void a(Set paramSet)
  {
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      aow localaow = (aow)localIterator.next();
      if ((localaow.r()) && (paramSet.contains(localaow.n())))
      {
        int i1 = aoz.a;
        long l1 = bkl.b();
        localaow.u[(i1 - 1)] = l1;
      }
    }
  }
  
  public final void a(uh paramuh)
  {
    CastDevice localCastDevice = CastDevice.a(paramuh.m);
    if (!ayy.a(localCastDevice))
    {
      paramuh = localCastDevice.e;
      paramuh = localCastDevice.f;
    }
    for (;;)
    {
      return;
      int i1;
      if ((localCastDevice != null) && ((localCastDevice.b.startsWith(this.o)) || ("__opencast__".equals(localCastDevice.b))))
      {
        i1 = 1;
        label60:
        if (i1 != 0) {}
      }
      else
      {
        for (;;)
        {
          Object localObject3;
          synchronized (this.g)
          {
            paramuh = a(localCastDevice.b, localCastDevice.d.getHostAddress());
            if (paramuh == null)
            {
              paramuh = a(true);
              paramuh.b = localCastDevice;
              if (!paramuh.d) {
                paramuh.c.b = paramuh.b.e;
              }
              paramuh.a(paramuh.b.b);
              paramuh.a(aoz.d);
              ??? = paramuh.n();
              ??? = new bdu((String)???, 0, null, bew.c, null, this.s);
              Object localObject4;
              long l1;
              if ((!this.k.contains(???)) && (TextUtils.isEmpty(paramuh.j)))
              {
                localObject4 = paramuh.n();
                localObject3 = new alo(this, paramuh.c.b, (String)localObject4, paramuh);
                aqi.a();
                this.k.add(localObject4);
                l1 = ((bdu)???).d();
                localObject4 = new bdo(((bdu)???).d, "E8C28D3C");
                ((bdu)???).a("getAppDeviceId", l1, (bfp)localObject4, ((bdu)???).e, new bed((bdu)???, (bdn)localObject3, (bdo)localObject4));
              }
              if ((!this.j.contains(???)) && (!paramuh.d))
              {
                localObject3 = paramuh.n();
                localObject4 = new alp(this, paramuh.c.b, (String)localObject3, paramuh);
                this.j.add(localObject3);
                ((bdu)???).a(1198, null, false, (bdn)localObject4);
              }
              if ((!this.l.contains(???)) && (paramuh.q == null))
              {
                localObject3 = paramuh.n();
                ??? = new alq(this, paramuh.c.b, (String)localObject3, paramuh);
                this.l.add(localObject3);
                l1 = ((bdu)???).d();
                localObject3 = new bfg(((bdu)???).d);
                ((bdu)???).a("getOffersToken", l1, (bfp)localObject3, ((bdu)???).e, new bee((bdu)???, (bdn)???, (bfg)localObject3));
              }
              if (this.c.a(paramuh) == null)
              {
                localObject3 = this.c;
                if (paramuh.b != null) {
                  break label577;
                }
                ((ass)localObject3).b.a("Tried to create a connection for %s but castDevice was null", new Object[] { paramuh.c.b });
              }
              if ((!localCastDevice.a(4)) || (localCastDevice.a(1))) {
                break label682;
              }
              this.b.edit().putBoolean("hendrixDiscovered", true).apply();
              break;
              i1 = 0;
              break label60;
            }
            if (paramuh.q()) {
              b(paramuh);
            }
          }
          label577:
          synchronized (((ass)localObject3).a)
          {
            ??? = (aqj)((ass)localObject3).a.get(paramuh.a);
            if (??? == null)
            {
              ??? = paramuh.c.b;
              ??? = new aqj;
              ((aqj)???).<init>(paramuh, SetupApplication.a(), atf.a(SetupApplication.a()));
              ((ass)localObject3).a.put(paramuh.a, ???);
              paramuh = (uh)???;
              paramuh.f();
            }
            else
            {
              paramuh = paramuh.c.b;
              paramuh = (uh)???;
            }
          }
        }
        label682:
        if (localCastDevice.a(1)) {
          this.b.edit().putBoolean("nonhendrixDiscovered", true).apply();
        }
      }
    }
  }
  
  public final boolean a()
  {
    return this.g.isEmpty();
  }
  
  public final boolean a(int paramInt)
  {
    boolean bool;
    if (this.g.isEmpty()) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      Iterator localIterator = this.g.iterator();
      for (;;)
      {
        if (localIterator.hasNext()) {
          if (((aow)localIterator.next()).d(paramInt))
          {
            bool = true;
            break;
          }
        }
      }
      bool = false;
    }
  }
  
  public final int b()
  {
    return this.g.size();
  }
  
  public final aow b(String paramString)
  {
    Iterator localIterator = this.g.iterator();
    aow localaow;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localaow = (aow)localIterator.next();
    } while (!TextUtils.equals(localaow.j, paramString));
    for (paramString = localaow;; paramString = null) {
      return paramString;
    }
  }
  
  public void b(aow paramaow)
  {
    int i2 = this.g.indexOf(paramaow);
    this.g.remove(paramaow);
    this.g.size();
    int i1 = e();
    a(i1, paramaow);
    if (this.d != null)
    {
      if (i2 != i1) {
        break label64;
      }
      this.d.e(i2);
    }
    for (;;)
    {
      return;
      label64:
      this.d.a(i2, i1);
    }
  }
  
  public final aow c(String paramString)
  {
    Iterator localIterator = this.g.iterator();
    aow localaow;
    while (localIterator.hasNext())
    {
      localaow = (aow)localIterator.next();
      if (localaow.f().equals(paramString)) {
        paramString = localaow;
      }
    }
    for (;;)
    {
      return paramString;
      localIterator = this.h.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          localaow = (aow)localIterator.next();
          if (localaow.f().equals(paramString))
          {
            paramString = localaow;
            break;
          }
        }
      }
      paramString = null;
    }
  }
  
  public final boolean c()
  {
    boolean bool;
    if (this.g.isEmpty()) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      Iterator localIterator = this.g.iterator();
      for (;;)
      {
        if (localIterator.hasNext()) {
          if (!((aow)localIterator.next()).q())
          {
            bool = false;
            break;
          }
        }
      }
      bool = true;
    }
  }
  
  public final boolean c(aow paramaow)
  {
    boolean bool2 = false;
    for (;;)
    {
      int i1;
      synchronized (this.g)
      {
        i1 = this.g.indexOf(paramaow);
        if ((i1 < 0) || (!a(i1, alr.a))) {
          break label126;
        }
        bool1 = true;
        if (i1 != -1) {}
      }
      for (;;)
      {
        synchronized (this.h)
        {
          i1 = this.h.indexOf(paramaow);
          if (i1 == -1)
          {
            return bool2;
            paramaow = finally;
            throw paramaow;
          }
          if (a(i1, alr.b))
          {
            bool1 = true;
            bool2 = bool1;
            if (!bool1) {
              continue;
            }
            g();
            bool2 = bool1;
          }
        }
      }
      label126:
      boolean bool1 = false;
    }
  }
  
  public aow d(String paramString)
  {
    Iterator localIterator = this.g.iterator();
    aow localaow;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localaow = (aow)localIterator.next();
    } while ((localaow.c.q == null) || (!localaow.c.q.equals(paramString)));
    for (paramString = localaow;; paramString = null) {
      return paramString;
    }
  }
  
  public final ArrayList d()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      aow localaow = (aow)localIterator.next();
      if (!localaow.q()) {
        localArrayList.add(localaow);
      }
    }
    return localArrayList;
  }
  
  public void d(aow paramaow)
  {
    synchronized (this.h)
    {
      boolean bool = this.h.isEmpty();
      this.h.add(paramaow);
      this.h.size();
      if (this.d != null)
      {
        paramaow = this.d;
        if (bool)
        {
          paramaow.a();
          paramaow.c(paramaow.a() - 1);
        }
      }
      else
      {
        return;
      }
      paramaow.a();
      paramaow.b(paramaow.a() - 1);
    }
  }
  
  int e()
  {
    int i1 = 0;
    if (i1 < this.g.size()) {
      if (((aow)this.g.get(i1)).q()) {}
    }
    for (;;)
    {
      return i1;
      i1++;
      break;
      i1 = this.g.size();
    }
  }
  
  public aow e(String paramString)
  {
    Iterator localIterator = this.g.iterator();
    aow localaow;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localaow = (aow)localIterator.next();
    } while ((localaow.a == null) || (!localaow.a.equals(aow.b(paramString))));
    for (paramString = localaow;; paramString = null) {
      return paramString;
    }
  }
  
  void f(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    for (;;)
    {
      Object localObject = this.m.iterator();
      if (((Iterator)localObject).hasNext())
      {
        if (!paramString.equals(((ast)((Iterator)localObject).next()).b)) {
          break;
        }
        ((Iterator)localObject).remove();
        this.m.size();
        if (this.d != null)
        {
          paramString = this.d;
          boolean bool = this.m.isEmpty();
          localObject = paramString.d;
          if (bool)
          {
            paramString.b();
            paramString.d(paramString.b());
          }
          else
          {
            paramString.b();
            paramString.b(paramString.b());
          }
        }
      }
    }
  }
  
  public final boolean f()
  {
    int i1 = this.g.size();
    boolean bool = false;
    i1--;
    while (i1 >= 0)
    {
      if (a(i1, alr.a)) {
        bool = true;
      }
      i1--;
    }
    for (i1 = this.h.size() - 1; i1 >= 0; i1--) {
      if (a(i1, alr.b)) {
        bool = true;
      }
    }
    if (bool) {
      g();
    }
    return bool;
  }
  
  void g()
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      ((azf)localIterator.next()).s();
    }
  }
  
  public final String toString()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((aow)localIterator.next()).toString());
    }
    return TextUtils.join(", ", localArrayList);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\alm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
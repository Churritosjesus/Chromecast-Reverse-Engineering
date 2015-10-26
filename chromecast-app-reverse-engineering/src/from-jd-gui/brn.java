import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class brn
  extends bra
{
  private boolean a;
  private final brk b;
  private final bqn c;
  private final bqm e;
  private final brf f;
  private long g;
  private final bsb h;
  private final bsb i;
  private final bqr j;
  private long k;
  private boolean l;
  
  protected brn(brb parambrb, brd parambrd)
  {
    super(parambrb);
    a.c(parambrd);
    this.g = Long.MIN_VALUE;
    this.e = new bqm(parambrb);
    this.b = new brk(parambrb);
    this.c = new bqn(parambrb);
    this.f = brd.d(parambrb);
    this.j = new bqr(k());
    this.h = new bro(this, parambrb);
    this.i = new brp(this, parambrb);
  }
  
  private void a(bre parambre, cpf paramcpf)
  {
    a.c(parambre);
    a.c(paramcpf);
    Object localObject2 = new bpd(this.d);
    Object localObject3 = parambre.c;
    a.f((String)localObject3);
    Object localObject4 = bpi.a((String)localObject3);
    Object localObject1 = ((cow)localObject2).h.i.listIterator();
    while (((ListIterator)localObject1).hasNext()) {
      if (((Uri)localObject4).equals(((cpd)((ListIterator)localObject1).next()).a())) {
        ((ListIterator)localObject1).remove();
      }
    }
    ((cow)localObject2).h.i.add(new bpi(((bpd)localObject2).a, (String)localObject3));
    ((bpd)localObject2).b = parambre.d;
    localObject3 = ((bpd)localObject2).a();
    bpy localbpy = (bpy)((cou)localObject3).b(bpy.class);
    localbpy.a = "data";
    localbpy.g = true;
    ((cou)localObject3).a(paramcpf);
    localObject4 = (bpx)((cou)localObject3).b(bpx.class);
    cpe localcpe = (cpe)((cou)localObject3).b(cpe.class);
    Iterator localIterator = parambre.f.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (Map.Entry)localIterator.next();
      localObject2 = (String)((Map.Entry)localObject1).getKey();
      String str = (String)((Map.Entry)localObject1).getValue();
      if ("an".equals(localObject2))
      {
        localcpe.a = str;
      }
      else if ("av".equals(localObject2))
      {
        localcpe.b = str;
      }
      else if ("aid".equals(localObject2))
      {
        localcpe.c = str;
      }
      else if ("aiid".equals(localObject2))
      {
        localcpe.d = str;
      }
      else if ("uid".equals(localObject2))
      {
        localbpy.c = str;
      }
      else
      {
        a.f((String)localObject2);
        localObject1 = localObject2;
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (((String)localObject2).startsWith("&")) {
            localObject1 = ((String)localObject2).substring(1);
          }
        }
        a.a((String)localObject1, "Name can not be empty or \"&\"");
        ((bpx)localObject4).a.put(localObject1, str);
      }
    }
    b("Sending installation campaign to", parambre.c, paramcpf);
    ((cou)localObject3).e = o().b();
    parambre = ((cou)localObject3).b();
    if (((cou)localObject3).g) {
      throw new IllegalStateException("Measurement prototype can't be submitted");
    }
    if (((cou)localObject3).c) {
      throw new IllegalStateException("Measurement can only be submitted once");
    }
    paramcpf = ((cou)localObject3).a();
    paramcpf.f = paramcpf.b.b();
    if (paramcpf.e != 0L) {}
    for (paramcpf.d = paramcpf.e;; paramcpf.d = paramcpf.b.a())
    {
      paramcpf.c = true;
      parambre.b.execute(new coy(parambre, paramcpf));
      return;
    }
  }
  
  private boolean g(String paramString)
  {
    if (l().checkCallingOrSelfPermission(paramString) == 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void h()
  {
    if (this.l) {}
    for (;;)
    {
      return;
      if ((brz.b()) && (!this.f.b()))
      {
        long l1 = ((Long)bqd.C.a()).longValue();
        if (this.j.a(l1))
        {
          this.j.a();
          b("Connecting to service");
          if (this.f.c())
          {
            b("Connected to service");
            this.j.a = 0L;
            e();
          }
        }
      }
    }
  }
  
  private boolean i()
  {
    int n = 1;
    cox.b();
    r();
    b("Dispatching a batch of local hits");
    int m;
    if ((!this.f.b()) && (!byk.a))
    {
      m = 1;
      if (this.c.b()) {
        break label71;
      }
      label46:
      if ((m == 0) || (n == 0)) {
        break label77;
      }
      b("No network or service available. Will retry later");
    }
    for (;;)
    {
      return false;
      m = 0;
      break;
      label71:
      n = 0;
      break label46;
      label77:
      long l3 = Math.max(brz.f(), brz.g());
      ArrayList localArrayList = new ArrayList();
      long l1 = 0L;
      for (;;)
      {
        try
        {
          this.b.b();
          localArrayList.clear();
          try
          {
            List localList = this.b.a(l3);
            if (localList.isEmpty())
            {
              b("Store is empty, nothing to dispatch");
              v();
              try
              {
                this.b.c();
                this.b.d();
              }
              catch (SQLiteException localSQLiteException1)
              {
                e("Failed to commit local dispatch transaction", localSQLiteException1);
                v();
              }
              break;
            }
            a("Hits loaded from store. count", Integer.valueOf(localSQLiteException1.size()));
            localObject2 = localSQLiteException1.iterator();
            if (!((Iterator)localObject2).hasNext()) {
              continue;
            }
            if (((bsi)((Iterator)localObject2).next()).c != l1) {
              continue;
            }
            d("Database contains successfully uploaded hit", Long.valueOf(l1), Integer.valueOf(localSQLiteException1.size()));
            v();
            try
            {
              this.b.c();
              this.b.d();
            }
            catch (SQLiteException localSQLiteException2)
            {
              e("Failed to commit local dispatch transaction", localSQLiteException2);
              v();
            }
          }
          catch (SQLiteException localSQLiteException3)
          {
            d("Failed to read hits from persisted store", localSQLiteException3);
            v();
            try
            {
              this.b.c();
              this.b.d();
            }
            catch (SQLiteException localSQLiteException4)
            {
              e("Failed to commit local dispatch transaction", localSQLiteException4);
              v();
            }
          }
          break;
        }
        finally
        {
          try
          {
            Object localObject2;
            long l2;
            Iterator localIterator;
            this.b.c();
            this.b.d();
            throw ((Throwable)localObject1);
          }
          catch (SQLiteException localSQLiteException11)
          {
            e("Failed to commit local dispatch transaction", localSQLiteException11);
            v();
          }
        }
        l2 = l1;
        if (this.f.b())
        {
          l2 = l1;
          if (!byk.a)
          {
            b("Service connected, sending hits to the service");
            l2 = l1;
            if (!localSQLiteException4.isEmpty())
            {
              localObject2 = (bsi)localSQLiteException4.get(0);
              l2 = l1;
              if (this.f.a((bsi)localObject2))
              {
                l1 = Math.max(l1, ((bsi)localObject2).c);
                localSQLiteException4.remove(localObject2);
                b("Hit sent do device AnalyticsService for delivery", localObject2);
                try
                {
                  this.b.b(((bsi)localObject2).c);
                  localArrayList.add(Long.valueOf(((bsi)localObject2).c));
                }
                catch (SQLiteException localSQLiteException5)
                {
                  e("Failed to remove hit that was send for delivery", localSQLiteException5);
                  v();
                  try
                  {
                    this.b.c();
                    this.b.d();
                  }
                  catch (SQLiteException localSQLiteException6)
                  {
                    e("Failed to commit local dispatch transaction", localSQLiteException6);
                    v();
                  }
                }
                break;
              }
            }
          }
        }
        l1 = l2;
        if (this.c.b())
        {
          localObject2 = this.c.a(localSQLiteException6);
          localIterator = ((List)localObject2).iterator();
          l1 = l2;
          if (localIterator.hasNext())
          {
            l1 = Math.max(l1, ((Long)localIterator.next()).longValue());
            continue;
          }
          localSQLiteException6.removeAll((Collection)localObject2);
        }
        try
        {
          this.b.a((List)localObject2);
          localArrayList.addAll((Collection)localObject2);
          boolean bool = localArrayList.isEmpty();
          if (!bool) {
            continue;
          }
          try
          {
            this.b.c();
            this.b.d();
          }
          catch (SQLiteException localSQLiteException7)
          {
            e("Failed to commit local dispatch transaction", localSQLiteException7);
            v();
          }
        }
        catch (SQLiteException localSQLiteException8)
        {
          e("Failed to remove successfully uploaded hits", localSQLiteException8);
          v();
          try
          {
            this.b.c();
            this.b.d();
          }
          catch (SQLiteException localSQLiteException9)
          {
            e("Failed to commit local dispatch transaction", localSQLiteException9);
            v();
          }
        }
        break;
        try
        {
          this.b.c();
          this.b.d();
        }
        catch (SQLiteException localSQLiteException10)
        {
          e("Failed to commit local dispatch transaction", localSQLiteException10);
          v();
        }
      }
    }
  }
  
  private long t()
  {
    cox.b();
    r();
    try
    {
      l1 = this.b.g();
      return l1;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        e("Failed to get min/max hit times from local store", localSQLiteException);
        long l1 = 0L;
      }
    }
  }
  
  private void u()
  {
    bse localbse = n();
    if (!localbse.a) {}
    for (;;)
    {
      return;
      if (!localbse.b)
      {
        long l1 = t();
        if ((l1 != 0L) && (Math.abs(k().a() - l1) <= ((Long)bqd.h.a()).longValue()))
        {
          a("Dispatch alarm scheduled (ms)", Long.valueOf(brz.e()));
          localbse.b();
        }
      }
    }
  }
  
  private void v()
  {
    if (this.h.b()) {
      b("All hits dispatched or no network/service. Going to power save mode");
    }
    this.h.c();
    bse localbse = n();
    if (localbse.b) {
      localbse.c();
    }
  }
  
  private long w()
  {
    long l1;
    if (this.g != Long.MIN_VALUE) {
      l1 = this.g;
    }
    for (;;)
    {
      return l1;
      l1 = ((Long)bqd.e.a()).longValue();
      if (this.d.e().f()) {
        l1 = this.d.e().g() * 1000L;
      }
    }
  }
  
  private void x()
  {
    r();
    brb.i();
    this.l = true;
    this.f.d();
    g();
  }
  
  public final long a(bre parambre, boolean paramBoolean)
  {
    a.c(parambre);
    r();
    brb.i();
    for (;;)
    {
      try
      {
        this.b.b();
        this.b.a(parambre.a, parambre.b);
        l1 = this.b.a(parambre.a, parambre.b, parambre.c);
        parambre.e = (1L + l1);
        this.b.a(parambre);
        this.b.c();
      }
      catch (SQLiteException parambre)
      {
        long l1;
        parambre = parambre;
        e("Failed to update Analytics property", parambre);
        try
        {
          this.b.d();
          l1 = -1L;
        }
        catch (SQLiteException parambre)
        {
          e("Failed to end transaction", parambre);
          continue;
        }
      }
      finally {}
      try
      {
        this.b.d();
        return l1;
      }
      catch (SQLiteException parambre)
      {
        e("Failed to end transaction", parambre);
      }
    }
    try
    {
      this.b.d();
      throw parambre;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        e("Failed to end transaction", localSQLiteException);
      }
    }
  }
  
  protected final void a()
  {
    this.b.s();
    this.c.s();
    this.f.s();
  }
  
  protected final void a(bre parambre)
  {
    brb.i();
    b("Sending first hit to property", parambre.c);
    if (o().c().a(brz.l())) {}
    for (;;)
    {
      return;
      Object localObject = o().f();
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        localObject = bqs.a(this.d.a(), (String)localObject);
        b("Found relevant installation campaign", localObject);
        a(parambre, (cpf)localObject);
      }
    }
  }
  
  public final void a(bsf parambsf)
  {
    a(parambsf, this.k);
  }
  
  public final void a(bsf parambsf, long paramLong)
  {
    cox.b();
    r();
    long l1 = -1L;
    long l2 = o().d();
    if (l2 != 0L) {
      l1 = Math.abs(k().a() - l2);
    }
    b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(l1));
    if (!byk.a) {
      h();
    }
    try
    {
      i();
      o().e();
      g();
      if (parambsf != null) {
        parambsf.a();
      }
      if (this.k != paramLong)
      {
        Object localObject = this.e;
        if (Build.VERSION.SDK_INT > 10)
        {
          Context localContext = ((bqm)localObject).c();
          localObject = new android/content/Intent;
          ((Intent)localObject).<init>("com.google.analytics.RADIO_POWERED");
          ((Intent)localObject).addCategory(localContext.getPackageName());
          ((Intent)localObject).putExtra(bqm.a, true);
          localContext.sendOrderedBroadcast((Intent)localObject, null);
        }
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        e("Local dispatch failed", localThrowable);
        o().e();
        g();
        if (parambsf != null) {
          parambsf.a();
        }
      }
    }
  }
  
  public final void a(bsi parambsi)
  {
    a.c(parambsi);
    cox.b();
    r();
    Object localObject1;
    if (this.l)
    {
      c("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
      if (TextUtils.isEmpty(parambsi.a("_m", ""))) {
        break label78;
      }
      localObject1 = parambsi;
      label44:
      h();
      if (!this.f.a((bsi)localObject1)) {
        break label192;
      }
      c("Hit sent to the device AnalyticsService for delivery");
    }
    for (;;)
    {
      return;
      a("Delivering hit", parambsi);
      break;
      label78:
      Object localObject2 = o().b.a();
      localObject1 = parambsi;
      if (localObject2 == null) {
        break label44;
      }
      localObject1 = (Long)((Pair)localObject2).second;
      localObject2 = (String)((Pair)localObject2).first;
      localObject1 = localObject1 + ":" + (String)localObject2;
      localObject2 = new HashMap(parambsi.a);
      ((Map)localObject2).put("_m", localObject1);
      localObject1 = new bsi(this, (Map)localObject2, parambsi.d, parambsi.f, parambsi.c, parambsi.e, parambsi.b);
      break label44;
      label192:
      if (byk.a) {
        this.d.a().a((bsi)localObject1, "Service unavailable on package side");
      } else {
        try
        {
          this.b.a((bsi)localObject1);
          g();
        }
        catch (SQLiteException parambsi)
        {
          e("Delivery failed to save hit to a database", parambsi);
          this.d.a().a((bsi)localObject1, "deliver: failed to insert hit to database");
        }
      }
    }
  }
  
  public final void a(String paramString)
  {
    a.f(paramString);
    brb.i();
    j();
    cpf localcpf = bqs.a(this.d.a(), paramString);
    if (localcpf == null) {
      d("Parsing failed. Ignoring invalid campaign data", paramString);
    }
    for (;;)
    {
      return;
      String str = o().f();
      if (paramString.equals(str))
      {
        e("Ignoring duplicate install campaign");
      }
      else if (!TextUtils.isEmpty(str))
      {
        d("Ignoring multiple install campaigns. original, new", str, paramString);
      }
      else
      {
        o().a(paramString);
        if (o().c().a(brz.l()))
        {
          d("Campaign received too late, ignoring", localcpf);
        }
        else
        {
          b("Received installation campaign", localcpf);
          paramString = this.b.c(0L).iterator();
          while (paramString.hasNext()) {
            a((bre)paramString.next(), localcpf);
          }
        }
      }
    }
  }
  
  final void b()
  {
    r();
    boolean bool;
    Context localContext;
    if (!this.a)
    {
      bool = true;
      a.a(bool, "Analytics backend already started");
      this.a = true;
      if (!byk.a)
      {
        localContext = this.d.a;
        if (bpe.a(localContext)) {
          break label91;
        }
        e("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        label53:
        if (bpj.a(localContext)) {
          break label108;
        }
        e("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
    for (;;)
    {
      this.d.b().a(new brq(this));
      return;
      bool = false;
      break;
      label91:
      if (bpf.a(localContext)) {
        break label53;
      }
      f("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
      break label53;
      label108:
      if (!bpk.a(localContext)) {
        e("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
  
  protected final void c()
  {
    r();
    o().b();
    if (!g("android.permission.ACCESS_NETWORK_STATE"))
    {
      f("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      x();
    }
    if (!g("android.permission.INTERNET"))
    {
      f("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      x();
    }
    if (bpf.a(l())) {
      b("AnalyticsService registered in the app manifest and enabled");
    }
    for (;;)
    {
      if ((!this.l) && (!byk.a) && (!this.b.e())) {
        h();
      }
      g();
      return;
      if (byk.a) {
        f("Device AnalyticsService not registered! Hits will not be delivered reliably.");
      } else {
        e("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
  
  final void d()
  {
    brb.i();
    this.k = k().a();
  }
  
  protected final void e()
  {
    
    if (!byk.a)
    {
      cox.b();
      r();
      j();
      if (!brz.b()) {
        e("Service client disabled. Can't dispatch local hits to device AnalyticsService");
      }
      if (this.f.b()) {
        break label51;
      }
      b("Service not connected");
    }
    for (;;)
    {
      return;
      label51:
      if (!this.b.e())
      {
        b("Dispatching local hits to device AnalyticsService");
        label68:
        List localList;
        try
        {
          localList = this.b.a(brz.f());
          if (!localList.isEmpty()) {
            break label131;
          }
          g();
        }
        catch (SQLiteException localSQLiteException1)
        {
          e("Failed to read hits from store", localSQLiteException1);
          v();
        }
        continue;
        label112:
        localList.remove(localSQLiteException1);
        try
        {
          this.b.b(localSQLiteException1.c);
          label131:
          if (localList.isEmpty()) {
            break label68;
          }
          bsi localbsi = (bsi)localList.get(0);
          if (this.f.a(localbsi)) {
            break label112;
          }
          g();
        }
        catch (SQLiteException localSQLiteException2)
        {
          e("Failed to remove hit that was send for delivery", localSQLiteException2);
          v();
        }
      }
    }
  }
  
  public final void f()
  {
    cox.b();
    r();
    b("Service disconnected");
  }
  
  public final void g()
  {
    long l3 = 0L;
    brb.i();
    r();
    int m;
    if ((!this.l) && ((!byk.a) || (m().a())) && (w() > 0L))
    {
      m = 1;
      if (m != 0) {
        break label65;
      }
      this.e.b();
      v();
    }
    for (;;)
    {
      return;
      m = 0;
      break;
      label65:
      if (!this.b.e()) {
        break label89;
      }
      this.e.b();
      v();
    }
    label89:
    Object localObject;
    boolean bool;
    label142:
    long l1;
    if (!((Boolean)bqd.z.a()).booleanValue())
    {
      this.e.a();
      localObject = this.e;
      if (!((bqm)localObject).c) {
        ((bqm)localObject).b.a().e("Connectivity unknown. Receiver not registered");
      }
      bool = ((bqm)localObject).d;
      if (!bool) {
        break label411;
      }
      u();
      l2 = w();
      l1 = o().d();
      if (l1 == 0L) {
        break label285;
      }
      l1 = l2 - Math.abs(k().a() - l1);
      if (l1 <= 0L) {
        break label273;
      }
      label195:
      a("Dispatch scheduled (ms)", Long.valueOf(l1));
      if (!this.h.b()) {
        break label400;
      }
      localObject = this.h;
      if (((bsb)localObject).c != 0L) {
        break label297;
      }
    }
    label273:
    label285:
    label297:
    for (long l2 = 0L;; l2 = Math.abs(((bsb)localObject).a.c.a() - ((bsb)localObject).c))
    {
      l1 = Math.max(1L, l1 + l2);
      localObject = this.h;
      if (!((bsb)localObject).b()) {
        break;
      }
      if (l1 >= 0L) {
        break label322;
      }
      ((bsb)localObject).c();
      break;
      bool = true;
      break label142;
      l1 = Math.min(brz.d(), l2);
      break label195;
      l1 = Math.min(brz.d(), l2);
      break label195;
    }
    label322:
    l1 -= Math.abs(((bsb)localObject).a.c.a() - ((bsb)localObject).c);
    if (l1 < 0L) {
      l1 = l3;
    }
    for (;;)
    {
      ((bsb)localObject).d().removeCallbacks(((bsb)localObject).b);
      if (((bsb)localObject).d().postDelayed(((bsb)localObject).b, l1)) {
        break;
      }
      ((bsb)localObject).a.a().e("Failed to adjust delayed post. time", Long.valueOf(l1));
      break;
      label400:
      this.h.a(l1);
      break;
      label411:
      v();
      u();
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
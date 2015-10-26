import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class bpt
  implements Runnable
{
  bpt(bps parambps, Map paramMap, boolean paramBoolean1, String paramString1, long paramLong, boolean paramBoolean2, boolean paramBoolean3, String paramString2) {}
  
  public final void run()
  {
    boolean bool = true;
    if (this.h.c.b()) {
      this.a.put("sc", "start");
    }
    Object localObject1 = this.a;
    Object localObject2 = this.h.d.d();
    a.h("getClientId can not be called from the main thread");
    bqs.b((Map)localObject1, "cid", ((bpd)localObject2).a.g().b());
    if (this.a.get("&sf") != null)
    {
      double d1 = bqs.a((String)this.a.get("&sf"), 100.0D);
      if (bqs.a(d1, (String)this.a.get("&cid"))) {
        this.h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
      }
    }
    label180:
    label403:
    label409:
    long l2;
    long l1;
    for (;;)
    {
      return;
      localObject1 = bps.a(this.h);
      if (this.b)
      {
        bqs.a(this.a, "ate", ((bqf)localObject1).b());
        bqs.a(this.a, "adid", ((bqf)localObject1).c());
        localObject1 = bps.b(this.h).b();
        bqs.a(this.a, "an", ((cpe)localObject1).a);
        bqs.a(this.a, "av", ((cpe)localObject1).b);
        bqs.a(this.a, "aid", ((cpe)localObject1).c);
        bqs.a(this.a, "aiid", ((cpe)localObject1).d);
        this.a.put("v", "1");
        this.a.put("_v", "ma4.5.0");
        bqs.a(this.a, "ul", bps.c(this.h).b().a);
        bqs.a(this.a, "sr", bps.d(this.h).c());
        if ((!this.c.equals("transaction")) && (!this.c.equals("item"))) {
          break label403;
        }
      }
      for (int i = 1;; i = 0)
      {
        if ((i != 0) || (this.h.b.a())) {
          break label409;
        }
        bps.e(this.h).a(this.a, "Too many hits sent too quickly, rate limiting invoked");
        break;
        this.a.remove("ate");
        this.a.remove("adid");
        break label180;
      }
      l2 = bqs.a((String)this.a.get("ht"));
      l1 = l2;
      if (l2 == 0L) {
        l1 = this.d;
      }
      if (!this.e) {
        break;
      }
      localObject1 = new bsi(this.h, this.a, l1, this.f);
      bps.f(this.h).c("Dry run enabled. Would have sent hit", localObject1);
    }
    localObject2 = (String)this.a.get("cid");
    localObject1 = new HashMap();
    bqs.a((Map)localObject1, "uid", this.a);
    bqs.a((Map)localObject1, "an", this.a);
    bqs.a((Map)localObject1, "aid", this.a);
    bqs.a((Map)localObject1, "av", this.a);
    bqs.a((Map)localObject1, "aiid", this.a);
    String str = this.g;
    if (!TextUtils.isEmpty((CharSequence)this.a.get("adid"))) {}
    for (;;)
    {
      localObject1 = new bre(0L, (String)localObject2, str, bool, 0L, (Map)localObject1);
      l2 = bps.g(this.h).a((bre)localObject1);
      this.a.put("_s", String.valueOf(l2));
      localObject1 = new bsi(this.h, this.a, l1, this.f);
      bps.h(this.h).a((bsi)localObject1);
      break;
      bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
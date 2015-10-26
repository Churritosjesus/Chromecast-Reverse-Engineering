import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bdu
  extends bdm
{
  Handler a = new Handler();
  public long b;
  public String d;
  public final int e;
  public String f;
  public boolean g;
  public azv h;
  private blp i = new blp("HttpDeviceConnector", false);
  private final aph j;
  private final ExecutorService k;
  
  public bdu(String paramString1, int paramInt1, String paramString2, int paramInt2, aph paramaph)
  {
    this(paramString1, paramInt1, paramString2, paramInt2, paramaph, Executors.newSingleThreadExecutor());
  }
  
  public bdu(String paramString1, int paramInt1, String paramString2, int paramInt2, aph paramaph, ExecutorService paramExecutorService)
  {
    super(paramInt1);
    this.d = paramString1;
    this.f = paramString2;
    this.e = paramInt2;
    this.h = SetupApplication.a().l();
    this.j = paramaph;
    this.k = paramExecutorService;
  }
  
  public final void a()
  {
    this.b = SystemClock.elapsedRealtime();
  }
  
  public final void a(int paramInt, bdn parambdn)
  {
    a("reboot", d(), new bfi(this.d, paramInt), this.e, new bey(this, parambdn));
  }
  
  public final void a(int paramInt, Locale paramLocale, boolean paramBoolean, bdn parambdn)
  {
    long l = d();
    bdq localbdq = new bdq(this.d, paramInt, this.c);
    if (paramLocale != null) {
      localbdq.b = blj.a(paramLocale);
    }
    a("getDeviceInfo", l, localbdq, this.e, new bdv(this, parambdn, localbdq, paramBoolean, l, parambdn));
  }
  
  void a(long paramLong, Context paramContext, bdn parambdn)
  {
    a("scanNetworks", paramLong, new bfm(this.d), this.e, new bdz(this, parambdn, paramLong, paramContext, parambdn));
  }
  
  public final void a(Context paramContext, String paramString, bdn parambdn)
  {
    long l = d();
    if (TextUtils.isEmpty(paramString)) {
      a(l, paramContext, parambdn);
    }
    for (;;)
    {
      return;
      paramString = new HashMap(1);
      paramString.put("country_code", SetupApplication.a().c);
      a("setCountryCode", l, new bfo(this.d, null, paramString, this.c), this.e, new beu(this, parambdn, l, paramContext, parambdn));
    }
  }
  
  public final void a(bdn parambdn)
  {
    long l = d();
    bdq localbdq = new bdq(this.d, 160, this.c);
    localbdq.h = 1;
    a("pollSetupState", l, localbdq, this.e, new beq(this, parambdn, localbdq));
  }
  
  public final void a(bdn parambdn, int paramInt)
  {
    long l = d();
    bfh localbfh = new bfh(this.d, paramInt);
    a(21 + "playSound-" + paramInt, l, localbfh, this.e, new bey(this, parambdn));
  }
  
  void a(bfp parambfp, bff parambff)
  {
    this.k.submit(new bem(this, parambfp, parambff));
  }
  
  public final void a(bfs parambfs, bdn parambdn)
  {
    a("connectToNetwork", d(), new bdd(this.d, parambfs), this.e, new bey(this, parambdn));
  }
  
  void a(String paramString, long paramLong1, bfp parambfp, int paramInt1, int paramInt2, long paramLong2, bff parambff)
  {
    if (a(paramString, paramLong1)) {}
    for (;;)
    {
      return;
      parambff = new beh(this, paramString, SystemClock.elapsedRealtime(), parambff, paramLong1, paramInt2, parambfp, paramLong2, paramInt1);
      switch (ben.a[(paramInt1 - 1)])
      {
      default: 
        paramInt2 = 1;
      }
      Object localObject1;
      for (;;)
      {
        if (paramInt2 == 0) {
          break label246;
        }
        a(parambfp, parambff);
        break;
        if ((TextUtils.isEmpty(this.f)) || (this.h.a(this.f, true))) {}
        for (int m = 1;; m = 0)
        {
          paramInt2 = m;
          if (m != 0) {
            break;
          }
          localObject1 = this.f;
          paramInt2 = m;
          break;
        }
        localObject1 = this.h;
        boolean bool;
        if (TextUtils.isEmpty(((azv)localObject1).j))
        {
          bool = false;
          label163:
          if (bool) {
            break label203;
          }
        }
        label203:
        for (m = 1;; m = 0)
        {
          paramInt2 = m;
          if (m != 0) {
            break;
          }
          paramInt2 = m;
          break;
          bool = ((azv)localObject1).a(((azv)localObject1).j, false);
          break label163;
        }
        if ((TextUtils.isEmpty(this.f)) || (this.h.a(this.f, true))) {
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        }
      }
      label246:
      if (paramInt1 != bew.d)
      {
        parambff.a(-1);
      }
      else
      {
        localObject1 = new apd(17);
        if (this.j != null) {
          ((apd)localObject1).h = this.j;
        }
        if (this.g)
        {
          localObject2 = new bfs();
          ((bfs)localObject2).a = this.f;
          ((bfs)localObject2).b = bfu.b;
          this.h.a((bfs)localObject2);
        }
        Object localObject2 = new AtomicBoolean(false);
        this.k.submit(new bej(this, (apd)localObject1, paramString, paramLong1, (AtomicBoolean)localObject2, parambfp, parambff));
      }
    }
  }
  
  public void a(String paramString, long paramLong, bfp parambfp, int paramInt, bff parambff)
  {
    a(paramString, paramLong, parambfp, paramInt, 1, 200L, parambff);
  }
  
  public final void a(HashMap paramHashMap, bdf parambdf, bdn parambdn)
  {
    if ((paramHashMap == null) || (paramHashMap.isEmpty())) {
      this.a.post(new bef(this, parambdn));
    }
    for (;;)
    {
      return;
      a("setDeviceInfo", d(), new bfo(this.d, parambdf, paramHashMap, this.c), this.e, new bey(this, parambdn));
    }
  }
  
  boolean a(String paramString, long paramLong)
  {
    if ((this.b > 0L) && (paramLong < this.b)) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool) {}
      return bool;
    }
  }
  
  public final void b(bdn parambdn)
  {
    long l = d();
    bdq localbdq = new bdq(this.d, 1, this.c);
    localbdq.h = 1;
    localbdq.i = true;
    a("refreshSetupState", l, localbdq, bew.b, new bey(this, parambdn));
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final boolean c()
  {
    return true;
  }
  
  public long d()
  {
    if (TextUtils.isEmpty(this.d)) {
      throw new IllegalStateException("No IP Address");
    }
    return SystemClock.elapsedRealtime();
  }
  
  public final void d(bdn parambdn)
  {
    long l = d();
    bfb localbfb = new bfb(this.d);
    a("getLicense", l, localbfb, this.e, new bec(this, parambdn, localbfb));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
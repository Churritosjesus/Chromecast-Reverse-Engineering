import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ayz
  extends j
{
  private final blp Z = new blp("SetupDeviceScanner");
  public azf a;
  private bae aa;
  private ayf ab;
  private ayq ac;
  private int ad = 0;
  private final alm ae = SetupApplication.a().b();
  private apd af;
  private Handler ag;
  private long ah;
  private long ai;
  private boolean aj;
  private final Runnable ak = new aza(this);
  private final Runnable al = new azb(this);
  public boolean b;
  public boolean c;
  public long d;
  
  private void q()
  {
    try
    {
      if (this.ac != null)
      {
        Object localObject = this.ac.d();
        if (((List)localObject).size() > 0)
        {
          HashSet localHashSet = new java/util/HashSet;
          localHashSet.<init>(((List)localObject).size());
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext()) {
            localHashSet.add(((aym)((Iterator)localObject).next()).b);
          }
          this.ae.a(localSet);
        }
      }
    }
    finally {}
    if ((this.ae.f()) && (this.a != null)) {
      this.a.s();
    }
  }
  
  public final void a()
  {
    super.a();
    this.aa.b = null;
    this.aa = null;
    if (this.ab != null)
    {
      this.ab.a = null;
      this.ab = null;
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    paramActivity = new bae(this.y);
    paramActivity.b = new azc(this);
    this.aa = paramActivity;
    blx.a();
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    c(true);
    this.ag = new Handler();
    this.ai = e().getInteger(a.fc);
    this.ah = e().getInteger(a.fb);
  }
  
  public final void a(boolean paramBoolean)
  {
    if ((!this.aj) || (this.aa == null)) {}
    for (;;)
    {
      return;
      this.aj = false;
      this.ag.removeCallbacks(this.ak);
      this.ag.removeCallbacks(this.al);
      if (paramBoolean) {
        this.c = true;
      }
      this.ac.c();
      this.ac.e();
      bae localbae = this.aa;
      try
      {
        localbae.a.unregisterReceiver(localbae.d);
        blx.a();
        q();
        if (SetupApplication.a().h)
        {
          if (paramBoolean) {
            break label186;
          }
          if (!this.ae.a()) {
            break label174;
          }
          this.af.a(2);
        }
        for (;;)
        {
          this.af.a(this.ae.b());
          ape.a().a(this.af);
          if (!paramBoolean) {
            break;
          }
          if (this.a != null) {
            this.a.p();
          }
          p();
          break;
          label174:
          this.af.a(3);
          continue;
          label186:
          this.af.a(1);
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
    }
  }
  
  public final void j()
  {
    super.j();
    p();
  }
  
  public final void k()
  {
    super.k();
    a(false);
  }
  
  public void p()
  {
    if ((!this.b) || (this.aj) || (this.aa == null)) {}
    for (;;)
    {
      return;
      this.af = new apd(6, Integer.valueOf(1));
      this.aj = true;
      this.d = SystemClock.elapsedRealtime();
      Object localObject = this.aa;
      IntentFilter localIntentFilter = new IntentFilter("android.net.wifi.SCAN_RESULTS");
      ((bae)localObject).a.registerReceiver(((bae)localObject).d, localIntentFilter);
      if (!((bae)localObject).c.startScan())
      {
        Log.w("WifiScanner", "Could not start scan");
        ((bae)localObject).a.unregisterReceiver(((bae)localObject).d);
      }
      if (this.ab != null) {
        this.ab.a();
      }
      if (this.ac == null)
      {
        this.ad = 0;
        localObject = new ayq(this.y);
        ((ayq)localObject).a(new ayy(new azd(this)));
        this.ac = ((ayq)localObject);
      }
      if (this.ad != 1) {
        this.ac.b();
      }
      this.ag.postDelayed(this.al, this.ai);
      this.ag.postDelayed(this.ak, this.ah);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ayz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
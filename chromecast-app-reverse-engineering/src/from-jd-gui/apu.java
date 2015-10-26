import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

public final class apu
  extends j
{
  private boolean Z;
  private blp a;
  private aqd aa;
  private Handler ab;
  private apd ac;
  private boolean ad;
  private String ae;
  private aqc b;
  private Context c;
  private String d;
  
  public static apu a(String paramString, boolean paramBoolean)
  {
    apu localapu = new apu();
    Bundle localBundle = new Bundle();
    localBundle.putString("ipAddress", paramString);
    localBundle.putBoolean("optInDeviceId", paramBoolean);
    localapu.f(localBundle);
    return localapu;
  }
  
  private void a(String paramString)
  {
    if (this.b != null) {
      this.b.b(paramString);
    }
  }
  
  private void p()
  {
    this.ac = new apd(63);
    this.ad = true;
    r();
    aqd localaqd = this.aa;
    localaqd.e = new apy(this);
    localaqd.i = false;
    localaqd.j = false;
    localaqd.f = tz.a(localaqd.b);
    Object localObject = localaqd.f;
    Iterator localIterator = tz.b().iterator();
    while (localIterator.hasNext())
    {
      localObject = (ug)localIterator.next();
      if (((ug)localObject).b().getClassName().equals("com.google.android.gms.cast.media.CastMediaRouteProviderService"))
      {
        if (localObject == null) {
          break label180;
        }
        tz.f();
        localObject = ((ug)localObject).b.iterator();
        do
        {
          if (!((Iterator)localObject).hasNext()) {
            break;
          }
        } while (!localaqd.a((uh)((Iterator)localObject).next(), localaqd.d, true));
      }
    }
    for (;;)
    {
      this.ab.postDelayed(new apz(this), 20000L);
      return;
      localObject = null;
      break;
      label180:
      localObject = new ty().a(a.c(localaqd.c)).a();
      localaqd.g = new aqe(localaqd, true);
      localaqd.f.a((tx)localObject, localaqd.g, 1);
    }
  }
  
  private void q()
  {
    this.ad = false;
    this.aa.a(false);
    this.ac.a(0);
    ape.a().a(this.ac);
    if (this.b != null)
    {
      this.ae = this.c.getString(b.cg);
      this.b.b(this.ae);
    }
  }
  
  private void r()
  {
    this.b.a(this.c.getString(b.cT), new aqb(this));
  }
  
  public final void a()
  {
    super.a();
    this.b = null;
    this.c = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.b = ((aqc)paramActivity);
    this.c = paramActivity;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = this.m.getString("ipAddress");
    this.Z = this.m.getBoolean("optInDeviceId");
    c(true);
    this.ab = new Handler();
    this.a = new blp("OffersChecker");
    this.aa = new aqd(this.c, blf.d(this.c), this.d, this.a);
    if (this.Z) {
      p();
    }
    for (;;)
    {
      return;
      new AlertDialog.Builder(this.c).setMessage(b.da).setPositiveButton(b.cZ, new apx(this)).setNegativeButton(b.cY, new apw(this)).setCancelable(true).setOnCancelListener(new apv(this)).show();
    }
  }
  
  public final void h_()
  {
    super.h_();
    if (this.aa != null) {
      this.aa.a(false);
    }
  }
  
  public final void j()
  {
    super.j();
    if (this.ad) {
      r();
    }
    for (;;)
    {
      return;
      if (this.ae != null) {
        a(this.ae);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\apu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
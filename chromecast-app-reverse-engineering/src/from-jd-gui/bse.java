import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public final class bse
  extends bra
{
  boolean a;
  boolean b;
  private AlarmManager c = (AlarmManager)l().getSystemService("alarm");
  
  protected bse(brb parambrb)
  {
    super(parambrb);
  }
  
  private PendingIntent d()
  {
    Intent localIntent = new Intent(l(), bpe.class);
    localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
    return PendingIntent.getBroadcast(l(), 0, localIntent, 0);
  }
  
  protected final void a()
  {
    try
    {
      this.c.cancel(d());
      if (brz.e() > 0L)
      {
        PackageManager localPackageManager = l().getPackageManager();
        Object localObject = new android/content/ComponentName;
        ((ComponentName)localObject).<init>(l(), bpe.class);
        localObject = localPackageManager.getReceiverInfo((ComponentName)localObject, 2);
        if ((localObject != null) && (((ActivityInfo)localObject).enabled))
        {
          b("Receiver registered. Using alarm for local dispatch.");
          this.a = true;
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
  }
  
  public final void b()
  {
    r();
    a.a(this.a, "Receiver not registered");
    long l2 = brz.e();
    if (l2 > 0L)
    {
      c();
      long l1 = k().b();
      this.b = true;
      this.c.setInexactRepeating(2, l1 + l2, 0L, d());
    }
  }
  
  public final void c()
  {
    r();
    this.b = false;
    this.c.cancel(d());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
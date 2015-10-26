import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class cyc
  implements Runnable
{
  private final String a;
  private final String b;
  private final long c;
  private final long d;
  private final long e;
  private long f;
  
  cyc(cyb paramcyb, String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = System.currentTimeMillis();
  }
  
  public final void run()
  {
    if ((this.d > 0L) && (this.f >= this.d))
    {
      if (!"0".equals(this.b)) {
        cyb.a(this.g).remove(this.b);
      }
      return;
    }
    this.f += 1L;
    boolean bool;
    if (cyb.d(this.g)) {
      bool = cyb.e(this.g);
    }
    for (;;)
    {
      if (bool)
      {
        long l = System.currentTimeMillis();
        cyb.b(this.g).a(ctw.a(new Object[] { "event", this.a, "gtm.timerInterval", String.valueOf(this.c), "gtm.timerLimit", String.valueOf(this.d), "gtm.timerStartTime", String.valueOf(this.e), "gtm.timerCurrentTime", String.valueOf(l), "gtm.timerElapsedTime", String.valueOf(l - this.e), "gtm.timerEventNumber", String.valueOf(this.f), "gtm.triggers", this.b }));
      }
      cyb.c(this.g).postDelayed(this, this.c);
      break;
      Object localObject = (ActivityManager)cyb.f(this.g).getSystemService("activity");
      KeyguardManager localKeyguardManager = (KeyguardManager)cyb.f(this.g).getSystemService("keyguard");
      PowerManager localPowerManager = (PowerManager)cyb.f(this.g).getSystemService("power");
      Iterator localIterator = ((ActivityManager)localObject).getRunningAppProcesses().iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          if ((Process.myPid() == ((ActivityManager.RunningAppProcessInfo)localObject).pid) && (((ActivityManager.RunningAppProcessInfo)localObject).importance == 100) && (!localKeyguardManager.inKeyguardRestrictedInputMode()) && (localPowerManager.isScreenOn()))
          {
            bool = true;
            break;
          }
        }
      }
      bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cyc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
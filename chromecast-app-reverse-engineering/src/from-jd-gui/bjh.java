import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public final class bjh
  extends j
  implements bdn
{
  private apd Z;
  private long a;
  private bjk aa;
  private int ab;
  private boolean ac;
  private int ad = 0;
  private boolean ae = false;
  private Handler af;
  private final Runnable ag = new bji(this);
  private int b;
  private int c;
  private final blp d = new blp("PollOtaFragment");
  
  public static bjh a(long paramLong, int paramInt1, int paramInt2)
  {
    bjh localbjh = new bjh();
    Bundle localBundle = new Bundle();
    localBundle.putLong("pollDelay", paramLong);
    localBundle.putInt("percentDoneThreshold", paramInt1);
    localBundle.putInt("numErrorsAllowed", paramInt2);
    localbjh.f(localBundle);
    return localbjh;
  }
  
  private void a(boolean paramBoolean)
  {
    ape.a().a(this.Z);
    if (paramBoolean) {
      this.aa.j();
    }
    for (;;)
    {
      return;
      this.aa.i();
    }
  }
  
  private void b(int paramInt)
  {
    this.ab = paramInt;
    this.aa.b(paramInt);
  }
  
  private boolean p()
  {
    if (this.ad < this.c) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void a()
  {
    super.a();
    this.aa = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.aa = ((bjk)paramActivity);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.Z = new apd(32);
    Bundle localBundle = this.m;
    this.a = localBundle.getLong("pollDelay");
    this.b = localBundle.getInt("percentDoneThreshold");
    this.c = localBundle.getInt("numErrorsAllowed");
    if (paramBundle != null)
    {
      this.ac = paramBundle.getBoolean("otaReadyToApply");
      b(paramBundle.getInt("otaPercent"));
      this.ad = paramBundle.getInt("errorCount");
    }
  }
  
  public final void b_(int paramInt)
  {
    if ((this.af == null) || (paramInt == -99)) {}
    for (;;)
    {
      return;
      if ((this.ac) || (this.ab >= this.b))
      {
        a(false);
      }
      else if ((this.ae) && (this.ab > 0) && ((paramInt == -1) || (paramInt == -2)))
      {
        a(false);
      }
      else if (this.ad < this.c)
      {
        this.ad += 1;
        paramInt = this.ad;
        this.af.postDelayed(this.ag, this.a);
      }
      else
      {
        this.aa.k();
      }
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("otaPercent", this.ab);
    paramBundle.putBoolean("otaReadyToApply", this.ac);
    paramBundle.putInt("errorCount", this.ad);
  }
  
  public final void g_()
  {
    super.g_();
    this.af = new Handler();
    if (p())
    {
      this.ae = true;
      this.ag.run();
    }
  }
  
  public final void h_()
  {
    super.h_();
    this.af.removeCallbacks(this.ag);
    this.af = null;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bjh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
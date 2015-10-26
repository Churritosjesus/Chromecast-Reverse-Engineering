import android.os.Handler;
import android.os.SystemClock;

public final class asb
{
  public blp a;
  public atz b;
  public asg c;
  atf d;
  boolean e;
  Long f;
  Handler g;
  final Runnable h = new asc(this);
  boolean i = false;
  final Runnable j = new asd(this);
  private final long k;
  private final long l;
  
  public asb(atz paramatz, atf paramatf, long paramLong1, long paramLong2)
  {
    this.b = paramatz;
    this.d = paramatf;
    this.g = new Handler();
    this.a = new blp("BackdropSettingsManager", false);
    this.k = paramLong1;
    this.l = paramLong2;
  }
  
  private static long a(long paramLong)
  {
    return (int)(paramLong * (Math.random() / 2.0D + 0.75D));
  }
  
  private void c()
  {
    if (this.i)
    {
      this.g.removeCallbacks(this.h);
      long l1 = a(this.l);
      this.g.postDelayed(this.h, l1);
    }
  }
  
  public final void a()
  {
    this.f = Long.valueOf(this.b.a());
    if (this.e) {}
    for (;;)
    {
      return;
      long l1 = a(this.k);
      this.g.removeCallbacks(this.h);
      this.i = false;
      this.g.removeCallbacks(this.j);
      this.g.postDelayed(this.j, l1);
    }
  }
  
  void b()
  {
    int m;
    if (!this.e)
    {
      Object localObject = this.b;
      if ((((aun)localObject).g != 0L) && (((aun)localObject).g + aun.f > SystemClock.elapsedRealtime()))
      {
        m = 0;
        if (m == 0) {
          break label74;
        }
        this.e = true;
        localObject = new asf(this);
        this.b.c(this.d, (auo)localObject);
      }
    }
    for (;;)
    {
      return;
      m = 1;
      break;
      label74:
      c();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\asb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
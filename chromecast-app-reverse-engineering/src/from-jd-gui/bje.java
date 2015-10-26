import android.os.Handler;

public final class bje
{
  public final Handler a;
  public final Runnable b;
  final bdm c;
  final bdn d;
  public boolean e;
  private final blp f = new blp("SoundPlayerRefresher");
  
  public bje(bdm parambdm)
  {
    this.c = parambdm;
    this.a = new Handler();
    this.d = new bjf(this);
    this.b = new bjg(this);
  }
  
  public final void a()
  {
    this.e = false;
    this.a.removeCallbacks(this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
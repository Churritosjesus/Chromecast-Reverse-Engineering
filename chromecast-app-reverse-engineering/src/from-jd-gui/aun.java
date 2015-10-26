import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public abstract class aun
{
  public static final long f = TimeUnit.SECONDS.toMillis(10L);
  private long a;
  public long g;
  public final blp h = new blp("BackdropStorage");
  
  public final long a()
  {
    this.g = SystemClock.elapsedRealtime();
    this.a = this.g;
    return this.a;
  }
  
  public final void a(long paramLong)
  {
    if (paramLong >= this.a) {
      this.a = 0L;
    }
  }
  
  public void a(Bundle paramBundle) {}
  
  public abstract void a(atf paramatf, auo paramauo);
  
  public void b(Bundle paramBundle) {}
  
  public void b(atf paramatf, auo paramauo) {}
  
  public final boolean b()
  {
    if (this.a > 0L) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void c(atf paramatf, auo paramauo)
  {
    if (b()) {
      b(paramatf, paramauo);
    }
    for (;;)
    {
      return;
      a(paramatf, paramauo);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.os.SystemClock;

public final class bkl
{
  private static final bkl a = new bkl();
  
  public static bkl a()
  {
    return a;
  }
  
  public static long b()
  {
    return SystemClock.elapsedRealtime();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bkl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
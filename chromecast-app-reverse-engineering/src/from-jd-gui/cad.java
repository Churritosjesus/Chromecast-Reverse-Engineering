import android.os.SystemClock;

public final class cad
  implements cac
{
  private static cad a;
  
  public static cac c()
  {
    try
    {
      if (a == null)
      {
        localcad = new cad;
        localcad.<init>();
        a = localcad;
      }
      cad localcad = a;
      return localcad;
    }
    finally {}
  }
  
  public final long a()
  {
    return System.currentTimeMillis();
  }
  
  public final long b()
  {
    return SystemClock.elapsedRealtime();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
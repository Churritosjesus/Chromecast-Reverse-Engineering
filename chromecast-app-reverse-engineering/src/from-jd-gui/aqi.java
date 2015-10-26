import android.os.Bundle;

public final class aqi
{
  private static aqi b = null;
  boolean a;
  
  public static aqi a()
  {
    if (b == null)
    {
      b = new aqi();
      new Bundle();
    }
    return b;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
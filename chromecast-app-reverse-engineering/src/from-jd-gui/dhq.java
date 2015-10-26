import java.io.IOException;
import java.lang.reflect.Method;

public final class dhq
  extends Exception
{
  static final Method a;
  public IOException b;
  
  static
  {
    try
    {
      Method localMethod = Throwable.class.getDeclaredMethod("addSuppressed", new Class[] { Throwable.class });
      a = localMethod;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = null;
      }
    }
  }
  
  public dhq(IOException paramIOException)
  {
    super(paramIOException);
    this.b = paramIOException;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public final class bfm
  extends bfp
{
  public bfm(String paramString)
  {
    super(paramString);
  }
  
  public final int a()
  {
    i = -1;
    try
    {
      int j = a("scan_wifi", null, c).b();
      if (j == 200) {
        i = 0;
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        i = -2;
      }
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    return i;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
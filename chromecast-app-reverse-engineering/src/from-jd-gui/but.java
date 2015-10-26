import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public final class but
{
  public static final bwe a = new bwe();
  
  static
  {
    a.e("com.google.cast.receiver");
    a.e("com.google.cast.tp.connection");
    try
    {
      Charset.forName("UTF-8");
      return;
    }
    catch (UnsupportedCharsetException localUnsupportedCharsetException)
    {
      for (;;) {}
    }
    catch (IllegalCharsetNameException localIllegalCharsetNameException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\but.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
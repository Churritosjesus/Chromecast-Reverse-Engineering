import java.io.IOException;

public final class dho
  extends Exception
{
  public dho(IOException paramIOException)
  {
    super(paramIOException);
  }
  
  public final IOException a()
  {
    return (IOException)super.getCause();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
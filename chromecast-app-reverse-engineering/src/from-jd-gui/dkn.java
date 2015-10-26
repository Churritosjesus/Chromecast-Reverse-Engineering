import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

final class dkn
  extends dju
{
  dkn(Socket paramSocket) {}
  
  protected final void a()
  {
    try
    {
      this.a.close();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        dkk.a().log(Level.WARNING, "Failed to close timed out socket " + this.a, localException);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
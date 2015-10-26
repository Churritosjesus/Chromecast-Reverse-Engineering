import java.io.IOException;

final class apn
  implements Runnable
{
  apn(apk paramapk, String paramString, btd parambtd) {}
  
  public final void run()
  {
    try
    {
      bsr.b.a(this.c.a, this.a, this.b);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        apk.d().a("Exception while creating channel: %s", new Object[] { localIOException.toString() });
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\apn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
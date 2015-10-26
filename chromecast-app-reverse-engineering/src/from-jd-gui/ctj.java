import android.os.RemoteException;
import android.util.Log;

final class ctj
  implements Runnable
{
  ctj(cth paramcth, String paramString1, String paramString2, ctd paramctd) {}
  
  public final void run()
  {
    try
    {
      boolean bool = cth.a(this.d).d();
      this.c.a(bool);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", localRemoteException);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ctj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
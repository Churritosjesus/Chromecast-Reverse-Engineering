import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class cti
  implements Runnable
{
  cti(cth paramcth, List paramList, String paramString, ctd paramctd) {}
  
  public final void run()
  {
    try
    {
      Object localObject2 = cth.a(this.d);
      Object localObject1 = new java/util/HashSet;
      ((HashSet)localObject1).<init>(this.a);
      Collections.unmodifiableSet((Set)localObject1);
      localObject2 = ((s)localObject2).c();
      localObject1 = new com/google/android/gms/signin/internal/CheckServerAuthResult;
      ((CheckServerAuthResult)localObject1).<init>(((dh)localObject2).d(), ((dh)localObject2).e());
      this.c.a((CheckServerAuthResult)localObject1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", localRemoteException);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.RemoteException;

public final class cjr
  extends byo
  implements IBinder.DeathRecipient
{
  bve a;
  final cjz b = new cjs(this);
  
  public cjr(Context paramContext, Looper paramLooper, bwg parambwg, bwh parambwh)
  {
    super(paramContext, paramLooper, 27, parambwg, parambwh);
  }
  
  public final void a()
  {
    try
    {
      ((cjw)o()).b();
      super.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        localRemoteException = localRemoteException;
        super.a();
      }
    }
    finally
    {
      localObject = finally;
      super.a();
      throw ((Throwable)localObject);
    }
  }
  
  public final void binderDied() {}
  
  protected final String c()
  {
    return "com.google.android.gms.cast_mirroring.service.START";
  }
  
  protected final String d()
  {
    return "com.google.android.gms.cast_mirroring.internal.ICastMirroringService";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cjr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
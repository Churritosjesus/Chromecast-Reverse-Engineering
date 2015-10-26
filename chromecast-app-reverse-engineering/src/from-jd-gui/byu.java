import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class byu
  extends byp
{
  private IBinder a;
  
  public byu(byo parambyo, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(parambyo, paramInt, paramBundle);
    this.a = paramIBinder;
  }
  
  protected final void a(ConnectionResult paramConnectionResult)
  {
    byo.c(this.b).a(paramConnectionResult);
  }
  
  protected final boolean a()
  {
    bool2 = false;
    try
    {
      String str = this.a.getInterfaceDescriptor();
      if (this.b.d().equals(str)) {
        break label84;
      }
      Log.e("GmsClient", "service descriptor mismatch: " + this.b.d() + " vs. " + str);
      bool1 = bool2;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.w("GmsClient", "service probably died");
        boolean bool1 = bool2;
        continue;
        ??? = this.b.a(this.a);
        bool1 = bool2;
        if (??? == null) {
          continue;
        }
        bool1 = bool2;
        if (!byo.a(this.b, 2, 3, (IInterface)???)) {
          continue;
        }
        byx localbyx = byo.c(this.b);
        synchronized (localbyx.g)
        {
          localbyx.a(localbyx.a.b());
          bvt.c(byo.f(this.b));
          bool1 = true;
        }
      }
    }
    return bool1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
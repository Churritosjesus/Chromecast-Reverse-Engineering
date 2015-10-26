import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;

public abstract class ctb
  extends Binder
  implements cta
{
  public ctb()
  {
    attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
  }
  
  public static cta a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof cta))) {
        paramIBinder = (cta)localIInterface;
      } else {
        paramIBinder = new ctc(paramIBinder);
      }
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject = null;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      paramParcel2.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        localObject = ConnectionResult.CREATOR;
        localObject = bvo.a(paramParcel1);
        label90:
        if (paramParcel1.readInt() == 0) {
          break label133;
        }
      }
      label133:
      for (paramParcel1 = (AuthAccountResult)AuthAccountResult.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a((ConnectionResult)localObject, paramParcel1);
        paramParcel2.writeNoException();
        bool = true;
        break;
        localObject = null;
        break label90;
      }
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        localObject = Status.CREATOR;
        localObject = bwo.a(paramParcel1);
      }
      a((Status)localObject);
      paramParcel2.writeNoException();
      bool = true;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ctb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
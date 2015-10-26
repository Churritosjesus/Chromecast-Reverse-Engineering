import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;

public abstract class cte
  extends Binder
  implements ctd
{
  public static ctd a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
      if ((localIInterface != null) && ((localIInterface instanceof ctd))) {
        paramIBinder = (ctd)localIInterface;
      } else {
        paramIBinder = new ctf(paramIBinder);
      }
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool3 = false;
    boolean bool1 = false;
    IInterface localIInterface = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      paramParcel2.writeString("com.google.android.gms.signin.internal.ISignInService");
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      if (paramParcel1.readInt() != 0) {}
      for (Object localObject = (AuthAccountRequest)AuthAccountRequest.CREATOR.createFromParcel(paramParcel1);; localObject = null)
      {
        a((AuthAccountRequest)localObject, ctb.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        bool1 = bool2;
        break;
      }
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (CheckServerAuthResult)CheckServerAuthResult.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a(paramParcel1);
        paramParcel2.writeNoException();
        bool1 = bool2;
        break;
      }
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      a(bool1);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      if (paramParcel1.readInt() != 0)
      {
        localObject = (ResolveAccountRequest)ResolveAccountRequest.CREATOR.createFromParcel(paramParcel1);
        label279:
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 != null) {
          break label315;
        }
        paramParcel1 = localIInterface;
      }
      for (;;)
      {
        a((ResolveAccountRequest)localObject, paramParcel1);
        paramParcel2.writeNoException();
        bool1 = bool2;
        break;
        localObject = null;
        break label279;
        label315:
        localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        if ((localIInterface != null) && ((localIInterface instanceof bzo))) {
          paramParcel1 = (bzo)localIInterface;
        } else {
          paramParcel1 = new bzq(paramParcel1);
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (localObject = (Account)Account.CREATOR.createFromParcel(paramParcel1);; localObject = null)
      {
        a(paramInt1, (Account)localObject, ctb.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        bool1 = bool2;
        break;
      }
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      localObject = bzg.a(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      bool1 = bool3;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      a((bzf)localObject, paramInt1, bool1);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
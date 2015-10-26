import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract class cln
  extends Binder
  implements clm
{
  public static clm a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
      if ((localIInterface != null) && ((localIInterface instanceof clm))) {
        paramIBinder = (clm)localIInterface;
      } else {
        paramIBinder = new clo(paramIBinder);
      }
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject = null;
    boolean bool;
    String str;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = true)
      {
        return bool;
        paramParcel2.writeString("com.google.android.auth.IAuthManagerService");
      }
    case 1: 
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      localObject = paramParcel1.readString();
      str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        paramParcel1 = a((String)localObject, str, paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label160;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        bool = true;
        break;
        paramParcel1 = null;
        break label120;
        paramParcel2.writeInt(0);
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      localObject = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        paramParcel1 = a((String)localObject, paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label238;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        bool = true;
        break;
        paramParcel1 = null;
        break label200;
        paramParcel2.writeInt(0);
      }
    case 3: 
      label120:
      label160:
      label200:
      label238:
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      if (paramParcel1.readInt() != 0)
      {
        localObject = AccountChangeEventsRequest.CREATOR;
        localObject = bsk.a(paramParcel1);
      }
      paramParcel1 = a((AccountChangeEventsRequest)localObject);
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        bool = true;
        break;
        paramParcel2.writeInt(0);
      }
    }
    paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
    if (paramParcel1.readInt() != 0)
    {
      localObject = (Account)Account.CREATOR.createFromParcel(paramParcel1);
      label337:
      str = paramParcel1.readString();
      if (paramParcel1.readInt() == 0) {
        break label404;
      }
      paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      label363:
      paramParcel1 = a((Account)localObject, str, paramParcel1);
      paramParcel2.writeNoException();
      if (paramParcel1 == null) {
        break label409;
      }
      paramParcel2.writeInt(1);
      paramParcel1.writeToParcel(paramParcel2, 1);
    }
    for (;;)
    {
      bool = true;
      break;
      localObject = null;
      break label337;
      label404:
      paramParcel1 = null;
      break label363;
      label409:
      paramParcel2.writeInt(0);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
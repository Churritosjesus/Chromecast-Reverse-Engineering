import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

final class clo
  implements clm
{
  private IBinder a;
  
  clo(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final Bundle a(Account paramAccount, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        if (paramAccount != null)
        {
          localParcel1.writeInt(1);
          paramAccount.writeToParcel(localParcel1, 0);
          localParcel1.writeString(paramString);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
            this.a.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
            if (localParcel2.readInt() == 0) {
              break label143;
            }
            paramAccount = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
            return paramAccount;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      continue;
      label143:
      paramAccount = null;
    }
  }
  
  public final Bundle a(String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        localParcel1.writeString(paramString);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          this.a.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            paramString = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
            return paramString;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramString = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final Bundle a(String paramString1, String paramString2, Bundle paramBundle)
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel2.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        localParcel2.writeString(paramString1);
        localParcel2.writeString(paramString2);
        if (paramBundle != null)
        {
          localParcel2.writeInt(1);
          paramBundle.writeToParcel(localParcel2, 0);
          this.a.transact(1, localParcel2, localParcel1, 0);
          localParcel1.readException();
          if (localParcel1.readInt() != 0)
          {
            paramString1 = (Bundle)Bundle.CREATOR.createFromParcel(localParcel1);
            return paramString1;
          }
        }
        else
        {
          localParcel2.writeInt(0);
          continue;
        }
        paramString1 = null;
      }
      finally
      {
        localParcel1.recycle();
        localParcel2.recycle();
      }
    }
  }
  
  public final AccountChangeEventsResponse a(AccountChangeEventsRequest paramAccountChangeEventsRequest)
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel2.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        if (paramAccountChangeEventsRequest != null)
        {
          localParcel2.writeInt(1);
          paramAccountChangeEventsRequest.writeToParcel(localParcel2, 0);
          this.a.transact(3, localParcel2, localParcel1, 0);
          localParcel1.readException();
          if (localParcel1.readInt() != 0)
          {
            paramAccountChangeEventsRequest = AccountChangeEventsResponse.CREATOR;
            paramAccountChangeEventsRequest = bsl.a(localParcel1);
            return paramAccountChangeEventsRequest;
          }
        }
        else
        {
          localParcel2.writeInt(0);
          continue;
        }
        paramAccountChangeEventsRequest = null;
      }
      finally
      {
        localParcel1.recycle();
        localParcel2.recycle();
      }
    }
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\clo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
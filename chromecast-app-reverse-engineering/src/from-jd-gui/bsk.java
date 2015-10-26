import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;

public final class bsk
  implements Parcelable.Creator
{
  public static AccountChangeEventsRequest a(Parcel paramParcel)
  {
    Account localAccount = null;
    int k = a.a(paramParcel);
    int j = 0;
    int i = 0;
    String str = null;
    while (paramParcel.dataPosition() < k)
    {
      int m = paramParcel.readInt();
      switch (0xFFFF & m)
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        i = a.d(paramParcel, m);
        break;
      case 2: 
        j = a.d(paramParcel, m);
        break;
      case 3: 
        str = a.h(paramParcel, m);
        break;
      case 4: 
        localAccount = (Account)a.a(paramParcel, m, Account.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new l("Overread allowed size end=" + k, paramParcel);
    }
    return new AccountChangeEventsRequest(i, j, str, localAccount);
  }
  
  public static void a(AccountChangeEventsRequest paramAccountChangeEventsRequest, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramAccountChangeEventsRequest.a);
    a.c(paramParcel, 2, paramAccountChangeEventsRequest.b);
    a.a(paramParcel, 3, paramAccountChangeEventsRequest.c, false);
    a.a(paramParcel, 4, paramAccountChangeEventsRequest.d, paramInt, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bsk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
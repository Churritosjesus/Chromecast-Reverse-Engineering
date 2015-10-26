import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identity.accounts.api.AccountData;

public final class cim
  implements Parcelable.Creator
{
  public static void a(AccountData paramAccountData, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, paramAccountData.b, false);
    a.c(paramParcel, 1000, paramAccountData.a);
    a.a(paramParcel, 2, paramAccountData.c, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
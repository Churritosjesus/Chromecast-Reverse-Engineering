import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.identity.internal.AccountToken;

public final class cri
  implements Parcelable.Creator
{
  public static AccountToken a(Parcel paramParcel)
  {
    String str2 = null;
    int j = a.a(paramParcel);
    int i = 0;
    String str1 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str1 = a.h(paramParcel, k);
        break;
      case 1000: 
        i = a.d(paramParcel, k);
        break;
      case 2: 
        str2 = a.h(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new l("Overread allowed size end=" + j, paramParcel);
    }
    return new AccountToken(i, str1, str2);
  }
  
  public static void a(AccountToken paramAccountToken, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, paramAccountToken.b, false);
    a.c(paramParcel, 1000, paramAccountToken.a);
    a.a(paramParcel, 2, paramAccountToken.c, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
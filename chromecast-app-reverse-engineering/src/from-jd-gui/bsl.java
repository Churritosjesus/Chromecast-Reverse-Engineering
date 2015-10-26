import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import java.util.ArrayList;

public final class bsl
  implements Parcelable.Creator
{
  public static AccountChangeEventsResponse a(Parcel paramParcel)
  {
    int j = a.a(paramParcel);
    int i = 0;
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        i = a.d(paramParcel, k);
        break;
      case 2: 
        localArrayList = a.c(paramParcel, k, AccountChangeEvent.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new l("Overread allowed size end=" + j, paramParcel);
    }
    return new AccountChangeEventsResponse(i, localArrayList);
  }
  
  public static void a(AccountChangeEventsResponse paramAccountChangeEventsResponse, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramAccountChangeEventsResponse.a);
    a.a(paramParcel, 2, paramAccountChangeEventsResponse.b, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bsl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
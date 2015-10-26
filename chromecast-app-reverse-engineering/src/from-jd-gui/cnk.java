import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

public final class cnk
  implements Parcelable.Creator
{
  public static LocationSettingsResult a(Parcel paramParcel)
  {
    int j = a.a(paramParcel);
    Status localStatus = null;
    int i = 0;
    LocationSettingsStates localLocationSettingsStates = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localStatus = (Status)a.a(paramParcel, k, Status.CREATOR);
        break;
      case 1000: 
        i = a.d(paramParcel, k);
        break;
      case 2: 
        localLocationSettingsStates = (LocationSettingsStates)a.a(paramParcel, k, LocationSettingsStates.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new l("Overread allowed size end=" + j, paramParcel);
    }
    return new LocationSettingsResult(i, localStatus, localLocationSettingsStates);
  }
  
  public static void a(LocationSettingsResult paramLocationSettingsResult, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, paramLocationSettingsResult.b, paramInt, false);
    a.c(paramParcel, 1000, paramLocationSettingsResult.a);
    a.a(paramParcel, 2, paramLocationSettingsResult.c, paramInt, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cnk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
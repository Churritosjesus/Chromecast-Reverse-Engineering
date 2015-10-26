import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationResult;
import java.util.List;

public final class cnh
  implements Parcelable.Creator
{
  public static LocationResult a(Parcel paramParcel)
  {
    int j = a.a(paramParcel);
    int i = 0;
    Object localObject = LocationResult.a;
    while (paramParcel.dataPosition() < j)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localObject = a.c(paramParcel, k, Location.CREATOR);
        break;
      case 1000: 
        i = a.d(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new l("Overread allowed size end=" + j, paramParcel);
    }
    return new LocationResult(i, (List)localObject);
  }
  
  public static void a(LocationResult paramLocationResult, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, paramLocationResult.c, false);
    a.c(paramParcel, 1000, paramLocationResult.b);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cnh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
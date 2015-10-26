import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.ClientIdentity;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

public final class coe
  implements Parcelable.Creator
{
  public static LocationRequestInternal a(Parcel paramParcel)
  {
    String str = null;
    boolean bool1 = true;
    boolean bool3 = false;
    int j = a.a(paramParcel);
    Object localObject = LocationRequestInternal.a;
    boolean bool2 = true;
    LocationRequest localLocationRequest = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localLocationRequest = (LocationRequest)a.a(paramParcel, k, LocationRequest.CREATOR);
        break;
      case 1000: 
        i = a.d(paramParcel, k);
        break;
      case 2: 
        bool3 = a.c(paramParcel, k);
        break;
      case 3: 
        bool2 = a.c(paramParcel, k);
        break;
      case 4: 
        bool1 = a.c(paramParcel, k);
        break;
      case 5: 
        localObject = a.c(paramParcel, k, ClientIdentity.CREATOR);
        break;
      case 6: 
        str = a.h(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new l("Overread allowed size end=" + j, paramParcel);
    }
    return new LocationRequestInternal(i, localLocationRequest, bool3, bool2, bool1, (List)localObject, str);
  }
  
  public static void a(LocationRequestInternal paramLocationRequestInternal, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, paramLocationRequestInternal.c, paramInt, false);
    a.c(paramParcel, 1000, paramLocationRequestInternal.b);
    a.a(paramParcel, 2, paramLocationRequestInternal.d);
    a.a(paramParcel, 3, paramLocationRequestInternal.e);
    a.a(paramParcel, 4, paramLocationRequestInternal.f);
    a.a(paramParcel, 5, paramLocationRequestInternal.g, false);
    a.a(paramParcel, 6, paramLocationRequestInternal.h, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\coe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
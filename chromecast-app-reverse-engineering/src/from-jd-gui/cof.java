import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

public final class cof
  implements Parcelable.Creator
{
  public static LocationRequestUpdateData a(Parcel paramParcel)
  {
    IBinder localIBinder1 = null;
    int k = a.a(paramParcel);
    int j = 0;
    int i = 1;
    PendingIntent localPendingIntent = null;
    IBinder localIBinder2 = null;
    LocationRequestInternal localLocationRequestInternal = null;
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
      case 1000: 
        j = a.d(paramParcel, m);
        break;
      case 2: 
        localLocationRequestInternal = (LocationRequestInternal)a.a(paramParcel, m, LocationRequestInternal.CREATOR);
        break;
      case 3: 
        localIBinder2 = a.i(paramParcel, m);
        break;
      case 4: 
        localPendingIntent = (PendingIntent)a.a(paramParcel, m, PendingIntent.CREATOR);
        break;
      case 5: 
        localIBinder1 = a.i(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new l("Overread allowed size end=" + k, paramParcel);
    }
    return new LocationRequestUpdateData(j, i, localLocationRequestInternal, localIBinder2, localPendingIntent, localIBinder1);
  }
  
  public static void a(LocationRequestUpdateData paramLocationRequestUpdateData, Parcel paramParcel, int paramInt)
  {
    Object localObject = null;
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramLocationRequestUpdateData.b);
    a.c(paramParcel, 1000, paramLocationRequestUpdateData.a);
    a.a(paramParcel, 2, paramLocationRequestUpdateData.c, paramInt, false);
    IBinder localIBinder;
    if (paramLocationRequestUpdateData.d == null)
    {
      localIBinder = null;
      a.a(paramParcel, 3, localIBinder, false);
      a.a(paramParcel, 4, paramLocationRequestUpdateData.e, paramInt, false);
      if (paramLocationRequestUpdateData.f != null) {
        break label107;
      }
    }
    label107:
    for (paramLocationRequestUpdateData = (LocationRequestUpdateData)localObject;; paramLocationRequestUpdateData = paramLocationRequestUpdateData.f.asBinder())
    {
      a.a(paramParcel, 5, paramLocationRequestUpdateData, false);
      a.n(paramParcel, i);
      return;
      localIBinder = paramLocationRequestUpdateData.d.asBinder();
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
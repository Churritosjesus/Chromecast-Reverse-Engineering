import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.ParcelableGeofence;

public final class cog
  implements Parcelable.Creator
{
  public static void a(ParcelableGeofence paramParcelableGeofence, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, paramParcelableGeofence.b, false);
    a.c(paramParcel, 1000, paramParcelableGeofence.a);
    a.a(paramParcel, 2, paramParcelableGeofence.c);
    int j = paramParcelableGeofence.d;
    a.b(paramParcel, 3, 4);
    paramParcel.writeInt(j);
    a.a(paramParcel, 4, paramParcelableGeofence.e);
    a.a(paramParcel, 5, paramParcelableGeofence.f);
    a.a(paramParcel, 6, paramParcelableGeofence.g);
    a.c(paramParcel, 7, paramParcelableGeofence.h);
    a.c(paramParcel, 8, paramParcelableGeofence.i);
    a.c(paramParcel, 9, paramParcelableGeofence.j);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.GeofencingRequest;

public final class coi
  implements Parcelable.Creator
{
  public static void a(GeofencingRequest paramGeofencingRequest, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, paramGeofencingRequest.b, false);
    a.c(paramParcel, 1000, paramGeofencingRequest.a);
    a.c(paramParcel, 2, paramGeofencingRequest.c);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\coi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
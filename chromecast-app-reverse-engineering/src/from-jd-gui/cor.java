import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationSettingsStates;

public final class cor
  implements Parcelable.Creator
{
  public static void a(LocationSettingsStates paramLocationSettingsStates, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, paramLocationSettingsStates.b);
    a.c(paramParcel, 1000, paramLocationSettingsStates.a);
    a.a(paramParcel, 2, paramLocationSettingsStates.c);
    a.a(paramParcel, 3, paramLocationSettingsStates.d);
    a.a(paramParcel, 4, paramLocationSettingsStates.e);
    a.a(paramParcel, 5, paramLocationSettingsStates.f);
    a.a(paramParcel, 6, paramLocationSettingsStates.g);
    a.a(paramParcel, 7, paramLocationSettingsStates.h);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
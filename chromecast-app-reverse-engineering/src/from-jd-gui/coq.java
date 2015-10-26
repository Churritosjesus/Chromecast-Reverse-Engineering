import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.Collections;

public final class coq
  implements Parcelable.Creator
{
  public static void a(LocationSettingsRequest paramLocationSettingsRequest, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, Collections.unmodifiableList(paramLocationSettingsRequest.b), false);
    a.c(paramParcel, 1000, paramLocationSettingsRequest.a);
    a.a(paramParcel, 2, paramLocationSettingsRequest.c);
    a.a(paramParcel, 3, paramLocationSettingsRequest.d);
    a.a(paramParcel, 4, paramLocationSettingsRequest.e);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\coq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
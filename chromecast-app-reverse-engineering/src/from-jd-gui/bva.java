import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.CastDevice;
import java.util.Collections;

public final class bva
  implements Parcelable.Creator
{
  public static void a(CastDevice paramCastDevice, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramCastDevice.a);
    a.a(paramParcel, 2, paramCastDevice.b, false);
    a.a(paramParcel, 3, paramCastDevice.c, false);
    a.a(paramParcel, 4, paramCastDevice.e, false);
    a.a(paramParcel, 5, paramCastDevice.f, false);
    a.a(paramParcel, 6, paramCastDevice.g, false);
    a.c(paramParcel, 7, paramCastDevice.h);
    a.a(paramParcel, 8, Collections.unmodifiableList(paramCastDevice.i), false);
    a.c(paramParcel, 9, paramCastDevice.j);
    a.c(paramParcel, 10, paramCastDevice.k);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
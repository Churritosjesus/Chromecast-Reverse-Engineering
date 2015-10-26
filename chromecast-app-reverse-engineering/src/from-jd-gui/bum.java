import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.DeviceStatus;

public final class bum
  implements Parcelable.Creator
{
  public static void a(DeviceStatus paramDeviceStatus, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramDeviceStatus.a);
    a.a(paramParcel, 2, paramDeviceStatus.b);
    a.a(paramParcel, 3, paramDeviceStatus.c);
    a.c(paramParcel, 4, paramDeviceStatus.d);
    a.a(paramParcel, 5, paramDeviceStatus.e, paramInt, false);
    a.c(paramParcel, 6, paramDeviceStatus.f);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
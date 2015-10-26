import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.LaunchOptions;

public final class bvb
  implements Parcelable.Creator
{
  public static void a(LaunchOptions paramLaunchOptions, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramLaunchOptions.a);
    a.a(paramParcel, 2, paramLaunchOptions.b);
    a.a(paramParcel, 3, paramLaunchOptions.c, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
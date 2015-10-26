import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;

public final class bxy
  implements Parcelable.Creator
{
  public static void a(BitmapTeleporter paramBitmapTeleporter, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramBitmapTeleporter.a);
    a.a(paramParcel, 2, paramBitmapTeleporter.b, paramInt, false);
    a.c(paramParcel, 3, paramBitmapTeleporter.c);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
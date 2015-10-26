import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;

public final class byc
  implements Parcelable.Creator
{
  public static void a(WebImage paramWebImage, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramWebImage.a);
    a.a(paramParcel, 2, paramWebImage.b, paramInt, false);
    a.c(paramParcel, 3, paramWebImage.c);
    a.c(paramParcel, 4, paramWebImage.d);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
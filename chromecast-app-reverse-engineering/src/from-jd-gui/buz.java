import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import java.util.List;

public final class buz
  implements Parcelable.Creator
{
  public static void a(ApplicationMetadata paramApplicationMetadata, Parcel paramParcel, int paramInt)
  {
    int j = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramApplicationMetadata.a);
    a.a(paramParcel, 2, paramApplicationMetadata.b, false);
    a.a(paramParcel, 3, paramApplicationMetadata.c, false);
    a.a(paramParcel, 4, paramApplicationMetadata.d, false);
    List localList = paramApplicationMetadata.e;
    if (localList != null)
    {
      int i = a.m(paramParcel, 5);
      paramParcel.writeStringList(localList);
      a.n(paramParcel, i);
    }
    a.a(paramParcel, 6, paramApplicationMetadata.f, false);
    a.a(paramParcel, 7, paramApplicationMetadata.g, paramInt, false);
    a.n(paramParcel, j);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\buz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
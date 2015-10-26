import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

public final class bzu
  implements Parcelable.Creator
{
  public static FavaDiagnosticsEntity a(Parcel paramParcel)
  {
    int j = 0;
    int k = a.a(paramParcel);
    String str = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = paramParcel.readInt();
      switch (0xFFFF & m)
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        i = a.d(paramParcel, m);
        break;
      case 2: 
        str = a.h(paramParcel, m);
        break;
      case 3: 
        j = a.d(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new l("Overread allowed size end=" + k, paramParcel);
    }
    return new FavaDiagnosticsEntity(i, str, j);
  }
  
  public static void a(FavaDiagnosticsEntity paramFavaDiagnosticsEntity, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramFavaDiagnosticsEntity.a);
    a.a(paramParcel, 2, paramFavaDiagnosticsEntity.b, false);
    a.c(paramParcel, 3, paramFavaDiagnosticsEntity.c);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
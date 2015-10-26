import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;

public final class cng
  implements Parcelable.Creator
{
  public static LocationRequest a(Parcel paramParcel)
  {
    int m = a.a(paramParcel);
    int k = 0;
    int j = 102;
    long l4 = 3600000L;
    long l3 = 600000L;
    boolean bool = false;
    long l2 = Long.MAX_VALUE;
    int i = Integer.MAX_VALUE;
    float f = 0.0F;
    long l1 = 0L;
    while (paramParcel.dataPosition() < m)
    {
      int n = paramParcel.readInt();
      switch (0xFFFF & n)
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        j = a.d(paramParcel, n);
        break;
      case 1000: 
        k = a.d(paramParcel, n);
        break;
      case 2: 
        l4 = a.e(paramParcel, n);
        break;
      case 3: 
        l3 = a.e(paramParcel, n);
        break;
      case 4: 
        bool = a.c(paramParcel, n);
        break;
      case 5: 
        l2 = a.e(paramParcel, n);
        break;
      case 6: 
        i = a.d(paramParcel, n);
        break;
      case 7: 
        f = a.f(paramParcel, n);
        break;
      case 8: 
        l1 = a.e(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new l("Overread allowed size end=" + m, paramParcel);
    }
    return new LocationRequest(k, j, l4, l3, bool, l2, i, f, l1);
  }
  
  public static void a(LocationRequest paramLocationRequest, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramLocationRequest.b);
    a.c(paramParcel, 1000, paramLocationRequest.a);
    a.a(paramParcel, 2, paramLocationRequest.c);
    a.a(paramParcel, 3, paramLocationRequest.d);
    a.a(paramParcel, 4, paramLocationRequest.e);
    a.a(paramParcel, 5, paramLocationRequest.f);
    a.c(paramParcel, 6, paramLocationRequest.g);
    a.a(paramParcel, 7, paramLocationRequest.h);
    a.a(paramParcel, 8, paramLocationRequest.i);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationAvailability;

public final class cnf
  implements Parcelable.Creator
{
  public static LocationAvailability a(Parcel paramParcel)
  {
    int i = 1;
    int n = a.a(paramParcel);
    int m = 0;
    int k = 1000;
    long l = 0L;
    int j = 1;
    while (paramParcel.dataPosition() < n)
    {
      int i1 = paramParcel.readInt();
      switch (0xFFFF & i1)
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        j = a.d(paramParcel, i1);
        break;
      case 1000: 
        m = a.d(paramParcel, i1);
        break;
      case 2: 
        i = a.d(paramParcel, i1);
        break;
      case 3: 
        l = a.e(paramParcel, i1);
        break;
      case 4: 
        k = a.d(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != n) {
      throw new l("Overread allowed size end=" + n, paramParcel);
    }
    return new LocationAvailability(m, k, j, i, l);
  }
  
  public static void a(LocationAvailability paramLocationAvailability, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramLocationAvailability.b);
    a.c(paramParcel, 1000, paramLocationAvailability.a);
    a.c(paramParcel, 2, paramLocationAvailability.c);
    a.a(paramParcel, 3, paramLocationAvailability.d);
    a.c(paramParcel, 4, paramLocationAvailability.e);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cnf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
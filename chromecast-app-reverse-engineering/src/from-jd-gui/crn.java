import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;

public final class crn
  implements Parcelable.Creator
{
  public static ParcelableGetOptions a(Parcel paramParcel)
  {
    Bundle localBundle = null;
    boolean bool1 = false;
    int j = a.a(paramParcel);
    String str = null;
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        bool3 = a.c(paramParcel, k);
        break;
      case 1000: 
        i = a.d(paramParcel, k);
        break;
      case 2: 
        bool2 = a.c(paramParcel, k);
        break;
      case 3: 
        str = a.h(paramParcel, k);
        break;
      case 4: 
        bool1 = a.c(paramParcel, k);
        break;
      case 5: 
        localBundle = a.j(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new l("Overread allowed size end=" + j, paramParcel);
    }
    return new ParcelableGetOptions(i, bool3, bool2, bool1, str, localBundle);
  }
  
  public static void a(ParcelableGetOptions paramParcelableGetOptions, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, paramParcelableGetOptions.b);
    a.c(paramParcel, 1000, paramParcelableGetOptions.a);
    a.a(paramParcel, 2, paramParcelableGetOptions.c);
    a.a(paramParcel, 3, paramParcelableGetOptions.d, false);
    a.a(paramParcel, 4, paramParcelableGetOptions.e);
    a.a(paramParcel, 5, paramParcelableGetOptions.f, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\crn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
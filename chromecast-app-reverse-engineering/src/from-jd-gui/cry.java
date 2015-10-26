import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;

public final class cry
  implements Parcelable.Creator
{
  public static ParcelableLoadImageOptions a(Parcel paramParcel)
  {
    boolean bool = false;
    int m = a.a(paramParcel);
    int k = 0;
    int j = 0;
    int i = 0;
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
        i = a.d(paramParcel, n);
        break;
      case 2: 
        k = a.d(paramParcel, n);
        break;
      case 3: 
        bool = a.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new l("Overread allowed size end=" + m, paramParcel);
    }
    return new ParcelableLoadImageOptions(i, j, k, bool);
  }
  
  public static void a(ParcelableLoadImageOptions paramParcelableLoadImageOptions, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramParcelableLoadImageOptions.b);
    a.c(paramParcel, 1000, paramParcelableLoadImageOptions.a);
    a.c(paramParcel, 2, paramParcelableLoadImageOptions.c);
    a.a(paramParcel, 3, paramParcelableLoadImageOptions.d);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
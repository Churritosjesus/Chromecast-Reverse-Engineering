import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.model.AvatarReference;

public final class css
  implements Parcelable.Creator
{
  public static AvatarReference a(Parcel paramParcel)
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
        j = a.d(paramParcel, m);
        break;
      case 1000: 
        i = a.d(paramParcel, m);
        break;
      case 2: 
        str = a.h(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new l("Overread allowed size end=" + k, paramParcel);
    }
    return new AvatarReference(i, j, str);
  }
  
  public static void a(AvatarReference paramAvatarReference, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramAvatarReference.b);
    a.c(paramParcel, 1000, paramAvatarReference.a);
    a.a(paramParcel, 2, paramAvatarReference.c, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\css.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
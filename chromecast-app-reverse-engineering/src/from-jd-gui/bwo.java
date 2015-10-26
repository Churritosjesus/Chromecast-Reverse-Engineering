import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

public final class bwo
  implements Parcelable.Creator
{
  public static Status a(Parcel paramParcel)
  {
    PendingIntent localPendingIntent = null;
    int k = a.a(paramParcel);
    int j = 0;
    int i = 0;
    String str = null;
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
        break;
      case 3: 
        localPendingIntent = (PendingIntent)a.a(paramParcel, m, PendingIntent.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new l("Overread allowed size end=" + k, paramParcel);
    }
    return new Status(i, j, str, localPendingIntent);
  }
  
  public static void a(Status paramStatus, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramStatus.f);
    a.c(paramParcel, 1000, paramStatus.e);
    a.a(paramParcel, 2, paramStatus.g, false);
    a.a(paramParcel, 3, paramStatus.h, paramInt, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bwo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
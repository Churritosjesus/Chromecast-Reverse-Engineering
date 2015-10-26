import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;

public final class bvo
  implements Parcelable.Creator
{
  public static ConnectionResult a(Parcel paramParcel)
  {
    int j = 0;
    int k = a.a(paramParcel);
    PendingIntent localPendingIntent = null;
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
        j = a.d(paramParcel, m);
        break;
      case 3: 
        localPendingIntent = (PendingIntent)a.a(paramParcel, m, PendingIntent.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new l("Overread allowed size end=" + k, paramParcel);
    }
    return new ConnectionResult(i, j, localPendingIntent);
  }
  
  public static void a(ConnectionResult paramConnectionResult, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramConnectionResult.b);
    a.c(paramParcel, 2, paramConnectionResult.c);
    a.a(paramParcel, 3, paramConnectionResult.d, paramInt, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.stats.ConnectionEvent;

public final class bzv
  implements Parcelable.Creator
{
  public static void a(ConnectionEvent paramConnectionEvent, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramConnectionEvent.a);
    a.a(paramParcel, 2, paramConnectionEvent.b);
    a.a(paramParcel, 3, paramConnectionEvent.c, false);
    a.a(paramParcel, 4, paramConnectionEvent.d, false);
    a.a(paramParcel, 5, paramConnectionEvent.e, false);
    a.a(paramParcel, 6, paramConnectionEvent.f, false);
    a.a(paramParcel, 7, paramConnectionEvent.g, false);
    a.a(paramParcel, 8, paramConnectionEvent.h, false);
    a.a(paramParcel, 9, paramConnectionEvent.i);
    a.a(paramParcel, 10, paramConnectionEvent.j);
    a.a(paramParcel, 11, paramConnectionEvent.k);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
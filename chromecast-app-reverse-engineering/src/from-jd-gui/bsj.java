import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEvent;

public final class bsj
  implements Parcelable.Creator
{
  public static void a(AccountChangeEvent paramAccountChangeEvent, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramAccountChangeEvent.a);
    a.a(paramParcel, 2, paramAccountChangeEvent.b);
    a.a(paramParcel, 3, paramAccountChangeEvent.c, false);
    a.c(paramParcel, 4, paramAccountChangeEvent.d);
    a.c(paramParcel, 5, paramAccountChangeEvent.e);
    a.a(paramParcel, 6, paramAccountChangeEvent.f, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bsj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
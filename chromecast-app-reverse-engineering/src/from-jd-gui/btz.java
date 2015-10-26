import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.ApplicationStatus;

public final class btz
  implements Parcelable.Creator
{
  public static void a(ApplicationStatus paramApplicationStatus, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramApplicationStatus.a);
    a.a(paramParcel, 2, paramApplicationStatus.b, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\btz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
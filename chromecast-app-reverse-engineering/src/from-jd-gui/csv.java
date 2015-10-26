import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.signin.internal.AuthAccountResult;

public final class csv
  implements Parcelable.Creator
{
  public static void a(AuthAccountResult paramAuthAccountResult, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramAuthAccountResult.a);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\csv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.signin.internal.CheckServerAuthResult;

public final class csx
  implements Parcelable.Creator
{
  public static void a(CheckServerAuthResult paramCheckServerAuthResult, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramCheckServerAuthResult.a);
    a.a(paramParcel, 2, paramCheckServerAuthResult.b);
    a.a(paramParcel, 3, paramCheckServerAuthResult.c, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\csx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.AuthAccountRequest;

public final class byj
  implements Parcelable.Creator
{
  public static void a(AuthAccountRequest paramAuthAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramAuthAccountRequest.a);
    a.a(paramParcel, 2, paramAuthAccountRequest.b, false);
    a.a(paramParcel, 3, paramAuthAccountRequest.c, paramInt, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
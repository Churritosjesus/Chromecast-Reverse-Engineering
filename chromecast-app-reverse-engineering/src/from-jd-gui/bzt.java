import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountResponse;

public final class bzt
  implements Parcelable.Creator
{
  public static void a(ResolveAccountResponse paramResolveAccountResponse, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramResolveAccountResponse.a);
    a.a(paramParcel, 2, paramResolveAccountResponse.b, false);
    a.a(paramParcel, 3, paramResolveAccountResponse.c, paramInt, false);
    a.a(paramParcel, 4, paramResolveAccountResponse.d);
    a.a(paramParcel, 5, paramResolveAccountResponse.e);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
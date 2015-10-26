import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;

public final class bzs
  implements Parcelable.Creator
{
  public static void a(ResolveAccountRequest paramResolveAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramResolveAccountRequest.a);
    a.a(paramParcel, 2, paramResolveAccountRequest.b, paramInt, false);
    a.c(paramParcel, 3, paramResolveAccountRequest.c);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
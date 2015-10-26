import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.GetServiceRequest;

public final class byn
  implements Parcelable.Creator
{
  public static void a(GetServiceRequest paramGetServiceRequest, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramGetServiceRequest.a);
    a.c(paramParcel, 2, paramGetServiceRequest.b);
    a.c(paramParcel, 3, paramGetServiceRequest.c);
    a.a(paramParcel, 4, paramGetServiceRequest.d, false);
    a.a(paramParcel, 5, paramGetServiceRequest.e, false);
    a.a(paramParcel, 6, paramGetServiceRequest.f, paramInt, false);
    a.a(paramParcel, 7, paramGetServiceRequest.g, false);
    a.a(paramParcel, 8, paramGetServiceRequest.h, paramInt, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
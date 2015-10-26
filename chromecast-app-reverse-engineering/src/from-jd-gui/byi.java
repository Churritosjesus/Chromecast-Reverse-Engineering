import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ValidateAccountRequest;

public final class byi
  implements Parcelable.Creator
{
  public static void a(ValidateAccountRequest paramValidateAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramValidateAccountRequest.a);
    a.c(paramParcel, 2, paramValidateAccountRequest.b);
    a.a(paramParcel, 3, paramValidateAccountRequest.c, false);
    a.a(paramParcel, 4, paramValidateAccountRequest.d, paramInt, false);
    a.a(paramParcel, 5, paramValidateAccountRequest.e, false);
    a.a(paramParcel, 6, paramValidateAccountRequest.f, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
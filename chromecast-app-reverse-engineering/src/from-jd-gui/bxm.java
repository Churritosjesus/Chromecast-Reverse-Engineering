import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;

public final class bxm
  implements Parcelable.Creator
{
  public static void a(Scope paramScope, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramScope.a);
    a.a(paramParcel, 2, paramScope.b, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
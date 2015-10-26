import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.ClientIdentity;

public final class cnq
  implements Parcelable.Creator
{
  public static void a(ClientIdentity paramClientIdentity, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramClientIdentity.b);
    a.c(paramParcel, 1000, paramClientIdentity.a);
    a.a(paramParcel, 2, paramClientIdentity.c, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cnq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
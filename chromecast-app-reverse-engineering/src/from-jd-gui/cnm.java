import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;

public final class cnm
  implements Parcelable.Creator
{
  public static void a(CopresenceApiOptions paramCopresenceApiOptions, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramCopresenceApiOptions.b);
    a.a(paramParcel, 2, paramCopresenceApiOptions.c);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cnm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
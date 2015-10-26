import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.LogOptions;

public final class cij
  implements Parcelable.Creator
{
  public static void a(LogOptions paramLogOptions, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramLogOptions.a);
    a.a(paramParcel, 2, paramLogOptions.b, false);
    a.a(paramParcel, 3, paramLogOptions.c);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
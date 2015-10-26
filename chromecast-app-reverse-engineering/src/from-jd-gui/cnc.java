import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.DetectedActivity;

public final class cnc
  implements Parcelable.Creator
{
  public static void a(DetectedActivity paramDetectedActivity, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramDetectedActivity.b);
    a.c(paramParcel, 1000, paramDetectedActivity.a);
    a.c(paramParcel, 2, paramDetectedActivity.c);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cnc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
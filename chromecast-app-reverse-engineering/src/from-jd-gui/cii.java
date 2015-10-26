import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.FileTeleporter;

public final class cii
  implements Parcelable.Creator
{
  public static void a(FileTeleporter paramFileTeleporter, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramFileTeleporter.a);
    a.a(paramParcel, 2, paramFileTeleporter.b, paramInt, false);
    a.a(paramParcel, 3, paramFileTeleporter.c, false);
    a.a(paramParcel, 4, paramFileTeleporter.d, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
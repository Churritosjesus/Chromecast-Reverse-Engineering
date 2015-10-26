import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ThemeSettings;

public final class cik
  implements Parcelable.Creator
{
  public static void a(ThemeSettings paramThemeSettings, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramThemeSettings.a);
    a.c(paramParcel, 2, paramThemeSettings.b);
    a.c(paramParcel, 3, paramThemeSettings.c);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
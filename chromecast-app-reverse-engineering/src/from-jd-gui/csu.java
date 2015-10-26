import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class csu
  implements Parcelable.Creator
{
  public static void a(PlayLoggerContext paramPlayLoggerContext, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramPlayLoggerContext.a);
    a.a(paramParcel, 2, paramPlayLoggerContext.b, false);
    a.c(paramParcel, 3, paramPlayLoggerContext.c);
    a.c(paramParcel, 4, paramPlayLoggerContext.d);
    a.a(paramParcel, 5, paramPlayLoggerContext.e, false);
    a.a(paramParcel, 6, paramPlayLoggerContext.f, false);
    a.a(paramParcel, 7, paramPlayLoggerContext.g);
    a.a(paramParcel, 8, paramPlayLoggerContext.h, false);
    a.a(paramParcel, 9, paramPlayLoggerContext.i);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\csu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
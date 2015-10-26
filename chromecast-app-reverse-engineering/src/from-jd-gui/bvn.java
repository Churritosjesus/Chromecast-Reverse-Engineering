import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class bvn
  implements Parcelable.Creator
{
  public static LogEventParcelable a(Parcel paramParcel)
  {
    int j = a.a(paramParcel);
    PlayLoggerContext localPlayLoggerContext = null;
    int i = 0;
    byte[] arrayOfByte = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        i = a.d(paramParcel, k);
        break;
      case 2: 
        localPlayLoggerContext = (PlayLoggerContext)a.a(paramParcel, k, PlayLoggerContext.CREATOR);
        break;
      case 3: 
        arrayOfByte = a.k(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new l("Overread allowed size end=" + j, paramParcel);
    }
    return new LogEventParcelable(i, localPlayLoggerContext, arrayOfByte);
  }
  
  public static void a(LogEventParcelable paramLogEventParcelable, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramLogEventParcelable.a);
    a.a(paramParcel, 2, paramLogEventParcelable.b, paramInt, false);
    a.a(paramParcel, 3, paramLogEventParcelable.c, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
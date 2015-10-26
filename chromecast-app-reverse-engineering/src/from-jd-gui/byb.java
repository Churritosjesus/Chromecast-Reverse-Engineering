import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;

public final class byb
  implements Parcelable.Creator
{
  public static DataHolder a(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle = null;
    int k = a.a(paramParcel);
    CursorWindow[] arrayOfCursorWindow = null;
    String[] arrayOfString = null;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = paramParcel.readInt();
      switch (0xFFFF & m)
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        arrayOfString = a.l(paramParcel, m);
        break;
      case 1000: 
        j = a.d(paramParcel, m);
        break;
      case 2: 
        arrayOfCursorWindow = (CursorWindow[])a.b(paramParcel, m, CursorWindow.CREATOR);
        break;
      case 3: 
        i = a.d(paramParcel, m);
        break;
      case 4: 
        localBundle = a.j(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new l("Overread allowed size end=" + k, paramParcel);
    }
    paramParcel = new DataHolder(j, arrayOfString, arrayOfCursorWindow, i, localBundle);
    paramParcel.a();
    return paramParcel;
  }
  
  public static void a(DataHolder paramDataHolder, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, paramDataHolder.b, false);
    a.c(paramParcel, 1000, paramDataHolder.a);
    a.a(paramParcel, 2, paramDataHolder.d, paramInt, false);
    a.c(paramParcel, 3, paramDataHolder.e);
    a.a(paramParcel, 4, paramDataHolder.f, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
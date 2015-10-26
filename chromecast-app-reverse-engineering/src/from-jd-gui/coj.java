import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.GestureRequest;
import java.util.ArrayList;
import java.util.List;

public final class coj
  implements Parcelable.Creator
{
  public static GestureRequest a(Parcel paramParcel)
  {
    int k = a.a(paramParcel);
    ArrayList localArrayList = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int j = paramParcel.readInt();
      switch (0xFFFF & j)
      {
      default: 
        a.b(paramParcel, j);
        break;
      case 1: 
        int n = a.a(paramParcel, j);
        int m = paramParcel.dataPosition();
        if (n == 0)
        {
          localArrayList = null;
        }
        else
        {
          localArrayList = new ArrayList();
          int i1 = paramParcel.readInt();
          for (j = 0; j < i1; j++) {
            localArrayList.add(Integer.valueOf(paramParcel.readInt()));
          }
          paramParcel.setDataPosition(m + n);
        }
        break;
      case 1000: 
        i = a.d(paramParcel, j);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new l("Overread allowed size end=" + k, paramParcel);
    }
    return new GestureRequest(i, localArrayList);
  }
  
  public static void a(GestureRequest paramGestureRequest, Parcel paramParcel)
  {
    int m = a.m(paramParcel, 20293);
    List localList = paramGestureRequest.b;
    if (localList != null)
    {
      int j = a.m(paramParcel, 1);
      int k = localList.size();
      paramParcel.writeInt(k);
      for (int i = 0; i < k; i++) {
        paramParcel.writeInt(((Integer)localList.get(i)).intValue());
      }
      a.n(paramParcel, j);
    }
    a.c(paramParcel, 1000, paramGestureRequest.a);
    a.n(paramParcel, m);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\coj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
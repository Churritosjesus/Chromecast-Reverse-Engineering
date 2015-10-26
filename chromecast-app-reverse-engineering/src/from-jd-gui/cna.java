import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

public final class cna
  implements Parcelable.Creator
{
  public static ActivityRecognitionResult a(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = 0;
    int k = a.a(paramParcel);
    ArrayList localArrayList = null;
    long l2 = 0L;
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
        localArrayList = a.c(paramParcel, m, DetectedActivity.CREATOR);
        break;
      case 1000: 
        j = a.d(paramParcel, m);
        break;
      case 2: 
        l2 = a.e(paramParcel, m);
        break;
      case 3: 
        l1 = a.e(paramParcel, m);
        break;
      case 4: 
        i = a.d(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new l("Overread allowed size end=" + k, paramParcel);
    }
    return new ActivityRecognitionResult(j, localArrayList, l2, l1, i);
  }
  
  public static void a(ActivityRecognitionResult paramActivityRecognitionResult, Parcel paramParcel)
  {
    int i = a.m(paramParcel, 20293);
    a.a(paramParcel, 1, paramActivityRecognitionResult.b, false);
    a.c(paramParcel, 1000, paramActivityRecognitionResult.a);
    a.a(paramParcel, 2, paramActivityRecognitionResult.c);
    a.a(paramParcel, 3, paramActivityRecognitionResult.d);
    a.c(paramParcel, 4, paramActivityRecognitionResult.e);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
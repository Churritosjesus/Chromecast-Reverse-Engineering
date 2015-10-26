import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class dm
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new dn();
  final Object a;
  
  dm(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramParcel.writeParcelable((Parcelable)this.a, paramInt);
    }
    for (;;)
    {
      return;
      paramParcel.writeStrongBinder((IBinder)this.a);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
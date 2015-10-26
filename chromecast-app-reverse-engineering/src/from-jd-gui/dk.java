import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;

final class dk
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new dl();
  private ResultReceiver a;
  
  dk(Parcel paramParcel)
  {
    this.a = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.a.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
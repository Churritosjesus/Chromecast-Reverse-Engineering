import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class di
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new dj();
  private final cf a;
  private final long b;
  
  di(Parcel paramParcel)
  {
    this.a = ((cf)cf.CREATOR.createFromParcel(paramParcel));
    this.b = paramParcel.readLong();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.a.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
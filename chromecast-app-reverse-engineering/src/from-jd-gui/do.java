import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class do
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new dp();
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  
  public do(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.b = paramParcel.readInt();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
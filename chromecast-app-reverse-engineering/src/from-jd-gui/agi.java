import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class agi
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new agj();
  final String a;
  final Parcelable b;
  
  agi(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readParcelable(afv.f().getClassLoader());
  }
  
  public final int describeContents()
  {
    return 1;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeParcelable(this.b, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
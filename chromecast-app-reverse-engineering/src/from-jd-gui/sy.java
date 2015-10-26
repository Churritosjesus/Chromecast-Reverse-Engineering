import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class sy
  extends ra
{
  public static final Parcelable.Creator CREATOR = new sz();
  boolean c;
  
  sy(Parcel paramParcel)
  {
    super(paramParcel);
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      return;
    }
  }
  
  sy(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    if (this.c) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
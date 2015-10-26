import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class ra
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR = new rb();
  long a;
  int b;
  
  ra(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readLong();
    this.b = paramParcel.readInt();
  }
  
  ra(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    return "AbsSpinner.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.a + " position=" + this.b + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.a);
    paramParcel.writeInt(this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
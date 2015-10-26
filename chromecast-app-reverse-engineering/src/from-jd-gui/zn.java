import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class zn
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR = new zo();
  public Parcelable a;
  
  zn(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readParcelable(zh.class.getClassLoader());
  }
  
  public zn(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(this.a, 0);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
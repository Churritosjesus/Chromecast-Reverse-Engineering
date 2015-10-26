import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class kv
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR = new kw();
  public int a = 0;
  public int b = 0;
  public int c = 0;
  
  public kv(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readInt();
  }
  
  public kv(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\kv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class du
  implements Parcelable.Creator
{
  private dv a;
  
  public du(dv paramdv)
  {
    this.a = paramdv;
  }
  
  public final Object createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
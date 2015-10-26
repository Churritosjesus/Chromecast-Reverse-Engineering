import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class dw
  implements Parcelable.ClassLoaderCreator
{
  private final dv a;
  
  public dw(dv paramdv)
  {
    this.a = paramdv;
  }
  
  public final Object createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }
  
  public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return this.a.a(paramParcel, paramClassLoader);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
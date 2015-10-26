import android.os.Parcel;

public class l
  extends RuntimeException
{
  public l(String paramString, Parcel paramParcel)
  {
    super(paramString + " Parcel: pos=" + paramParcel.dataPosition() + " size=" + paramParcel.dataSize());
  }
  
  public l(String paramString, Exception paramException)
  {
    super(paramString, paramException);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
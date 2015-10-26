import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class bcx
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bcy();
  private String a;
  private String b;
  private String c;
  
  public bcx(Parcel paramParcel)
  {
    this.a = ((String)paramParcel.readValue(null));
    this.b = ((String)paramParcel.readValue(null));
    this.c = ((String)paramParcel.readValue(null));
  }
  
  public bcx(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return this.b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeValue(this.a);
    paramParcel.writeValue(this.b);
    paramParcel.writeValue(this.c);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
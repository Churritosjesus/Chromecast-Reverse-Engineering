import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class bcz
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bda();
  public String a;
  private String b;
  
  public bcz(Parcel paramParcel)
  {
    this.a = ((String)paramParcel.readValue(null));
    this.b = ((String)paramParcel.readValue(null));
  }
  
  public bcz(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof bcz)) {}
    for (boolean bool = false;; bool = this.a.equals(((bcz)paramObject).a)) {
      return bool;
    }
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    return blx.a(this.b);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeValue(this.a);
    paramParcel.writeValue(this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bcz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
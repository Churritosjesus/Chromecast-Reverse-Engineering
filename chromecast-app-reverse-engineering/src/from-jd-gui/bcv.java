import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class bcv
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bcw();
  public String a;
  public String b;
  public byte[] c;
  
  public bcv(Parcel paramParcel)
  {
    this.a = ((String)paramParcel.readValue(null));
    this.b = ((String)paramParcel.readValue(null));
    int i = paramParcel.readInt();
    if (i >= 0)
    {
      this.c = new byte[i];
      paramParcel.readByteArray(this.c);
    }
  }
  
  public bcv(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramArrayOfByte;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return this.a;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeValue(this.a);
    paramParcel.writeValue(this.b);
    if (this.c != null)
    {
      paramParcel.writeInt(this.c.length);
      paramParcel.writeByteArray(this.c);
    }
    for (;;)
    {
      return;
      paramParcel.writeInt(-1);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bcv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

public final class bcd
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bce();
  public final dbk a;
  public final String b;
  public final int c;
  private final String d;
  
  public bcd(Parcel paramParcel)
  {
    Object localObject = new byte[paramParcel.readInt()];
    paramParcel.readByteArray((byte[])localObject);
    try
    {
      dbk localdbk = new dbk;
      localdbk.<init>();
      localObject = (dbk)dew.a(localdbk, (byte[])localObject);
      this.a = ((dbk)localObject);
      this.d = paramParcel.readString();
      this.b = paramParcel.readString();
      this.c = paramParcel.readInt();
      return;
    }
    catch (dev localdev)
    {
      str = String.valueOf(localdev.toString());
      if (str.length() == 0) {}
    }
    for (String str = "Failed to unparcel OfferData: ".concat(str);; str = new String("Failed to unparcel OfferData: "))
    {
      Log.w("OfferData", str);
      str = null;
      break;
    }
  }
  
  public bcd(dbk paramdbk, aow paramaow)
  {
    this.a = paramdbk;
    if (paramaow == null)
    {
      paramdbk = "";
      this.d = paramdbk;
      if (paramaow != null) {
        break label53;
      }
      paramdbk = "";
      label28:
      this.b = paramdbk;
      if (paramaow != null) {
        break label61;
      }
    }
    label53:
    label61:
    for (int i = 0;; i = paramaow.h())
    {
      this.c = i;
      return;
      paramdbk = paramaow.a;
      break;
      paramdbk = paramaow.g();
      break label28;
    }
  }
  
  public final String a()
  {
    String str2 = String.valueOf(this.a.a);
    String str1 = this.d;
    return String.valueOf(str2).length() + 1 + String.valueOf(str1).length() + str2 + "-" + str1;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof bcd)) {
        bool = false;
      } else {
        bool = ((bcd)paramObject).a().equals(a());
      }
    }
  }
  
  public final int hashCode()
  {
    return a().hashCode();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byte[] arrayOfByte = dbk.a(this.a);
    paramParcel.writeInt(arrayOfByte.length);
    paramParcel.writeByteArray(arrayOfByte);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
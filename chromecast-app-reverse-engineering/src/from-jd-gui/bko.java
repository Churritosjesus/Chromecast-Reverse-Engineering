import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.CastDevice;
import java.net.Inet4Address;

public final class bko
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bkp();
  final String a;
  String b;
  String c;
  private final String d;
  
  public bko(Parcel paramParcel)
  {
    this.d = ((String)paramParcel.readValue(null));
    this.a = ((String)paramParcel.readValue(null));
    this.b = ((String)paramParcel.readValue(null));
    this.c = ((String)paramParcel.readValue(null));
  }
  
  public bko(aow paramaow)
  {
    this.d = paramaow.g();
    this.a = paramaow.c.c;
    this.b = paramaow.n();
    this.c = paramaow.c.F;
  }
  
  public bko(CastDevice paramCastDevice)
  {
    this.d = paramCastDevice.e;
    this.a = paramCastDevice.g;
    this.b = paramCastDevice.d.getHostAddress();
  }
  
  public bko(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.d = paramString1;
    this.a = paramString2;
    this.b = paramString3;
    this.c = paramString4;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeValue(this.d);
    paramParcel.writeValue(this.a);
    paramParcel.writeValue(this.b);
    paramParcel.writeValue(this.c);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bko.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
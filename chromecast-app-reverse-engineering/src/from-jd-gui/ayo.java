import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ayo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new ayp();
  private int a;
  private int b;
  private Uri c;
  
  public ayo(int paramInt1, int paramInt2, Uri paramUri)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramUri;
  }
  
  public ayo(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    paramParcel = (String)paramParcel.readValue(null);
    if (paramParcel != null) {
      this.c = Uri.parse(paramParcel);
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    if (this.c != null) {}
    for (String str = this.c.toString();; str = null)
    {
      paramParcel.writeValue(str);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ayo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
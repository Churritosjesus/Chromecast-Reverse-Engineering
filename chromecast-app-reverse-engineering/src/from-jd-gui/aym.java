import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class aym
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new ayn();
  public String a;
  public String b;
  String c;
  String d;
  Uri e;
  ArrayList f;
  
  public aym(Parcel paramParcel)
  {
    this.a = ((String)paramParcel.readValue(null));
    String str = (String)paramParcel.readValue(null);
    if (str != null) {
      this.b = str;
    }
    this.c = ((String)paramParcel.readValue(null));
    this.d = ((String)paramParcel.readValue(null));
    this.e = ((Uri)Uri.CREATOR.createFromParcel(paramParcel));
    this.f = new ArrayList(1);
    paramParcel.readList(this.f, aym.class.getClassLoader());
  }
  
  public aym(String paramString)
  {
    this.b = paramString;
    this.f = new ArrayList(0);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof aym))
      {
        bool = false;
      }
      else
      {
        paramObject = (aym)paramObject;
        if (this.a == null)
        {
          if (((aym)paramObject).a != null) {
            bool = false;
          }
        }
        else {
          bool = this.a.equals(((aym)paramObject).a);
        }
      }
    }
  }
  
  public int hashCode()
  {
    if (this.a == null) {}
    for (int i = 0;; i = this.a.hashCode()) {
      return i;
    }
  }
  
  public String toString()
  {
    String str2 = this.c;
    String str1 = this.a;
    return String.valueOf(str2).length() + 3 + String.valueOf(str1).length() + str2 + " (" + str1 + ")";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeValue(this.a);
    paramParcel.writeValue(this.b);
    paramParcel.writeValue(this.c);
    paramParcel.writeValue(this.d);
    Uri.writeToParcel(paramParcel, this.e);
    paramParcel.writeList(this.f);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aym.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
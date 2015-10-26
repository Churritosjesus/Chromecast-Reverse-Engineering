import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Map;

public final class akn
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new ako();
  final akp a;
  final afb b;
  final String c;
  final String d;
  public Map e;
  private akl f;
  
  private akn(akl paramakl, akp paramakp, afb paramafb, String paramString1, String paramString2)
  {
    ajp.a(paramakp, "code");
    this.f = paramakl;
    this.b = paramafb;
    this.c = paramString1;
    this.a = paramakp;
    this.d = paramString2;
  }
  
  akn(Parcel paramParcel)
  {
    this.a = akp.valueOf(paramParcel.readString());
    this.b = ((afb)paramParcel.readParcelable(afb.class.getClassLoader()));
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.f = ((akl)paramParcel.readParcelable(akl.class.getClassLoader()));
    this.e = aji.a(paramParcel);
  }
  
  static akn a(akl paramakl, afb paramafb)
  {
    return new akn(paramakl, akp.a, paramafb, null, null);
  }
  
  static akn a(akl paramakl, String paramString)
  {
    return new akn(paramakl, akp.b, null, paramString, null);
  }
  
  static akn a(akl paramakl, String paramString1, String paramString2)
  {
    return a(paramakl, paramString1, paramString2, null);
  }
  
  static akn a(akl paramakl, String paramString1, String paramString2, String paramString3)
  {
    paramString1 = TextUtils.join(": ", aji.b(new String[] { paramString1, paramString2 }));
    return new akn(paramakl, akp.c, null, paramString1, paramString3);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a.name());
    paramParcel.writeParcelable(this.b, paramInt);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeParcelable(this.f, paramInt);
    aji.a(paramParcel, this.e);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\akn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
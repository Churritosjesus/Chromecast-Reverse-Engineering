import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class bdb
  implements Parcelable, Comparable
{
  public static final Parcelable.Creator CREATOR = new bdc();
  public String a;
  public String b;
  public int c;
  private String d;
  
  public bdb(Parcel paramParcel)
  {
    this.a = ((String)paramParcel.readValue(null));
    this.b = ((String)paramParcel.readValue(null));
    this.c = paramParcel.readInt();
  }
  
  public bdb(String paramString1, String paramString2, int paramInt)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramInt;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof bdb)) {}
    for (boolean bool = false;; bool = this.a.equals(((bdb)paramObject).a)) {
      return bool;
    }
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    if (this.d == null) {
      this.d = String.format("%s GMT%+d:%02d", new Object[] { this.b, Integer.valueOf(this.c / 60), Integer.valueOf(Math.abs(this.c) % 60) });
    }
    return this.d;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeValue(this.a);
    paramParcel.writeValue(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
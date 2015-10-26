import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class ya
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new yb();
  int a;
  int b;
  boolean c;
  
  public ya() {}
  
  ya(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    if (paramParcel.readInt() == 1) {}
    for (;;)
    {
      this.c = bool;
      return;
      bool = false;
    }
  }
  
  public ya(ya paramya)
  {
    this.a = paramya.a;
    this.b = paramya.b;
    this.c = paramya.c;
  }
  
  final boolean a()
  {
    if (this.a >= 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
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
    if (this.c) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
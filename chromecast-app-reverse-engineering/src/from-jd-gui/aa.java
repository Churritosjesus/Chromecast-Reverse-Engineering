import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class aa
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new ab();
  ad[] a;
  int[] b;
  g[] c;
  
  public aa() {}
  
  public aa(Parcel paramParcel)
  {
    this.a = ((ad[])paramParcel.createTypedArray(ad.CREATOR));
    this.b = paramParcel.createIntArray();
    this.c = ((g[])paramParcel.createTypedArray(g.CREATOR));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedArray(this.a, paramInt);
    paramParcel.writeIntArray(this.b);
    paramParcel.writeTypedArray(this.c, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
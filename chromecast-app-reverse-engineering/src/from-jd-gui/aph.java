import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public final class aph
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new api();
  int a;
  String b;
  Integer c;
  String d;
  private final Random e = new Random();
  private String f;
  
  public aph()
  {
    this.a = this.e.nextInt();
  }
  
  aph(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readString();
    this.c = ((Integer)paramParcel.readValue(null));
    this.d = paramParcel.readString();
    this.f = paramParcel.readString();
  }
  
  public final aph a(bdf parambdf, boolean paramBoolean)
  {
    String str = parambdf.c;
    if ((str != null) && (!str.isEmpty())) {
      this.b = str;
    }
    if (!paramBoolean) {
      if (parambdf.w) {
        this.c = Integer.valueOf(2);
      }
    }
    for (;;)
    {
      this.d = parambdf.F;
      parambdf = parambdf.o;
      if ((parambdf != null) && (!parambdf.isEmpty())) {
        this.f = parambdf;
      }
      return this;
      this.c = Integer.valueOf(1);
      continue;
      this.c = Integer.valueOf(3);
    }
  }
  
  public final Long a()
  {
    Long localLong = null;
    if (this.f == null) {}
    for (;;)
    {
      return localLong;
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(this.f.getBytes());
        long l = ByteBuffer.wrap(localMessageDigest.digest(), 0, 8).getLong();
        localLong = Long.valueOf(l);
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeValue(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.f);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
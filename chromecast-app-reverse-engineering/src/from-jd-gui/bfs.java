import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Base64;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public final class bfs
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bft();
  private static final byte[] j = { 48, -126, 0, -97, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, -126, 0, -115, 0 };
  public String a;
  public bfu b;
  bfv c;
  int d;
  public String e;
  public boolean f;
  public boolean g;
  public int h;
  public String i;
  
  public bfs() {}
  
  public bfs(Parcel paramParcel)
  {
    this.a = ((String)paramParcel.readValue(null));
    this.b = ((bfu)paramParcel.readValue(null));
    this.c = ((bfv)paramParcel.readValue(null));
    this.d = paramParcel.readInt();
    this.e = ((String)paramParcel.readValue(null));
    if (paramParcel.readInt() != 0)
    {
      bool1 = true;
      this.f = bool1;
      if (paramParcel.readInt() == 0) {
        break label116;
      }
    }
    label116:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.g = bool1;
      this.h = paramParcel.readInt();
      this.i = ((String)paramParcel.readValue(null));
      return;
      bool1 = false;
      break;
    }
  }
  
  public bfs(bfs parambfs)
  {
    this.a = parambfs.a;
    this.b = parambfs.b;
    this.c = parambfs.c;
    this.d = parambfs.d;
    this.e = parambfs.e;
    this.f = parambfs.f;
    this.g = parambfs.g;
    this.h = parambfs.h;
    this.i = parambfs.i;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString2)) {
      throw new GeneralSecurityException("No public key available from Chromecast");
    }
    paramString2 = Base64.decode(paramString2, 0);
    Object localObject = new byte[j.length + paramString2.length];
    System.arraycopy(j, 0, localObject, 0, j.length);
    System.arraycopy(paramString2, 0, localObject, j.length, paramString2.length);
    a((byte[])localObject, 2, localObject.length - 4);
    a((byte[])localObject, 21, paramString2.length + 1);
    paramString2 = new X509EncodedKeySpec((byte[])localObject);
    localObject = KeyFactory.getInstance("RSA").generatePublic(paramString2);
    paramString2 = Cipher.getInstance("RSA/None/PKCS1Padding", "BC");
    paramString2.init(1, (Key)localObject);
    return Base64.encodeToString(paramString2.doFinal(paramString1.getBytes()), 2);
  }
  
  private static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[paramInt1] = ((byte)(paramInt2 / 256));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 % 256));
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
    int k = 1;
    paramParcel.writeValue(this.a);
    paramParcel.writeValue(this.b);
    paramParcel.writeValue(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeValue(this.e);
    if (this.f)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.g) {
        break label92;
      }
    }
    label92:
    for (paramInt = k;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.h);
      paramParcel.writeValue(this.i);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
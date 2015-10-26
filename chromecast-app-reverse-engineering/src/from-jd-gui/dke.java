import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class dke
  implements Serializable
{
  public static final dke a = a(new byte[0]);
  private static char[] c = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static final long serialVersionUID = 1L;
  public final byte[] b;
  private transient int d;
  private transient String e;
  
  dke(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  public static dke a(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("s == null");
    }
    dke localdke = new dke(paramString.getBytes(dky.a));
    localdke.e = paramString;
    return localdke;
  }
  
  public static dke a(byte... paramVarArgs)
  {
    if (paramVarArgs == null) {
      throw new IllegalArgumentException("data == null");
    }
    return new dke((byte[])paramVarArgs.clone());
  }
  
  private dke b(String paramString)
  {
    try
    {
      paramString = a(MessageDigest.getInstance(paramString).digest(this.b));
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    int j = paramObjectInputStream.readInt();
    if (paramObjectInputStream == null) {
      throw new IllegalArgumentException("in == null");
    }
    if (j < 0) {
      throw new IllegalArgumentException("byteCount < 0: " + j);
    }
    Object localObject = new byte[j];
    int i = 0;
    while (i < j)
    {
      int k = paramObjectInputStream.read((byte[])localObject, i, j - i);
      if (k == -1) {
        throw new EOFException();
      }
      i += k;
    }
    localObject = new dke((byte[])localObject);
    try
    {
      paramObjectInputStream = dke.class.getDeclaredField("b");
      paramObjectInputStream.setAccessible(true);
      paramObjectInputStream.set(this, ((dke)localObject).b);
      return;
    }
    catch (NoSuchFieldException paramObjectInputStream)
    {
      throw new AssertionError();
    }
    catch (IllegalAccessException paramObjectInputStream)
    {
      throw new AssertionError();
    }
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.writeInt(this.b.length);
    paramObjectOutputStream.write(this.b);
  }
  
  public final String a()
  {
    String str = this.e;
    if (str != null) {}
    for (;;)
    {
      return str;
      str = new String(this.b, dky.a);
      this.e = str;
    }
  }
  
  public final String b()
  {
    int i = 0;
    char[] arrayOfChar = new char[this.b.length << 1];
    byte[] arrayOfByte = this.b;
    int k = arrayOfByte.length;
    int j = 0;
    while (i < k)
    {
      int n = arrayOfByte[i];
      int m = j + 1;
      arrayOfChar[j] = c[(n >> 4 & 0xF)];
      j = m + 1;
      arrayOfChar[m] = c[(n & 0xF)];
      i++;
    }
    return new String(arrayOfChar);
  }
  
  public final dke c()
  {
    for (int i = 0;; i++)
    {
      Object localObject = this;
      if (i < this.b.length)
      {
        int j = this.b[i];
        if ((j >= 65) && (j <= 90))
        {
          localObject = (byte[])this.b.clone();
          localObject[i] = ((byte)(j + 32));
          i++;
          while (i < localObject.length)
          {
            j = localObject[i];
            if ((j >= 65) && (j <= 90)) {
              localObject[i] = ((byte)(j + 32));
            }
            i++;
          }
          localObject = new dke((byte[])localObject);
        }
      }
      else
      {
        return (dke)localObject;
      }
    }
  }
  
  public final byte[] d()
  {
    return (byte[])this.b.clone();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (((paramObject instanceof dke)) && (((dke)paramObject).b.length == this.b.length))
      {
        paramObject = (dke)paramObject;
        byte[] arrayOfByte = this.b;
        int i = this.b.length;
        if ((((dke)paramObject).b.length - i >= 0) && (arrayOfByte.length - i >= 0) && (dky.a(((dke)paramObject).b, 0, arrayOfByte, 0, i))) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label98;
          }
          bool = true;
          break;
        }
      }
      label98:
      bool = false;
    }
  }
  
  public int hashCode()
  {
    int i = this.d;
    if (i != 0) {}
    for (;;)
    {
      return i;
      i = Arrays.hashCode(this.b);
      this.d = i;
    }
  }
  
  public String toString()
  {
    String str;
    if (this.b.length == 0) {
      str = "ByteString[size=0]";
    }
    for (;;)
    {
      return str;
      if (this.b.length <= 16) {
        str = String.format("ByteString[size=%s data=%s]", new Object[] { Integer.valueOf(this.b.length), b() });
      } else {
        str = String.format("ByteString[size=%s md5=%s]", new Object[] { Integer.valueOf(this.b.length), b("MD5").b() });
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
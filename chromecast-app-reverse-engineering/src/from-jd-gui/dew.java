import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class dew
{
  public volatile int t = -1;
  
  public static final dew a(dew paramdew, byte[] paramArrayOfByte)
  {
    return a(paramdew, paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  private static dew a(dew paramdew, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      deo localdeo = new deo;
      localdeo.<init>(paramArrayOfByte, 0, paramInt2);
      paramdew.a(localdeo);
      localdeo.a(0);
      return paramdew;
    }
    catch (dev paramdew)
    {
      throw paramdew;
    }
    catch (IOException paramdew)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
    }
  }
  
  public static final byte[] a(dew paramdew)
  {
    byte[] arrayOfByte = new byte[paramdew.d()];
    int i = arrayOfByte.length;
    try
    {
      dep localdep = dep.a(arrayOfByte, 0, i);
      paramdew.a(localdep);
      if (localdep.a.remaining() != 0)
      {
        paramdew = new java/lang/IllegalStateException;
        paramdew.<init>("Did not write as much data as expected.");
        throw paramdew;
      }
    }
    catch (IOException paramdew)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", paramdew);
    }
    return arrayOfByte;
  }
  
  public int a()
  {
    return 0;
  }
  
  public abstract dew a(deo paramdeo);
  
  public void a(dep paramdep) {}
  
  public dew c()
  {
    return (dew)super.clone();
  }
  
  public final int d()
  {
    int i = a();
    this.t = i;
    return i;
  }
  
  public String toString()
  {
    return a.a(this);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
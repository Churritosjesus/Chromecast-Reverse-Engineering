import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class cms
{
  public volatile int n = -1;
  
  public static final cms a(cms paramcms, byte[] paramArrayOfByte)
  {
    return a(paramcms, paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  private static cms a(cms paramcms, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramArrayOfByte = cmj.a(paramArrayOfByte, 0, paramInt2);
      paramcms.a(paramArrayOfByte);
      paramArrayOfByte.a(0);
      return paramcms;
    }
    catch (cmr paramcms)
    {
      throw paramcms;
    }
    catch (IOException paramcms)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
    }
  }
  
  public static final byte[] a(cms paramcms)
  {
    byte[] arrayOfByte = new byte[paramcms.f()];
    int i = arrayOfByte.length;
    try
    {
      cmk localcmk = cmk.a(arrayOfByte, 0, i);
      paramcms.a(localcmk);
      if (localcmk.a.remaining() != 0)
      {
        paramcms = new java/lang/IllegalStateException;
        paramcms.<init>("Did not write as much data as expected.");
        throw paramcms;
      }
    }
    catch (IOException paramcms)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", paramcms);
    }
    return arrayOfByte;
  }
  
  protected int a()
  {
    return 0;
  }
  
  public abstract cms a(cmj paramcmj);
  
  public void a(cmk paramcmk) {}
  
  public cms d()
  {
    return (cms)super.clone();
  }
  
  public final int e()
  {
    if (this.n < 0) {
      f();
    }
    return this.n;
  }
  
  public final int f()
  {
    int i = a();
    this.n = i;
    return i;
  }
  
  public String toString()
  {
    return a.a(this);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import java.io.FilterInputStream;
import java.io.InputStream;

final class aeo
  extends FilterInputStream
{
  private int a = 0;
  
  aeo(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public final int read()
  {
    int i = super.read();
    if (i != -1) {
      this.a += 1;
    }
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 != -1) {
      this.a += paramInt1;
    }
    return paramInt1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aeo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
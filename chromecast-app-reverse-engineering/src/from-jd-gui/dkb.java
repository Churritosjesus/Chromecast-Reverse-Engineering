import java.io.InputStream;

final class dkb
  extends InputStream
{
  dkb(djz paramdjz) {}
  
  public final int available()
  {
    return (int)Math.min(this.a.b, 2147483647L);
  }
  
  public final void close() {}
  
  public final int read()
  {
    if (this.a.b > 0L) {}
    for (int i = this.a.g() & 0xFF;; i = -1) {
      return i;
    }
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return this.a.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final String toString()
  {
    return this.a + ".inputStream()";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
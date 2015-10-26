import java.io.IOException;
import java.io.InputStream;

final class dkr
  extends InputStream
{
  dkr(dkq paramdkq) {}
  
  public final int available()
  {
    if (this.a.c) {
      throw new IOException("closed");
    }
    return (int)Math.min(this.a.a.b, 2147483647L);
  }
  
  public final void close()
  {
    this.a.close();
  }
  
  public final int read()
  {
    if (this.a.c) {
      throw new IOException("closed");
    }
    if ((this.a.a.b == 0L) && (this.a.b.a(this.a.a, 2048L) == -1L)) {}
    for (int i = -1;; i = this.a.a.g() & 0xFF) {
      return i;
    }
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.a.c) {
      throw new IOException("closed");
    }
    dky.a(paramArrayOfByte.length, paramInt1, paramInt2);
    if ((this.a.a.b == 0L) && (this.a.b.a(this.a.a, 2048L) == -1L)) {}
    for (paramInt1 = -1;; paramInt1 = this.a.a.a(paramArrayOfByte, paramInt1, paramInt2)) {
      return paramInt1;
    }
  }
  
  public final String toString()
  {
    return this.a + ".inputStream()";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import java.io.IOException;
import java.io.OutputStream;

final class dkp
  extends OutputStream
{
  dkp(dko paramdko) {}
  
  public final void close()
  {
    this.a.close();
  }
  
  public final void flush()
  {
    if (!this.a.b) {
      this.a.flush();
    }
  }
  
  public final String toString()
  {
    return this.a + ".outputStream()";
  }
  
  public final void write(int paramInt)
  {
    if (this.a.b) {
      throw new IOException("closed");
    }
    this.a.a.b((byte)paramInt);
    this.a.r();
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.a.b) {
      throw new IOException("closed");
    }
    this.a.a.b(paramArrayOfByte, paramInt1, paramInt2);
    this.a.r();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
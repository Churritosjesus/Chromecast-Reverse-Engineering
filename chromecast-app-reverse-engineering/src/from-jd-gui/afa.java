import java.io.ByteArrayOutputStream;

public final class afa
  extends ByteArrayOutputStream
{
  private final aek a;
  
  public afa(aek paramaek, int paramInt)
  {
    this.a = paramaek;
    this.buf = this.a.a(Math.max(paramInt, 256));
  }
  
  private void a(int paramInt)
  {
    if (this.count + paramInt <= this.buf.length) {}
    for (;;)
    {
      return;
      byte[] arrayOfByte = this.a.a(this.count + paramInt << 1);
      System.arraycopy(this.buf, 0, arrayOfByte, 0, this.count);
      this.a.a(this.buf);
      this.buf = arrayOfByte;
    }
  }
  
  public final void close()
  {
    this.a.a(this.buf);
    this.buf = null;
    super.close();
  }
  
  public final void finalize()
  {
    this.a.a(this.buf);
  }
  
  public final void write(int paramInt)
  {
    try
    {
      a(1);
      super.write(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      a(paramInt2);
      super.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\afa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import java.io.IOException;

final class djw
  implements dkv
{
  djw(dju paramdju, dkv paramdkv) {}
  
  public final long a(djz paramdjz, long paramLong)
  {
    this.b.j_();
    try
    {
      paramLong = this.a.a(paramdjz, paramLong);
      this.b.a(true);
      return paramLong;
    }
    catch (IOException paramdjz)
    {
      throw this.b.a(paramdjz);
    }
    finally
    {
      this.b.a(false);
    }
  }
  
  public final dkw a()
  {
    return this.b;
  }
  
  public final void close()
  {
    try
    {
      this.a.close();
      this.b.a(true);
      return;
    }
    catch (IOException localIOException)
    {
      throw this.b.a(localIOException);
    }
    finally
    {
      this.b.a(false);
    }
  }
  
  public final String toString()
  {
    return "AsyncTimeout.source(" + this.a + ")";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
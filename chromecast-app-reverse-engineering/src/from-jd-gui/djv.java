import java.io.IOException;

final class djv
  implements dku
{
  djv(dju paramdju, dku paramdku) {}
  
  public final dkw a()
  {
    return this.b;
  }
  
  public final void a_(djz paramdjz, long paramLong)
  {
    this.b.j_();
    try
    {
      this.a.a_(paramdjz, paramLong);
      this.b.a(true);
      return;
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
  
  public final void close()
  {
    this.b.j_();
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
  
  public final void flush()
  {
    this.b.j_();
    try
    {
      this.a.flush();
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
    return "AsyncTimeout.sink(" + this.a + ")";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
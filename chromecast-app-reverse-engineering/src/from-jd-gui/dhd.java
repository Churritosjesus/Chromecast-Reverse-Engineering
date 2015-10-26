final class dhd
  extends dgy
{
  private boolean b;
  
  dhd(dgx paramdgx)
  {
    super(paramdgx, (byte)0);
  }
  
  public final long a(djz paramdjz, long paramLong)
  {
    long l = -1L;
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (this.a) {
      throw new IllegalStateException("closed");
    }
    if (this.b) {
      paramLong = l;
    }
    for (;;)
    {
      return paramLong;
      paramLong = this.c.c.a(paramdjz, paramLong);
      if (paramLong == -1L)
      {
        this.b = true;
        a(false);
        paramLong = l;
      }
    }
  }
  
  public final void close()
  {
    if (this.a) {}
    for (;;)
    {
      return;
      if (!this.b) {
        b();
      }
      this.a = true;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
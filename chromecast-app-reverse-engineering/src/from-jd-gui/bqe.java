public final class bqe
{
  private final Object a;
  private final cks b;
  
  bqe(cks paramcks, Object paramObject)
  {
    a.c(paramcks);
    this.b = paramcks;
    this.a = paramObject;
  }
  
  static bqe a(String paramString, int paramInt1, int paramInt2)
  {
    return new bqe(cks.a(paramString, Integer.valueOf(paramInt2)), Integer.valueOf(paramInt1));
  }
  
  static bqe a(String paramString, long paramLong1, long paramLong2)
  {
    return new bqe(cks.a(paramString, Long.valueOf(paramLong2)), Long.valueOf(paramLong1));
  }
  
  static bqe a(String paramString1, String paramString2, String paramString3)
  {
    return new bqe(cks.a(paramString1, paramString3), paramString2);
  }
  
  static bqe a(String paramString, boolean paramBoolean)
  {
    return new bqe(cks.a(paramString, paramBoolean), Boolean.valueOf(paramBoolean));
  }
  
  public final Object a()
  {
    if ((byk.a) && (cks.b())) {}
    for (Object localObject = this.b.d();; localObject = this.a) {
      return localObject;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
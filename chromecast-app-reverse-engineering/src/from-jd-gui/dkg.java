public class dkg
  implements dkv
{
  private final dkv a;
  
  public dkg(dkv paramdkv)
  {
    if (paramdkv == null) {
      throw new IllegalArgumentException("delegate == null");
    }
    this.a = paramdkv;
  }
  
  public long a(djz paramdjz, long paramLong)
  {
    return this.a.a(paramdjz, paramLong);
  }
  
  public final dkw a()
  {
    return this.a.a();
  }
  
  public void close()
  {
    this.a.close();
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + "(" + this.a.toString() + ")";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
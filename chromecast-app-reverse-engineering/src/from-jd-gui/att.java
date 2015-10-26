import android.os.SystemClock;

public abstract class att
  extends atb
{
  private final byte[] n;
  
  private att(String paramString1, int paramInt, String paramString2, byte[] paramArrayOfByte, adz paramadz)
  {
    super(paramInt, paramString2, paramadz);
    this.n = paramArrayOfByte;
    this.k = paramString1;
    SystemClock.elapsedRealtime();
  }
  
  public att(String paramString1, String paramString2, adz paramadz)
  {
    this(paramString1, 0, paramString2, null, paramadz);
  }
  
  public att(String paramString1, String paramString2, byte[] paramArrayOfByte, adz paramadz)
  {
    this(paramString1, 1, paramString2, paramArrayOfByte, paramadz);
  }
  
  protected final ady a(adp paramadp)
  {
    return ady.a(paramadp.b, a.a(paramadp));
  }
  
  public final String c()
  {
    return "application/protobuf";
  }
  
  public final byte[] d()
  {
    return this.n;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\att.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.os.SystemClock;

public final class apd
{
  final Integer a;
  public final long b;
  public Long c;
  Integer d;
  Long e;
  String f;
  ddc g;
  public aph h;
  Integer i;
  
  public apd(int paramInt)
  {
    this(paramInt, null);
  }
  
  public apd(int paramInt, Integer paramInteger)
  {
    this.a = Integer.valueOf(paramInt);
    this.b = SystemClock.elapsedRealtime();
    this.d = paramInteger;
  }
  
  public final apd a(int paramInt)
  {
    this.d = Integer.valueOf(paramInt);
    return this;
  }
  
  public final apd a(long paramLong)
  {
    this.e = Long.valueOf(paramLong);
    return this;
  }
  
  public final apd b(long paramLong)
  {
    this.c = Long.valueOf(paramLong);
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\apd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
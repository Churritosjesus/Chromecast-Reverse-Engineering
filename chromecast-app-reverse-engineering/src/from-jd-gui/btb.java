import com.google.android.gms.cast.CastDevice;

public final class btb
{
  CastDevice a;
  btc b;
  private int c;
  
  public btb(CastDevice paramCastDevice, btc parambtc)
  {
    a.f(paramCastDevice, "CastDevice parameter cannot be null");
    a.f(parambtc, "CastListener parameter cannot be null");
    this.a = paramCastDevice;
    this.b = parambtc;
    this.c = 0;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\btb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;

public final class cjp
  extends cjk
{
  protected cjp(cjo paramcjo)
  {
    super(paramcjo.a);
  }
  
  public final void a(int paramInt)
  {
    this.a.a(new cjq(this.a, null, new Status(paramInt)));
  }
  
  public final void a(CastDevice paramCastDevice)
  {
    this.a.a(new cjq(this.a, paramCastDevice, new Status(0)));
  }
  
  public final void b()
  {
    this.a.a(new cjq(this.a, null, new Status(2005)));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cjp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
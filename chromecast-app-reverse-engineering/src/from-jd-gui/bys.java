import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

public final class bys
  extends bzj
{
  private byo a;
  
  public bys(byo parambyo)
  {
    this.a = parambyo;
  }
  
  public final void a(int paramInt, Bundle paramBundle)
  {
    a.f(this.a, "onAccountValidationComplete can be called only once per call to validateAccount");
    byo localbyo = this.a;
    localbyo.i.sendMessage(localbyo.i.obtainMessage(5, new byw(localbyo, paramInt, paramBundle)));
    this.a = null;
  }
  
  public final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    a.f(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
    this.a.a(paramInt, paramIBinder, paramBundle);
    this.a = null;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class byp
  extends byr
{
  private int a;
  private Bundle b;
  
  protected byp(byo parambyo, int paramInt, Bundle paramBundle)
  {
    super(parambyo, Boolean.valueOf(true));
    this.a = paramInt;
    this.b = paramBundle;
  }
  
  protected abstract void a(ConnectionResult paramConnectionResult);
  
  protected abstract boolean a();
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
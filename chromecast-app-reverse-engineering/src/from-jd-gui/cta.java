import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;

public abstract interface cta
  extends IInterface
{
  public abstract void a(ConnectionResult paramConnectionResult, AuthAccountResult paramAuthAccountResult);
  
  public abstract void a(Status paramStatus);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
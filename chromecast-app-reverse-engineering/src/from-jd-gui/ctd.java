import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;

public abstract interface ctd
  extends IInterface
{
  public abstract void a(int paramInt);
  
  public abstract void a(int paramInt, Account paramAccount, cta paramcta);
  
  public abstract void a(bzf parambzf, int paramInt, boolean paramBoolean);
  
  public abstract void a(AuthAccountRequest paramAuthAccountRequest, cta paramcta);
  
  public abstract void a(ResolveAccountRequest paramResolveAccountRequest, bzo parambzo);
  
  public abstract void a(CheckServerAuthResult paramCheckServerAuthResult);
  
  public abstract void a(boolean paramBoolean);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ctd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
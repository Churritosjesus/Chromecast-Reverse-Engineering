import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract interface clm
  extends IInterface
{
  public abstract Bundle a(Account paramAccount, String paramString, Bundle paramBundle);
  
  public abstract Bundle a(String paramString, Bundle paramBundle);
  
  public abstract Bundle a(String paramString1, String paramString2, Bundle paramBundle);
  
  public abstract AccountChangeEventsResponse a(AccountChangeEventsRequest paramAccountChangeEventsRequest);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\clm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
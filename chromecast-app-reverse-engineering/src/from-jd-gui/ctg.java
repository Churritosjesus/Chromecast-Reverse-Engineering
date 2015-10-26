import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class ctg
  extends byo
  implements cls
{
  private final byl a;
  private final clt b;
  private Integer c;
  private final ExecutorService d;
  
  public ctg(Context paramContext, Looper paramLooper, byl parambyl, clt paramclt, bwg parambwg, bwh parambwh, ExecutorService paramExecutorService)
  {
    super(paramContext, paramLooper, 44, parambwg, parambwh, parambyl);
    this.a = parambyl;
    this.b = paramclt;
    this.c = parambyl.h;
    this.d = paramExecutorService;
  }
  
  public final void a(bzf parambzf, Set paramSet, cta paramcta)
  {
    a.f(paramcta, "Expecting a valid ISignInCallbacks");
    try
    {
      ctd localctd = (ctd)o();
      AuthAccountRequest localAuthAccountRequest = new com/google/android/gms/common/internal/AuthAccountRequest;
      localAuthAccountRequest.<init>(parambzf, paramSet);
      localctd.a(localAuthAccountRequest, paramcta);
      return;
    }
    catch (RemoteException parambzf)
    {
      for (;;)
      {
        Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        try
        {
          paramSet = new com/google/android/gms/common/ConnectionResult;
          paramSet.<init>(8, null);
          parambzf = new com/google/android/gms/signin/internal/AuthAccountResult;
          parambzf.<init>();
          paramcta.a(paramSet, parambzf);
        }
        catch (RemoteException parambzf)
        {
          Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
      }
    }
  }
  
  public final void a(bzf parambzf, boolean paramBoolean)
  {
    try
    {
      ((ctd)o()).a(parambzf, this.c.intValue(), paramBoolean);
      return;
    }
    catch (RemoteException parambzf)
    {
      for (;;)
      {
        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
      }
    }
  }
  
  public final void a(bzo parambzo)
  {
    a.f(parambzo, "Expecting a valid IResolveAccountCallbacks");
    for (;;)
    {
      try
      {
        localObject = this.a;
        if (((byl)localObject).a != null)
        {
          localObject = ((byl)localObject).a;
          ctd localctd = (ctd)o();
          ResolveAccountRequest localResolveAccountRequest = new com/google/android/gms/common/internal/ResolveAccountRequest;
          localResolveAccountRequest.<init>((Account)localObject, this.c.intValue());
          localctd.a(localResolveAccountRequest, parambzo);
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject;
        Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
        try
        {
          ResolveAccountResponse localResolveAccountResponse = new com/google/android/gms/common/internal/ResolveAccountResponse;
          localResolveAccountResponse.<init>(8);
          parambzo.a(localResolveAccountResponse);
        }
        catch (RemoteException parambzo)
        {
          Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
        continue;
      }
      localObject = new Account("<<default account>>", "com.google");
    }
  }
  
  protected final String c()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  protected final String d()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  protected final Bundle e()
  {
    Object localObject = this.b;
    Integer localInteger = this.a.h;
    ExecutorService localExecutorService = this.d;
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((clt)localObject).b);
    localBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((clt)localObject).c);
    localBundle.putString("com.google.android.gms.signin.internal.serverClientId", ((clt)localObject).d);
    if (((clt)localObject).e != null) {
      localBundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper(new cth((clt)localObject, localExecutorService).asBinder()));
    }
    if (localInteger != null) {
      localBundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", localInteger.intValue());
    }
    localObject = this.a.e;
    if (!this.g.getPackageName().equals(localObject)) {
      localBundle.putString("com.google.android.gms.signin.internal.realClientPackageName", this.a.e);
    }
    return localBundle;
  }
  
  public final void i_()
  {
    try
    {
      ((ctd)o()).a(this.c.intValue());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ctg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

public final class byh
  extends bzg
{
  private int a;
  
  public static Account a(bzf parambzf)
  {
    localObject2 = null;
    localObject1 = localObject2;
    if (parambzf != null) {
      l = Binder.clearCallingIdentity();
    }
    try
    {
      localObject1 = parambzf.a();
    }
    catch (RemoteException parambzf)
    {
      for (;;)
      {
        Log.w("AccountAccessor", "Remote account accessor probably died");
        Binder.restoreCallingIdentity(l);
        localObject1 = localObject2;
      }
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
    return (Account)localObject1;
  }
  
  public final Account a()
  {
    int i = Binder.getCallingUid();
    if (i == this.a) {}
    for (;;)
    {
      return null;
      if (!bvt.a(null, i)) {
        break;
      }
      this.a = i;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    for (boolean bool = true;; bool = false)
    {
      return bool;
      if ((paramObject instanceof byh)) {
        break;
      }
    }
    throw new NullPointerException();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
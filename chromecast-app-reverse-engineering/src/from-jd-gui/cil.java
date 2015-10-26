import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.accounts.api.AccountData;

public final class cil
{
  private static cio a = new cio();
  private static final cin b = new cin(a);
  
  public static boolean a(Context paramContext, Intent paramIntent, AccountData paramAccountData)
  {
    boolean bool2 = false;
    cin localcin = b;
    a.f(paramContext, "Context must not be null.");
    a.f(paramIntent, "Intent must not be null.");
    a.f(paramAccountData, "Account data must not be null.");
    Object localObject = paramIntent.getComponent();
    if (localObject != null) {}
    for (localObject = ((ComponentName)localObject).getPackageName();; localObject = paramIntent.getPackage())
    {
      boolean bool1 = bool2;
      if (localObject != null)
      {
        bool1 = bool2;
        if (localcin.a.a(paramContext.getPackageManager(), (String)localObject))
        {
          paramContext = Parcel.obtain();
          paramAccountData.writeToParcel(paramContext, 0);
          paramAccountData = paramContext.marshall();
          paramContext.recycle();
          paramIntent.putExtra("com.google.android.gms.accounts.ACCOUNT_DATA", paramAccountData);
          bool1 = true;
        }
      }
      return bool1;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
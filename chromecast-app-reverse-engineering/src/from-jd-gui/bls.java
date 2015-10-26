import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.IntentSender.SendIntentException;
import android.content.res.Resources.NotFoundException;
import com.google.android.gms.common.ConnectionResult;

public final class bls
{
  private static final blp a = new blp("PlayServicesUtil");
  
  public static void a(m paramm, int paramInt, blu paramblu)
  {
    paramblu = new blt(paramblu);
    try
    {
      Dialog localDialog = bvt.a(paramInt, paramm, 9001);
      if (localDialog != null)
      {
        localDialog.setOnDismissListener(paramblu);
        localDialog.show();
        return;
      }
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      for (;;)
      {
        a.a("Could not show Google Play services error dialog for result code %d", new Object[] { Integer.valueOf(paramInt) });
        paramm = new AlertDialog.Builder(paramm).setMessage(b.cL).setPositiveButton(b.I, null).create();
        paramm.setOnDismissListener(paramblu);
        paramm.show();
      }
    }
  }
  
  public static void a(m paramm, ConnectionResult paramConnectionResult, blu paramblu)
  {
    if (paramConnectionResult.a()) {}
    for (;;)
    {
      try
      {
        paramConnectionResult.a(paramm, 9001);
        return;
      }
      catch (IntentSender.SendIntentException paramm)
      {
        a.a(paramm, "Failed to resolve Google Play Services connection failure", new Object[0]);
        continue;
      }
      a(paramm, paramConnectionResult.c, paramblu);
    }
  }
  
  public static boolean a(Context paramContext)
  {
    return bvt.a(paramContext.getPackageManager(), paramContext.getPackageName());
  }
  
  public static String b(Context paramContext)
  {
    paramContext = AccountManager.get(paramContext).getAccountsByType("com.google");
    if (paramContext.length > 0) {}
    for (paramContext = paramContext[0].name;; paramContext = null) {
      return paramContext;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
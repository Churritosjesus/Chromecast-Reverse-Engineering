import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.gms.identity.accounts.api.AccountData;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class asr
{
  static final long a = TimeUnit.SECONDS.toMillis(5L);
  
  public static aec a(Context paramContext)
  {
    return new aec(blf.X(paramContext), 1, 1.0F);
  }
  
  public static Intent a(String paramString, Context paramContext)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    localIntent.addFlags(268435456);
    String str = SetupApplication.a().e;
    if (!TextUtils.isEmpty(str))
    {
      Iterator localIterator = paramContext.getPackageManager().queryIntentActivities(localIntent, 0).iterator();
      while (localIterator.hasNext())
      {
        paramString = ((ResolveInfo)localIterator.next()).activityInfo.packageName;
        if (paramString.contains("com.google.android.apps.plus"))
        {
          localIntent.setPackage(paramString);
          cil.a(paramContext, localIntent, AccountData.a(str));
        }
      }
    }
    return localIntent;
  }
  
  public static SwitchCompat a(MenuItem paramMenuItem, CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener, Boolean paramBoolean)
  {
    paramMenuItem = (SwitchCompat)paramMenuItem.getActionView();
    if (paramBoolean == Boolean.TRUE) {}
    for (boolean bool = true;; bool = false)
    {
      paramMenuItem.setChecked(bool);
      paramMenuItem.setPadding(0, 0, paramMenuItem.getContext().getResources().getDimensionPixelSize(a.dy), 0);
      paramMenuItem.setOnCheckedChangeListener(paramOnCheckedChangeListener);
      return paramMenuItem;
    }
  }
  
  public static dbt a(aow paramaow)
  {
    return a(paramaow.j, paramaow.g(), paramaow.k);
  }
  
  public static dbt a(dbr paramdbr, String paramString)
  {
    return a(paramdbr.b, paramdbr.c, paramString);
  }
  
  public static dbt a(String paramString1, String paramString2, String paramString3)
  {
    dbt localdbt = new dbt();
    localdbt.a = paramString1;
    localdbt.b = paramString2;
    if (!TextUtils.isEmpty(paramString3)) {
      localdbt.c = paramString3;
    }
    return localdbt;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    paramString1 = String.valueOf(paramString1);
    paramString2 = String.valueOf(paramString2);
    if (paramString2.length() != 0) {}
    for (paramString1 = paramString1.concat(paramString2);; paramString1 = new String(paramString1)) {
      return paramString1;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\asr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
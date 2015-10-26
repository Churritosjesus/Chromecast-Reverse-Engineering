import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;

public class au
{
  public static Drawable a(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (paramContext = paramContext.getDrawable(paramInt);; paramContext = paramContext.getResources().getDrawable(paramInt)) {
      return paramContext;
    }
  }
  
  public Intent a(Activity paramActivity)
  {
    Object localObject = null;
    String str = at.b(paramActivity);
    if (str == null) {
      paramActivity = (Activity)localObject;
    }
    for (;;)
    {
      return paramActivity;
      ComponentName localComponentName = new ComponentName(paramActivity, str);
      try
      {
        if (at.b(paramActivity, localComponentName) == null)
        {
          paramActivity = be.a(localComponentName);
        }
        else
        {
          paramActivity = new android/content/Intent;
          paramActivity.<init>();
          paramActivity = paramActivity.setComponent(localComponentName);
        }
      }
      catch (PackageManager.NameNotFoundException paramActivity)
      {
        Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + str + "' in manifest");
        paramActivity = (Activity)localObject;
      }
    }
  }
  
  public String a(Context paramContext, ActivityInfo paramActivityInfo)
  {
    if (paramActivityInfo.metaData == null) {
      paramActivityInfo = null;
    }
    for (;;)
    {
      return paramActivityInfo;
      String str = paramActivityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
      if (str == null)
      {
        paramActivityInfo = null;
      }
      else
      {
        paramActivityInfo = str;
        if (str.charAt(0) == '.') {
          paramActivityInfo = paramContext.getPackageName() + str;
        }
      }
    }
  }
  
  public boolean a(Activity paramActivity, Intent paramIntent)
  {
    paramActivity = paramActivity.getIntent().getAction();
    if ((paramActivity != null) && (!paramActivity.equals("android.intent.action.MAIN"))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void b(Activity paramActivity, Intent paramIntent)
  {
    paramIntent.addFlags(67108864);
    paramActivity.startActivity(paramIntent);
    paramActivity.finish();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import java.util.Iterator;
import java.util.List;

public final class bvt
{
  private static boolean a = false;
  private static boolean b = false;
  private static int c = -1;
  private static final Object d = new Object();
  private static String e = null;
  private static Integer f = null;
  
  @Deprecated
  public static int a(Context paramContext)
  {
    i = 9;
    localObject3 = paramContext.getPackageManager();
    if (!byk.a) {}
    for (;;)
    {
      try
      {
        paramContext.getResources().getString(a.hB);
        if ((byk.a) || ("com.google.android.gms".equals(paramContext.getPackageName()))) {
          break label262;
        }
      }
      catch (Throwable localThrowable)
      {
        synchronized (d)
        {
          if (e == null)
          {
            e = paramContext.getPackageName();
            try
            {
              localObject4 = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
              if (localObject4 == null) {
                continue;
              }
              f = Integer.valueOf(((Bundle)localObject4).getInt("com.google.android.gms.version"));
            }
            catch (PackageManager.NameNotFoundException localNameNotFoundException1)
            {
              Object localObject4;
              Log.wtf("GooglePlayServicesUtil", "This should never happen.", localNameNotFoundException1);
              continue;
            }
            localObject4 = f;
            if (localObject4 != null) {
              break;
            }
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            localThrowable = localThrowable;
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
            continue;
            f = null;
          }
        }
      }
      if (!e.equals(paramContext.getPackageName()))
      {
        localObject5 = new java/lang/IllegalArgumentException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '");
        ((IllegalArgumentException)localObject5).<init>(e + "' and this call used package '" + paramContext.getPackageName() + "'.");
        throw ((Throwable)localObject5);
      }
    }
    if (((Integer)localObject5).intValue() != 7327000) {
      throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 7327000 but found " + localObject5 + ".  You must have the following declaration within the <application> element: " + "    <meta-data android:name=\"com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
    }
    try
    {
      label262:
      localObject2 = ((PackageManager)localObject3).getPackageInfo("com.google.android.gms", 64);
      bvu.a();
      if ((!cab.b(((PackageInfo)localObject2).versionCode)) && (!cab.a(paramContext))) {
        break label328;
      }
      if (bvu.a((PackageInfo)localObject2, cdr.a) != null) {
        break label434;
      }
      Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        Object localObject2;
        Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
        i = 1;
        continue;
        try
        {
          localObject5 = bvu.a(((PackageManager)localObject3).getPackageInfo("com.android.vending", 64), cdr.a);
          if (localObject5 == null) {
            Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException2)
        {
          if (a(paramContext, "com.android.vending"))
          {
            Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
            if (bvu.a((PackageInfo)localObject2, cdr.a) != null) {
              break label434;
            }
            Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
            continue;
            if (bvu.a((PackageInfo)localObject2, new cah[] { localNameNotFoundException2 }) != null) {
              break label434;
            }
            Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
            continue;
          }
          Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
        }
        continue;
        i = cab.a(7327000);
        if (cab.a(((PackageInfo)localObject2).versionCode) < i)
        {
          Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires 7327000 but found " + ((PackageInfo)localObject2).versionCode);
          i = 2;
        }
        else
        {
          localObject2 = ((PackageInfo)localObject2).applicationInfo;
          paramContext = (Context)localObject2;
          if (localObject2 == null) {}
          try
          {
            paramContext = ((PackageManager)localObject3).getApplicationInfo("com.google.android.gms", 0);
            if (paramContext.enabled) {
              break label535;
            }
            i = 3;
          }
          catch (PackageManager.NameNotFoundException paramContext)
          {
            Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
            paramContext.printStackTrace();
            i = 1;
          }
          continue;
          i = 0;
        }
      }
    }
    return i;
  }
  
  @Deprecated
  public static Dialog a(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return b(paramInt1, paramActivity, null, 9001, null);
  }
  
  @Deprecated
  public static Intent a(int paramInt)
  {
    Intent localIntent;
    switch (paramInt)
    {
    default: 
      localIntent = null;
    }
    for (;;)
    {
      return localIntent;
      localIntent = bze.b("com.google.android.gms");
      continue;
      localIntent = bze.a();
      continue;
      localIntent = bze.a("com.google.android.gms");
    }
  }
  
  public static boolean a(int paramInt1, Activity paramActivity, j paramj, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    paramj = b(paramInt1, paramActivity, paramj, 2, paramOnCancelListener);
    boolean bool;
    if (paramj == null)
    {
      bool = false;
      return bool;
    }
    if ((paramActivity instanceof m))
    {
      paramActivity = ((m)paramActivity).b;
      bvv.a(paramj, paramOnCancelListener).a(paramActivity, "GooglePlayServicesErrorDialog");
    }
    for (;;)
    {
      bool = true;
      break;
      if (!a.a(11)) {
        break label83;
      }
      paramActivity = paramActivity.getFragmentManager();
      bvp.a(paramj, paramOnCancelListener).show(paramActivity, "GooglePlayServicesErrorDialog");
    }
    label83:
    throw new RuntimeException("This Activity does not support Fragments.");
  }
  
  public static boolean a(Context paramContext, int paramInt)
  {
    if ((a(paramContext, paramInt, "com.google.android.gms")) && (a(paramContext.getPackageManager(), "com.google.android.gms"))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static boolean a(Context paramContext, int paramInt, String paramString)
  {
    bool2 = false;
    if (a.a(19)) {
      paramContext = (AppOpsManager)paramContext.getSystemService("appops");
    }
    do
    {
      try
      {
        paramContext.checkPackage(paramInt, paramString);
        bool1 = true;
      }
      catch (SecurityException paramContext)
      {
        for (;;)
        {
          boolean bool1 = bool2;
        }
      }
      return bool1;
      paramContext = paramContext.getPackageManager().getPackagesForUid(paramInt);
      bool1 = bool2;
    } while (paramContext == null);
    for (paramInt = 0;; paramInt++)
    {
      bool1 = bool2;
      if (paramInt >= paramContext.length) {
        break;
      }
      if (paramString.equals(paramContext[paramInt]))
      {
        bool1 = true;
        break;
      }
    }
  }
  
  private static boolean a(Context paramContext, String paramString)
  {
    if (a.a(21))
    {
      paramContext = paramContext.getPackageManager().getPackageInstaller().getAllSessions().iterator();
      do
      {
        if (!paramContext.hasNext()) {
          break;
        }
      } while (!paramString.equals(((PackageInstaller.SessionInfo)paramContext.next()).getAppPackageName()));
    }
    for (boolean bool = true;; bool = false) {
      for (;;)
      {
        return bool;
        paramContext = paramContext.getPackageManager();
        try
        {
          bool = paramContext.getApplicationInfo(paramString, 8192).enabled;
          if (bool) {
            bool = true;
          }
        }
        catch (PackageManager.NameNotFoundException paramContext) {}
      }
    }
  }
  
  public static boolean a(PackageManager paramPackageManager)
  {
    if ((b(paramPackageManager)) || (!"user".equals(Build.TYPE))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  @Deprecated
  public static boolean a(PackageManager paramPackageManager, String paramString)
  {
    return bvu.a().a(paramPackageManager, paramString);
  }
  
  private static Dialog b(int paramInt1, Activity paramActivity, j paramj, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    int k = 1;
    Object localObject3 = null;
    if (paramInt1 == 0)
    {
      paramActivity = null;
      return paramActivity;
    }
    int i = paramInt1;
    if (cab.a(paramActivity))
    {
      i = paramInt1;
      if (paramInt1 == 2) {
        i = 42;
      }
    }
    if (a.a(14))
    {
      localObject1 = new TypedValue();
      paramActivity.getTheme().resolveAttribute(16843529, (TypedValue)localObject1, true);
      if (!"Theme.Dialog.Alert".equals(paramActivity.getResources().getResourceEntryName(((TypedValue)localObject1).resourceId))) {}
    }
    for (Object localObject1 = new AlertDialog.Builder(paramActivity, 5);; localObject1 = null)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new AlertDialog.Builder(paramActivity);
      }
      localObject1 = paramActivity.getResources();
      switch (i)
      {
      default: 
        localObject1 = ((Resources)localObject1).getString(a.hB);
        label226:
        ((AlertDialog.Builder)localObject2).setMessage((CharSequence)localObject1);
        if (paramOnCancelListener != null) {
          ((AlertDialog.Builder)localObject2).setOnCancelListener(paramOnCancelListener);
        }
        paramOnCancelListener = a(i);
        if (paramj == null)
        {
          paramOnCancelListener = new bym(paramActivity, paramOnCancelListener, paramInt2);
          label271:
          paramj = paramActivity.getResources();
          switch (i)
          {
          default: 
            paramj = paramj.getString(17039370);
            label336:
            if (paramj != null) {
              ((AlertDialog.Builder)localObject2).setPositiveButton(paramj, paramOnCancelListener);
            }
            paramj = paramActivity.getResources();
            paramActivity = (Activity)localObject3;
            switch (i)
            {
            default: 
              Log.e("GooglePlayServicesUtil", "Unexpected error code " + i);
              paramActivity = (Activity)localObject3;
            }
            break;
          }
        }
        break;
      }
      for (;;)
      {
        if (paramActivity != null) {
          ((AlertDialog.Builder)localObject2).setTitle(paramActivity);
        }
        paramActivity = ((AlertDialog.Builder)localObject2).create();
        break;
        Object localObject4 = paramActivity.getResources();
        if (localObject4 != null) {
          if ((((Resources)localObject4).getConfiguration().screenLayout & 0xF) > 3)
          {
            paramInt1 = 1;
            label563:
            if (a.a(11))
            {
              j = k;
              if (paramInt1 != 0) {}
            }
            else
            {
              localObject4 = ((Resources)localObject4).getConfiguration();
              if (!a.a(13)) {
                break label655;
              }
              if (((((Configuration)localObject4).screenLayout & 0xF) > 3) || (((Configuration)localObject4).smallestScreenWidthDp < 600)) {
                break label650;
              }
              paramInt1 = 1;
              label619:
              if (paramInt1 == 0) {
                break label660;
              }
            }
          }
        }
        label650:
        label655:
        label660:
        for (int j = k;; j = 0)
        {
          if (j == 0) {
            break label666;
          }
          localObject1 = ((Resources)localObject1).getString(a.ht);
          break;
          paramInt1 = 0;
          break label563;
          paramInt1 = 0;
          break label619;
          paramInt1 = 0;
          break label619;
        }
        label666:
        localObject1 = ((Resources)localObject1).getString(a.hs);
        break label226;
        localObject1 = ((Resources)localObject1).getString(a.hp);
        break label226;
        localObject1 = ((Resources)localObject1).getString(a.hF);
        break label226;
        localObject1 = ((Resources)localObject1).getString(a.hm);
        break label226;
        localObject1 = ((Resources)localObject1).getString(a.hC);
        break label226;
        localObject1 = ((Resources)localObject1).getString(a.hx);
        break label226;
        localObject1 = ((Resources)localObject1).getString(a.hv);
        break label226;
        localObject1 = ((Resources)localObject1).getString(a.hH);
        break label226;
        localObject1 = ((Resources)localObject1).getString(a.hz);
        break label226;
        paramOnCancelListener = new bym(paramj, paramOnCancelListener, paramInt2);
        break label271;
        paramj = paramj.getString(a.hr);
        break label336;
        paramj = paramj.getString(a.ho);
        break label336;
        paramj = paramj.getString(a.hE);
        break label336;
        paramActivity = paramj.getString(a.hu);
        continue;
        paramActivity = paramj.getString(a.hq);
        continue;
        paramActivity = paramj.getString(a.hG);
        continue;
        paramActivity = paramj.getString(a.hn);
        continue;
        Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
        paramActivity = paramj.getString(a.hD);
        continue;
        Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
        paramActivity = paramj.getString(a.hy);
        continue;
        Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
        paramActivity = (Activity)localObject3;
        continue;
        Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
        paramActivity = (Activity)localObject3;
        continue;
        Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
        paramActivity = paramj.getString(a.hw);
        continue;
        Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
        paramActivity = (Activity)localObject3;
        continue;
        Log.e("GooglePlayServicesUtil", "One of the API components you attempted to connect to is not available.");
        paramActivity = (Activity)localObject3;
        continue;
        Log.e("GooglePlayServicesUtil", "The specified account could not be signed in.");
        paramActivity = paramj.getString(a.hA);
      }
    }
  }
  
  @Deprecated
  public static void b(Context paramContext)
  {
    int i = a(paramContext);
    if (i != 0)
    {
      paramContext = a(i);
      Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + i);
      if (paramContext == null) {
        throw new bvr(i);
      }
      throw new bvs(i, "Google Play Services not available", paramContext);
    }
  }
  
  @Deprecated
  public static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  @Deprecated
  public static boolean b(Context paramContext, int paramInt)
  {
    boolean bool = true;
    if (paramInt == 18) {}
    for (;;)
    {
      return bool;
      if (paramInt == 1) {
        bool = a(paramContext, "com.google.android.gms");
      } else {
        bool = false;
      }
    }
  }
  
  private static boolean b(PackageManager paramPackageManager)
  {
    for (boolean bool = true;; bool = false) {
      synchronized (d)
      {
        int i = c;
        if (i == -1) {}
        try
        {
          paramPackageManager = paramPackageManager.getPackageInfo("com.google.android.gms", 64);
          bvu.a();
          if (bvu.a(paramPackageManager, new cah[] { cag.a[1] }) != null) {}
          for (c = 1; c != 0; c = 0) {
            return bool;
          }
        }
        catch (PackageManager.NameNotFoundException paramPackageManager)
        {
          for (;;)
          {
            c = 0;
          }
        }
      }
    }
  }
  
  @Deprecated
  public static void c(Context paramContext)
  {
    try
    {
      ((NotificationManager)paramContext.getSystemService("notification")).cancel(10436);
      return;
    }
    catch (SecurityException paramContext)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookActivity;
import java.util.Collection;
import java.util.Iterator;

public final class ajp
{
  private static final String a = ajp.class.getName();
  
  public static void a()
  {
    if (!Looper.getMainLooper().equals(Looper.myLooper())) {
      throw new afq("This method should be called from the UI thread");
    }
  }
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    a(paramContext, "context");
    if (paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
      Log.w(a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
    }
  }
  
  public static void a(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      throw new NullPointerException(String.valueOf(paramString).length() + 26 + "Argument '" + paramString + "' cannot be null");
    }
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (aji.a(paramString1)) {
      throw new IllegalArgumentException(String.valueOf(paramString2).length() + 35 + "Argument '" + paramString2 + "' cannot be null or empty");
    }
  }
  
  public static void a(Collection paramCollection, String paramString)
  {
    a(paramCollection, paramString);
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      if (localIterator.next() == null) {
        throw new NullPointerException(String.valueOf(paramString).length() + 39 + "Container '" + paramString + "' cannot contain null values");
      }
    }
    if (paramCollection.isEmpty()) {
      throw new IllegalArgumentException(String.valueOf(paramString).length() + 28 + "Container '" + paramString + "' cannot be empty");
    }
  }
  
  public static void b()
  {
    if (!afv.a()) {
      throw new afy("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
    }
  }
  
  public static void b(Context paramContext, boolean paramBoolean)
  {
    a(paramContext, "context");
    PackageManager localPackageManager = paramContext.getPackageManager();
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (localPackageManager != null) {
      paramContext = new ComponentName(paramContext, FacebookActivity.class);
    }
    try
    {
      localObject1 = localPackageManager.getActivityInfo(paramContext, 1);
      if (localObject1 == null) {
        Log.w(a, "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
      }
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        localObject1 = localObject2;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ajp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.util.Set;

public final class bvu
{
  private static final bvu a = new bvu();
  
  public static bvu a()
  {
    return a;
  }
  
  static cah a(PackageInfo paramPackageInfo, cah... paramVarArgs)
  {
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      paramPackageInfo = null;
    }
    for (;;)
    {
      return paramPackageInfo;
      paramPackageInfo = new cdi(paramPackageInfo.signatures[0].toByteArray());
      for (int i = 0;; i++)
      {
        if (i >= paramVarArgs.length) {
          break label69;
        }
        if (paramVarArgs[i].equals(paramPackageInfo))
        {
          paramPackageInfo = paramVarArgs[i];
          break;
        }
      }
      label69:
      if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
        new StringBuilder("Signature not valid.  Found: \n").append(Base64.encodeToString(paramPackageInfo.a(), 0));
      }
      paramPackageInfo = null;
    }
  }
  
  private static boolean a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      paramBoolean = false;
    }
    for (;;)
    {
      return paramBoolean;
      cdi localcdi = new cdi(paramPackageInfo.signatures[0].toByteArray());
      if (paramBoolean) {}
      for (paramPackageInfo = cag.a();; paramPackageInfo = cag.b())
      {
        if (!paramPackageInfo.contains(localcdi)) {
          break label68;
        }
        paramBoolean = true;
        break;
      }
      label68:
      if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
        new StringBuilder("Signature not valid.  Found: \n").append(Base64.encodeToString(localcdi.a(), 0));
      }
      paramBoolean = false;
    }
  }
  
  public final boolean a(PackageManager paramPackageManager, String paramString)
  {
    bool2 = false;
    try
    {
      localPackageInfo = paramPackageManager.getPackageInfo(paramString, 64);
      if (localPackageInfo != null) {
        break label62;
      }
      bool1 = bool2;
    }
    catch (PackageManager.NameNotFoundException paramPackageManager)
    {
      for (;;)
      {
        PackageInfo localPackageInfo;
        boolean bool1 = bool2;
        if (Log.isLoggable("GoogleSignatureVerifier", 3))
        {
          new StringBuilder("Package manager can't find package ").append(paramString).append(", defaulting to false");
          bool1 = bool2;
          continue;
          if (bvt.a(paramPackageManager))
          {
            bool1 = a(localPackageInfo, true);
          }
          else
          {
            bool2 = a(localPackageInfo, false);
            bool1 = bool2;
            if (!bool2)
            {
              bool1 = bool2;
              if (a(localPackageInfo, true))
              {
                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                bool1 = bool2;
              }
            }
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
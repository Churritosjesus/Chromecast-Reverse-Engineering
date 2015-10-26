import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import java.util.TreeSet;

abstract class ajb
{
  private static final HashSet b;
  TreeSet a;
  
  static
  {
    HashSet localHashSet = new HashSet();
    localHashSet.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
    localHashSet.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
    localHashSet.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
    b = localHashSet;
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    boolean bool2 = true;
    String str = Build.BRAND;
    int i = paramContext.getApplicationInfo().flags;
    if ((str.startsWith("generic")) && ((i & 0x2) != 0)) {}
    label102:
    for (boolean bool1 = bool2;; bool1 = false) {
      for (;;)
      {
        return bool1;
        try
        {
          paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
          paramContext = paramContext.signatures;
          int j = paramContext.length;
          for (i = 0;; i++)
          {
            if (i >= j) {
              break label102;
            }
            paramString = aji.a(paramContext[i].toByteArray());
            bool1 = bool2;
            if (b.contains(paramString)) {
              break;
            }
          }
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          bool1 = false;
        }
      }
    }
  }
  
  protected abstract String a();
  
  void a(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    try
    {
      if (this.a == null) {
        this.a = aix.a(this);
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ajb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
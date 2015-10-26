import android.content.pm.PackageManager;

public class cio
{
  public boolean a(PackageManager paramPackageManager, String paramString)
  {
    a.f(paramPackageManager, "Package manager must not be null.");
    a.a(paramString, "Package name must not be empty.");
    return bvt.a(paramPackageManager, paramString);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
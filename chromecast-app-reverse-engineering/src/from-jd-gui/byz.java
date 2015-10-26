import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class byz
{
  private static final Object a = new Object();
  private static byz b;
  
  public static byz a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null)
      {
        bza localbza = new bza;
        localbza.<init>(paramContext.getApplicationContext());
        b = localbza;
      }
      return b;
    }
  }
  
  public abstract boolean a(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString);
  
  public abstract boolean a(String paramString1, ServiceConnection paramServiceConnection, String paramString2);
  
  public abstract void b(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString);
  
  public abstract void b(String paramString1, ServiceConnection paramServiceConnection, String paramString2);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;

public final class abe
{
  public static final String[] a = { "android.permission.READ_CONTACTS" };
  
  public static boolean a(Context paramContext, s params)
  {
    boolean bool = false;
    String[] arrayOfString = a;
    int k = arrayOfString.length;
    int i = 0;
    int j;
    if (i < k)
    {
      params = arrayOfString[i];
      if (Build.VERSION.SDK_INT > 22)
      {
        j = 1;
        label34:
        if (j == 0) {
          break label74;
        }
        j = paramContext.checkPermission(params, Process.myPid(), Process.myUid());
        label52:
        if (j != 0) {
          break label80;
        }
        j = 1;
        label60:
        if (j != 0) {
          break label86;
        }
      }
    }
    for (;;)
    {
      return bool;
      j = 0;
      break label34;
      label74:
      j = 0;
      break label52;
      label80:
      j = 0;
      break label60;
      label86:
      i++;
      break;
      bool = true;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\abe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
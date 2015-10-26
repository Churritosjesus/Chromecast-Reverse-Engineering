import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;

final class uz
{
  final Context a;
  final Handler b;
  boolean c;
  final BroadcastReceiver d = new va(this);
  final Runnable e = new vb(this);
  private final vc f;
  private final PackageManager g;
  private final ArrayList h = new ArrayList();
  
  public uz(Context paramContext, vc paramvc)
  {
    this.a = paramContext;
    this.f = paramvc;
    this.b = new Handler();
    this.g = paramContext.getPackageManager();
  }
  
  private int a(String paramString1, String paramString2)
  {
    int k = this.h.size();
    int i = 0;
    int j;
    if (i < k)
    {
      us localus = (us)this.h.get(i);
      if ((localus.j.getPackageName().equals(paramString1)) && (localus.j.getClassName().equals(paramString2)))
      {
        j = 1;
        label63:
        if (j == 0) {
          break label77;
        }
      }
    }
    for (;;)
    {
      return i;
      j = 0;
      break label63;
      label77:
      i++;
      break;
      i = -1;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\uz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class az
  implements Iterable
{
  public final ArrayList a = new ArrayList();
  public final Context b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11) {
      new bd();
    }
    for (;;)
    {
      return;
      new bc();
    }
  }
  
  private az(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public static az a(Context paramContext)
  {
    return new az(paramContext);
  }
  
  public final az a(ComponentName paramComponentName)
  {
    int i = this.a.size();
    try
    {
      for (paramComponentName = at.a(this.b, paramComponentName); paramComponentName != null; paramComponentName = at.a(this.b, paramComponentName.getComponent())) {
        this.a.add(i, paramComponentName);
      }
      return this;
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      throw new IllegalArgumentException(paramComponentName);
    }
  }
  
  public final Iterator iterator()
  {
    return this.a.iterator();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
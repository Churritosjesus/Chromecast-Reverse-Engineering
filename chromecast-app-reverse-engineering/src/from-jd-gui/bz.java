import android.content.Context;
import android.os.Build.VERSION;
import java.util.WeakHashMap;

public class bz
{
  private static final WeakHashMap a = new WeakHashMap();
  
  public static bz a(Context paramContext)
  {
    synchronized (a)
    {
      bz localbz = (bz)a.get(paramContext);
      Object localObject = localbz;
      if (localbz == null)
      {
        if (Build.VERSION.SDK_INT >= 17)
        {
          localObject = new ca;
          ((ca)localObject).<init>(paramContext);
          a.put(paramContext, localObject);
        }
      }
      else {
        return (bz)localObject;
      }
      localObject = new cb(paramContext);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
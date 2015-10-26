import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;

class ve
  extends tq
{
  protected ve(Context paramContext)
  {
    super(paramContext, new tt(new ComponentName("android", ve.class.getName())));
  }
  
  public static ve a(Context paramContext, vo paramvo)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      paramContext = new vk(paramContext, paramvo);
    }
    for (;;)
    {
      return paramContext;
      if (Build.VERSION.SDK_INT >= 17) {
        paramContext = new vj(paramContext, paramvo);
      } else if (Build.VERSION.SDK_INT >= 16) {
        paramContext = new vf(paramContext, paramvo);
      } else {
        paramContext = new vl(paramContext);
      }
    }
  }
  
  public void a(uh paramuh) {}
  
  public void b(uh paramuh) {}
  
  public void c(uh paramuh) {}
  
  public void d(uh paramuh) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
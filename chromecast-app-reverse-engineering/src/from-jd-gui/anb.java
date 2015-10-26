import com.google.android.apps.chromecast.app.MainActivity;
import java.util.List;

public final class anb
  extends ac
{
  public anb(MainActivity paramMainActivity)
  {
    super(paramMainActivity.b);
  }
  
  public final int a()
  {
    return MainActivity.a(this.b).size();
  }
  
  public final j a(int paramInt)
  {
    Object localObject;
    if (MainActivity.a(this.b).get(paramInt) == ana.b)
    {
      MainActivity.a(this.b, new ama());
      localObject = MainActivity.b(this.b);
    }
    for (;;)
    {
      return (j)localObject;
      try
      {
        localObject = (j)((ana)MainActivity.a(this.b).get(paramInt)).e.newInstance();
      }
      catch (InstantiationException localInstantiationException)
      {
        MainActivity.c(this.b).a("InstantiationException: %s", new Object[] { localInstantiationException.getMessage() });
        ama localama = new ama();
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;)
        {
          MainActivity.c(this.b).a("IllegalAccessException: %s", new Object[] { localIllegalAccessException.getMessage() });
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\anb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
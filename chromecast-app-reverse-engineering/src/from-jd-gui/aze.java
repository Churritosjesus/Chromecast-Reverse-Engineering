import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.apps.chromecast.app.SetupApplication;

final class aze
  implements bff
{
  aze(ayz paramayz, bdq parambdq, int paramInt, aym paramaym) {}
  
  public final void a()
  {
    ayz.c(this.d);
    ape.a().a(7, Integer.valueOf(2), Long.valueOf(this.d.d));
    alm localalm = ayz.d(this.d);
    bdf localbdf = this.a.a;
    Object localObject1;
    if (localbdf.a > 4) {
      localObject1 = localbdf.b;
    }
    for (;;)
    {
      return;
      synchronized (localalm.g)
      {
        Object localObject3 = localalm.a(localbdf.n, localbdf.u);
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = localalm.d(localbdf.q);
        }
        if (localObject1 == null) {
          localObject3 = localalm.a(true);
        }
        do
        {
          ((aow)localObject3).a(localbdf);
          ((aow)localObject3).g();
          if (!localbdf.h) {
            break label188;
          }
          localalm.b.edit().putBoolean("nonhendrixDiscovered", true).apply();
          break;
          localObject3 = localObject1;
        } while (!((aow)localObject1).q());
        localalm.b((aow)localObject1);
        localObject3 = localObject1;
      }
      label188:
      localalm.b.edit().putBoolean("hendrixDiscovered", true).apply();
    }
  }
  
  public final void a(int paramInt)
  {
    int i = this.b + 1;
    if ((SetupApplication.a(paramInt)) && (i < 3))
    {
      ayz.c(this.d);
      ayz.a(this.d, this.c, i);
    }
    for (;;)
    {
      return;
      ayz.c(this.d);
    }
  }
  
  public final void b()
  {
    ayz.c(this.d);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public final class bqt
  extends bra
{
  private String a;
  private String b;
  private int c;
  private boolean e;
  private int f;
  private boolean g;
  private boolean h;
  
  public bqt(brb parambrb)
  {
    super(parambrb);
  }
  
  protected final void a()
  {
    Object localObject1 = this.d.a;
    Object localObject2;
    try
    {
      localObject1 = ((Context)localObject1).getPackageManager().getApplicationInfo(((Context)localObject1).getPackageName(), 129);
      if (localObject1 == null)
      {
        e("Couldn't get ApplicationInfo to load global config");
        return;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      do
      {
        do
        {
          do
          {
            for (;;)
            {
              d("PackageManager doesn't know about the app package", localNameNotFoundException);
              localObject2 = null;
            }
            localObject2 = ((ApplicationInfo)localObject2).metaData;
          } while (localObject2 == null);
          i = ((Bundle)localObject2).getInt("com.google.android.gms.analytics.globalConfigResource");
        } while (i <= 0);
        localObject2 = (bsh)new bsg(this.d).a(i);
      } while (localObject2 == null);
      b("Loading global XML config values");
      if (((bsh)localObject2).a == null) {
        break label295;
      }
    }
    int i = 1;
    label105:
    String str;
    if (i != 0)
    {
      str = ((bsh)localObject2).a;
      this.b = str;
      b("XML config - app name", str);
    }
    if (((bsh)localObject2).b != null)
    {
      i = 1;
      label135:
      if (i != 0)
      {
        str = ((bsh)localObject2).b;
        this.a = str;
        b("XML config - app version", str);
      }
      if (((bsh)localObject2).c == null) {
        break label305;
      }
      i = 1;
      label165:
      if (i != 0)
      {
        str = ((bsh)localObject2).c.toLowerCase();
        if (!"verbose".equals(str)) {
          break label310;
        }
        i = 0;
        label188:
        if (i >= 0)
        {
          this.c = i;
          a("XML config - log level", Integer.valueOf(i));
        }
      }
      if (((bsh)localObject2).d < 0) {
        break label357;
      }
      i = 1;
      label216:
      if (i != 0)
      {
        i = ((bsh)localObject2).d;
        this.f = i;
        this.e = true;
        b("XML config - dispatch period (sec)", Integer.valueOf(i));
      }
      if (((bsh)localObject2).e == -1) {
        break label362;
      }
      i = 1;
      label255:
      if (i == 0) {
        break label365;
      }
      if (((bsh)localObject2).e != 1) {
        break label367;
      }
    }
    label295:
    label305:
    label310:
    label357:
    label362:
    label365:
    label367:
    for (boolean bool = true;; bool = false)
    {
      this.h = bool;
      this.g = true;
      b("XML config - dry run", Boolean.valueOf(bool));
      break;
      i = 0;
      break label105;
      i = 0;
      break label135;
      i = 0;
      break label165;
      if ("info".equals(str))
      {
        i = 1;
        break label188;
      }
      if ("warning".equals(str))
      {
        i = 2;
        break label188;
      }
      if ("error".equals(str))
      {
        i = 3;
        break label188;
      }
      i = -1;
      break label188;
      i = 0;
      break label216;
      i = 0;
      break label255;
      break;
    }
  }
  
  public final String b()
  {
    r();
    return this.a;
  }
  
  public final String c()
  {
    r();
    return this.b;
  }
  
  public final boolean d()
  {
    r();
    return false;
  }
  
  public final int e()
  {
    r();
    return this.c;
  }
  
  public final boolean f()
  {
    r();
    return this.e;
  }
  
  public final int g()
  {
    r();
    return this.f;
  }
  
  public final boolean h()
  {
    r();
    return this.g;
  }
  
  public final boolean i()
  {
    r();
    return this.h;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
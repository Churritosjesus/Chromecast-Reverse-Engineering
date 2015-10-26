import android.content.Context;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.Locale;
import java.util.Map;

public final class bkh
{
  private static bkh j;
  bwj a;
  bwj b;
  ctn c;
  public ctk d;
  public bkk e;
  blp f = new blp("ChromecastTagManager", false);
  public final bke g = new bke();
  public final blv h = new blv();
  public ctw i;
  
  public static bkh a()
  {
    if (j == null) {
      j = new bkh();
    }
    return j;
  }
  
  public final void b()
  {
    Object localObject;
    cuq localcuq;
    String str;
    Locale localLocale;
    int k;
    if ((this.a == null) || (this.a.c()))
    {
      localObject = SetupApplication.a();
      localcuq = cuq.a((Context)localObject);
      this.i = localcuq.a;
      str = ((SetupApplication)localObject).c().b();
      localObject = ((SetupApplication)localObject).c();
      localLocale = Locale.getDefault();
      if (!((bli)localObject).a.containsKey(blj.c(localLocale))) {
        break label150;
      }
      k = ((Integer)((bli)localObject).a.get(blj.c(localLocale))).intValue();
    }
    for (;;)
    {
      this.a = localcuq.a(str, k);
      this.b = localcuq.a("GTM-K5SPV5", -1);
      this.a.a(new bki(this));
      this.b.a(new bkj(this));
      return;
      label150:
      if (((bli)localObject).a.containsKey(blj.b(localLocale))) {
        k = ((Integer)((bli)localObject).a.get(blj.b(localLocale))).intValue();
      } else if (((bli)localObject).a.containsKey(bli.b)) {
        k = ((Integer)((bli)localObject).a.get(bli.b)).intValue();
      } else {
        k = 0;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bkh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
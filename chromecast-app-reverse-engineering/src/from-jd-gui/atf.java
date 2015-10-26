import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.ImageView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class atf
{
  private static atf n;
  public final Context a;
  final SharedPreferences b;
  public j c;
  public blq d;
  bkm e;
  public dax f;
  public daz g;
  boolean h;
  List i = new ArrayList();
  List j = new ArrayList();
  public final ArrayList k = new ArrayList();
  public adv l;
  public aer m;
  private final String o;
  private final blp p = new blp("BackdropServer", false);
  
  private atf(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
    this.o = blf.z(this.a);
    this.b = PreferenceManager.getDefaultSharedPreferences(this.a);
    paramContext = new aej(new bgl());
    this.l = new adv(new aem(new File(this.a.getCacheDir(), "volley")), paramContext);
    this.l.a();
    this.d = new blq(this.a);
    this.m = new aer(this.l, this.d);
    this.e = new bkm();
  }
  
  private aex a(String paramString, aey paramaey)
  {
    return this.m.a(paramString, paramaey);
  }
  
  public static atf a(Context paramContext)
  {
    if (n == null) {
      n = new atf(paramContext);
    }
    return n;
  }
  
  public final aex a(String paramString, ImageView paramImageView, boolean paramBoolean)
  {
    return a(paramString, new ati(this, paramString, paramBoolean, paramImageView));
  }
  
  public final aui a(String paramString, aow paramaow)
  {
    return new aui(this.o, paramaow.j, paramString, new atm(this, paramaow));
  }
  
  String a(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject = null;
    try
    {
      paramContext = bsn.a(paramContext, paramString1, paramString2);
      return paramContext;
    }
    catch (bso paramString2)
    {
      if (this.c == null) {}
      for (paramString1 = null;; paramString1 = this.c.y)
      {
        paramContext = (Context)localObject;
        if (paramString1 == null) {
          break;
        }
        paramString1.runOnUiThread(new atp(this, paramString1, paramString2.a));
        paramContext = (Context)localObject;
        break;
      }
    }
    catch (bsp paramString2)
    {
      do
      {
        paramContext = (Context)localObject;
      } while (this.c == null);
      paramString1 = this.c;
      if (paramString2.b == null) {}
      for (paramContext = null;; paramContext = new Intent(paramString2.b))
      {
        paramString1.a(paramContext, 1000);
        paramContext = (Context)localObject;
        break;
      }
    }
    catch (IOException paramContext)
    {
      for (;;)
      {
        paramContext = (Context)localObject;
      }
    }
  }
  
  public void a()
  {
    synchronized (this.k)
    {
      if (this.k.isEmpty()) {
        return;
      }
      new atn(this).execute(new Void[] { null });
    }
  }
  
  public final void a(ads arg1)
  {
    if ((!(??? instanceof atb)) || (((atb)???).g() == null)) {
      this.l.a(???);
    }
    for (;;)
    {
      return;
      atb localatb = (atb)???;
      synchronized (this.k)
      {
        this.k.add(localatb);
        if (this.k.size() <= 1) {}
      }
      a();
    }
  }
  
  public final void a(atb paramatb)
  {
    Object localObject1 = paramatb.k;
    ??? = this.l;
    if (localObject1 == null) {
      throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }
    ((adv)???).a(new adw((adv)???, localObject1));
    synchronized (this.k)
    {
      for (int i1 = this.k.size() - 1; i1 > 0; i1--) {
        if (localObject1.equals(((atb)this.k.get(i1)).k)) {
          this.k.remove(i1);
        }
      }
      a(paramatb);
      return;
    }
  }
  
  public final void a(atr paramatr, adz paramadz)
  {
    if (this.f != null) {
      paramatr.a(this.f);
    }
    for (;;)
    {
      return;
      this.i.add(paramatr);
      if (paramadz != null) {
        this.j.add(paramadz);
      }
      if (!this.h)
      {
        paramatr = new day();
        paramatr.a = blx.a(null);
        paramatr = new awl(paramatr, new atq(this), new ath(this));
        this.h = true;
        a(paramatr);
      }
    }
  }
  
  public void a(String paramString, aea paramaea, boolean paramBoolean)
  {
    a(new atk(this, paramString, paramaea, paramBoolean), null);
  }
  
  public final void a(String paramString, ats paramats)
  {
    a(paramString, new atj(this, paramString, paramats));
  }
  
  public void b()
  {
    String str = TextUtils.join(",", this.f.b);
    apg localapg = apg.a(156);
    localapg.b = str;
    localapg.b();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\atf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
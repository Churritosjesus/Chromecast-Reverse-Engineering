import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

public final class bvh
{
  public static final bwe a = new bwe();
  public static final bvz b = new bvz("ClearcutLogger.API", d, a, new Scope[0]);
  private static bwd d = new bvi();
  private static bvm e = new ckc();
  public final bvm c;
  private final String f;
  private final int g;
  private String h;
  private int i = -1;
  private String j;
  private String k;
  private final boolean l;
  private final cac m;
  private final bvl n;
  
  private bvh(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, bvm parambvm, cac paramcac, bvl parambvl)
  {
    this.f = paramContext.getPackageName();
    this.g = a(paramContext);
    this.i = -1;
    this.h = paramString1;
    this.j = paramString2;
    this.k = paramString3;
    this.l = false;
    this.c = parambvm;
    this.m = paramcac;
    this.n = parambvl;
    if (this.l)
    {
      if (this.j == null) {
        paramBoolean = true;
      }
      a.b(paramBoolean, "can't be anonymous with an upload account");
    }
  }
  
  @Deprecated
  public bvh(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this(paramContext, -1, paramString1, null, null, false, e, cad.c(), new bvl());
  }
  
  private static int a(Context paramContext)
  {
    int i2 = 0;
    try
    {
      i1 = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i1;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        Log.wtf("ClearcutLogger", "This can't happen.");
        int i1 = i2;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
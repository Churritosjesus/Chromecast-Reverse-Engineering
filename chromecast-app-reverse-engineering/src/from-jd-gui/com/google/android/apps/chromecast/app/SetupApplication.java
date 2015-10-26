package com.google.android.apps.chromecast.app;

import adv;
import alm;
import ana;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import aoq;
import aor;
import ape;
import ass;
import atf;
import atg;
import azg;
import azv;
import bkg;
import bkl;
import blf;
import bli;
import blp;
import blq;
import bls;
import bvh;
import bwf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SetupApplication
  extends Application
{
  private static SetupApplication m;
  private static int n = 0;
  public SharedPreferences a;
  public boolean b;
  public String c;
  public boolean d;
  public String e;
  final List f = new ArrayList();
  public azg g;
  public boolean h = true;
  public AndroidHttpClient i;
  public final ass j = new ass();
  public long k;
  public String l;
  private final blp o = new blp("SetupApplication", false);
  private bkg p;
  private boolean q;
  private alm r;
  private bli s;
  private String t = null;
  private azv u;
  private aor v;
  
  static
  {
    int i1 = Build.VERSION.SDK_INT;
  }
  
  public static Intent a(Context paramContext, ana paramana)
  {
    paramContext = new Intent(paramContext, MainActivity.class);
    paramContext.setFlags(67108864);
    paramContext.putExtra("tabIndex", paramana.ordinal());
    return paramContext;
  }
  
  public static SetupApplication a()
  {
    return m;
  }
  
  public static boolean a(int paramInt)
  {
    if ((paramInt == -1) || (paramInt == -2) || (paramInt == -6) || (paramInt == -8)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static String b(String paramString)
  {
    String str = String.valueOf(blf.A(m.getApplicationContext()));
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {}
    for (paramString = str.concat(paramString);; paramString = new String(str)) {
      return paramString;
    }
  }
  
  public static void b(int paramInt)
  {
    n = 1;
  }
  
  public static boolean f()
  {
    if (n != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean g()
  {
    if (!TextUtils.isEmpty(m.c)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static ana h()
  {
    if (PreferenceManager.getDefaultSharedPreferences(m).getBoolean("content_default_getapps", false)) {}
    for (ana localana = ana.c;; localana = ana.a) {
      return localana;
    }
  }
  
  public static atf i()
  {
    return atf.a(m);
  }
  
  private String m()
  {
    Object localObject2 = getApplicationContext();
    String str1 = ((Context)localObject2).getPackageName();
    if (str1 == null) {
      throw new IllegalArgumentException("invalid application context");
    }
    try
    {
      localObject2 = ((Context)localObject2).getPackageManager().getPackageInfo(str1, 0).versionName;
      if (localObject2 == null) {
        throw new IllegalArgumentException("invalid application context");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new IllegalArgumentException("invalid application context");
    }
    localObject2 = String.valueOf(localNameNotFoundException).length() + 1 + String.valueOf(localObject2).length() + localNameNotFoundException + "/" + (String)localObject2;
    String str2 = System.getProperty("http.agent");
    Object localObject1;
    if (str2 == null) {
      localObject1 = localObject2;
    }
    for (;;)
    {
      return (String)localObject1;
      int i1 = str2.indexOf('(');
      localObject1 = localObject2;
      if (i1 > 0)
      {
        localObject1 = String.valueOf(str2.substring(i1));
        localObject1 = String.valueOf(localObject2).length() + 1 + String.valueOf(localObject1).length() + (String)localObject2 + " " + (String)localObject1;
      }
    }
  }
  
  public final void a(String paramString)
  {
    if ((paramString == null) || (!paramString.equals(this.e)))
    {
      SharedPreferences.Editor localEditor = this.a.edit();
      if (TextUtils.isEmpty(paramString))
      {
        paramString = null;
        localEditor.remove("current_account_name");
      }
      for (;;)
      {
        localEditor.apply();
        this.e = paramString;
        paramString = this.f.iterator();
        while (paramString.hasNext()) {
          ((aoq)paramString.next()).m();
        }
        localEditor.putString("current_account_name", paramString);
      }
    }
  }
  
  public final alm b()
  {
    if (this.r == null) {
      this.r = new alm(bkl.a(), PreferenceManager.getDefaultSharedPreferences(this));
    }
    return this.r;
  }
  
  public final bli c()
  {
    if (this.s == null) {
      this.s = new bli(getApplicationContext());
    }
    return this.s;
  }
  
  public final void c(String paramString)
  {
    this.k = SystemClock.elapsedRealtime();
    this.l = paramString;
  }
  
  /* Error */
  public final bkg d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 311	com/google/android/apps/chromecast/app/SetupApplication:q	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifne +22 -> 30
    //   11: new 313	bkg
    //   14: astore_1
    //   15: aload_1
    //   16: aload_0
    //   17: invokespecial 314	bkg:<init>	(Landroid/content/Context;)V
    //   20: aload_0
    //   21: aload_1
    //   22: putfield 316	com/google/android/apps/chromecast/app/SetupApplication:p	Lbkg;
    //   25: aload_0
    //   26: iconst_1
    //   27: putfield 311	com/google/android/apps/chromecast/app/SetupApplication:q	Z
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_0
    //   33: getfield 316	com/google/android/apps/chromecast/app/SetupApplication:p	Lbkg;
    //   36: areturn
    //   37: astore_1
    //   38: aload_0
    //   39: getfield 78	com/google/android/apps/chromecast/app/SetupApplication:o	Lblp;
    //   42: aload_1
    //   43: ldc_w 318
    //   46: iconst_0
    //   47: anewarray 320	java/lang/Object
    //   50: invokevirtual 323	blp:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   53: goto -28 -> 25
    //   56: astore_1
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    //   61: astore_1
    //   62: aload_0
    //   63: getfield 78	com/google/android/apps/chromecast/app/SetupApplication:o	Lblp;
    //   66: aload_1
    //   67: ldc_w 318
    //   70: iconst_0
    //   71: anewarray 320	java/lang/Object
    //   74: invokevirtual 323	blp:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   77: goto -52 -> 25
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	SetupApplication
    //   14	8	1	localbkg	bkg
    //   37	6	1	localCertificateException	java.security.cert.CertificateException
    //   56	4	1	localObject	Object
    //   61	6	1	localIOException	java.io.IOException
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	25	37	java/security/cert/CertificateException
    //   2	7	56	finally
    //   11	25	56	finally
    //   25	30	56	finally
    //   30	32	56	finally
    //   38	53	56	finally
    //   57	59	56	finally
    //   62	77	56	finally
    //   11	25	61	java/io/IOException
  }
  
  public final String e()
  {
    if (this.t == null) {}
    try
    {
      this.t = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
      return this.t;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        this.t = "??";
      }
    }
  }
  
  public final void j()
  {
    atf localatf = atf.a(this);
    synchronized (localatf.k)
    {
      localatf.k.clear();
      localatf.l.a(new atg(localatf));
      localatf.d.a();
      localatf.f = null;
      return;
    }
  }
  
  public final boolean k()
  {
    if ((this.k > 0L) && (SystemClock.elapsedRealtime() - this.k < TimeUnit.MINUTES.toMillis(30L))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final azv l()
  {
    if (this.u == null) {
      this.u = new azv(getApplicationContext());
    }
    return this.u;
  }
  
  public final void onCreate()
  {
    boolean bool = true;
    super.onCreate();
    m = this;
    n = blf.a(getApplicationContext());
    this.i = AndroidHttpClient.newInstance(m());
    ape localape = ape.a();
    Context localContext = getApplicationContext();
    localape.b = localContext;
    localape.c = PreferenceManager.getDefaultSharedPreferences(localContext);
    if ((localape.c.getBoolean("ANALYTICS_ENABLED", true)) && (blf.L(localContext))) {}
    for (;;)
    {
      localape.f = bool;
      localape.d = new bwf(localContext).a(bvh.b).a(localape).b();
      localape.e = new bvh(localape.b, "CHROMECAST_APP_LOG", null, null);
      localape.g = localape.a.nextInt();
      this.v = new aor();
      registerActivityLifecycleCallbacks(this.v);
      this.a = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
      this.d = this.a.getBoolean("CAST_SCREEN_LAUNCHED", false);
      this.e = this.a.getString("current_account_name", null);
      if (this.e == null) {
        a(bls.b(this));
      }
      this.b = this.a.getBoolean("TERMS_ACCEPTED", false);
      return;
      bool = false;
    }
  }
  
  @TargetApi(14)
  public void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\SetupApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
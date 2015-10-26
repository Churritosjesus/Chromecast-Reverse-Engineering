import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class csa
  extends byo
{
  private static volatile Bundle d;
  private static volatile Bundle e;
  private String a;
  private String b;
  private final HashMap c = new HashMap();
  
  public csa(Context paramContext, Looper paramLooper, bwg parambwg, bwh parambwh, String paramString, byl parambyl)
  {
    super(paramContext.getApplicationContext(), paramLooper, 5, parambwg, parambwh, parambyl);
    this.a = paramString;
    this.b = parambyl.e;
  }
  
  private void a(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    for (;;)
    {
      return;
      try
      {
        cld.a(paramBundle.getBoolean("use_contactables_api", true));
        crz.a.a(paramBundle.getStringArray("config.url_uncompress.patterns"), paramBundle.getStringArray("config.url_uncompress.replacements"));
        d = paramBundle.getBundle("config.email_type_map");
        e = paramBundle.getBundle("config.phone_type_map");
      }
      finally {}
    }
  }
  
  public final bye a(bwq parambwq, String paramString1, String paramString2, int paramInt)
  {
    csg localcsg = new csg(parambwq);
    try
    {
      parambwq = ((cru)super.o()).c(localcsg, paramString1, paramString2, 0);
      return parambwq;
    }
    catch (RemoteException parambwq)
    {
      for (;;)
      {
        localcsg.a(8, null, null, null);
        parambwq = null;
      }
    }
  }
  
  public final bye a(bwq parambwq, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    csg localcsg = new csg(parambwq);
    try
    {
      parambwq = ((cru)super.o()).b(localcsg, paramString1, paramString2, paramInt1, paramInt2);
      return parambwq;
    }
    catch (RemoteException parambwq)
    {
      for (;;)
      {
        localcsg.a(8, null, null, null);
        parambwq = null;
      }
    }
  }
  
  public final void a()
  {
    synchronized (this.c)
    {
      if (k())
      {
        Object localObject1 = this.c.values().iterator();
        if (((Iterator)localObject1).hasNext())
        {
          localObject1 = (csc)((Iterator)localObject1).next();
          throw new NullPointerException();
        }
      }
    }
    this.c.clear();
    super.a();
  }
  
  protected final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    if ((paramInt == 0) && (paramBundle != null)) {
      a(paramBundle.getBundle("post_init_configuration"));
    }
    if (paramBundle == null) {}
    for (paramBundle = null;; paramBundle = paramBundle.getBundle("post_init_resolution"))
    {
      super.a(paramInt, paramIBinder, paramBundle);
      return;
    }
  }
  
  public final void a(bwq parambwq, String paramString, int paramInt)
  {
    super.n();
    parambwq = new csd(parambwq);
    try
    {
      ((cru)super.o()).a(parambwq, paramString, paramInt);
      return;
    }
    catch (RemoteException paramString)
    {
      for (;;)
      {
        parambwq.a(8, null, null);
      }
    }
  }
  
  public final void a(bwq parambwq, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, int paramInt)
  {
    super.n();
    paramString1 = new csf(parambwq);
    try
    {
      ((cru)super.o()).a(paramString1, false, paramBoolean2, null, null, paramInt);
      return;
    }
    catch (RemoteException parambwq)
    {
      for (;;)
      {
        paramString1.a(8, null, null);
      }
    }
  }
  
  protected final String c()
  {
    return "com.google.android.gms.people.service.START";
  }
  
  protected final String d()
  {
    return "com.google.android.gms.people.internal.IPeopleService";
  }
  
  protected final Bundle e()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("social_client_application_id", this.a);
    localBundle.putString("real_client_package_name", this.b);
    localBundle.putBoolean("support_new_image_callback", true);
    return localBundle;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\csa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
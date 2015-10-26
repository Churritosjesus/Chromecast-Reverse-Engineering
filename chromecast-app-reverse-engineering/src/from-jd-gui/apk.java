import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class apk
  extends apt
{
  private static final blp b = new blp("CastConnection");
  public GoogleApiClient a;
  private final List c = new ArrayList();
  
  public apk(CastDevice paramCastDevice, Context paramContext)
  {
    String str = paramCastDevice.b;
    a(paramCastDevice, paramContext, this);
  }
  
  private apk(CastDevice paramCastDevice, Context paramContext, apt paramapt)
  {
    String str = paramCastDevice.b;
    a(paramCastDevice, paramContext, paramapt);
  }
  
  public static apk a(uh paramuh, Context paramContext, apt paramapt)
  {
    return new apk(CastDevice.a(paramuh.m), paramContext, paramapt);
  }
  
  private void a(CastDevice paramCastDevice, Context paramContext, apt paramapt)
  {
    paramCastDevice = new bta(new btb(paramCastDevice, paramapt));
    paramCastDevice = new bwf(paramContext.getApplicationContext()).a(bsr.a, paramCastDevice);
    paramCastDevice.a(paramapt);
    paramCastDevice.a(paramapt);
    this.a = paramCastDevice.b();
    if ((!this.a.d()) && (!this.a.e())) {
      this.a.b();
    }
  }
  
  private void a(String paramString, boolean paramBoolean, bwn parambwn)
  {
    a(new apm(this, paramBoolean, paramString, parambwn));
  }
  
  public final ApplicationMetadata a()
  {
    Object localObject3 = null;
    Object localObject1 = localObject3;
    if (this.a != null)
    {
      localObject1 = localObject3;
      if (!this.a.d()) {}
    }
    try
    {
      localObject1 = bsr.b.d(this.a);
      return (ApplicationMetadata)localObject1;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        b.a("Error getting app status from GMS: %s", new Object[] { localIllegalStateException.getMessage() });
        Object localObject2 = localObject3;
      }
    }
  }
  
  public final void a(int paramInt) {}
  
  public final void a(Bundle paramBundle) {}
  
  public final void a(ConnectionResult paramConnectionResult) {}
  
  public final void a(Runnable paramRunnable)
  {
    if (this.a == null) {}
    for (;;)
    {
      return;
      if (this.a.d())
      {
        paramRunnable.run();
      }
      else
      {
        this.a.a(new apl(this, paramRunnable));
        if (!this.a.e()) {
          this.a.b();
        }
      }
    }
  }
  
  public final void a(String paramString, bwn parambwn)
  {
    a(paramString, false, parambwn);
  }
  
  public final void a(String paramString1, String paramString2, Runnable paramRunnable)
  {
    a(new apo(this, paramString1, paramString2, paramRunnable));
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    a(new apq(this, paramBoolean1, paramBoolean2));
  }
  
  public final boolean a(String paramString, btd parambtd)
  {
    if (this.a == null) {}
    for (boolean bool = false;; bool = true)
    {
      return bool;
      this.c.add(paramString);
      a(new apn(this, paramString, parambtd));
    }
  }
  
  public final void b()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        bsr.b.c(this.a, str);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        b.a("Couldn't remove message callback: %s", new Object[] { localIllegalArgumentException.toString() });
      }
      catch (IOException localIOException)
      {
        b.a("Couldn't remove message callback: %s", new Object[] { localIOException.toString() });
      }
    }
    this.c.clear();
  }
  
  public final void b(int paramInt) {}
  
  public final void b(String paramString, bwn parambwn)
  {
    a(paramString, true, parambwn);
  }
  
  public final void c()
  {
    a(false, true);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\apk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
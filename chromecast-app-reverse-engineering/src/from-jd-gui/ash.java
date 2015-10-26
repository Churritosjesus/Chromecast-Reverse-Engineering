import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ash
  extends j
  implements asg
{
  public dbt Z;
  final atc a = new atc();
  private blp aa;
  private final Handler ab = new Handler();
  private long ac;
  private atw ad;
  private String ae;
  private String af;
  private String ag;
  private dbr ah;
  private String ai;
  private final Runnable aj = new asi(this);
  private final List ak = new ArrayList();
  public boolean b;
  atf c;
  public asb d;
  
  public static ash a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    ash localash = new ash();
    Bundle localBundle = new Bundle();
    localBundle.putString("backdropAppDeviceId", paramString1);
    localBundle.putString("deviceName", paramString2);
    localBundle.putString("deviceType", paramString3);
    localBundle.putString("backdropDeviceCert", paramString4);
    localash.f(localBundle);
    return localash;
  }
  
  private void a(int paramInt, long paramLong, asp paramasp)
  {
    m localm = this.y;
    int i;
    if (paramInt == 1)
    {
      i = b.Z;
      c(localm.getString(i));
      this.ad.a(paramLong);
      b(1);
      if (paramasp != null)
      {
        if (paramInt != 2) {
          break label66;
        }
        paramasp.l();
      }
    }
    for (;;)
    {
      return;
      i = b.al;
      break;
      label66:
      paramasp.j();
    }
  }
  
  private void c(String paramString)
  {
    this.y.runOnUiThread(new aso(this, paramString));
  }
  
  private void u()
  {
    this.ad.c(this.c, new asn(this));
    this.ab.removeCallbacks(this.aj);
    long l = (int)(this.ac * (Math.random() / 2.0D + 0.75D));
    this.ab.postDelayed(this.aj, l);
  }
  
  private void v()
  {
    aow localaow = SetupApplication.a().b().b(this.ae);
    if (localaow == null) {}
    for (;;)
    {
      return;
      aqj localaqj = SetupApplication.a().j.a(localaow);
      if (localaqj != null)
      {
        if (aqj.c != null)
        {
          localaqj.b.g();
          localaqj.a("urn:x-cast:com.google.cast.sse", aqj.c, new aqt(localaqj));
        }
      }
      else {
        this.aa.a("Settings updated for %s, but couldn't send the refresh request.", new Object[] { localaow.g() });
      }
    }
  }
  
  public final List a(int paramInt, String paramString)
  {
    return this.a.a(paramInt, paramString);
  }
  
  public final void a()
  {
    super.a();
    this.c.c = null;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, String paramString, int paramInt5)
  {
    asl localasl = new asl(this);
    atf localatf = this.c;
    String str3 = this.ag;
    String str2 = this.ae;
    if (paramBoolean) {}
    for (String str1 = null;; str1 = this.a.b(paramInt4, paramString))
    {
      localatf.a(new auh(str3, str2, 100, paramInt2, paramInt3, str1, paramString, paramInt4, paramInt5, new asm(this, paramBoolean, paramInt4, paramString), localasl));
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, Intent arg3)
  {
    atf localatf;
    if (paramInt1 == 1000)
    {
      localatf = this.c;
      if (paramInt1 == 1000)
      {
        if (paramInt2 != -1) {
          break label31;
        }
        localatf.a();
      }
    }
    for (;;)
    {
      return;
      label31:
      synchronized (localatf.k)
      {
        if (!localatf.k.isEmpty()) {}
      }
      atb localatb = (atb)((atf)localObject).k.get(0);
      ((atf)localObject).k.remove(localatb);
      if (localatb != null)
      {
        localatb.b(new adf("no permission granted"));
        continue;
        super.a(paramInt1, paramInt2, ???);
      }
    }
  }
  
  public void a(int paramInt, dbt paramdbt, asp paramasp)
  {
    dcg localdcg = new dcg();
    localdcg.a = Integer.valueOf(paramInt);
    localdcg.c = new dbt[] { paramdbt };
    long l = this.ad.a();
    try
    {
      atf localatf = this.c;
      auf localauf = new auf;
      String str = this.ag;
      asj localasj = new asj;
      localasj.<init>(this, paramInt, l, paramasp, paramdbt);
      paramdbt = new ask;
      paramdbt.<init>(this, paramInt, l, paramasp);
      localauf.<init>(str, localdcg, localasj, paramdbt);
      localatf.a(localauf);
      return;
    }
    catch (IOException paramdbt)
    {
      for (;;)
      {
        this.aa.a("Could not serialize device link data: %s", new Object[] { paramdbt });
        a(paramInt, l, paramasp);
      }
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.c = atf.a(paramActivity);
    this.c.c = this;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    c(true);
    this.aa = new blp("BackdropStorage", false);
    this.ad = new atw(this.y);
    this.ac = blf.v(this.y);
    this.ag = blf.z(this.y);
    if ((this.m != null) && (this.m.containsKey("castDeviceUserInfo"))) {
      this.ah = new dbr();
    }
    try
    {
      byte[] arrayOfByte = this.m.getByteArray("castDeviceUserInfo");
      dbr localdbr = new dbr;
      localdbr.<init>();
      this.ah = ((dbr)dew.a(localdbr, arrayOfByte));
      if ((this.ah.b != null) && (!this.ah.b.isEmpty())) {
        this.ae = this.ah.b;
      }
      if ((this.m != null) && (this.m.containsKey("backdropAppDeviceId"))) {
        this.ae = this.m.getString("backdropAppDeviceId");
      }
      if ((this.m != null) && (this.m.containsKey("backdropDeviceCert"))) {
        this.af = this.m.getString("backdropDeviceCert");
      }
      if (this.ae != null)
      {
        this.d = new asb(new atz(this.y, this.ae), this.c, blf.t(this.y), this.ac);
        if (this.ah == null)
        {
          this.Z = asr.a(this.ae, this.m.getString("deviceName"), this.af);
          this.ai = this.m.getString("deviceType");
        }
      }
      else
      {
        if (paramBundle != null)
        {
          this.ad.b(paramBundle);
          if (this.d != null) {
            this.d.b.b(paramBundle);
          }
          b(1);
        }
        return;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        this.aa.a("Error deserializing UserDeviceAssociationRequest.", new Object[0]);
        continue;
        this.Z = asr.a(this.ah, this.af);
        this.ai = this.ah.a;
      }
    }
  }
  
  public final void a(asq paramasq)
  {
    this.ak.add(paramasq);
    paramasq.a_(4);
    paramasq.a_(2);
  }
  
  public final boolean a(String paramString)
  {
    int i;
    if (paramString != null)
    {
      Iterator localIterator = this.ad.a.iterator();
      while (localIterator.hasNext()) {
        if (((ast)localIterator.next()).b.equals(paramString))
        {
          i = 1;
          if (i == 0) {
            break label62;
          }
        }
      }
    }
    label62:
    for (boolean bool = true;; bool = false)
    {
      return bool;
      i = 0;
      break;
    }
  }
  
  public final dcj b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      Object localObject = t().b;
      if (localObject == null)
      {
        paramString = null;
      }
      else
      {
        LinkedList localLinkedList = new LinkedList();
        localLinkedList.add(localObject);
        for (;;)
        {
          if (localLinkedList.isEmpty()) {
            break label129;
          }
          localObject = (dcj)localLinkedList.remove();
          if (localObject != null)
          {
            if ((!TextUtils.isEmpty(((dcj)localObject).j)) && (((dcj)localObject).j.equals(paramString)))
            {
              paramString = (String)localObject;
              break;
            }
            localObject = ((dcj)localObject).i;
            int j = localObject.length;
            for (int i = 0; i < j; i++) {
              localLinkedList.add(localObject[i]);
            }
          }
        }
        label129:
        paramString = null;
      }
    }
  }
  
  public final void b(int paramInt)
  {
    Iterator localIterator = new ArrayList(this.ak).iterator();
    while (localIterator.hasNext()) {
      ((asq)localIterator.next()).a_(paramInt);
    }
  }
  
  public final void b(asq paramasq)
  {
    this.ak.remove(paramasq);
  }
  
  public final void d_()
  {
    b(2);
    b(4);
    v();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.ad.a(paramBundle);
    if (this.d != null) {
      this.d.b.a(paramBundle);
    }
  }
  
  public final void e_()
  {
    v();
  }
  
  public final void f_()
  {
    this.b = true;
  }
  
  public final void g_()
  {
    super.g_();
    if (this.d != null)
    {
      asb localasb = this.d;
      localasb.i = true;
      localasb.c = this;
      localasb.b();
    }
    u();
  }
  
  public final void h_()
  {
    super.h_();
    this.ab.removeCallbacks(this.aj);
    if (this.d != null)
    {
      asb localasb = this.d;
      localasb.i = false;
      localasb.c = null;
      localasb.g.removeCallbacks(localasb.h);
      localasb.g.removeCallbacks(localasb.j);
      if ((localasb.b.b()) && (!localasb.e)) {
        localasb.j.run();
      }
    }
  }
  
  public final List p()
  {
    if (this.ad == null) {}
    for (List localList = null;; localList = this.ad.a) {
      return localList;
    }
  }
  
  public final boolean q()
  {
    return this.ad.b;
  }
  
  public final boolean r()
  {
    return a(this.ae);
  }
  
  public final auq s()
  {
    if (this.d != null) {}
    for (auq localauq = this.d.b.a;; localauq = null) {
      return localauq;
    }
  }
  
  public final aur t()
  {
    if (this.d != null) {}
    for (aur localaur = this.d.b.b;; localaur = null) {
      return localaur;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ash.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
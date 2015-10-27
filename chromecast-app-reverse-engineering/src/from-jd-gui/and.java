import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class and
  extends mm
  implements baq
{
  private int A;
  private int B;
  private int C;
  private int D;
  private int E;
  private int F;
  private azg G;
  private bfs H;
  private bfs I;
  private bdm J;
  private aop K;
  private boolean L;
  private long M;
  private int N;
  private final boolean O;
  private int e = -1;
  private int f = 0;
  private TextView g;
  public String h;
  public bdf i;
  public String j;
  public String k;
  public boolean l;
  public bdj m;
  public bfs n;
  public String o;
  public bdu p;
  public String q;
  public ArrayList r;
  public ViewFlipper s;
  public blp t;
  public boolean u;
  private DialogInterface.OnCancelListener v;
  private DialogInterface.OnCancelListener w = new ane(this);
  private Handler x;
  private Runnable y;
  private azv z;
  
  public and(String paramString, boolean paramBoolean)
  {
    this.t = new blp(paramString, false);
    this.O = paramBoolean;
  }
  
  private AlertDialog.Builder a(String paramString, boolean paramBoolean, aoo paramaoo)
  {
    if (isFinishing()) {
      if (paramaoo != null)
      {
        if (paramBoolean) {
          y();
        }
        paramaoo.b();
      }
    }
    for (paramString = null;; paramString = new AlertDialog.Builder(this).setMessage(paramString).setCancelable(true).setOnCancelListener(new aoe(this, paramBoolean, paramaoo))) {
      return paramString;
    }
  }
  
  public static void a(Menu paramMenu, int paramInt, boolean paramBoolean)
  {
    paramMenu = paramMenu.findItem(paramInt);
    if (paramMenu != null)
    {
      paramMenu.setVisible(paramBoolean);
      paramMenu.setEnabled(paramBoolean);
    }
  }
  
  private void a(bdf parambdf)
  {
    this.G.a(this.p, this.i, new anv(this, parambdf));
  }
  
  private void a(bdm parambdm, int paramInt, String paramString1, String paramString2)
  {
    new AlertDialog.Builder(this).setMessage(paramString1).setPositiveButton(b.db, new anh(this, parambdm, paramInt, paramString2)).setNegativeButton(b.H, null).setCancelable(true).show();
  }
  
  private void a(String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean)
  {
    SetupApplication.a().c(paramString2);
    w();
    this.y = null;
    paramString1 = new AlertDialog.Builder(this).setTitle(b.aC).setView(blx.a(this, paramString1, new String[] { getString(paramInt1), getString(paramInt2) })).setCancelable(true).setOnCancelListener(new any(this, paramBoolean));
    if (paramBoolean) {
      paramString1.setPositiveButton(b.I, new anz(this));
    }
    for (;;)
    {
      paramString1.show();
      return;
      paramString1.setPositiveButton(b.dd, new aob(this)).setNegativeButton(b.dc, new aoa(this));
    }
  }
  
  private void a(String paramString1, String paramString2)
  {
    a(paramString1, b.dF, b.dG, paramString2, false);
  }
  
  private void b(String paramString)
  {
    if (this.O) {}
    Object localObject;
    for (int i1 = 22;; i1 = 44)
    {
      localObject = new apd(i1);
      ((apd)localObject).h = A();
      localObject = new anp(this, (apd)localObject, paramString, SystemClock.elapsedRealtime());
      if (!this.L) {
        break label117;
      }
      if (this.z.a(this.I) != null) {
        break;
      }
      ((baa)localObject).a(false);
      return;
    }
    ape localape = ape.a();
    if (this.O) {}
    for (i1 = 29;; i1 = 54)
    {
      paramString = new apd(i1);
      paramString.h = A();
      localape.a(paramString);
      label117:
      this.z.a(this.I.a, (baa)localObject, false);
      break;
    }
  }
  
  private void g()
  {
    x();
    if (this.i.w)
    {
      a(getString(b.aT), this.w);
      a(null);
      return;
    }
    a(getString(b.bb, new Object[] { this.H.a }), this.w);
    label74:
    apd localapd;
    if (this.O)
    {
      i1 = 19;
      localapd = new apd(i1).a(this.H.b.j);
      localapd.h = A();
      if ((!this.L) && (this.e != -1)) {
        localapd.a(this.e);
      }
      ape.a().a(localapd);
      if (this.H.g)
      {
        ape localape = ape.a();
        if (!this.O) {
          break label238;
        }
        i1 = 28;
        label160:
        localapd = new apd(i1);
        localapd.h = A();
        localape.a(localapd);
      }
      if (!this.O) {
        break label244;
      }
    }
    label238:
    label244:
    for (int i1 = 20;; i1 = 43)
    {
      localapd = new apd(i1);
      localapd.h = A();
      this.J.a(this.H, new anm(this, localapd));
      break;
      i1 = 42;
      break label74;
      i1 = 51;
      break label160;
    }
  }
  
  public aph A()
  {
    return null;
  }
  
  public final bdb B()
  {
    TimeZone localTimeZone = TimeZone.getDefault();
    bdb localbdb;
    if (this.i.W != null)
    {
      Iterator localIterator = this.i.W.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localbdb = (bdb)localIterator.next();
      } while (!localbdb.a.equals(localTimeZone.getID()));
    }
    for (;;)
    {
      return localbdb;
      localTimeZone.getID();
      localbdb = null;
    }
  }
  
  public final bcz C()
  {
    Object localObject = blj.c();
    Locale localLocale = Locale.getDefault();
    bcz localbcz;
    if (this.i.X != null)
    {
      Iterator localIterator = this.i.X.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localbcz = (bcz)localIterator.next();
      } while (!localbcz.a.equals(localObject));
    }
    for (;;)
    {
      return localbcz;
      localObject = this.i.X.iterator();
      for (;;)
      {
        if (((Iterator)localObject).hasNext())
        {
          localbcz = (bcz)((Iterator)localObject).next();
          if (localbcz.a.equals(localLocale.getLanguage())) {
            break;
          }
        }
      }
      localLocale.getDisplayName();
      localbcz = null;
    }
  }
  
  public final String D()
  {
    return this.i.b;
  }
  
  public final String E()
  {
    return blx.a(this, this.i);
  }
  
  public final bdf F()
  {
    return this.i;
  }
  
  protected final void a(int paramInt, String paramString, apd paramapd, boolean paramBoolean, aoo paramaoo)
  {
    if (paramInt == -99) {}
    int i1;
    label89:
    do
    {
      return;
      if (paramapd != null)
      {
        paramapd.h = A();
        ape.a().a(paramapd.a(0));
      }
      paramapd = null;
      switch (paramInt)
      {
      case -7: 
      case -6: 
      case -5: 
      case -4: 
      case -3: 
      default: 
        i1 = b.bw;
        w();
        String str = getString(i1, new Object[] { Integer.valueOf(paramInt) });
        paramString = String.format(Locale.ROOT, String.valueOf(paramString).concat(": %s (%d)"), new Object[] { str, Integer.valueOf(paramInt) });
        SetupApplication.a().c(paramString);
        paramString = a(str, paramBoolean, paramaoo);
      }
    } while (paramString == null);
    paramaoo = new anj(this, paramaoo, paramBoolean);
    if (paramapd != null)
    {
      paramString.setTitle(b.aQ);
      paramString.setNegativeButton(b.H, paramaoo);
      paramString.setPositiveButton(b.K, new ank(this, paramapd));
    }
    for (;;)
    {
      paramString.show();
      break;
      i1 = b.bv;
      break label89;
      i1 = b.bA;
      break label89;
      i1 = b.aO;
      break label89;
      if (blr.e(this))
      {
        i1 = b.aP;
        paramapd = blr.f(this);
        break label89;
      }
      i1 = b.aO;
      break label89;
      paramString.setPositiveButton(b.I, paramaoo);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    int i2 = 0;
    this.s = ((ViewFlipper)findViewById(f.ev));
    this.g = ((TextView)findViewById(f.dd));
    if (paramBundle != null)
    {
      this.h = paramBundle.getString("device");
      this.j = paramBundle.getString("deviceIpAddress");
      this.i = ((bdf)paramBundle.getParcelable("deviceConfiguration"));
      this.k = paramBundle.getString("wifiDeviceIp");
      this.n = ((bfs)paramBundle.getParcelable("androidNetwork"));
      this.r = paramBundle.getParcelableArrayList("scannedNetworks");
    }
    if (this.h == null) {
      this.h = getIntent().getStringExtra("device");
    }
    if (this.j == null) {
      this.j = getIntent().getStringExtra("deviceIpAddress");
    }
    if (this.i == null) {
      this.i = ((bdf)getIntent().getParcelableExtra("deviceConfiguration"));
    }
    if (this.n == null) {
      this.n = blr.b(this);
    }
    if (this.k == null) {
      this.k = this.j;
    }
    if (!this.i.w) {
      this.e = blr.d(this);
    }
    boolean bool;
    Object localObject;
    label294:
    int i1;
    if ((this.O) && (!this.i.w))
    {
      bool = true;
      this.l = bool;
      this.o = getIntent().getStringExtra("hotspotSsid");
      this.z = SetupApplication.a().l();
      String str = this.k;
      int i3 = this.i.a;
      if (this.n != null) {
        break label468;
      }
      localObject = null;
      if (!this.l) {
        break label479;
      }
      i1 = bew.d;
      label306:
      this.p = new bdu(str, i3, (String)localObject, i1, A());
      localObject = getResources();
      this.A = ((Resources)localObject).getInteger(a.fd);
      this.B = ((Resources)localObject).getInteger(a.fe);
      this.C = ((Resources)localObject).getInteger(a.ff);
      this.x = new Handler();
      this.D = ((Resources)localObject).getInteger(a.fh);
      this.E = ((Resources)localObject).getInteger(a.fi);
      this.F = ((Resources)localObject).getInteger(a.fg);
      d().a().b(true);
      if (paramBundle != null)
      {
        i1 = paramBundle.getInt("viewIndex", 0);
        if (i1 != 1) {
          break label487;
        }
        i1 = i2;
      }
    }
    label468:
    label479:
    label487:
    for (;;)
    {
      this.f = i1;
      this.s.setDisplayedChild(this.f);
      return;
      bool = false;
      break;
      localObject = this.n.a;
      break label294;
      i1 = bew.a;
      break label306;
    }
  }
  
  public final void a(aop paramaop)
  {
    Object localObject = SetupApplication.a().d();
    if ((localObject != null) && (this.i.U != null))
    {
      localObject = ((bkg)localObject).a(this.i.U.a, this.i.V);
      if (localObject != null)
      {
        localObject = a.a(this.i, (X509Certificate)localObject);
        if (!TextUtils.isEmpty(((CertInfo)localObject).mSetupPINCode)) {
          this.q = ((CertInfo)localObject).mSetupPINCode;
        }
        if (((CertInfo)localObject).mCertOK) {
          paramaop.a();
        }
      }
    }
    for (;;)
    {
      return;
      SetupApplication.a().c("Could not authenticate device");
      localObject = ((CertInfo)localObject).b;
      w();
      if (!isFinishing())
      {
        localObject = new AlertDialog.Builder(this).setView(blx.a(this, getString(b.an), new String[] { getString(b.dF), getString(b.dG) })).setPositiveButton(b.I, new aom(this)).setCancelable(true).setOnCancelListener(new aol(this));
        if (SetupApplication.f()) {
          ((AlertDialog.Builder)localObject).setNeutralButton(b.dW, new aon(this, paramaop));
        }
        ((AlertDialog.Builder)localObject).show();
      }
    }
  }
  
  public final void a(bdm parambdm, aop paramaop, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.O) {}
    for (int i1 = 18;; i1 = 36)
    {
      apd localapd = new apd(i1);
      localapd.h = A();
      i1 = 10222;
      if (paramBoolean1) {
        i1 = 14318;
      }
      parambdm.a(i1, Locale.getDefault(), paramBoolean2, new aoi(this, localapd, paramaop));
      return;
    }
  }
  
  public final void a(bdm parambdm, String paramString, aop paramaop)
  {
    if (this.O) {}
    for (int i1 = 52;; i1 = 53)
    {
      parambdm.a(this, paramString, new aoj(this, new apd(i1), paramaop));
      return;
    }
  }
  
  public final void a(bdm parambdm, HashMap paramHashMap, bfs parambfs, aop paramaop)
  {
    this.G = new azg(this.h, this.O, A());
    this.G.d = paramHashMap;
    if (this.O) {
      SetupApplication.a().g = this.G;
    }
    this.J = parambdm;
    this.K = paramaop;
    this.u = false;
    if (parambfs != null)
    {
      this.I = parambfs;
      this.H = new bfs(parambfs);
      if (!this.H.b.k) {}
    }
    try
    {
      parambdm = bfs.a(this.H.e, this.i.r);
      this.H.e = parambdm;
      this.H.f = true;
      if (this.n != null) {
        break label179;
      }
      this.L = true;
    }
    catch (GeneralSecurityException parambdm)
    {
      for (;;)
      {
        this.t.a(parambdm, "Failed to encrypt password", new Object[0]);
        e(getString(b.bu));
        continue;
        if (!parambfs.a.equals(this.n.a))
        {
          this.L = true;
          new AlertDialog.Builder(this).setTitle(b.ed).setMessage(getString(b.ec, new Object[] { this.n.a, parambfs.a })).setPositiveButton(b.I, new anl(this)).setNegativeButton(b.H, null).setCancelable(true).show();
        }
        else
        {
          this.L = false;
        }
      }
    }
    g();
  }
  
  public final void a(String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    this.g.setText(paramString);
    if (this.s.getDisplayedChild() != 1) {
      this.s.setDisplayedChild(1);
    }
    this.v = paramOnCancelListener;
    d().f();
  }
  
  public final void a(HashMap paramHashMap, aop paramaop, int paramInt)
  {
    if (paramInt != -1) {}
    for (apd localapd = new apd(paramInt);; localapd = null)
    {
      x();
      this.p.a(paramHashMap, this.i, new ang(this, localapd, paramaop));
      return;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, bdm parambdm, String paramString)
  {
    boolean bool = true;
    int i1 = paramMenuItem.getItemId();
    if (i1 == 16908332) {
      finish();
    }
    for (;;)
    {
      return bool;
      if (i1 == f.bR)
      {
        a(parambdm, bfk.a, getString(b.aE, new Object[] { this.i.b }), paramString);
      }
      else if (i1 == f.bT)
      {
        a(parambdm, bfk.b, getString(b.aF, new Object[] { this.i.b }), paramString);
      }
      else if (i1 == f.bM)
      {
        a(getString(b.bH), this.w);
        x();
        parambdm.d(new aof(this));
      }
      else if (i1 == f.bN)
      {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(b.cH))));
      }
      else if (i1 == f.bU)
      {
        bkq.a(this, b_());
      }
      else if (i1 == f.bV)
      {
        bkq.a(this, this);
      }
      else
      {
        bool = super.onOptionsItemSelected(paramMenuItem);
      }
    }
  }
  
  public final boolean a(bfs parambfs)
  {
    boolean bool = false;
    if (TextUtils.isEmpty(parambfs.a)) {
      e(getString(b.bL));
    }
    for (;;)
    {
      return bool;
      switch (aoh.b[parambfs.b.ordinal()])
      {
      default: 
        e(getString(b.cd));
        break;
      case 2: 
      case 3: 
        if ((TextUtils.isEmpty(parambfs.e)) || (parambfs.e.length() < 5)) {
          e(getString(b.dX));
        }
        break;
      case 4: 
      case 5: 
      case 6: 
      case 7: 
        if ((TextUtils.isEmpty(parambfs.e)) || (parambfs.e.length() < 8)) {
          e(getString(b.ex));
        }
        break;
      case 1: 
        bool = true;
      }
    }
  }
  
  public final ArrayList b_()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new bko(this.i.b, this.i.c, this.j, this.i.F));
    return localArrayList;
  }
  
  public Intent e()
  {
    return null;
  }
  
  public final void e(String paramString)
  {
    w();
    paramString = a(paramString, false, null);
    if (paramString != null)
    {
      paramString.setPositiveButton(b.I, new aod(this, null));
      paramString.show();
    }
  }
  
  public void onBackPressed()
  {
    if (this.s.getDisplayedChild() == 1)
    {
      if (this.y != null) {
        this.x.removeCallbacks(this.y);
      }
      this.u = true;
      v();
      if (this.v != null) {
        this.v.onCancel(null);
      }
    }
    for (;;)
    {
      return;
      w();
      continue;
      super.onBackPressed();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (blx.a(paramInt)) {}
    for (boolean bool = true;; bool = super.onKeyDown(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (blx.a(paramInt, this)) {}
    for (boolean bool = true;; bool = super.onKeyUp(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    if (this.s.getDisplayedChild() != 1) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramMenu, f.bR, bool);
      a(paramMenu, f.bT, bool);
      a(paramMenu, f.bM, bool);
      a(paramMenu, f.bN, bool);
      a(paramMenu, f.bU, bkq.a());
      return true;
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("device", this.h);
    paramBundle.putString("deviceIpAddress", this.j);
    paramBundle.putParcelable("deviceConfiguration", this.i);
    paramBundle.putString("wifiDeviceIp", this.k);
    paramBundle.putParcelable("androidNetwork", this.n);
    paramBundle.putInt("viewIndex", this.f);
    paramBundle.putParcelableArrayList("scannedNetworks", this.r);
  }
  
  public void onStop()
  {
    super.onStop();
    this.u = true;
    v();
    this.z.a();
  }
  
  public final boolean t()
  {
    if ((this.r != null) && (!this.r.isEmpty())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final List u()
  {
    return this.r;
  }
  
  public void v()
  {
    this.p.b = SystemClock.elapsedRealtime();
  }
  
  public final void w()
  {
    if (this.s.getDisplayedChild() == 1)
    {
      this.s.setDisplayedChild(this.f);
      d().f();
    }
  }
  
  public final void x()
  {
    this.N = getRequestedOrientation();
    int i1 = blx.c(this);
    if (i1 != -1) {
      setRequestedOrientation(i1);
    }
    getWindow().addFlags(128);
  }
  
  public final void y()
  {
    setRequestedOrientation(this.N);
    getWindow().clearFlags(128);
  }
  
  public final bdu z()
  {
    return this.p;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\and.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
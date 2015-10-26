package com.google.android.apps.chromecast.app.setup;

import a;
import af;
import and;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CheckBox;
import aoc;
import apd;
import ape;
import aph;
import at;
import auv;
import ava;
import azj;
import azl;
import b;
import bdf;
import bdi;
import bdj;
import bdk;
import bdm;
import bdu;
import bew;
import bfs;
import bgo;
import bgr;
import bgt;
import bgu;
import bgz;
import bha;
import bhd;
import bil;
import bim;
import bip;
import biq;
import bis;
import bit;
import biu;
import biv;
import bix;
import biy;
import bjd;
import bje;
import bjh;
import bjk;
import bjl;
import bjn;
import bjo;
import bjp;
import bjq;
import bjs;
import bjt;
import bkh;
import blf;
import blj;
import blp;
import blv;
import blx;
import bok;
import bos;
import com.google.android.apps.chromecast.app.HelpActivity;
import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.apps.chromecast.app.setup.ota.OtaErrorActivity;
import com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity;
import dan;
import f;
import j;
import java.util.HashMap;
import java.util.Timer;
import m;
import mj;
import nf;
import nh;
import r;
import t;

public class DeviceSetupActivity
  extends and
  implements bgu, bgz, bjd, bjk, bjn, bjt
{
  private boolean A;
  private BluetoothDevice B;
  private BluetoothAdapter C;
  private boolean D = false;
  private bje E;
  private boolean F;
  private boolean G;
  private int H = -1;
  private int I = biv.a;
  private int J = biv.a;
  private Long K = null;
  private boolean L = false;
  private Handler M = null;
  private Runnable N = new bim(this);
  public bdm e;
  public aph f;
  private bha g;
  private azj v;
  private boolean w = false;
  private boolean x = false;
  private String y;
  private Boolean z;
  
  public DeviceSetupActivity()
  {
    super("DeviceSetupActivity", true);
  }
  
  private void G()
  {
    runOnUiThread(new biu(this));
  }
  
  private void H()
  {
    t localt = this.b;
    Object localObject = localt.a("loadingFragment");
    if (localObject != null) {
      localt.a().a((j)localObject).b();
    }
    localObject = localt.a("otaWaitFragment");
    if ((localObject instanceof biy))
    {
      localObject = (biy)localObject;
      if ((!((biy)localObject).b) || (((biy)localObject).a.isPlaying())) {
        this.J = biv.c;
      }
    }
    for (;;)
    {
      return;
      ((biy)localObject).a.getCurrentPosition();
      ((biy)localObject).a.start();
      ((biy)localObject).q();
      break;
      this.t.b("Expected the video to be visible but wasn't", new Object[0]);
    }
  }
  
  private boolean I()
  {
    boolean bool = true;
    bdf localbdf = this.i;
    int i;
    if (localbdf.a >= 7)
    {
      i = 1;
      if ((i == 0) || (localbdf.b() == bdi.c)) {
        break label39;
      }
    }
    for (;;)
    {
      return bool;
      i = 0;
      break;
      label39:
      bool = false;
    }
  }
  
  private void J()
  {
    a(this.b.a());
  }
  
  private void K()
  {
    if ((this.K != null) && (this.M == null) && (this.J != biv.b) && (this.J != biv.c))
    {
      long l = this.K.longValue() - SystemClock.elapsedRealtime();
      if (l > 0L)
      {
        this.M = new Handler();
        this.M.postAtTime(this.N, SystemClock.uptimeMillis() + l);
      }
    }
  }
  
  private void L()
  {
    if (this.M != null)
    {
      this.M.removeCallbacks(this.N);
      this.M = null;
    }
  }
  
  private boolean M()
  {
    boolean bool;
    if (this.K == null) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      if ((this.J == biv.b) || (this.J == biv.c))
      {
        bool = false;
      }
      else if (this.K.longValue() < SystemClock.elapsedRealtime())
      {
        this.K = null;
        t localt = this.b;
        Object localObject = (bjq)localt.a("otaWaitFragment");
        int i = blf.n(this);
        if ((localObject == null) || (((bjq)localObject).c >= i))
        {
          bool = false;
        }
        else
        {
          i = ((bjq)localObject).c;
          af localaf = localt.a();
          localObject = localt.a("pollOtaFragment");
          if (localObject != null)
          {
            localaf.a((j)localObject);
            this.I = biv.d;
          }
          localt.b(null, 1);
          localaf.a(f.ai, bjs.a(b.ct, b.cs, true));
          localaf.b();
          bool = true;
        }
      }
      else
      {
        bool = false;
      }
    }
  }
  
  private void N()
  {
    startActivity(OtaErrorActivity.a(this, this.i.h, this.f));
    finish();
  }
  
  public static Intent a(Context paramContext, String paramString1, String paramString2, bdf parambdf, int paramInt, long paramLong, String paramString3, BluetoothDevice paramBluetoothDevice)
  {
    paramContext = new Intent(paramContext, DeviceSetupActivity.class);
    paramContext.putExtra("device", paramString1);
    paramContext.putExtra("deviceIpAddress", paramString2);
    paramContext.putExtra("deviceConfiguration", parambdf);
    paramContext.putExtra("devicePosition", paramInt);
    paramContext.putExtra("scanStart", paramLong);
    paramContext.putExtra("hotspotSsid", paramString3);
    paramContext.putExtra("bleDevice", paramBluetoothDevice);
    return paramContext;
  }
  
  private void a(af paramaf)
  {
    K();
    paramaf.b(f.ai, bix.a(I()), "otaWaitFragment").b();
  }
  
  private void b(bfs parambfs)
  {
    if ((parambfs != null) && (!a(parambfs))) {
      return;
    }
    HashMap localHashMap = new HashMap();
    if ((this.y != null) && (!this.y.equals(D()))) {
      localHashMap.put("friendly_name", this.y);
    }
    Object localObject = B();
    if (localObject != null) {
      localHashMap.put("timezone", localObject);
    }
    if (DateFormat.is24HourFormat(this))
    {
      localObject = bdk.b;
      label83:
      localHashMap.put("time_format", localObject);
      localObject = C();
      if (localObject != null) {
        localHashMap.put("locale", localObject);
      }
      if (this.z != null) {
        localHashMap.put("opt_in_opencast", this.z);
      }
      localHashMap.put("opt_in_stats", Boolean.valueOf(this.A));
      if (!localHashMap.isEmpty()) {
        break label191;
      }
    }
    label191:
    for (localObject = null;; localObject = localHashMap)
    {
      this.w = false;
      n();
      a(this.e, (HashMap)localObject, parambfs, new bit(this, parambfs));
      break;
      localObject = bdk.a;
      break label83;
    }
  }
  
  private void n()
  {
    if (this.w)
    {
      if (this.v == null) {
        this.v = new azj(this, this.e);
      }
      azj localazj = this.v;
      if (localazj.a == null)
      {
        localazj.a = new Timer();
        localazj.a.schedule(new azl(localazj), localazj.d, localazj.d);
      }
    }
    for (;;)
    {
      return;
      if (this.v != null) {
        this.v.a();
      }
    }
  }
  
  private void o()
  {
    if (this.E != null) {
      this.E.a();
    }
  }
  
  private bdm p()
  {
    bdu localbdu = new bdu("192.168.255.249", this.i.a, this.o, bew.d, this.f);
    localbdu.g = true;
    if (!TextUtils.isEmpty(localbdu.f)) {
      localbdu.h.j = localbdu.f;
    }
    return localbdu;
  }
  
  private bdm q()
  {
    return new ava(new auv(this.B, this), this.i, this);
  }
  
  private void r()
  {
    x();
    a(this.e, new bil(this), true, this.e.c());
  }
  
  private void s()
  {
    a(new bip(this));
  }
  
  public final aph A()
  {
    return this.f;
  }
  
  public final void a()
  {
    finish();
  }
  
  public final void a(int paramInt)
  {
    int i = 2;
    Object localObject1 = null;
    t localt = this.b;
    af localaf = localt.a();
    Object localObject3 = new apd(139);
    switch (bin.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException("Unrecognized setup flow state");
    case 1: 
      if (this.D)
      {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
        if (localObject1 != null) {
          d().a().a((CharSequence)localObject1);
        }
        localaf.b();
      }
      break;
    }
    for (;;)
    {
      return;
      a(getString(b.aR, new Object[] { D() }), new biq(this));
      Object localObject2 = getString(b.aD, new Object[] { D() });
      localaf.a(localt.a(f.ai));
      if (this.H == 1)
      {
        localObject1 = ape.a();
        paramInt = i;
        if (this.C != null)
        {
          paramInt = i;
          if (this.C.isEnabled()) {
            paramInt = 1;
          }
        }
        ((ape)localObject1).a(((apd)localObject3).a(paramInt));
        if ((this.C == null) || (!this.C.isEnabled())) {
          break label292;
        }
        blx.a();
      }
      for (;;)
      {
        localObject1 = localObject2;
        if (this.e == null) {
          break;
        }
        G();
        localObject1 = localObject2;
        break;
        label292:
        this.e = p();
      }
      w();
      if (!this.i.h)
      {
        this.x = true;
        a(0L);
        localaf.a(f.ai, new bgt());
        break;
      }
      if (this.l)
      {
        this.w = true;
        n();
        localaf.a(f.ai, bhd.a(this.q));
        break;
      }
      this.x = false;
      o();
      localaf.b(f.ai, bgo.a(this.e.b()), "configureDeviceFragment");
      break;
      this.x = false;
      o();
      localObject2 = (bgo)localt.a("configureDeviceFragment");
      this.y = ((bgo)localObject2).p();
      if (((bgo)localObject2).a == null) {}
      for (localObject1 = null;; localObject1 = Boolean.valueOf(((bgo)localObject2).a.isChecked()))
      {
        this.z = ((Boolean)localObject1);
        this.A = ((bgo)localObject2).b.isChecked();
        localObject1 = getString(b.aD, new Object[] { this.y });
        if (!this.i.w) {
          break label520;
        }
        b(null);
        break;
      }
      label520:
      localaf.b(f.ai, bgr.a(this.n, this.e.b()), "configureWifiFragment").a(null);
      break;
      b(((bgr)localt.a("configureWifiFragment")).a.a());
      continue;
      d().a().a(null);
      d().a().d();
      blx.h(this);
      if (this.m == bdj.p) {}
      for (paramInt = 1;; paramInt = 0)
      {
        localt.b(null, 1);
        if (paramInt != 0) {
          break label653;
        }
        localaf.a(f.ai, bjp.a(this.i.m));
        break;
      }
      label653:
      if (!I())
      {
        a(localaf);
      }
      else
      {
        long l = blf.o(this);
        if (l > 0L) {
          this.K = Long.valueOf(l + SystemClock.elapsedRealtime());
        }
        localaf.a(bjh.a(blf.i(this), blf.j(this), blf.k(this)), "pollOtaFragment");
        if (this.i.h)
        {
          a(localaf);
        }
        else if (!SetupApplication.g())
        {
          a(localaf);
        }
        else
        {
          localObject3 = biy.a(blf.a(this, SetupApplication.a().c, blj.b()));
          localObject2 = bok.b(a.gz);
          localaf.b(f.ai, (j)localObject3, "otaWaitFragment").a(f.ai, (j)localObject2, "loadingFragment");
          break;
          localObject2 = localt.a("pollOtaFragment");
          if (localObject2 != null) {
            localaf.a((j)localObject2);
          }
          localObject3 = this.i;
          localObject2 = bkh.a().h.a(null, true, ((bdf)localObject3).b());
          if (localObject2 != null)
          {
            startActivityForResult(TutorialOtaActivity.a(this, (dan)localObject2, (bdf)localObject3, I(), this.f), 2);
            break;
          }
          localaf.a(f.ai, bjp.a(this.i.m));
          break;
          localaf.a(f.ai, bjp.a(this.i.m));
          break;
          startActivity(SetupApplication.a(this, SetupApplication.h()));
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.t.a("Couldn't play video. Showing static update screen instead. MediaPlayer error: %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.J = biv.d;
    if (!M()) {
      J();
    }
  }
  
  public final void a(long paramLong)
  {
    if (this.E == null) {
      this.E = new bje(this.e);
    }
    bje localbje = this.E;
    localbje.a();
    localbje.e = true;
    localbje.a.postDelayed(localbje.b, paramLong);
  }
  
  public final void a_(String paramString)
  {
    SetupApplication.a().c = paramString;
    if (!isFinishing()) {
      r();
    }
  }
  
  public final void a_(boolean paramBoolean)
  {
    int i = 1;
    o();
    if (this.F) {
      return;
    }
    this.F = true;
    this.e.a(new aoc(this, new bis(this)), 1);
    ape localape = ape.a();
    apd localapd = new apd(155);
    if (paramBoolean) {}
    for (;;)
    {
      localapd = localapd.a(i);
      localapd.h = this.f;
      localape.a(localapd);
      break;
      i = 0;
    }
  }
  
  public final void b(int paramInt)
  {
    this.I = biv.b;
    if (this.J == biv.b) {
      H();
    }
    bjq localbjq = (bjq)this.b.a("otaWaitFragment");
    if (localbjq != null) {
      localbjq.b(paramInt);
    }
    if (this.L)
    {
      this.L = false;
      if (!M()) {
        K();
      }
    }
  }
  
  public final void g()
  {
    this.J = biv.b;
    if (this.I == biv.b) {
      H();
    }
  }
  
  public final void h()
  {
    this.J = biv.d;
    if (this.I == biv.d) {
      a(bjo.g);
    }
    for (;;)
    {
      return;
      if (!M()) {
        J();
      }
    }
  }
  
  public final void i()
  {
    this.I = biv.d;
    if (this.J == biv.c) {}
    for (;;)
    {
      return;
      this.K = null;
      L();
      a(bjo.g);
    }
  }
  
  public final void j()
  {
    i();
  }
  
  public final void k()
  {
    this.K = null;
    L();
    N();
  }
  
  public final void l()
  {
    finish();
  }
  
  public final void m()
  {
    if (this.i.h) {}
    for (String str = blf.p(this);; str = blf.q(this))
    {
      startActivity(HelpActivity.a(this, str));
      finish();
      return;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      this.D = false;
      this.H = paramInt1;
    }
    for (;;)
    {
      return;
      if (paramInt1 == 2) {
        if (paramInt2 == 0)
        {
          if ((paramIntent != null) && (paramIntent.getBooleanExtra("hadError", false))) {
            N();
          } else {
            finish();
          }
        }
        else if (paramInt2 == -1) {
          this.H = paramInt1;
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.fV);
    blx.g(this);
    a((Toolbar)findViewById(f.eo));
    a(paramBundle);
    if (isFinishing()) {
      return;
    }
    if (paramBundle != null) {
      this.B = ((BluetoothDevice)paramBundle.getParcelable("bleDevice"));
    }
    blx.a();
    if (this.B == null) {
      this.B = ((BluetoothDevice)getIntent().getParcelableExtra("bleDevice"));
    }
    label107:
    Object localObject;
    if (this.i.w)
    {
      this.e = this.p;
      localObject = this.b;
      if (paramBundle != null) {
        break label321;
      }
      d().a().a(getString(b.by, new Object[] { D() }));
      paramBundle = bjl.a(getIntent().getIntExtra("devicePosition", -1), getIntent().getLongExtra("scanStart", 0L));
      localObject = ((r)localObject).a();
      if ((this.l) && (this.n != null))
      {
        this.g = bha.a(this.o, this.n.a);
        ((af)localObject).a(this.g, "hotspotManagerTag");
      }
      ((af)localObject).a(f.ai, paramBundle).b();
    }
    for (;;)
    {
      if (this.f == null) {
        this.f = new aph();
      }
      this.f.a(this.i, this.e instanceof ava);
      break;
      if ((this.B != null) && (this.C != null) && (this.C.isEnabled()))
      {
        this.e = q();
        break label107;
      }
      blx.a();
      this.e = p();
      break label107;
      label321:
      this.w = paramBundle.getBoolean("setupStarted");
      this.x = paramBundle.getBoolean("playSound");
      localObject = paramBundle.getCharSequence("actionBarTitle");
      d().a().a((CharSequence)localObject);
      if (localObject == null)
      {
        d().a().d();
        blx.h(this);
      }
      this.q = paramBundle.getString("setupPinCode");
      this.y = paramBundle.getString("friendlyName");
      this.H = paramBundle.getInt("lastActivityResultRequestCode");
      if (paramBundle.containsKey("enableOpencast")) {
        this.z = Boolean.valueOf(paramBundle.getBoolean("enableOpencast"));
      }
      this.A = paramBundle.getBoolean("statsOptIn");
      this.f = ((aph)paramBundle.getParcelable("deviceSetupSession"));
      this.I = biv.a()[paramBundle.getInt("pollingState")];
      this.J = biv.a()[paramBundle.getInt("videoState")];
      if (paramBundle.containsKey("checkOtaSlowTimestamp")) {
        this.K = Long.valueOf(paramBundle.getLong("checkOtaSlowTimestamp"));
      }
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    super.onCreateOptionsMenu(paramMenu);
    getMenuInflater().inflate(a.hd, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 16908332)
    {
      paramMenuItem = at.a(this);
      paramMenuItem.setFlags(67108864);
      at.b(this, paramMenuItem);
    }
    for (;;)
    {
      return true;
      a(paramMenuItem, this.e, null);
    }
  }
  
  public void onPause()
  {
    if (this.v != null) {
      this.v.a();
    }
    if (this.E != null) {
      this.E.a();
    }
    L();
    super.onPause();
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    switch (this.H)
    {
    }
    for (;;)
    {
      return;
      a(bjo.a);
      this.H = -1;
      continue;
      a(bjo.h);
      this.H = -1;
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    this.G = false;
    n();
    if (this.x) {
      a(0L);
    }
    if ((this.K != null) && (this.M == null)) {
      this.L = true;
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("setupStarted", this.w);
    paramBundle.putBoolean("playSound", this.x);
    paramBundle.putCharSequence("actionBarTitle", d().a().a());
    paramBundle.putString("setupPinCode", this.q);
    paramBundle.putString("friendlyName", this.y);
    paramBundle.putInt("lastActivityResultRequestCode", this.H);
    if (this.z != null) {
      paramBundle.putBoolean("enableOpencast", this.z.booleanValue());
    }
    paramBundle.putBoolean("statsOptIn", this.A);
    paramBundle.putParcelable("deviceSetupSession", this.f);
    paramBundle.putParcelable("bleDevice", this.B);
    paramBundle.putInt("pollingState", this.I - 1);
    paramBundle.putInt("videoState", this.J - 1);
    if (this.K != null) {
      paramBundle.putLong("checkOtaSlowTimestamp", this.K.longValue());
    }
    this.G = true;
  }
  
  public final void v()
  {
    super.v();
    if ((!this.i.w) && (this.e != null)) {
      this.e.a();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\setup\DeviceSetupActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.apps.chromecast.app;

import a;
import af;
import alm;
import alt;
import ama;
import ami;
import amo;
import amq;
import amr;
import ams;
import amv;
import amw;
import amx;
import amz;
import ana;
import anb;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import aoq;
import aou;
import aov;
import aow;
import apd;
import ape;
import apg;
import aqu;
import atf;
import awr;
import axb;
import axd;
import axm;
import ayz;
import b;
import bah;
import baq;
import bat;
import bcn;
import bgb;
import bko;
import blp;
import blr;
import blx;
import bod;
import bof;
import boh;
import com.google.android.apps.chromecast.app.widget.SlidingTabLayout;
import dat;
import dax;
import dbb;
import dev;
import f;
import j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import m;
import mm;
import mn;
import r;
import t;

public class MainActivity
  extends mm
  implements ami, aoq, aou, aov, axb, axm, baq
{
  public AlertDialog e;
  public bah f;
  private int g = 0;
  private final List h = new ArrayList(3);
  private View i;
  private ayz j;
  private axd k;
  private bcn l;
  private alm m;
  private WifiManager n;
  private ViewPager o;
  private anb p;
  private ama q;
  private boolean r;
  private BroadcastReceiver s;
  private blp t = new blp("MainActivity");
  private int u;
  
  private void n()
  {
    if (this.q != null) {
      this.q.q();
    }
  }
  
  public final ayz a()
  {
    t localt = this.b;
    ayz localayz2 = (ayz)localt.a("scannerFragment");
    ayz localayz1 = localayz2;
    if (localayz2 == null)
    {
      localayz1 = new ayz();
      localt.a().a(localayz1, "scannerFragment").b();
    }
    return localayz1;
  }
  
  public final void a(ana paramana)
  {
    int i2 = this.h.indexOf(paramana);
    paramana = this.o;
    int i1 = i2;
    if (i2 == -1) {
      i1 = 0;
    }
    paramana.a(i1);
  }
  
  public final void a(String paramString1, String paramString2, dbb paramdbb)
  {
    apg localapg = apg.a(119);
    localapg.c = paramString1;
    localapg.b = paramString2;
    localapg.b();
    paramString1 = awr.a(paramString1, paramdbb, false);
    this.b.a().a(f.bk, paramString1, "detailsFragment").a(4097).a("MainActivity").b();
  }
  
  public final ArrayList b_()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.m.d().iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(new bko((aow)localIterator.next()));
    }
    return localArrayList;
  }
  
  public final Intent e()
  {
    Intent localIntent;
    if (this.h.get(this.g) == ana.b)
    {
      localIntent = new Intent(this, HelpActivity.class);
      localIntent.putExtra("stringTitle", getString(b.bk));
      localIntent.putExtra("urlPatternLink", new String[] { getString(b.dF), getString(b.dG) });
      localIntent.putExtra("stringBody", getString(b.bj));
    }
    for (;;)
    {
      return localIntent;
      localIntent = HelpActivity.a(this, getString(b.dG));
    }
  }
  
  public void enableWifi(View paramView)
  {
    paramView = new apd(10);
    ape.a().a(paramView.a(1));
    Toast.makeText(this, b.dB, 0).show();
    registerReceiver(new amz(this), new IntentFilter("android.net.wifi.supplicant.CONNECTION_CHANGE"));
    this.n.setWifiEnabled(true);
    n();
  }
  
  public final axd g()
  {
    return this.k;
  }
  
  public final bcn h()
  {
    return this.l;
  }
  
  public final void i()
  {
    this.i.setVisibility(0);
  }
  
  public final void j()
  {
    this.i.setVisibility(8);
  }
  
  public final boolean k()
  {
    int i1 = this.n.getWifiState();
    if ((i1 == 3) || (i1 == 2)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void l()
  {
    if (SetupApplication.f()) {}
    for (;;)
    {
      return;
      this.u += 1;
      if (this.u == 7)
      {
        SetupApplication.b(1);
        Toast.makeText(this, b.aI, 0).show();
        startActivity(SetupApplication.a(this, ana.b));
      }
    }
  }
  
  public final void m()
  {
    startActivity(new Intent(this, MainActivity.class));
    finish();
    overridePendingTransition(0, 0);
  }
  
  public void onBackPressed()
  {
    if (this.f.e()) {
      this.f.d();
    }
    for (;;)
    {
      return;
      super.onBackPressed();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.f.a(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject1 = PreferenceManager.getDefaultSharedPreferences(this);
    if (((SharedPreferences)localObject1).getBoolean("content_whatson_enabled", true)) {
      this.h.add(ana.a);
    }
    this.h.add(ana.b);
    if (((SharedPreferences)localObject1).getBoolean("content_getapps_enabled", true)) {
      this.h.add(ana.c);
    }
    setContentView(a.gh);
    Object localObject2;
    Object localObject3;
    if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("content_search_enabled", true))
    {
      findViewById(f.eo).setVisibility(8);
      this.i = findViewById(f.dv);
      localObject1 = findViewById(f.du);
      localObject2 = (ImageView)findViewById(f.aX);
      localObject3 = new ams(this, (ImageView)localObject2, (View)localObject1);
      ((ImageView)localObject2).setOnClickListener(new amv(this));
      blx.a(this, (SearchView)this.i.findViewById(f.f), (View)localObject1, (View.OnFocusChangeListener)localObject3);
    }
    int i1;
    for (;;)
    {
      this.f = new bah(this, this, bat.a);
      this.j = a();
      localObject1 = this.b;
      if ((aqu)((r)localObject1).a("backdropScannerFragment") == null)
      {
        localObject2 = new aqu();
        ((r)localObject1).a().a((j)localObject2, "backdropScannerFragment").b();
      }
      this.k = new axd(this, SetupApplication.i());
      localObject1 = blr.c(this);
      this.l = new bcn(SetupApplication.i(), (String)localObject1, paramBundle);
      this.m = SetupApplication.a().b();
      localObject2 = this.m;
      localObject1 = this.l;
      ((alm)localObject2).f.add(localObject1);
      localObject3 = ((alm)localObject2).g.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (aow)((Iterator)localObject3).next();
        if (!TextUtils.isEmpty(((aow)localObject2).q)) {
          ((alt)localObject1).a((aow)localObject2);
        }
      }
      this.i = findViewById(f.eo);
      localObject1 = (Toolbar)this.i;
      i1 = b.M;
      ((Toolbar)localObject1).a(((Toolbar)localObject1).getContext().getText(i1));
      a((Toolbar)this.i);
      findViewById(f.dv).setVisibility(8);
      this.i.setOnClickListener(new amw(this));
    }
    this.n = ((WifiManager)getSystemService("wifi"));
    this.r = blr.a(this);
    this.s = new amx(this);
    if (!SetupApplication.a().b)
    {
      paramBundle = ana.b;
      if ((getIntent() == null) || (!"android.intent.action.SEARCH".equals(getIntent().getAction()))) {
        break label615;
      }
      this.b.a().a(new bgb(), null).b();
    }
    for (;;)
    {
      SetupApplication.a().f.add(this);
      return;
      if (paramBundle != null)
      {
        paramBundle = ana.values()[paramBundle.getInt("tabIndex", ana.a.ordinal())];
        break;
      }
      if (getIntent() != null)
      {
        paramBundle = ana.values()[getIntent().getIntExtra("tabIndex", ana.a.ordinal())];
        break;
      }
      paramBundle = ana.a;
      break;
      label615:
      localObject1 = (SlidingTabLayout)findViewById(f.dS);
      this.o = ((ViewPager)findViewById(f.cL));
      this.p = new anb(this);
      this.o.a(this.p);
      localObject3 = new amo(this);
      localObject2 = ((SlidingTabLayout)localObject1).f;
      ((boh)localObject2).a = ((bof)localObject3);
      ((boh)localObject2).invalidate();
      int i2 = a.gO;
      i1 = f.eg;
      ((SlidingTabLayout)localObject1).a = i2;
      ((SlidingTabLayout)localObject1).b = i1;
      localObject2 = this.o;
      ((SlidingTabLayout)localObject1).f.removeAllViews();
      ((SlidingTabLayout)localObject1).c = ((ViewPager)localObject2);
      if (localObject2 != null)
      {
        ((ViewPager)localObject2).d = new bod((SlidingTabLayout)localObject1);
        ((SlidingTabLayout)localObject1).a();
      }
      ((SlidingTabLayout)localObject1).d = new amq(this);
      ((SlidingTabLayout)localObject1).e = new amr(this);
      this.g = this.h.indexOf(paramBundle);
      if (this.g == -1) {
        this.g = 0;
      }
      this.o.a(this.g);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    SetupApplication.a().f.remove(this);
    alm localalm = this.m;
    bcn localbcn = this.l;
    localalm.f.remove(localbcn);
  }
  
  public void onGetHelpClicked(View paramView)
  {
    startActivity(e());
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
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (this.f.a(paramMenuItem)) {}
    for (boolean bool = true;; bool = super.onOptionsItemSelected(paramMenuItem)) {
      return bool;
    }
  }
  
  public void onPause()
  {
    this.j.a = null;
    unregisterReceiver(this.s);
    super.onPause();
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    this.f.c.c();
  }
  
  public void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    axd localaxd = this.k;
    localaxd.l = paramBundle.getLong("lastUpdatedTime");
    try
    {
      if (paramBundle.containsKey("browseContent"))
      {
        localaxd.c = dat.a(paramBundle.getByteArray("browseContent"));
        localaxd.e = paramBundle.getIntArray("browseScrollPositions");
      }
      if (paramBundle.containsKey("getAppsContent")) {
        localaxd.d = dat.a(paramBundle.getByteArray("getAppsContent"));
      }
      return;
    }
    catch (dev paramBundle)
    {
      for (;;)
      {
        localaxd.f.a("Error parsing content bundle: %s", new Object[] { paramBundle });
      }
    }
  }
  
  public void onResume()
  {
    super.onResume();
    getWindow().setSoftInputMode(3);
    this.u = 0;
    registerReceiver(this.s, new IntentFilter("android.net.wifi.STATE_CHANGE"));
    Object localObject = (TextView)findViewById(a.br);
    if (localObject != null)
    {
      ((TextView)localObject).setText("");
      ((TextView)localObject).clearFocus();
    }
    if ((SetupApplication.a().b) && (k()))
    {
      localObject = this.j;
      ((ayz)localObject).b = true;
      ((ayz)localObject).p();
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    Object localObject = this.k;
    if (((axd)localObject).c != null)
    {
      paramBundle.putByteArray("browseContent", dat.a(((axd)localObject).c));
      paramBundle.putIntArray("browseScrollPositions", ((axd)localObject).e);
    }
    if (((axd)localObject).d != null) {
      paramBundle.putByteArray("getAppsContent", dat.a(((axd)localObject).d));
    }
    paramBundle.putLong("lastUpdatedTime", ((axd)localObject).l);
    localObject = this.l;
    PreferenceManager.getDefaultSharedPreferences(SetupApplication.a()).edit().putString("hiddenOffers", TextUtils.join(",", ((bcn)localObject).d.toArray())).commit();
    if (((bcn)localObject).c != null)
    {
      ArrayList localArrayList = new ArrayList(((bcn)localObject).c.size());
      localArrayList.addAll(((bcn)localObject).c);
      paramBundle.putParcelableArrayList("getAppsOffers", localArrayList);
    }
    if (((bcn)localObject).b != null) {
      ((bcn)localObject).b.cancel(false);
    }
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStart()
  {
    boolean bool = true;
    super.onStart();
    this.f.a();
    axd localaxd = this.k;
    atf localatf = atf.a(localaxd.a);
    if (localatf.f == null) {}
    for (;;)
    {
      localaxd.n = bool;
      localaxd.o.post(localaxd.p);
      return;
      Set localSet = blx.a(localatf.a, localatf.g);
      if ((localSet.size() == localatf.f.b.length) && (localSet.containsAll(Arrays.asList(localatf.f.b))))
      {
        bool = false;
      }
      else
      {
        localatf.f.b = new String[localSet.size()];
        localSet.toArray(localatf.f.b);
        localatf.b();
      }
    }
  }
  
  public void onStop()
  {
    this.f.b();
    axd localaxd = this.k;
    localaxd.o.removeCallbacks(localaxd.p);
    super.onStop();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
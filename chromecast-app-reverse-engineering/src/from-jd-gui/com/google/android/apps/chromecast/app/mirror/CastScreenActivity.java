package com.google.android.apps.chromecast.app.mirror;

import a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import b;
import bah;
import baq;
import bat;
import bbe;
import bbg;
import bbh;
import bbi;
import bbj;
import bbk;
import bbl;
import bbn;
import bbt;
import bbv;
import bko;
import blf;
import blx;
import com.google.android.apps.chromecast.app.HelpActivity;
import com.google.android.gms.cast.CastDevice;
import f;
import i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m;
import mj;
import mm;
import mn;
import nf;
import nh;
import oh;
import oo;
import op;
import r;
import t;
import tx;
import ty;
import tz;
import ua;
import uh;

public class CastScreenActivity
  extends mm
  implements baq, bbt
{
  private static WifiManager u;
  private bah e;
  private Button f;
  private Button g;
  private TextView h;
  private Toast i;
  private final Handler j = new Handler();
  private boolean k;
  private long l;
  private boolean m;
  private boolean n;
  private boolean o;
  private boolean p;
  private bbn q;
  private final ua r = new bbk(this);
  private tx s;
  private final op t = new bbv();
  private final Runnable v = new bbe(this);
  private BroadcastReceiver w = new bbh(this);
  
  private void h()
  {
    this.j.removeCallbacks(this.v);
    this.l = 0L;
  }
  
  private void i()
  {
    if (!this.k) {}
    for (;;)
    {
      return;
      h();
      Object localObject = tz.a();
      if (localObject != null)
      {
        localObject = ((List)localObject).iterator();
        for (;;)
        {
          if (((Iterator)localObject).hasNext())
          {
            uh localuh = (uh)((Iterator)localObject).next();
            if ((!localuh.b()) && (localuh.a(this.s))) {
              break;
            }
          }
        }
      }
      localObject = this.b.a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
      if (localObject != null)
      {
        ((i)localObject).a(false);
        localObject = getString(b.at);
        bbj.a(getString(b.as, new Object[] { localObject }), (String)localObject, blf.F(this)).a(this.b, "castScreenAlertDialog");
      }
    }
  }
  
  private void j()
  {
    int i2 = 8;
    boolean bool = this.q.b();
    Object localObject = this.f;
    int i1;
    TextView localTextView;
    if (bool)
    {
      i1 = 8;
      ((Button)localObject).setVisibility(i1);
      localObject = this.g;
      i1 = i2;
      if (bool) {
        i1 = 0;
      }
      ((Button)localObject).setVisibility(i1);
      if (bool)
      {
        localTextView = this.h;
        localObject = this.q;
        if ((((bbn)localObject).a != null) && (((bbn)localObject).a.booleanValue())) {
          break label126;
        }
        localObject = getString(b.au);
      }
    }
    for (;;)
    {
      localTextView.setText((CharSequence)localObject);
      this.o = false;
      if (this.i != null)
      {
        this.i.cancel();
        this.i = null;
      }
      return;
      i1 = 0;
      break;
      label126:
      if ((((bbn)localObject).b != null) && (!TextUtils.isEmpty(((bbn)localObject).b.e))) {
        localObject = getString(b.av, new Object[] { ((bbn)localObject).b.e });
      } else {
        localObject = getString(b.aw);
      }
    }
  }
  
  private void startMirroring()
  {
    this.m = true;
    t localt = this.b;
    Object localObject = tz.d();
    if ((((uh)localObject).b()) || (!((uh)localObject).a(this.s))) {
      if (localt.a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) {}
    }
    for (;;)
    {
      return;
      h();
      this.j.postDelayed(this.v, 10000L);
      this.l = (SystemClock.elapsedRealtime() + 10000L);
      localObject = op.b();
      ((oh)localObject).a(this.s);
      ((oh)localObject).a(localt, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
      continue;
      if (localt.a("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) {
        this.t.c().a(localt, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
      }
    }
  }
  
  public final void a(CastDevice paramCastDevice1, CastDevice paramCastDevice2)
  {
    runOnUiThread(new bbg(this));
  }
  
  public final ArrayList b_()
  {
    CastDevice localCastDevice = this.q.b;
    ArrayList localArrayList;
    if (localCastDevice != null)
    {
      localArrayList = new ArrayList(1);
      localArrayList.add(new bko(localCastDevice));
    }
    for (;;)
    {
      return localArrayList;
      localArrayList = null;
    }
  }
  
  public void disconnectMirroring(View paramView)
  {
    this.q.c();
  }
  
  public final Intent e()
  {
    return HelpActivity.a(this, blf.O(this));
  }
  
  public void onBackPressed()
  {
    if (this.e.e()) {
      this.e.d();
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
    this.e.a(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = false;
    super.onCreate(paramBundle);
    setContentView(a.gi);
    a((Toolbar)findViewById(f.eo));
    d().a().a(b.bp);
    this.q = bbn.a(this);
    this.e = new bah(this, this, bat.b);
    this.f = ((Button)findViewById(f.cc));
    this.g = ((Button)findViewById(f.aP));
    this.h = ((TextView)findViewById(f.cd));
    if (paramBundle != null)
    {
      bool1 = paramBundle.getBoolean("chooserShown", false);
      this.m = bool1;
      if (paramBundle == null) {
        break label182;
      }
    }
    label182:
    for (boolean bool1 = paramBundle.getBoolean("warningShown", false);; bool1 = false)
    {
      this.n = bool1;
      bool1 = bool2;
      if (paramBundle != null) {
        bool1 = paramBundle.getBoolean("wifiShown", false);
      }
      this.p = bool1;
      u = (WifiManager)getSystemService("wifi");
      return;
      bool1 = false;
      break;
    }
  }
  
  protected void onDestroy()
  {
    this.e.c();
    super.onDestroy();
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
    if (this.e.a(paramMenuItem)) {}
    for (boolean bool = true;; bool = super.onOptionsItemSelected(paramMenuItem)) {
      return bool;
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.k = false;
    this.q.b(this);
    try
    {
      unregisterReceiver(this.w);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    this.e.c.c();
  }
  
  public void onResume()
  {
    super.onResume();
    this.k = true;
    this.q.a(this);
    if ((this.l != 0L) && (SystemClock.elapsedRealtime() >= this.l)) {
      i();
    }
    if (!this.m) {
      registerReceiver(this.w, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
    }
    j();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putBoolean("chooserShown", this.m);
    paramBundle.putBoolean("warningShown", this.n);
    paramBundle.putBoolean("wifiShown", this.p);
    super.onSaveInstanceState(paramBundle);
  }
  
  public void onStart()
  {
    super.onStart();
    this.e.a();
    this.s = new ty().a(a.c(blf.G(this))).a(a.c(blf.H(this))).a();
    this.q.d.a(this.s, this.r, 1);
    t localt = this.b;
    if (localt.a("castScreenAlertDialog") == null)
    {
      if ((blf.D(this)) || (this.q.b()) || (this.n) || (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean("CAST_SCREEN_DO_NOT_SHOW_WARNING", false))) {
        break label140;
      }
      new bbi().a(localt, "castScreenAlertDialog");
      this.n = true;
    }
    for (;;)
    {
      return;
      label140:
      this.o = true;
    }
  }
  
  public void onStop()
  {
    this.q.d.a(this.r);
    this.e.b();
    super.onStop();
  }
  
  public void showTips(View paramView)
  {
    startActivity(HelpActivity.a(this, blf.E(this)));
  }
  
  public void startMirroring(View paramView)
  {
    int i1 = u.getWifiState();
    if ((i1 != 3) && (i1 != 2))
    {
      this.p = true;
      new bbl().a(this.b, "castScreenWifiDialog");
    }
    for (;;)
    {
      return;
      this.p = false;
      startMirroring();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\mirror\CastScreenActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
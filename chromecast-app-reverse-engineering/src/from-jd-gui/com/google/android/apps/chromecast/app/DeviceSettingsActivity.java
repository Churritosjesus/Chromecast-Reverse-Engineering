package com.google.android.apps.chromecast.app;

import a;
import af;
import afb;
import afo;
import afq;
import afv;
import aik;
import aim;
import ajp;
import akg;
import akl;
import akp;
import akt;
import aku;
import akv;
import akx;
import ala;
import alw;
import alx;
import aly;
import alz;
import and;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.ViewFlipper;
import apd;
import ape;
import apu;
import aqc;
import aqw;
import aqx;
import aqy;
import arc;
import arp;
import arq;
import asb;
import asg;
import ash;
import asq;
import asu;
import asx;
import ata;
import atf;
import atz;
import auo;
import aup;
import auq;
import aur;
import b;
import bbx;
import bca;
import bdf;
import bfs;
import bhf;
import blf;
import blp;
import blx;
import dbv;
import dcj;
import f;
import j;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import m;
import mj;
import nf;
import nh;
import r;

public class DeviceSettingsActivity
  extends and
  implements aqc, aqw, arc, asq, bca
{
  private static String v = "backdropSettingsFragment";
  public bhf e;
  public String f;
  public ash g;
  private apu w;
  private r x;
  private boolean y;
  private int z;
  
  public DeviceSettingsActivity()
  {
    super("DeviceSettingsActivity", false);
  }
  
  private void G()
  {
    if ((this.z == aqx.a) && (this.g.r())) {
      i();
    }
    for (;;)
    {
      return;
      if ((this.z == aqx.b) && (!this.g.r())) {
        k();
      }
    }
  }
  
  private boolean H()
  {
    int i = 0;
    boolean bool = false;
    if (this.z == 0) {}
    for (;;)
    {
      return bool;
      this.z = 0;
      if (this.x.a("spinnerFragment") != null) {
        i = 1;
      }
      if ((i != 0) && (this.x.e() > 0)) {
        this.x.c();
      }
      bool = true;
    }
  }
  
  public static Intent a(Context paramContext, String paramString1, String paramString2, bdf parambdf, int paramInt, long paramLong, String paramString3, String paramString4)
  {
    paramContext = new Intent(paramContext, DeviceSettingsActivity.class);
    paramContext.putExtra("device", paramString1);
    paramContext.putExtra("deviceIpAddress", paramString2);
    paramContext.putExtra("deviceConfiguration", parambdf);
    paramContext.putExtra("devicePosition", paramInt);
    paramContext.putExtra("scanStart", paramLong);
    paramContext.putExtra("backdropAppDeviceIdKey", paramString3);
    paramContext.putExtra("backdropCertKey", paramString4);
    return paramContext;
  }
  
  public static Intent a(Context paramContext, String paramString1, String paramString2, bdf parambdf, boolean paramBoolean, String paramString3, String paramString4)
  {
    paramContext = new Intent(paramContext, DeviceSettingsActivity.class);
    paramContext.putExtra("device", paramString1);
    paramContext.putExtra("deviceIpAddress", paramString2);
    paramContext.putExtra("deviceConfiguration", parambdf);
    paramContext.putExtra("launchBackdrop", true);
    paramContext.putExtra("backdropPersonalized", paramBoolean);
    paramContext.putExtra("backdropAppDeviceIdKey", paramString3);
    paramContext.putExtra("backdropCertKey", paramString4);
    return paramContext;
  }
  
  private void a(j paramj, String paramString1, String paramString2)
  {
    paramj = this.x.a().b(f.bk, paramj, paramString1);
    if (!TextUtils.isEmpty(paramString2))
    {
      paramj.a(paramString2);
      paramj.a(4097);
    }
    paramj.b();
  }
  
  private static void a(Integer paramInteger)
  {
    ape.a().a(new apd(75).a(paramInteger.intValue()));
  }
  
  private void a(String paramString, int paramInt, boolean paramBoolean)
  {
    j localj;
    if (this.x.a("spinnerFragment") == null)
    {
      localj = ata.a(paramString);
      if (!paramBoolean) {
        break label41;
      }
    }
    label41:
    for (paramString = v;; paramString = null)
    {
      a(localj, "spinnerFragment", paramString);
      this.z = paramInt;
      return;
    }
  }
  
  public static boolean n()
  {
    if (SetupApplication.a().e != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void a(dbv paramdbv)
  {
    if (this.g != null)
    {
      asb localasb = this.g.d;
      localasb.a.b("Updated setting based on DeviceSettingsResponse: %s", new Object[] { paramdbv.b });
      localasb.b.a.a(paramdbv.b);
      localasb.a.b("Updated metadata based on DeviceSettingsResponse: %s", new Object[] { paramdbv.a });
      localasb.b.b.b = paramdbv.a;
      localasb.c.d_();
    }
  }
  
  public final void a(dcj paramdcj)
  {
    j localj = this.x.a("photosFragment");
    Object localObject = localj;
    if (localj == null) {
      localObject = asx.a(paramdcj);
    }
    a((j)localObject, "photosFragment", "photosFragment");
    a(Integer.valueOf(1));
  }
  
  public final void a(dcj paramdcj, String paramString)
  {
    if (TextUtils.isEmpty(paramdcj.j)) {}
    for (;;)
    {
      return;
      if (this.g == null) {
        continue;
      }
      synchronized (this.g.d.b)
      {
        Object localObject1 = paramdcj.j;
        Object localObject2 = paramdcj.o;
        ???.d = ((String)localObject1);
        ???.e = ((String)localObject2);
        ???.c = 0L;
        localObject2 = atf.a(getApplicationContext());
        localObject1 = new alx;
        ((alx)localObject1).<init>(this, paramdcj, paramString);
        ???.a((atf)localObject2, (auo)localObject1);
      }
    }
  }
  
  public final boolean a(AlertDialog paramAlertDialog, bfs parambfs)
  {
    boolean bool2 = true;
    boolean bool1;
    if (parambfs == null) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      if (parambfs.a.equals(this.i.y))
      {
        bool1 = bool2;
        if (TextUtils.isEmpty(parambfs.e)) {}
      }
      else if (!a(parambfs))
      {
        bool1 = false;
      }
      else
      {
        a(this.p, null, parambfs, new alw(this, parambfs, paramAlertDialog));
        bool1 = bool2;
      }
    }
  }
  
  public final void a_(int paramInt)
  {
    if (paramInt == 1) {
      G();
    }
  }
  
  public final void b(dcj paramdcj)
  {
    j localj = this.x.a("peoplePickerFragment");
    Object localObject = localj;
    if (localj == null) {
      localObject = asu.a(paramdcj);
    }
    a((j)localObject, "peoplePickerFragment", "peoplePickerFragment");
    a(Integer.valueOf(20));
  }
  
  public final void b(dcj paramdcj, String paramString)
  {
    a(arp.a(paramdcj), "backdropSettingsFragment", paramString);
    if ((paramdcj == null) || (paramdcj.b == null)) {}
    for (int i = 0;; i = paramdcj.b.intValue())
    {
      a(Integer.valueOf(i));
      return;
    }
  }
  
  public final void b(String paramString)
  {
    if (this.w != null)
    {
      this.b.a().a(this.w).b();
      this.w = null;
    }
    y();
    if (!TextUtils.isEmpty(paramString)) {
      e(paramString);
    }
    for (;;)
    {
      return;
      w();
    }
  }
  
  public final void c(dcj paramdcj)
  {
    Object localObject1 = (arp)this.x.a("backdropSettingsFragment");
    if (localObject1 != null)
    {
      Object localObject2 = aku.a();
      Object localObject4 = ((arp)localObject1).a;
      Object localObject3 = new arq((arp)localObject1, paramdcj);
      if (!(localObject4 instanceof aik)) {
        throw new afq("Unexpected CallbackManager, please use the provided Factory.");
      }
      localObject4 = (aik)localObject4;
      int i = aim.a.a();
      localObject2 = new akv((aku)localObject2, (afo)localObject3);
      ajp.a(localObject2, "callback");
      ((aik)localObject4).a.put(Integer.valueOf(i), localObject2);
      localObject2 = aku.a();
      paramdcj = arp.b(paramdcj);
      if (paramdcj != null)
      {
        localObject3 = paramdcj.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (String)((Iterator)localObject3).next();
          if (aku.a((String)localObject4)) {
            throw new afq(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] { localObject4 }));
          }
        }
      }
      localObject3 = ((aku)localObject2).a;
      boolean bool;
      label237:
      Activity localActivity;
      if (paramdcj != null)
      {
        paramdcj = new HashSet(paramdcj);
        localObject3 = new akl((akg)localObject3, Collections.unmodifiableSet(paramdcj), ((aku)localObject2).b, afv.h(), UUID.randomUUID().toString());
        if (afb.a() == null) {
          break label415;
        }
        bool = true;
        ((akl)localObject3).f = bool;
        localObject4 = new ala((j)localObject1);
        ((aku)localObject2).c = ((akl)localObject3);
        ((aku)localObject2).d = new HashMap();
        localActivity = ((ala)localObject4).a();
        if ((localActivity != null) && (((aku)localObject2).c != null)) {
          break label421;
        }
        paramdcj = null;
        label292:
        ((aku)localObject2).e = paramdcj;
        if ((((aku)localObject2).e != null) && (((aku)localObject2).c != null)) {
          ((aku)localObject2).e.a(((aku)localObject2).c);
        }
        aik.a(aim.a.a(), new akx((aku)localObject2));
        bool = ((aku)localObject2).a((ala)localObject4, (akl)localObject3);
        localObject1 = ((aku)localObject2).d;
        if (!bool) {
          break label469;
        }
      }
      label415:
      label421:
      label469:
      for (paramdcj = "1";; paramdcj = "0")
      {
        ((HashMap)localObject1).put("try_login_activity", paramdcj);
        if (bool) {
          return;
        }
        paramdcj = new afq("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        ((aku)localObject2).a(akp.c, null, paramdcj);
        ((aku)localObject2).c = null;
        throw paramdcj;
        paramdcj = new HashSet();
        break;
        bool = false;
        break label237;
        localObject1 = ((aku)localObject2).e;
        if (localObject1 != null)
        {
          paramdcj = (dcj)localObject1;
          if (((akt)localObject1).b.equals(((aku)localObject2).c.d)) {
            break label292;
          }
        }
        paramdcj = new akt(localActivity, ((aku)localObject2).c.d);
        break label292;
      }
    }
  }
  
  public final void c(String paramString)
  {
    d().a().a(paramString);
  }
  
  public final void d(dcj paramdcj)
  {
    String str = paramdcj.l;
    if (TextUtils.isEmpty(str)) {}
    for (paramdcj = this.i.b;; paramdcj = this.i.b)
    {
      return;
      j localj = this.x.a("oAuthFragment");
      Object localObject = localj;
      if (localj == null) {
        localObject = bbx.a(this.f, str, paramdcj.j, "https://clients3.google.com");
      }
      a((j)localObject, "oAuthFragment", "oAuthFragment");
    }
  }
  
  public final void d(String paramString)
  {
    paramString = new aup(blf.z(this), this.f, paramString, new aly(this, paramString), new alz(this));
    atf.a(this).a(paramString);
  }
  
  public final Intent e()
  {
    if (this.x.a("backdropSettingsFragment") != null) {}
    for (Intent localIntent = HelpActivity.a(this, blf.P(this));; localIntent = super.e()) {
      return localIntent;
    }
  }
  
  public boolean g()
  {
    if ((this.e != null) && (this.e.s)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final ash h()
  {
    return this.g;
  }
  
  public final void i()
  {
    H();
    dcj localdcj;
    if (this.x.a("backdropSettingsFragment") == null)
    {
      localdcj = this.g.t().b;
      if (!this.y) {
        break label44;
      }
    }
    label44:
    for (String str = null;; str = v)
    {
      b(localdcj, str);
      return;
    }
  }
  
  public final void j()
  {
    if (this.y) {
      finish();
    }
    for (;;)
    {
      return;
      H();
    }
  }
  
  public final void k()
  {
    Toast.makeText(this, b.T, 0).show();
    if (this.y) {
      finish();
    }
    for (;;)
    {
      return;
      this.z = 0;
      this.x.b("backdropSettingsFragment", 1);
    }
  }
  
  public final void l()
  {
    H();
  }
  
  public final void m()
  {
    Object localObject;
    if (!n())
    {
      localObject = new Intent();
      ((Intent)localObject).setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
      ((Intent)localObject).setPackage("com.google.android.gms");
      ((Intent)localObject).putExtra("allowableAccounts", null);
      ((Intent)localObject).putExtra("allowableAccountTypes", new String[] { "com.google" });
      ((Intent)localObject).putExtra("addAccountOptions", null);
      ((Intent)localObject).putExtra("selectedAccount", null);
      ((Intent)localObject).putExtra("alwaysPromptForAccount", false);
      ((Intent)localObject).putExtra("descriptionTextOverride", null);
      ((Intent)localObject).putExtra("authTokenType", null);
      ((Intent)localObject).putExtra("addAccountRequiredFeatures", null);
      ((Intent)localObject).putExtra("setGmsCoreAccount", false);
      ((Intent)localObject).putExtra("overrideTheme", 0);
      ((Intent)localObject).putExtra("overrideCustomTheme", 0);
      startActivityForResult((Intent)localObject, 1);
    }
    for (;;)
    {
      return;
      localObject = aqy.p();
      ((aqy)localObject).Z = this;
      ((aqy)localObject).a(this.b, "backdropOptInFragment");
    }
  }
  
  public final void o()
  {
    Object localObject = getString(b.R);
    int i = aqx.a;
    if (!this.y) {}
    for (boolean bool = true;; bool = false)
    {
      a((String)localObject, i, bool);
      localObject = this.g;
      ((ash)localObject).a(1, ((ash)localObject).Z, this);
      return;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1) {
      if (paramInt2 == -1)
      {
        paramIntent = AccountManager.get(getApplicationContext()).getAccounts();
        if (paramIntent.length > 0)
        {
          SetupApplication.a().a(paramIntent[0].name);
          m();
        }
      }
    }
    for (;;)
    {
      return;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onBackPressed()
  {
    int i = 1;
    if (g()) {
      if (this.e.b.getDisplayedChild() == 1)
      {
        if (i == 0) {
          break label41;
        }
        this.e.b(0);
      }
    }
    for (;;)
    {
      return;
      i = 0;
      break;
      label41:
      super.onBackPressed();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.fT);
    blx.g(this);
    a((Toolbar)findViewById(f.eo));
    a(paramBundle);
    this.f = getIntent().getStringExtra("backdropAppDeviceIdKey");
    boolean bool;
    if ((getIntent() != null) && (getIntent().getBooleanExtra("launchBackdrop", false)))
    {
      bool = true;
      this.y = bool;
      if (!isFinishing()) {
        break label91;
      }
    }
    for (;;)
    {
      return;
      bool = false;
      break;
      label91:
      this.x = this.b;
      this.w = ((apu)this.b.a("offersChecker"));
      this.e = ((bhf)this.x.a("deviceSettingsFragment"));
      Object localObject = (aqy)this.x.a("backdropOptInFragment");
      if (localObject != null) {
        ((aqy)localObject).Z = this;
      }
      this.g = ((ash)this.x.a("backdropStorage"));
      if ((this.g == null) && (s()))
      {
        localObject = getIntent().getStringExtra("backdropCertKey");
        this.g = ash.a(this.f, this.i.b, this.i.g, (String)localObject);
        this.x.a().a(this.g, "backdropStorage").b();
      }
      if (paramBundle == null) {
        if (this.y)
        {
          if (getIntent().getBooleanExtra("backdropPersonalized", false)) {
            b(null, null);
          } else {
            m();
          }
        }
        else
        {
          if (this.e == null) {
            this.e = new bhf();
          }
          this.x.a().a(f.bk, this.e, "deviceSettingsFragment").b();
          int i = getIntent().getIntExtra("devicePosition", -1);
          long l = getIntent().getLongExtra("scanStart", 0L);
          ape.a().a(35, Integer.valueOf(i), Long.valueOf(l));
        }
      }
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(a.gY, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == f.bK) {
      if (this.w == null)
      {
        x();
        this.w = apu.a(this.j, this.i.Q);
        this.b.a().a(this.w, "offersChecker").b();
      }
    }
    for (boolean bool = true;; bool = a(paramMenuItem, this.p, this.f))
    {
      return bool;
      if (paramMenuItem.getItemId() == 16908332)
      {
        onBackPressed();
        break;
      }
    }
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    super.onPrepareOptionsMenu(paramMenu);
    if ((blf.b(this)) && (this.s.getDisplayedChild() != 1)) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramMenu, f.bK, bool);
      return true;
    }
  }
  
  public void onResume()
  {
    super.onResume();
    G();
  }
  
  public void onStart()
  {
    super.onStart();
    if (this.g != null) {
      this.g.a(this);
    }
  }
  
  public void onStop()
  {
    super.onStop();
    if (this.g != null) {
      this.g.b(this);
    }
  }
  
  public final void p()
  {
    if (this.y) {
      finish();
    }
  }
  
  public final void q()
  {
    a(getString(b.U), aqx.b, true);
    ash localash = this.g;
    localash.a(2, localash.Z, this);
  }
  
  public final String r()
  {
    return this.f;
  }
  
  public final boolean s()
  {
    if ((!TextUtils.isEmpty(this.f)) && (this.i.h)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\DeviceSettingsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
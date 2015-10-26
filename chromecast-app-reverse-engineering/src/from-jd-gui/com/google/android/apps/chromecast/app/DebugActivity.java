package com.google.android.apps.chromecast.app;

import a;
import alf;
import alg;
import alh;
import ali;
import alj;
import alk;
import all;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import b;
import bah;
import baq;
import bat;
import bld;
import blf;
import blj;
import blm;
import f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mj;
import mm;
import mn;
import nf;
import nh;

public class DebugActivity
  extends mm
  implements baq
{
  private bah e;
  
  private static int b(String paramString, String[] paramArrayOfString)
  {
    int i = 0;
    if (i < paramArrayOfString.length) {
      if (!paramArrayOfString[i].equals(paramString)) {}
    }
    for (;;)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }
  
  public final ArrayList b_()
  {
    return null;
  }
  
  public final Intent e()
  {
    return null;
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
    super.onCreate(paramBundle);
    setContentView(a.fR);
    a((Toolbar)findViewById(f.eo));
    this.e = new bah(this, this, bat.e);
    d().a().a(b.aG);
    Object localObject1 = new ArrayAdapter(this, 17367049, bld.b);
    paramBundle = (Spinner)findViewById(f.dB);
    paramBundle.setAdapter((SpinnerAdapter)localObject1);
    paramBundle.setOnItemSelectedListener(new alf(this));
    paramBundle.setSelection(bld.a.indexOf(blf.y(this)));
    paramBundle = (Spinner)findViewById(f.an);
    localObject1 = blj.e();
    ((List)localObject1).add(0, new blm("", "Default"));
    Object localObject2 = new ArrayAdapter(this, 17367048, (List)localObject1);
    ((ArrayAdapter)localObject2).setDropDownViewResource(17367049);
    paramBundle.setAdapter((SpinnerAdapter)localObject2);
    localObject2 = blf.B(this);
    if (localObject2 != null) {
      paramBundle.setSelection(((List)localObject1).indexOf(blj.a((List)localObject1, (String)localObject2)));
    }
    paramBundle.setOnItemSelectedListener(new alg(this, paramBundle));
    paramBundle = new alh(this);
    int i = f.l;
    localObject2 = paramBundle.b();
    localObject1 = (Spinner)findViewById(i);
    ((Spinner)localObject1).setAdapter(new ArrayAdapter(this, 17367049, paramBundle.c()));
    i = b((String)localObject2, paramBundle.d());
    if (i >= 0) {
      ((Spinner)localObject1).setSelection(i);
    }
    ((Spinner)localObject1).setOnItemSelectedListener(new alk(this, (Spinner)localObject1, paramBundle, (String)localObject2));
    ((Spinner)localObject1).setVisibility(0);
    ((Button)findViewById(f.do)).setOnClickListener(new ali(this));
    paramBundle = (Switch)findViewById(f.ef);
    paramBundle.setVisibility(8);
    findViewById(f.H).setVisibility(8);
    boolean bool = blf.C(this);
    paramBundle.setChecked(PreferenceManager.getDefaultSharedPreferences(this).getBoolean("PREF_BLE_ENABLED", bool));
    paramBundle.setOnCheckedChangeListener(new alj(this));
  }
  
  protected void onDestroy()
  {
    this.e.c();
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (this.e.a(paramMenuItem)) {}
    for (boolean bool = true;; bool = super.onOptionsItemSelected(paramMenuItem)) {
      return bool;
    }
  }
  
  public void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    this.e.c.c();
  }
  
  public void onResume()
  {
    super.onResume();
    TextView localTextView = (TextView)findViewById(f.bD);
    SetupApplication localSetupApplication = SetupApplication.a();
    if (localSetupApplication.k()) {
      localTextView.setText(getString(b.bF, new Object[] { Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - localSetupApplication.k)), localSetupApplication.l }));
    }
    for (;;)
    {
      return;
      localTextView.setText(b.bG);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    this.e.a();
  }
  
  public void onStop()
  {
    this.e.b();
    super.onStop();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\DebugActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
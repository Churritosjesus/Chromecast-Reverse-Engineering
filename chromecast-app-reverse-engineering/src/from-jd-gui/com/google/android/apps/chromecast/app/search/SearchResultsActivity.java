package com.google.android.apps.chromecast.app.search;

import a;
import af;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import aov;
import apg;
import atf;
import awr;
import axb;
import bfx;
import bfy;
import bfz;
import bga;
import bge;
import bgk;
import blp;
import blx;
import com.google.android.apps.chromecast.app.DiscoveryActivity;
import com.google.android.apps.chromecast.app.SetupApplication;
import dbb;
import dbf;
import f;
import m;
import mm;
import r;

public class SearchResultsActivity
  extends mm
  implements aov, axb, bgk
{
  private final blp e = new blp("SearchResultsActivity");
  private SearchView f;
  private ViewFlipper g;
  private int h;
  private int i;
  private boolean j;
  
  private void a(int paramInt)
  {
    this.h = paramInt;
    this.g.setDisplayedChild(paramInt);
  }
  
  private void e()
  {
    a(1);
    String str = getIntent().getStringExtra("query");
    atf localatf = atf.a(this);
    bfy localbfy = new bfy(this);
    localatf.a(new bga(this, str, new bfz(this, str), localbfy), localbfy);
  }
  
  public final void a(dbf paramdbf)
  {
    apg localapg = apg.a(135).c(this.i);
    localapg.f = paramdbf.b;
    localapg.b();
    this.b.a().a(f.bk, bge.a(paramdbf)).a(4097).a("searchResultsFragment").b();
  }
  
  public final void a(String paramString1, String paramString2, dbb paramdbb)
  {
    apg localapg = apg.a(133);
    localapg.c = paramString1;
    localapg.b = paramString2;
    localapg.c(this.i).b();
    paramString1 = awr.a(paramString1, paramdbb, true);
    this.b.a().a(f.bk, paramString1, "detailsFragment").a(4097).a("searchResultsFragment").b();
  }
  
  public final void i()
  {
    findViewById(f.eo).setVisibility(0);
  }
  
  public final void j()
  {
    findViewById(f.eo).setVisibility(8);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.j = false;
    if (!SetupApplication.a().b)
    {
      paramBundle = new Intent(this, DiscoveryActivity.class);
      paramBundle.addFlags(32768);
      startActivity(paramBundle);
    }
    for (;;)
    {
      return;
      setContentView(a.gE);
      this.g = ((ViewFlipper)findViewById(f.dt));
      blx.g(this);
      ImageView localImageView = (ImageView)findViewById(f.aX);
      localImageView.setImageResource(a.eC);
      localImageView.setOnClickListener(new bfx(this));
      this.f = ((SearchView)findViewById(f.f));
      blx.a(this, this.f, findViewById(f.du), null);
      if (paramBundle == null)
      {
        e();
      }
      else
      {
        a(paramBundle.getInt("viewFlipperIndex"));
        if (paramBundle.getInt("viewFlipperIndex") == 1) {
          e();
        }
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.j = true;
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    e();
  }
  
  public void onResume()
  {
    super.onResume();
    if (isFinishing()) {}
    for (;;)
    {
      return;
      Object localObject = getIntent().getStringExtra("query");
      this.f.a((CharSequence)localObject, false);
      localObject = findViewById(a.br);
      if (localObject != null) {
        ((View)localObject).clearFocus();
      }
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("viewFlipperIndex", this.h);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\search\SearchResultsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
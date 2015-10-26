import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.widget.DrawerLayout;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.google.android.apps.chromecast.app.MainActivity;
import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.apps.chromecast.app.mirror.CastScreenActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.people.accountswitcherview.AccountSwitcherView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
import java.util.ArrayList;
import java.util.List;

public final class bah
  implements AdapterView.OnItemClickListener, bwh, bwn
{
  public final DrawerLayout a;
  public final ArrayAdapter b;
  public final mn c;
  private List d;
  private final blp e = new blp("ChromecastDrawer", false);
  private final mm f;
  private final baq g;
  private int h;
  private final AccountSwitcherView i;
  private final ListView j;
  private int k = 0;
  private final Handler l;
  private GoogleApiClient m;
  
  public bah(mm parammm, baq parambaq, bat parambat)
  {
    this.f = parammm;
    this.g = parambaq;
    this.l = new Handler();
    this.d = a(parambat);
    this.b = new bar(parammm, this.d);
    this.a = ((DrawerLayout)parammm.findViewById(f.aW));
    this.i = ((AccountSwitcherView)parammm.findViewById(f.bF));
    parambat = this.a;
    int n = a.ev;
    parambaq = parambat.getResources().getDrawable(n);
    n = fe.a(8388611, gt.g(parambat));
    if ((n & 0x3) == 3)
    {
      parambat.g = parambaq;
      parambat.invalidate();
    }
    if ((n & 0x5) == 5)
    {
      parambat.h = parambaq;
      parambat.invalidate();
    }
    parambaq = this.a;
    parambaq.a = parammm.getResources().getColor(a.ds);
    parambaq.invalidate();
    parambaq = new TypedValue();
    parammm.getTheme().resolveAttribute(a.dj, parambaq, true);
    parambat = this.a;
    parambat.i = new ColorDrawable(parambaq.data);
    parambat.invalidate();
    this.j = new ListView(parammm);
    this.j.setAdapter(this.b);
    this.j.setDividerHeight(0);
    this.j.setOnItemClickListener(this);
    this.j.setChoiceMode(1);
    parambaq = new cqa();
    parambaq.a = 158;
    boolean bool;
    if (parambaq.a >= 0)
    {
      bool = true;
      a.b(bool, "Must provide valid client application ID!");
      parambaq = new cpz(parambaq);
      parambat = SetupApplication.a();
      if (!bls.a(parambat)) {
        break label776;
      }
      this.m = new bwf(parambat).a(cpx.b, parambaq).a(new bai(this)).a(this).b();
      this.m.b();
      parambat = this.i;
      parambat.j = this.m;
      parambaq = parambat.h;
      parambaq.c = parambat.j;
      if (parambaq.c != null) {
        parambaq.d = new cqm(parambaq.getContext(), parambaq.c);
      }
      parambat.k = new cqj(parambat.getContext(), parambat.j);
      parambat.h.e = parambat.k;
    }
    for (;;)
    {
      parambat = this.i;
      parambaq = this.i;
      if (AccountSwitcherView.c())
      {
        bool = gt.r(parambaq);
        if (bool)
        {
          parambat.setForegroundGravity(55);
          parambat.p = new cqw();
          parambat.setForeground(parambat.p);
        }
        if ((parambat.q != null) && (gt.r(parambat.q)))
        {
          parambat.q.setOnApplyWindowInsetsListener(null);
          parambat.q = null;
        }
        if ((bool) && (parambaq != null))
        {
          parambat.q = parambaq;
          parambat.q.setOnApplyWindowInsetsListener(new cqi(parambat));
        }
      }
      parambaq = this.i;
      parambat = this.j;
      if (parambaq.g.getChildCount() > 0) {
        parambaq.g.removeAllViews();
      }
      parambaq.g.addView(parambat);
      parambaq.m = parambat;
      parambaq.g.setClipToPadding(false);
      if ((parambaq.m != null) && (AccountSwitcherView.c()))
      {
        parambaq.m.setNestedScrollingEnabled(false);
        parambaq.g.setNestedScrollingEnabled(false);
        parambaq.setNestedScrollingEnabled(false);
      }
      this.i.a = new baj(this);
      this.i.b = new bak(this, parammm);
      this.i.c = new bal(this, parammm);
      parambaq = parammm.d().a();
      if (parambaq != null) {
        parambaq.b(true);
      }
      this.c = new bam(this, parammm, this.a, b.bt, b.bo, parammm);
      this.a.f = this.c;
      b((bat)this.d.get(this.h));
      return;
      bool = false;
      break;
      label776:
      if (TextUtils.isEmpty(SetupApplication.a().e))
      {
        parambaq = bls.b(parambat);
        if (!TextUtils.isEmpty(parambaq)) {
          SetupApplication.a().a(parambaq);
        }
      }
    }
  }
  
  private List a(bat parambat)
  {
    int n = 0;
    ArrayList localArrayList = new ArrayList(bat.values().length);
    localArrayList.add(bat.a);
    if (blf.a()) {
      localArrayList.add(bat.b);
    }
    localArrayList.add(bat.c);
    localArrayList.add(bat.d);
    blf.b();
    this.h = 0;
    for (;;)
    {
      if (n < localArrayList.size())
      {
        if (localArrayList.get(n) == parambat) {
          this.h = n;
        }
      }
      else {
        return localArrayList;
      }
      n++;
    }
  }
  
  private void a(View paramView)
  {
    if (paramView.getBackground() != null) {
      paramView.getBackground().setCallback(null);
    }
    if ((paramView instanceof ViewGroup))
    {
      int i1 = ((ViewGroup)paramView).getChildCount();
      for (int n = 0; n < i1; n++) {
        a(((ViewGroup)paramView).getChildAt(n));
      }
      if (!(paramView instanceof AdapterView)) {
        ((ViewGroup)paramView).removeAllViews();
      }
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.l.postDelayed(new ban(this), 250L);
    }
    for (;;)
    {
      this.j.setItemChecked(this.h, true);
      return;
      this.a.f(this.i);
    }
  }
  
  private void b(bat parambat)
  {
    Object localObject;
    if (parambat != this.d.get(this.h))
    {
      localObject = null;
      switch (bap.a[parambat.ordinal()])
      {
      default: 
        parambat = (bat)localObject;
        if (parambat != null)
        {
          parambat = new Intent(this.f, parambat);
          this.f.startActivity(parambat);
          this.f.finish();
          this.f.overridePendingTransition(17432576, 17432577);
        }
        break;
      }
    }
    for (;;)
    {
      return;
      parambat = MainActivity.class;
      break;
      a(true);
      blx.d(this.f);
      continue;
      parambat = CastScreenActivity.class;
      break;
      this.k = 1;
      a(false);
      continue;
      blf.b();
      parambat = (bat)localObject;
      break;
      this.j.setItemChecked(this.h, true);
      this.a.f(this.i);
    }
  }
  
  public final void a()
  {
    if ((this.m != null) && (!this.m.d()) && (!this.m.e())) {
      this.m.b();
    }
  }
  
  public final void a(Configuration paramConfiguration)
  {
    paramConfiguration = this.c;
    paramConfiguration.c = paramConfiguration.e();
    paramConfiguration.c();
  }
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    bls.a(this.f, paramConnectionResult, new bao(this));
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    boolean bool = true;
    mn localmn = this.c;
    int n;
    if ((paramMenuItem != null) && (paramMenuItem.getItemId() == 16908332) && (localmn.d))
    {
      localmn.d();
      n = 1;
      if (n == 0) {
        break label49;
      }
    }
    for (;;)
    {
      return bool;
      n = 0;
      break;
      label49:
      bool = false;
    }
  }
  
  public final void b()
  {
    if ((this.m != null) && ((this.m.d()) || (this.m.e()))) {
      this.m.c();
    }
  }
  
  public final void c()
  {
    this.m = null;
    this.i.b();
    a(this.a);
    a(this.i);
  }
  
  public final void d()
  {
    if (!e()) {}
    for (;;)
    {
      return;
      this.j.setItemChecked(this.h, true);
      this.a.f(this.i);
    }
  }
  
  public final boolean e()
  {
    return this.a.g(this.i);
  }
  
  public final void f()
  {
    this.a.e(this.i);
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    b((bat)this.d.get(paramInt));
    ape.a().a(new apd(114, Integer.valueOf(paramInt)));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
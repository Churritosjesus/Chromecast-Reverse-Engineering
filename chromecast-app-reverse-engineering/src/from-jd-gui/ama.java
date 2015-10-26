import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.Settings.Secure;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ViewFlipper;
import com.google.android.apps.chromecast.app.DeviceSettingsActivity;
import com.google.android.apps.chromecast.app.MainActivity;
import com.google.android.apps.chromecast.app.NoDevicesActivity;
import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.apps.chromecast.app.setup.DeviceSetupActivity;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ama
  extends j
  implements View.OnClickListener, asq, azf, bbt
{
  private ayz Z;
  private Handler a;
  private alm aa;
  private ash ab;
  private SharedPreferences ac;
  private boolean ad;
  private final blp ae = new blp("DevicesFragment");
  private SetupApplication af;
  private bbn ag;
  private View ah;
  private ViewFlipper b;
  private RecyclerView c;
  private bmu d;
  
  private void a(aow paramaow, int paramInt)
  {
    if (paramaow.s) {}
    for (;;)
    {
      return;
      new Handler().post(new amd(this, paramaow));
      if (paramaow.q()) {
        a(DeviceSetupActivity.a(this.y, paramaow.f(), paramaow.n(), paramaow.c, paramInt, paramaow.a(), paramaow.f, paramaow.e));
      } else {
        a(DeviceSettingsActivity.a(this.y, paramaow.f(), paramaow.n(), paramaow.c, paramInt, paramaow.a(), paramaow.j, paramaow.k));
      }
    }
  }
  
  private void a(String paramString1, String paramString2)
  {
    amg localamg = new amg(this);
    new AlertDialog.Builder(this.y).setMessage(a(b.bJ, new Object[] { paramString1, paramString2 })).setPositiveButton(b.J, localamg).setNegativeButton(b.H, null).show();
  }
  
  private boolean t()
  {
    boolean bool = false;
    if (Settings.Secure.getInt(this.y.getContentResolver(), "location_mode", 0) == 0) {
      bool = true;
    }
    return bool;
  }
  
  private static boolean u()
  {
    if (Build.VERSION.SDK_INT > 22) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void v()
  {
    if ((t()) && (u()) && (!this.aa.a(aoz.b)) && (!this.aa.a(aoz.c))) {
      this.ah.setVisibility(0);
    }
    for (;;)
    {
      return;
      this.ah.setVisibility(8);
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.fW, paramViewGroup, false);
    this.af = SetupApplication.a();
    this.a = new Handler();
    this.ac = PreferenceManager.getDefaultSharedPreferences(this.y);
    this.ad = this.ac.getBoolean("FIRST_RUN", true);
    this.ag = bbn.a(this.y);
    this.b = ((ViewFlipper)paramLayoutInflater.findViewById(f.ev));
    paramViewGroup = this.y.b;
    this.ab = ((ash)paramViewGroup.a("backdropStorage"));
    if (this.ab == null)
    {
      this.ab = new ash();
      paramViewGroup.a().a(this.ab, "backdropStorage").b();
    }
    this.aa = SetupApplication.a().b();
    this.Z = ((ami)this.y).a();
    this.ah = paramLayoutInflater.findViewById(f.g);
    v();
    this.ah.setOnClickListener(this);
    this.c = ((RecyclerView)paramLayoutInflater.findViewById(f.aA));
    this.c.f = true;
    this.c.a(new xw(this.y));
    int k = blx.a(this.y);
    paramViewGroup = e();
    int j = Math.min(k - (paramViewGroup.getDimensionPixelSize(a.dE) << 1), paramViewGroup.getDimensionPixelSize(a.dD));
    this.ah.getLayoutParams().width = j;
    this.d = new bmu(this.y, atf.a(this.y), this.aa.g, this.aa.h, this.aa.m, this.ab, this.ag, new amb(this), j);
    this.aa.g.size();
    this.aa.m.size();
    this.aa.h.size();
    this.aa.d = this.d;
    this.aa.a(this, blr.c(this.y));
    paramBundle = bkh.a();
    bke localbke = paramBundle.g;
    paramViewGroup = this.d;
    localbke.d.add(paramViewGroup);
    paramViewGroup.a(localbke.b());
    if (paramBundle.d != null) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        paramBundle.b();
      }
      this.c.a(this.d);
      this.c.a(new amh(this, e().getDimensionPixelSize(a.dF), (k - j) / 2));
      paramViewGroup = new xe();
      paramViewGroup.m = false;
      this.c.a(paramViewGroup);
      paramLayoutInflater.findViewById(f.dG).setOnClickListener(this);
      paramLayoutInflater.findViewById(f.dH).setOnClickListener(this);
      return paramLayoutInflater;
    }
  }
  
  public final void a(CastDevice paramCastDevice1, CastDevice paramCastDevice2)
  {
    if (((paramCastDevice1 == null) && (paramCastDevice2 == null)) || ((paramCastDevice1 != null) && (paramCastDevice1.equals(paramCastDevice2)))) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.aa.g.iterator();
      while (localIterator.hasNext())
      {
        paramCastDevice2 = (aow)localIterator.next();
        if ((paramCastDevice2.e()) && (paramCastDevice1 != null) && (paramCastDevice1.b.equals(paramCastDevice2.b.b))) {
          paramCastDevice2.p();
        }
      }
    }
  }
  
  public final void a_(int paramInt)
  {
    if (paramInt == 1) {
      this.aa.a(this.ab.p());
    }
  }
  
  public final void d()
  {
    super.d();
    this.aa.g.size();
    this.aa.m.size();
    this.aa.h.size();
    Object localObject1 = this.aa;
    Object localObject2 = this.d;
    if (((alm)localObject1).d == localObject2) {
      ((alm)localObject1).d = null;
    }
    localObject1 = this.aa;
    ((alm)localObject1).e.remove(this);
    if (((alm)localObject1).e.size() == 0)
    {
      Iterator localIterator = ((alm)localObject1).c.a.values().iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (aqj)localIterator.next();
        localObject2 = ((aqj)localObject1).b.c.b;
        ((aqj)localObject1).g();
      }
    }
    this.ag = null;
  }
  
  public final void j()
  {
    super.j();
    v();
    this.d.a.a();
    this.ab.a(this);
    if (this.ab.p() != null) {
      this.aa.a(this.ab.p());
    }
    this.Z.a = this;
    if (this.ag != null)
    {
      this.ag.a(this);
      this.ag.d();
    }
    q();
  }
  
  public final void k()
  {
    super.k();
    this.ab.b(this);
    this.Z.a = null;
    if (this.ag != null) {
      this.ag.b(this);
    }
    super.k();
  }
  
  public final void l()
  {
    super.l();
    bke localbke = bkh.a().g;
    bmu localbmu = this.d;
    for (int i = 0;; i++) {
      if (i < localbke.d.size())
      {
        if (localbke.d.get(i) == localbmu) {
          localbke.d.remove(i);
        }
      }
      else {
        return;
      }
    }
  }
  
  public final void onClick(View paramView)
  {
    boolean bool = true;
    int j = paramView.getId();
    int i;
    label27:
    label61:
    String str;
    if (j == f.dG)
    {
      i = 1;
      if (j != f.dH) {
        break label111;
      }
      if ((i != 0) || (bool))
      {
        if ((!t()) || (!u())) {
          break label139;
        }
        if (i == 0) {
          break label117;
        }
        paramView = a(b.bc);
        if (i == 0) {
          break label128;
        }
        str = a(b.bg);
        label73:
        a(paramView, str);
      }
    }
    for (;;)
    {
      if (j == f.g) {
        a(a(b.bc), a(b.bg));
      }
      return;
      i = 0;
      break;
      label111:
      bool = false;
      break label27;
      label117:
      paramView = a(b.bd);
      break label61;
      label128:
      str = a(b.be);
      break label73;
      label139:
      a(NoDevicesActivity.a(this.y, bool));
    }
  }
  
  public final void p()
  {
    q();
  }
  
  public final void q()
  {
    int i;
    if (!((MainActivity)this.y).k()) {
      i = 3;
    }
    for (;;)
    {
      if (this.b.getDisplayedChild() != i) {
        this.b.setDisplayedChild(i);
      }
      return;
      if ((this.aa.g.size() == 0) && (this.aa.h.size() == 0) && (this.aa.m.size() == 0))
      {
        if (this.Z.c) {
          i = 2;
        } else {
          i = 0;
        }
      }
      else if ((this.ad) && (this.aa.b() == 1) && (this.aa.c())) {
        i = 0;
      } else {
        i = 1;
      }
    }
  }
  
  public final void r()
  {
    int k = 0;
    boolean bool;
    Object localObject1;
    int i;
    label98:
    Object localObject2;
    int j;
    if (this.af.h)
    {
      bool = this.ad;
      this.af.h = false;
      this.ad = false;
      this.ac.edit().putBoolean("FIRST_RUN", this.ad).apply();
      if (this.aa.b() != 1) {
        break label145;
      }
      localObject1 = (aow)this.aa.g.get(0);
      if ((localObject1 == null) || (!((aow)localObject1).q())) {
        break label150;
      }
      i = 1;
      localObject2 = ape.a();
      if (i == 0) {
        break label155;
      }
      j = 1;
      label109:
      ((ape)localObject2).a(50, Integer.valueOf(j), Long.valueOf(this.Z.d));
      if (i == 0) {
        break label161;
      }
      a((aow)localObject1, -1);
    }
    for (;;)
    {
      q();
      return;
      label145:
      localObject1 = null;
      break;
      label150:
      i = 0;
      break label98;
      label155:
      j = 0;
      break label109;
      label161:
      localObject1 = bkh.a().g;
      if (bool)
      {
        ((bke)localObject1).c = true;
        ((bke)localObject1).a();
      }
      localObject2 = this.aa;
      if (((alm)localObject2).g.isEmpty()) {
        i = k;
      }
      for (;;)
      {
        if (i == 0) {
          break label268;
        }
        ((bke)localObject1).b = true;
        ((bke)localObject1).a = true;
        ((bke)localObject1).a();
        break;
        localObject2 = ((alm)localObject2).g.iterator();
        for (;;)
        {
          if (((Iterator)localObject2).hasNext()) {
            if (((aow)((Iterator)localObject2).next()).q())
            {
              i = k;
              break;
            }
          }
        }
        i = 1;
      }
      label268:
      if ((!this.aa.a()) && (!this.aa.c()))
      {
        ((bke)localObject1).a = true;
        ((bke)localObject1).a();
      }
    }
  }
  
  public final void s()
  {
    v();
    azg localazg = SetupApplication.a().g;
    if (localazg != null)
    {
      Object localObject = this.aa.g.iterator();
      while (((Iterator)localObject).hasNext())
      {
        aow localaow = (aow)((Iterator)localObject).next();
        if ((localaow.q()) && (localaow.f().equals(localazg.a)) && (localaow.c.G == bdj.o) && (!localaow.s))
        {
          String str = localazg.a();
          localObject = str;
          if (str == null) {
            localObject = localaow.c.b;
          }
          localaow.s = true;
          localaow.t = ((String)localObject);
          localazg.a(new bdu(localaow.n(), localaow.c.a, null, bew.a, null), localaow.c, new ame(this, localaow, localazg));
        }
      }
    }
    ((MainActivity)this.y).f.b.notifyDataSetChanged();
    q();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ama.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
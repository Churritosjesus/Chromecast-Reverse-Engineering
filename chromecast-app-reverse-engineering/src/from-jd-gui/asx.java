import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public final class asx
  extends am
  implements CompoundButton.OnCheckedChangeListener, arg, arh, asq, asz
{
  private static final String b = null;
  private final blp Z = new blp("PhotosFragment", false);
  private aqw aa;
  private ard ab;
  private ark ac;
  private boolean ad;
  private CompoundButton ae;
  private lw af;
  private View ag;
  private ViewFlipper ah;
  private View ai;
  private TextView aj;
  private ListView ak;
  private boolean al = true;
  private dcj am;
  private boolean an = false;
  private int c;
  private MenuItem d;
  
  public static asx a(dcj paramdcj)
  {
    return a(paramdcj, "");
  }
  
  public static asx a(dcj paramdcj, String paramString)
  {
    asx localasx = new asx();
    Bundle localBundle = new Bundle();
    localBundle.putString("photoSettingDescription", paramdcj.d);
    localBundle.putByteArray("settingMetadata", dcj.a(paramdcj));
    localBundle.putString("targetUser", paramString);
    localBundle.putString(null, paramdcj.c);
    localasx.f(localBundle);
    return localasx;
  }
  
  private void a(boolean paramBoolean)
  {
    this.ak.setFocusable(paramBoolean);
    boolean bool2 = this.ab.f;
    lw locallw = this.af;
    boolean bool1;
    if ((paramBoolean) && (!bool2))
    {
      bool1 = true;
      locallw.setEnabled(bool1);
      if ((!paramBoolean) || (!bool2) || (this.af.b)) {
        break label90;
      }
      this.ah.setDisplayedChild(0);
      ((TextView)this.N.findViewById(f.dd)).setText(b.cJ);
    }
    for (;;)
    {
      return;
      bool1 = false;
      break;
      label90:
      if (this.ai == null)
      {
        this.ai = ((LayoutInflater)this.y.getSystemService("layout_inflater")).inflate(a.gl, null);
        this.aj = ((TextView)this.ai.findViewById(f.cl));
        this.ah.addView(this.ai, 1);
      }
      this.aj.setText(b.bO);
      this.ah.setDisplayedChild(1);
    }
  }
  
  private void b(int paramInt)
  {
    if (!this.ab.f)
    {
      this.af.a(true);
      this.ab.h = paramInt;
      this.ab.a();
    }
  }
  
  private void b(boolean paramBoolean)
  {
    auq localauq = this.aa.h().s();
    if (localauq.a(this.am.j) != paramBoolean)
    {
      localauq.a(this.am.j, paramBoolean);
      this.aa.h().d.a();
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.fz, paramViewGroup, false);
    i = blx.a(this.y);
    paramViewGroup = e();
    int j = Math.min(i - (paramViewGroup.getDimensionPixelSize(a.dE) << 1), paramViewGroup.getDimensionPixelSize(a.dD));
    this.ak = ((ListView)paramLayoutInflater.findViewById(16908298));
    paramViewGroup = (FrameLayout.LayoutParams)this.ak.getLayoutParams();
    paramViewGroup.width = j;
    this.ak.setLayoutParams(paramViewGroup);
    this.af = ((lw)paramLayoutInflater.findViewById(f.dm));
    lw locallw = this.af;
    int n = a.du;
    int k = a.dv;
    int m = a.dw;
    int i1 = a.dx;
    Object localObject = locallw.getResources();
    paramViewGroup = new int[4];
    for (i = 0; i < 4; i++) {
      paramViewGroup[i] = ((Resources)localObject).getColor(new int[] { n, k, m, i1 }[i]);
    }
    locallw.a();
    localObject = locallw.e;
    ((li)localObject).a.a(paramViewGroup);
    ((li)localObject).a.a(0);
    this.af.a = new asy(this);
    try
    {
      this.am = dcj.a(this.m.getByteArray("settingMetadata"));
      this.ah = ((ViewFlipper)paramLayoutInflater.findViewById(16908292));
      this.ag = paramLayoutInflater.findViewById(f.aO);
      paramViewGroup = this.ag;
      if (!this.aa.h().s().a(this.am.j)) {
        break label521;
      }
      i = 8;
    }
    catch (dev paramViewGroup)
    {
      for (;;)
      {
        this.Z.a("Could not load user setting metadata: %s", new Object[] { paramViewGroup });
        this.x.c();
        continue;
        i = 0;
      }
    }
    paramViewGroup.setVisibility(i);
    this.aa.c(this.m.getString(null));
    this.ab = new ard(this.y, this.aa.h(), this, this.am, this.m.getString("targetUser"), j, this.c);
    this.aa.h().a(this.ab);
    this.ak.setAdapter(this.ab);
    d(true);
    this.ad = this.aa.h().s().a(this.am.j);
    if (paramBundle != null)
    {
      this.c = paramBundle.getInt("sortOptionState");
      this.ad = paramBundle.getBoolean("photoSettingsState", this.ad);
      if (paramBundle.getBoolean("userRequestedRefresh", false))
      {
        this.af.a(true);
        b(this.c);
      }
    }
    return paramLayoutInflater;
  }
  
  public final void a()
  {
    super.a();
    this.aa = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.aa = ((aqw)paramActivity);
  }
  
  public final void a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    paramMenu.findItem(f.bS).setVisible(true);
    if ((this.am.i[0].p != null) && (this.am.i[0].p.length > 0))
    {
      paramMenuInflater.inflate(a.hc, paramMenu);
      paramMenu.findItem(f.bW).setVisible(true);
      SubMenu localSubMenu = paramMenu.findItem(f.bW).getSubMenu();
      for (dcf localdcf : this.am.i[0].p)
      {
        MenuItem localMenuItem = localSubMenu.add(f.dT, localdcf.a.intValue(), 0, localdcf.b).setCheckable(true);
        if ((localdcf.c != null) && (localdcf.c.booleanValue()))
        {
          localMenuItem.setChecked(true);
          this.d = localMenuItem;
        }
      }
      localSubMenu.setGroupCheckable(f.dT, true, true);
    }
    paramMenuInflater.inflate(a.gW, paramMenu);
    this.ae = asr.a(paramMenu.findItem(f.bJ), this, Boolean.valueOf(this.ad));
  }
  
  public final void a(View paramView, int paramInt)
  {
    ??? = (CheckBox)paramView.findViewById(f.Y);
    ((CheckBox)???).toggle();
    paramView = this.ab;
    boolean bool = ((CheckBox)???).isChecked();
    Object localObject4 = paramView.b(paramInt);
    for (;;)
    {
      synchronized (paramView.a)
      {
        Object localObject2 = paramView.a(String.valueOf(((dbq)localObject4).a), ((dbq)localObject4).e);
        if (bool)
        {
          Object localObject3 = new dca;
          ((dca)localObject3).<init>();
          if (((dbq)localObject4).a != null) {
            ((dca)localObject3).a = String.valueOf(((dbq)localObject4).a);
          }
          ((dca)localObject3).b = ((dbq)localObject4).e;
          paramView.a.put(localObject2, localObject3);
          localObject2 = paramView.b.s();
          localObject4 = paramView.g;
          localObject3 = (dca[])paramView.a.values().toArray(new dca[paramView.a.size()]);
          ((auq)localObject2).c((String)localObject4).b = ((dca[])localObject3);
          paramView.b.d.a();
          if (paramView.e != null) {
            paramView.e.p();
          }
          if (this.ab.a.size() != 0)
          {
            bool = true;
            b(bool);
            ape.a().a(new apd(76).a(this.am.b.intValue()));
          }
        }
        else
        {
          paramView.a.remove(localObject2);
          paramView.i.remove(String.valueOf(((dbq)localObject4).a));
        }
      }
      bool = false;
    }
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, Long paramLong, String paramString3, int paramInt2)
  {
    this.ac = ark.a(paramString1, paramString2, paramInt1, paramLong, paramString3, paramInt2);
    this.ac.a(this.y.b, "backdropPreviewFragment");
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    boolean bool = true;
    if (paramMenuItem.getItemId() == f.bS) {
      b(this.c);
    }
    for (;;)
    {
      return bool;
      if (paramMenuItem.getItemId() == f.bW) {
        this.d.setChecked(true);
      } else if (paramMenuItem.getGroupId() == f.dT)
      {
        if (this.d == paramMenuItem)
        {
          b(this.c);
        }
        else
        {
          this.d.setChecked(false);
          paramMenuItem.setChecked(true);
          this.c = paramMenuItem.getItemId();
          this.d = paramMenuItem;
          b(this.c);
        }
      }
      else {
        bool = super.a(paramMenuItem);
      }
    }
  }
  
  public final void a_(int paramInt)
  {
    boolean bool;
    if (paramInt == 2)
    {
      if ((this.aa.h().s().a(this.am.j)) && (this.ae != null)) {
        this.ae.setChecked(true);
      }
      if (this.ae == null)
      {
        bool = this.ad;
        a(bool);
      }
    }
    for (;;)
    {
      return;
      bool = this.ae.isChecked();
      break;
      if (paramInt == 3) {
        this.ab.notifyDataSetChanged();
      }
    }
  }
  
  public final void b()
  {
    if ((this.ae == null) || (this.ae.isChecked())) {}
    for (boolean bool = true;; bool = false)
    {
      a(bool);
      return;
    }
  }
  
  public final void c()
  {
    boolean bool = false;
    this.af.a(false);
    if ((this.ae == null) || (this.ae.isChecked())) {
      bool = true;
    }
    a(bool);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.ae != null)
    {
      paramBundle.putBoolean("photoSettingsState", this.ae.isChecked());
      paramBundle.putBoolean("userRequestedRefresh", this.af.b);
      paramBundle.putInt("sortOptionState", this.c);
    }
    this.al = false;
  }
  
  public final void j()
  {
    super.j();
    this.aa.h().a(this);
    this.ab.d = this;
    this.ab.c = this;
  }
  
  public final void k()
  {
    super.k();
    this.aa.h().b(this);
    this.ab.d = null;
    this.ab.c = null;
  }
  
  public final void l()
  {
    super.l();
    auq localauq = this.aa.h().s();
    if ((this.al) && (localauq.a(this.am.j)) && (this.ab.a.size() == 0) && (!this.y.isFinishing()))
    {
      this.aa.h().s().a(this.am.j, false);
      this.aa.h().b(2);
      Toast.makeText(this.y.getApplicationContext(), b.cK, 0).show();
    }
    this.aa.h().b(this.ab);
    this.af = null;
    this.ah = null;
    this.aj = null;
    this.ab = null;
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    int i = 0;
    if (paramCompoundButton == this.ae)
    {
      b(paramBoolean);
      a(paramBoolean);
      if (!this.an) {
        break label33;
      }
      this.an = false;
    }
    for (;;)
    {
      return;
      label33:
      paramCompoundButton = this.ag;
      if (paramBoolean) {
        i = 8;
      }
      paramCompoundButton.setVisibility(i);
      ape.a().a(new apd(76).a(this.am.b.intValue()));
    }
  }
  
  public final void p()
  {
    if (this.ab.a.size() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      if (this.ae.isChecked() != bool)
      {
        this.an = true;
        this.ae.setChecked(bool);
        this.aa.h().s().a(this.am.j, bool);
      }
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\asx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
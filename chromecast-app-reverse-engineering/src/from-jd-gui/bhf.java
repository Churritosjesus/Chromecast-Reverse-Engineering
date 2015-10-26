import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.android.apps.chromecast.app.DeviceSettingsActivity;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public final class bhf
  extends j
  implements CompoundButton.OnCheckedChangeListener, asq
{
  private static final long d = TimeUnit.SECONDS.toMillis(5L);
  private DeviceSettingsActivity Z;
  public ArrayList a;
  private bmg aa;
  private bmi ab;
  private View ac;
  private TextView ad;
  private View ae;
  private Spinner af;
  private Spinner ag;
  private Spinner ah;
  private View ai;
  private SwitchCompat aj;
  private SwitchCompat ak;
  private CheckBox al;
  private CheckBox am;
  private View an;
  private TextView ao;
  private CompoundButton ap;
  private TextView aq;
  private Button ar;
  private View as;
  private TextView at;
  private final Handler au = new Handler();
  private Runnable av;
  private blp aw = new blp("DeviceSettingsFragment", false);
  public ViewFlipper b;
  public TextView c;
  
  private String a(bdk parambdk)
  {
    if (parambdk == bdk.a) {
      parambdk = a(b.dO);
    }
    for (;;)
    {
      return parambdk;
      if (parambdk == bdk.b) {
        parambdk = a(b.dP);
      } else {
        parambdk = a(b.dQ);
      }
    }
  }
  
  private List a(bcz parambcz)
  {
    TreeMap localTreeMap = new TreeMap();
    if (this.Z.i.X != null)
    {
      Iterator localIterator = this.Z.i.X.iterator();
      while (localIterator.hasNext())
      {
        bcz localbcz = (bcz)localIterator.next();
        localTreeMap.put(localbcz.toString(), localbcz);
      }
    }
    if ((parambcz != null) && (parambcz.toString() != null)) {
      localTreeMap.put(parambcz.toString(), parambcz);
    }
    return new ArrayList(localTreeMap.values());
  }
  
  private void a(int paramInt1, int paramInt2, String paramString)
  {
    TextView localTextView = (TextView)this.ac.findViewById(paramInt1);
    if (TextUtils.isEmpty(paramString)) {
      localTextView.setVisibility(8);
    }
    for (;;)
    {
      return;
      localTextView.setVisibility(0);
      localTextView.setText(a(paramInt2, new Object[] { paramString }));
    }
  }
  
  private void a(int paramInt, Spinner paramSpinner)
  {
    this.ac.findViewById(paramInt).setOnClickListener(new bhl(this, paramSpinner));
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.ap == null) {}
    for (;;)
    {
      return;
      if (paramBoolean != this.ap.isChecked())
      {
        this.ap.setOnCheckedChangeListener(null);
        this.ap.setChecked(paramBoolean);
        this.ap.setOnCheckedChangeListener(this);
      }
      Object localObject2 = this.Z.i;
      Object localObject1;
      if (paramBoolean != ((bdf)localObject2).c())
      {
        localObject1 = new HashMap();
        ((HashMap)localObject1).put("opt_in_opencast", Boolean.valueOf(paramBoolean));
        this.Z.a((HashMap)localObject1, new bia(this, (bdf)localObject2), -1);
        localObject2 = ape.a();
        localObject1 = new apd(72);
        if (!paramBoolean) {
          break label159;
        }
      }
      label159:
      for (int i = 1;; i = 0)
      {
        ((ape)localObject2).a(((apd)localObject1).a(i));
        if (!paramBoolean) {
          break label165;
        }
        this.ap.setText(b.dh);
        b(this.Z.i.R);
        break;
      }
      label165:
      if (this.av != null) {
        this.au.removeCallbacks(this.av);
      }
      this.ap.setText(b.dg);
      this.ao.setText(b.dg);
      this.aq.setText("");
    }
  }
  
  private void b(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      this.ao.setText(b.dl);
      this.aq.setText(b.dl);
      if (this.av == null) {
        this.av = new bhy(this);
      }
      this.au.postDelayed(this.av, d);
    }
    for (;;)
    {
      return;
      paramString = a(b.dn, new Object[] { paramString });
      this.ao.setText(paramString);
      this.aq.setText(paramString);
    }
  }
  
  private void c(int paramInt)
  {
    if (this.b.getDisplayedChild() != paramInt) {
      this.b.setDisplayedChild(paramInt);
    }
  }
  
  private void c(String paramString)
  {
    aow localaow = SetupApplication.a().b().c(this.Z.h);
    if (localaow != null)
    {
      localaow.c.R = paramString;
      localaow.p();
    }
  }
  
  private void r()
  {
    if (!s()) {
      return;
    }
    View localView = this.ac.findViewById(f.D);
    if (!DeviceSettingsActivity.n()) {
      this.at.setText(b.aj);
    }
    for (;;)
    {
      localView.setClickable(true);
      break;
      if (!this.Z.g.q())
      {
        this.at.setText(b.dC);
        localView.setClickable(false);
        break;
      }
      if (this.Z.g.r()) {
        this.at.setText(b.dh);
      } else {
        this.at.setText(b.dg);
      }
    }
  }
  
  private boolean s()
  {
    if ((this.Z != null) && (this.Z.g != null) && (this.Z.s())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramBundle.containsKey("configuredNetworks"))) {
      this.a = paramBundle.getParcelableArrayList("configuredNetworks");
    }
    this.ac = paramLayoutInflater.inflate(a.fU, paramViewGroup, false);
    this.Z.c(e().getString(b.ba));
    this.b = ((ViewFlipper)this.ac.findViewById(f.aI));
    this.ad = ((TextView)this.ac.findViewById(f.ar));
    this.ae = this.ac.findViewById(f.dF);
    this.c = ((TextView)this.ac.findViewById(f.as));
    this.af = ((Spinner)this.ac.findViewById(f.aL));
    this.ag = ((Spinner)this.ac.findViewById(f.aJ));
    this.ah = ((Spinner)this.ac.findViewById(f.aB));
    this.ai = this.ac.findViewById(f.dE);
    this.aj = ((SwitchCompat)this.ac.findViewById(f.be));
    this.ak = ((SwitchCompat)this.ac.findViewById(f.bc));
    this.an = this.ac.findViewById(f.cD);
    this.an.setVisibility(8);
    this.ap = ((CompoundButton)this.ac.findViewById(f.bd));
    this.ap.setOnCheckedChangeListener(this);
    this.aq = ((TextView)this.ac.findViewById(f.cB));
    this.ao = ((TextView)this.ac.findViewById(f.cC));
    this.ar = ((Button)this.ac.findViewById(f.bE));
    this.al = ((CheckBox)this.ac.findViewById(f.ap));
    this.al.setOnCheckedChangeListener(new bhg(this));
    this.as = this.ac.findViewById(f.D);
    this.at = ((TextView)this.ac.findViewById(f.E));
    this.am = ((CheckBox)this.ac.findViewById(f.ay));
    this.am.setVisibility(8);
    this.am.setOnCheckedChangeListener(new bhr(this));
    d(true);
    return this.ac;
  }
  
  public final void a()
  {
    super.a();
    this.au.removeCallbacks(this.av);
    this.Z = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.Z = ((DeviceSettingsActivity)paramActivity);
  }
  
  public final void a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    paramMenuInflater.inflate(a.gZ, paramMenu);
    paramMenuInflater.inflate(a.gX, paramMenu);
    super.a(paramMenu, paramMenuInflater);
  }
  
  public final void a(String paramString)
  {
    this.ad.setText(paramString);
  }
  
  public final void a_(int paramInt)
  {
    if (paramInt != 1) {}
    for (;;)
    {
      return;
      r();
    }
  }
  
  public void b(int paramInt)
  {
    int j = 8;
    int i;
    Object localObject1;
    label52:
    String str;
    if (paramInt == 2)
    {
      i = 1;
      if ((paramInt != 1) && (paramInt != 2)) {
        break label209;
      }
      this.Z.c(e().getString(b.dm));
      localObject1 = this.ar;
      if (i == 0) {
        break label199;
      }
      paramInt = 8;
      ((Button)localObject1).setVisibility(paramInt);
      localObject1 = this.ac.findViewById(f.eB);
      paramInt = j;
      if (i != 0) {
        paramInt = 0;
      }
      ((View)localObject1).setVisibility(paramInt);
      str = blx.a(this.y, this.Z.i);
      Object localObject2 = blx.b(this.y, this.Z.i);
      localObject1 = a(b.dj, new Object[] { str });
      str = a(b.di, new Object[] { str, localObject2 });
      localObject2 = (TextView)this.ac.findViewById(f.eA);
      if (i == 0) {
        break label204;
      }
      label171:
      ((TextView)localObject2).setText((CharSequence)localObject1);
      c(1);
      this.Z.d().f();
    }
    for (;;)
    {
      return;
      i = 0;
      break;
      label199:
      paramInt = 0;
      break label52;
      label204:
      localObject1 = str;
      break label171;
      label209:
      this.Z.c(e().getString(b.ba));
      c(paramInt);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putParcelableArrayList("configuredNetworks", this.a);
  }
  
  public final void g_()
  {
    super.g_();
    if (s()) {
      this.Z.g.a(this);
    }
    if (this.Z.i.X == null)
    {
      this.Z.u = false;
      this.Z.a(a(b.aR, new Object[] { this.Z.D() }), new bib(this));
      this.Z.x();
      this.Z.a(this.Z.p, new bic(this), false, true);
    }
    for (;;)
    {
      return;
      p();
    }
  }
  
  public final void h_()
  {
    super.h_();
    if (this.Z.g != null) {
      this.Z.g.b(this);
    }
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramCompoundButton == this.ap)
    {
      a(paramBoolean);
      if (!paramBoolean) {
        c(null);
      }
    }
  }
  
  public final void p()
  {
    boolean bool = false;
    Object localObject1 = this.Z.i;
    this.ad.setText(((bdf)localObject1).b);
    Object localObject2;
    if (((bdf)localObject1).w)
    {
      this.ae.setVisibility(8);
      this.an.setOnClickListener(new bif(this));
      this.ar.setOnClickListener(new big(this));
      this.ac.findViewById(f.aG).setOnClickListener(new bih(this));
      this.ac.findViewById(f.dF).setOnClickListener(new bii(this));
      localObject2 = this.Z.i.I;
      Object localObject3 = new TreeSet();
      if (this.Z.i.W != null) {
        ((Set)localObject3).addAll(this.Z.i.W);
      }
      if ((localObject2 != null) && (((bdb)localObject2).toString() != null) && (((bdb)localObject2).b != null)) {
        ((Set)localObject3).add(localObject2);
      }
      localObject3 = new ArrayList((Collection)localObject3);
      Object localObject4 = new bop(this.Z, (List)localObject3);
      this.af.setAdapter((SpinnerAdapter)localObject4);
      if (localObject2 != null)
      {
        i = ((bop)localObject4).getPosition(localObject2);
        if (i != -1) {
          this.af.setSelection(i);
        }
      }
      this.af.setOnItemSelectedListener(new bhh(this, (List)localObject3));
      a(f.aM, this.af);
      localObject3 = this.Z.i.K;
      localObject4 = a((bcz)localObject3);
      localObject2 = new ArrayAdapter(this.Z, a.gJ, f.aY, (List)localObject4);
      ((ArrayAdapter)localObject2).setDropDownViewResource(a.gL);
      this.ah.setAdapter((SpinnerAdapter)localObject2);
      if (localObject3 != null)
      {
        i = ((ArrayAdapter)localObject2).getPosition(localObject3);
        if (i != -1) {
          this.ah.setSelection(i);
        }
      }
      this.ah.setOnItemSelectedListener(new bhi(this, (List)localObject4));
      a(f.aC, this.ah);
      if (!((bdf)localObject1).d()) {
        break label974;
      }
      localObject2 = this.Z.i.J;
      localObject3 = new ArrayList(2);
      ((List)localObject3).add(a(bdk.a));
      ((List)localObject3).add(a(bdk.b));
      localObject3 = new ArrayAdapter(this.Z, a.gJ, (List)localObject3);
      ((ArrayAdapter)localObject3).setDropDownViewResource(a.gL);
      this.ag.setAdapter((SpinnerAdapter)localObject3);
      if (localObject2 == bdk.b) {
        this.ag.setSelection(1);
      }
      this.ag.setOnItemSelectedListener(new bhm(this));
      a(f.aK, this.ag);
    }
    label622:
    label633:
    label712:
    label934:
    label940:
    label950:
    label962:
    label974:
    for (int i = 0;; i = 8)
    {
      this.ac.findViewById(f.aK).setVisibility(i);
      a(f.az, b.aU, ((bdf)localObject1).u);
      a(f.aD, b.aV, ((bdf)localObject1).p);
      a(f.at, b.aJ, ((bdf)localObject1).c);
      a(f.av, b.aS, ((bdf)localObject1).L);
      this.al.setChecked(((bdf)localObject1).O);
      if (((bdf)localObject1).h)
      {
        this.aj.setChecked(false);
        this.ak.setChecked(false);
        this.ai.setVisibility(8);
        if (((bdf)localObject1).a > 5) {
          break label934;
        }
        i = 1;
        if (i != 0)
        {
          this.am.setVisibility(0);
          this.am.setChecked(((bdf)localObject1).Q);
        }
        if (!((bdf)localObject1).e()) {
          break label950;
        }
        this.an.setVisibility(0);
        a(((bdf)localObject1).c());
        localObject2 = (ImageView)this.ac.findViewById(f.ez);
        if (localObject2 != null)
        {
          if (!((bdf)localObject1).h) {
            break label940;
          }
          ((ImageView)localObject2).setImageResource(a.eA);
        }
        if (!s()) {
          break label962;
        }
        r();
        this.as.setVisibility(0);
        localObject1 = this.ac.findViewById(f.D);
        ((View)localObject1).setOnClickListener(new bie(this));
        if ((this.Z.g.q()) || (!DeviceSettingsActivity.n())) {
          bool = true;
        }
        ((View)localObject1).setClickable(bool);
      }
      for (;;)
      {
        return;
        this.ae.setVisibility(0);
        this.c.setText(((bdf)localObject1).y);
        break;
        this.aj.setChecked(((bdf)localObject1).M);
        this.ak.setChecked(((bdf)localObject1).N);
        this.ac.findViewById(f.aH).setOnClickListener(new bho(this));
        this.aj.setOnCheckedChangeListener(new bhp(this));
        this.ac.findViewById(f.aw).setOnClickListener(new bhq(this));
        this.ak.setOnCheckedChangeListener(new bhs(this));
        ((Button)this.ac.findViewById(f.bn)).setOnClickListener(new bht(this));
        this.ai.setVisibility(0);
        break label622;
        i = 0;
        break label633;
        ((ImageView)localObject2).setImageResource(a.eB);
        break label712;
        this.an.setVisibility(8);
        break label712;
        this.as.setVisibility(8);
      }
    }
  }
  
  bdf q()
  {
    return this.Z.i;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bhf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
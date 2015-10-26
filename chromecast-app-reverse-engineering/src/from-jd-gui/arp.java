import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class arp
  extends j
  implements CompoundButton.OnCheckedChangeListener, asq, asz
{
  private static final int[] b = { 1, 2, 3, 4, 7, 9, 10, 11, 13, 14, 12, 16, 17, 18 };
  private static final Set c = new HashSet(Arrays.asList(new Integer[] { Integer.valueOf(14), Integer.valueOf(13), Integer.valueOf(12), Integer.valueOf(16) }));
  private static final List d = Arrays.asList(new String[] { "user_photos" });
  private aqw Z;
  public afm a;
  private View aa;
  private ViewFlipper ab;
  private ListView ac;
  private TextView ad;
  private art ae;
  private dcj af;
  private SwitchCompat ag;
  private boolean ah = true;
  private final blp ai = new blp("BackdropSettingFragment", false);
  private boolean aj = false;
  
  public static arp a(dcj paramdcj)
  {
    arp localarp = new arp();
    Bundle localBundle = new Bundle();
    if (paramdcj != null) {
      localBundle.putByteArray("userSettingMetadata", dcj.a(paramdcj));
    }
    localarp.f(localBundle);
    return localarp;
  }
  
  public static List b(dcj paramdcj)
  {
    if ((paramdcj.m != null) && (paramdcj.m.length > 0)) {}
    for (paramdcj = Arrays.asList(paramdcj.m);; paramdcj = d) {
      return paramdcj;
    }
  }
  
  private void q()
  {
    int i;
    label66:
    dcj localdcj;
    if (this.af == null)
    {
      this.ab.setDisplayedChild(1);
      ((TextView)this.N.findViewById(f.dd)).setText(b.dC);
      if (this.ab.getDisplayedChild() != 0) {
        break label224;
      }
      this.ae.clear();
      dcj[] arrayOfdcj = this.af.i;
      int k = arrayOfdcj.length;
      i = 0;
      if (i >= k) {
        break label177;
      }
      localdcj = arrayOfdcj[i];
      Integer localInteger = localdcj.a;
      if (localInteger == null) {
        break label171;
      }
      int m = localInteger.intValue();
      j = 0;
      label96:
      if (j >= b.length) {
        break label171;
      }
      if (b[j] != m) {
        break label165;
      }
    }
    label165:
    label171:
    for (int j = 1;; j = 0)
    {
      if (j != 0) {
        this.ae.add(localdcj);
      }
      i++;
      break label66;
      this.ab.setDisplayedChild(0);
      this.Z.c(this.af.c);
      break;
      j++;
      break label96;
    }
    label177:
    if ((this.af.d != null) && (this.ad != null))
    {
      this.ad.setText(this.af.d);
      this.ad.setVisibility(0);
      this.ac.setHeaderDividersEnabled(true);
    }
    for (;;)
    {
      label224:
      return;
      if (this.ad != null) {
        this.ad.setVisibility(8);
      }
      this.ac.setHeaderDividersEnabled(false);
    }
  }
  
  private boolean r()
  {
    boolean bool2 = true;
    String[] arrayOfString = this.af.k;
    boolean bool1 = bool2;
    int i;
    if (arrayOfString != null)
    {
      bool1 = bool2;
      if (arrayOfString.length > 0)
      {
        int j = arrayOfString.length;
        i = 0;
        if (i >= j) {
          break label76;
        }
        String str = arrayOfString[i];
        if (!this.Z.h().s().a(str)) {
          break label70;
        }
      }
    }
    label70:
    label76:
    for (bool1 = bool2;; bool1 = false)
    {
      return bool1;
      i++;
      break;
    }
  }
  
  private boolean s()
  {
    if ((this.af == null) || (this.af.b == null) || (this.Z.h().s().a(this.af.j))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    int j = 0;
    paramBundle = this.af;
    boolean bool;
    if ((paramBundle != null) && (paramBundle.s != null)) {
      bool = paramBundle.s.booleanValue();
    }
    for (;;)
    {
      this.ae = new art(this.y, this, 17367043, new ArrayList(), bool);
      paramViewGroup = paramLayoutInflater.inflate(a.fE, paramViewGroup, false);
      this.aa = paramViewGroup.findViewById(f.aO);
      this.ab = ((ViewFlipper)paramViewGroup.findViewById(f.eu));
      this.ac = ((ListView)paramViewGroup.findViewById(f.dD));
      if (!bool)
      {
        this.ad = ((TextView)paramLayoutInflater.inflate(a.fw, null));
        this.ac.addHeaderView(this.ad, null, false);
      }
      if (bool)
      {
        i = blx.a(this.y);
        paramLayoutInflater = e();
        i = Math.min(i - (paramLayoutInflater.getDimensionPixelSize(a.dE) << 1), paramLayoutInflater.getDimensionPixelSize(a.dD));
        paramLayoutInflater = (FrameLayout.LayoutParams)this.ac.getLayoutParams();
        paramLayoutInflater.width = i;
        this.ac.setLayoutParams(paramLayoutInflater);
        this.ac.setVerticalScrollBarEnabled(false);
        this.ac.setDivider(new ColorDrawable(0));
        this.ac.setDividerHeight(e().getDimensionPixelSize(a.dN));
      }
      this.ac.setAdapter(this.ae);
      paramLayoutInflater = this.aa;
      int i = j;
      if (s()) {
        i = 8;
      }
      paramLayoutInflater.setVisibility(i);
      return paramViewGroup;
      if ((paramBundle != null) && (paramBundle.i != null))
      {
        paramBundle = paramBundle.i;
        int k = paramBundle.length;
        for (i = 0;; i++)
        {
          if (i >= k) {
            break label357;
          }
          Object localObject = paramBundle[i];
          if ((((dcj)localObject).a != null) && (c.contains(((dcj)localObject).a)))
          {
            bool = true;
            break;
          }
        }
      }
      label357:
      bool = false;
    }
  }
  
  public final void a()
  {
    super.a();
    this.a = null;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    if (this.a != null) {
      this.a.a(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (!afv.a()) {
      afv.a(paramActivity.getApplicationContext());
    }
    if (this.a == null) {
      this.a = new aik();
    }
    this.Z = ((aqw)paramActivity);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = this.m;
    }
    if (localBundle != null)
    {
      paramBundle = localBundle.getByteArray("userSettingMetadata");
      if ((this.af != null) || (paramBundle == null)) {}
    }
    try
    {
      this.af = dcj.a(paramBundle);
      return;
    }
    catch (dev paramBundle)
    {
      for (;;)
      {
        this.ai.a("Could not load user setting metadata: %s", new Object[] { paramBundle });
      }
    }
  }
  
  public final void a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    paramMenuInflater.inflate(a.gW, paramMenu);
    this.ag = asr.a(paramMenu.findItem(f.bJ), this, Boolean.valueOf(s()));
    super.a(paramMenu, paramMenuInflater);
    q();
  }
  
  public final void a_(int paramInt)
  {
    ash localash = this.Z.h();
    if (paramInt == 4) {
      if (this.af == null)
      {
        this.af = localash.t().b;
        if (this.af == null)
        {
          this.y.b.c();
          Toast.makeText(this.y, a(b.aa), 1).show();
        }
      }
    }
    do
    {
      for (;;)
      {
        return;
        q();
        continue;
        this.af = localash.b(this.af.j);
        q();
        continue;
        if (paramInt != 1) {
          break;
        }
        q();
      }
    } while ((paramInt != 2) || (this.af == null));
    if (this.af.j != null)
    {
      if (this.ag == null) {
        break label160;
      }
      this.ag.setChecked(s());
    }
    for (;;)
    {
      this.ae.notifyDataSetChanged();
      break;
      label160:
      if (this.ag == null) {
        q();
      }
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.af != null) {
      paramBundle.putByteArray("userSettingMetadata", dcj.a(this.af));
    }
    this.ah = false;
  }
  
  public final void j()
  {
    boolean bool = true;
    super.j();
    this.Z.h().a(this);
    this.ah = true;
    if ((this.af != null) && (this.af.b != null))
    {
      if (this.ag == null) {
        break label106;
      }
      if (!bool) {
        break label89;
      }
      this.ag.setVisibility(0);
      this.ag.setChecked(s());
      this.ag.setOnCheckedChangeListener(this);
    }
    for (;;)
    {
      q();
      return;
      bool = false;
      break;
      label89:
      this.ag.setVisibility(8);
      this.ag = null;
      continue;
      label106:
      d(bool);
    }
  }
  
  public final void k()
  {
    super.k();
    this.Z.h().b(this);
  }
  
  public final void l()
  {
    super.l();
    auq localauq = this.Z.h().s();
    if ((this.ah) && (this.af != null) && (this.af.j != null) && (!r()) && (localauq.a(this.af.j)))
    {
      localauq.a(this.af.j, false);
      this.Z.h().b(2);
      Toast.makeText(this.y.getApplicationContext(), a(b.ai, new Object[] { this.af.c }), 0).show();
    }
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    int i = 0;
    if (paramCompoundButton == this.ag)
    {
      q();
      if (!this.aj) {
        break label93;
      }
      this.aj = false;
    }
    for (;;)
    {
      this.Z.h().s().a(this.af.j, paramBoolean);
      this.Z.h().d.a();
      ape.a().a(new apd(76).a(this.af.b.intValue()));
      return;
      label93:
      paramCompoundButton = this.aa;
      if (paramBoolean) {
        i = 8;
      }
      paramCompoundButton.setVisibility(i);
    }
  }
  
  public final void p()
  {
    boolean bool = r();
    if ((this.ag != null) && (this.ag.isChecked() != bool))
    {
      this.aj = true;
      this.ag.setChecked(bool);
      this.Z.h().s().a(this.af.j, bool);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\arp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
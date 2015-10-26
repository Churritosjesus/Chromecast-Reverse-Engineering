import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.chromecast.app.widget.ReusableImageView;

public final class awr
  extends j
{
  private View Z;
  private final blp a = new blp("ContentDetailsActivity");
  private View aa;
  private View ab;
  private ScrollView ac;
  private ViewGroup ad;
  private ViewGroup ae;
  private ViewGroup af;
  private ReusableImageView ag;
  private TextView ah;
  private TextView ai;
  private TextView aj;
  private TextView ak;
  private ReusableImageView al;
  private View am;
  private atf an;
  private int ao;
  private int ap;
  private final ViewTreeObserver.OnScrollChangedListener aq = new aws(this);
  private int b;
  private dbb c;
  private String d;
  
  public static awr a(String paramString, dbb paramdbb, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("contentId", paramString);
    localBundle.putBoolean("fromSearch", paramBoolean);
    if (paramdbb != null) {
      localBundle.putByteArray("contentDetails", dbb.a(paramdbb));
    }
    paramString = new awr();
    paramString.f(localBundle);
    return paramString;
  }
  
  private void a(dbb paramdbb)
  {
    if (paramdbb == null)
    {
      Toast.makeText(this.y, b.aH, 0).show();
      this.x.c();
    }
    for (;;)
    {
      return;
      blx.a(this.ak, paramdbb.f);
      blx.a(this.ai, paramdbb.d);
      blx.a(this.aj, paramdbb.e);
      blx.a(this.ah, paramdbb.g);
      int i;
      Object localObject1;
      int m;
      label250:
      label351:
      Object localObject2;
      label380:
      label470:
      label548:
      View localView;
      Button localButton;
      String str2;
      String str1;
      if ((paramdbb.a != null) && (!TextUtils.isEmpty(paramdbb.a.a)))
      {
        i = 1;
        if ((paramdbb.c == null) || (TextUtils.isEmpty(paramdbb.c.a))) {
          break label744;
        }
        this.ag.setVisibility(0);
        localObject1 = e();
        m = ((Resources)localObject1).getDimensionPixelSize(a.eg);
        int k = ((Resources)localObject1).getDimensionPixelSize(a.dK);
        j = paramdbb.c.c.intValue() * k / paramdbb.c.b.intValue();
        this.ag.a(this.an.m, paramdbb.c.a, false, k, j);
        if ((i != 0) && (paramdbb.c.b.intValue() < paramdbb.c.c.intValue())) {
          break label721;
        }
        this.ag.setTranslationY(m * 2);
        this.Z.setMinimumHeight(m * 3 + j);
        if (i == 0) {
          break label776;
        }
        this.aa.setBackgroundResource(a.ek);
        i = (int)(blx.b(this.y) * 0.5625F);
        this.al.a(this.an.m, paramdbb.a.a, false, this.ao, i);
        if (TextUtils.isEmpty(paramdbb.b)) {
          break label764;
        }
        this.am.setVisibility(0);
        localObject1 = new awz(this, paramdbb);
        this.al.setOnClickListener((View.OnClickListener)localObject1);
        this.am.setOnClickListener((View.OnClickListener)localObject1);
        this.aa.setTranslationY(0.0F);
        this.ad.setVisibility(8);
        localObject2 = paramdbb.h;
        j = localObject2.length;
        i = 0;
        if (i < j)
        {
          localObject1 = localObject2[i];
          if ((((dbc)localObject1).d != 1) || (((dbc)localObject1).c == null)) {
            break label836;
          }
          this.ad.setVisibility(0);
          ((TextView)this.ad.findViewById(f.dk)).setText(((dbc)localObject1).a);
          localObject2 = (ImageView)this.ad.findViewById(f.en);
          if (((dbc)localObject1).c.floatValue() < 0.6F) {
            break label826;
          }
          ((ImageView)localObject2).setImageResource(a.ew);
          if (!TextUtils.isEmpty(((dbc)localObject1).b)) {
            this.ad.setOnClickListener(new axa(this, (dbc)localObject1));
          }
        }
        this.ae.removeAllViews();
        if (paramdbb.j.length == 0)
        {
          localObject1 = this.y.getLayoutInflater().inflate(a.gT, null);
          this.ae.addView((View)localObject1);
        }
        dbe[] arrayOfdbe = paramdbb.j;
        k = arrayOfdbe.length;
        i = 0;
        if (i >= k) {
          break label849;
        }
        localObject1 = arrayOfdbe[i];
        localView = this.y.getLayoutInflater().inflate(a.gD, null);
        ((ReusableImageView)localView.findViewById(f.n)).a(this.an.m, ((dbe)localObject1).a.a, false, 0, 0);
        localButton = (Button)localView.findViewById(f.ex);
        boolean bool = this.m.getBoolean("fromSearch", false);
        localObject2 = ((dbe)localObject1).b;
        str2 = ((dbe)localObject1).c;
        str1 = ((dbe)localObject1).e;
        if (!bool) {
          break label842;
        }
      }
      label721:
      label744:
      label764:
      label776:
      label826:
      label836:
      label842:
      for (int j = 134;; j = 123)
      {
        apg localapg = apg.a(j);
        localapg.c = this.d;
        localapg.b = ((dbe)localObject1).d;
        blx.a(localButton, (String)localObject2, str2, str1, localapg.a());
        this.ae.addView(localView);
        i++;
        break label548;
        i = 0;
        break;
        this.ag.setTranslationY(0.0F);
        this.Z.setMinimumHeight(j + m);
        break label250;
        this.ag.setVisibility(8);
        this.Z.setMinimumHeight(0);
        break label250;
        this.am.setVisibility(8);
        break label351;
        this.aa.setBackgroundResource(0);
        this.aa.setBackgroundColor(e().getColor(a.dq));
        this.al.setLayoutParams(new RelativeLayout.LayoutParams(this.ao, this.b));
        break label351;
        ((ImageView)localObject2).setImageResource(a.eZ);
        break label470;
        i++;
        break label380;
      }
      label849:
      this.af.removeAllViews();
      if (paramdbb.i != null) {
        for (localObject2 : paramdbb.i)
        {
          paramdbb = this.y.getLayoutInflater().inflate(a.fM, null);
          ((TextView)paramdbb.findViewById(f.ca)).setText(((dbd)localObject2).a);
          ((TextView)paramdbb.findViewById(f.cb)).setText(((dbd)localObject2).b);
          this.af.addView(paramdbb);
        }
      }
      this.ab.setVisibility(8);
      this.ac.setVisibility(0);
    }
  }
  
  private void a(String paramString)
  {
    aww localaww = new aww(this, paramString);
    if (this.m.getBoolean("fromSearch", false)) {
      this.an.a(paramString, localaww, true);
    }
    for (;;)
    {
      return;
      this.an.a(paramString, localaww, false);
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(a.fN, paramViewGroup, false);
    this.ao = blx.a(this.y);
    this.b = e().getDimensionPixelOffset(a.eh);
    this.aa = localView.findViewById(f.eo);
    this.ab = localView.findViewById(f.dX);
    this.Z = localView.findViewById(f.bp);
    this.ac = ((ScrollView)localView.findViewById(f.ds));
    this.ad = ((ViewGroup)localView.findViewById(f.dq));
    this.ae = ((ViewGroup)localView.findViewById(f.df));
    this.af = ((ViewGroup)localView.findViewById(f.bZ));
    this.ag = ((ReusableImageView)localView.findViewById(f.bf));
    this.al = ((ReusableImageView)localView.findViewById(f.ao));
    this.am = localView.findViewById(f.ep);
    this.ah = ((TextView)localView.findViewById(f.aZ));
    this.ai = ((TextView)localView.findViewById(f.em));
    this.aj = ((TextView)localView.findViewById(f.ec));
    this.ak = ((TextView)localView.findViewById(f.aq));
    if (paramBundle != null) {
      this.ap = paramBundle.getInt("descMaxLines");
    }
    for (;;)
    {
      this.ak.setMaxLines(this.ap);
      this.ak.setOnClickListener(new awt(this));
      this.an = atf.a(this.y);
      this.d = this.m.getString("contentId");
      paramLayoutInflater = null;
      if ((paramBundle != null) && (paramBundle.containsKey("contentDetails")))
      {
        paramLayoutInflater = paramBundle.getByteArray("contentDetails");
        label321:
        if (paramLayoutInflater == null) {}
      }
      try
      {
        paramViewGroup = new dbb;
        paramViewGroup.<init>();
        this.c = ((dbb)dew.a(paramViewGroup, paramLayoutInflater));
        a(this.c);
        paramLayoutInflater = (DrawerLayout)this.y.findViewById(f.aW);
        if (paramLayoutInflater != null) {
          paramLayoutInflater.a(1);
        }
        this.ac.getViewTreeObserver().addOnScrollChangedListener(this.aq);
        new Handler().post(new awv(this));
        return localView;
        this.ap = e().getInteger(a.fa);
        continue;
        if (this.m.containsKey("contentDetails"))
        {
          paramViewGroup = this.m.getByteArray("contentDetails");
          paramLayoutInflater = paramViewGroup;
          if (this.d == null) {
            break label321;
          }
          a(this.d);
          paramLayoutInflater = paramViewGroup;
          break label321;
        }
        if (this.d != null)
        {
          a(this.d);
          break label321;
        }
        this.a.a("Details activity started without a content ID or details", new Object[0]);
        this.x.c();
      }
      catch (dev paramLayoutInflater)
      {
        for (;;)
        {
          this.a.a("Error parsing saved content details: %s", new Object[] { paramLayoutInflater });
        }
      }
    }
  }
  
  public final void d()
  {
    super.d();
    ((aov)this.y).i();
    this.ac.getViewTreeObserver().removeOnScrollChangedListener(this.aq);
    DrawerLayout localDrawerLayout = (DrawerLayout)this.y.findViewById(f.aW);
    if (localDrawerLayout != null) {
      localDrawerLayout.a(0);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.c != null) {
      paramBundle.putByteArray("contentDetails", dbb.a(this.c));
    }
    paramBundle.putInt("descMaxLines", this.ap);
  }
  
  public final void j()
  {
    super.j();
    Object localObject = (Toolbar)this.N.findViewById(f.eo);
    ((mm)this.y).a((Toolbar)localObject);
    ((Toolbar)localObject).a("");
    ((Toolbar)localObject).a(new awy(this));
    localObject = ((mm)this.y).d().a();
    ((mj)localObject).b(true);
    ((mj)localObject).a(true);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\awr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.chromecast.app.widget.OverlaidImageView;
import com.google.android.gms.cast.CastDevice;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

public final class bmu
  extends yz
  implements bkf
{
  public static blq k;
  final atf b;
  final List c;
  public final List d;
  final ash e;
  final bbn f;
  final bob g;
  final Context h;
  final Handler i;
  final int j;
  private dal l;
  private final List m;
  private final blp n;
  private final int o;
  private final long p;
  
  public bmu(Context paramContext, atf paramatf, List paramList1, List paramList2, List paramList3, ash paramash, bbn parambbn, bob parambob, int paramInt)
  {
    this.b = paramatf;
    this.m = paramList1;
    this.c = paramList2;
    this.d = paramList3;
    this.e = paramash;
    this.f = parambbn;
    this.g = parambob;
    this.n = new blp("SetupCastDeviceAdapter");
    this.h = paramContext;
    this.i = new Handler();
    this.j = paramInt;
    this.o = (paramInt * 9 / 16);
    this.p = blf.s(this.h);
    k = atf.a(this.h).d;
    a(this.m);
  }
  
  private View.OnClickListener a(dak paramdak, Long paramLong)
  {
    switch (paramdak.c)
    {
    }
    for (paramdak = null;; paramdak = new bna(this, paramLong))
    {
      for (;;)
      {
        return paramdak;
        try
        {
          bmz localbmz = new bmz(this, Intent.parseUri(paramdak.b, 1));
          paramdak = localbmz;
        }
        catch (URISyntaxException localURISyntaxException)
        {
          this.n.a("Failed to parse android intent: %s | for card: %ld", new Object[] { paramdak.b, paramLong });
        }
      }
      break;
    }
  }
  
  private void a(View paramView, aow paramaow)
  {
    List localList = paramaow.o().b;
    if ((localList == null) || (localList.isEmpty()))
    {
      paramView.setVisibility(8);
      return;
    }
    paramView.setVisibility(0);
    View localView5 = paramView.findViewById(f.dw);
    View localView1 = paramView.findViewById(f.dx);
    View localView3 = paramView.findViewById(f.dy);
    View localView2 = paramView.findViewById(f.dz);
    int i1 = 0;
    label74:
    View localView4;
    if (i1 < 4)
    {
      localView4 = new View[] { localView5, localView1, localView3, localView2 }[i1];
      if (i1 < localList.size()) {
        break label133;
      }
      localView4.setVisibility(8);
    }
    for (;;)
    {
      i1++;
      break label74;
      break;
      label133:
      dcw localdcw = (dcw)localList.get(i1);
      if ((localdcw.b() == dco.c) && (TextUtils.isEmpty(paramaow.j)))
      {
        localView4.setVisibility(8);
      }
      else
      {
        blx.a(localView4, localdcw.a);
        localView4.setOnClickListener(new bnk(this, localdcw, paramaow, localdcw.b, paramView));
      }
    }
  }
  
  private void a(Iterable paramIterable)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      a((aow)paramIterable.next());
    }
  }
  
  private aow h(int paramInt)
  {
    if (this.l == null) {}
    for (aow localaow = (aow)this.m.get(paramInt);; localaow = (aow)this.m.get(paramInt - 1)) {
      return localaow;
    }
  }
  
  public final int a()
  {
    int i2 = this.m.size();
    int i1 = i2;
    if (this.l != null) {
      i1 = i2 + 1;
    }
    i2 = i1;
    if (!this.c.isEmpty()) {
      i2 = i1 + 1;
    }
    i1 = i2;
    if (!this.d.isEmpty()) {
      i1 = i2 + 1;
    }
    return i1;
  }
  
  public final int a(int paramInt)
  {
    int i1 = 2;
    if ((paramInt == 0) && (this.l != null))
    {
      paramInt = i1;
      switch (this.l.e)
      {
      default: 
        this.n.a("Unhandled announcement type: %d", new Object[] { Integer.valueOf(this.l.e) });
        paramInt = i1;
      }
    }
    for (;;)
    {
      return paramInt;
      paramInt = 3;
      continue;
      if ((!this.c.isEmpty()) && (paramInt == a() - 1)) {
        paramInt = 4;
      } else if ((!this.d.isEmpty()) && (paramInt == b())) {
        paramInt = 5;
      } else if (h(paramInt).q()) {
        paramInt = 0;
      } else {
        paramInt = 1;
      }
    }
  }
  
  public final zr a(ViewGroup paramViewGroup, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      this.n.b("Unknown view type: %d", new Object[] { Integer.valueOf(paramInt) });
      paramViewGroup = null;
    }
    for (;;)
    {
      return paramViewGroup;
      paramViewGroup = new boa(LayoutInflater.from(this.h).inflate(a.gk, paramViewGroup, false));
      continue;
      paramViewGroup = new boc(LayoutInflater.from(this.h).inflate(a.fv, paramViewGroup, false));
      paramViewGroup.n.setLayoutParams(new RelativeLayout.LayoutParams(this.j, this.o));
      continue;
      paramViewGroup = new bnt(LayoutInflater.from(this.h).inflate(a.fo, paramViewGroup, false));
      continue;
      paramViewGroup = new bnt(LayoutInflater.from(this.h).inflate(a.fp, paramViewGroup, false));
      continue;
      paramViewGroup = new bny(this);
      continue;
      paramViewGroup = new bnu(this, LayoutInflater.from(this.h).inflate(a.gd, paramViewGroup, false));
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    int i3 = 1;
    int i2 = paramInt1;
    int i1 = paramInt2;
    if (this.l != null)
    {
      i2 = paramInt1 + 1;
      i1 = paramInt2 + 1;
    }
    if (this.l != null) {}
    for (;;)
    {
      this.a.d(i2, i1);
      return;
      i3 = 0;
    }
  }
  
  public final void a(long paramLong)
  {
    if ((this.l != null) && (this.l.a.longValue() == paramLong))
    {
      this.l = null;
      d(0);
    }
  }
  
  void a(aow paramaow)
  {
    if (paramaow.m)
    {
      this.i.removeCallbacks(paramaow.r);
      this.i.postDelayed(paramaow.r, this.p);
    }
  }
  
  public final void a(dal paramdal)
  {
    dal localdal = this.l;
    this.l = paramdal;
    if (paramdal != null) {
      if (localdal != this.l)
      {
        if (localdal != null) {
          break label32;
        }
        c(0);
      }
    }
    for (;;)
    {
      return;
      label32:
      b(0);
      continue;
      if (localdal != null) {
        d(0);
      }
    }
  }
  
  public final void a(zr paramzr, int paramInt)
  {
    Object localObject1;
    Object localObject2;
    if ((paramzr instanceof boa))
    {
      paramzr = (boa)paramzr;
      localObject1 = h(paramInt);
      paramzr.k.setText(((aow)localObject1).g());
      localObject2 = paramzr.o;
      switch (bnl.a[(localObject1.c.b() - 1)])
      {
      default: 
        ((ImageView)localObject2).setImageResource(a.eq);
        ((ImageView)localObject2).setContentDescription(blx.a(this.h, ((aow)localObject1).c));
        localObject2 = new bmv(this, (aow)localObject1, paramzr);
        paramzr.l.setOnClickListener((View.OnClickListener)localObject2);
        paramzr.n.setOnClickListener((View.OnClickListener)localObject2);
        paramzr.o.setOnClickListener((View.OnClickListener)localObject2);
        paramzr.m.setOnClickListener(new bni(this, (aow)localObject1));
      }
    }
    for (;;)
    {
      return;
      ((ImageView)localObject2).setImageResource(a.eo);
      break;
      ((ImageView)localObject2).setImageResource(a.ep);
      break;
      if ((paramzr instanceof boc))
      {
        localObject2 = (boc)paramzr;
        aow localaow = h(paramInt);
        if (localaow != null)
        {
          localaow.g();
          Object localObject3 = localaow.o();
          Resources localResources = ((boc)localObject2).m.getResources();
          label239:
          int i1;
          if (TextUtils.isEmpty(localaow.t))
          {
            paramzr = localaow.g();
            ((boc)localObject2).k.setText(paramzr);
            paramInt = 0;
            i1 = 0;
            if (!localaow.d) {
              break label1254;
            }
            if (localaow.c.h) {
              break label1243;
            }
            paramInt = 1;
            label274:
            if ((localaow.e()) || (localaow.d()) || (TextUtils.isEmpty(localaow.o))) {
              break label1248;
            }
            i1 = 1;
            label304:
            ((boc)localObject2).t.setVisibility(0);
            ((boc)localObject2).t.setOnClickListener(new bnm(this, localaow, (boc)localObject2));
            label333:
            ((boc)localObject2).u.setVisibility(8);
            if (localaow.s())
            {
              ((boc)localObject2).x.setOnClickListener(new bns(this, localaow));
              ((boc)localObject2).w.setOnClickListener(new bmw(this, localaow));
              ((boc)localObject2).y.setOnClickListener(new bmx(this, localaow, (boc)localObject2));
              ((boc)localObject2).z.setOnClickListener(new bmy(this, localaow, (boc)localObject2));
            }
            if ((!blf.r(this.h)) || (!localaow.d()) || (!localaow.m)) {
              break label1267;
            }
            ((boc)localObject2).v.setText(this.h.getString(b.W, new Object[] { Integer.valueOf(localaow.l.size() - localaow.n), Integer.valueOf(localaow.l.size()) }));
            ((boc)localObject2).D.setVisibility(0);
            ((boc)localObject2).y.setVisibility(0);
            ((boc)localObject2).z.setVisibility(0);
            ((boc)localObject2).y.setEnabled(localaow.k());
            ((boc)localObject2).z.setEnabled(localaow.l());
            label566:
            if ((!blf.r(this.h)) || (!localaow.d()) || (localaow.m) || (!localaow.s())) {
              break label1300;
            }
            ((boc)localObject2).w.setVisibility(0);
            label609:
            ((boc)localObject2).s.setImageResource(localaow.h());
            if (TextUtils.isEmpty(((atu)localObject3).h)) {
              break label1313;
            }
            ((boc)localObject2).n.setBackgroundColor(localResources.getColor(17170444));
            localObject1 = bks.a(0, this.o, localaow.o().h);
            paramzr = bks.a(((boc)localObject2).n.getWidth(), ((boc)localObject2).n.getHeight(), localaow.o().i);
            Object localObject4 = ((boc)localObject2).n;
            if (!TextUtils.equals((CharSequence)localObject1, ((OverlaidImageView)localObject4).f)) {
              ((OverlaidImageView)localObject4).f = ((String)localObject1);
            }
            if (!TextUtils.equals(paramzr, ((OverlaidImageView)localObject4).g)) {
              ((OverlaidImageView)localObject4).g = paramzr;
            }
            localaow.g();
            localObject4 = new bng(this, localaow, (String)localObject1, (boc)localObject2);
            this.b.a((String)localObject1, (ats)localObject4);
            if (!TextUtils.isEmpty(paramzr))
            {
              localObject1 = new bnh(this, localaow, paramzr, (boc)localObject2);
              this.b.a(paramzr, (ats)localObject1);
            }
            ((boc)localObject2).p.setVisibility(0);
            ((boc)localObject2).n.j = "233637DE".equals(localaow.o);
            paramzr = ((atu)localObject3).c;
            if (!TextUtils.isEmpty(paramzr)) {
              break label1397;
            }
            ((boc)localObject2).o.setVisibility(8);
            ((boc)localObject2).o.setOnClickListener(null);
            label858:
            localObject1 = ((atu)localObject3).f;
            paramzr = (zr)localObject1;
            if (TextUtils.isEmpty((CharSequence)localObject1))
            {
              if (!localaow.d()) {
                break label1428;
              }
              paramzr = localResources.getString(b.Q);
            }
            label890:
            localObject1 = paramzr;
            if (TextUtils.isEmpty(paramzr)) {
              localObject1 = localResources.getString(b.ad);
            }
            blx.a(((boc)localObject2).q, (CharSequence)localObject1);
            blx.a(((boc)localObject2).r, ((atu)localObject3).g);
            paramzr = ((boc)localObject2).m;
            localObject3 = ((atu)localObject3).g;
            paramzr.setContentDescription(String.valueOf(localObject1).length() + 1 + String.valueOf(localObject3).length() + (String)localObject1 + " " + (String)localObject3);
            a(((boc)localObject2).A, localaow);
            if (this.f != null) {
              break label1457;
            }
            paramzr = null;
            label1010:
            if ((!localaow.e()) || (paramzr == null) || (!paramzr.b.equals(localaow.b.b))) {
              break label1468;
            }
            blx.a(((boc)localObject2).B, b.bi);
            ((boc)localObject2).B.setOnClickListener(new bno(this));
            ((boc)localObject2).A.setVisibility(0);
            label1076:
            if (i1 == 0) {
              break label1547;
            }
            ((boc)localObject2).C.setVisibility(0);
            ((boc)localObject2).C.findViewById(f.ei).setOnClickListener(new bnp(this, localaow));
            paramzr = localaow.o().d;
            localObject1 = (ImageButton)((boc)localObject2).C.findViewById(f.cQ);
            if ((paramzr != null) && (paramzr.a())) {
              break label1481;
            }
            ((ImageButton)localObject1).setVisibility(8);
            localObject1 = ((boc)localObject2).C.findViewById(f.ew);
            if (paramzr == null) {
              break label1538;
            }
            ((View)localObject1).setVisibility(0);
            ((View)localObject1).setOnClickListener(new bnr(this, localaow));
            label1190:
            paramzr = localaow.g();
            localObject1 = localaow.c.R;
            if (!TextUtils.isEmpty((CharSequence)localObject1)) {
              break label1560;
            }
            ((boc)localObject2).l.setVisibility(8);
          }
          for (;;)
          {
            ((boc)localObject2).n.setContentDescription(paramzr);
            break;
            paramzr = localaow.t;
            break label239;
            label1243:
            paramInt = 0;
            break label274;
            label1248:
            i1 = 0;
            break label304;
            label1254:
            ((boc)localObject2).t.setVisibility(8);
            break label333;
            label1267:
            ((boc)localObject2).D.setVisibility(8);
            ((boc)localObject2).y.setVisibility(8);
            ((boc)localObject2).z.setVisibility(8);
            break label566;
            label1300:
            ((boc)localObject2).w.setVisibility(8);
            break label609;
            label1313:
            if (localaow.e())
            {
              localObject1 = ((boc)localObject2).n;
              paramzr = bnw.e;
            }
            for (;;)
            {
              ((OverlaidImageView)localObject1).a(paramzr);
              ((boc)localObject2).p.setVisibility(8);
              break;
              localObject1 = ((boc)localObject2).n;
              if (paramInt != 0)
              {
                if (i1 != 0) {
                  paramzr = bnw.a;
                } else {
                  paramzr = bnw.b;
                }
              }
              else if (i1 != 0) {
                paramzr = bnw.c;
              } else {
                paramzr = bnw.d;
              }
            }
            label1397:
            ((boc)localObject2).o.setVisibility(0);
            ((boc)localObject2).o.setOnClickListener(new bnn(this, paramzr, (atu)localObject3));
            break label858;
            label1428:
            if (localaow.e())
            {
              paramzr = localResources.getString(b.ax);
              break label890;
            }
            paramzr = localaow.p;
            break label890;
            label1457:
            paramzr = this.f.b;
            break label1010;
            label1468:
            ((boc)localObject2).B.setVisibility(8);
            break label1076;
            label1481:
            ((ImageButton)localObject1).setVisibility(0);
            if (paramzr.a == 1)
            {
              paramInt = 1;
              label1496:
              if (paramInt == 0) {
                break label1531;
              }
            }
            label1531:
            for (paramInt = a.eH;; paramInt = a.eJ)
            {
              ((ImageButton)localObject1).setImageResource(paramInt);
              ((ImageButton)localObject1).setOnClickListener(new bnq(this, localaow));
              break;
              paramInt = 0;
              break label1496;
            }
            label1538:
            ((View)localObject1).setVisibility(8);
            break label1190;
            label1547:
            ((boc)localObject2).C.setVisibility(8);
            break label1190;
            label1560:
            localObject1 = this.h.getString(b.ch, new Object[] { localObject1 });
            ((boc)localObject2).l.setText((CharSequence)localObject1);
            ((boc)localObject2).l.setVisibility(0);
            paramzr = String.valueOf(paramzr).length() + 1 + String.valueOf(localObject1).length() + paramzr + " " + (String)localObject1;
          }
        }
      }
      else
      {
        if ((paramzr instanceof bnt))
        {
          localObject1 = (bnt)paramzr;
          blx.a(((bnt)localObject1).o, this.l.k);
          ((bnt)localObject1).k.setText(this.l.g);
          paramzr = ((bnt)localObject1).a.getResources();
          if (this.l.j == 1)
          {
            ((bnt)localObject1).p.setBackgroundColor(paramzr.getColor(a.dr));
            label1715:
            ((bnt)localObject1).m.setVisibility(8);
            ((bnt)localObject1).n.setVisibility(8);
            if (TextUtils.isEmpty(this.l.f)) {
              break label1979;
            }
            ((bnt)localObject1).l.setVisibility(0);
            if (((zr)localObject1).e != 3) {
              break label1951;
            }
            paramzr = bks.a(this.j, 0, this.l.f);
            label1778:
            localObject2 = new bnj(this, (bnt)localObject1);
            this.b.a(paramzr, (ats)localObject2);
          }
          for (;;)
          {
            if (this.l.h != null)
            {
              paramzr = a(this.l.h, this.l.a);
              if (paramzr != null)
              {
                blx.a(((bnt)localObject1).m, this.l.h.a);
                ((bnt)localObject1).m.setOnClickListener(paramzr);
                ((bnt)localObject1).m.setVisibility(0);
              }
            }
            if (this.l.i == null) {
              break;
            }
            paramzr = a(this.l.i, this.l.a);
            if (paramzr == null) {
              break;
            }
            blx.a(((bnt)localObject1).n, this.l.i.a);
            ((bnt)localObject1).n.setOnClickListener(paramzr);
            ((bnt)localObject1).n.setVisibility(0);
            break;
            ((bnt)localObject1).p.setBackgroundColor(paramzr.getColor(a.do));
            break label1715;
            label1951:
            paramzr = bks.a(paramzr.getDimensionPixelSize(a.dP), paramzr.getDimensionPixelSize(a.dO), this.l.f);
            break label1778;
            label1979:
            ((bnt)localObject1).l.setVisibility(8);
          }
        }
        if ((paramzr instanceof bny))
        {
          paramzr = (bny)paramzr;
          paramzr.k.setText(this.h.getString(b.bC, new Object[] { Integer.valueOf(this.c.size()) }));
          if (paramzr.n)
          {
            paramInt = this.h.getResources().getDimensionPixelSize(a.dU);
            localObject1 = new LinearLayout.LayoutParams(this.j, paramInt * this.c.size());
            paramzr.l.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
          localObject1 = new bnb(this, this.h, a.gc, this.c, paramzr);
          paramzr.l.setAdapter((ListAdapter)localObject1);
        }
        else if ((paramzr instanceof bnu))
        {
          paramzr = (bnu)paramzr;
          paramzr.k.setText(this.h.getString(b.de, new Object[] { Integer.valueOf(this.d.size()) }));
          if (paramzr.n)
          {
            paramInt = this.h.getResources().getDimensionPixelSize(a.dC);
            localObject1 = new LinearLayout.LayoutParams(this.j, paramInt * this.d.size());
            paramzr.l.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
          localObject1 = new bnd(this, this.h, a.fx, this.d);
          paramzr.l.setAdapter((ListAdapter)localObject1);
        }
        else
        {
          this.n.a("Unknown view holder: %s, at position: %d", new Object[] { paramzr.getClass(), Integer.valueOf(paramInt) });
        }
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      a();
      d(a() - 1);
    }
    for (;;)
    {
      return;
      a();
      b(a() - 1);
    }
  }
  
  public int b()
  {
    if (this.c.isEmpty()) {}
    for (int i1 = a() - 1;; i1 = a() - 2) {
      return i1;
    }
  }
  
  public final void e(int paramInt)
  {
    int i2 = 0;
    int i1 = paramInt;
    if (this.l != null) {
      i1 = paramInt + 1;
    }
    if (this.l != null) {
      i2 = 1;
    }
    super.b(i1);
  }
  
  public final void f(int paramInt)
  {
    int i2 = 0;
    int i1 = paramInt;
    if (this.l != null) {
      i1 = paramInt + 1;
    }
    if (this.l != null) {
      i2 = 1;
    }
    super.c(i1);
  }
  
  public final void g(int paramInt)
  {
    int i2 = 0;
    int i1 = paramInt;
    if (this.l != null) {
      i1 = paramInt + 1;
    }
    if (this.l != null) {
      i2 = 1;
    }
    super.d(i1);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bmu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.apps.chromecast.app.widget.ReusableImageView;
import com.google.android.apps.chromecast.app.widget.SnappingRecyclerView;
import java.util.ArrayList;
import java.util.List;

public final class axq
  extends yz
  implements bct
{
  final Context b;
  final List c = new ArrayList();
  public RecyclerView d = null;
  public bcm e;
  final int f;
  int g;
  private final blp h = new blp("ShelfAdapter");
  private final boolean i;
  private dau[] j;
  private int[] k;
  private final yz l;
  private SnappingRecyclerView m;
  
  public axq(Context paramContext, boolean paramBoolean)
  {
    this.b = paramContext;
    this.i = paramBoolean;
    this.f = blx.a((Activity)paramContext);
    this.l = new axr(this);
  }
  
  private boolean b()
  {
    if (this.c.size() > 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final int a()
  {
    int i1 = 0;
    if (this.j != null) {
      i1 = this.j.length + 0;
    }
    int n = i1;
    if (this.i) {
      n = i1 + 1;
    }
    i1 = n;
    if (b()) {
      i1 = n + 1;
    }
    return i1;
  }
  
  public final int a(int paramInt)
  {
    if ((b()) && (paramInt == 0)) {
      paramInt = 5;
    }
    for (;;)
    {
      return paramInt;
      if ((this.i) && (paramInt == a() - 1))
      {
        paramInt = 4;
      }
      else
      {
        int n = paramInt;
        if (b()) {
          n = paramInt - 1;
        }
        if ((this.j == null) || (n >= this.j.length)) {
          break label142;
        }
        if (this.j[n].a != null)
        {
          paramInt = 0;
        }
        else if (this.j[n].c != null)
        {
          paramInt = 1;
        }
        else if (this.j[n].d != null)
        {
          paramInt = 2;
        }
        else
        {
          if (this.j[n].b == null) {
            break;
          }
          paramInt = 3;
        }
      }
    }
    throw new IllegalStateException();
    label142:
    throw new IllegalStateException();
  }
  
  public final zr a(ViewGroup paramViewGroup, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalStateException();
    case 0: 
      paramViewGroup = new bau(LayoutInflater.from(this.b).inflate(a.fq, paramViewGroup, false));
    }
    for (;;)
    {
      return paramViewGroup;
      paramViewGroup = new bax(LayoutInflater.from(this.b).inflate(a.fH, paramViewGroup, false));
      continue;
      paramViewGroup = new axy(LayoutInflater.from(this.b).inflate(a.fO, paramViewGroup, false));
      continue;
      paramViewGroup = new bbd(LayoutInflater.from(this.b).inflate(a.gC, paramViewGroup, false));
      continue;
      paramViewGroup = LayoutInflater.from(this.b).inflate(a.fn, paramViewGroup, false);
      paramViewGroup.setOnClickListener(new axv(this));
      paramViewGroup = new axw(this, paramViewGroup);
      continue;
      this.m = ((SnappingRecyclerView)LayoutInflater.from(this.b).inflate(a.gq, paramViewGroup, false));
      this.m.a(this.l);
      paramViewGroup = new xw(this.b);
      paramViewGroup.a(0);
      this.m.a(paramViewGroup);
      paramViewGroup = this.b.getResources();
      paramInt = blx.a((Activity)this.b);
      int n = paramViewGroup.getDimensionPixelSize(a.dT);
      this.g = Math.max(paramViewGroup.getDimensionPixelSize(a.dS) + n * 2, Math.min(paramViewGroup.getDimensionPixelSize(a.dR) + n * 2, paramInt));
      this.m.a(new axt(this, n));
      this.m.s = this.g;
      paramViewGroup = (zi)this.m.getLayoutParams();
      paramViewGroup.height = ((int)(this.g * 0.42857143F));
      this.m.setLayoutParams(paramViewGroup);
      SnappingRecyclerView localSnappingRecyclerView = this.m;
      paramViewGroup = new axu(this);
      if (localSnappingRecyclerView.p == null) {
        localSnappingRecyclerView.p = new ArrayList();
      }
      localSnappingRecyclerView.p.add(paramViewGroup);
      paramViewGroup = new axw(this, this.m);
    }
  }
  
  public final void a(bcd parambcd, int paramInt)
  {
    int n = this.l.a();
    for (;;)
    {
      synchronized (this.c)
      {
        int i1 = this.c.indexOf(parambcd);
        if (i1 != -1)
        {
          this.c.remove(i1);
          if ((this.c.isEmpty()) && (n > 0)) {
            d(0);
          }
        }
        else
        {
          return;
        }
        if ((n == Integer.MAX_VALUE) && (this.l.a() != Integer.MAX_VALUE)) {
          this.l.a.a();
        }
      }
      this.l.d(paramInt);
    }
  }
  
  public final void a(List paramList)
  {
    paramList.size();
    for (;;)
    {
      synchronized (this.c)
      {
        if ((this.c.isEmpty()) && (!paramList.isEmpty()))
        {
          this.c.addAll(paramList);
          c(0);
          this.l.a.a();
          if (this.d != null) {
            this.d.a(0);
          }
          return;
        }
        if ((paramList.isEmpty()) && (!this.c.isEmpty()))
        {
          this.c.clear();
          d(0);
          this.l.a.a();
        }
      }
      if ((!paramList.isEmpty()) && (!this.c.isEmpty()))
      {
        this.c.clear();
        this.c.addAll(paramList);
        b(0);
        this.l.a.a();
      }
    }
  }
  
  public final void a(zr paramzr, int paramInt)
  {
    if (b()) {}
    for (int i1 = paramInt - 1;; i1 = paramInt) {
      switch (a(paramInt))
      {
      default: 
        throw new IllegalStateException();
      }
    }
    paramzr = (bau)paramzr;
    Object localObject1 = this.j[i1].a;
    paramInt = paramzr.a.getResources().getDimensionPixelSize(a.dL);
    paramzr.k.a(SetupApplication.i().m, ((daq)localObject1).a.a, false, paramInt, paramInt);
    paramzr.a.setContentDescription(paramzr.a.getContext().getString(b.z, new Object[] { ((daq)localObject1).b }));
    paramzr.l.setText(((daq)localObject1).b);
    label210:
    Object localObject2;
    Object localObject3;
    int i4;
    int i5;
    int i6;
    int n;
    int i2;
    label343:
    int i3;
    if (((daq)localObject1).d == Boolean.TRUE)
    {
      paramzr.n.setMaxLines(2);
      paramzr.m.setVisibility(0);
      if (!TextUtils.isEmpty(((daq)localObject1).c)) {
        break label456;
      }
      paramzr.n.setVisibility(8);
      localObject2 = apg.a(125);
      ((apg)localObject2).b = ((daq)localObject1).g;
      localObject2 = ((apg)localObject2).a();
      blx.a(paramzr.o, ((daq)localObject1).e);
      paramzr.a.setOnClickListener(new bav(paramzr, (daq)localObject1, (apd)localObject2));
      localObject2 = paramzr.a.getContext();
      localObject3 = ((Context)localObject2).getResources();
      i4 = ((Resources)localObject3).getDimensionPixelSize(a.dJ);
      i5 = blx.a((Activity)localObject2) - (i4 << 1) - (((Resources)localObject3).getDimensionPixelSize(a.dV) << 1);
      i6 = ((Resources)localObject3).getDimensionPixelSize(a.ec);
      n = 0;
      paramInt = 0;
      localObject2 = ((daq)localObject1).h;
      int i7 = localObject2.length;
      i2 = 0;
      if (i2 >= i7) {
        break label485;
      }
      localObject3 = localObject2[i2];
      if (!bau.a(((dar)localObject3).a)) {
        break label2179;
      }
      int i8 = ((dar)localObject3).a.b.intValue() * i6 / ((dar)localObject3).a.c.intValue();
      if (paramInt != 0) {
        break label478;
      }
      i3 = 0;
      label403:
      i3 = i8 + i3;
      if (n + i3 > i5) {
        break label485;
      }
      paramInt++;
      n += i3;
    }
    label456:
    label478:
    label485:
    label628:
    label658:
    label939:
    label1061:
    label1212:
    label1622:
    label1669:
    label1775:
    label1895:
    label2179:
    for (;;)
    {
      i2++;
      break label343;
      paramzr.n.setMaxLines(3);
      paramzr.m.setVisibility(8);
      break;
      paramzr.n.setVisibility(0);
      paramzr.n.setText(((daq)localObject1).c);
      break label210;
      i3 = i4;
      break label403;
      i2 = n;
      if (n == 0)
      {
        i2 = n;
        if (((daq)localObject1).h.length > 0)
        {
          i2 = n;
          if (bau.a(localObject1.h[0].a))
          {
            localObject2 = localObject1.h[0];
            i2 = ((dar)localObject2).a.b.intValue() * i6 / ((dar)localObject2).a.c.intValue();
          }
        }
      }
      if (i2 == 0)
      {
        n = 0;
        if (paramInt != 0) {
          break label628;
        }
        paramzr.p.setVisibility(8);
        paramzr = apg.a(124).b(i1);
        paramzr.b = this.j[i1].a.g;
        paramzr.b();
      }
      for (;;)
      {
        return;
        n = i5 * i6 / i2;
        break;
        paramzr.p.setVisibility(0);
        paramzr.p.removeAllViews();
        Object localObject4 = LayoutInflater.from(paramzr.a.getContext());
        i2 = 0;
        Object localObject5;
        Object localObject6;
        TextView localTextView;
        if (i2 < paramInt)
        {
          localObject5 = ((LayoutInflater)localObject4).inflate(a.fP, null);
          if (i2 != 0) {
            ((View)localObject5).setPadding(i4, 0, 0, 0);
          }
          localObject3 = ((daq)localObject1).g;
          localObject6 = localObject1.h[i2];
          localObject2 = (ReusableImageView)((View)localObject5).findViewById(f.al);
          i3 = ((ReusableImageView)localObject2).getResources().getDimensionPixelSize(a.ef);
          if (!TextUtils.isEmpty(((dar)localObject6).b))
          {
            localTextView = (TextView)((View)localObject5).findViewById(f.em);
            localTextView.setText(((dar)localObject6).b);
            localTextView.setPadding(0, i3, 0, 0);
            ((ReusableImageView)localObject2).setContentDescription(((dar)localObject6).b);
          }
          localTextView = (TextView)((View)localObject5).findViewById(f.ed);
          if ((((dar)localObject6).d == null) || (((dar)localObject6).d.e == null)) {
            break label939;
          }
          localTextView.setText(((dar)localObject6).d.e);
          localTextView.setPadding(0, i3, 0, 0);
          localTextView.setVisibility(0);
        }
        for (;;)
        {
          if (bau.a(((dar)localObject6).a))
          {
            ((ReusableImageView)localObject2).a(SetupApplication.i().m, ((dar)localObject6).a.a, false, ((dar)localObject6).a.b.intValue() * n / ((dar)localObject6).a.c.intValue(), n);
            ((ReusableImageView)localObject2).setOnClickListener(new baw(paramzr, (dar)localObject6, (String)localObject3, i1));
          }
          paramzr.p.addView((View)localObject5);
          i2++;
          break label658;
          break;
          localTextView.setVisibility(8);
        }
        localObject1 = (bax)paramzr;
        paramzr = this.j[i1].c;
        blx.a(((bax)localObject1).l, paramzr.c, paramzr.d, apg.a(127).b(i1).a());
        ((bax)localObject1).a.setContentDescription(((bax)localObject1).a.getContext().getString(b.A, new Object[] { paramzr.a, paramzr.b }));
        ((bax)localObject1).m.setText(paramzr.a);
        if (TextUtils.isEmpty(paramzr.b))
        {
          ((bax)localObject1).n.setVisibility(8);
          localObject2 = ((bax)localObject1).a.getResources();
          paramInt = blx.a((Activity)((bax)localObject1).a.getContext()) - (((Resources)localObject2).getDimensionPixelSize(a.dV) << 1);
          i3 = ((Resources)localObject2).getDimensionPixelSize(a.dJ);
          n = ((Resources)localObject2).getDimensionPixelSize(a.dL);
          i2 = ((Resources)localObject2).getDimensionPixelSize(a.dM);
          n = Math.min(paramzr.e.length, paramInt / (n + i3 * 2));
          i2 = Math.min(paramInt / n - i3 * 2, i2);
          if (n != 0) {
            break label1212;
          }
          ((bax)localObject1).k.setVisibility(8);
        }
        for (;;)
        {
          apg.a(124).b(i1).b();
          break;
          ((bax)localObject1).n.setVisibility(0);
          ((bax)localObject1).n.setText(paramzr.b);
          break label1061;
          ((bax)localObject1).k.setVisibility(0);
          ((bax)localObject1).k.removeAllViews();
          for (paramInt = 0; paramInt < n; paramInt++)
          {
            localObject3 = paramzr.e[paramInt];
            localObject2 = LayoutInflater.from(((bax)localObject1).a.getContext()).inflate(a.ft, null);
            localTextView = (TextView)((View)localObject2).findViewById(f.o);
            localObject5 = (TextView)((View)localObject2).findViewById(f.m);
            localObject6 = (TextView)((View)localObject2).findViewById(f.bB);
            localObject4 = new LinearLayout.LayoutParams(i2, -2);
            localTextView.setLayoutParams((ViewGroup.LayoutParams)localObject4);
            ((TextView)localObject5).setLayoutParams((ViewGroup.LayoutParams)localObject4);
            ((TextView)localObject6).setLayoutParams((ViewGroup.LayoutParams)localObject4);
            localTextView.setText(((daw)localObject3).b);
            ((TextView)localObject5).setText(((daw)localObject3).c);
            blx.a((View)localObject6, ((daw)localObject3).d);
            localObject4 = apg.a(125);
            ((apg)localObject4).b = ((daw)localObject3).f;
            localObject4 = ((apg)localObject4).b(i1).a();
            ((ReusableImageView)((View)localObject2).findViewById(f.r)).a(SetupApplication.i().m, ((daw)localObject3).a.a, false, i2, i2);
            ((View)localObject2).setOnClickListener(new bay((bax)localObject1, (daw)localObject3, (apd)localObject4));
            ((bax)localObject1).k.addView((View)localObject2);
          }
        }
        localObject1 = (axy)paramzr;
        localObject2 = this.j[i1].d;
        paramzr = this.k;
        ((axy)localObject1).k.setText(((dbf)localObject2).b);
        localObject3 = apg.a(118);
        ((apg)localObject3).b = ((dbf)localObject2).e;
        localObject3 = ((apg)localObject3).a();
        if (((dbf)localObject2).a != null)
        {
          ((axy)localObject1).l.setVisibility(0);
          paramInt = ((axy)localObject1).l.getResources().getDimensionPixelOffset(a.dY);
          ((axy)localObject1).l.a(SetupApplication.i().m, ((dbf)localObject2).a.a, true, 0, paramInt);
          ((axy)localObject1).l.setOnClickListener(new aya((axy)localObject1, (dbf)localObject2, (apd)localObject3));
          ((axy)localObject1).l.setContentDescription(((axy)localObject1).l.getContext().getString(b.E, new Object[] { ((dbf)localObject2).d }));
          if ((((dbf)localObject2).f != 2) || (TextUtils.isEmpty(((dbf)localObject2).c))) {
            break label1895;
          }
          ((axy)localObject1).n.setText(((dbf)localObject2).c);
          ((axy)localObject1).n.setOnClickListener(new ayb((axy)localObject1));
          localObject4 = ((axy)localObject1).a.getContext().getResources();
          paramInt = ((Resources)localObject4).getDimensionPixelSize(a.dI);
          i2 = ((Resources)localObject4).getDimensionPixelSize(a.dH);
          localObject3 = (RelativeLayout.LayoutParams)((axy)localObject1).m.getLayoutParams();
          switch (((dbf)localObject2).f)
          {
          default: 
            n = ((Resources)localObject4).getDimensionPixelSize(a.dQ);
            paramInt = n + paramInt;
            ((RelativeLayout.LayoutParams)localObject3).height = (paramInt + i2);
            ((axy)localObject1).m.a(((axy)localObject1).o);
            ((axy)localObject1).m.setLayoutParams((ViewGroup.LayoutParams)localObject3);
            ((axy)localObject1).m.a(new axx(((axy)localObject1).m.getContext(), (dbf)localObject2, n, paramInt - i2));
            if ((paramzr != null) && (paramzr.length > i1)) {
              new Handler().post(new ayc((axy)localObject1, paramzr, i1, (dbf)localObject2));
            }
            break;
          }
        }
        for (;;)
        {
          paramzr = apg.a(116).b(i1);
          paramzr.b = this.j[i1].d.e;
          paramzr.b();
          break;
          ((axy)localObject1).l.setVisibility(8);
          break label1622;
          blx.a(((axy)localObject1).n, ((dbf)localObject2).c, ((dbf)localObject2).d, (apd)localObject3);
          break label1669;
          n = ((Resources)localObject4).getDimensionPixelSize(a.dA);
          i3 = ((Resources)localObject4).getDimensionPixelSize(a.dz);
          paramInt = ((Resources)localObject4).getDimensionPixelSize(a.dB);
          i3 = n + i3 * 2;
          paramInt = i3 + paramInt;
          localObject4 = ((axy)localObject1).a.getContext();
          i4 = blx.a((Activity)localObject4) / i3;
          i3 = (((dbf)localObject2).g.length + i4 - 1) / i4;
          localObject4 = new xq((Context)localObject4, i4);
          ((axy)localObject1).m.a((zh)localObject4);
          ((RelativeLayout.LayoutParams)localObject3).height = (paramInt * i3);
          break label1775;
          n = ((Resources)localObject4).getDimensionPixelSize(a.dG);
          paramInt = n + paramInt;
          ((RelativeLayout.LayoutParams)localObject3).height = (paramInt + i2);
          ((axy)localObject1).m.a(((axy)localObject1).o);
          break label1775;
          ((axy)localObject1).m.o = new aye((axy)localObject1, i1, (dbf)localObject2);
        }
        localObject1 = (bbd)paramzr;
        paramzr = this.j[i1].b;
        ((bbd)localObject1).l.setText(paramzr.b);
        if (!TextUtils.equals(((bbd)localObject1).m, paramzr.a.a))
        {
          ((bbd)localObject1).m = paramzr.a.a;
          SetupApplication.i().a(((bbd)localObject1).m, ((bbd)localObject1).k, false);
        }
        apg.a(124).b(i1).b();
      }
    }
  }
  
  public final void a(dau[] paramArrayOfdau, int[] paramArrayOfInt)
  {
    this.j = paramArrayOfdau;
    this.k = paramArrayOfInt;
    this.a.a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\axq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
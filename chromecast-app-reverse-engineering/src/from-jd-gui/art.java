import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class art
  extends ArrayAdapter
  implements CompoundButton.OnCheckedChangeListener
{
  private static final Set a = new HashSet(Arrays.asList(new Integer[] { Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(16) }));
  private final aqw b;
  private final asz c;
  private final boolean d;
  private final Context e;
  private final atf f;
  
  public art(Context paramContext, asz paramasz, int paramInt, List paramList, boolean paramBoolean)
  {
    super(paramContext, 17367043, paramList);
    this.e = paramContext;
    this.c = paramasz;
    this.b = ((aqw)paramContext);
    this.d = paramBoolean;
    this.f = atf.a(paramContext);
  }
  
  private View a(View paramView, dcj paramdcj)
  {
    asa localasa1 = (asa)paramView.getTag();
    localasa1.a();
    Object localObject1;
    Object localObject2;
    if (paramdcj.a.intValue() == 9)
    {
      if (paramdcj.a.intValue() == 9)
      {
        localasa1.i.setVisibility(0);
        localObject1 = (LayoutInflater)localasa1.j.getContext().getSystemService("layout_inflater");
        for (Object localObject4 : paramdcj.i)
        {
          localObject2 = ((LayoutInflater)localObject1).inflate(a.fA, null);
          asa localasa2 = new asa(localasa1.j, (View)localObject2);
          ((View)localObject2).setTag(localasa2);
          localasa2 = localasa2.a().a(((dcj)localObject4).c);
          Object localObject5 = ((dcj)localObject4).d;
          if ((!TextUtils.isEmpty((CharSequence)localObject5)) && (localasa2.a != null))
          {
            localasa2.a.setVisibility(0);
            localasa2.a.setText((CharSequence)localObject5);
          }
          localObject5 = ((dcj)localObject4).b;
          if (localObject5 != null)
          {
            localasa2.e.setVisibility(0);
            localasa2.e.setChecked(localasa2.j.b.h().s().a(((Integer)localObject5).intValue()));
          }
          localObject4 = new ary(localasa1.j, paramdcj, (dcj)localObject4);
          if (localasa2.e.getVisibility() == 0)
          {
            localasa2.e.setOnClickListener((View.OnClickListener)localObject4);
            localasa2.a((View.OnClickListener)localObject4);
          }
          localasa1.i.addView((View)localObject2);
        }
      }
      localasa1.a(paramdcj.c);
    }
    label377:
    boolean bool;
    for (;;)
    {
      paramView.setClickable(true);
      return paramView;
      localObject1 = localasa1.a(paramdcj.c);
      localObject2 = paramdcj.h;
      if (localObject2 != null)
      {
        ((asa)localObject1).c.setVisibility(0);
        ((asa)localObject1).h = ((asa)localObject1).j.f.a((String)localObject2, ((asa)localObject1).c, false);
      }
      if (paramdcj.a.intValue() == 3)
      {
        ??? = 1;
        ??? = paramdcj.b;
        if ((??? != 0) && (??? != null))
        {
          ((asa)localObject1).d.setVisibility(0);
          ((asa)localObject1).d.setChecked(((asa)localObject1).j.b.h().s().a(((Integer)???).intValue()));
          ((asa)localObject1).j.b.h().d.a();
          localObject2 = ((asa)localObject1).j;
          a((Integer)???);
        }
        ((asa)localObject1).a(new arv(this, paramdcj, localasa1.f));
        if (((paramdcj.i == null) || (paramdcj.i.length <= 0)) && (TextUtils.isEmpty(paramdcj.o))) {
          break label581;
        }
        paramdcj = paramdcj.j;
        bool = localasa1.j.b.h().s().a(paramdcj);
        paramdcj = localasa1.b;
        if (!bool) {
          break label573;
        }
      }
      label573:
      for (??? = b.dh;; ??? = b.dg)
      {
        paramdcj.setText(???);
        localasa1.b.setVisibility(0);
        break;
        ??? = 0;
        break label377;
      }
      label581:
      if (paramdcj.a.intValue() != 12) {
        break;
      }
      paramdcj = paramdcj.d;
      localasa1.b.setText(paramdcj);
      localasa1.b.setVisibility(0);
    }
    if (paramdcj.a.intValue() == 2)
    {
      ??? = 1;
      label631:
      if ((??? == 0) || (paramdcj.j == null)) {
        break label750;
      }
      localasa1.g.setVisibility(0);
      localasa1.f.setVisibility(0);
      bool = localasa1.j.b.h().s().a(paramdcj.j);
      localasa1.f.setChecked(bool);
      localasa1.f.setOnCheckedChangeListener(this);
      localasa1.f.setTag(paramdcj);
      if (!bool) {
        break label752;
      }
    }
    label750:
    label752:
    for (paramdcj = localasa1.j.getContext().getString(b.B);; paramdcj = localasa1.j.getContext().getString(b.D))
    {
      localasa1.f.setContentDescription(paramdcj);
      localasa1.g.setContentDescription(paramdcj);
      break;
      ??? = 0;
      break label631;
      break;
    }
  }
  
  private void a(dcj paramdcj, boolean paramBoolean)
  {
    auq localauq = this.b.h().s();
    if (localauq.a(paramdcj.j) != paramBoolean)
    {
      localauq.a(paramdcj.j, paramBoolean);
      this.b.h().d.a();
      a(paramdcj.b);
      if (this.c != null) {
        this.c.p();
      }
    }
  }
  
  private static void a(Integer paramInteger)
  {
    ape.a().a(new apd(76).a(paramInteger.intValue()));
  }
  
  private static View b(View paramView, dcj paramdcj)
  {
    if (!TextUtils.isEmpty(paramdcj.c))
    {
      ((TextView)paramView).setText(paramdcj.c);
      paramView.setVisibility(0);
    }
    for (;;)
    {
      return paramView;
      paramView.setVisibility(8);
    }
  }
  
  private View c(View paramView, dcj paramdcj)
  {
    arz localarz = (arz)paramView.getTag();
    localarz.a.setVisibility(8);
    if (localarz.g != null)
    {
      localarz.a.setImageResource(17170445);
      localarz.g.a();
    }
    localarz.b.setVisibility(8);
    if (localarz.h != null)
    {
      localarz.b.setImageResource(17170445);
      localarz.h.a();
    }
    localarz.f.setVisibility(8);
    localarz.d.setVisibility(8);
    localarz.e.setVisibility(8);
    localarz.c.setVisibility(8);
    if ((paramdcj.n != null) && (paramdcj.n.length > 0))
    {
      str = paramdcj.n[0];
      if (str != null)
      {
        localarz.a.setVisibility(0);
        localarz.g = localarz.i.f.a(str, localarz.a, false);
      }
    }
    String str = paramdcj.h;
    if (str != null)
    {
      localarz.b.setVisibility(0);
      localarz.h = localarz.i.f.a(str, localarz.b, false);
    }
    str = paramdcj.d;
    if (!TextUtils.isEmpty(str))
    {
      localarz.f.setVisibility(0);
      localarz.f.setText(str);
    }
    str = TextUtils.join("\n\n", paramdcj.e);
    if (!TextUtils.isEmpty(str))
    {
      localarz.d.setVisibility(0);
      localarz.d.setText(str);
    }
    str = TextUtils.join("\n\n", paramdcj.f);
    if (!TextUtils.isEmpty(str))
    {
      localarz.e.setVisibility(0);
      localarz.e.setText(str);
    }
    str = paramdcj.c;
    if (!TextUtils.isEmpty(str))
    {
      localarz.c.setVisibility(0);
      localarz.c.setText(str);
    }
    paramdcj = new aru(this, paramdcj);
    localarz.c.setOnClickListener(paramdcj);
    return paramView;
  }
  
  public final int getItemViewType(int paramInt)
  {
    dcj localdcj = (dcj)getItem(paramInt);
    if (a.contains(localdcj.a)) {
      paramInt = 2;
    }
    for (;;)
    {
      return paramInt;
      if (localdcj.a.intValue() == 17) {
        paramInt = 3;
      } else if (localdcj.a.intValue() == 18) {
        paramInt = 4;
      } else if (this.d) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    dcj localdcj = (dcj)getItem(paramInt);
    paramViewGroup = LayoutInflater.from(this.e);
    paramInt = getItemViewType(paramInt);
    if (paramView == null) {
      switch (paramInt)
      {
      default: 
        throw new IllegalStateException(30 + "Unknown item type: " + paramInt);
      case 0: 
        paramView = paramViewGroup.inflate(a.fA, null);
        paramView.setTag(new asa(this, paramView));
        paramViewGroup = a(paramView, localdcj);
      }
    }
    for (;;)
    {
      return paramViewGroup;
      paramView = paramViewGroup.inflate(a.fB, null);
      paramView.setTag(new asa(this, paramView));
      paramViewGroup = a(paramView, localdcj);
      continue;
      paramView = paramViewGroup.inflate(a.fC, null);
      paramView.setTag(new arz(this, paramView));
      paramViewGroup = c(paramView, localdcj);
      continue;
      paramViewGroup = b(paramViewGroup.inflate(a.fD, null), localdcj);
      continue;
      paramViewGroup = paramViewGroup.inflate(a.fX, null);
      continue;
      paramViewGroup = paramView;
      switch (paramInt)
      {
      case 4: 
      default: 
        throw new IllegalStateException(30 + "Unknown item type: " + paramInt);
      case 0: 
      case 1: 
        paramViewGroup = a(paramView, localdcj);
        break;
      case 2: 
        paramViewGroup = c(paramView, localdcj);
        break;
      case 3: 
        paramViewGroup = b(paramView, localdcj);
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    return 5;
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    paramCompoundButton = (dcj)paramCompoundButton.getTag();
    if (paramCompoundButton == null) {}
    for (;;)
    {
      return;
      a(paramCompoundButton, paramBoolean);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\art.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
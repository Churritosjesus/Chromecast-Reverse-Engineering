import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ard
  extends BaseAdapter
  implements asq
{
  final HashMap a = new HashMap();
  final ash b;
  arh c;
  arg d;
  final asz e;
  boolean f;
  final String g;
  int h;
  final Set i = new HashSet();
  private List j;
  private final int k;
  private final int l;
  private final blp m = new blp("PhotosAlbumAdapter", false);
  private final Context n;
  private boolean o = false;
  private final dcj p;
  private final int q;
  private final Boolean r;
  private final String s;
  
  public ard(Context paramContext, ash paramash, asz paramasz, dcj paramdcj, String paramString, int paramInt1, int paramInt2)
  {
    View localView = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(a.gx, null);
    this.k = paramInt1;
    this.l = (paramInt1 * 6 / 16);
    localView.setLayoutParams(new ViewGroup.LayoutParams(this.k, -2));
    localView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    this.h = paramInt2;
    this.b = paramash;
    this.n = paramContext;
    this.p = paramdcj;
    this.q = this.p.i[0].b.intValue();
    this.g = this.p.i[0].j;
    if (this.p.i[0].q == null) {}
    for (boolean bool = false;; bool = this.p.i[0].q.booleanValue())
    {
      this.r = Boolean.valueOf(bool);
      this.s = paramString;
      this.e = paramasz;
      this.j = this.b.a(this.q, this.s);
      if (this.j == null) {
        a();
      }
      a(this.b.s().b(this.g));
      return;
    }
  }
  
  private void a(dca[] paramArrayOfdca)
  {
    if (paramArrayOfdca != null)
    {
      int i2 = paramArrayOfdca.length;
      for (int i1 = 0; i1 < i2; i1++)
      {
        dca localdca = paramArrayOfdca[i1];
        this.a.put(a(localdca.a, localdca.b), localdca);
      }
    }
  }
  
  String a(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString2)) {
      this.i.add(paramString1);
    }
    for (;;)
    {
      return paramString1;
      paramString1 = paramString2;
    }
  }
  
  public final void a()
  {
    this.f = true;
    this.b.a(100, this.k, this.l, true, this.q, this.s, this.h);
    if (this.d != null) {
      this.d.b();
    }
  }
  
  public final void a_(int paramInt)
  {
    int i1 = 1;
    if (paramInt == 3)
    {
      this.f = false;
      this.o = false;
      this.j = this.b.a(this.q, this.s);
      if (this.j != null) {
        notifyDataSetChanged();
      }
      if (this.d != null) {
        this.d.c();
      }
    }
    for (;;)
    {
      return;
      if (paramInt == 2)
      {
        for (;;)
        {
          synchronized (this.a)
          {
            dca[] arrayOfdca = this.b.s().b(this.p.j);
            HashMap localHashMap2 = this.a;
            paramInt = i1;
            if (arrayOfdca.length == localHashMap2.size())
            {
              int i2 = arrayOfdca.length;
              paramInt = 0;
              if (paramInt >= i2) {
                break label177;
              }
              dca localdca = arrayOfdca[paramInt];
              if (!localHashMap2.containsKey(a(localdca.a, localdca.b))) {
                paramInt = i1;
              }
            }
            else
            {
              if (paramInt != 0) {
                break;
              }
            }
          }
          paramInt++;
          continue;
          label177:
          paramInt = 0;
        }
        this.a.clear();
        this.i.clear();
        a(this.b.s().b(this.g));
        notifyDataSetChanged();
      }
    }
  }
  
  public final boolean areAllItemsEnabled()
  {
    if (this.f) {}
    for (boolean bool = false;; bool = super.areAllItemsEnabled()) {
      return bool;
    }
  }
  
  public final dbq b(int paramInt)
  {
    if ((getItemViewType(paramInt) == 0) && (this.j != null)) {}
    for (dbq localdbq = (dbq)this.j.get(paramInt);; localdbq = null) {
      return localdbq;
    }
  }
  
  public final int getCount()
  {
    if (this.j == null) {}
    for (int i1 = 0;; i1 = this.j.size())
    {
      int i2 = i1;
      if (this.o) {
        i2 = i1 + 1;
      }
      return i2;
    }
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if ((this.f) && (paramInt == getCount() - 1)) {}
    for (paramInt = 1;; paramInt = 0) {
      return paramInt;
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject2;
    Object localObject1;
    if (!this.f)
    {
      localObject2 = this.b;
      i1 = this.q;
      localObject1 = this.s;
      if ((((ash)localObject2).a.a(i1, (String)localObject1) != null) && (((ash)localObject2).a.b(i1, (String)localObject1) == null)) {
        break label150;
      }
      i1 = 1;
      if ((i1 != 0) && (paramInt >= getCount() - 20))
      {
        this.f = true;
        this.b.a(100, this.k, this.l, false, this.q, this.s, this.h);
        this.o = true;
        notifyDataSetChanged();
      }
    }
    switch (getItemViewType(paramInt))
    {
    default: 
      localObject1 = paramView;
    case 1: 
      for (;;)
      {
        return (View)localObject1;
        label150:
        i1 = 0;
        break;
        localObject1 = paramView;
        if (paramView == null) {
          localObject1 = ((LayoutInflater)this.n.getSystemService("layout_inflater")).inflate(a.gv, paramViewGroup, false);
        }
      }
    }
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.n.getSystemService("layout_inflater")).inflate(a.gx, paramViewGroup, false);
      paramViewGroup = (ImageView)paramView.findViewById(f.j);
      localObject1 = paramViewGroup.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = this.k;
      ((ViewGroup.LayoutParams)localObject1).height = this.l;
      paramViewGroup.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      paramViewGroup = new arf(this, paramView);
      paramView.setTag(paramViewGroup);
      label269:
      localObject2 = b(paramInt);
      if (!this.i.contains(String.valueOf(((dbq)localObject2).a))) {
        break label534;
      }
      paramViewGroup.a.setChecked(this.a.containsKey(String.valueOf(((dbq)localObject2).a)));
      label318:
      paramViewGroup.b.setText(((dbq)localObject2).b);
      if (((dbq)localObject2).d != null) {
        break label578;
      }
    }
    label534:
    label578:
    for (int i1 = 0;; i1 = ((dbq)localObject2).d.intValue())
    {
      paramViewGroup.c.setText(this.n.getResources().getQuantityString(a.he, i1, new Object[] { Integer.valueOf(i1) }));
      localObject1 = paramViewGroup.d;
      ((ImageView)localObject1).setImageResource(17170445);
      Object localObject3 = b(paramInt).a;
      localObject3 = b(paramInt).e;
      if ((blf.c(this.n)) && (this.r.booleanValue())) {
        ((ImageView)localObject1).setOnClickListener(new are(this, (dbq)localObject2, paramInt));
      }
      localObject1 = paramView;
      if (((dbq)localObject2).c == null) {
        break;
      }
      localObject2 = bks.a(this.k, this.l, ((dbq)localObject2).c);
      if (paramViewGroup.e != null) {
        paramViewGroup.e.a();
      }
      localObject1 = this.b;
      localObject3 = paramViewGroup.d;
      paramViewGroup.e = ((ash)localObject1).c.a((String)localObject2, (ImageView)localObject3, true);
      localObject1 = paramView;
      break;
      paramViewGroup = (arf)paramView.getTag();
      break label269;
      if (!TextUtils.isEmpty(((dbq)localObject2).e))
      {
        paramViewGroup.a.setChecked(this.a.containsKey(((dbq)localObject2).e));
        break label318;
      }
      paramViewGroup.a.setChecked(false);
      break label318;
    }
  }
  
  public final int getViewTypeCount()
  {
    return 2;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    if (getItemViewType(paramInt) == 1) {}
    for (boolean bool = false;; bool = super.isEnabled(paramInt)) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.ExpandedMenuView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class py
  implements AdapterView.OnItemClickListener, qp
{
  LayoutInflater a;
  qa b;
  int c;
  public qq d;
  private Context e;
  private ExpandedMenuView f;
  private int g;
  private pz h;
  
  private py(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.g = 0;
  }
  
  public py(Context paramContext, int paramInt)
  {
    this(paramInt, 0);
    this.e = paramContext;
    this.a = LayoutInflater.from(this.e);
  }
  
  public final qr a(ViewGroup paramViewGroup)
  {
    if (this.f == null)
    {
      this.f = ((ExpandedMenuView)this.a.inflate(a.bI, paramViewGroup, false));
      if (this.h == null) {
        this.h = new pz(this);
      }
      this.f.setAdapter(this.h);
      this.f.setOnItemClickListener(this);
    }
    return this.f;
  }
  
  public final void a(Context paramContext, qa paramqa)
  {
    if (this.g != 0)
    {
      this.e = new ContextThemeWrapper(paramContext, this.g);
      this.a = LayoutInflater.from(this.e);
    }
    for (;;)
    {
      this.b = paramqa;
      if (this.h != null) {
        this.h.notifyDataSetChanged();
      }
      return;
      if (this.e != null)
      {
        this.e = paramContext;
        if (this.a == null) {
          this.a = LayoutInflater.from(this.e);
        }
      }
    }
  }
  
  public final void a(qa paramqa, boolean paramBoolean)
  {
    if (this.d != null) {
      this.d.a(paramqa, paramBoolean);
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(qu paramqu)
  {
    boolean bool = false;
    if (!paramqu.hasVisibleItems()) {
      return bool;
    }
    qd localqd = new qd(paramqu);
    Object localObject1 = localqd.a;
    ne localne = new ne(((qa)localObject1).a);
    localqd.c = new py(localne.a.a, a.bL);
    localqd.c.d = localqd;
    localqd.a.a(localqd.c);
    Object localObject2 = localqd.c.b();
    localne.a.h = ((ListAdapter)localObject2);
    localne.a.i = localqd;
    localObject2 = ((qa)localObject1).h;
    label130:
    mz localmz;
    mx localmx;
    label193:
    ListView localListView;
    int i;
    if (localObject2 != null)
    {
      localne.a.e = ((View)localObject2);
      localne.a.g = localqd;
      localObject2 = new nd(localne.a.a, localne.b);
      localmz = localne.a;
      localmx = nd.a((nd)localObject2);
      if (localmz.e == null) {
        break label461;
      }
      localmx.C = localmz.e;
      if (localmz.h != null)
      {
        localListView = (ListView)localmz.b.inflate(localmx.H, null);
        i = localmx.J;
        if (localmz.h == null) {
          break label542;
        }
      }
    }
    label461:
    label542:
    for (localObject1 = localmz.h;; localObject1 = new nc(localmz.a, i, 16908308, null))
    {
      localmx.D = ((ListAdapter)localObject1);
      localmx.E = localmz.j;
      if (localmz.i != null) {
        localListView.setOnItemClickListener(new na(localmz, localmx));
      }
      localmx.f = localListView;
      ((nd)localObject2).setCancelable(localne.a.f);
      if (localne.a.f) {
        ((nd)localObject2).setCanceledOnTouchOutside(true);
      }
      ((nd)localObject2).setOnCancelListener(null);
      ((nd)localObject2).setOnDismissListener(null);
      if (localne.a.g != null) {
        ((nd)localObject2).setOnKeyListener(localne.a.g);
      }
      localqd.b = ((nd)localObject2);
      localqd.b.setOnDismissListener(localqd);
      localObject1 = localqd.b.getWindow().getAttributes();
      ((WindowManager.LayoutParams)localObject1).type = 1003;
      ((WindowManager.LayoutParams)localObject1).flags |= 0x20000;
      localqd.b.show();
      if (this.d != null) {
        this.d.a_(paramqu);
      }
      bool = true;
      break;
      localObject2 = ((qa)localObject1).g;
      localne.a.c = ((Drawable)localObject2);
      localObject1 = ((qa)localObject1).f;
      localne.a.d = ((CharSequence)localObject1);
      break label130;
      if (localmz.d != null) {
        localmx.a(localmz.d);
      }
      if (localmz.c == null) {
        break label193;
      }
      localObject1 = localmz.c;
      localmx.y = ((Drawable)localObject1);
      localmx.x = 0;
      if (localmx.z == null) {
        break label193;
      }
      if (localObject1 != null)
      {
        localmx.z.setImageDrawable((Drawable)localObject1);
        break label193;
      }
      localmx.z.setVisibility(8);
      break label193;
    }
  }
  
  public final ListAdapter b()
  {
    if (this.h == null) {
      this.h = new pz(this);
    }
    return this.h;
  }
  
  public final void b(boolean paramBoolean)
  {
    if (this.h != null) {
      this.h.notifyDataSetChanged();
    }
  }
  
  public final boolean b(qe paramqe)
  {
    return false;
  }
  
  public final boolean c(qe paramqe)
  {
    return false;
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.b.a(this.h.a(paramInt), this, 0);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\py.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
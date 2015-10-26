import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class pv
  implements qp
{
  public Context a;
  public Context b;
  public qa c;
  public qq d;
  public qr e;
  private LayoutInflater f;
  private int g;
  private int h;
  
  public pv(Context paramContext, int paramInt1, int paramInt2)
  {
    this.a = paramContext;
    this.f = LayoutInflater.from(paramContext);
    this.g = paramInt1;
    this.h = paramInt2;
  }
  
  public View a(qe paramqe, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof qs)) {}
    for (paramView = (qs)paramView;; paramView = (qs)this.f.inflate(this.h, paramViewGroup, false))
    {
      a(paramqe, paramView);
      return (View)paramView;
    }
  }
  
  public qr a(ViewGroup paramViewGroup)
  {
    if (this.e == null)
    {
      this.e = ((qr)this.f.inflate(this.g, paramViewGroup, false));
      this.e.a(this.c);
      b(true);
    }
    return this.e;
  }
  
  public void a(Context paramContext, qa paramqa)
  {
    this.b = paramContext;
    LayoutInflater.from(this.b);
    this.c = paramqa;
  }
  
  public void a(qa paramqa, boolean paramBoolean)
  {
    if (this.d != null) {
      this.d.a(paramqa, paramBoolean);
    }
  }
  
  public abstract void a(qe paramqe, qs paramqs);
  
  public boolean a()
  {
    return false;
  }
  
  public boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public boolean a(qe paramqe)
  {
    return true;
  }
  
  public boolean a(qu paramqu)
  {
    if (this.d != null) {}
    for (boolean bool = this.d.a_(paramqu);; bool = false) {
      return bool;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)this.e;
    if (localViewGroup == null) {}
    label215:
    label222:
    for (;;)
    {
      return;
      int j;
      if (this.c != null)
      {
        this.c.i();
        ArrayList localArrayList = this.c.h();
        int m = localArrayList.size();
        int k = 0;
        int i = 0;
        j = i;
        if (k < m)
        {
          qe localqe = (qe)localArrayList.get(k);
          if (!a(localqe)) {
            break label215;
          }
          View localView1 = localViewGroup.getChildAt(i);
          if ((localView1 instanceof qs)) {}
          for (Object localObject = ((qs)localView1).a();; localObject = null)
          {
            View localView2 = a(localqe, localView1, localViewGroup);
            if (localqe != localObject)
            {
              localView2.setPressed(false);
              gt.s(localView2);
            }
            if (localView2 != localView1)
            {
              localObject = (ViewGroup)localView2.getParent();
              if (localObject != null) {
                ((ViewGroup)localObject).removeView(localView2);
              }
              ((ViewGroup)this.e).addView(localView2, i);
            }
            i++;
            k++;
            break;
          }
        }
      }
      for (;;)
      {
        if (j >= localViewGroup.getChildCount()) {
          break label222;
        }
        if (!a(localViewGroup, j))
        {
          j++;
          continue;
          break;
          j = 0;
        }
      }
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
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.support.v7.internal.widget.ActivityChooserView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public final class rv
  extends BaseAdapter
{
  public rl a;
  boolean b;
  private int d = 4;
  private boolean e;
  private boolean f;
  
  public rv(ActivityChooserView paramActivityChooserView) {}
  
  public final int a()
  {
    int j = 0;
    int m = this.d;
    this.d = Integer.MAX_VALUE;
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i1 = getCount();
    View localView = null;
    int i = 0;
    while (j < i1)
    {
      localView = getView(j, localView, null);
      localView.measure(n, k);
      i = Math.max(i, localView.getMeasuredWidth());
      j++;
    }
    this.d = m;
    return i;
  }
  
  public final void a(int paramInt)
  {
    if (this.d != paramInt)
    {
      this.d = paramInt;
      notifyDataSetChanged();
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.f != paramBoolean)
    {
      this.f = paramBoolean;
      notifyDataSetChanged();
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.b != paramBoolean1) || (this.e != paramBoolean2))
    {
      this.b = paramBoolean1;
      this.e = paramBoolean2;
      notifyDataSetChanged();
    }
  }
  
  public final int getCount()
  {
    int j = this.a.a();
    int i = j;
    if (!this.b)
    {
      i = j;
      if (this.a.b() != null) {
        i = j - 1;
      }
    }
    j = Math.min(i, this.d);
    i = j;
    if (this.f) {
      i = j + 1;
    }
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    switch (getItemViewType(paramInt))
    {
    default: 
      throw new IllegalArgumentException();
    }
    int i;
    for (Object localObject = null;; localObject = this.a.a(i))
    {
      return localObject;
      i = paramInt;
      if (!this.b)
      {
        i = paramInt;
        if (this.a.b() != null) {
          i = paramInt + 1;
        }
      }
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
    View localView;
    switch (getItemViewType(paramInt))
    {
    default: 
      throw new IllegalArgumentException();
    case 1: 
      if (paramView != null)
      {
        localView = paramView;
        if (paramView.getId() == 1) {
          break;
        }
      }
      else
      {
        localView = LayoutInflater.from(this.c.getContext()).inflate(a.bG, paramViewGroup, false);
        localView.setId(1);
        ((TextView)localView.findViewById(a.bx)).setText(this.c.getContext().getString(a.bU));
      }
      break;
    }
    for (;;)
    {
      return localView;
      if (paramView != null)
      {
        localView = paramView;
        if (paramView.getId() == a.bj) {}
      }
      else
      {
        localView = LayoutInflater.from(this.c.getContext()).inflate(a.bG, paramViewGroup, false);
      }
      paramViewGroup = this.c.getContext().getPackageManager();
      paramView = (ImageView)localView.findViewById(a.bh);
      ResolveInfo localResolveInfo = (ResolveInfo)getItem(paramInt);
      paramView.setImageDrawable(localResolveInfo.loadIcon(paramViewGroup));
      ((TextView)localView.findViewById(a.bx)).setText(localResolveInfo.loadLabel(paramViewGroup));
      if ((this.b) && (paramInt == 0) && (this.e)) {
        gt.b(localView, true);
      } else {
        gt.b(localView, false);
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
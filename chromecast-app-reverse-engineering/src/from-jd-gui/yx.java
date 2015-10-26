import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public final class yx
  implements xd
{
  public yx(RecyclerView paramRecyclerView) {}
  
  public final int a()
  {
    return this.a.getChildCount();
  }
  
  public final int a(View paramView)
  {
    return this.a.indexOfChild(paramView);
  }
  
  public final void a(int paramInt)
  {
    View localView = this.a.getChildAt(paramInt);
    if (localView != null) {
      RecyclerView.b(this.a, localView);
    }
    this.a.removeViewAt(paramInt);
  }
  
  public final void a(View paramView, int paramInt)
  {
    this.a.addView(paramView, paramInt);
    RecyclerView.a(this.a, paramView);
  }
  
  public final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    zr localzr = RecyclerView.b(paramView);
    if (localzr != null)
    {
      if ((!localzr.o()) && (!localzr.b())) {
        throw new IllegalArgumentException("Called attach on a child which is not detached: " + localzr);
      }
      localzr.i();
    }
    RecyclerView.a(this.a, paramView, paramInt, paramLayoutParams);
  }
  
  public final View b(int paramInt)
  {
    return this.a.getChildAt(paramInt);
  }
  
  public final zr b(View paramView)
  {
    return RecyclerView.b(paramView);
  }
  
  public final void b()
  {
    int j = this.a.getChildCount();
    for (int i = 0; i < j; i++) {
      RecyclerView.b(this.a, b(i));
    }
    this.a.removeAllViews();
  }
  
  public final void c(int paramInt)
  {
    Object localObject = b(paramInt);
    if (localObject != null)
    {
      localObject = RecyclerView.b((View)localObject);
      if (localObject != null)
      {
        if ((((zr)localObject).o()) && (!((zr)localObject).b())) {
          throw new IllegalArgumentException("called detach on an already detached child " + localObject);
        }
        ((zr)localObject).a(256);
      }
    }
    RecyclerView.a(this.a, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
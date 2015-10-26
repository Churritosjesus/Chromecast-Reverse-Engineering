import android.support.v7.widget.RecyclerView;
import android.view.View;

final class yr
  extends yq
{
  yr(zh paramzh)
  {
    super(paramzh, (byte)0);
  }
  
  public final int a(View paramView)
  {
    zi localzi = (zi)paramView.getLayoutParams();
    zh localzh = this.a;
    return paramView.getLeft() - zh.f(paramView) - localzi.leftMargin;
  }
  
  public final void a(int paramInt)
  {
    Object localObject = this.a;
    if (((zh)localObject).e != null)
    {
      localObject = ((zh)localObject).e;
      int j = ((RecyclerView)localObject).c.a();
      for (int i = 0; i < j; i++) {
        ((RecyclerView)localObject).c.b(i).offsetLeftAndRight(paramInt);
      }
    }
  }
  
  public final int b()
  {
    return this.a.q();
  }
  
  public final int b(View paramView)
  {
    zi localzi = (zi)paramView.getLayoutParams();
    zh localzh = this.a;
    int i = paramView.getRight();
    int j = zh.g(paramView);
    return localzi.rightMargin + (i + j);
  }
  
  public final int c()
  {
    return this.a.o() - this.a.s();
  }
  
  public final int c(View paramView)
  {
    zi localzi = (zi)paramView.getLayoutParams();
    int i = zh.b(paramView);
    int j = localzi.leftMargin;
    return localzi.rightMargin + (i + j);
  }
  
  public final int d()
  {
    return this.a.o();
  }
  
  public final int d(View paramView)
  {
    zi localzi = (zi)paramView.getLayoutParams();
    int i = zh.c(paramView);
    int j = localzi.topMargin;
    return localzi.bottomMargin + (i + j);
  }
  
  public final int e()
  {
    return this.a.o() - this.a.q() - this.a.s();
  }
  
  public final int f()
  {
    return this.a.s();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
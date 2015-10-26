import android.support.v7.widget.RecyclerView;
import android.view.View;

final class ys
  extends yq
{
  ys(zh paramzh)
  {
    super(paramzh, (byte)0);
  }
  
  public final int a(View paramView)
  {
    zi localzi = (zi)paramView.getLayoutParams();
    zh localzh = this.a;
    return paramView.getTop() - zh.d(paramView) - localzi.topMargin;
  }
  
  public final void a(int paramInt)
  {
    Object localObject = this.a;
    if (((zh)localObject).e != null)
    {
      localObject = ((zh)localObject).e;
      int j = ((RecyclerView)localObject).c.a();
      for (int i = 0; i < j; i++) {
        ((RecyclerView)localObject).c.b(i).offsetTopAndBottom(paramInt);
      }
    }
  }
  
  public final int b()
  {
    return this.a.r();
  }
  
  public final int b(View paramView)
  {
    zi localzi = (zi)paramView.getLayoutParams();
    zh localzh = this.a;
    int i = paramView.getBottom();
    int j = zh.e(paramView);
    return localzi.bottomMargin + (i + j);
  }
  
  public final int c()
  {
    return this.a.p() - this.a.t();
  }
  
  public final int c(View paramView)
  {
    zi localzi = (zi)paramView.getLayoutParams();
    int j = zh.c(paramView);
    int i = localzi.topMargin;
    return localzi.bottomMargin + (j + i);
  }
  
  public final int d()
  {
    return this.a.p();
  }
  
  public final int d(View paramView)
  {
    zi localzi = (zi)paramView.getLayoutParams();
    int j = zh.b(paramView);
    int i = localzi.leftMargin;
    return localzi.rightMargin + (j + i);
  }
  
  public final int e()
  {
    return this.a.p() - this.a.r() - this.a.t();
  }
  
  public final int f()
  {
    return this.a.t();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
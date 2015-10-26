import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

final class yl
  implements AbsListView.OnScrollListener
{
  yl(yc paramyc) {}
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 1) && (!this.a.e()) && (yc.b(this.a).getContentView() != null))
    {
      yc.d(this.a).removeCallbacks(yc.c(this.a));
      yc.c(this.a).run();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
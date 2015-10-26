import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class amh
  extends zf
{
  private final int a;
  private final int b;
  
  public amh(ama paramama, int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.a = paramInt2;
  }
  
  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView)
  {
    paramRect.left = this.a;
    paramRect.right = this.a;
    paramRect.bottom = (this.b << 1);
    paramRect.top = (this.b << 1);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\amh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
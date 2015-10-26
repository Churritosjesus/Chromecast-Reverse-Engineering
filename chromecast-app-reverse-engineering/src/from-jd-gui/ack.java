import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import java.util.List;

final class ack
  implements abc
{
  ack(acb paramacb) {}
  
  public final void a(List paramList)
  {
    if (paramList == null) {}
    for (int i = 0;; i = paramList.size())
    {
      if ((paramList != null) && (paramList.size() > 0))
      {
        acb localacb = this.a;
        if ((localacb.c != null) && (localacb.b))
        {
          localacb.getLocationInWindow(localacb.a);
          int m = localacb.getHeight();
          int j = localacb.a[1] + m;
          localacb.c.getLocationInWindow(localacb.a);
          int k = localacb.a[1];
          k = m / localacb.getLineCount() + k;
          if (j > k) {
            localacb.c.scrollBy(0, j - k);
          }
        }
        if (acb.f(this.a) == 0) {
          acb.a(this.a, this.a.getResources().getString(a.cQ));
        }
      }
      if ((paramList == null) || (paramList.size() != 1) || (((acx)paramList.get(0)).a != 1))
      {
        acb.h(this.a).getLocationInWindow(acb.g(this.a));
        this.a.getWindowVisibleDisplayFrame(acb.i(this.a));
        this.a.setDropDownHeight(acb.i(this.a).bottom - acb.g(this.a)[1] - acb.h(this.a).getHeight() - this.a.getDropDownVerticalOffset());
      }
      acb.a(this.a, i);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
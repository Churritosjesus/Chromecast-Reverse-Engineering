import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import java.util.List;

final class bnv
  implements View.OnClickListener
{
  bnv(bnu parambnu, bmu parambmu) {}
  
  public final void onClick(View paramView)
  {
    int i = 0;
    paramView = this.a;
    boolean bool;
    if (!this.a.n)
    {
      bool = true;
      paramView.n = bool;
      paramView = this.a.m;
      if (!this.a.n) {
        break label130;
      }
    }
    for (;;)
    {
      paramView.setVisibility(i);
      i = this.a.o.h.getResources().getDimensionPixelSize(a.dC);
      paramView = new bnx(this.a.o, this.a.l, i * this.a.o.d.size(), this.a.n);
      this.a.l.startAnimation(paramView);
      return;
      bool = false;
      break;
      label130:
      i = 8;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bnv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

final class bne
  implements View.OnClickListener
{
  bne(bnd parambnd, ast paramast) {}
  
  public final void onClick(View paramView)
  {
    bmu localbmu = this.b.a;
    paramView = this.a;
    new AlertDialog.Builder(localbmu.h).setMessage(localbmu.h.getString(b.am, new Object[] { paramView.c })).setPositiveButton(b.L, new bnf(localbmu, paramView)).setNegativeButton(b.H, null).show();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
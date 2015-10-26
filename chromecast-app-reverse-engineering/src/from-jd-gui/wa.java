import android.content.Context;
import android.view.View;

final class wa
  extends qn
{
  public wa(vu paramvu, Context paramContext, qa paramqa, View paramView, boolean paramBoolean)
  {
    super(paramContext, paramqa, paramView, true, a.s);
    this.f = 8388613;
    this.d = paramvu.m;
  }
  
  public final void onDismiss()
  {
    super.onDismiss();
    this.g.c.close();
    this.g.j = null;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

final class axp
  implements View.OnClickListener
{
  axp(axo paramaxo, dbg paramdbg, String paramString) {}
  
  public final void onClick(View paramView)
  {
    Context localContext = paramView.getContext();
    if ((localContext != null) && (!TextUtils.isEmpty(this.a.h)))
    {
      blx.a(paramView.getContext(), this.a.h);
      paramView = apg.a(120);
      paramView.b = this.a.f;
      paramView.b();
    }
    for (;;)
    {
      return;
      if ((localContext != null) && ((localContext instanceof axb))) {
        ((axb)localContext).a(this.a.f, this.b, this.a.g);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\axp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
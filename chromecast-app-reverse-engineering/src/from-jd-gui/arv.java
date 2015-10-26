import android.app.AlertDialog.Builder;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;

final class arv
  implements View.OnClickListener
{
  arv(art paramart, dcj paramdcj, CompoundButton paramCompoundButton) {}
  
  public final void onClick(View paramView)
  {
    boolean bool = true;
    if (!TextUtils.isEmpty(this.a.o)) {
      art.a(this.b).a(this.a, "child");
    }
    for (;;)
    {
      return;
      if (this.a.a.intValue() == 11)
      {
        new AlertDialog.Builder(this.b.getContext()).setMessage(this.b.getContext().getString(b.am, new Object[] { art.a(this.b).D() })).setPositiveButton(b.L, new arw(this)).setNegativeButton(b.H, null).show();
      }
      else if (this.a.a.intValue() == 12)
      {
        new AlertDialog.Builder(this.b.getContext()).setTitle(b.af).setMessage(this.a.g).setPositiveButton(b.ae, new arx(this)).setNegativeButton(b.H, null).show();
      }
      else
      {
        if ((this.a.i == null) || (this.a.i.length <= 0) || (this.a.j == null)) {
          break;
        }
        art.a(this.b, this.a);
      }
    }
    if (!art.a(this.b).h().s().a(this.a.j)) {}
    for (;;)
    {
      this.c.setChecked(bool);
      art.a(this.b, this.a, bool);
      break;
      bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\arv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
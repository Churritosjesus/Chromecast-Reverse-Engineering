import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListAdapter;

final class su
  implements DialogInterface.OnClickListener, ta
{
  private AlertDialog a;
  private ListAdapter b;
  private CharSequence c;
  
  su(sr paramsr) {}
  
  public final void a()
  {
    if (this.a != null)
    {
      this.a.dismiss();
      this.a = null;
    }
  }
  
  public final void a(ListAdapter paramListAdapter)
  {
    this.b = paramListAdapter;
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
  }
  
  public final boolean b()
  {
    if (this.a != null) {}
    for (boolean bool = this.a.isShowing();; bool = false) {
      return bool;
    }
  }
  
  public final void c()
  {
    if (this.b == null) {}
    for (;;)
    {
      return;
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.d.getContext());
      if (this.c != null) {
        localBuilder.setTitle(this.c);
      }
      this.a = localBuilder.setSingleChoiceItems(this.b, this.d.n, this).create();
      this.a.show();
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.d.a(paramInt);
    if (this.d.l != null) {
      this.d.a(null, paramInt, this.b.getItemId(paramInt));
    }
    a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\su.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
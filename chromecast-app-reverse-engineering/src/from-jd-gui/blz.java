import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;

final class blz
  implements DialogInterface.OnDismissListener
{
  blz(DialogInterface.OnClickListener paramOnClickListener) {}
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    this.a.onClick(paramDialogInterface, 0);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\blz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
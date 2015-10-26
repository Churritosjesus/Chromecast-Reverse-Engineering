import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class blt
  implements DialogInterface.OnDismissListener
{
  blt(blu paramblu) {}
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    if (this.a != null) {
      this.a.a(false);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\blt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
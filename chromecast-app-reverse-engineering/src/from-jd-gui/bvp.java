import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

public final class bvp
  extends DialogFragment
{
  private Dialog a = null;
  private DialogInterface.OnCancelListener b = null;
  
  public static bvp a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    bvp localbvp = new bvp();
    paramDialog = (Dialog)a.f(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    localbvp.a = paramDialog;
    if (paramOnCancelListener != null) {
      localbvp.b = paramOnCancelListener;
    }
    return localbvp;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.b != null) {
      this.b.onCancel(paramDialogInterface);
    }
  }
  
  public final Dialog onCreateDialog(Bundle paramBundle)
  {
    if (this.a == null) {
      setShowsDialog(false);
    }
    return this.a;
  }
  
  public final void show(FragmentManager paramFragmentManager, String paramString)
  {
    super.show(paramFragmentManager, paramString);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

public final class bvv
  extends i
{
  private Dialog Z = null;
  private DialogInterface.OnCancelListener aa = null;
  
  public static bvv a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    bvv localbvv = new bvv();
    paramDialog = (Dialog)a.f(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    localbvv.Z = paramDialog;
    if (paramOnCancelListener != null) {
      localbvv.aa = paramOnCancelListener;
    }
    return localbvv;
  }
  
  public final void a(r paramr, String paramString)
  {
    super.a(paramr, paramString);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    if (this.Z == null) {
      this.c = false;
    }
    return this.Z;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.aa != null) {
      this.aa.onCancel(paramDialogInterface);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
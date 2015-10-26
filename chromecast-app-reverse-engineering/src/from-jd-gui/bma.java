import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

final class bma
  implements DialogInterface.OnClickListener
{
  bma(Activity paramActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = blf.T(this.a);
    this.a.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(paramDialogInterface)));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
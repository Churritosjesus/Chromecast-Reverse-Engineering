import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public final class abf
  extends DialogFragment
  implements DialogInterface.OnClickListener
{
  private String a;
  
  public static abf a(String paramString)
  {
    abf localabf = new abf();
    Bundle localBundle = new Bundle(1);
    localBundle.putString("text", paramString);
    localabf.setArguments(localBundle);
    return localabf;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1) {
      ((ClipboardManager)getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, this.a));
    }
  }
  
  public final Dialog onCreateDialog(Bundle paramBundle)
  {
    this.a = getArguments().getString("text");
    return new AlertDialog.Builder(getActivity()).setMessage(this.a).setPositiveButton(a.cT, this).setNegativeButton(a.cS, null).create();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\abf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
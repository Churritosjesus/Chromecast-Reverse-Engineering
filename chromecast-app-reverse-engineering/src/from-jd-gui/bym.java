import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

public final class bym
  implements DialogInterface.OnClickListener
{
  private final Activity a;
  private final j b;
  private final Intent c;
  private final int d;
  
  public bym(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    this.a = paramActivity;
    this.b = null;
    this.c = paramIntent;
    this.d = paramInt;
  }
  
  public bym(j paramj, Intent paramIntent, int paramInt)
  {
    this.a = null;
    this.b = paramj;
    this.c = paramIntent;
    this.d = paramInt;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    for (;;)
    {
      try
      {
        if ((this.c != null) && (this.b != null))
        {
          this.b.a(this.c, this.d);
          paramDialogInterface.dismiss();
          return;
        }
      }
      catch (ActivityNotFoundException paramDialogInterface)
      {
        Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        continue;
      }
      if (this.c != null) {
        this.a.startActivityForResult(this.c, this.d);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bym.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
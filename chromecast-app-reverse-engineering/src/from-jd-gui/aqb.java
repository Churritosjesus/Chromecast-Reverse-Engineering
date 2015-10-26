import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class aqb
  implements DialogInterface.OnCancelListener
{
  aqb(apu paramapu) {}
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    apu.a(this.a, false);
    apu.d(this.a).a(false);
    apu.a(this.a, null);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
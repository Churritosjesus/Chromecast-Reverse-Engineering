import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;

public final class aqy
  extends i
{
  public arc Z;
  
  public static aqy p()
  {
    return new aqy();
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    paramBundle = new AlertDialog.Builder(this.y).setTitle(b.Y).setMessage(b.X).setPositiveButton(b.P, new aqz(this));
    paramBundle.setOnKeyListener(new ara(this));
    paramBundle.setNegativeButton(b.ab, new arb(this));
    paramBundle = paramBundle.create();
    paramBundle.setCanceledOnTouchOutside(false);
    paramBundle.show();
    return paramBundle;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;

public final class bbl
  extends i
{
  public final Dialog c(Bundle paramBundle)
  {
    return new AlertDialog.Builder(this.y).setTitle(b.ar).setMessage(b.aq).setNegativeButton(b.H, null).setPositiveButton(b.I, new bbm(this)).create();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
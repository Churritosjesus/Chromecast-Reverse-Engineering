import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public final class bgv
  extends i
{
  private Spinner Z;
  private String aa;
  private bgz ab;
  
  public final void a()
  {
    super.a();
    this.ab = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.ab = ((bgz)paramActivity);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    View localView = this.y.getLayoutInflater().inflate(a.gM, null);
    ((TextView)localView.findViewById(f.bY)).setText(b.cU);
    this.Z = ((Spinner)localView.findViewById(f.aN));
    if (paramBundle != null) {
      this.aa = paramBundle.getString("setupCountry");
    }
    List localList = blj.e();
    ArrayAdapter localArrayAdapter = new ArrayAdapter(this.y, 17367048, localList);
    localArrayAdapter.setDropDownViewResource(17367049);
    this.Z.setAdapter(localArrayAdapter);
    blm localblm = blj.a(localList, this.aa);
    paramBundle = localblm;
    if (localblm == null) {
      paramBundle = blj.a(localList);
    }
    if (paramBundle != null)
    {
      int i = localArrayAdapter.getPosition(paramBundle);
      if (i != -1) {
        this.Z.setSelection(i);
      }
    }
    this.Z.setOnItemSelectedListener(new bgy(this));
    return new AlertDialog.Builder(this.y).setTitle(b.cV).setView(localView).setNegativeButton(b.H, new bgx(this)).setPositiveButton(b.I, new bgw(this)).create();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("setupCountry", this.aa);
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    super.onCancel(paramDialogInterface);
    this.ab.a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bgv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
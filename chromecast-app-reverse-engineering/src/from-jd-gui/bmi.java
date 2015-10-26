import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.chromecast.app.DeviceSettingsActivity;
import java.util.ArrayList;

public final class bmi
  extends i
{
  private View Z;
  private bos aa;
  private AlertDialog ab;
  private DeviceSettingsActivity ac;
  private boolean ad;
  private bfs ae;
  private String af;
  
  public static bmi a(boolean paramBoolean, bfs parambfs)
  {
    bmi localbmi = new bmi();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("hasScannedNetworks", paramBoolean);
    localBundle.putParcelable("wifiNetwork", parambfs);
    localbmi.f(localBundle);
    return localbmi;
  }
  
  private void b(int paramInt)
  {
    this.ab.getButton(-2).setVisibility(paramInt);
    this.ab.getButton(-1).setVisibility(paramInt);
  }
  
  private void g(boolean paramBoolean)
  {
    View localView2 = this.Z.findViewById(f.bH);
    View localView1 = this.Z.findViewById(f.ba);
    if (paramBoolean)
    {
      localView2.setVisibility(8);
      localView1.setVisibility(0);
    }
    for (;;)
    {
      return;
      localView2.setVisibility(0);
      localView1.setVisibility(8);
    }
  }
  
  public final void a()
  {
    super.a();
    this.ac = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.ac = ((DeviceSettingsActivity)paramActivity);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    this.ad = this.m.getBoolean("hasScannedNetworks");
    this.ae = ((bfs)this.m.getParcelable("wifiNetwork"));
    this.af = this.ae.a;
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("hasScannedNetworks")) {
        this.ad = paramBundle.getBoolean("hasScannedNetworks");
      }
      if (paramBundle.containsKey("selectedNetwork")) {
        this.af = paramBundle.getString("selectedNetwork");
      }
    }
    this.Z = this.y.getLayoutInflater().inflate(a.gj, null);
    this.ab = new AlertDialog.Builder(this.ac).setInverseBackgroundForced(true).setTitle(b.cX).setView(this.Z).setNegativeButton(b.H, null).setPositiveButton(b.I, null).setCancelable(true).create();
    this.ab.setOnShowListener(new bmj(this));
    return this.ab;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("hasScannedNetworks", this.ad);
    paramBundle.putString("selectedNetwork", this.aa.a().a);
  }
  
  public final void p()
  {
    if (this.ac == null) {
      return;
    }
    this.ad = true;
    this.aa = new bos((ViewGroup)this.Z.findViewById(f.ba));
    bfu localbfu;
    label55:
    bos localbos;
    ArrayList localArrayList;
    String str;
    if (this.aa != null)
    {
      if (this.ae != null) {
        break label131;
      }
      localbfu = bfu.a;
      localbos = this.aa;
      localArrayList = this.ac.r;
      str = this.af;
      if ((this.ae == null) || (!this.ae.g)) {
        break label142;
      }
    }
    label131:
    label142:
    for (boolean bool = true;; bool = false)
    {
      localbos.a(localArrayList, str, localbfu, bool);
      this.aa.a(a(b.el));
      g(true);
      b(0);
      break;
      localbfu = this.ae.b;
      break label55;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bmi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
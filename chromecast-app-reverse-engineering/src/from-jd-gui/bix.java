import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class bix
  extends bjq
  implements View.OnClickListener
{
  private TextView Z;
  private bjn a;
  private TextView aa;
  private ImageView b;
  private TextView d;
  
  public static bix a(boolean paramBoolean)
  {
    bix localbix = new bix();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("waitForOta", paramBoolean);
    localbix.f(localBundle);
    return localbix;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramViewGroup = paramLayoutInflater.inflate(a.gz, paramViewGroup, false);
    this.b = ((ImageView)paramViewGroup.findViewById(f.bw));
    this.b.setImageResource(a.eE);
    this.d = ((TextView)paramViewGroup.findViewById(f.bq));
    this.d.setText(b.cF);
    this.Z = ((TextView)paramViewGroup.findViewById(f.I));
    this.Z.setText(b.cE);
    paramLayoutInflater = paramViewGroup.findViewById(f.dc);
    paramBundle = paramViewGroup.findViewById(f.aR);
    this.aa = ((TextView)paramViewGroup.findViewById(f.cE));
    if (this.m.getBoolean("waitForOta"))
    {
      paramLayoutInflater.setVisibility(0);
      paramBundle.setVisibility(8);
      this.aa.setVisibility(4);
      if (!this.a.F().h) {}
    }
    for (this.aa = null;; this.aa = null)
    {
      return paramViewGroup;
      paramLayoutInflater.setVisibility(8);
      paramBundle.setVisibility(0);
      paramBundle.setOnClickListener(this);
      this.aa.setVisibility(8);
    }
  }
  
  public final void a()
  {
    super.a();
    this.a = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.a = ((bjn)paramActivity);
  }
  
  public final void b(int paramInt)
  {
    super.b(paramInt);
    if ((paramInt != -1) && (this.aa != null)) {
      this.aa.setVisibility(0);
    }
  }
  
  public final void d()
  {
    this.aa = null;
    super.d();
  }
  
  public final void onClick(View paramView)
  {
    if (paramView.getId() == f.aR) {
      this.a.a(bjo.g);
    }
  }
  
  protected final TextView p()
  {
    return this.aa;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
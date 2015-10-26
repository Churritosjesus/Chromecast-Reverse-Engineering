import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public final class bgo
  extends j
  implements View.OnClickListener
{
  private bjn Z;
  public CheckBox a;
  public CheckBox b;
  private EditText c;
  private Button d;
  
  public static bgo a(boolean paramBoolean)
  {
    bgo localbgo = new bgo();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("supportsGetLicense", paramBoolean);
    localbgo.f(localBundle);
    return localbgo;
  }
  
  private void q()
  {
    Button localButton = this.d;
    if (!TextUtils.isEmpty(p())) {}
    for (boolean bool = true;; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    boolean bool2 = false;
    paramViewGroup = paramLayoutInflater.inflate(a.fK, paramViewGroup, false);
    ((TextView)paramViewGroup.findViewById(f.cf)).setText(a(b.bN, new Object[] { this.Z.E() }));
    this.d = ((Button)paramViewGroup.findViewById(f.aa));
    this.d.setOnClickListener(this);
    this.c = ((EditText)paramViewGroup.findViewById(f.ar));
    this.c.addTextChangedListener(new bgp(this));
    this.c.setText(this.Z.D());
    if ((this.Z.F().e()) && (blf.K(this.y))) {
      paramLayoutInflater = blf.M(this.y);
    }
    switch (bgq.a[paramLayoutInflater.ordinal()])
    {
    default: 
      paramViewGroup.findViewById(f.cA).setVisibility(8);
      this.b = ((CheckBox)paramViewGroup.findViewById(f.ea));
      bool1 = bool2;
      switch (bgq.b[(blf.N(this.y) - 1)])
      {
      }
      break;
    }
    for (boolean bool1 = this.Z.F().O;; bool1 = true)
    {
      this.b.setChecked(bool1);
      d(true);
      return paramViewGroup;
      paramViewGroup.findViewById(f.cA).setVisibility(0);
      this.a = ((CheckBox)paramViewGroup.findViewById(f.cz));
      paramBundle = this.a;
      if (paramLayoutInflater == blg.b) {}
      for (bool1 = true;; bool1 = false)
      {
        paramBundle.setChecked(bool1);
        break;
      }
    }
  }
  
  public final void a()
  {
    super.a();
    this.Z = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.Z = ((bjn)paramActivity);
  }
  
  public final void a(Menu paramMenu)
  {
    super.a(paramMenu);
    if (!this.m.getBoolean("supportsGetLicense")) {
      paramMenu.findItem(f.bM).setVisible(false);
    }
  }
  
  public final void a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.a(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(a.gX, paramMenu);
  }
  
  public final void j()
  {
    super.j();
    q();
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.d)
    {
      ((InputMethodManager)this.y.getSystemService("input_method")).hideSoftInputFromWindow(this.y.getWindow().getDecorView().getRootView().getWindowToken(), 0);
      this.Z.a(bjo.d);
    }
  }
  
  public final String p()
  {
    return this.c.getText().toString().trim();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
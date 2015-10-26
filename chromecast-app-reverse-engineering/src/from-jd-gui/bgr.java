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
import android.widget.EditText;
import android.widget.TextView;

public final class bgr
  extends j
  implements View.OnClickListener
{
  public bos a;
  private bjn b;
  private TextView c;
  private Button d;
  
  public static bgr a(bfs parambfs, boolean paramBoolean)
  {
    bgr localbgr = new bgr();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("androidWifiNetwork", parambfs);
    localBundle.putBoolean("supporteGetLicense", paramBoolean);
    localbgr.f(localBundle);
    return localbgr;
  }
  
  private void p()
  {
    boolean bool2 = false;
    Button localButton = this.d;
    bos localbos = this.a;
    bfs localbfs = localbos.a();
    boolean bool1 = bool2;
    if (localbfs != null)
    {
      if (!TextUtils.isEmpty(localbfs.a)) {
        break label47;
      }
      bool1 = bool2;
    }
    for (;;)
    {
      localButton.setEnabled(bool1);
      return;
      label47:
      if (localbfs.b.k)
      {
        bool1 = bool2;
        if (TextUtils.isEmpty(localbos.b.getText().toString().trim())) {}
      }
      else
      {
        bool1 = true;
      }
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramViewGroup = paramLayoutInflater.inflate(a.fL, paramViewGroup, false);
    this.a = new bos((ViewGroup)paramViewGroup.findViewById(f.ad));
    this.a.a = new bgs(this);
    this.c = ((TextView)paramViewGroup.findViewById(f.aD));
    this.d = ((Button)paramViewGroup.findViewById(f.bi));
    this.d.setOnClickListener(this);
    paramLayoutInflater = (bfs)this.m.get("androidWifiNetwork");
    if (paramLayoutInflater != null)
    {
      this.a.a(this.b.u(), paramLayoutInflater.a, paramLayoutInflater.b, paramLayoutInflater.g);
      if (TextUtils.isEmpty(this.b.F().p)) {
        break label207;
      }
      this.c.setText(a(b.aV, new Object[] { this.b.F().p }));
    }
    for (;;)
    {
      d(true);
      return paramViewGroup;
      this.a.a(this.b.u(), null, null, false);
      break;
      label207:
      this.c.setText("");
    }
  }
  
  public final void a()
  {
    super.a();
    this.b = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.b = ((bjn)paramActivity);
  }
  
  public final void a(Menu paramMenu)
  {
    super.a(paramMenu);
    if (!this.m.getBoolean("supporteGetLicense")) {
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
    p();
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.d)
    {
      ((InputMethodManager)this.y.getSystemService("input_method")).hideSoftInputFromWindow(this.y.getWindow().getDecorView().getRootView().getWindowToken(), 0);
      this.b.a(bjo.e);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

public final class bhd
  extends j
  implements View.OnClickListener
{
  private int a = 0;
  private apd b;
  private TextView c;
  private bjn d;
  
  public static bhd a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("pincodeKey", paramString);
    paramString = new bhd();
    paramString.f(localBundle);
    return paramString;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.fI, paramViewGroup, false);
    this.c = ((TextView)paramLayoutInflater.findViewById(f.dr));
    this.c.setText(this.m.getString("pincodeKey"));
    paramViewGroup = new apd(57);
    paramViewGroup.h = this.d.A();
    this.b = paramViewGroup;
    paramViewGroup = (ImageView)paramLayoutInflater.findViewById(f.ac);
    paramViewGroup.getViewTreeObserver().addOnPreDrawListener(new bhe(this, paramViewGroup));
    paramLayoutInflater.findViewById(f.cN).setOnClickListener(this);
    paramLayoutInflater.findViewById(f.cO).setOnClickListener(this);
    d(true);
    return paramLayoutInflater;
  }
  
  public final void a()
  {
    super.a();
    this.d = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.d = ((bjn)paramActivity);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.a = paramBundle.getInt("mismatchCountKey");
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("mismatchCountKey", this.a);
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == f.cN)
    {
      ape.a().a(this.b.a(1));
      this.d.a(bjo.c);
    }
    do
    {
      return;
      if (i != f.cO) {
        break;
      }
      ape.a().a(this.b.a(0));
    } while (this.y.isFinishing());
    this.a += 1;
    af localaf = this.x.a();
    if (this.a < 3) {}
    for (paramView = new bjr();; paramView = bok.b(a.gI))
    {
      localaf.a(null);
      localaf.a(f.ai, paramView);
      localaf.b();
      break;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bhd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
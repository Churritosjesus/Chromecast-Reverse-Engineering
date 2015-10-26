import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.chromecast.app.setup.DeviceSetupActivity;

public final class bgt
  extends j
  implements View.OnClickListener
{
  private boolean a = false;
  private int b = 0;
  private apd c;
  
  private void p()
  {
    int j = 0;
    Object localObject = (TextView)this.N.findViewById(f.cT);
    if (this.a)
    {
      i = b.dp;
      ((TextView)localObject).setText(i);
      ((Button)this.N.findViewById(f.cR)).setText(b.dw);
      localObject = (Button)this.N.findViewById(f.cR);
      if (!this.a) {
        break label185;
      }
      i = 8;
      label75:
      ((Button)localObject).setVisibility(i);
      localObject = (TextView)this.N.findViewById(f.dM);
      if (!this.a) {
        break label190;
      }
      i = b.dA;
      label105:
      ((TextView)localObject).setText(i);
      localObject = this.N.findViewById(f.dU);
      if (!this.a) {
        break label197;
      }
      i = 0;
      label130:
      ((View)localObject).setVisibility(i);
      localObject = this.N.findViewById(f.dV);
      if (!this.a) {
        break label203;
      }
    }
    label185:
    label190:
    label197:
    label203:
    for (int i = j;; i = 8)
    {
      ((View)localObject).setVisibility(i);
      this.N.findViewById(f.cS).setClickable(this.a);
      return;
      i = b.dq;
      break;
      i = 0;
      break label75;
      i = b.dr;
      break label105;
      i = 8;
      break label130;
    }
  }
  
  private aph q()
  {
    if (this.y != null) {}
    for (aph localaph = ((DeviceSetupActivity)this.y).f;; localaph = null) {
      return localaph;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.c = new apd(57);
    paramLayoutInflater = paramLayoutInflater.inflate(a.gy, paramViewGroup, false);
    paramLayoutInflater.findViewById(f.cR).setOnClickListener(this);
    paramLayoutInflater.findViewById(f.dU).setOnClickListener(this);
    paramLayoutInflater.findViewById(f.dV).setOnClickListener(this);
    paramLayoutInflater.findViewById(f.cS).setOnClickListener(this);
    return paramLayoutInflater;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.a = paramBundle.getBoolean("playedSound", false);
      this.b = paramBundle.getInt("noSoundCount");
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("playedSound", this.a);
    paramBundle.putInt("noSoundCount", this.b);
  }
  
  public final void g_()
  {
    super.g_();
    p();
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == f.cR)
    {
      ((bgu)this.y).a_(false);
      this.a = true;
      p();
    }
    for (;;)
    {
      return;
      Object localObject;
      if (i == f.dU)
      {
        paramView = ape.a();
        localObject = this.c.a(1);
        ((apd)localObject).h = q();
        paramView.a((apd)localObject);
        ((bjn)this.y).a(bjo.c);
      }
      else
      {
        if (i == f.dV)
        {
          localObject = ape.a();
          paramView = this.c.a(0);
          paramView.h = q();
          ((ape)localObject).a(paramView);
          this.b += 1;
          localObject = this.x.a();
          if (this.b < 3) {}
          for (paramView = new biw();; paramView = bok.b(a.fu))
          {
            paramView.n = this;
            paramView.p = 0;
            ((af)localObject).a(null);
            ((af)localObject).a(f.ai, paramView);
            ((af)localObject).b();
            break;
          }
        }
        if (i == f.cS) {
          ((bgu)this.y).a_(true);
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bgt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
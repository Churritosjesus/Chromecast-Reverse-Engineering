import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.ViewFlipper;

public final class awn
  extends j
  implements axn
{
  private Button Z;
  private axq a;
  private Button aa;
  private boolean ab;
  private axd b;
  private ViewFlipper c;
  private RecyclerView d;
  
  private void r()
  {
    int j = 1;
    int i;
    if (this.b.c != null)
    {
      i = 1;
      if (!this.ab) {
        break label35;
      }
      this.c.setDisplayedChild(3);
    }
    label35:
    label87:
    for (;;)
    {
      return;
      i = 0;
      break;
      if (i == 0)
      {
        this.c.setDisplayedChild(2);
      }
      else
      {
        if (this.a.a() == 0) {}
        for (i = j;; i = 0)
        {
          if (this.c.getDisplayedChild() == i) {
            break label87;
          }
          this.c.setDisplayedChild(i);
          break;
        }
      }
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramViewGroup = paramLayoutInflater.inflate(a.fF, paramViewGroup, false);
    this.c = ((ViewFlipper)paramViewGroup.findViewById(f.K));
    this.d = ((RecyclerView)paramViewGroup.findViewById(f.ak));
    this.Z = ((Button)paramViewGroup.findViewById(f.bm));
    this.aa = ((Button)paramViewGroup.findViewById(f.eq));
    this.d.a(this.a);
    paramLayoutInflater = new xw(this.y);
    paramLayoutInflater.a(1);
    this.d.a(paramLayoutInflater);
    this.d.setLayoutAnimation(new LayoutAnimationController(AnimationUtils.loadAnimation(this.y, a.dg)));
    if (paramBundle != null) {
      this.ab = paramBundle.getBoolean("browseError");
    }
    int i = e().getDimensionPixelSize(a.ee);
    this.d.a(new awo(this, i));
    this.Z.setOnClickListener(new awp(this));
    this.aa.setOnClickListener(new awq(this));
    return paramViewGroup;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a = new axq(this.y, false);
  }
  
  public final void a(dau[] paramArrayOfdau) {}
  
  public final void a(dau[] paramArrayOfdau, int[] paramArrayOfInt)
  {
    if (this.a != null)
    {
      this.a.a(paramArrayOfdau, paramArrayOfInt);
      r();
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("browseError", this.ab);
  }
  
  public final void j()
  {
    super.j();
    this.ab = false;
    this.b = ((axm)this.y).g();
    axd localaxd = this.b;
    localaxd.g = this;
    if (localaxd.c != null) {
      a(localaxd.c.a, localaxd.e);
    }
    for (;;)
    {
      r();
      return;
      if (localaxd.j != null) {
        p();
      }
    }
  }
  
  public final void p()
  {
    this.ab = true;
    r();
  }
  
  public final void q() {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\awn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
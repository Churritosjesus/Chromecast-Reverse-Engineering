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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class baz
  extends j
  implements axn
{
  private RecyclerView Z;
  private axq a;
  private Button aa;
  private boolean ab;
  private axd b;
  private bcn c;
  private ViewFlipper d;
  
  private void r()
  {
    int i;
    if (this.b.d != null)
    {
      i = 1;
      if (!this.ab) {
        break label33;
      }
      this.d.setDisplayedChild(3);
    }
    for (;;)
    {
      return;
      i = 0;
      break;
      label33:
      if (i == 0) {
        this.d.setDisplayedChild(2);
      } else {
        this.d.setDisplayedChild(0);
      }
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.fF, paramViewGroup, false);
    this.d = ((ViewFlipper)paramLayoutInflater.findViewById(f.K));
    this.Z = ((RecyclerView)paramLayoutInflater.findViewById(f.ak));
    this.aa = ((Button)paramLayoutInflater.findViewById(f.eq));
    this.Z.a(this.a);
    paramViewGroup = new xw(this.y);
    paramViewGroup.a(1);
    this.Z.a(paramViewGroup);
    this.Z.setLayoutAnimation(new LayoutAnimationController(AnimationUtils.loadAnimation(this.y, a.dg)));
    if (paramBundle != null) {
      this.ab = paramBundle.getBoolean("getAppsError");
    }
    int i = e().getDimensionPixelSize(a.dJ);
    int j = e().getDimensionPixelSize(a.dE);
    this.Z.a(new bba(this, i, j));
    this.aa.setOnClickListener(new bbb(this));
    return paramLayoutInflater;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a = new axq(this.y, true);
  }
  
  public final void a(dau[] paramArrayOfdau)
  {
    if (this.a != null)
    {
      this.a.a(paramArrayOfdau, null);
      r();
    }
  }
  
  public final void a(dau[] paramArrayOfdau, int[] paramArrayOfInt) {}
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("getAppsError", this.ab);
  }
  
  public final void j()
  {
    super.j();
    this.ab = false;
    this.b = ((axm)this.y).g();
    Object localObject1 = this.b;
    ((axd)localObject1).h = this;
    if ((((axd)localObject1).d != null) && (this != null)) {
      a(((axd)localObject1).d.a);
    }
    for (;;)
    {
      this.c = ((axm)this.y).h();
      bcn localbcn = this.c;
      localObject1 = this.a;
      localbcn.e.add(localObject1);
      if (!localbcn.c.isEmpty())
      {
        localObject2 = new ArrayList(localbcn.c.size());
        ((List)localObject2).addAll(localbcn.c);
        Collections.sort((List)localObject2, bcn.a);
        ((bct)localObject1).a((List)localObject2);
      }
      localObject1 = this.a;
      localbcn = this.c;
      Object localObject2 = this.Z;
      ((axq)localObject1).e = localbcn;
      ((axq)localObject1).d = ((RecyclerView)localObject2);
      r();
      return;
      if (((axd)localObject1).k != null) {
        q();
      }
    }
  }
  
  public final void k()
  {
    super.k();
    this.c.e.remove(this);
    axq localaxq = this.a;
    localaxq.e = null;
    localaxq.d = null;
  }
  
  public final void p() {}
  
  public final void q()
  {
    this.ab = true;
    r();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\baz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class aj
  implements ViewTreeObserver.OnPreDrawListener
{
  aj(View paramView1, Transition paramTransition1, View paramView2, ArrayList paramArrayList1, Transition paramTransition2, ArrayList paramArrayList2, Transition paramTransition3, ArrayList paramArrayList3, Map paramMap, ArrayList paramArrayList4, Transition paramTransition4) {}
  
  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null)
    {
      this.b.removeTarget(this.c);
      a.a(this.b, this.d);
    }
    if (this.e != null) {
      a.a(this.e, this.f);
    }
    if (this.g != null) {
      a.a(this.g, this.h);
    }
    Iterator localIterator = this.i.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((View)localEntry.getValue()).setTransitionName((String)localEntry.getKey());
    }
    int n = this.j.size();
    for (int m = 0; m < n; m++) {
      this.k.excludeTarget((View)this.j.get(m), false);
    }
    this.k.excludeTarget(this.c, false);
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
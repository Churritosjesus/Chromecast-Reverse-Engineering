import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ah
  implements ViewTreeObserver.OnPreDrawListener
{
  ah(View paramView1, al paramal, Map paramMap1, Map paramMap2, Transition paramTransition, ArrayList paramArrayList, View paramView2) {}
  
  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    View localView = this.b.a();
    if (localView != null)
    {
      if (!this.c.isEmpty())
      {
        a.a(this.d, localView);
        this.d.keySet().retainAll(this.c.values());
        Iterator localIterator = this.c.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          Object localObject = (String)localEntry.getValue();
          localObject = (View)this.d.get(localObject);
          if (localObject != null) {
            ((View)localObject).setTransitionName((String)localEntry.getKey());
          }
        }
      }
      if (this.e != null)
      {
        a.a(this.f, localView);
        this.f.removeAll(this.d.values());
        this.f.add(this.g);
        this.e.removeTarget(this.g);
        a.b(this.e, this.f);
      }
    }
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
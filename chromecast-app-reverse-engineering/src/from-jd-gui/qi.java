import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class qi
  extends FrameLayout
  implements vt
{
  final CollapsibleActionView a;
  
  qi(View paramView)
  {
    super(paramView.getContext());
    this.a = ((CollapsibleActionView)paramView);
    addView(paramView);
  }
  
  public final void a()
  {
    this.a.onActionViewExpanded();
  }
  
  public final void b()
  {
    this.a.onActionViewCollapsed();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
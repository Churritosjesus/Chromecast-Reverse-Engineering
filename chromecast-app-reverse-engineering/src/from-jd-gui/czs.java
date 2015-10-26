import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;

public final class czs
  implements View.OnAttachStateChangeListener
{
  public czs(PagingIndicator paramPagingIndicator) {}
  
  public final void onViewAttachedToWindow(View paramView)
  {
    PagingIndicator.a(this.a, true);
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    PagingIndicator.a(this.a, false);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
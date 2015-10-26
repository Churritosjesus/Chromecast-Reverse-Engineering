import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.View.OnFocusChangeListener;

public final class aad
  implements View.OnFocusChangeListener
{
  public aad(SearchView paramSearchView) {}
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (SearchView.c(this.a) != null) {
      SearchView.c(this.a).onFocusChange(this.a, paramBoolean);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
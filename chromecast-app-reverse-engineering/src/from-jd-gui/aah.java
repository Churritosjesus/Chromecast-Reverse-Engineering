import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

public final class aah
  implements View.OnKeyListener
{
  public aah(SearchView paramSearchView) {}
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    boolean bool1;
    if (SearchView.o(this.a) == null) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      if ((SearchView.m(this.a).isPopupShowing()) && (SearchView.m(this.a).getListSelection() != -1))
      {
        bool1 = SearchView.a(this.a, paramView, paramInt, paramKeyEvent);
      }
      else
      {
        bool1 = bool2;
        if (!SearchView.SearchAutoComplete.a(SearchView.m(this.a)))
        {
          bool1 = bool2;
          if (fi.a(paramKeyEvent))
          {
            bool1 = bool2;
            if (paramKeyEvent.getAction() == 1)
            {
              bool1 = bool2;
              if (paramInt == 66)
              {
                paramView.cancelLongPress();
                SearchView.a(this.a, 0, null, SearchView.m(this.a).getText().toString());
                bool1 = true;
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
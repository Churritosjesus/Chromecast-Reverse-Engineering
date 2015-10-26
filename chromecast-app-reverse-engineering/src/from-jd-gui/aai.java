import android.support.v7.widget.SearchView;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public final class aai
  implements TextView.OnEditorActionListener
{
  public aai(SearchView paramSearchView) {}
  
  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    SearchView.j(this.a);
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
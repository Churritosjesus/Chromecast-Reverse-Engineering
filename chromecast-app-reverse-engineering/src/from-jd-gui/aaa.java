import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;

public final class aaa
  implements TextWatcher
{
  public aaa(SearchView paramSearchView) {}
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    SearchView.a(this.a, paramCharSequence);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
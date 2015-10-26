import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.MultiAutoCompleteTextView.Tokenizer;

final class acw
  implements TextWatcher
{
  acw(acb paramacb) {}
  
  public final void afterTextChanged(Editable paramEditable)
  {
    int i = 0;
    int j;
    if (TextUtils.isEmpty(paramEditable))
    {
      paramEditable = this.a.getText();
      ada[] arrayOfada = (ada[])paramEditable.getSpans(0, this.a.getText().length(), ada.class);
      j = arrayOfada.length;
      while (i < j)
      {
        paramEditable.removeSpan(arrayOfada[i]);
        i++;
      }
      if (acb.o(this.a) != null) {
        paramEditable.removeSpan(acb.o(this.a));
      }
      this.a.d();
    }
    label212:
    label326:
    label339:
    label349:
    for (;;)
    {
      return;
      if (!acb.p(this.a))
      {
        if (acb.d(this.a) != null)
        {
          if (this.a.a(acb.d(this.a))) {
            continue;
          }
          this.a.setCursorVisible(true);
          this.a.setSelection(this.a.getText().length());
          this.a.d();
        }
        if (paramEditable.length() <= 1) {
          continue;
        }
        if (this.a.a(paramEditable))
        {
          acb.q(this.a);
          continue;
        }
        if (this.a.getSelectionEnd() != 0) {
          break label326;
        }
        i = 0;
        j = this.a.length() - 1;
        if (i == j) {
          break label339;
        }
      }
      for (i = paramEditable.charAt(i);; i = paramEditable.charAt(j))
      {
        if ((i != 32) || (this.a.f())) {
          break label349;
        }
        paramEditable = this.a.getText().toString();
        i = acb.r(this.a).findTokenStart(paramEditable, this.a.getSelectionEnd());
        paramEditable = paramEditable.substring(i, acb.r(this.a).findTokenEnd(paramEditable, i));
        if (!acb.b(this.a, paramEditable)) {
          break;
        }
        acb.q(this.a);
        break;
        break;
        i = this.a.getSelectionEnd() - 1;
        break label212;
      }
    }
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 - paramInt3 == 1)
    {
      paramInt1 = this.a.getSelectionStart();
      paramCharSequence = (ada[])this.a.getText().getSpans(paramInt1, paramInt1, ada.class);
      if (paramCharSequence.length > 0)
      {
        Object localObject = paramCharSequence[0];
        paramCharSequence = this.a.getText();
        paramInt3 = paramCharSequence.getSpanStart(localObject);
        paramInt2 = paramCharSequence.getSpanEnd(localObject) + 1;
        paramInt1 = paramInt2;
        if (paramInt2 > paramCharSequence.length()) {
          paramInt1 = paramCharSequence.length();
        }
        paramCharSequence.removeSpan(localObject);
        paramCharSequence.delete(paramInt3, paramInt1);
      }
    }
    for (;;)
    {
      return;
      if ((paramInt3 > paramInt2) && (acb.d(this.a) != null) && (this.a.a(acb.d(this.a))) && (this.a.a(paramCharSequence))) {
        acb.q(this.a);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\acw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
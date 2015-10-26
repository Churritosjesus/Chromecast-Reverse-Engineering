import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Iterator;
import java.util.List;

final class acv
  implements Runnable
{
  acv(act paramact, List paramList1, List paramList2) {}
  
  public final void run()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(this.c.a.getText());
    Iterator localIterator = this.a.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      ada localada2 = (ada)localIterator.next();
      ada localada1 = (ada)this.b.get(i);
      Object localObject;
      if (localada1 != null)
      {
        localObject = localada2.g();
        acx localacx = localada1.g();
        if (aby.a((acx)localObject, localacx) != localacx) {
          break label260;
        }
      }
      label260:
      for (int j = 1;; j = 0)
      {
        if (j != 0)
        {
          j = localSpannableStringBuilder.getSpanStart(localada2);
          if (j != -1)
          {
            int k = Math.min(localSpannableStringBuilder.getSpanEnd(localada2) + 1, localSpannableStringBuilder.length());
            localSpannableStringBuilder.removeSpan(localada2);
            localObject = new SpannableString(String.valueOf(this.c.a.a(localada1.g()).trim()).concat(" "));
            ((SpannableString)localObject).setSpan(localada1, 0, ((SpannableString)localObject).length() - 1, 33);
            localSpannableStringBuilder.replace(j, k, (CharSequence)localObject);
            localada1.a(((SpannableString)localObject).toString());
            this.b.set(i, null);
            this.a.set(i, localada1);
          }
        }
        i++;
        break;
      }
    }
    this.c.a.setText(localSpannableStringBuilder);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\acv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
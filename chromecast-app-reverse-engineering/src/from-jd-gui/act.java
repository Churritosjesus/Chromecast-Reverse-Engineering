import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class act
  extends AsyncTask
{
  act(acb paramacb) {}
  
  private ada a(acx paramacx)
  {
    localObject = null;
    for (;;)
    {
      try
      {
        if (!acb.s(this.a)) {
          continue;
        }
        paramacx = (acx)localObject;
      }
      catch (NullPointerException paramacx)
      {
        Log.e("RecipientEditTextView", paramacx.getMessage(), paramacx);
        paramacx = (acx)localObject;
        continue;
      }
      return paramacx;
      paramacx = acb.a(this.a, paramacx);
    }
  }
  
  private void a(List paramList1, List paramList2)
  {
    if ((paramList2 != null) && (paramList2.size() > 0))
    {
      paramList1 = new acv(this, paramList1, paramList2);
      if (Looper.myLooper() != Looper.getMainLooper()) {
        break label40;
      }
      paramList1.run();
    }
    for (;;)
    {
      return;
      label40:
      acb.e(this.a).post(paramList1);
    }
  }
  
  protected final void onPreExecute()
  {
    ArrayList localArrayList1 = new ArrayList();
    Collections.addAll(localArrayList1, this.a.e());
    if (acb.t(this.a) != null) {
      localArrayList1.addAll(acb.t(this.a));
    }
    ArrayList localArrayList2 = new ArrayList(localArrayList1.size());
    Iterator localIterator = localArrayList1.iterator();
    while (localIterator.hasNext())
    {
      ada localada = (ada)localIterator.next();
      if ((acx.a(localada.g().g)) && (this.a.getText().getSpanStart(localada) != -1)) {
        localArrayList2.add(a(localada.g()));
      } else {
        localArrayList2.add(null);
      }
    }
    a(localArrayList1, localArrayList2);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\act.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
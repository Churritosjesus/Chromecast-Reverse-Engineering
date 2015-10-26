import android.os.Handler;
import android.text.Spannable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class acq
  implements aca
{
  acq(acp paramacp, ArrayList paramArrayList) {}
  
  public final void a(Map paramMap)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      ada localada = (ada)localIterator.next();
      if ((acx.a(localada.g().g)) && (this.a.a.getText().getSpanStart(localada) != -1))
      {
        acx localacx = acb.b(this.a.a, (acx)paramMap.get(acb.a(localada.g().d).toLowerCase()));
        if (localacx != null) {
          acb.e(this.a.a).post(new acr(this, localada, localacx));
        }
      }
    }
  }
  
  public final void a(Set paramSet) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\acq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
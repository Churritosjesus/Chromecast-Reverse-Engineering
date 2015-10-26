import android.text.Spannable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class acu
  implements aca
{
  acu(act paramact, ArrayList paramArrayList) {}
  
  public final void a(Map paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.a.iterator();
    if (localIterator.hasNext())
    {
      localObject = (ada)localIterator.next();
      if ((localObject == null) || (!acx.a(((ada)localObject).g().g)) || (this.b.a.getText().getSpanStart(localObject) == -1)) {
        break label152;
      }
    }
    label152:
    for (Object localObject = acb.b(this.b.a, (acx)paramMap.get(acb.a(((ada)localObject).g().d)));; localObject = null)
    {
      if (localObject != null)
      {
        localArrayList.add(act.a(this.b, (acx)localObject));
        break;
      }
      localArrayList.add(null);
      break;
      act.a(this.b, this.a, localArrayList);
      return;
    }
  }
  
  public final void a(Set paramSet)
  {
    ArrayList localArrayList = new ArrayList(paramSet.size());
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      ada localada = (ada)localIterator.next();
      if ((localada != null) && (acx.a(localada.g().g)) && (this.b.a.getText().getSpanStart(localada) != -1))
      {
        if (paramSet.contains(localada.g().d)) {
          localArrayList.add(act.a(this.b, localada.g()));
        } else {
          localArrayList.add(null);
        }
      }
      else {
        localArrayList.add(null);
      }
    }
    act.a(this.b, this.a, localArrayList);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\acu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
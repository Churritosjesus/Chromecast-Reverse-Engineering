import android.database.Cursor;
import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.Iterator;

public final class aaz
  extends Filter
{
  private final abb a;
  private int b;
  
  public aaz(aav paramaav, abb paramabb)
  {
    this.a = paramabb;
  }
  
  private int a()
  {
    try
    {
      int i = this.b;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(int paramInt)
  {
    try
    {
      this.b = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    CharSequence localCharSequence = null;
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    localFilterResults.values = null;
    localFilterResults.count = 0;
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      ArrayList localArrayList = new ArrayList();
      try
      {
        paramCharSequence = aav.a(this.c, paramCharSequence, a(), Long.valueOf(this.a.a));
        if (paramCharSequence != null) {
          for (;;)
          {
            localCharSequence = paramCharSequence;
            if (!paramCharSequence.moveToNext()) {
              break;
            }
            localCharSequence = paramCharSequence;
            abd localabd = new abd;
            localCharSequence = paramCharSequence;
            localabd.<init>(paramCharSequence, Long.valueOf(this.a.a));
            localCharSequence = paramCharSequence;
            localArrayList.add(localabd);
          }
        }
        if (paramCharSequence == null) {
          break label136;
        }
      }
      finally
      {
        if (localCharSequence != null) {
          localCharSequence.close();
        }
      }
      paramCharSequence.close();
      label136:
      if (!localArrayList.isEmpty())
      {
        localFilterResults.values = localArrayList;
        localFilterResults.count = localArrayList.size();
      }
    }
    return localFilterResults;
  }
  
  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    aav.c(this.c).removeMessages(1);
    if (TextUtils.equals(paramCharSequence, this.c.j))
    {
      if (paramFilterResults.count > 0)
      {
        Iterator localIterator = ((ArrayList)paramFilterResults.values).iterator();
        if (localIterator.hasNext())
        {
          paramCharSequence = (abd)localIterator.next();
          aav localaav = this.c;
          if (this.a.a == 0L) {}
          for (boolean bool = true;; bool = false)
          {
            aav.a(paramCharSequence, bool, localaav.e, localaav.f, localaav.g);
            break;
          }
        }
      }
      aav.d(this.c);
      if (aav.e(this.c) > 0) {
        aav.c(this.c).a();
      }
      if ((paramFilterResults.count > 0) || (aav.e(this.c) == 0)) {
        this.c.h = null;
      }
    }
    this.c.a(this.c.a());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
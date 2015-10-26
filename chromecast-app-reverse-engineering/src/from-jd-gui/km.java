import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class km
  extends Filter
{
  private kn a;
  
  km(kn paramkn)
  {
    this.a = paramkn;
  }
  
  public final CharSequence convertResultToString(Object paramObject)
  {
    return this.a.b((Cursor)paramObject);
  }
  
  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    paramCharSequence = this.a.a(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (paramCharSequence != null) {
      localFilterResults.count = paramCharSequence.getCount();
    }
    for (localFilterResults.values = paramCharSequence;; localFilterResults.values = null)
    {
      return localFilterResults;
      localFilterResults.count = 0;
    }
  }
  
  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = this.a.a();
    if ((paramFilterResults.values != null) && (paramFilterResults.values != paramCharSequence)) {
      this.a.a((Cursor)paramFilterResults.values);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\km.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
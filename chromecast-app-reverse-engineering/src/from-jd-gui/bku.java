import java.util.Iterator;

final class bku
{
  private final String a;
  
  bku(String paramString)
  {
    this.a = paramString;
  }
  
  private static CharSequence a(Object paramObject)
  {
    if ((paramObject instanceof CharSequence)) {}
    for (paramObject = (CharSequence)paramObject;; paramObject = paramObject.toString()) {
      return (CharSequence)paramObject;
    }
  }
  
  public final StringBuilder a(StringBuilder paramStringBuilder, Iterable paramIterable)
  {
    paramIterable = paramIterable.iterator();
    if (paramIterable.hasNext())
    {
      paramStringBuilder.append(a(paramIterable.next()));
      while (paramIterable.hasNext())
      {
        paramStringBuilder.append(this.a);
        paramStringBuilder.append(a(paramIterable.next()));
      }
    }
    return paramStringBuilder;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
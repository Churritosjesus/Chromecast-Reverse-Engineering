public class px
{
  public final Object d;
  
  px(Object paramObject)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    this.d = paramObject;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\px.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
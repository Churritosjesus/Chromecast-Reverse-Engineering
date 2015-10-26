public class afq
  extends RuntimeException
{
  static final long serialVersionUID = 1L;
  
  public afq() {}
  
  public afq(String paramString)
  {
    super(paramString);
  }
  
  public afq(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public afq(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
  
  public String toString()
  {
    return getMessage();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\afq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
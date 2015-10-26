public abstract class dgj
  implements Runnable
{
  private String a;
  
  public dgj(String paramString, Object... paramVarArgs)
  {
    this.a = String.format(paramString, paramVarArgs);
  }
  
  public abstract void a();
  
  public final void run()
  {
    String str = Thread.currentThread().getName();
    Thread.currentThread().setName(this.a);
    try
    {
      a();
      return;
    }
    finally
    {
      Thread.currentThread().setName(str);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
public final class afp
  extends afq
{
  static final long serialVersionUID = 1L;
  private int a;
  private String b;
  
  public afp(String paramString1, int paramInt, String paramString2)
  {
    super(paramString1);
    this.a = paramInt;
    this.b = paramString2;
  }
  
  public final String toString()
  {
    return "{FacebookDialogException: " + "errorCode: " + this.a + ", message: " + getMessage() + ", url: " + this.b + "}";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\afp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
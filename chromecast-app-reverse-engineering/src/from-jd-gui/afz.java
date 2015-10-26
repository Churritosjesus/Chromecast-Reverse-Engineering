public final class afz
  extends afq
{
  private static final long serialVersionUID = 1L;
  public final afs a;
  
  public afz(afs paramafs, String paramString)
  {
    super(paramString);
    this.a = paramafs;
  }
  
  public final String toString()
  {
    return "{FacebookServiceException: " + "httpResponseCode: " + this.a.a + ", facebookErrorCode: " + this.a.b + ", facebookErrorType: " + this.a.c + ", message: " + this.a.a() + "}";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\afz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import java.util.List;
import java.util.concurrent.ExecutorService;

final class cth
  extends csz
{
  private final clt a;
  private final ExecutorService b;
  
  public cth(clt paramclt, ExecutorService paramExecutorService)
  {
    this.a = paramclt;
    this.b = paramExecutorService;
  }
  
  public final void a(String paramString1, String paramString2, ctd paramctd)
  {
    this.b.submit(new ctj(this, paramString1, paramString2, paramctd));
  }
  
  public final void a(String paramString, List paramList, ctd paramctd)
  {
    this.b.submit(new cti(this, paramList, paramString, paramctd));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
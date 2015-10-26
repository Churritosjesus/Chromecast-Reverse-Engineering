import com.google.android.gms.common.api.GoogleApiClient;

final class aqp
  implements Runnable
{
  aqp(aqj paramaqj, boolean paramBoolean) {}
  
  public final void run()
  {
    btl localbtl;
    if (this.a)
    {
      localbtl = aqj.c(this.b);
      localObject = this.b.a;
    }
    for (Object localObject = ((GoogleApiClient)localObject).b(new btp(localbtl, (GoogleApiClient)localObject, (GoogleApiClient)localObject, null));; localObject = ((GoogleApiClient)localObject).b(new bto(localbtl, (GoogleApiClient)localObject, (GoogleApiClient)localObject, null)))
    {
      ((bwj)localObject).a(new aqq(this));
      return;
      localbtl = aqj.c(this.b);
      localObject = this.b.a;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
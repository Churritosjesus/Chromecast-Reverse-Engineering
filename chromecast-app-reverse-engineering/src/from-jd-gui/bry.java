public class bry
{
  final brb a;
  final bsh b;
  
  public bry(brb parambrb)
  {
    this.a = parambrb;
    this.b = new bsh();
  }
  
  public void a(String paramString, int paramInt)
  {
    if ("ga_dispatchPeriod".equals(paramString)) {
      this.b.d = paramInt;
    }
    for (;;)
    {
      return;
      this.a.a().d("Int xml configuration name not recognized", paramString);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ("ga_appName".equals(paramString1)) {
      this.b.a = paramString2;
    }
    for (;;)
    {
      return;
      if ("ga_appVersion".equals(paramString1)) {
        this.b.b = paramString2;
      } else if ("ga_logLevel".equals(paramString1)) {
        this.b.c = paramString2;
      } else {
        this.a.a().d("String xml configuration name not recognized", paramString1);
      }
    }
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    int i;
    if ("ga_dryRun".equals(paramString))
    {
      paramString = this.b;
      if (paramBoolean)
      {
        i = 1;
        paramString.e = i;
      }
    }
    for (;;)
    {
      return;
      i = 0;
      break;
      this.a.a().d("Bool xml configuration name not recognized", paramString);
    }
  }
  
  public bsh b()
  {
    return this.b;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
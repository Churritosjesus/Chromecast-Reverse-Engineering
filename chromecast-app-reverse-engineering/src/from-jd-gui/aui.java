import java.util.Locale;

public final class aui
  extends att
{
  private final aea n;
  private final String o;
  
  public aui(String paramString1, String paramString2, String paramString3, aea paramaea)
  {
    super("LoadCardDataRequest", asr.a(paramString1, String.format(Locale.US, "/gsse?rt=b&hl=%s", new Object[] { blj.c() })), ((dcs)dcs.b().b(paramString3).a("E8C28D3C").c()).e(), new auj());
    this.n = paramaea;
    this.o = paramString2;
  }
  
  public final String g()
  {
    return null;
  }
  
  public final String h()
  {
    return this.o;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
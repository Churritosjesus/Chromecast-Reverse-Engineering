import java.util.Locale;

public final class ec
{
  private static Locale a = new Locale("", "");
  private static String b = "Arab";
  private static String c = "Hebr";
  
  public static int a(Locale paramLocale)
  {
    int j = 1;
    String str;
    int i;
    if ((paramLocale != null) && (!paramLocale.equals(a)))
    {
      str = dx.a(dx.b(paramLocale.toString()));
      if (str == null)
      {
        i = j;
        switch (Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0)))
        {
        default: 
          i = 0;
        }
      }
    }
    for (;;)
    {
      return i;
      i = j;
      if (!str.equalsIgnoreCase(b))
      {
        i = j;
        if (!str.equalsIgnoreCase(c)) {
          i = 0;
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
public enum dco
{
  final int d;
  
  static
  {
    a = new dco("PRIMARY", 1, 1);
    b = new dco("SECONDARY", 2, 2);
    f = new dco("PERSONALIZED", 3, 3);
    c = new dco("PERSONALIZATION_FLOW", 4, 4);
    g = new dco[] { e, a, b, f, c };
    new dcp();
  }
  
  private dco(int paramInt1)
  {
    this.d = paramInt1;
  }
  
  public static dco a(int paramInt)
  {
    dco localdco;
    switch (paramInt)
    {
    default: 
      localdco = null;
    }
    for (;;)
    {
      return localdco;
      localdco = e;
      continue;
      localdco = a;
      continue;
      localdco = b;
      continue;
      localdco = f;
      continue;
      localdco = c;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
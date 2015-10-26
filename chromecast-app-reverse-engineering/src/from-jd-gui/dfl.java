public final class dfl
{
  boolean a;
  String[] b;
  String[] c;
  boolean d;
  
  public dfl(dfk paramdfk)
  {
    this.a = paramdfk.d;
    this.b = dfk.a(paramdfk);
    this.c = dfk.b(paramdfk);
    this.d = paramdfk.g;
  }
  
  dfl(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public final dfk a()
  {
    return new dfk(this);
  }
  
  public final dfl a(boolean paramBoolean)
  {
    if (!this.a) {
      throw new IllegalStateException("no TLS extensions for cleartext connections");
    }
    this.d = true;
    return this;
  }
  
  public final dfl a(dgg... paramVarArgs)
  {
    if (!this.a) {
      throw new IllegalStateException("no TLS versions for cleartext connections");
    }
    if (paramVarArgs.length == 0) {
      throw new IllegalArgumentException("At least one TlsVersion is required");
    }
    String[] arrayOfString = new String[paramVarArgs.length];
    for (int i = 0; i < paramVarArgs.length; i++) {
      arrayOfString[i] = paramVarArgs[i].d;
    }
    this.c = arrayOfString;
    return this;
  }
  
  public final dfl a(String... paramVarArgs)
  {
    if (!this.a) {
      throw new IllegalStateException("no cipher suites for cleartext connections");
    }
    if (paramVarArgs == null) {}
    for (this.b = null;; this.b = ((String[])paramVarArgs.clone())) {
      return this;
    }
  }
  
  public final dfl b(String... paramVarArgs)
  {
    if (!this.a) {
      throw new IllegalStateException("no TLS versions for cleartext connections");
    }
    if (paramVarArgs == null) {}
    for (this.c = null;; this.c = ((String[])paramVarArgs.clone())) {
      return this;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
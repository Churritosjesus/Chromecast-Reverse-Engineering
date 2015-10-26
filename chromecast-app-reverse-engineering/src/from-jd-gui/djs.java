import javax.security.auth.x500.X500Principal;

final class djs
{
  final String a;
  final int b;
  int c;
  int d;
  int e;
  int f;
  char[] g;
  
  public djs(X500Principal paramX500Principal)
  {
    this.a = paramX500Principal.getName("RFC2253");
    this.b = this.a.length();
  }
  
  private int a(int paramInt)
  {
    if (paramInt + 1 >= this.b) {
      throw new IllegalStateException("Malformed DN: " + this.a);
    }
    int i = this.g[paramInt];
    if ((i >= 48) && (i <= 57))
    {
      i -= 48;
      paramInt = this.g[(paramInt + 1)];
      if ((paramInt < 48) || (paramInt > 57)) {
        break label152;
      }
      paramInt -= 48;
    }
    for (;;)
    {
      return (i << 4) + paramInt;
      if ((i >= 97) && (i <= 102))
      {
        i -= 87;
        break;
      }
      if ((i >= 65) && (i <= 70))
      {
        i -= 55;
        break;
      }
      throw new IllegalStateException("Malformed DN: " + this.a);
      label152:
      if ((paramInt >= 97) && (paramInt <= 102))
      {
        paramInt -= 87;
      }
      else
      {
        if ((paramInt < 65) || (paramInt > 70)) {
          break label188;
        }
        paramInt -= 55;
      }
    }
    label188:
    throw new IllegalStateException("Malformed DN: " + this.a);
  }
  
  private char e()
  {
    int i = a(this.c);
    this.c += 1;
    char c1;
    if (i < 128) {
      c1 = (char)i;
    }
    for (;;)
    {
      return c1;
      if ((i >= 192) && (i <= 247))
      {
        int j;
        label59:
        int m;
        int k;
        if (i <= 223)
        {
          j = 1;
          i &= 0x1F;
          m = 0;
          k = i;
        }
        for (i = m;; i++)
        {
          if (i >= j) {
            break label208;
          }
          this.c += 1;
          if ((this.c == this.b) || (this.g[this.c] != '\\'))
          {
            c1 = '?';
            break;
            if (i <= 239)
            {
              j = 2;
              i &= 0xF;
              break label59;
            }
            j = 3;
            i &= 0x7;
            break label59;
          }
          this.c += 1;
          m = a(this.c);
          this.c += 1;
          if ((m & 0xC0) != 128)
          {
            c1 = '?';
            break;
          }
          k = (k << 6) + (m & 0x3F);
        }
        label208:
        c1 = (char)k;
      }
      else
      {
        c1 = '?';
      }
    }
  }
  
  String a()
  {
    while ((this.c < this.b) && (this.g[this.c] == ' ')) {
      this.c += 1;
    }
    if (this.c == this.b) {}
    for (String str = null;; str = new String(this.g, this.d, this.e - this.d))
    {
      return str;
      this.d = this.c;
      for (this.c += 1; (this.c < this.b) && (this.g[this.c] != '=') && (this.g[this.c] != ' '); this.c += 1) {}
      if (this.c >= this.b) {
        throw new IllegalStateException("Unexpected end of DN: " + this.a);
      }
      this.e = this.c;
      if (this.g[this.c] == ' ')
      {
        while ((this.c < this.b) && (this.g[this.c] != '=') && (this.g[this.c] == ' ')) {
          this.c += 1;
        }
        if ((this.g[this.c] != '=') || (this.c == this.b)) {
          throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
      }
      do
      {
        this.c += 1;
      } while ((this.c < this.b) && (this.g[this.c] == ' '));
      if ((this.e - this.d > 4) && (this.g[(this.d + 3)] == '.') && ((this.g[this.d] == 'O') || (this.g[this.d] == 'o')) && ((this.g[(this.d + 1)] == 'I') || (this.g[(this.d + 1)] == 'i')) && ((this.g[(this.d + 2)] == 'D') || (this.g[(this.d + 2)] == 'd'))) {
        this.d += 4;
      }
    }
  }
  
  String b()
  {
    if (this.c + 4 >= this.b) {
      throw new IllegalStateException("Unexpected end of DN: " + this.a);
    }
    this.d = this.c;
    int k;
    for (this.c += 1;; this.c += 1)
    {
      if ((this.c == this.b) || (this.g[this.c] == '+') || (this.g[this.c] == ',') || (this.g[this.c] == ';')) {
        this.e = this.c;
      }
      for (;;)
      {
        k = this.e - this.d;
        if ((k >= 5) && ((k & 0x1) != 0)) {
          break label301;
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.a);
        if (this.g[this.c] != ' ') {
          break;
        }
        this.e = this.c;
        for (this.c += 1; (this.c < this.b) && (this.g[this.c] == ' '); this.c += 1) {}
      }
      if ((this.g[this.c] >= 'A') && (this.g[this.c] <= 'F'))
      {
        localObject = this.g;
        i = this.c;
        localObject[i] = ((char)(localObject[i] + ' '));
      }
    }
    label301:
    Object localObject = new byte[k / 2];
    int i = 0;
    int j = this.d + 1;
    while (i < localObject.length)
    {
      localObject[i] = ((byte)a(j));
      j += 2;
      i++;
    }
    return new String(this.g, this.d, k);
  }
  
  String c()
  {
    this.d = this.c;
    this.e = this.c;
    Object localObject;
    if (this.c >= this.b) {
      localObject = new String(this.g, this.d, this.e - this.d);
    }
    for (;;)
    {
      return (String)localObject;
      int i;
      switch (this.g[this.c])
      {
      default: 
        localObject = this.g;
        i = this.e;
        this.e = (i + 1);
        localObject[i] = this.g[this.c];
        this.c += 1;
        break;
      case '+': 
      case ',': 
      case ';': 
        localObject = new String(this.g, this.d, this.e - this.d);
        break;
      case '\\': 
        localObject = this.g;
        i = this.e;
        this.e = (i + 1);
        localObject[i] = d();
        this.c += 1;
        break;
      case ' ': 
        this.f = this.e;
        this.c += 1;
        localObject = this.g;
        i = this.e;
        this.e = (i + 1);
        localObject[i] = 32;
        while ((this.c < this.b) && (this.g[this.c] == ' '))
        {
          localObject = this.g;
          i = this.e;
          this.e = (i + 1);
          localObject[i] = 32;
          this.c += 1;
        }
        if ((this.c != this.b) && (this.g[this.c] != ',') && (this.g[this.c] != '+') && (this.g[this.c] != ';')) {
          break;
        }
        localObject = new String(this.g, this.d, this.f - this.d);
      }
    }
  }
  
  char d()
  {
    this.c += 1;
    if (this.c == this.b) {
      throw new IllegalStateException("Unexpected end of DN: " + this.a);
    }
    switch (this.g[this.c])
    {
    }
    for (char c1 = e();; c1 = this.g[this.c]) {
      return c1;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
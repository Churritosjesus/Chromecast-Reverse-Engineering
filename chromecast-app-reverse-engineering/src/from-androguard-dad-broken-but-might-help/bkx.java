	private synthetic bkw c
	
	    bkx(bkw p1, bkv p2, CharSequence p3)
	    {
	        this.c = p1;
	        this(p2, p3);
	        return;
	    }
	
	
	    public final int a(int p7)
	    {
	        int v2 = this.c.a.length();
	        int v3 = (this.b.length() - v2);
	        int v0_4 = p7;
	        while (v0_4 <= v3) {
	            int v1 = 0;
	            while (v1 < v2) {
	                if (this.b.charAt((v1 + v0_4)) != this.c.a.charAt(v1)) {
	                    v0_4++;
	                } else {
	                    v1++;
	                }
	            }
	            return v0_4;
	        }
	        v0_4 = -1;
	        return v0_4;
	    }
	
	
	    public final int b(int p2)
	    {
	        return (this.c.a.length() + p2);
	    }
	

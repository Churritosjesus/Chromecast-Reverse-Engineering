	final java.lang.CharSequence b
	private  c
	private  d
	
	    protected blb(bkv p2, CharSequence p3)
	    {
	        this.d = 0;
	        this.c = p2.a;
	        this.b = p3;
	        return;
	    }
	
	
	    protected final synthetic Object a()
	    {
	        while (this.d != -1) {
	            int v1 = this.d;
	            String v0_4 = this.a(this.d);
	            if (v0_4 != -1) {
	                this.d = this.b(v0_4);
	            } else {
	                v0_4 = this.b.length();
	                this.d = -1;
	            }
	            if ((!this.c) || (v1 != v0_4)) {
	                String v0_2 = this.b.subSequence(v1, v0_4).toString();
	            }
	            return v0_2;
	        }
	        this.a = bla.c;
	        v0_2 = 0;
	        return v0_2;
	    }
	

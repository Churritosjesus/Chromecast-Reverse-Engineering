	private static final  serialVersionUID
	final java.lang.String a
	final java.lang.String b
	
	    ahk(afb p3)
	    {
	        this(p3.d, afv.h());
	        return;
	    }
	
	
	    ahk(String p2, String p3)
	    {
	        if (aji.a(p2)) {
	            p2 = 0;
	        }
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    private Object writeReplace()
	    {
	        return new ahl(this.a, this.b);
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        int v0 = 0;
	        if (((p4 instanceof ahk)) && ((aji.a(((ahk) p4).a, this.a)) && (aji.a(((ahk) p4).b, this.b)))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_2;
	        int v1_0 = 0;
	        if (this.a != null) {
	            v0_2 = this.a.hashCode();
	        } else {
	            v0_2 = 0;
	        }
	        if (this.b != null) {
	            v1_0 = this.b.hashCode();
	        }
	        return (v0_2 ^ v1_0);
	    }
	

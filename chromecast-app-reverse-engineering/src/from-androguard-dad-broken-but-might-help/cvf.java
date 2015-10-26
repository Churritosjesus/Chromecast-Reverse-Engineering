	final java.util.Set a
	private final java.lang.String b
	
	    public varargs cvf(String p5, String[] p6)
	    {
	        this.b = p5;
	        this.a = new java.util.HashSet(p6.length);
	        int v1_1 = p6.length;
	        int v0_2 = 0;
	        while (v0_2 < v1_1) {
	            this.a.add(p6[v0_2]);
	            v0_2++;
	        }
	        return;
	    }
	
	
	    public java.util.Set b()
	    {
	        return this.a;
	    }
	
	
	    public String c()
	    {
	        return this.b;
	    }
	

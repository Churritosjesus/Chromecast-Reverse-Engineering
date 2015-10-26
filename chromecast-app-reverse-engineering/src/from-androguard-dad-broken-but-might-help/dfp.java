	public final java.util.List a
	
	    public dfp()
	    {
	        this.a = new java.util.ArrayList(20);
	        return;
	    }
	
	
	    public final dfo a()
	    {
	        return new dfo(this);
	    }
	
	
	    public final dfp a(String p3)
	    {
	        int v1 = 0;
	        while (v1 < this.a.size()) {
	            if (p3.equalsIgnoreCase(((String) this.a.get(v1)))) {
	                this.a.remove(v1);
	                this.a.remove(v1);
	                v1 -= 2;
	            }
	            v1 += 2;
	        }
	        return this;
	    }
	
	
	    public final dfp a(String p4, String p5)
	    {
	        if (p4 != null) {
	            if (p5 != null) {
	                if ((p4.length() != 0) && ((p4.indexOf(0) == -1) && (p5.indexOf(0) == -1))) {
	                    return this.b(p4, p5);
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder("Unexpected header: ").append(p4).append(": ").append(p5).toString());
	                }
	            } else {
	                throw new IllegalArgumentException("value == null");
	            }
	        } else {
	            throw new IllegalArgumentException("name == null");
	        }
	    }
	
	
	    final dfp b(String p3, String p4)
	    {
	        this.a.add(p3);
	        this.a.add(p4.trim());
	        return this;
	    }
	
	
	    public final dfp c(String p1, String p2)
	    {
	        this.a(p1);
	        this.a(p1, p2);
	        return this;
	    }
	

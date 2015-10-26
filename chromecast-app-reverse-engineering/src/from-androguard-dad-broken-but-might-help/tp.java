	final android.os.Bundle a
	private tx b
	
	    public tp(tx p4, boolean p5)
	    {
	        if (p4 != null) {
	            this.a = new android.os.Bundle();
	            this.b = p4;
	            this.a.putBundle("selector", p4.a);
	            this.a.putBoolean("activeScan", p5);
	            return;
	        } else {
	            throw new IllegalArgumentException("selector must not be null");
	        }
	    }
	
	
	    private void c()
	    {
	        if (this.b == null) {
	            this.b = tx.a(this.a.getBundle("selector"));
	            if (this.b == null) {
	                this.b = tx.c;
	            }
	        }
	        return;
	    }
	
	
	    public final tx a()
	    {
	        this.c();
	        return this.b;
	    }
	
	
	    public final boolean b()
	    {
	        return this.a.getBoolean("activeScan");
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        int v0 = 0;
	        if (((p4 instanceof tp)) && ((this.a().equals(((tp) p4).a())) && (this.b() == ((tp) p4).b()))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_2;
	        int v1 = this.a().hashCode();
	        if (!this.b()) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return (v0_2 ^ v1);
	    }
	
	
	    public final String toString()
	    {
	        String v0_8;
	        StringBuilder v1_1 = new StringBuilder();
	        v1_1.append("DiscoveryRequest{ selector=").append(this.a());
	        v1_1.append(", activeScan=").append(this.b());
	        StringBuilder v2_2 = v1_1.append(", isValid=");
	        this.c();
	        String v0_5 = this.b;
	        v0_5.b();
	        if (!v0_5.b.contains(0)) {
	            v0_8 = 1;
	        } else {
	            v0_8 = 0;
	        }
	        v2_2.append(v0_8);
	        v1_1.append(" }");
	        return v1_1.toString();
	    }
	

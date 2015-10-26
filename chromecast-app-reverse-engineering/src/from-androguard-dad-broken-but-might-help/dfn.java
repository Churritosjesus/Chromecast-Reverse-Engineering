	public final java.lang.String a
	public final java.util.List b
	public final java.util.List c
	
	    private dfn(String p1, java.util.List p2, java.util.List p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public static dfn a(javax.net.ssl.SSLSession p4)
	    {
	        String v2 = p4.getCipherSuite();
	        if (v2 != null) {
	            try {
	                java.util.List v0_0 = p4.getPeerCertificates();
	            } catch (java.util.List v0) {
	                v0_0 = 0;
	            }
	            java.util.List v0_1;
	            if (v0_0 == null) {
	                v0_1 = java.util.Collections.emptyList();
	            } else {
	                v0_1 = dgs.a(v0_0);
	            }
	            java.util.List v1_1;
	            java.util.List v1_0 = p4.getLocalCertificates();
	            if (v1_0 == null) {
	                v1_1 = java.util.Collections.emptyList();
	            } else {
	                v1_1 = dgs.a(v1_0);
	            }
	            return new dfn(v2, v0_1, v1_1);
	        } else {
	            throw new IllegalStateException("cipherSuite == null");
	        }
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        int v0 = 0;
	        if (((p4 instanceof dfn)) && ((this.a.equals(((dfn) p4).a)) && ((this.b.equals(((dfn) p4).b)) && (this.c.equals(((dfn) p4).c))))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        return (((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode());
	    }
	

	public  a
	public  b
	private final java.util.List c
	private  d
	
	    public dgh(java.util.List p2)
	    {
	        this.d = 0;
	        this.c = p2;
	        return;
	    }
	
	
	    private boolean b(javax.net.ssl.SSLSocket p3)
	    {
	        int v1 = this.d;
	        while (v1 < this.c.size()) {
	            if (!((dfk) this.c.get(v1)).a(p3)) {
	                v1++;
	            } else {
	                int v0_3 = 1;
	            }
	            return v0_3;
	        }
	        v0_3 = 0;
	        return v0_3;
	    }
	
	
	    public final dfk a(javax.net.ssl.SSLSocket p6)
	    {
	        java.net.UnknownServiceException v0_0 = this.d;
	        int v3 = this.c.size();
	        boolean v2_1 = v0_0;
	        while (v2_1 < v3) {
	            java.net.UnknownServiceException v0_1 = ((dfk) this.c.get(v2_1));
	            if (!v0_1.a(p6)) {
	                v2_1++;
	            } else {
	                this.d = (v2_1 + 1);
	            }
	            if (v0_1 != null) {
	                this.a = this.b(p6);
	                dgi.b.a(v0_1, p6, this.b);
	                return v0_1;
	            } else {
	                throw new java.net.UnknownServiceException(new StringBuilder("Unable to find acceptable protocols. isFallback=").append(this.b).append(", modes=").append(this.c).append(", supported protocols=").append(java.util.Arrays.toString(p6.getEnabledProtocols())).toString());
	            }
	        }
	        v0_1 = 0;
	    }
	

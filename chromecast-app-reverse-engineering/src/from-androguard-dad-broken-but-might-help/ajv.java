	public android.content.Context a
	public java.lang.String b
	public  c
	public ajx d
	public android.os.Bundle e
	private java.lang.String f
	private afb g
	
	    public ajv(android.content.Context p3, String p4, android.os.Bundle p5)
	    {
	        this.c = 16973840;
	        this.g = afb.a();
	        if (this.g == null) {
	            afq v0_3 = aji.a(p3);
	            if (v0_3 == null) {
	                throw new afq("Attempted to create a builder without a valid access token or a valid default Application ID.");
	            } else {
	                this.b = v0_3;
	            }
	        }
	        this.a(p3, p4, p5);
	        return;
	    }
	
	
	    public ajv(android.content.Context p2, String p3, String p4, android.os.Bundle p5)
	    {
	        this.c = 16973840;
	        if (p3 == null) {
	            p3 = aji.a(p2);
	        }
	        ajp.a(p3, "applicationId");
	        this.b = p3;
	        this.a(p2, p4, p5);
	        return;
	    }
	
	
	    private void a(android.content.Context p2, String p3, android.os.Bundle p4)
	    {
	        this.a = p2;
	        this.f = p3;
	        if (p4 == null) {
	            this.e = new android.os.Bundle();
	        } else {
	            this.e = p4;
	        }
	        return;
	    }
	
	
	    public ajq a()
	    {
	        if (this.g == null) {
	            this.e.putString("app_id", this.b);
	        } else {
	            this.e.putString("app_id", this.g.g);
	            this.e.putString("access_token", this.g.d);
	        }
	        return new ajq(this.a, this.f, this.e, this.c, this.d);
	    }
	

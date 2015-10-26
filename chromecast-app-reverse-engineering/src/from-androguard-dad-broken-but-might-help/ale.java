	 java.lang.String f
	  g
	
	    public ale(android.content.Context p2, String p3, android.os.Bundle p4)
	    {
	        this(p2, p3, "oauth", p4);
	        return;
	    }
	
	
	    public final ajq a()
	    {
	        android.os.Bundle v3 = this.e;
	        v3.putString("redirect_uri", "fbconnect://success");
	        v3.putString("client_id", this.b);
	        v3.putString("e2e", this.f);
	        v3.putString("response_type", "token,signed_request");
	        v3.putString("return_scopes", "true");
	        if (this.g) {
	            v3.putString("auth_type", "rerequest");
	        }
	        return new ajq(this.a, "oauth", v3, this.c, this.d);
	    }
	

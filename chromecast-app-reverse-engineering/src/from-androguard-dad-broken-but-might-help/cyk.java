	private final android.content.Context a
	
	    public cyk(android.content.Context p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(java.util.Map p4)
	    {
	        String v0_3;
	        android.content.Context v1_0 = p4.get("gtm.url");
	        if (v1_0 != null) {
	            v0_3 = v1_0;
	        } else {
	            String v0_2 = p4.get("gtm");
	            if ((v0_2 == null) || (!(v0_2 instanceof java.util.Map))) {
	            } else {
	                v0_3 = ((java.util.Map) v0_2).get("url");
	            }
	        }
	        if ((v0_3 != null) && ((v0_3 instanceof String))) {
	            String v0_7 = android.net.Uri.parse(((String) v0_3)).getQueryParameter("referrer");
	            if (v0_7 != null) {
	                cvr.b(this.a, v0_7);
	            }
	        }
	        return;
	    }
	

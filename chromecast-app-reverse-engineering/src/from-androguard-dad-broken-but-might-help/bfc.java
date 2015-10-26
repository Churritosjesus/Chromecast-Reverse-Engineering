	private static final java.nio.charset.Charset c
	 B a
	public java.lang.String b
	
	    static bfc()
	    {
	        bfc.c = java.nio.charset.Charset.forName("UTF-8");
	        return;
	    }
	
	
	    private bfc(String p3, String p4)
	    {
	        bfc.a(p4);
	        if (p3 != null) {
	            this.a = p3.getBytes(bfc.c);
	            this.b = p4;
	            return;
	        } else {
	            throw new IllegalArgumentException("data cannot be null");
	        }
	    }
	
	
	    public bfc(byte[] p3, String p4)
	    {
	        bfc.a(p4);
	        if (p3 != null) {
	            this.a = p3;
	            this.b = p4;
	            return;
	        } else {
	            throw new IllegalArgumentException("data cannot be null");
	        }
	    }
	
	
	    public static bfc a(org.json.JSONObject p3)
	    {
	        return new bfc(p3.toString(), "application/json");
	    }
	
	
	    private static void a(String p2)
	    {
	        if (!android.text.TextUtils.isEmpty(p2)) {
	            return;
	        } else {
	            throw new IllegalArgumentException("mime type cannot be null or empty");
	        }
	    }
	
	
	    public final String a()
	    {
	        int v0_1;
	        if (this.a == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = new String(this.a, bfc.c);
	        }
	        return v0_1;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("[MimeData; type: ").append(this.b).append(", length: ").append(this.a.length).append("]").toString();
	    }
	

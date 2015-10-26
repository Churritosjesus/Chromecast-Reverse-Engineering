	public final cy a
	private final dm b
	
	    public ct(android.content.Context p3, dm p4)
	    {
	        if (p4 != null) {
	            this.b = p4;
	            if (android.os.Build$VERSION.SDK_INT < 21) {
	                this.a = new da(this.b);
	            } else {
	                this.a = new cz(p3, p4);
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("sessionToken must not be null");
	        }
	    }
	
	
	    public final dc a()
	    {
	        return this.a.a();
	    }
	
	
	    public final void a(cu p3)
	    {
	        if (p3 != null) {
	            this.a.a(p3);
	            return;
	        } else {
	            throw new IllegalArgumentException("callback cannot be null");
	        }
	    }
	

	private final android.app.Activity c
	
	    public mq(android.app.Activity p1, android.content.Context p2)
	    {
	        this(p2);
	        this.c = p1;
	        return;
	    }
	
	
	    public final void a(float p2)
	    {
	        if (p2 != 1065353216) {
	            if (p2 == 0) {
	                this.a = 0;
	            }
	        } else {
	            this.a = 1;
	        }
	        this.b = p2;
	        this.invalidateSelf();
	        return;
	    }
	
	
	    final boolean a()
	    {
	        int v0 = 1;
	        if (gt.g(this.c.getWindow().getDecorView()) != 1) {
	            v0 = 0;
	        }
	        return v0;
	    }
	

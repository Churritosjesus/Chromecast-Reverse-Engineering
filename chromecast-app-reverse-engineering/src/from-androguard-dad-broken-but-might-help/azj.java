	public java.util.Timer a
	final bdm b
	final bdn c
	public final  d
	private final blp e
	
	    public azj(android.content.Context p3, bdm p4)
	    {
	        this.e = new blp("SetupStateRefresher");
	        this.b = p4;
	        this.d = ((long) p3.getResources().getInteger(a.fj));
	        this.c = new azk(this);
	        return;
	    }
	
	
	    public final void a()
	    {
	        if (this.a != null) {
	            this.a.cancel();
	            this.a = 0;
	        }
	        return;
	    }
	

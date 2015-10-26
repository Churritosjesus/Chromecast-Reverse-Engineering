	final java.util.concurrent.Executor a
	
	    public aeb(android.os.Handler p2)
	    {
	        this.a = new adk(this, p2);
	        return;
	    }
	
	
	    public void a(ads p2, ady p3)
	    {
	        this.a(p2, p3, 0);
	        return;
	    }
	
	
	    public void a(ads p3, ady p4, Runnable p5)
	    {
	        p3.h = 1;
	        p3.a("post-response");
	        this.a.execute(new adl(this, p3, p4, p5));
	        return;
	    }
	
	
	    public void a(ads p5, aef p6)
	    {
	        p5.a("post-error");
	        this.a.execute(new adl(this, p5, ady.a(p6), 0));
	        return;
	    }
	

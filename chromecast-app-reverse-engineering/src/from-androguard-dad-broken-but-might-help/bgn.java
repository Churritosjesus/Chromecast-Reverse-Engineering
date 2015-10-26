	
	    public bgn()
	    {
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p2)
	    {
	        super.onCreate(p2);
	        this.setContentView(a.gf);
	        this.a(((android.support.v7.widget.Toolbar) this.findViewById(f.eo)));
	        return;
	    }
	
	
	    public boolean onKeyDown(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2)) {
	            v0_1 = super.onKeyDown(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onKeyUp(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2, this)) {
	            v0_1 = super.onKeyUp(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	

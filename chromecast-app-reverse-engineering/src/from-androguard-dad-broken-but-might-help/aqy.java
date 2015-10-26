	public arc Z
	
	    public aqy()
	    {
	        return;
	    }
	
	
	    static synthetic arc a(aqy p1)
	    {
	        return p1.Z;
	    }
	
	
	    public static aqy p()
	    {
	        return new aqy();
	    }
	
	
	    public final android.app.Dialog c(android.os.Bundle p4)
	    {
	        android.app.AlertDialog v0_4 = new android.app.AlertDialog$Builder(this.y).setTitle(b.Y).setMessage(b.X).setPositiveButton(b.P, new aqz(this));
	        v0_4.setOnKeyListener(new ara(this));
	        v0_4.setNegativeButton(b.ab, new arb(this));
	        android.app.AlertDialog v0_5 = v0_4.create();
	        v0_5.setCanceledOnTouchOutside(0);
	        v0_5.show();
	        return v0_5;
	    }
	

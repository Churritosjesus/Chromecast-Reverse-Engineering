	private static final I a
	private  b
	private java.lang.String c
	private java.lang.String d
	
	    static ExpanderView()
	    {
	        int[] v0_1 = new int[1];
	        v0_1[0] = 16842920;
	        com.google.android.gms.people.accountswitcherview.ExpanderView.a = v0_1;
	        return;
	    }
	
	
	    public ExpanderView(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public ExpanderView(android.content.Context p1, android.util.AttributeSet p2)
	    {
	        this(p1, p2);
	        this.a(p1);
	        return;
	    }
	
	
	    public ExpanderView(android.content.Context p1, android.util.AttributeSet p2, int p3)
	    {
	        this(p1, p2, p3);
	        this.a(p1);
	        return;
	    }
	
	
	    private void a(android.content.Context p3)
	    {
	        String v0_0 = p3.getResources();
	        this.c = v0_0.getString(b.eE);
	        this.d = v0_0.getString(b.eC);
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        String v0_1;
	        this.b = p2;
	        if (!this.b) {
	            v0_1 = this.c;
	        } else {
	            v0_1 = this.d;
	        }
	        this.setContentDescription(v0_1);
	        this.refreshDrawableState();
	        return;
	    }
	
	
	    public int[] onCreateDrawableState(int p3)
	    {
	        int[] v0_1 = super.onCreateDrawableState((p3 + 1));
	        if (this.b) {
	            com.google.android.gms.people.accountswitcherview.ExpanderView.mergeDrawableStates(v0_1, com.google.android.gms.people.accountswitcherview.ExpanderView.a);
	        }
	        return v0_1;
	    }
	

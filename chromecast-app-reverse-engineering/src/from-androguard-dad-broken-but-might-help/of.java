	private final android.view.LayoutInflater a
	private synthetic od b
	
	    public of(od p2, android.content.Context p3, java.util.List p4)
	    {
	        this.b = p2;
	        this(p3, 0, p4);
	        this.a = android.view.LayoutInflater.from(p3);
	        return;
	    }
	
	
	    public final boolean areAllItemsEnabled()
	    {
	        return 0;
	    }
	
	
	    public final android.view.View getView(int p6, android.view.View p7, android.view.ViewGroup p8)
	    {
	        if (p7 == null) {
	            p7 = this.a.inflate(a.cm, p8, 0);
	        }
	        boolean v0_2 = ((uh) this.getItem(p6));
	        android.widget.TextView v2_2 = ((android.widget.TextView) p7.findViewById(16908309));
	        ((android.widget.TextView) p7.findViewById(16908308)).setText(v0_2.c);
	        String v1_4 = v0_2.d;
	        if (!android.text.TextUtils.isEmpty(v1_4)) {
	            v2_2.setVisibility(0);
	            v2_2.setText(v1_4);
	        } else {
	            v2_2.setVisibility(8);
	            v2_2.setText("");
	        }
	        p7.setEnabled(v0_2.e);
	        return p7;
	    }
	
	
	    public final boolean isEnabled(int p2)
	    {
	        return ((uh) this.getItem(p2)).e;
	    }
	
	
	    public final void onItemClick(android.widget.AdapterView p3, android.view.View p4, int p5, long p6)
	    {
	        od v0_1 = ((uh) this.getItem(p5));
	        if (v0_1.e) {
	            v0_1.c();
	            this.b.dismiss();
	        }
	        return;
	    }
	

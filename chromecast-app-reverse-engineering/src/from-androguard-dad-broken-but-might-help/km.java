	private kn a
	
	    km(kn p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final CharSequence convertResultToString(Object p2)
	    {
	        return this.a.b(((android.database.Cursor) p2));
	    }
	
	
	    protected final android.widget.Filter$FilterResults performFiltering(CharSequence p4)
	    {
	        int v0_1 = this.a.a(p4);
	        android.widget.Filter$FilterResults v1_1 = new android.widget.Filter$FilterResults();
	        if (v0_1 == 0) {
	            v1_1.count = 0;
	            v1_1.values = 0;
	        } else {
	            v1_1.count = v0_1.getCount();
	            v1_1.values = v0_1;
	        }
	        return v1_1;
	    }
	
	
	    protected final void publishResults(CharSequence p3, android.widget.Filter$FilterResults p4)
	    {
	        android.database.Cursor v0_1 = this.a.a();
	        if ((p4.values != null) && (p4.values != v0_1)) {
	            this.a.a(((android.database.Cursor) p4.values));
	        }
	        return;
	    }
	

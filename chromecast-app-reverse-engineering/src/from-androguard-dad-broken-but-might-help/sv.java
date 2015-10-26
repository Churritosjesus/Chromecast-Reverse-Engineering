	private android.widget.SpinnerAdapter a
	private android.widget.ListAdapter b
	
	    public sv(android.widget.SpinnerAdapter p2)
	    {
	        this.a = p2;
	        if ((p2 instanceof android.widget.ListAdapter)) {
	            this.b = ((android.widget.ListAdapter) p2);
	        }
	        return;
	    }
	
	
	    public final boolean areAllItemsEnabled()
	    {
	        int v0_1;
	        int v0_0 = this.b;
	        if (v0_0 == 0) {
	            v0_1 = 1;
	        } else {
	            v0_1 = v0_0.areAllItemsEnabled();
	        }
	        return v0_1;
	    }
	
	
	    public final int getCount()
	    {
	        int v0_2;
	        if (this.a != null) {
	            v0_2 = this.a.getCount();
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final android.view.View getDropDownView(int p2, android.view.View p3, android.view.ViewGroup p4)
	    {
	        android.view.View v0_2;
	        if (this.a != null) {
	            v0_2 = this.a.getDropDownView(p2, p3, p4);
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final Object getItem(int p2)
	    {
	        Object v0_2;
	        if (this.a != null) {
	            v0_2 = this.a.getItem(p2);
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final long getItemId(int p3)
	    {
	        long v0_2;
	        if (this.a != null) {
	            v0_2 = this.a.getItemId(p3);
	        } else {
	            v0_2 = -1;
	        }
	        return v0_2;
	    }
	
	
	    public final int getItemViewType(int p2)
	    {
	        return 0;
	    }
	
	
	    public final android.view.View getView(int p2, android.view.View p3, android.view.ViewGroup p4)
	    {
	        return this.getDropDownView(p2, p3, p4);
	    }
	
	
	    public final int getViewTypeCount()
	    {
	        return 1;
	    }
	
	
	    public final boolean hasStableIds()
	    {
	        if ((this.a == null) || (!this.a.hasStableIds())) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final boolean isEmpty()
	    {
	        int v0_1;
	        if (this.getCount() != 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean isEnabled(int p2)
	    {
	        int v0_1;
	        int v0_0 = this.b;
	        if (v0_0 == 0) {
	            v0_1 = 1;
	        } else {
	            v0_1 = v0_0.isEnabled(p2);
	        }
	        return v0_1;
	    }
	
	
	    public final void registerDataSetObserver(android.database.DataSetObserver p2)
	    {
	        if (this.a != null) {
	            this.a.registerDataSetObserver(p2);
	        }
	        return;
	    }
	
	
	    public final void unregisterDataSetObserver(android.database.DataSetObserver p2)
	    {
	        if (this.a != null) {
	            this.a.unregisterDataSetObserver(p2);
	        }
	        return;
	    }
	

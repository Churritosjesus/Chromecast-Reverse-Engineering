	private synthetic ada a
	private synthetic android.widget.ListPopupWindow b
	private synthetic acb c
	
	    acn(acb p1, ada p2, android.widget.ListPopupWindow p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    protected final synthetic Object doInBackground(Object[] p3)
	    {
	        return acb.a(this.c, this.a);
	    }
	
	
	    protected final synthetic void onPostExecute(Object p6)
	    {
	        if (acb.k(this.c)) {
	            acb v0_7;
	            int v1_3 = acb.b(this.c, this.c.getLayout().getLineForOffset(acb.b(this.c, this.a)));
	            android.widget.ListPopupWindow v2_1 = this.b;
	            if (acb.l(this.c) == null) {
	                v0_7 = this.c;
	            } else {
	                v0_7 = acb.l(this.c);
	            }
	            v2_1.setAnchorView(v0_7);
	            this.b.setVerticalOffset(v1_3);
	            this.b.setAdapter(((android.widget.ListAdapter) p6));
	            this.b.setOnItemClickListener(acb.m(this.c));
	            acb.c(this.c, -1);
	            this.b.show();
	            acb v0_15 = this.b.getListView();
	            v0_15.setChoiceMode(1);
	            if (acb.n(this.c) != -1) {
	                v0_15.setItemChecked(acb.n(this.c), 1);
	                acb.c(this.c, -1);
	            }
	        }
	        return;
	    }
	

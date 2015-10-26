	private synthetic android.support.v7.widget.SearchView a
	
	    public aah(android.support.v7.widget.SearchView p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final boolean onKey(android.view.View p6, int p7, android.view.KeyEvent p8)
	    {
	        int v0_0 = 0;
	        if (android.support.v7.widget.SearchView.o(this.a) != null) {
	            if ((!android.support.v7.widget.SearchView.m(this.a).isPopupShowing()) || (android.support.v7.widget.SearchView.m(this.a).getListSelection() == -1)) {
	                if ((!android.support.v7.widget.SearchView$SearchAutoComplete.a(android.support.v7.widget.SearchView.m(this.a))) && ((fi.a(p8)) && ((p8.getAction() == 1) && (p7 == 66)))) {
	                    p6.cancelLongPress();
	                    android.support.v7.widget.SearchView.a(this.a, 0, 0, android.support.v7.widget.SearchView.m(this.a).getText().toString());
	                    v0_0 = 1;
	                }
	            } else {
	                v0_0 = android.support.v7.widget.SearchView.a(this.a, p6, p7, p8);
	            }
	        }
	        return v0_0;
	    }
	

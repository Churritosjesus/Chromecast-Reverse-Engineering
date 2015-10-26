	public java.lang.reflect.Method a
	public java.lang.reflect.Method b
	public android.widget.ImageView c
	
	    mw(android.app.Activity p9)
	    {
	        try {
	            int v2_1 = new Class[1];
	            v2_1[0] = android.graphics.drawable.Drawable;
	            this.a = android.app.ActionBar.getDeclaredMethod("setHomeAsUpIndicator", v2_1);
	            int v2_3 = new Class[1];
	            v2_3[0] = Integer.TYPE;
	            this.b = android.app.ActionBar.getDeclaredMethod("setHomeActionContentDescription", v2_3);
	        } catch (android.widget.ImageView v0) {
	            android.widget.ImageView v0_4 = p9.findViewById(16908332);
	            if (v0_4 == null) {
	            } else {
	                android.widget.ImageView v0_6 = ((android.view.ViewGroup) v0_4.getParent());
	                if (v0_6.getChildCount() != 2) {
	                } else {
	                    boolean v1_3 = v0_6.getChildAt(0);
	                    android.widget.ImageView v0_7 = v0_6.getChildAt(1);
	                    if (v1_3.getId() != 16908332) {
	                        v0_7 = v1_3;
	                    }
	                    if (!(v0_7 instanceof android.widget.ImageView)) {
	                    } else {
	                        this.c = ((android.widget.ImageView) v0_7);
	                    }
	                }
	            }
	        }
	        return;
	    }
	

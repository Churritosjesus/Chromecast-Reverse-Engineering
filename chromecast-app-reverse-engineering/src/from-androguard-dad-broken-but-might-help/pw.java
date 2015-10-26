	final android.content.Context a
	 java.util.Map b
	 java.util.Map c
	
	    pw(android.content.Context p1, Object p2)
	    {
	        this(p2);
	        this.a = p1;
	        return;
	    }
	
	
	    final android.view.MenuItem a(android.view.MenuItem p4)
	    {
	        android.view.MenuItem v1_0;
	        if (!(p4 instanceof cd)) {
	            v1_0 = p4;
	        } else {
	            if (this.b == null) {
	                this.b = new ed();
	            }
	            v1_0 = ((android.view.MenuItem) this.b.get(p4));
	            if (v1_0 == null) {
	                v1_0 = a.a(this.a, ((cd) p4));
	                this.b.put(((cd) p4), v1_0);
	            }
	        }
	        return v1_0;
	    }
	
	
	    final android.view.SubMenu a(android.view.SubMenu p4)
	    {
	        UnsupportedOperationException v0_1;
	        if (!(p4 instanceof ce)) {
	            v0_1 = p4;
	        } else {
	            if (this.c == null) {
	                this.c = new ed();
	            }
	            v0_1 = ((android.view.SubMenu) this.c.get(((ce) p4)));
	            if (v0_1 == null) {
	                if (android.os.Build$VERSION.SDK_INT < 14) {
	                    throw new UnsupportedOperationException();
	                } else {
	                    v0_1 = new qv(this.a, ((ce) p4));
	                    this.c.put(((ce) p4), v0_1);
	                }
	            }
	        }
	        return v0_1;
	    }
	

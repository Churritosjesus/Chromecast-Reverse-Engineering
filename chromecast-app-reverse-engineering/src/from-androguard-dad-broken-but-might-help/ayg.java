	private synthetic ayf a
	
	    ayg(ayf p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onLeScan(android.bluetooth.BluetoothDevice p6, int p7, byte[] p8)
	    {
	        ayf v0_2;
	        awd v3 = awd.a(p8);
	        if (!v3.b.contains(awd.a)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        if (v0_2 != null) {
	            ayf.a(this.a);
	            ayf v0_5 = new Object[2];
	            v0_5[0] = p6.getAddress();
	            v0_5[1] = p6.getName();
	            ayf.b(this.a).a(p6, v3);
	            ayf.a(this.a, p6.getAddress());
	        }
	        return;
	    }
	

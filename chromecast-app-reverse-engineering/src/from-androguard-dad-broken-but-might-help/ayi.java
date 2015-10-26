	private synthetic ayf a
	
	    ayi(ayf p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onBatchScanResults(java.util.List p6)
	    {
	        java.util.Iterator v1 = p6.iterator();
	        while (v1.hasNext()) {
	            String v0_2 = ((android.bluetooth.le.ScanResult) v1.next());
	            ayf.a(this.a);
	            ayf v2_2 = new Object[2];
	            v2_2[0] = v0_2.getDevice().getAddress();
	            v2_2[1] = v0_2.getDevice().getName();
	            ayf.b(this.a).a(v0_2.getDevice(), awd.a(v0_2.getScanRecord().getBytes()));
	            ayf.a(this.a, v0_2.getDevice().getAddress());
	        }
	        return;
	    }
	
	
	    public final void onScanFailed(int p4)
	    {
	        ayf.a(this.a);
	        Object[] v0_2 = new Object[1];
	        v0_2[0] = Integer.valueOf(p4);
	        return;
	    }
	
	
	    public final void onScanResult(int p4, android.bluetooth.le.ScanResult p5)
	    {
	        ayf.a(this.a);
	        ayf v0_2 = new Object[2];
	        v0_2[0] = p5.getDevice().getAddress();
	        v0_2[1] = p5.getDevice().getName();
	        ayf.b(this.a).a(p5.getDevice(), awd.a(p5.getScanRecord().getBytes()));
	        ayf.a(this.a, p5.getDevice().getAddress());
	        return;
	    }
	

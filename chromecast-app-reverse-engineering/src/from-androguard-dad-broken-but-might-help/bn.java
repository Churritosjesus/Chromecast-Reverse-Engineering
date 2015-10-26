	final android.content.IntentFilter a
	public final android.content.BroadcastReceiver b
	  c
	
	    bn(android.content.IntentFilter p1, android.content.BroadcastReceiver p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder(128);
	        v0_1.append("Receiver{");
	        v0_1.append(this.b);
	        v0_1.append(" filter=");
	        v0_1.append(this.a);
	        v0_1.append("}");
	        return v0_1.toString();
	    }
	

	private final java.lang.String a
	
	    bku(String p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    private static CharSequence a(Object p1)
	    {
	        String v1_1;
	        if (!(p1 instanceof CharSequence)) {
	            v1_1 = p1.toString();
	        } else {
	            v1_1 = ((CharSequence) p1);
	        }
	        return v1_1;
	    }
	
	
	    public final StringBuilder a(StringBuilder p3, Iterable p4)
	    {
	        java.util.Iterator v0 = p4.iterator();
	        if (v0.hasNext()) {
	            p3.append(bku.a(v0.next()));
	            while (v0.hasNext()) {
	                p3.append(this.a);
	                p3.append(bku.a(v0.next()));
	            }
	        }
	        return p3;
	    }
	

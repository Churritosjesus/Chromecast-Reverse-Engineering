	final android.os.Bundle a
	private java.util.ArrayList b
	
	    public to(String p3, String p4)
	    {
	        this.a = new android.os.Bundle();
	        this.a.putString("id", p3);
	        this.a.putString("name", p4);
	        return;
	    }
	
	
	    public to(tn p3)
	    {
	        if (p3 != null) {
	            this.a = new android.os.Bundle(p3.a);
	            p3.i();
	            if (!p3.b.isEmpty()) {
	                this.b = new java.util.ArrayList(p3.b);
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("descriptor must not be null");
	        }
	    }
	
	
	    public final tn a()
	    {
	        if (this.b != null) {
	            this.a.putParcelableArrayList("controlFilters", this.b);
	        }
	        return new tn(this.a, this.b);
	    }
	
	
	    public final to a(int p3)
	    {
	        this.a.putInt("playbackType", p3);
	        return this;
	    }
	
	
	    public final to a(java.util.Collection p4)
	    {
	        if (p4 != null) {
	            if (!p4.isEmpty()) {
	                String v1_0 = p4.iterator();
	                while (v1_0.hasNext()) {
	                    IllegalArgumentException v0_3 = ((android.content.IntentFilter) v1_0.next());
	                    if (v0_3 != null) {
	                        if (this.b == null) {
	                            this.b = new java.util.ArrayList();
	                        }
	                        if (!this.b.contains(v0_3)) {
	                            this.b.add(v0_3);
	                        }
	                    } else {
	                        throw new IllegalArgumentException("filter must not be null");
	                    }
	                }
	            }
	            return this;
	        } else {
	            throw new IllegalArgumentException("filters must not be null");
	        }
	    }
	
	
	    public final to b(int p3)
	    {
	        this.a.putInt("playbackStream", p3);
	        return this;
	    }
	
	
	    public final to c(int p3)
	    {
	        this.a.putInt("volume", p3);
	        return this;
	    }
	
	
	    public final to d(int p3)
	    {
	        this.a.putInt("volumeMax", p3);
	        return this;
	    }
	
	
	    public final to e(int p3)
	    {
	        this.a.putInt("volumeHandling", p3);
	        return this;
	    }
	
	
	    public final to f(int p3)
	    {
	        this.a.putInt("presentationDisplayId", p3);
	        return this;
	    }
	

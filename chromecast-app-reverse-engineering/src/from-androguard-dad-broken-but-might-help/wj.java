	  a
	  b
	  c
	
	    wj(int p1, int p2, int p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (this != p5) {
	            if ((p5 != null) && (this.getClass() == p5.getClass())) {
	                if (this.a == ((wj) p5).a) {
	                    if ((this.a != 3) || ((Math.abs((this.c - this.b)) != 1) || ((this.c != ((wj) p5).b) || (this.b != ((wj) p5).c)))) {
	                        if (this.c == ((wj) p5).c) {
	                            if (this.b != ((wj) p5).b) {
	                                v0 = 0;
	                            }
	                        } else {
	                            v0 = 0;
	                        }
	                    }
	                } else {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        return ((((this.a * 31) + this.b) * 31) + this.c);
	    }
	
	
	    public final String toString()
	    {
	        String v0_2;
	        String v1_1 = new StringBuilder("[");
	        switch (this.a) {
	            case 0:
	                v0_2 = "add";
	                break;
	            case 1:
	                v0_2 = "rm";
	                break;
	            case 2:
	                v0_2 = "up";
	                break;
	            case 3:
	                v0_2 = "mv";
	                break;
	            default:
	                v0_2 = "??";
	        }
	        return v1_1.append(v0_2).append(",s:").append(this.b).append("c:").append(this.c).append("]").toString();
	    }
	

	public final java.util.List a
	public final java.util.List b
	public final java.util.List c
	public final java.util.List d
	public final java.util.List e
	public final java.util.List f
	private final java.util.List g
	private final java.util.List h
	private final java.util.List i
	private final java.util.List j
	
	    public cmb(java.util.List p2, java.util.List p3, java.util.List p4, java.util.List p5, java.util.List p6, java.util.List p7, java.util.List p8, java.util.List p9, java.util.List p10, java.util.List p11)
	    {
	        this.a = java.util.Collections.unmodifiableList(p2);
	        this.b = java.util.Collections.unmodifiableList(p3);
	        this.c = java.util.Collections.unmodifiableList(p4);
	        this.d = java.util.Collections.unmodifiableList(p5);
	        this.e = java.util.Collections.unmodifiableList(p6);
	        this.f = java.util.Collections.unmodifiableList(p7);
	        this.g = java.util.Collections.unmodifiableList(p8);
	        this.h = java.util.Collections.unmodifiableList(p9);
	        this.i = java.util.Collections.unmodifiableList(p10);
	        this.j = java.util.Collections.unmodifiableList(p11);
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("Positive predicates: ").append(this.a).append("  Negative predicates: ").append(this.b).append("  Add tags: ").append(this.c).append("  Remove tags: ").append(this.d).append("  Add macros: ").append(this.e).append("  Remove macros: ").append(this.f).toString();
	    }
	

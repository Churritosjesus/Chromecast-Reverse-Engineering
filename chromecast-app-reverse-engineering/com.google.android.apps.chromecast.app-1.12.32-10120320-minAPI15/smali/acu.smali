.class final Lacu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laca;


# instance fields
.field private synthetic a:Ljava/util/ArrayList;

.field private synthetic b:Lact;


# direct methods
.method constructor <init>(Lact;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 2788
    iput-object p1, p0, Lacu;->b:Lact;

    iput-object p2, p0, Lacu;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 2791
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2793
    iget-object v0, p0, Lacu;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lada;

    .line 2795
    if-eqz v0, :cond_2

    .line 2796
    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v4

    .line 3247
    iget-wide v4, v4, Lacx;->g:J

    .line 2795
    invoke-static {v4, v5}, Lacx;->a(J)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lacu;->b:Lact;

    iget-object v4, v4, Lact;->a:Lacb;

    .line 3626
    invoke-virtual {v4}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    .line 2797
    invoke-interface {v4, v0}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_2

    .line 2799
    iget-object v4, p0, Lacu;->b:Lact;

    iget-object v4, v4, Lact;->a:Lacb;

    .line 2800
    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v0

    .line 4235
    iget-object v0, v0, Lacx;->d:Ljava/lang/String;

    .line 2800
    invoke-static {v0}, Lacb;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lacx;

    .line 2799
    invoke-static {v4, v0}, Lacb;->b(Lacb;Lacx;)Lacx;

    move-result-object v0

    .line 2803
    :goto_1
    if-eqz v0, :cond_0

    .line 2804
    iget-object v4, p0, Lacu;->b:Lact;

    invoke-static {v4, v0}, Lact;->a(Lact;Lacx;)Lada;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2806
    :cond_0
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2809
    :cond_1
    iget-object v0, p0, Lacu;->b:Lact;

    iget-object v1, p0, Lacu;->a:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lact;->a(Lact;Ljava/util/List;Ljava/util/List;)V

    .line 2810
    return-void

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method public final a(Ljava/util/Set;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 2814
    new-instance v1, Ljava/util/ArrayList;

    .line 2815
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 2817
    iget-object v0, p0, Lacu;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lada;

    .line 2818
    if-eqz v0, :cond_1

    .line 2819
    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v3

    .line 4247
    iget-wide v4, v3, Lacx;->g:J

    .line 2818
    invoke-static {v4, v5}, Lacx;->a(J)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lacu;->b:Lact;

    iget-object v3, v3, Lact;->a:Lacb;

    .line 4626
    invoke-virtual {v3}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v3

    .line 2820
    invoke-interface {v3, v0}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    .line 2822
    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v3

    .line 5235
    iget-object v3, v3, Lacx;->d:Ljava/lang/String;

    .line 2821
    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 2823
    iget-object v3, p0, Lacu;->b:Lact;

    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v0

    invoke-static {v3, v0}, Lact;->a(Lact;Lacx;)Lada;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2825
    :cond_0
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2828
    :cond_1
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2832
    :cond_2
    iget-object v0, p0, Lacu;->b:Lact;

    iget-object v2, p0, Lacu;->a:Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Lact;->a(Lact;Ljava/util/List;Ljava/util/List;)V

    .line 2833
    return-void
.end method

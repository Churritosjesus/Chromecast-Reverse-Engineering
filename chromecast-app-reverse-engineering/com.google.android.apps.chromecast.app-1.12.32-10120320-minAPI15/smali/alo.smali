.class final Lalo;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:Laow;

.field private synthetic d:Lalm;


# direct methods
.method constructor <init>(Lalm;Ljava/lang/String;Ljava/lang/String;Laow;)V
    .locals 0

    .prologue
    .line 578
    iput-object p1, p0, Lalo;->d:Lalm;

    iput-object p2, p0, Lalo;->a:Ljava/lang/String;

    iput-object p3, p0, Lalo;->b:Ljava/lang/String;

    iput-object p4, p0, Lalo;->c:Laow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 578
    check-cast p1, Lbev;

    .line 1582
    new-array v0, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lalo;->a:Ljava/lang/String;

    aput-object v3, v0, v2

    .line 1583
    iget-object v0, p0, Lalo;->d:Lalm;

    .line 2051
    iget-object v0, v0, Lalm;->k:Ljava/util/Set;

    .line 1583
    iget-object v3, p0, Lalo;->b:Ljava/lang/String;

    invoke-interface {v0, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1584
    invoke-static {}, Laqi;->a()Laqi;

    .line 1586
    iget-object v0, p0, Lalo;->d:Lalm;

    iget-object v3, p1, Lbev;->a:Ljava/lang/String;

    .line 3051
    invoke-virtual {v0, v3}, Lalm;->f(Ljava/lang/String;)V

    .line 1587
    iget-object v0, p0, Lalo;->c:Laow;

    iget-object v3, p1, Lbev;->a:Ljava/lang/String;

    iget-object v4, p1, Lbev;->b:Ljava/lang/String;

    .line 3613
    iput-object v3, v0, Laow;->j:Ljava/lang/String;

    .line 3614
    iput-object v4, v0, Laow;->k:Ljava/lang/String;

    .line 1588
    iget-object v0, p0, Lalo;->c:Laow;

    .line 3636
    iget-object v3, v0, Laow;->g:Latu;

    if-eqz v3, :cond_0

    iget-object v3, v0, Laow;->g:Latu;

    .line 4278
    iget-object v3, v3, Latu;->b:Ljava/util/List;

    .line 3636
    if-nez v3, :cond_2

    :cond_0
    move v0, v2

    .line 1588
    :goto_0
    if-eqz v0, :cond_1

    .line 1589
    iget-object v0, p0, Lalo;->c:Laow;

    invoke-virtual {v0}, Laow;->p()V

    .line 578
    :cond_1
    return-void

    .line 3639
    :cond_2
    iget-object v0, v0, Laow;->g:Latu;

    .line 5278
    iget-object v0, v0, Latu;->b:Ljava/util/List;

    .line 3639
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldcw;

    .line 3640
    invoke-virtual {v0}, Ldcw;->b()Ldco;

    move-result-object v0

    sget-object v4, Ldco;->c:Ldco;

    if-ne v0, v4, :cond_3

    move v0, v1

    .line 3641
    goto :goto_0

    :cond_4
    move v0, v2

    .line 3644
    goto :goto_0
.end method

.method public final b_(I)V
    .locals 3

    .prologue
    .line 595
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lalo;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 596
    iget-object v0, p0, Lalo;->d:Lalm;

    .line 1051
    iget-object v0, v0, Lalm;->k:Ljava/util/Set;

    .line 596
    iget-object v1, p0, Lalo;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 597
    invoke-static {}, Laqi;->a()Laqi;

    .line 599
    return-void
.end method

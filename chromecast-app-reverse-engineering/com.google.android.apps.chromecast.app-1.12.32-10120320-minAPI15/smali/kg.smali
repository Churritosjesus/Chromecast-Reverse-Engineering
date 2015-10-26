.class final Lkg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lke;


# direct methods
.method constructor <init>(Lke;)V
    .locals 0

    .prologue
    .line 684
    iput-object p1, p0, Lkg;->a:Lke;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v1, 0x0

    .line 687
    iget-object v0, p0, Lkg;->a:Lke;

    invoke-static {v0}, Lke;->a(Lke;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 715
    :goto_0
    return-void

    .line 691
    :cond_0
    iget-object v0, p0, Lkg;->a:Lke;

    invoke-static {v0}, Lke;->b(Lke;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 692
    iget-object v0, p0, Lkg;->a:Lke;

    invoke-static {v0, v1}, Lke;->a(Lke;Z)Z

    .line 693
    iget-object v0, p0, Lkg;->a:Lke;

    invoke-static {v0}, Lke;->c(Lke;)Lkf;

    move-result-object v0

    .line 1763
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lkf;->e:J

    .line 1764
    const-wide/16 v2, -0x1

    iput-wide v2, v0, Lkf;->i:J

    .line 1765
    iget-wide v2, v0, Lkf;->e:J

    iput-wide v2, v0, Lkf;->f:J

    .line 1766
    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, v0, Lkf;->j:F

    .line 1767
    iput v1, v0, Lkf;->g:I

    .line 1768
    iput v1, v0, Lkf;->h:I

    .line 696
    :cond_1
    iget-object v0, p0, Lkg;->a:Lke;

    invoke-static {v0}, Lke;->c(Lke;)Lkf;

    move-result-object v2

    .line 1782
    iget-wide v4, v2, Lkf;->i:J

    cmp-long v0, v4, v10

    if-lez v0, :cond_3

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v4

    iget-wide v6, v2, Lkf;->i:J

    iget v0, v2, Lkf;->k:I

    int-to-long v8, v0

    add-long/2addr v6, v8

    cmp-long v0, v4, v6

    if-lez v0, :cond_3

    const/4 v0, 0x1

    .line 697
    :goto_1
    if-nez v0, :cond_2

    iget-object v0, p0, Lkg;->a:Lke;

    invoke-static {v0}, Lke;->d(Lke;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 698
    :cond_2
    iget-object v0, p0, Lkg;->a:Lke;

    invoke-static {v0, v1}, Lke;->b(Lke;Z)Z

    goto :goto_0

    :cond_3
    move v0, v1

    .line 1782
    goto :goto_1

    .line 702
    :cond_4
    iget-object v0, p0, Lkg;->a:Lke;

    invoke-static {v0}, Lke;->e(Lke;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 703
    iget-object v0, p0, Lkg;->a:Lke;

    invoke-static {v0, v1}, Lke;->c(Lke;Z)Z

    .line 704
    iget-object v0, p0, Lkg;->a:Lke;

    invoke-static {v0}, Lke;->f(Lke;)V

    .line 1818
    :cond_5
    iget-wide v0, v2, Lkf;->f:J

    cmp-long v0, v0, v10

    if-nez v0, :cond_6

    .line 1819
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1822
    :cond_6
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    .line 1823
    invoke-virtual {v2, v0, v1}, Lkf;->a(J)F

    move-result v3

    .line 2807
    const/high16 v4, -0x3f800000    # -4.0f

    mul-float/2addr v4, v3

    mul-float/2addr v4, v3

    const/high16 v5, 0x40800000    # 4.0f

    mul-float/2addr v3, v5

    add-float/2addr v3, v4

    .line 1825
    iget-wide v4, v2, Lkf;->f:J

    sub-long v4, v0, v4

    .line 1827
    iput-wide v0, v2, Lkf;->f:J

    .line 1828
    long-to-float v0, v4

    mul-float/2addr v0, v3

    iget v1, v2, Lkf;->c:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v2, Lkf;->g:I

    .line 1829
    long-to-float v0, v4

    mul-float/2addr v0, v3

    iget v1, v2, Lkf;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v2, Lkf;->h:I

    .line 2864
    iget v0, v2, Lkf;->h:I

    .line 711
    iget-object v1, p0, Lkg;->a:Lke;

    invoke-virtual {v1, v0}, Lke;->a(I)V

    .line 714
    iget-object v0, p0, Lkg;->a:Lke;

    invoke-static {v0}, Lke;->g(Lke;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Lgt;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    goto/16 :goto_0
.end method

.class final Lbeh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbff;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lbff;

.field final synthetic c:J

.field final synthetic d:I

.field final synthetic e:Lbfp;

.field final synthetic f:J

.field final synthetic g:I

.field final synthetic h:Lbdu;

.field private synthetic i:J


# direct methods
.method constructor <init>(Lbdu;Ljava/lang/String;JLbff;JILbfp;JI)V
    .locals 0

    .prologue
    .line 571
    iput-object p1, p0, Lbeh;->h:Lbdu;

    iput-object p2, p0, Lbeh;->a:Ljava/lang/String;

    iput-wide p3, p0, Lbeh;->i:J

    iput-object p5, p0, Lbeh;->b:Lbff;

    iput-wide p6, p0, Lbeh;->c:J

    iput p8, p0, Lbeh;->d:I

    iput-object p9, p0, Lbeh;->e:Lbfp;

    iput-wide p10, p0, Lbeh;->f:J

    iput p12, p0, Lbeh;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    .line 575
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lbeh;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 576
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lbeh;->i:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    .line 577
    iget-object v0, p0, Lbeh;->b:Lbff;

    invoke-interface {v0}, Lbff;->a()V

    .line 578
    return-void
.end method

.method public final a(I)V
    .locals 14

    .prologue
    const/4 v13, 0x3

    const/4 v12, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 582
    iget-object v0, p0, Lbeh;->h:Lbdu;

    iget-object v3, p0, Lbeh;->a:Ljava/lang/String;

    iget-wide v4, p0, Lbeh;->c:J

    .line 1033
    invoke-virtual {v0, v3, v4, v5}, Lbdu;->a(Ljava/lang/String;J)Z

    move-result v0

    .line 582
    if-eqz v0, :cond_0

    .line 606
    :goto_0
    return-void

    .line 585
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, p0, Lbeh;->i:J

    sub-long/2addr v4, v6

    .line 586
    iget-object v0, p0, Lbeh;->h:Lbdu;

    .line 2033
    iget-object v0, v0, Lbdu;->h:Lazv;

    .line 2773
    iget-wide v6, v0, Lazv;->i:J

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-lez v3, :cond_3

    .line 2774
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    iget-wide v8, v0, Lazv;->i:J

    iget-wide v10, v0, Lazv;->h:J

    add-long/2addr v8, v10

    cmp-long v0, v6, v8

    if-gez v0, :cond_3

    move v3, v2

    .line 3788
    :goto_1
    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    const/4 v0, -0x2

    if-eq p1, v0, :cond_1

    const/4 v0, -0x6

    if-eq p1, v0, :cond_1

    const/4 v0, -0x8

    if-ne p1, v0, :cond_4

    :cond_1
    move v0, v2

    .line 587
    :goto_2
    if-eqz v0, :cond_2

    iget v0, p0, Lbeh;->d:I

    iget-object v6, p0, Lbeh;->e:Lbfp;

    .line 4047
    iget v6, v6, Lbfp;->h:I

    .line 588
    if-le v0, v6, :cond_5

    if-nez v3, :cond_5

    .line 589
    :cond_2
    new-array v0, v13, [Ljava/lang/Object;

    iget-object v3, p0, Lbeh;->a:Ljava/lang/String;

    aput-object v3, v0, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v0, v12

    .line 590
    iget-object v0, p0, Lbeh;->b:Lbff;

    invoke-interface {v0, p1}, Lbff;->a(I)V

    goto :goto_0

    :cond_3
    move v3, v1

    .line 2774
    goto :goto_1

    :cond_4
    move v0, v1

    .line 3788
    goto :goto_2

    .line 593
    :cond_5
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v3, p0, Lbeh;->a:Ljava/lang/String;

    aput-object v3, v0, v1

    .line 594
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    iget v1, p0, Lbeh;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v12

    iget-object v1, p0, Lbeh;->e:Lbfp;

    .line 5047
    iget v1, v1, Lbfp;->h:I

    .line 594
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v13

    const/4 v1, 0x4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    .line 596
    iget-object v0, p0, Lbeh;->h:Lbdu;

    .line 6033
    iget-object v0, v0, Lbdu;->a:Landroid/os/Handler;

    .line 596
    new-instance v1, Lbei;

    invoke-direct {v1, p0}, Lbei;-><init>(Lbeh;)V

    iget-wide v2, p0, Lbeh;->f:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 610
    iget-object v0, p0, Lbeh;->b:Lbff;

    invoke-interface {v0}, Lbff;->b()V

    .line 611
    return-void
.end method

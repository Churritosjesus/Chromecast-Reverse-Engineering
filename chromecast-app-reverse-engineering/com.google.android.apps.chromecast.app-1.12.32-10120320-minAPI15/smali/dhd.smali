.class final Ldhd;
.super Ldgy;
.source "PG"


# instance fields
.field private b:Z

.field private synthetic c:Ldgx;


# direct methods
.method constructor <init>(Ldgx;)V
    .locals 1

    .prologue
    .line 507
    iput-object p1, p0, Ldhd;->c:Ldgx;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ldgy;-><init>(Ldgx;B)V

    return-void
.end method


# virtual methods
.method public final a(Ldjz;J)J
    .locals 6

    .prologue
    const-wide/16 v0, -0x1

    .line 512
    const-wide/16 v2, 0x0

    cmp-long v2, p2, v2

    if-gez v2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "byteCount < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 513
    :cond_0
    iget-boolean v2, p0, Ldhd;->a:Z

    if-eqz v2, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 514
    :cond_1
    iget-boolean v2, p0, Ldhd;->b:Z

    if-eqz v2, :cond_2

    .line 522
    :goto_0
    return-wide v0

    .line 516
    :cond_2
    iget-object v2, p0, Ldhd;->c:Ldgx;

    .line 1063
    iget-object v2, v2, Ldgx;->c:Ldkd;

    .line 516
    invoke-interface {v2, p1, p2, p3}, Ldkd;->a(Ldjz;J)J

    move-result-wide v2

    .line 517
    cmp-long v4, v2, v0

    if-nez v4, :cond_3

    .line 518
    const/4 v2, 0x1

    iput-boolean v2, p0, Ldhd;->b:Z

    .line 519
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Ldhd;->a(Z)V

    goto :goto_0

    :cond_3
    move-wide v0, v2

    .line 522
    goto :goto_0
.end method

.method public final close()V
    .locals 1

    .prologue
    .line 526
    iget-boolean v0, p0, Ldhd;->a:Z

    if-eqz v0, :cond_0

    .line 531
    :goto_0
    return-void

    .line 527
    :cond_0
    iget-boolean v0, p0, Ldhd;->b:Z

    if-nez v0, :cond_1

    .line 528
    invoke-virtual {p0}, Ldhd;->b()V

    .line 530
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Ldhd;->a:Z

    goto :goto_0
.end method

.class final Lbek;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbaa;


# instance fields
.field private synthetic a:Lbej;


# direct methods
.method constructor <init>(Lbej;)V
    .locals 0

    .prologue
    .line 650
    iput-object p1, p0, Lbek;->a:Lbej;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 653
    iget-object v0, p0, Lbek;->a:Lbej;

    iget-object v0, v0, Lbej;->g:Lbdu;

    .line 1033
    iget-boolean v0, v0, Lbdu;->g:Z

    .line 653
    if-eqz v0, :cond_0

    .line 654
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lbek;->a:Lbej;

    iget-object v1, v1, Lbej;->a:Lapd;

    .line 655
    invoke-virtual {v1, v6}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 654
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 657
    :cond_0
    new-array v0, v6, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 658
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v4, p0, Lbek;->a:Lbej;

    iget-object v4, v4, Lbej;->a:Lapd;

    .line 1059
    iget-wide v4, v4, Lapd;->b:J

    .line 658
    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    .line 659
    iget-object v0, p0, Lbek;->a:Lbej;

    iget-object v0, v0, Lbej;->g:Lbdu;

    iget-object v1, p0, Lbek;->a:Lbej;

    iget-object v1, v1, Lbej;->b:Ljava/lang/String;

    iget-object v2, p0, Lbek;->a:Lbej;

    iget-wide v2, v2, Lbej;->c:J

    .line 2033
    invoke-virtual {v0, v1, v2, v3}, Lbdu;->a(Ljava/lang/String;J)Z

    move-result v0

    .line 659
    if-eqz v0, :cond_2

    .line 668
    :cond_1
    :goto_0
    return-void

    .line 663
    :cond_2
    iget-object v0, p0, Lbek;->a:Lbej;

    iget-object v0, v0, Lbej;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 664
    iget-object v0, p0, Lbek;->a:Lbej;

    iget-object v0, v0, Lbej;->g:Lbdu;

    iget-object v1, p0, Lbek;->a:Lbej;

    iget-object v1, v1, Lbej;->e:Lbfp;

    iget-object v2, p0, Lbek;->a:Lbej;

    iget-object v2, v2, Lbej;->f:Lbff;

    .line 3033
    invoke-virtual {v0, v1, v2}, Lbdu;->a(Lbfp;Lbff;)V

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 672
    iget-object v0, p0, Lbek;->a:Lbej;

    iget-object v0, v0, Lbej;->g:Lbdu;

    iget-object v1, p0, Lbek;->a:Lbej;

    iget-object v1, v1, Lbej;->b:Ljava/lang/String;

    iget-object v2, p0, Lbek;->a:Lbej;

    iget-wide v2, v2, Lbej;->c:J

    .line 4033
    invoke-virtual {v0, v1, v2, v3}, Lbdu;->a(Ljava/lang/String;J)Z

    move-result v0

    .line 672
    if-eqz v0, :cond_0

    .line 685
    :goto_0
    return-void

    .line 675
    :cond_0
    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    .line 676
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v0, p0, Lbek;->a:Lbej;

    iget-object v0, v0, Lbej;->a:Lapd;

    .line 4059
    iget-wide v4, v0, Lapd;->b:J

    .line 676
    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v1, v6

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    .line 677
    const-string v0, " - poor link"

    :goto_1
    aput-object v0, v1, v2

    .line 678
    iget-object v0, p0, Lbek;->a:Lbej;

    iget-object v0, v0, Lbej;->g:Lbdu;

    .line 5033
    iget-boolean v0, v0, Lbdu;->g:Z

    .line 678
    if-eqz v0, :cond_1

    .line 679
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lbek;->a:Lbej;

    iget-object v1, v1, Lbej;->a:Lapd;

    .line 680
    invoke-virtual {v1, v6}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 679
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 682
    :cond_1
    iget-object v0, p0, Lbek;->a:Lbej;

    iget-object v1, v0, Lbej;->f:Lbff;

    if-eqz p1, :cond_3

    .line 683
    const/16 v0, -0x9

    .line 682
    :goto_2
    invoke-interface {v1, v0}, Lbff;->a(I)V

    goto :goto_0

    .line 677
    :cond_2
    const-string v0, ""

    goto :goto_1

    .line 684
    :cond_3
    const/4 v0, -0x8

    goto :goto_2
.end method

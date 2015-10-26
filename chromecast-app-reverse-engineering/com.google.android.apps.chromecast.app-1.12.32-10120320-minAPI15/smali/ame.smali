.class final Lame;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field final synthetic a:Laow;

.field final synthetic b:Lama;

.field private synthetic c:Lazg;


# direct methods
.method constructor <init>(Lama;Laow;Lazg;)V
    .locals 0

    .prologue
    .line 462
    iput-object p1, p0, Lame;->b:Lama;

    iput-object p2, p0, Lame;->a:Laow;

    iput-object p3, p0, Lame;->c:Lazg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 462
    .line 6466
    iget-object v0, p0, Lame;->b:Lama;

    invoke-static {v0}, Lama;->b(Lama;)Lblp;

    .line 6468
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    const/4 v1, 0x0

    .line 7486
    iput-object v1, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->g:Lazg;

    .line 6471
    iget-object v0, p0, Lame;->b:Lama;

    invoke-static {v0}, Lama;->f(Lama;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lamf;

    invoke-direct {v1, p0}, Lamf;-><init>(Lame;)V

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 6480
    iget-object v0, p0, Lame;->c:Lazg;

    .line 8063
    iget-boolean v0, v0, Lazg;->c:Z

    .line 6480
    if-eqz v0, :cond_0

    .line 6481
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lame;->a:Laow;

    .line 8597
    iget-object v1, v1, Laow;->c:Lbdf;

    .line 9354
    iget-wide v2, v1, Lbdf;->m:J

    .line 6481
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    long-to-int v0, v0

    .line 6483
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    new-instance v2, Lapd;

    const/16 v3, 0x21

    .line 6484
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lapd;-><init>(ILjava/lang/Integer;)V

    iget-object v0, p0, Lame;->c:Lazg;

    .line 10223
    iget-object v0, v0, Lazg;->b:Laph;

    .line 11115
    iput-object v0, v2, Lapd;->h:Laph;

    .line 6483
    invoke-virtual {v1, v2}, Lape;->a(Lapd;)V

    .line 462
    :cond_0
    return-void
.end method

.method public final b_(I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 491
    const/16 v0, -0x63

    if-eq p1, v0, :cond_0

    .line 492
    iget-object v0, p0, Lame;->b:Lama;

    invoke-static {v0}, Lama;->b(Lama;)Lblp;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 493
    iget-object v0, p0, Lame;->a:Laow;

    .line 5737
    iput-boolean v2, v0, Laow;->s:Z

    .line 494
    iget-object v0, p0, Lame;->a:Laow;

    .line 5749
    const/4 v1, 0x0

    iput-object v1, v0, Laow;->t:Ljava/lang/String;

    .line 495
    iget-object v0, p0, Lame;->b:Lama;

    invoke-static {v0}, Lama;->b(Lama;)Lblp;

    .line 496
    iget-object v0, p0, Lame;->b:Lama;

    invoke-static {v0}, Lama;->d(Lama;)Lbmu;

    move-result-object v0

    .line 6380
    iget-object v0, v0, Lyz;->a:Lza;

    invoke-virtual {v0}, Lza;->a()V

    .line 498
    :cond_0
    return-void
.end method

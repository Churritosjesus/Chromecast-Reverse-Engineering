.class public final Lasb;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:Lblp;

.field public b:Latz;

.field public c:Lasg;

.field d:Latf;

.field e:Z

.field f:Ljava/lang/Long;

.field g:Landroid/os/Handler;

.field final h:Ljava/lang/Runnable;

.field i:Z

.field final j:Ljava/lang/Runnable;

.field private final k:J

.field private final l:J


# direct methods
.method public constructor <init>(Latz;Latf;JJ)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Lasc;

    invoke-direct {v0, p0}, Lasc;-><init>(Lasb;)V

    iput-object v0, p0, Lasb;->h:Ljava/lang/Runnable;

    .line 51
    iput-boolean v2, p0, Lasb;->i:Z

    .line 56
    new-instance v0, Lasd;

    invoke-direct {v0, p0}, Lasd;-><init>(Lasb;)V

    iput-object v0, p0, Lasb;->j:Ljava/lang/Runnable;

    .line 72
    iput-object p1, p0, Lasb;->b:Latz;

    .line 73
    iput-object p2, p0, Lasb;->d:Latf;

    .line 74
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lasb;->g:Landroid/os/Handler;

    .line 75
    new-instance v0, Lblp;

    const-string v1, "BackdropSettingsManager"

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lasb;->a:Lblp;

    .line 76
    iput-wide p3, p0, Lasb;->k:J

    .line 77
    iput-wide p5, p0, Lasb;->l:J

    .line 78
    return-void
.end method

.method private static a(J)J
    .locals 6

    .prologue
    .line 237
    long-to-double v0, p0

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    const-wide/high16 v4, 0x3fe8000000000000L    # 0.75

    add-double/2addr v2, v4

    mul-double/2addr v0, v2

    double-to-int v0, v0

    int-to-long v0, v0

    return-wide v0
.end method

.method static synthetic a(Lasb;)V
    .locals 1

    .prologue
    .line 20
    .line 1208
    const/4 v0, 0x0

    iput-boolean v0, p0, Lasb;->e:Z

    .line 1212
    iget-object v0, p0, Lasb;->f:Ljava/lang/Long;

    if-eqz v0, :cond_2

    .line 1213
    iget-object v0, p0, Lasb;->c:Lasg;

    if-nez v0, :cond_1

    .line 1215
    iget-object v0, p0, Lasb;->j:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1218
    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lasb;->a()V

    goto :goto_0

    .line 1220
    :cond_2
    iget-object v0, p0, Lasb;->c:Lasg;

    if-eqz v0, :cond_0

    .line 1221
    const/4 v0, 0x1

    iput-boolean v0, p0, Lasb;->i:Z

    .line 1222
    invoke-direct {p0}, Lasb;->c()V

    goto :goto_0
.end method

.method private c()V
    .locals 5

    .prologue
    .line 227
    iget-boolean v0, p0, Lasb;->i:Z

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Lasb;->g:Landroid/os/Handler;

    iget-object v1, p0, Lasb;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 230
    iget-wide v0, p0, Lasb;->l:J

    invoke-static {v0, v1}, Lasb;->a(J)J

    move-result-wide v0

    .line 231
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    .line 232
    iget-object v2, p0, Lasb;->g:Landroid/os/Handler;

    iget-object v3, p0, Lasb;->h:Ljava/lang/Runnable;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 234
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 119
    iget-object v0, p0, Lasb;->b:Latz;

    invoke-virtual {v0}, Latz;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lasb;->f:Ljava/lang/Long;

    .line 120
    iget-boolean v0, p0, Lasb;->e:Z

    if-eqz v0, :cond_0

    .line 134
    :goto_0
    return-void

    .line 125
    :cond_0
    iget-wide v0, p0, Lasb;->k:J

    invoke-static {v0, v1}, Lasb;->a(J)J

    move-result-wide v0

    .line 126
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 127
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v4

    .line 129
    iget-object v2, p0, Lasb;->g:Landroid/os/Handler;

    iget-object v3, p0, Lasb;->h:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 130
    iput-boolean v4, p0, Lasb;->i:Z

    .line 132
    iget-object v2, p0, Lasb;->g:Landroid/os/Handler;

    iget-object v3, p0, Lasb;->j:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 133
    iget-object v2, p0, Lasb;->g:Landroid/os/Handler;

    iget-object v3, p0, Lasb;->j:Ljava/lang/Runnable;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method b()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 177
    iget-boolean v0, p0, Lasb;->e:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lasb;->b:Latz;

    .line 1097
    iget-wide v2, v0, Laun;->g:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    iget-wide v2, v0, Laun;->g:J

    sget-wide v4, Laun;->f:J

    add-long/2addr v2, v4

    .line 1098
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    .line 1099
    const/4 v0, 0x0

    .line 177
    :goto_0
    if-eqz v0, :cond_1

    .line 178
    iput-boolean v1, p0, Lasb;->e:Z

    .line 179
    new-instance v0, Lasf;

    invoke-direct {v0, p0}, Lasf;-><init>(Lasb;)V

    .line 199
    iget-object v1, p0, Lasb;->b:Latz;

    iget-object v2, p0, Lasb;->d:Latf;

    invoke-virtual {v1, v2, v0}, Latz;->c(Latf;Lauo;)V

    .line 204
    :goto_1
    return-void

    :cond_0
    move v0, v1

    .line 1101
    goto :goto_0

    .line 202
    :cond_1
    invoke-direct {p0}, Lasb;->c()V

    goto :goto_1
.end method

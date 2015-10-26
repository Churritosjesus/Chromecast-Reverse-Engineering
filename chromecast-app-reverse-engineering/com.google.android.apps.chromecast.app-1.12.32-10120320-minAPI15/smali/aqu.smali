.class public final Laqu;
.super Lj;
.source "PG"


# instance fields
.field private Z:Z

.field private a:Lblp;

.field private aa:Lalm;

.field private b:Ltz;

.field private c:Lua;

.field private d:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lj;-><init>()V

    return-void
.end method

.method static synthetic a(Laqu;)J
    .locals 2

    .prologue
    .line 17
    iget-wide v0, p0, Laqu;->d:J

    return-wide v0
.end method

.method static synthetic b(Laqu;)Lblp;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Laqu;->a:Lblp;

    return-object v0
.end method

.method static synthetic c(Laqu;)Lalm;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Laqu;->aa:Lalm;

    return-object v0
.end method

.method private p()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 111
    iput-boolean v2, p0, Laqu;->Z:Z

    .line 112
    iget-object v0, p0, Laqu;->b:Ltz;

    if-eqz v0, :cond_1

    iget-object v0, p0, Laqu;->c:Lua;

    if-eqz v0, :cond_1

    .line 114
    invoke-static {}, Laqi;->a()Laqi;

    move-result-object v0

    .line 5045
    iget-boolean v1, v0, Laqi;->a:Z

    if-eqz v1, :cond_0

    .line 5047
    iput-boolean v2, v0, Laqi;->a:Z

    .line 115
    :cond_0
    iget-object v0, p0, Laqu;->b:Ltz;

    iget-object v1, p0, Laqu;->c:Lua;

    invoke-virtual {v0, v1}, Ltz;->a(Lua;)V

    .line 116
    const/4 v0, 0x0

    iput-object v0, p0, Laqu;->c:Lua;

    .line 118
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 28
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 29
    new-instance v0, Lblp;

    const-string v1, "BackdropDeviceScanner"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Laqu;->a:Lblp;

    .line 32
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Laqu;->c(Z)V

    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 33
    invoke-static {v0}, Ltz;->a(Landroid/content/Context;)Ltz;

    move-result-object v0

    iput-object v0, p0, Laqu;->b:Ltz;

    .line 34
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b()Lalm;

    move-result-object v0

    iput-object v0, p0, Laqu;->aa:Lalm;

    .line 35
    return-void
.end method

.method public final g_()V
    .locals 0

    .prologue
    .line 42
    invoke-super {p0}, Lj;->g_()V

    .line 43
    return-void
.end method

.method public final j()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 47
    invoke-super {p0}, Lj;->j()V

    .line 48
    iget-boolean v0, p0, Laqu;->Z:Z

    if-nez v0, :cond_1

    .line 2068
    iput-boolean v4, p0, Laqu;->Z:Z

    .line 2069
    new-instance v0, Lty;

    invoke-direct {v0}, Lty;-><init>()V

    const-string v1, "com.google.android.gms.cast.CATEGORY_CAST"

    .line 2070
    invoke-virtual {v0, v1}, Lty;->a(Ljava/lang/String;)Lty;

    move-result-object v0

    .line 2071
    invoke-virtual {v0}, Lty;->a()Ltx;

    move-result-object v0

    .line 2072
    new-instance v1, Laqv;

    invoke-direct {v1, p0}, Laqv;-><init>(Laqu;)V

    iput-object v1, p0, Laqu;->c:Lua;

    .line 2104
    invoke-static {}, Laqi;->a()Laqi;

    move-result-object v1

    .line 3038
    iget-boolean v2, v1, Laqi;->a:Z

    if-nez v2, :cond_0

    .line 3039
    iput-boolean v4, v1, Laqi;->a:Z

    .line 2105
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Laqu;->d:J

    .line 2106
    iget-object v1, p0, Laqu;->b:Ltz;

    iget-object v2, p0, Laqu;->c:Lua;

    invoke-virtual {v1, v0, v2, v4}, Ltz;->a(Ltx;Lua;I)V

    .line 51
    :cond_1
    return-void
.end method

.method public final k()V
    .locals 2

    .prologue
    .line 55
    invoke-super {p0}, Lj;->k()V

    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    .line 3612
    iget-object v0, p0, Lj;->y:Lm;

    .line 57
    invoke-virtual {v0}, Lm;->isChangingConfigurations()Z

    move-result v0

    if-nez v0, :cond_0

    .line 58
    invoke-direct {p0}, Laqu;->p()V

    .line 65
    :cond_0
    :goto_0
    return-void

    .line 4612
    :cond_1
    iget-object v0, p0, Lj;->y:Lm;

    .line 61
    invoke-virtual {v0}, Lm;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    invoke-direct {p0}, Laqu;->p()V

    goto :goto_0
.end method

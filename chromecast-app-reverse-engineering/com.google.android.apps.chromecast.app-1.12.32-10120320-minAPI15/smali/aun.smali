.class public abstract Laun;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final f:J


# instance fields
.field private a:J

.field public g:J

.field public final h:Lblp;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 30
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Laun;->f:J

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Lblp;

    const-string v1, "BackdropStorage"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Laun;->h:Lblp;

    .line 47
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .prologue
    .line 63
    .line 1053
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Laun;->g:J

    .line 64
    iget-wide v0, p0, Laun;->g:J

    iput-wide v0, p0, Laun;->a:J

    .line 66
    iget-wide v0, p0, Laun;->a:J

    return-wide v0
.end method

.method public final a(J)V
    .locals 3

    .prologue
    .line 76
    iget-wide v0, p0, Laun;->a:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 77
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Laun;->a:J

    .line 79
    :cond_0
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 141
    return-void
.end method

.method public abstract a(Latf;Lauo;)V
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 135
    return-void
.end method

.method public b(Latf;Lauo;)V
    .locals 0

    .prologue
    .line 129
    return-void
.end method

.method public final b()Z
    .locals 4

    .prologue
    .line 85
    iget-wide v0, p0, Laun;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c(Latf;Lauo;)V
    .locals 1

    .prologue
    .line 109
    invoke-virtual {p0}, Laun;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    invoke-virtual {p0, p1, p2}, Laun;->b(Latf;Lauo;)V

    .line 114
    :goto_0
    return-void

    .line 112
    :cond_0
    invoke-virtual {p0, p1, p2}, Laun;->a(Latf;Lauo;)V

    goto :goto_0
.end method

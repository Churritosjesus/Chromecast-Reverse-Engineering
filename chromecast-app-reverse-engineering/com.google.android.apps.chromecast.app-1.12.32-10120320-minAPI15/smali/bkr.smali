.class final Lbkr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbff;


# instance fields
.field private synthetic a:Lbfn;

.field private synthetic b:J


# direct methods
.method constructor <init>(Lbfn;J)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lbkr;->a:Lbfn;

    iput-wide p2, p0, Lbkr;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v6, 0x0

    .line 125
    invoke-static {}, Lbkq;->b()Lblp;

    new-array v0, v2, [Ljava/lang/Object;

    iget-object v1, p0, Lbkr;->a:Lbfn;

    .line 1070
    iget-object v1, v1, Lbfn;->a:Ljava/lang/String;

    .line 125
    aput-object v1, v0, v6

    .line 126
    invoke-static {}, Lbkq;->b()Lblp;

    new-array v0, v2, [Ljava/lang/Object;

    .line 127
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lbkr;->b:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v0, v6

    .line 128
    return-void
.end method

.method public final a(I)V
    .locals 3

    .prologue
    .line 132
    invoke-static {}, Lbkq;->b()Lblp;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 133
    return-void
.end method

.method public final b()V
    .locals 0

    .prologue
    .line 137
    return-void
.end method

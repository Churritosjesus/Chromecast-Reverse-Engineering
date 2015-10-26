.class final Layv;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:Ljava/lang/String;

.field b:Laym;

.field c:Layl;

.field d:Lbfe;

.field e:J

.field f:Z


# direct methods
.method constructor <init>(Layq;)V
    .locals 0

    .prologue
    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method final a(J)Z
    .locals 5

    .prologue
    .line 264
    iget-wide v0, p0, Layv;->e:J

    sub-long v0, p1, v0

    invoke-static {}, Layq;->f()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
